package POArchitecture01.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List <Flash> flashes;

    public List<Camera> cameras = new ArrayList<>();
    /**
     * Конструктор
     * @param id id сцены
     * @param models список моделей
     * @param flashes список освещения
     * @param cameras список камер
     * @throws Exception исключение о не корректных данных в конструкторе
     */
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if(!models.isEmpty()) {
            this.models = models;
        } else{
            throw new Exception("Должна быть одна модель");
        }
        this.flashes = flashes;
        if (!cameras.isEmpty()) {
            this.cameras = cameras;
        }else{
            throw new Exception("Должна быть одна модель");
        }
    }

    /**
     * Метод заглушка 1
     * @param value
     * @return
     * @param <T>
     */
    public <T> T method1(T value){
        return value;
    }

    /**
     * Метод заглушка 2
     * @param value1
     * @param value2
     * @return
     * @param <T>
     * @param <E>
     */
    public <T, E> T method2(T value1, E value2){
        return value1;
    }
}