package org.dav.learn.simpletasks;

import java.io.InputStreamReader;
import java.io.Reader;

public class Main
{
    public static void main(String[] args)
    {
        Reader reader = new InputStreamReader(System.in);

        SymbolReader symbolReader = new SymbolReader(reader);
        symbolReader.read();
        System.out.println("Space quantity: " + symbolReader.getSpaceQuantity());
    }
}
