public class Oficial extends Operador{
    public Oficial(){
	super();
    }
    @Override
    public String toString(){
	return "Tecnico" + this.name;
    }

    public String trabaja(){
	return "Estoy trabajando";
    }
}
