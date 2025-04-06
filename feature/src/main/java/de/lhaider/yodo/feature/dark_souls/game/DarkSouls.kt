package de.lhaider.yodo.feature.dark_souls.game

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.game.Game
import de.lhaider.yodo.feature.R
import de.lhaider.yodo.feature.dark_souls.location.Abyss
import de.lhaider.yodo.feature.dark_souls.location.AnorLondo
import de.lhaider.yodo.feature.dark_souls.location.AshLake
import de.lhaider.yodo.feature.dark_souls.location.Blighttown
import de.lhaider.yodo.feature.dark_souls.location.Catacombs
import de.lhaider.yodo.feature.dark_souls.location.ChasmOfTheAbyss
import de.lhaider.yodo.feature.dark_souls.location.CrystalCave
import de.lhaider.yodo.feature.dark_souls.location.DarkrootBasin
import de.lhaider.yodo.feature.dark_souls.location.DarkrootGarden
import de.lhaider.yodo.feature.dark_souls.location.DemonRuins
import de.lhaider.yodo.feature.dark_souls.location.Depths
import de.lhaider.yodo.feature.dark_souls.location.DukesArchive
import de.lhaider.yodo.feature.dark_souls.location.KilnOfTheFirstFlame
import de.lhaider.yodo.feature.dark_souls.location.LostIzalith
import de.lhaider.yodo.feature.dark_souls.location.NewLondoRuins
import de.lhaider.yodo.feature.dark_souls.location.OolacileTownship
import de.lhaider.yodo.feature.dark_souls.location.PaintedWorldOfAriamis
import de.lhaider.yodo.feature.dark_souls.location.QuelaagsDomain
import de.lhaider.yodo.feature.dark_souls.location.RoyalWood
import de.lhaider.yodo.feature.dark_souls.location.SanctuaryGarden
import de.lhaider.yodo.feature.dark_souls.location.SensFortress
import de.lhaider.yodo.feature.dark_souls.location.TombOfGiants
import de.lhaider.yodo.feature.dark_souls.location.UndeadAsylum
import de.lhaider.yodo.feature.dark_souls.location.UndeadBurg
import de.lhaider.yodo.feature.dark_souls.location.UndeadParish
import de.lhaider.yodo.feature.dark_souls.location.ValleyOfDrakes

class DarkSouls : Game {

    override val id = "dark_souls"

    override val name = UIText.Resource(R.string.dark_souls)

    override val locations = listOf(
        UndeadAsylum,
        UndeadBurg,
        UndeadParish,
        DarkrootGarden,
        DarkrootBasin,
        Depths,
        Blighttown,
        QuelaagsDomain,
        AshLake,
        ValleyOfDrakes,
        SensFortress,
        AnorLondo,
        PaintedWorldOfAriamis,
        NewLondoRuins,
        Abyss,
        DukesArchive,
        CrystalCave,
        DemonRuins,
        LostIzalith,
        Catacombs,
        TombOfGiants,
        KilnOfTheFirstFlame,
        SanctuaryGarden,
        RoyalWood,
        OolacileTownship,
        ChasmOfTheAbyss
    )
}