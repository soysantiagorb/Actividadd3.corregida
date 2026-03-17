package problema3;
import java.time.LocalDate;
public class transporte {

        private String marca;
        private String modelo;
        private double cantidadMaxima;
        private LocalDate fechaAdquisicion;
        private viajeRealizado[] viajesRealizados;

        public transporte(String marca, String modelo, double cantidadMaxima, LocalDate fechaAdquisicion) {

            this.marca = marca;
            this.modelo = modelo;
            this.cantidadMaxima = cantidadMaxima;
            this.fechaAdquisicion = fechaAdquisicion;

            viajesRealizados = new viajeRealizado[20];
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public double getCantidadMaxima() {
            return cantidadMaxima;
        }

        public void setCantidadMaxima(double cantidadMaxima) {
            this.cantidadMaxima = cantidadMaxima;
        }

        public LocalDate getFechaAdquisicion() {
            return fechaAdquisicion;
        }

        public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
            this.fechaAdquisicion = fechaAdquisicion;
        }

        public viajeRealizado[] getViajesRealizados() {
            return viajesRealizados;
        }

        public void asignarViaje(viajeRealizado viajeRealizado) {
            for (int i = 0; i < viajesRealizados.length; i++) {
                if (viajesRealizados[i] == null) {
                    viajesRealizados[i] = viajeRealizado;
                    break;
                }
            }
        }

        public void cancelarViaje(viajeRealizado viajeRealizado) {
            for (int i = 0; i < viajesRealizados.length; i++) {
                if (viajesRealizados[i] == viajeRealizado) {
                    viajesRealizados[i] = null;
                    break;
                }
            }
        }

        public void mostrarViajes() {
            for (viajeRealizado v : viajesRealizados) {
                if (v != null) {
                    System.out.println(v);
                }
            }
        }

        @Override
        public String toString() {
            return "Transporte{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", cantidadMaxima=" + cantidadMaxima +
                    ", fechaAdquisicion=" + fechaAdquisicion +
                    '}';
        }
    }

