/**
 * Perfil de estudiante de la Universidad Tecnológica de Panamá.
 *
 * @author Christopher Coronel - 8-1056-1787
 * @version 1.0
 */
public class PerfilEstudianteUTP {

    public static void main(String[] args) {

        String primerNombre = "Carlos Pérez";
        int creditosMatriculados = 18;
        double costoCredito = 15.50;
        boolean estaPazYSalvo = true;
        char inicialSegundoNombre = 'M';

        final double CARNET_ESTUDIANTIL = 5.00;

        double subtotalMatricula = creditosMatriculados * costoCredito;
        double totalPagar = subtotalMatricula + CARNET_ESTUDIANTIL;

        System.out.println("==========================================");
        System.out.println(" FICHA DE MATRÍCULA ESTUDIANTIL UTP");
        System.out.println("==========================================");
        System.out.println("Estudiante : " + primerNombre);
        System.out.println("Paz y Salvo: " + estaPazYSalvo);
        System.out.println("Subtotal : $" + subtotalMatricula);
        System.out.println("Total : $" + totalPagar);
        System.out.println("==========================================");
    }
}
