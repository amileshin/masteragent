package com.teaching.masteragent.serviece.interaction;

import com.teaching.masteragent.config.NodeConfig;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MasterInteractionService extends AbstractInteraction {
    private final NodeConfig nodeConfig;
    private final Set<String> nodes;

    MasterInteractionService(NodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
        this.nodes = new HashSet<>();
    }

    @Override
    public boolean isThisInteractionType() {
        return nodeConfig.getLocalUrl().equals(nodeConfig.getMasterUrl());
    }

    @Override
    public String interactionType() {
        return "master";
    }

    @Override
    public String getMasterUrl() {
        return "this";
    }

    @Override
    public String getAgentUrls() {
        return String.join("\n", nodes);
    }

    @Override
    public String connectToMaster(String url) {
        nodes.add(url);
        return "ok";
    }
}
