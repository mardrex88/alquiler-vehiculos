package co.com.sofka.example.vehículo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contrato implements ValueObject<String> {

    private final String value;

    public Contrato(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw  new IllegalArgumentException("El contrato no puede estar vacío");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return Objects.equals(value, contrato.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
