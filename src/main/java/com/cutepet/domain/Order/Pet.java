package com.cutepet.domain.Order;

import com.cutepet.domain.Common.PaymentMethod;
import com.cutepet.domain.Common.PetType;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Pet implements Serializable {

    private String name;
    private String color;
    private PetType type;
    private PaymentMethod paymentMethod;

    public Pet(String name, String color, PetType type, PaymentMethod paymentMethod) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.paymentMethod = paymentMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
