package org.dav.learn.simpletasks;

import java.io.IOException;
import java.io.Reader;

public class SymbolReader
{
    private Reader reader;
    private int spaceQuantity;

    public SymbolReader(Reader reader)
    {
        if (reader != null)
        {
            this.reader = reader;
            this.spaceQuantity = 0;
        }
        else
            throw new IllegalArgumentException("The reader cannot be null.");
    }

    public int getSpaceQuantity()
    {
        return spaceQuantity;
    }

    public void read()
    {
        int symbol;

        try
        {
            while ((symbol = reader.read()) != -1)
            {
                char character = (char)symbol;

                if (character == '.')
                    break;

                if (character == ' ')
                    spaceQuantity++;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
