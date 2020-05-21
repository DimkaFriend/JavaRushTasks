package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by dima on 17.02.18.
 */
public class ImageReaderFactory {

    public static ImageReader getImageReader (ImageTypes imageTypes) throws IllegalArgumentException
    {
        if(ImageTypes.JPG==imageTypes)
        {
            return new JpgReader();
        }else{
            if(ImageTypes.PNG==imageTypes)
            {
                return new PngReader();
            }else{
                if(ImageTypes.BMP==imageTypes)
                {
                    return new BmpReader();
                }else
                    {
                        throw  new IllegalArgumentException("Неизвестный тип картинки");
                    }
            }
        }

    }
    /*try {
            switch (imageTypes)
            {
                case JPG:return new JpgReader();
                case PNG:return new PngReader();
                case BMP:return new BmpReader();
                default:throw  new IllegalArgumentException("Неизвестный тип картинки");
            }
        }catch (IllegalArgumentException e)
        {

        }*/

}
