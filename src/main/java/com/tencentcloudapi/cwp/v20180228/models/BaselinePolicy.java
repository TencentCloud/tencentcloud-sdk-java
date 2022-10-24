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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselinePolicy extends AbstractModel{

    /**
    * 策略名称,长度不超过128英文字符
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 检测间隔[1:1天|3:3天|5:5天|7:7天]
    */
    @SerializedName("DetectInterval")
    @Expose
    private Long DetectInterval;

    /**
    * 检测时间
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * 是否开启[0:未开启|1:开启]
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 资产类型[0:所有专业版旗舰版|1:id|2:ip]
    */
    @SerializedName("AssetType")
    @Expose
    private Long AssetType;

    /**
    * 策略Id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 关联基线项数目
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * 关联基线项数目
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * 关联基线主机数目
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 规则Id
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * 主机Id
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * 主机Ip
    */
    @SerializedName("HostIps")
    @Expose
    private String [] HostIps;

    /**
    * 是否是系统默认
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
     * Get 策略名称,长度不超过128英文字符 
     * @return PolicyName 策略名称,长度不超过128英文字符
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称,长度不超过128英文字符
     * @param PolicyName 策略名称,长度不超过128英文字符
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 检测间隔[1:1天|3:3天|5:5天|7:7天] 
     * @return DetectInterval 检测间隔[1:1天|3:3天|5:5天|7:7天]
     */
    public Long getDetectInterval() {
        return this.DetectInterval;
    }

    /**
     * Set 检测间隔[1:1天|3:3天|5:5天|7:7天]
     * @param DetectInterval 检测间隔[1:1天|3:3天|5:5天|7:7天]
     */
    public void setDetectInterval(Long DetectInterval) {
        this.DetectInterval = DetectInterval;
    }

    /**
     * Get 检测时间 
     * @return DetectTime 检测时间
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set 检测时间
     * @param DetectTime 检测时间
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get 是否开启[0:未开启|1:开启] 
     * @return IsEnabled 是否开启[0:未开启|1:开启]
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 是否开启[0:未开启|1:开启]
     * @param IsEnabled 是否开启[0:未开启|1:开启]
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 资产类型[0:所有专业版旗舰版|1:id|2:ip] 
     * @return AssetType 资产类型[0:所有专业版旗舰版|1:id|2:ip]
     */
    public Long getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型[0:所有专业版旗舰版|1:id|2:ip]
     * @param AssetType 资产类型[0:所有专业版旗舰版|1:id|2:ip]
     */
    public void setAssetType(Long AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 策略Id 
     * @return PolicyId 策略Id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略Id
     * @param PolicyId 策略Id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 关联基线项数目 
     * @return RuleCount 关联基线项数目
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set 关联基线项数目
     * @param RuleCount 关联基线项数目
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get 关联基线项数目 
     * @return ItemCount 关联基线项数目
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set 关联基线项数目
     * @param ItemCount 关联基线项数目
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get 关联基线主机数目 
     * @return HostCount 关联基线主机数目
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 关联基线主机数目
     * @param HostCount 关联基线主机数目
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 规则Id 
     * @return RuleIds 规则Id
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 规则Id
     * @param RuleIds 规则Id
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get 主机Id 
     * @return HostIds 主机Id
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set 主机Id
     * @param HostIds 主机Id
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get 主机Ip 
     * @return HostIps 主机Ip
     */
    public String [] getHostIps() {
        return this.HostIps;
    }

    /**
     * Set 主机Ip
     * @param HostIps 主机Ip
     */
    public void setHostIps(String [] HostIps) {
        this.HostIps = HostIps;
    }

    /**
     * Get 是否是系统默认 
     * @return IsDefault 是否是系统默认
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否是系统默认
     * @param IsDefault 是否是系统默认
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    public BaselinePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicy(BaselinePolicy source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.DetectInterval != null) {
            this.DetectInterval = new Long(source.DetectInterval);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.AssetType != null) {
            this.AssetType = new Long(source.AssetType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.HostIps != null) {
            this.HostIps = new String[source.HostIps.length];
            for (int i = 0; i < source.HostIps.length; i++) {
                this.HostIps[i] = new String(source.HostIps[i]);
            }
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "DetectInterval", this.DetectInterval);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "HostIps.", this.HostIps);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

