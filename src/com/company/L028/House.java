package com.company.L028;

public class House {
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasFancyStatues;
    private boolean hasGarden;

    public static class Builder{
        private boolean hasGarage = false;
        private boolean hasSwimmingPool = false;
        private boolean hasFancyStatues = false;
        private boolean hasGarden = false;

        public Builder(){

        }

        public  Builder optHasGarage(Boolean val){
            this.hasGarage = val;
            return this;
        }

        public  Builder optHasSwimmingPool(Boolean val){
            this.hasSwimmingPool= val;
            return this;
        }

        public  Builder optFancyStatues(Boolean val){
            this.hasFancyStatues = val;
            return this;
        }

        public  Builder optHasGarden(Boolean val){
            this.hasGarden = val;
            return this;
        }

        public House build(){
            return new House(this);
        }

    }
    public House(Builder builder){
        this.hasFancyStatues = builder.hasFancyStatues;
        this.hasGarage =builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool= builder.hasSwimmingPool;
    }
    @Override
    public String toString() {
        return "House{" +
                "hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasFancyStatues=" + hasFancyStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
