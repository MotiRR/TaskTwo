package ru.sber.edu.components;

public class Camera extends Component {

    public Camera() {
    }

    public Camera(int id, String name, boolean status) {
        super(id, name, status);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", status=" + isStatus() +
                '}';
    }
}
