// Copyright (c) 2022 FRC Team 2881 - The Lady Cans
//
// Open Source Software; you can modify and/or share it under the terms of BSD
// license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pneumatics extends SubsystemBase {
  private final Compressor m_comp = new Compressor(PneumaticsModuleType.CTREPCM);

  /** Creates a new Pnuematics subsystem. */
  public Pneumatics() {
    m_comp.enableDigital();
  }

  @Override
  public void periodic() {
  }
}
