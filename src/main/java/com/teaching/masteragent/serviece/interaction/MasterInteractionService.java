package com.teaching.masteragent.serviece.interaction;

import com.teaching.masteragent.config.NodeConfig;
import org.springframework.stereotype.Service;

@Service
public class MasterInteractionService extends AbstractInteraction {
    private final NodeConfig nodeConfig;

    MasterInteractionService(NodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
    }

    @Override
    public boolean isThisInteractionType() {
        return nodeConfig.getMasterUrl().equals("none");
    }

    @Override
    public String interactionType() {
        return "master";
    }

    @Override
    public String getMasterUrl() {
        return "this";
    }
}
