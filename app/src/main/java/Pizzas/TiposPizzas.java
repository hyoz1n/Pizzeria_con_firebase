package Pizzas;

public class TiposPizzas {
    private int id;
    private String[] pizzas = {"Pizza Napolitana", "Pizza Predilecta", "Pizzas Vegana", "Pizza Selecta"};

    public TiposPizzas() {
        id = 1;
    }

    public TiposPizzas(int id, String[] pizzast) {
        this.id = id;
        this.pizzas = pizzast;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(String[] pizzas) {
        this.pizzas = pizzas;
    }

    public int resultadoFinalPizza(int preciofinal, int adicional) {
        int result = preciofinal + adicional;
        return result;
    }
}
