package com.samhan.ui;

import com.samhan.Board;

/**
 * User interface
 */
public interface Ui {
    public int getValidMoveInput(Board board);
    public boolean doesUserWantToStartNewGame();
}
