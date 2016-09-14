package Game;

import java.util.ArrayList;

/**
 * Created by Nibbla on 13.09.2016.
 */
public class HexNode {
    NodeState ns = NodeState.empty;
    BoardCoordinate bc;
    ArrayList<HexNode> neighbours = new ArrayList<>(8);
    HexNode neighbourNE;
    HexNode neighbourE;
    HexNode neighbourSE;
    HexNode neighbourSW;
    HexNode neighbourW;
    HexNode neighbourNW;
}
