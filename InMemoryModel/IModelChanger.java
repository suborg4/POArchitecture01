package POArchitecture01.InMemoryModel;

public interface IModelChanger {
    public void notifyChange(IModelChanger sender);
}