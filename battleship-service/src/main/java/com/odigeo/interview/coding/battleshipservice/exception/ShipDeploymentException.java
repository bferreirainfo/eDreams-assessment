package com.odigeo.interview.coding.battleshipservice.exception;

import java.util.List;
import java.util.Optional;

import com.odigeo.interview.coding.battleshipservice.model.Game;

public class ShipDeploymentException extends BattleshipException {

	private static final long serialVersionUID = 1L;

	public ShipDeploymentException(String shipType, List<String> coordinates) {
        this(shipType, coordinates, null);
    }
z
    public ShipDeploymentException(String shipType, List<String> coordinates, Exception e) {
        super(String.format("Ship %s with coordinates %s is not deployed correctly on the field", shipType, coordinates), e);
    }

    public ShipDeploymentException(String message) {
        super(message);
    }
}
