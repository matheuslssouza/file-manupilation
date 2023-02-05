package orchestrator;

import interfaces.FolderManagement;
import model.MFileAnnotationType;

import java.io.File;

public class FolderOrchestrator implements FolderManagement {

    @Override
    public void createAFolder(String path, MFileAnnotationType fileType) {

        String directory = "";
        switch (fileType) {
            case REMINDER:
                directory = "reminders";
                break;
            case IMPORTANT:
                directory = "important";
                break;
            case SIMPLE:
                directory = "simple";
                break;
        }

        try {
            boolean folderExists = new File(path + "\\" + directory).exists();

            if (folderExists) {
                System.out.println("Diretório já existe!");
            } else {
                new File(path + "\\" + directory).mkdir();
                System.out.println("Diretório Criado com Sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Não foi possível criar diretório");
        }
    }


    @Override
    public void listAllFoldersCreated() {

    }

    @Override
    public void removeAFolder(String path) {

    }
}
