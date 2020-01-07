package com.applefish.mastertestapp;

import java.util.ArrayList;

public class WatermarkNode {
    WatermarkNode solid;
    WatermarkNode dotted;

    public static void Create ( ) {
        WatermarkNode node0 = new WatermarkNode();
        WatermarkNode node1 = new WatermarkNode();
        WatermarkNode node2 = new WatermarkNode();
        WatermarkNode node3 = new WatermarkNode();
        WatermarkNode node4 = new WatermarkNode();
        node0.solid = node1;
        node0.dotted = node1;
        node1.solid = node2;
        node1.dotted = node3;
        node2.solid = node3;
        node2.dotted = node2;
        node3.solid = node4;
        node3.dotted = node1;
        node4.solid = node0;
        node4.dotted = node3;
        ArrayList<WatermarkNode> watermarkNodes=new ArrayList<>();
        watermarkNodes.add(node4);
    }}