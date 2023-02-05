import java.util.Scanner;

import static model.MFileAnnotationType.*;

public class Main {
    public static void main(String[] args) {
        HandlerFile handlerFile = new HandlerFile();

        boolean loopProgram = true;

        while (loopProgram) {

            System.out.println("-- Gerenciador de Arquivos v0.1 --");
            System.out.println("Digite:\n(1) - Salvar Arquivo\n" +
                    "(2) - Salvar Imagem\n" +
                    "(3) - Deletar Arquivo TXT\n" +
                    "(4) - Deletar Imagem\n" +
                    "(5) - Criar diretórios\n" +
                    "(6) - Recuperar Arquivo TXT\n" +
                    "(7) - Salvar Conjunto de Arquivos TXT\n" +
                    "(8) - Fechar Programa\n" +
                    "OBS: Necessário criar diretório para manipular os arquivos");

            Scanner scanner = new Scanner(System.in);

            Integer optionMenu = scanner.nextInt();

            scanner.skip("((?<!\\R)\\s)*");

            switch (optionMenu) {
                case 1: {
                    System.out.println("- Opção Salvar Arquivo TXT -");
                    System.out.println("Você pode criar 3 tipos de arquivos TXT");
                    System.out.println("(1) - REMINDER");
                    System.out.println("(2) - IMPORTANT");
                    System.out.println("(3) - SIMPLE");
                    System.out.println("Digite a opção desejada");

                    int typeNumberCreateDir = scanner.nextInt();

                    switch (typeNumberCreateDir) {
                       /* case 1 -> loopProgram = createFile(handlerFile, MFileAnnotationType.REMINDER);
                        case 2 -> loopProgram = createFile(handlerFile, MFileAnnotationType.IMPORTANT);
                        case 3 -> loopProgram = createFile(handlerFile, MFileAnnotationType.SIMPLE);*/
                    }
                    break;
                }
                case 2: {

                    System.out.println("- Salvar Imagem -");
                    System.out.println(" Caminho do diretório");
                    String directory = scanner.nextLine();
                    System.out.println("URL da Imagem");
                    String content = scanner.nextLine();
                    System.out.println("Nome do Arquivo");
                    String nameFile = scanner.nextLine();

                    handlerFile.saveImageFile(directory, content, nameFile);

                    System.out.println("Imagem Salva!");

                    break;
                }
                case 3: {

                    break;
                }

                case 4: {
                    break;
                }

                case 5: {
                    System.out.println("- Criar diretório -");
                    System.out.println(" Caminho do diretório");
                    String path = scanner.nextLine();

                    System.out.println("(1) - REMINDER");
                    System.out.println("(2) - IMPORTANT");
                    System.out.println("(3) - SIMPLE");
                    System.out.println("Digite a opção desejada");

                    Integer mFileAnnotationType = scanner.nextInt();

                    switch (mFileAnnotationType) {
                        case 1 -> handlerFile.createAFolder(path, REMINDER);
                        case 2 -> handlerFile.createAFolder(path, IMPORTANT);
                        case 3 -> handlerFile.createAFolder(path, SIMPLE);
                    }

                    break;
                }

            }
        }

    }

}