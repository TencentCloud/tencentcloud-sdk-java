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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4RuleEntry extends AbstractModel{

    /**
    * 转发协议，取值[TCP, UDP]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 转发端口
    */
    @SerializedName("VirtualPort")
    @Expose
    private Long VirtualPort;

    /**
    * 源站端口
    */
    @SerializedName("SourcePort")
    @Expose
    private Long SourcePort;

    /**
    * 回源方式，取值[1(域名回源)，2(IP回源)]
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 会话保持时间，单位秒
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
    * 回源列表
    */
    @SerializedName("SourceList")
    @Expose
    private L4RuleSource [] SourceList;

    /**
    * 负载均衡方式，取值[1(加权轮询)，2(源IP hash)]
    */
    @SerializedName("LbType")
    @Expose
    private Long LbType;

    /**
    * 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]；
    */
    @SerializedName("KeepEnable")
    @Expose
    private Long KeepEnable;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则描述
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 移除水印状态，取值[0(关闭)，1(开启)]
    */
    @SerializedName("RemoveSwitch")
    @Expose
    private Long RemoveSwitch;

    /**
     * Get 转发协议，取值[TCP, UDP] 
     * @return Protocol 转发协议，取值[TCP, UDP]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 转发协议，取值[TCP, UDP]
     * @param Protocol 转发协议，取值[TCP, UDP]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 转发端口 
     * @return VirtualPort 转发端口
     */
    public Long getVirtualPort() {
        return this.VirtualPort;
    }

    /**
     * Set 转发端口
     * @param VirtualPort 转发端口
     */
    public void setVirtualPort(Long VirtualPort) {
        this.VirtualPort = VirtualPort;
    }

    /**
     * Get 源站端口 
     * @return SourcePort 源站端口
     */
    public Long getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set 源站端口
     * @param SourcePort 源站端口
     */
    public void setSourcePort(Long SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get 回源方式，取值[1(域名回源)，2(IP回源)] 
     * @return SourceType 回源方式，取值[1(域名回源)，2(IP回源)]
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 回源方式，取值[1(域名回源)，2(IP回源)]
     * @param SourceType 回源方式，取值[1(域名回源)，2(IP回源)]
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 会话保持时间，单位秒 
     * @return KeepTime 会话保持时间，单位秒
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set 会话保持时间，单位秒
     * @param KeepTime 会话保持时间，单位秒
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    /**
     * Get 回源列表 
     * @return SourceList 回源列表
     */
    public L4RuleSource [] getSourceList() {
        return this.SourceList;
    }

    /**
     * Set 回源列表
     * @param SourceList 回源列表
     */
    public void setSourceList(L4RuleSource [] SourceList) {
        this.SourceList = SourceList;
    }

    /**
     * Get 负载均衡方式，取值[1(加权轮询)，2(源IP hash)] 
     * @return LbType 负载均衡方式，取值[1(加权轮询)，2(源IP hash)]
     */
    public Long getLbType() {
        return this.LbType;
    }

    /**
     * Set 负载均衡方式，取值[1(加权轮询)，2(源IP hash)]
     * @param LbType 负载均衡方式，取值[1(加权轮询)，2(源IP hash)]
     */
    public void setLbType(Long LbType) {
        this.LbType = LbType;
    }

    /**
     * Get 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]； 
     * @return KeepEnable 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]；
     */
    public Long getKeepEnable() {
        return this.KeepEnable;
    }

    /**
     * Set 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]；
     * @param KeepEnable 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]；
     */
    public void setKeepEnable(Long KeepEnable) {
        this.KeepEnable = KeepEnable;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则描述 
     * @return RuleName 规则描述
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则描述
     * @param RuleName 规则描述
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 移除水印状态，取值[0(关闭)，1(开启)] 
     * @return RemoveSwitch 移除水印状态，取值[0(关闭)，1(开启)]
     */
    public Long getRemoveSwitch() {
        return this.RemoveSwitch;
    }

    /**
     * Set 移除水印状态，取值[0(关闭)，1(开启)]
     * @param RemoveSwitch 移除水印状态，取值[0(关闭)，1(开启)]
     */
    public void setRemoveSwitch(Long RemoveSwitch) {
        this.RemoveSwitch = RemoveSwitch;
    }

    public L4RuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4RuleEntry(L4RuleEntry source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.VirtualPort != null) {
            this.VirtualPort = new Long(source.VirtualPort);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new Long(source.SourcePort);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.KeepTime != null) {
            this.KeepTime = new Long(source.KeepTime);
        }
        if (source.SourceList != null) {
            this.SourceList = new L4RuleSource[source.SourceList.length];
            for (int i = 0; i < source.SourceList.length; i++) {
                this.SourceList[i] = new L4RuleSource(source.SourceList[i]);
            }
        }
        if (source.LbType != null) {
            this.LbType = new Long(source.LbType);
        }
        if (source.KeepEnable != null) {
            this.KeepEnable = new Long(source.KeepEnable);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RemoveSwitch != null) {
            this.RemoveSwitch = new Long(source.RemoveSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);
        this.setParamSimple(map, prefix + "SourcePort", this.SourcePort);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);
        this.setParamArrayObj(map, prefix + "SourceList.", this.SourceList);
        this.setParamSimple(map, prefix + "LbType", this.LbType);
        this.setParamSimple(map, prefix + "KeepEnable", this.KeepEnable);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RemoveSwitch", this.RemoveSwitch);

    }
}

