package transport;

import java.util.Objects;

    public abstract class Transport {
        private final String brand;
        private final String model;
        private final double engineVolume;

        public Transport(String brand, String model, double engineVolume) {
            this.engineVolume = Math.abs(engineVolume);

            if (brand == null || brand.isEmpty() || brand.isBlank()) this.brand = "Unknown brand";
            else this.brand = brand;

            if (model == null || model.isEmpty() || model.isBlank()) this.model = "Unknown model";
            else this.model = model;
        }

        public String startMoving() {
            return this + " - начинает движение!";
        }

        public String stopMoving() {
            return this + " - остановился!";
        }

        public double getEngineVolume() {
            return engineVolume;
        }
        public String getBrand() {
            return brand;
        }
        public String getModel() {
            return model;
        }

        @Override
        public String toString() {
            return this.getClass() + " { " + brand + " " + model + ", объем двигателя: " + engineVolume + " }";
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Transport transport = (Transport) o;
            return brand.equals(transport.brand) && model.equals(transport.model) && engineVolume == transport.engineVolume;
        }
        @Override
        public int hashCode() {
            return Objects.hash(brand, model, engineVolume);
        }

    }
