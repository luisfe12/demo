package com.example.demo.domain;

import org.springframework.stereotype.Service;

@Service
public class Seller {

    /**
     * Método llamado desde el CommandLineRunner
     */
    public void shpInfoV2() {
        System.out.println("=== Información del Vendedor (v2) ===");
        System.out.println("Inicializando datos del vendedor...");
        System.out.println("Vendedor: Juan Pérez");
        System.out.println("ID: SELL001");
        System.out.println("Territorio: Lima Norte");
        System.out.println("Estado: Activo");
        System.out.println("=====================================");
    }

    /**
     * Método llamado desde el REST controller
     * @return String con información del vendedor
     */
    public String infov3() {
        return "Seller Info v3: Juan Pérez | ID: SELL001 | Ventas este mes: 15 | Estado: Activo";
    }

    // Métodos adicionales que podrías necesitar
    public String getSellerName() {
        return "Juan Pérez";
    }

    public String getSellerId() {
        return "SELL001";
    }

    public int getMonthlySales() {
        return 15;
    }

    public boolean isActive() {
        return true;
    }
}

