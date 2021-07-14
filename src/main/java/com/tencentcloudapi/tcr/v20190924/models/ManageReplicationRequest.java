/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageReplicationRequest extends AbstractModel{

    /**
    * 复制源实例ID
    */
    @SerializedName("SourceRegistryId")
    @Expose
    private String SourceRegistryId;

    /**
    * 复制目标实例ID
    */
    @SerializedName("DestinationRegistryId")
    @Expose
    private String DestinationRegistryId;

    /**
    * 同步规则
    */
    @SerializedName("Rule")
    @Expose
    private ReplicationRule Rule;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 目标实例的地域ID，如广州是1
    */
    @SerializedName("DestinationRegionId")
    @Expose
    private Long DestinationRegionId;

    /**
    * 开启跨主账号实例同步配置项
    */
    @SerializedName("PeerReplicationOption")
    @Expose
    private PeerReplicationOption PeerReplicationOption;

    /**
     * Get 复制源实例ID 
     * @return SourceRegistryId 复制源实例ID
     */
    public String getSourceRegistryId() {
        return this.SourceRegistryId;
    }

    /**
     * Set 复制源实例ID
     * @param SourceRegistryId 复制源实例ID
     */
    public void setSourceRegistryId(String SourceRegistryId) {
        this.SourceRegistryId = SourceRegistryId;
    }

    /**
     * Get 复制目标实例ID 
     * @return DestinationRegistryId 复制目标实例ID
     */
    public String getDestinationRegistryId() {
        return this.DestinationRegistryId;
    }

    /**
     * Set 复制目标实例ID
     * @param DestinationRegistryId 复制目标实例ID
     */
    public void setDestinationRegistryId(String DestinationRegistryId) {
        this.DestinationRegistryId = DestinationRegistryId;
    }

    /**
     * Get 同步规则 
     * @return Rule 同步规则
     */
    public ReplicationRule getRule() {
        return this.Rule;
    }

    /**
     * Set 同步规则
     * @param Rule 同步规则
     */
    public void setRule(ReplicationRule Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 目标实例的地域ID，如广州是1 
     * @return DestinationRegionId 目标实例的地域ID，如广州是1
     */
    public Long getDestinationRegionId() {
        return this.DestinationRegionId;
    }

    /**
     * Set 目标实例的地域ID，如广州是1
     * @param DestinationRegionId 目标实例的地域ID，如广州是1
     */
    public void setDestinationRegionId(Long DestinationRegionId) {
        this.DestinationRegionId = DestinationRegionId;
    }

    /**
     * Get 开启跨主账号实例同步配置项 
     * @return PeerReplicationOption 开启跨主账号实例同步配置项
     */
    public PeerReplicationOption getPeerReplicationOption() {
        return this.PeerReplicationOption;
    }

    /**
     * Set 开启跨主账号实例同步配置项
     * @param PeerReplicationOption 开启跨主账号实例同步配置项
     */
    public void setPeerReplicationOption(PeerReplicationOption PeerReplicationOption) {
        this.PeerReplicationOption = PeerReplicationOption;
    }

    public ManageReplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageReplicationRequest(ManageReplicationRequest source) {
        if (source.SourceRegistryId != null) {
            this.SourceRegistryId = new String(source.SourceRegistryId);
        }
        if (source.DestinationRegistryId != null) {
            this.DestinationRegistryId = new String(source.DestinationRegistryId);
        }
        if (source.Rule != null) {
            this.Rule = new ReplicationRule(source.Rule);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DestinationRegionId != null) {
            this.DestinationRegionId = new Long(source.DestinationRegionId);
        }
        if (source.PeerReplicationOption != null) {
            this.PeerReplicationOption = new PeerReplicationOption(source.PeerReplicationOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceRegistryId", this.SourceRegistryId);
        this.setParamSimple(map, prefix + "DestinationRegistryId", this.DestinationRegistryId);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DestinationRegionId", this.DestinationRegionId);
        this.setParamObj(map, prefix + "PeerReplicationOption.", this.PeerReplicationOption);

    }
}

