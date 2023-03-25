public class ClaseCadena {
    public static String DevuelveIniciales(String nombre){
        String iniciales = "";
        if(nombre == null || nombre.isEmpty())
            return iniciales;
        String[] palabras = nombre.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if(!palabras[i].isEmpty()){
                iniciales += palabras[i].charAt(0) + ".";
            }
        }
        return iniciales;
    }
}
