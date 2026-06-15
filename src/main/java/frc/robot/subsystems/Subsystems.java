// /*
//  * Copyright (c) 2026 Newport Robotics Group. All Rights Reserved.
//  *
//  * Open Source Software; you can modify and/or share it under the terms of
//  * the license file in the root directory of this project.
//  */
 
// package frc.robot.subsystems;

// import edu.wpi.first.math.util.Units;
// import edu.wpi.first.util.datalog.StringLogEntry;
// import edu.wpi.first.wpilibj.DataLogManager;
// import edu.wpi.first.wpilibj2.command.CommandScheduler;
// import edu.wpi.first.wpilibj2.command.Subsystem;
// import frc.robot.Constants.RobotConstants.CANID;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Map;
// import java.util.Optional;
// import java.util.stream.Collectors;

// public final class Subsystems {

//   private final Subsystem[] all;
//   private final Subsystem[] manipulators;

//   private Map<String, StringLogEntry> commandLogger;

//   public Subsystems() {

//    statusLEDs.ifPresent((all::add));

//     commandLogger =
//         Arrays.stream(this.all)
//             .collect(
//                 Collectors.toMap(
//                     Subsystem::getName,
//                     s ->
//                         new StringLogEntry(
//                             DataLogManager.getLog(),
//                             String.format("/%s/ActiveCommand", s.getName()))));

//     CommandScheduler scheduler = CommandScheduler.getInstance();
//     scheduler.onCommandInitialize(
//         (cmd) -> {
//           cmd.getRequirements().stream()
//               .forEach((s) -> commandLogger.get(s.getName()).append(cmd.getName()));
//         });
//     scheduler.onCommandFinish(
//         (cmd) -> {
//           cmd.getRequirements().stream().forEach((s) -> commandLogger.get(s.getName()).append(""));
//         });

//   }

//   /** Returns an array of all subsystems. */
//   public Subsystem[] getAll() {
//     return all;
//   }

//   /** Returns an array of all manipulator subsystems. */
//   public Subsystem[] getManipulators() {
//     return manipulators;
//   }

//   public void setInitialStates() {}

// }