package aplication;
import entities.Product;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Path pathOrigem = Paths.get("/tmp/summary.csv");
        Path pathDestinoDir = Paths.get("/tmp/out");
        Path pathDestinoArquivo = pathDestinoDir.resolve("summary.csv");

        List<Product> produtos = new ArrayList<>();

        // 1. LEITURA COM BUFFEREDREADER
        try (BufferedReader br = Files.newBufferedReader(pathOrigem)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2].strip());
                
                produtos.add(new Product(nome, preco, quantidade));
            }

            // 2. CRIAÇÃO DA PASTA DE SAÍDA 
            Files.createDirectories(pathDestinoDir);

            // 3. CÁLCULO E ESCRITA LINHA POR LINHA
            try (BufferedWriter bw = Files.newBufferedWriter(pathDestinoArquivo)) {
                for (Product p : produtos) {
                    // Calcula o valor total (Preço * Quantidade)
                    double total = p.getPrice() * p.getQuantity();
                    
                    // Monta a linha: Nome,Total
                    String linhaSaida = String.format(Locale.US, "%s,%.2f", p.getName(), total);
                    
                    bw.write(linhaSaida);
                    bw.newLine(); // Pula para a linha de baixo
                }
            }

            System.out.println("Arquivo processado com sucesso em: " + pathDestinoArquivo);

        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}