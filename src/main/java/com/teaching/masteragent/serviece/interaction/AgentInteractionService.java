package com.teaching.masteragent.serviece.interaction;

import com.teaching.masteragent.config.NodeConfig;
import org.springframework.stereotype.Service;

@Service
public class AgentInteractionService extends InteractionService{
    private final NodeConfig nodeConfig;

    AgentInteractionService(NodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
    }

    @Override
    public boolean isThisInteractionType() {
        return !nodeConfig.getMasterUrl().equals("none");
    }

    @Override
    public String interactionType() {
        return "agent";
    }

    @Override
    public String getMasterUrl() {
        return this.nodeConfig.getMasterUrl();
    }
}
