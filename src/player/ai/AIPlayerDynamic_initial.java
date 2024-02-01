package player.ai;

import game.GamePlayer;

import java.awt.*;

public class AIPlayerDynamic_initial extends GamePlayer {

    private int searchDepth;
    private Evaluator evaluator;

    public AIPlayerDynamic_initial(int mark, int depth) {
        super(mark);
        searchDepth = depth;
        evaluator = new DynamicEvaluator_initial();
    }

    @Override
    public boolean isUserPlayer() {
        return false;
    }

    @Override
    public String playerName() {
        return "Dynamic AI (Depth " + searchDepth + ")";
    }

    @Override
    public Point play(int[][] board) {
        return Minimax.solve(board,myMark,searchDepth,evaluator);
    }
}