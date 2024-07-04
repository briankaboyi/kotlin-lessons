fun main() {

    println("set a volume level")
    changeVolume()

}

fun changeVolume() {
    val volumeLevel = readLine()
    val volume = when {
        volumeLevel!!.contains("low", true) -> {
            Volume.Low("Low")
        }

        volumeLevel.contains("medium", true) -> {
            Volume.Medium("Medium")
        }

        else -> Volume.High("High")

    }
    eval(volume)
    println("set a volume level")

    changeVolume()
}

sealed class Volume {
    class Low(var message: String) : Volume()
    class Medium(var message: String) : Volume()
    class High(var message: String) : Volume()


}

fun eval(volume: Volume) {
    when (volume) {
        is Volume.Low -> println("Volume set to low + ${volume.message}")
        is Volume.High -> println("Volume set to High + ${volume.message}")
        is Volume.Medium -> println("Volume set to Medium + ${volume.message}")
    }
}