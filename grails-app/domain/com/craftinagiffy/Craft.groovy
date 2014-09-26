package com.craftinagiffy

class Craft {
    static hasMany = [steps: CraftStep]

    String name
    String description
    Date dateCreated
    List<CraftStep> steps

    static constraints = {
    }
}

