package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sitiosBloqueados = new ArrayList<>();
        sitiosBloqueados.add("www.google.com");
        sitiosBloqueados.add("www.youtube.com");
        IConexionInternet proxy;
        proxy = new InternetProxy(sitiosBloqueados, new InternetService());

        proxy.ConectarCon("www.google.com");
        proxy.ConectarCon("www.facebook.com");

    }
}