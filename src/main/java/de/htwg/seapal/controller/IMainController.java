package de.htwg.seapal.controller;

import de.htwg.seapal.model.IModel;

import java.util.List;
import java.util.UUID;

public interface IMainController {

    List<? extends IModel> getSingleDocument(String session, UUID id, String document);

    boolean deleteDocument(String session, UUID id, String document);

    List<? extends IModel> getOwnDocuments(String document, final String session);

    List<? extends IModel> getForeignDocuments(String document, final String session);
}