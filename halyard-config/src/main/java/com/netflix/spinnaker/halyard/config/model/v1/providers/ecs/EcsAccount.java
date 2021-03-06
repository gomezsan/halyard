package com.netflix.spinnaker.halyard.config.model.v1.providers.ecs;

import com.netflix.spinnaker.halyard.config.model.v1.node.Account;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class EcsAccount extends Account {

  private String awsAccount;
}
