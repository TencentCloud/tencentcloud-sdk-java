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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAclQuintupleEntry extends AbstractModel{

    /**
    * 协议, 取值: TCP,UDP, ICMP, ALL。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 源端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
    */
    @SerializedName("SourcePort")
    @Expose
    private String SourcePort;

    /**
    * 源CIDR。
    */
    @SerializedName("SourceCidr")
    @Expose
    private String SourceCidr;

    /**
    * 目的端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
    */
    @SerializedName("DestinationPort")
    @Expose
    private String DestinationPort;

    /**
    * 目的CIDR。
    */
    @SerializedName("DestinationCidr")
    @Expose
    private String DestinationCidr;

    /**
    * 动作，ACCEPT 或 DROP。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 网络ACL条目唯一ID。
    */
    @SerializedName("NetworkAclQuintupleEntryId")
    @Expose
    private String NetworkAclQuintupleEntryId;

    /**
    * 优先级，从1开始。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 创建时间，用于DescribeNetworkAclQuintupleEntries的出参。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 方向，INGRESS或EGRESS，用于DescribeNetworkAclQuintupleEntries的出参。
    */
    @SerializedName("NetworkAclDirection")
    @Expose
    private String NetworkAclDirection;

    /**
     * Get 协议, 取值: TCP,UDP, ICMP, ALL。 
     * @return Protocol 协议, 取值: TCP,UDP, ICMP, ALL。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议, 取值: TCP,UDP, ICMP, ALL。
     * @param Protocol 协议, 取值: TCP,UDP, ICMP, ALL。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 描述。 
     * @return Description 描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
     * @param Description 描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 源端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。 
     * @return SourcePort 源端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
     */
    public String getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set 源端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
     * @param SourcePort 源端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
     */
    public void setSourcePort(String SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get 源CIDR。 
     * @return SourceCidr 源CIDR。
     */
    public String getSourceCidr() {
        return this.SourceCidr;
    }

    /**
     * Set 源CIDR。
     * @param SourceCidr 源CIDR。
     */
    public void setSourceCidr(String SourceCidr) {
        this.SourceCidr = SourceCidr;
    }

    /**
     * Get 目的端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。 
     * @return DestinationPort 目的端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
     */
    public String getDestinationPort() {
        return this.DestinationPort;
    }

    /**
     * Set 目的端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
     * @param DestinationPort 目的端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
     */
    public void setDestinationPort(String DestinationPort) {
        this.DestinationPort = DestinationPort;
    }

    /**
     * Get 目的CIDR。 
     * @return DestinationCidr 目的CIDR。
     */
    public String getDestinationCidr() {
        return this.DestinationCidr;
    }

    /**
     * Set 目的CIDR。
     * @param DestinationCidr 目的CIDR。
     */
    public void setDestinationCidr(String DestinationCidr) {
        this.DestinationCidr = DestinationCidr;
    }

    /**
     * Get 动作，ACCEPT 或 DROP。 
     * @return Action 动作，ACCEPT 或 DROP。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作，ACCEPT 或 DROP。
     * @param Action 动作，ACCEPT 或 DROP。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 网络ACL条目唯一ID。 
     * @return NetworkAclQuintupleEntryId 网络ACL条目唯一ID。
     */
    public String getNetworkAclQuintupleEntryId() {
        return this.NetworkAclQuintupleEntryId;
    }

    /**
     * Set 网络ACL条目唯一ID。
     * @param NetworkAclQuintupleEntryId 网络ACL条目唯一ID。
     */
    public void setNetworkAclQuintupleEntryId(String NetworkAclQuintupleEntryId) {
        this.NetworkAclQuintupleEntryId = NetworkAclQuintupleEntryId;
    }

    /**
     * Get 优先级，从1开始。 
     * @return Priority 优先级，从1开始。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级，从1开始。
     * @param Priority 优先级，从1开始。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 创建时间，用于DescribeNetworkAclQuintupleEntries的出参。 
     * @return CreateTime 创建时间，用于DescribeNetworkAclQuintupleEntries的出参。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，用于DescribeNetworkAclQuintupleEntries的出参。
     * @param CreateTime 创建时间，用于DescribeNetworkAclQuintupleEntries的出参。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 方向，INGRESS或EGRESS，用于DescribeNetworkAclQuintupleEntries的出参。 
     * @return NetworkAclDirection 方向，INGRESS或EGRESS，用于DescribeNetworkAclQuintupleEntries的出参。
     */
    public String getNetworkAclDirection() {
        return this.NetworkAclDirection;
    }

    /**
     * Set 方向，INGRESS或EGRESS，用于DescribeNetworkAclQuintupleEntries的出参。
     * @param NetworkAclDirection 方向，INGRESS或EGRESS，用于DescribeNetworkAclQuintupleEntries的出参。
     */
    public void setNetworkAclDirection(String NetworkAclDirection) {
        this.NetworkAclDirection = NetworkAclDirection;
    }

    public NetworkAclQuintupleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAclQuintupleEntry(NetworkAclQuintupleEntry source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new String(source.SourcePort);
        }
        if (source.SourceCidr != null) {
            this.SourceCidr = new String(source.SourceCidr);
        }
        if (source.DestinationPort != null) {
            this.DestinationPort = new String(source.DestinationPort);
        }
        if (source.DestinationCidr != null) {
            this.DestinationCidr = new String(source.DestinationCidr);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.NetworkAclQuintupleEntryId != null) {
            this.NetworkAclQuintupleEntryId = new String(source.NetworkAclQuintupleEntryId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.NetworkAclDirection != null) {
            this.NetworkAclDirection = new String(source.NetworkAclDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourcePort", this.SourcePort);
        this.setParamSimple(map, prefix + "SourceCidr", this.SourceCidr);
        this.setParamSimple(map, prefix + "DestinationPort", this.DestinationPort);
        this.setParamSimple(map, prefix + "DestinationCidr", this.DestinationCidr);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "NetworkAclQuintupleEntryId", this.NetworkAclQuintupleEntryId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "NetworkAclDirection", this.NetworkAclDirection);

    }
}

