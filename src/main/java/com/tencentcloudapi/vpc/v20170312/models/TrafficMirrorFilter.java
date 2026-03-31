/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficMirrorFilter extends AbstractModel {

    /**
    * 过滤规则的源网段
    */
    @SerializedName("SrcNet")
    @Expose
    private String SrcNet;

    /**
    * 过滤规则的目的网段
    */
    @SerializedName("DstNet")
    @Expose
    private String DstNet;

    /**
    * 过滤规则的协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 过滤规则的源端口，默认值1-65535
    */
    @SerializedName("SrcPort")
    @Expose
    private String SrcPort;

    /**
    * 过滤规则的目的端口，默认值1-65535
    */
    @SerializedName("DstPort")
    @Expose
    private String DstPort;

    /**
    * 流量镜像过滤规则唯一ID。
    */
    @SerializedName("TrafficMirrorFilterRuleId")
    @Expose
    private String TrafficMirrorFilterRuleId;

    /**
    * 流量镜像过滤规则优先级。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 流量镜像过滤规则策略，支持类型："ACCEPT", "DROP"。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 流量镜像过滤规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 过滤规则的源网段 
     * @return SrcNet 过滤规则的源网段
     */
    public String getSrcNet() {
        return this.SrcNet;
    }

    /**
     * Set 过滤规则的源网段
     * @param SrcNet 过滤规则的源网段
     */
    public void setSrcNet(String SrcNet) {
        this.SrcNet = SrcNet;
    }

    /**
     * Get 过滤规则的目的网段 
     * @return DstNet 过滤规则的目的网段
     */
    public String getDstNet() {
        return this.DstNet;
    }

    /**
     * Set 过滤规则的目的网段
     * @param DstNet 过滤规则的目的网段
     */
    public void setDstNet(String DstNet) {
        this.DstNet = DstNet;
    }

    /**
     * Get 过滤规则的协议 
     * @return Protocol 过滤规则的协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 过滤规则的协议
     * @param Protocol 过滤规则的协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 过滤规则的源端口，默认值1-65535 
     * @return SrcPort 过滤规则的源端口，默认值1-65535
     */
    public String getSrcPort() {
        return this.SrcPort;
    }

    /**
     * Set 过滤规则的源端口，默认值1-65535
     * @param SrcPort 过滤规则的源端口，默认值1-65535
     */
    public void setSrcPort(String SrcPort) {
        this.SrcPort = SrcPort;
    }

    /**
     * Get 过滤规则的目的端口，默认值1-65535 
     * @return DstPort 过滤规则的目的端口，默认值1-65535
     */
    public String getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 过滤规则的目的端口，默认值1-65535
     * @param DstPort 过滤规则的目的端口，默认值1-65535
     */
    public void setDstPort(String DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 流量镜像过滤规则唯一ID。 
     * @return TrafficMirrorFilterRuleId 流量镜像过滤规则唯一ID。
     */
    public String getTrafficMirrorFilterRuleId() {
        return this.TrafficMirrorFilterRuleId;
    }

    /**
     * Set 流量镜像过滤规则唯一ID。
     * @param TrafficMirrorFilterRuleId 流量镜像过滤规则唯一ID。
     */
    public void setTrafficMirrorFilterRuleId(String TrafficMirrorFilterRuleId) {
        this.TrafficMirrorFilterRuleId = TrafficMirrorFilterRuleId;
    }

    /**
     * Get 流量镜像过滤规则优先级。 
     * @return Priority 流量镜像过滤规则优先级。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 流量镜像过滤规则优先级。
     * @param Priority 流量镜像过滤规则优先级。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 流量镜像过滤规则策略，支持类型："ACCEPT", "DROP"。 
     * @return Action 流量镜像过滤规则策略，支持类型："ACCEPT", "DROP"。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 流量镜像过滤规则策略，支持类型："ACCEPT", "DROP"。
     * @param Action 流量镜像过滤规则策略，支持类型："ACCEPT", "DROP"。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 流量镜像过滤规则描述。 
     * @return Description 流量镜像过滤规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 流量镜像过滤规则描述。
     * @param Description 流量镜像过滤规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public TrafficMirrorFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficMirrorFilter(TrafficMirrorFilter source) {
        if (source.SrcNet != null) {
            this.SrcNet = new String(source.SrcNet);
        }
        if (source.DstNet != null) {
            this.DstNet = new String(source.DstNet);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SrcPort != null) {
            this.SrcPort = new String(source.SrcPort);
        }
        if (source.DstPort != null) {
            this.DstPort = new String(source.DstPort);
        }
        if (source.TrafficMirrorFilterRuleId != null) {
            this.TrafficMirrorFilterRuleId = new String(source.TrafficMirrorFilterRuleId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcNet", this.SrcNet);
        this.setParamSimple(map, prefix + "DstNet", this.DstNet);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SrcPort", this.SrcPort);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "TrafficMirrorFilterRuleId", this.TrafficMirrorFilterRuleId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

