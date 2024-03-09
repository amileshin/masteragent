package com.teaching.masteragent.serviece.interaction;

import com.teaching.masteragent.config.NodeConfig;
import org.springframework.stereotype.Service;

@Service
public class AgentInteractionService extends AbstractInteraction {
    private final NodeConfig nodeConfig;

    AgentInteractionService(NodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
    }

    @Override
    public boolean isThisInteractionType() {
        return !nodeConfig.getLocalUrl().equals(nodeConfig.getMasterUrl());
    }

    @Override
    public String interactionType() {
        return "agent";
    }

    @Override
    public String getMasterUrl() {
        return this.nodeConfig.getMasterUrl();
    }

    @Override
    public String getAgentUrls() {
        return "this";
    }

    @Override
    public String connectToMaster(String url) {
        return this.nodeConfig.getMasterUrl();
    }
}
