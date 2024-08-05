package L1.model;

import L1.model.interfaces.IModelChangedObserver;
import L1.model.interfaces.IModelChanger;

import java.util.List;

public class ModelStore {
    private List<PolygonalModel> models;
    private List<Scene> scenes;
    private List<Flash> flashes;
    private List<Camera> cameras;
    private List<IModelChangedObserver> changeObservers;

    public Scene getScene(int id) {
        // Реализация получения сцены по id
        return new Scene();
    }

    public void notifyChange(IModelChanger sender) {
        // Уведомление об изменениях
    }
}
