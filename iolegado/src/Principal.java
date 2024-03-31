import java.io.*;

public class Principal {
    public static void main(String[] args) throws IOException {
        File pasta1 = new File("/home/deck/Documents/EXJ/iolegado/docs");
        File arquivo = new File(pasta1, "documento.txt");

        try (InputStream inputStream = new FileInputStream(arquivo)) {
            int conteudo;

            while ((conteudo = inputStream.read()) != -1) {
                System.out.print((char) conteudo);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

    }
}
