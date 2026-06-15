package frc.robot.parameters;

import edu.wpi.first.wpilibj.util.Color8Bit;

public enum Colors {
    BLACK(0,0,0),
    RED(255, 0, 0),
    WHITE(255, 255, 255),
    YELLOW(200, 200, 0);

    private final Color8Bit color;
    
    Colors(int red, int green, int blue) {
        color = new Color8Bit(red, green, blue);
    }

    public int getRed() {
        return color.red;
    }
    
    public int getGreen() {
        return color.green;
    }
    
    public int getBlue() {
        return color.blue;
    }
    
    public Color8Bit getColor() {
        return color;
    }
}

