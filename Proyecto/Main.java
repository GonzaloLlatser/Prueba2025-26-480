package Proyecto;

import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {
    System.out.println("\n");
    System.out.println("==================================================");
    System.out.println("        480 Technical Test - Java Project        ");
    System.out.println("==================================================");
    System.out.println("\n");

    System.out.println("==================================================");
    System.out.println("            Let's create some classes!            ");
    System.out.println("==================================================");
    CompactDisc compactDisc = new CompactDisc();
    BlueRayDisc blueRayDisc = new BlueRayDisc();
    HardDiscDrive hardDiscDrive = new HardDiscDrive();
    VinylRecord vinylRecord = new VinylRecord();
    Frisbee frisbee = new Frisbee();
    Wheel wheel = new Wheel();

    System.out.println("==================================================");
    System.out.println("                          CD                      ");
    System.out.println("==================================================");
    compactDisc.setName("Greatest Hits");
    compactDisc.setContent("Music Tracks");
    compactDisc.setType("Audio CD");
    compactDisc.setBrand("Sony");
    compactDisc.setRotationSpeed(500);
    compactDisc.setStatus(AbstractDisk.Estatus.USED);
    compactDisc.setManufactureDate(LocalDateTime.now().minusMonths(5));
    compactDisc.setIsRewritable(true);

    System.out.println(compactDisc);
    System.out.println("\n--- Actions ---");
    compactDisc.readData();
    compactDisc.writeData();
    compactDisc.reportInformation();
    compactDisc.reproduce();
    compactDisc.spin();

    System.out.println("==================================================");
    System.out.println("                      Blu-ray                     ");
    System.out.println("==================================================");
    blueRayDisc.setName("Avengers 2025");
    blueRayDisc.setContent("Movie Files");
    blueRayDisc.setType("Blu-ray Disc");
    blueRayDisc.setBrand("Samsung");
    blueRayDisc.setRotationSpeed(1000);
    blueRayDisc.setStatus(AbstractDisk.Estatus.NEW);
    blueRayDisc.setManufactureDate(LocalDateTime.now());
    blueRayDisc.setIsRewritable(false);

    System.out.println(blueRayDisc);
    System.out.println("\n--- Actions ---");
    blueRayDisc.readData();
    blueRayDisc.writeData();
    blueRayDisc.reportInformation();
    blueRayDisc.reproduce();
    blueRayDisc.spin();

    System.out.println("==================================================");
    System.out.println("                     Hard Disk                 ");
    System.out.println("==================================================");
    hardDiscDrive.setName("WD 1TB");
    hardDiscDrive.setContent("Backup Files");
    hardDiscDrive.setType("External HDD");
    hardDiscDrive.setBrand("Western Digital");
    hardDiscDrive.setRotationSpeed(7200);
    hardDiscDrive.setStatus(AbstractDisk.Estatus.NEW);
    hardDiscDrive.setManufactureDate(LocalDateTime.now());
    hardDiscDrive.setIsRewritable(true);

    System.out.println(hardDiscDrive);
    System.out.println("\n--- Actions ---");
    hardDiscDrive.readData();
    hardDiscDrive.writeData();
    hardDiscDrive.reportInformation();
    hardDiscDrive.spin();

    System.out.println("==================================================");
    System.out.println("                      Vinyl LP                  ");
    System.out.println("==================================================");
    vinylRecord.setName("Classic Rock LP");
    vinylRecord.setContent("Analog Music");
    vinylRecord.setType("LP Record");
    vinylRecord.setBrand("EMI");
    vinylRecord.setRotationSpeed(33);
    vinylRecord.setStatus(AbstractDisk.Estatus.NEW);
    vinylRecord.setManufactureDate(LocalDateTime.now());
    vinylRecord.setIsRewritable(false);

    System.out.println(vinylRecord);
    System.out.println("\n--- Actions ---");
    vinylRecord.spin();
    vinylRecord.reproduce();

    System.out.println("==================================================");
    System.out.println("                      Frisbee                   ");
    System.out.println("==================================================");
    frisbee.setName("Ultimate Frisbee");
    frisbee.setType("Sports Disc");
    frisbee.setRotationSpeed(0);
    frisbee.setStatus(AbstractDisk.Estatus.NEW);
    frisbee.setManufactureDate(LocalDateTime.now());

    System.out.println(frisbee);
    System.out.println("\n--- Actions ---");
    frisbee.spin();

    System.out.println("==================================================");
    System.out.println("                      Wheel                     ");
    System.out.println("==================================================");
    wheel.setName("Front Wheel");
    wheel.setType("Vehicle Wheel");
    wheel.setRotationSpeed(0);
    wheel.setStatus(AbstractDisk.Estatus.DAMAGED);
    wheel.setManufactureDate(LocalDateTime.now().minusNanos(1));

    System.out.println(wheel);
    System.out.println("\n--- Actions ---");
    wheel.spin();

    System.out.println("\n==================================================");
    System.out.println("        End of 480 Technical Test - Java Project ");
    System.out.println("            Thank you for checking it out!        ");
    System.out.println("==================================================\n");
  }
}
