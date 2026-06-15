/*
 * Copyright (c) 2025 Newport Robotics Group. All Rights Reserved.
 *
 * Open Source Software; you can modify and/or share it under the terms of
 * the license file in the root directory of this project.
 */
 
package frc.robot.commands.LEDs;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.parameters.Colors;
import frc.robot.subsystems.LEDSubsystem;

public final class BlinkColor extends Command {
  // Using 0.2 results in the LEDs to end up as no color
  private static final double BLINK_TIME = 0.19;

  private final LEDSubsystem led;
  private final Colors color;
  private final Timer blinkTimer = new Timer();
  private boolean isOn;

  /** Creates a new BlinkColor. */
  public BlinkColor(LEDSubsystem led, Colors color) {
    // your code here
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // your code here
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (blinkTimer.advanceIfElapsed(BLINK_TIME)) {
      // your code here
      isOn = !isOn;
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    blinkTimer.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}