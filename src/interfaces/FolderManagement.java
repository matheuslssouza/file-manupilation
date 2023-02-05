package interfaces;

import model.MFileAnnotationType;

public interface FolderManagement {

    void removeAFolder(String path);

    void listAllFoldersCreated();

    void createAFolder(String path, MFileAnnotationType fileType);
}

