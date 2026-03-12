package Colecciones.Tareas_del_Funcionario;

public class Dispositivo_mal extends RuntimeException {
  public Dispositivo_mal() {
    super("El tipo introducido no es valido");
  }
}
