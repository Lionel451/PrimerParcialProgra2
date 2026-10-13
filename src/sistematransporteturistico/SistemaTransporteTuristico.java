package sistematransporteturistico;

import java.util.ArrayList;
import sistematransporteturistico.clases.*;
import java.util.Scanner;

public class SistemaTransporteTuristico {

    public static void main(String[] args) {
        int opcionMenu = 0;
        int opcionSecundaria = 0;
        boolean bandera = true;
        
        String mensajeError = "Error. Ingrese un número válido.";
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        
        while (bandera){
            System.out.println("***********************************************************"
                    + "SISTEMA DE GESTION DE TRANSPORTE TURISTICO"
                    + "\nElija una opción"
                    + "\n1. Agregar vehículo"
                    + "\n2. Mostrar todos los vehículos"
                    + "\n3. Realizar servicios turísticos"
                    + "\n4. Buscar vehículo por patente"
                    + "\n5. Mostrar vehículos con capacidad mayor a un valor ingresado"
                    + "\n6. Mostrar vehículos ordenados por año de fabricación descendente"
                    + "\n7. Mostrar vehículos ordenados por capacidad de pasajeros descendente"
                    + "\n8. Salir"
                    + "***********************************************************");
                       
            Scanner input = new Scanner(System.in);
            while(true){
                try{
                    System.out.println("Ingrese el número de la opción deseada: ");
                    String entrada = input.nextLine();
                    System.out.println("***********************************************************");
                    opcionMenu = Integer.parseInt(entrada.trim());
                    break;
                } catch (NumberFormatException e){
                    System.out.println(mensajeError);
                }
            }
            
            if(opcionMenu == 1){
                System.out.println("Ingrese el número del vehiculo que desea añadir:"
                        + "\n1. Colectivo Turístico"
                        + "\n2. Van Ejecutiva"
                        + "\n3. Lancha Turística");
                while(true){
                    try{
                        System.out.println("Ingrese el número de la opción deseada: ");
                        String entrada2 = input.nextLine();
                        System.out.println("***********************************************************");
                        opcionSecundaria = Integer.parseInt(entrada2.trim());
                        break;
                    } catch (NumberFormatException e){
                        System.out.println(mensajeError);
                    }
                }
                
                if(opcionSecundaria == 1){
                    Vehiculo colectivo = new ColectivoTuristico("ABC", "ABC", 1, 2000, 1);
                    System.out.println("*****************************"
                            + "Escriba la matricula:");
                    String matricula = input.nextLine();
                    colectivo.setPatente(matricula.trim());
                    System.out.println("*****************************"
                            + "Escriba la marca:");
                    String marca = input.nextLine();
                    colectivo.setMarca(marca.trim());
                    
                    while(true){
                        System.out.println("*****************************"
                                + "\nIngrese la capacidad de pasajeros:");
                        String capacidad = input.nextLine();
                        try{
                            colectivo.setCapacidadPasajeros(Integer.parseInt(capacidad.trim()));
                            break;
                        } catch (NumberFormatException e){
                            System.out.println(mensajeError);
                        } catch (IllegalArgumentException e){
                            System.out.println("Error" + e.getMessage());
                        }                       
                    }
                    
                    while(true){
                        System.out.println("*****************************"
                                + "\nIngrese el año de fabricacion: ");
                        String anio = input.nextLine();
                        try{
                            colectivo.setAnioFabricacion(Integer.parseInt(anio.trim()));
                            break;
                        } catch(NumberFormatException e){
                            System.out.println(mensajeError);
                        } catch(IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    while(true){
                        System.out.println("*****************************"
                                + "\nIngrese la cantidad de pisos: ");
                        String pisos = input.nextLine();
                        try{ 
                            ((ColectivoTuristico)colectivo).setCantidadPisos(Integer.parseInt(pisos.trim()));
                            break;
                        } catch (NumberFormatException e){
                            System.out.println(mensajeError);
                        } catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }    
                    }
                    
                    listaVehiculos.add(colectivo);
                    
                    
                } else if (opcionSecundaria == 2){
                    
                    Vehiculo van = new VanEjecutiva("ABC", "ABC", 1, 2000, true);
                    System.out.println("*****************************"
                            + "Escriba la matricula:");
                    String matricula = input.nextLine();
                    van.setPatente(matricula.trim());
                    System.out.println("*****************************"
                            + "Escriba la marca:");
                    String marca = input.nextLine();
                    van.setMarca(marca.trim());
                    
                    while(true){
                        System.out.println("*****************************"
                                + "\nIngrese la capacidad de pasajeros:");
                        String capacidad = input.nextLine();
                        try{
                            van.setCapacidadPasajeros(Integer.parseInt(capacidad.trim()));
                            break;
                        } catch (NumberFormatException e){
                            System.out.println(mensajeError);
                        } catch (IllegalArgumentException e){
                            System.out.println("Error" + e.getMessage());
                        }                       
                    }
                    
                    while(true){
                        System.out.println("*****************************"
                                + "\nIngrese el año de fabricacion: ");
                        String anio = input.nextLine();
                        try{
                            van.setAnioFabricacion(Integer.parseInt(anio.trim()));
                            break;
                        } catch(NumberFormatException e){
                            System.out.println(mensajeError);
                        } catch(IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    while(true){
                        System.out.println("*****************************"
                                + "\n¿Cuenta con aire acondicionado? Y/N: ");
                        String aire = input.nextLine();
                        if(aire.trim().equalsIgnoreCase("Y")){
                            ((VanEjecutiva)van).setAireAcondicionado(true);
                            break;
                        } else if(aire.trim().equalsIgnoreCase("N")){
                            ((VanEjecutiva)van).setAireAcondicionado(false);
                            break;
                        } else{
                            System.out.println("Respuesta no valida. Ingresa Y o N.");
                        }         
                    }
                    
                    listaVehiculos.add(van);
                    
                    
                } else if(opcionSecundaria == 3){                              
                    Vehiculo lancha = new LanchaTuristica("ABC", "ABC", 1, 2000, "");
                    System.out.println("*****************************"
                            + "Escriba la matricula:");
                    String matricula = input.nextLine();
                    lancha.setPatente(matricula.trim());
                    System.out.println("*****************************"
                            + "Escriba la marca:");
                    String marca = input.nextLine();
                    lancha.setMarca(marca.trim());
                    
                    while(true){
                        System.out.println("*****************************"
                                + "\nIngrese la capacidad de pasajeros:");
                        String capacidad = input.nextLine();
                        try{
                            lancha.setCapacidadPasajeros(Integer.parseInt(capacidad.trim()));
                            break;
                        } catch (NumberFormatException e){
                            System.out.println(mensajeError);
                        } catch (IllegalArgumentException e){
                            System.out.println("Error" + e.getMessage());
                        }                       
                    }
                    
                    while(true){
                        System.out.println("*****************************"
                                + "\nIngrese el año de fabricacion: ");
                        String anio = input.nextLine();
                        try{
                            lancha.setAnioFabricacion(Integer.parseInt(anio.trim()));
                            break;
                        } catch(NumberFormatException e){
                            System.out.println(mensajeError);
                        } catch(IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    while(true){
                        System.out.println("*****************************"
                                + "\n¿Cuenta con aire acondicionado? Y/N: ");
                        String motor = input.nextLine();
                        
                        try {
                            ((LanchaTuristica)lancha).setTipoMotor(motor);
                            break;
                        } catch (IllegalArgumentException e){
                            System.out.println("Error" + e.getMessage());
                        }
                    }
                    
                    listaVehiculos.add(lancha);                   
                }
                    
                    
                
            } else if (opcionMenu == 2){
            
            
            }
                
                
        }           
    }
        
}
    

