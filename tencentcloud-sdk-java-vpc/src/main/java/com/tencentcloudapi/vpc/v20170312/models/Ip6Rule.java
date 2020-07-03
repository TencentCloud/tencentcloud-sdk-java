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

public class Ip6Rule extends AbstractModel{

    /**
    * IPV6转换规则唯一ID，形如rule6-xxxxxxxx
    */
    @SerializedName("Ip6RuleId")
    @Expose
    private String Ip6RuleId;

    /**
    * IPV6转换规则名称
    */
    @SerializedName("Ip6RuleName")
    @Expose
    private String Ip6RuleName;

    /**
    * IPV6地址
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * IPV6端口号
    */
    @SerializedName("Vport6")
    @Expose
    private Long Vport6;

    /**
    * 协议类型，支持TCP/UDP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * IPV4地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * IPV4端口号
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 转换规则状态，限于CREATING,RUNNING,DELETING,MODIFYING
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * 转换规则创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get IPV6转换规则唯一ID，形如rule6-xxxxxxxx 
     * @return Ip6RuleId IPV6转换规则唯一ID，形如rule6-xxxxxxxx
     */
    public String getIp6RuleId() {
        return this.Ip6RuleId;
    }

    /**
     * Set IPV6转换规则唯一ID，形如rule6-xxxxxxxx
     * @param Ip6RuleId IPV6转换规则唯一ID，形如rule6-xxxxxxxx
     */
    public void setIp6RuleId(String Ip6RuleId) {
        this.Ip6RuleId = Ip6RuleId;
    }

    /**
     * Get IPV6转换规则名称 
     * @return Ip6RuleName IPV6转换规则名称
     */
    public String getIp6RuleName() {
        return this.Ip6RuleName;
    }

    /**
     * Set IPV6转换规则名称
     * @param Ip6RuleName IPV6转换规则名称
     */
    public void setIp6RuleName(String Ip6RuleName) {
        this.Ip6RuleName = Ip6RuleName;
    }

    /**
     * Get IPV6地址 
     * @return Vip6 IPV6地址
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set IPV6地址
     * @param Vip6 IPV6地址
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get IPV6端口号 
     * @return Vport6 IPV6端口号
     */
    public Long getVport6() {
        return this.Vport6;
    }

    /**
     * Set IPV6端口号
     * @param Vport6 IPV6端口号
     */
    public void setVport6(Long Vport6) {
        this.Vport6 = Vport6;
    }

    /**
     * Get 协议类型，支持TCP/UDP 
     * @return Protocol 协议类型，支持TCP/UDP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型，支持TCP/UDP
     * @param Protocol 协议类型，支持TCP/UDP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get IPV4地址 
     * @return Vip IPV4地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IPV4地址
     * @param Vip IPV4地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get IPV4端口号 
     * @return Vport IPV4端口号
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set IPV4端口号
     * @param Vport IPV4端口号
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 转换规则状态，限于CREATING,RUNNING,DELETING,MODIFYING 
     * @return RuleStatus 转换规则状态，限于CREATING,RUNNING,DELETING,MODIFYING
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 转换规则状态，限于CREATING,RUNNING,DELETING,MODIFYING
     * @param RuleStatus 转换规则状态，限于CREATING,RUNNING,DELETING,MODIFYING
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 转换规则创建时间 
     * @return CreatedTime 转换规则创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 转换规则创建时间
     * @param CreatedTime 转换规则创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip6RuleId", this.Ip6RuleId);
        this.setParamSimple(map, prefix + "Ip6RuleName", this.Ip6RuleName);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "Vport6", this.Vport6);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

