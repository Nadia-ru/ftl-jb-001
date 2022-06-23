package com.company.animals;

public enum MoveType {
    FLY("������"), WALK("�����"), SWIM("�������");

    private String value;

    MoveType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
