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

public class Ip6Translator extends AbstractModel{

    /**
    * IPV6转换实例唯一ID，形如ip6-xxxxxxxx
    */
    @SerializedName("Ip6TranslatorId")
    @Expose
    private String Ip6TranslatorId;

    /**
    * IPV6转换实例名称
    */
    @SerializedName("Ip6TranslatorName")
    @Expose
    private String Ip6TranslatorName;

    /**
    * IPV6地址
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * IPV6转换地址所属运营商
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * 转换实例状态，限于CREATING,RUNNING,DELETING,MODIFYING
    */
    @SerializedName("TranslatorStatus")
    @Expose
    private String TranslatorStatus;

    /**
    * IPV6转换实例创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 绑定的IPV6转换规则数量
    */
    @SerializedName("Ip6RuleCount")
    @Expose
    private Long Ip6RuleCount;

    /**
    * IPV6转换规则信息
    */
    @SerializedName("IP6RuleSet")
    @Expose
    private Ip6Rule [] IP6RuleSet;

    /**
     * Get IPV6转换实例唯一ID，形如ip6-xxxxxxxx 
     * @return Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public String getIp6TranslatorId() {
        return this.Ip6TranslatorId;
    }

    /**
     * Set IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     * @param Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public void setIp6TranslatorId(String Ip6TranslatorId) {
        this.Ip6TranslatorId = Ip6TranslatorId;
    }

    /**
     * Get IPV6转换实例名称 
     * @return Ip6TranslatorName IPV6转换实例名称
     */
    public String getIp6TranslatorName() {
        return this.Ip6TranslatorName;
    }

    /**
     * Set IPV6转换实例名称
     * @param Ip6TranslatorName IPV6转换实例名称
     */
    public void setIp6TranslatorName(String Ip6TranslatorName) {
        this.Ip6TranslatorName = Ip6TranslatorName;
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
     * Get IPV6转换地址所属运营商 
     * @return IspName IPV6转换地址所属运营商
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set IPV6转换地址所属运营商
     * @param IspName IPV6转换地址所属运营商
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get 转换实例状态，限于CREATING,RUNNING,DELETING,MODIFYING 
     * @return TranslatorStatus 转换实例状态，限于CREATING,RUNNING,DELETING,MODIFYING
     */
    public String getTranslatorStatus() {
        return this.TranslatorStatus;
    }

    /**
     * Set 转换实例状态，限于CREATING,RUNNING,DELETING,MODIFYING
     * @param TranslatorStatus 转换实例状态，限于CREATING,RUNNING,DELETING,MODIFYING
     */
    public void setTranslatorStatus(String TranslatorStatus) {
        this.TranslatorStatus = TranslatorStatus;
    }

    /**
     * Get IPV6转换实例创建时间 
     * @return CreatedTime IPV6转换实例创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set IPV6转换实例创建时间
     * @param CreatedTime IPV6转换实例创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 绑定的IPV6转换规则数量 
     * @return Ip6RuleCount 绑定的IPV6转换规则数量
     */
    public Long getIp6RuleCount() {
        return this.Ip6RuleCount;
    }

    /**
     * Set 绑定的IPV6转换规则数量
     * @param Ip6RuleCount 绑定的IPV6转换规则数量
     */
    public void setIp6RuleCount(Long Ip6RuleCount) {
        this.Ip6RuleCount = Ip6RuleCount;
    }

    /**
     * Get IPV6转换规则信息 
     * @return IP6RuleSet IPV6转换规则信息
     */
    public Ip6Rule [] getIP6RuleSet() {
        return this.IP6RuleSet;
    }

    /**
     * Set IPV6转换规则信息
     * @param IP6RuleSet IPV6转换规则信息
     */
    public void setIP6RuleSet(Ip6Rule [] IP6RuleSet) {
        this.IP6RuleSet = IP6RuleSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip6TranslatorId", this.Ip6TranslatorId);
        this.setParamSimple(map, prefix + "Ip6TranslatorName", this.Ip6TranslatorName);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamSimple(map, prefix + "TranslatorStatus", this.TranslatorStatus);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Ip6RuleCount", this.Ip6RuleCount);
        this.setParamArrayObj(map, prefix + "IP6RuleSet.", this.IP6RuleSet);

    }
}

