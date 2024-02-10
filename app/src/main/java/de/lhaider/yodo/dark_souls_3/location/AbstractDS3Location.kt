package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.location.domain.Location

abstract class AbstractDS3Location(locationId: String) : Location {
    override val identifier = "ds3_$locationId"
}