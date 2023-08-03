package POArchitecture01.InMemoryModel;

import POArchitecture01.ModelElements.Camera;
import POArchitecture01.ModelElements.Flash;
import POArchitecture01.ModelElements.PoligonalModel;
import POArchitecture01.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    public List<PoligonalModel> models;
    public List <Scene> scenes;
    public List <Flash> flashes;
    public List <Camera> cameras;
    private IModelChangedObserver [] changeObservers;

    /**
     * Конструктор класса
     * @param changeObservers
     * @throws Exception
     */
    public ModelStore(IModelChangedObserver [] changeObservers) throws Exception {
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();
        this.changeObservers = changeObservers;

        models.add(new PoligonalModel(null));
        scenes.add(new Scene(0, models, flashes, cameras));
        flashes.add(new Flash());
        cameras.add(new Camera());
    }

    /**
     * Возвращает scena по ID
     * @param value id сцены
     * @return экземпляр класса сцена
     */
    public Scene getScena(int value){
        return scenes.get(value);
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}