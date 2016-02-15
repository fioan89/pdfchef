package com.fioan89.pdfchef;

import com.sun.istack.internal.NotNull;
import com.sun.prism.paint.Color;
import org.apache.pdfbox.pdmodel.font.PDFont;

/**
 * Created by fauri on 15/02/16.
 */
public class Style {
    private final PDFont font;
    private final float fontSize;
    private final Color color;
    private final Centering centering;

    public Style(@NotNull PDFont font, float fontSize) {
        this(font, fontSize, Color.BLACK);
    }

    public Style(@NotNull PDFont font, float fontSize, Color textColor) {
        this(font, fontSize, textColor, Centering.LEFT);
    }

    public Style(@NotNull PDFont font, float fontSize, Color textColor, Centering centering) {
        this.font = font;
        this.fontSize = fontSize;
        this.color = textColor;
        this.centering = centering;
    }

    public enum Centering {LEFT, RIGHT, CENTER}
}
