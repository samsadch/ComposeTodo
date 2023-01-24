package com.samsad.composetodo.util

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 16/01/2023
 */
enum class Action {
    ADD,
    UPDATE,
    DELETE,
    DELETE_ALL,
    UNDO,
    NO_ACTION
}

fun String?.toAction(): Action {
    return when {
        this == "ADD" -> {
            Action.ADD
        }
        this == "UPDATE" -> {
            Action.UPDATE
        }
        this == "DELETE" -> {
            Action.DELETE
        }
        this == "DELETE_ALL" -> {
            Action.DELETE_ALL
        }
        this == "UNDO" -> {
            Action.UNDO
        }
        this == "NO_ACTION" -> {
            Action.NO_ACTION
        }
        else -> {
            Action.NO_ACTION
        }
    }
}