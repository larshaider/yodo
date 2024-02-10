package de.lhaider.yodo.location.data

import de.lhaider.yodo.location.domain.Location
import de.lhaider.yodo.ui.text.UIText

abstract class AbstractDS3Location(override val name: UIText, locationId: String) : Location {
    override val identifier = "ds3_$locationId"
}