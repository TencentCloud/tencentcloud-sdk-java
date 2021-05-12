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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupApiRuleData extends AbstractModel{

    /**
    * 访问源，入站时为Ip/Cidr，默认为0.0.0.0/0； 出站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 访问目的，出站时为Ip/Cidr，默认为0.0.0.0/0；入站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 协议，支持ANY/TCP/UDP/ICMP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口, 当Protocol为ANY或ICMP时，Port为-1/-1
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 策略, 1：阻断，2：放行
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * 描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 规则类型，1：VpcId+Ip/Cidr, 2: 实例ID，入站时为访问目的类型，出站时为访问源类型
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 执行顺序，中间插入必传，前插、后插非必传
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 私有网络ID，当RuleType为1时必传
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get 访问源，入站时为Ip/Cidr，默认为0.0.0.0/0； 出站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID 
     * @return SourceId 访问源，入站时为Ip/Cidr，默认为0.0.0.0/0； 出站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 访问源，入站时为Ip/Cidr，默认为0.0.0.0/0； 出站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID
     * @param SourceId 访问源，入站时为Ip/Cidr，默认为0.0.0.0/0； 出站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 访问目的，出站时为Ip/Cidr，默认为0.0.0.0/0；入站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID 
     * @return TargetId 访问目的，出站时为Ip/Cidr，默认为0.0.0.0/0；入站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 访问目的，出站时为Ip/Cidr，默认为0.0.0.0/0；入站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID
     * @param TargetId 访问目的，出站时为Ip/Cidr，默认为0.0.0.0/0；入站时当RuleType为1时，支持内网Ip/Cidr, 当RuleType为2时，填实例ID
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 协议，支持ANY/TCP/UDP/ICMP 
     * @return Protocol 协议，支持ANY/TCP/UDP/ICMP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，支持ANY/TCP/UDP/ICMP
     * @param Protocol 协议，支持ANY/TCP/UDP/ICMP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口, 当Protocol为ANY或ICMP时，Port为-1/-1 
     * @return Port 端口, 当Protocol为ANY或ICMP时，Port为-1/-1
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口, 当Protocol为ANY或ICMP时，Port为-1/-1
     * @param Port 端口, 当Protocol为ANY或ICMP时，Port为-1/-1
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 策略, 1：阻断，2：放行 
     * @return Strategy 策略, 1：阻断，2：放行
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 策略, 1：阻断，2：放行
     * @param Strategy 策略, 1：阻断，2：放行
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 描述 
     * @return Detail 描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
     * @param Detail 描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 规则类型，1：VpcId+Ip/Cidr, 2: 实例ID，入站时为访问目的类型，出站时为访问源类型 
     * @return RuleType 规则类型，1：VpcId+Ip/Cidr, 2: 实例ID，入站时为访问目的类型，出站时为访问源类型
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型，1：VpcId+Ip/Cidr, 2: 实例ID，入站时为访问目的类型，出站时为访问源类型
     * @param RuleType 规则类型，1：VpcId+Ip/Cidr, 2: 实例ID，入站时为访问目的类型，出站时为访问源类型
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 执行顺序，中间插入必传，前插、后插非必传 
     * @return OrderIndex 执行顺序，中间插入必传，前插、后插非必传
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 执行顺序，中间插入必传，前插、后插非必传
     * @param OrderIndex 执行顺序，中间插入必传，前插、后插非必传
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 私有网络ID，当RuleType为1时必传 
     * @return VpcId 私有网络ID，当RuleType为1时必传
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，当RuleType为1时必传
     * @param VpcId 私有网络ID，当RuleType为1时必传
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public SecurityGroupApiRuleData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupApiRuleData(SecurityGroupApiRuleData source) {
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

