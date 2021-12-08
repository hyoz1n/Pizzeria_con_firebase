package Pizzas;

public class Ingredientes {
    private int id;
    private String[] Ingredientes = {"Tocino", "Extra Queso", "Champiñón", "Salame", "Albahaca"};

    public Ingredientes(){
        id=1;
    }
    public Ingredientes(int id, String[] Ingredientes){
        this.id = id;
        this.Ingredientes = Ingredientes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String[] getIngredientes(){
        return Ingredientes;
    }
    public void setIngredientes(String[] ingredientes) {this.Ingredientes =ingredientes;}


    }
