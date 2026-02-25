package prueba_enums;

import Imobiliaria.Casa;

public enum Semaforo {

    AMARILLO, ROJO, VERDE;

    public Semaforo siguiente(Semaforo estado){

        switch (estado){

            case AMARILLO: return ROJO;

            case ROJO: return VERDE;

            case VERDE: return AMARILLO;

            default: return AMARILLO;
        }

    }


}
