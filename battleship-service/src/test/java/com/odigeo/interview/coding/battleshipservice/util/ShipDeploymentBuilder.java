package com.odigeo.interview.coding.battleshipservice.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.odigeo.interview.coding.battleshipapi.contract.ShipDeployment;
import com.odigeo.interview.coding.battleshipservice.exception.ShipDeploymentException;
import com.odigeo.interview.coding.battleshipservice.model.ship.Ship;
import com.odigeo.interview.coding.battleshipservice.model.ship.ShipType;
import com.odigeo.interview.coding.battleshipservice.service.CoordinateService;

public final class ShipDeploymentBuilder {

    private ShipDeploymentBuilder() {}

    public static List<ShipDeployment> buildShipsDeployment() {
        ShipDeployment destroyer = new ShipDeployment("Destroyer", "A1", "B1");
        ShipDeployment submarine = new ShipDeployment("Submarine", "D1", "E1", "F1");
        ShipDeployment cruiser = new ShipDeployment("Cruiser", "H1", "H2", "H3");
        ShipDeployment battleship = new ShipDeployment("Battleship", "A4", "A5", "A6", "A7");
        ShipDeployment aircraftCarrier = new ShipDeployment("AircraftCarrier", "B2", "C2", "D2", "E2", "F2");
        return new ArrayList<>(Arrays.asList(destroyer, submarine, cruiser, battleship, aircraftCarrier));
    }

    public static List<Ship> buildValidDeployment() {
        ShipDeployment destroyer = new ShipDeployment("Destroyer", "A1", "B1");
        ShipDeployment submarine = new ShipDeployment("Submarine", "D1", "E1", "F1");
        ShipDeployment cruiser = new ShipDeployment("Cruiser", "H1", "H2", "H3");
        ShipDeployment battleship = new ShipDeployment("Battleship", "A4", "A5", "A6", "A7");
        ShipDeployment aircraftCarrier = new ShipDeployment("AircraftCarrier", "B2", "C2", "D2", "E2", "F2");
        ArrayList<ShipDeployment> shipDeployments = new ArrayList<>(Arrays.asList(destroyer, submarine, cruiser, battleship, aircraftCarrier));
        return mapShipsDeployment(shipDeployments);
    }

    public static List<Ship> buildDuplicatedShipsDeployment() {
        ShipDeployment destroyer = new ShipDeployment("Destroyer", "A1", "B1");
        ShipDeployment submarine = new ShipDeployment("Submarine", "D1", "E1", "F1");
        ShipDeployment cruiser = new ShipDeployment("Cruiser", "H1", "H2", "H3");
        ShipDeployment battleship = new ShipDeployment("Battleship", "A4", "A5", "A6", "A7");
        ShipDeployment destroyer2 = new ShipDeployment("Destroyer", "A1", "B1");
        ArrayList<ShipDeployment> shipDeployments = new ArrayList<>(Arrays.asList(destroyer, submarine, cruiser, battleship, destroyer2));
        return mapShipsDeployment(shipDeployments);
    }

    public static List<Ship> buildWrongNumberOfShipsDeployment() {
        ShipDeployment destroyer = new ShipDeployment("Destroyer", "A1", "B1");
        ShipDeployment submarine = new ShipDeployment("Submarine", "D1", "E1", "F1");
        ShipDeployment cruiser = new ShipDeployment("Cruiser", "H1", "H2", "H3");
        ShipDeployment battleship = new ShipDeployment("Battleship", "A4", "A5", "A6", "A7");
        ArrayList<ShipDeployment> shipDeployments = new ArrayList<>(Arrays.asList(destroyer, submarine, cruiser, battleship));
        return mapShipsDeployment(shipDeployments);
    }

    public static List<Ship> buildOverlappingShipsDeployment() {
        ShipDeployment destroyer = new ShipDeployment("Destroyer", "A1", "B1");
        ShipDeployment submarine = new ShipDeployment("Submarine", "D1", "E1", "F1");
        ShipDeployment cruiser = new ShipDeployment("Cruiser", "H1", "H2", "H3");
        ShipDeployment battleship = new ShipDeployment("Battleship", "A4", "A5", "A6", "A7");
        ShipDeployment aircraftCarrier = new ShipDeployment("AircraftCarrier", "A1", "B1", "C1", "D1", "E1");
        ArrayList<ShipDeployment> shipDeployments = new ArrayList<>(Arrays.asList(destroyer, submarine, cruiser, battleship, aircraftCarrier));
        return mapShipsDeployment(shipDeployments);
    }

    public static List<Ship> buildWrongShipLengthDeployment() {
        ShipDeployment destroyer = new ShipDeployment("Destroyer", "A1", "B1");
        ShipDeployment submarine = new ShipDeployment("Submarine", "D1", "E1", "F1");
        ShipDeployment cruiser = new ShipDeployment("Cruiser", "H1", "H2", "H3");
        ShipDeployment battleship = new ShipDeployment("Battleship", "A4", "A5", "A6", "A7");
        ShipDeployment aircraftCarrier = new ShipDeployment("AircraftCarrier", "B2");
        ArrayList<ShipDeployment> shipDeployments = new ArrayList<>(Arrays.asList(destroyer, submarine, cruiser, battleship, aircraftCarrier));
        return mapShipsDeployment(shipDeployments);
    }

    public static List<Ship> buildShipOutOfGridDeployment() {
        ShipDeployment destroyer = new ShipDeployment("Destroyer", "A1", "B1");
        ShipDeployment submarine = new ShipDeployment("Submarine", "D1", "E1", "F1");
        ShipDeployment cruiser = new ShipDeployment("Cruiser", "H1", "H2", "H3");
        ShipDeployment battleship = new ShipDeployment("Battleship", "A4", "A5", "A6", "A7");
        ShipDeployment aircraftCarrier = new ShipDeployment("AircraftCarrier", "G0", "G1", "G2", "G3", "G4");
        ArrayList<ShipDeployment> shipDeployments = new ArrayList<>(Arrays.asList(destroyer, submarine, cruiser, battleship, aircraftCarrier));
        return mapShipsDeployment(shipDeployments);
    }

    public static List<Ship> buildShipNotContiguousDeployment() {
        ShipDeployment destroyer = new ShipDeployment("Destroyer", "A1", "B1");
        ShipDeployment submarine = new ShipDeployment("Submarine", "D1", "E1", "F1");
        ShipDeployment cruiser = new ShipDeployment("Cruiser", "H1", "H2", "H3");
        ShipDeployment battleship = new ShipDeployment("Battleship", "A4", "A5", "A6", "A7");
        ShipDeployment aircraftCarrier = new ShipDeployment("AircraftCarrier", "G1", "G3", "G4", "G5", "G6");
        ArrayList<ShipDeployment> shipDeployments = new ArrayList<>(Arrays.asList(destroyer, submarine, cruiser, battleship, aircraftCarrier));
        return mapShipsDeployment(shipDeployments);
    }

    private static List<Ship> mapShipsDeployment(List<ShipDeployment> shipDeployments) {
        List<Ship> ships = new ArrayList<>();
        for (ShipDeployment shipDeployment: shipDeployments) {
            ships.add(mapShipsDeployment(shipDeployment));
        }
        return ships;
    }

    private static Ship mapShipsDeployment(ShipDeployment shipDeployment) {
        try {
            Ship ship = ShipType.getByTypeName(shipDeployment.getShipType()).newInstance();
            ship.setCoordinates(shipDeployment.getCoordinates().stream()
                    .map(coordinate -> new CoordinateService().decodeCoordinate(coordinate))
                    .collect(Collectors.toList()));
            return ship;
        } catch (Exception e) {
            throw new ShipDeploymentException(shipDeployment.getShipType(), shipDeployment.getCoordinates(), e);
        }
    }

}
