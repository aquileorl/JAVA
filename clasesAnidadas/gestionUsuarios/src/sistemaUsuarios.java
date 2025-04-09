public class sistemaUsuarios {

    private static int totalUsuarios = 0;

    static class Usuario{
        private String nombre;
        private int id;

        public Usuario(String nombre){
            this.nombre = nombre;
            this.id = ++totalUsuarios;
        }

        public void mostrarInformacion(){
            System.out.println("Nombre: "+nombre + "\nID: "+id);
        }
    }
}
