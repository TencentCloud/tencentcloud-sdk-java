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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosPolicyInfo extends AbstractModel {

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略类型
PolicyType：1 告警策略 2 风险策略  3  白名单策略  4 ip隐藏策略
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * system:系统内置 user:用户自定义
    */
    @SerializedName("PolicySource")
    @Expose
    private Long PolicySource;

    /**
    * 策略内容
    */
    @SerializedName("PolicyContent")
    @Expose
    private String PolicyContent;

    /**
    * 0 关闭
1 开启
    */
    @SerializedName("PolicyStatus")
    @Expose
    private Long PolicyStatus;

    /**
    * 策略分类
    */
    @SerializedName("PolicyAbnormalType")
    @Expose
    private Long PolicyAbnormalType;

    /**
    * 风险级别
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 策略id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 创建时间
    */
    @SerializedName("PolicyCreateTime")
    @Expose
    private Long PolicyCreateTime;

    /**
    * 更新时间
    */
    @SerializedName("PolicyUpdateTime")
    @Expose
    private Long PolicyUpdateTime;

    /**
    * 策略近七天命中次数
    */
    @SerializedName("PolicyHitCount")
    @Expose
    private Long PolicyHitCount;

    /**
    * 告警内容hash
    */
    @SerializedName("PolicyContentHash")
    @Expose
    private String PolicyContentHash;

    /**
    * 关联账户数
    */
    @SerializedName("RelAccountCount")
    @Expose
    private Long RelAccountCount;

    /**
    * 关联账号uin
    */
    @SerializedName("RelAccountUin")
    @Expose
    private String RelAccountUin;

    /**
    * 关联账号名
    */
    @SerializedName("RelAccountName")
    @Expose
    private String RelAccountName;

    /**
    * 描述信息
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * 备注信息
    */
    @SerializedName("PolicyMarker")
    @Expose
    private String PolicyMarker;

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 多账号场景下的id集合
    */
    @SerializedName("PolicyIdSet")
    @Expose
    private Long [] PolicyIdSet;

    /**
    * 是否处置历史数据状态  0 无须处置 1 需要处置 2 已处置
    */
    @SerializedName("PolicyHistoryHandleStatus")
    @Expose
    private Long PolicyHistoryHandleStatus;

    /**
    * 系统策略编辑状态
    */
    @SerializedName("SystemPolicyEditStatus")
    @Expose
    private Long SystemPolicyEditStatus;

    /**
     * Get 策略名称 
     * @return PolicyName 策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
     * @param PolicyName 策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略类型
PolicyType：1 告警策略 2 风险策略  3  白名单策略  4 ip隐藏策略 
     * @return PolicyType 策略类型
PolicyType：1 告警策略 2 风险策略  3  白名单策略  4 ip隐藏策略
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型
PolicyType：1 告警策略 2 风险策略  3  白名单策略  4 ip隐藏策略
     * @param PolicyType 策略类型
PolicyType：1 告警策略 2 风险策略  3  白名单策略  4 ip隐藏策略
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get system:系统内置 user:用户自定义 
     * @return PolicySource system:系统内置 user:用户自定义
     */
    public Long getPolicySource() {
        return this.PolicySource;
    }

    /**
     * Set system:系统内置 user:用户自定义
     * @param PolicySource system:系统内置 user:用户自定义
     */
    public void setPolicySource(Long PolicySource) {
        this.PolicySource = PolicySource;
    }

    /**
     * Get 策略内容 
     * @return PolicyContent 策略内容
     */
    public String getPolicyContent() {
        return this.PolicyContent;
    }

    /**
     * Set 策略内容
     * @param PolicyContent 策略内容
     */
    public void setPolicyContent(String PolicyContent) {
        this.PolicyContent = PolicyContent;
    }

    /**
     * Get 0 关闭
1 开启 
     * @return PolicyStatus 0 关闭
1 开启
     */
    public Long getPolicyStatus() {
        return this.PolicyStatus;
    }

    /**
     * Set 0 关闭
1 开启
     * @param PolicyStatus 0 关闭
1 开启
     */
    public void setPolicyStatus(Long PolicyStatus) {
        this.PolicyStatus = PolicyStatus;
    }

    /**
     * Get 策略分类 
     * @return PolicyAbnormalType 策略分类
     */
    public Long getPolicyAbnormalType() {
        return this.PolicyAbnormalType;
    }

    /**
     * Set 策略分类
     * @param PolicyAbnormalType 策略分类
     */
    public void setPolicyAbnormalType(Long PolicyAbnormalType) {
        this.PolicyAbnormalType = PolicyAbnormalType;
    }

    /**
     * Get 风险级别 
     * @return RiskLevel 风险级别
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险级别
     * @param RiskLevel 风险级别
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 策略id 
     * @return PolicyId 策略id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略id
     * @param PolicyId 策略id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 创建时间 
     * @return PolicyCreateTime 创建时间
     */
    public Long getPolicyCreateTime() {
        return this.PolicyCreateTime;
    }

    /**
     * Set 创建时间
     * @param PolicyCreateTime 创建时间
     */
    public void setPolicyCreateTime(Long PolicyCreateTime) {
        this.PolicyCreateTime = PolicyCreateTime;
    }

    /**
     * Get 更新时间 
     * @return PolicyUpdateTime 更新时间
     */
    public Long getPolicyUpdateTime() {
        return this.PolicyUpdateTime;
    }

    /**
     * Set 更新时间
     * @param PolicyUpdateTime 更新时间
     */
    public void setPolicyUpdateTime(Long PolicyUpdateTime) {
        this.PolicyUpdateTime = PolicyUpdateTime;
    }

    /**
     * Get 策略近七天命中次数 
     * @return PolicyHitCount 策略近七天命中次数
     */
    public Long getPolicyHitCount() {
        return this.PolicyHitCount;
    }

    /**
     * Set 策略近七天命中次数
     * @param PolicyHitCount 策略近七天命中次数
     */
    public void setPolicyHitCount(Long PolicyHitCount) {
        this.PolicyHitCount = PolicyHitCount;
    }

    /**
     * Get 告警内容hash 
     * @return PolicyContentHash 告警内容hash
     */
    public String getPolicyContentHash() {
        return this.PolicyContentHash;
    }

    /**
     * Set 告警内容hash
     * @param PolicyContentHash 告警内容hash
     */
    public void setPolicyContentHash(String PolicyContentHash) {
        this.PolicyContentHash = PolicyContentHash;
    }

    /**
     * Get 关联账户数 
     * @return RelAccountCount 关联账户数
     */
    public Long getRelAccountCount() {
        return this.RelAccountCount;
    }

    /**
     * Set 关联账户数
     * @param RelAccountCount 关联账户数
     */
    public void setRelAccountCount(Long RelAccountCount) {
        this.RelAccountCount = RelAccountCount;
    }

    /**
     * Get 关联账号uin 
     * @return RelAccountUin 关联账号uin
     */
    public String getRelAccountUin() {
        return this.RelAccountUin;
    }

    /**
     * Set 关联账号uin
     * @param RelAccountUin 关联账号uin
     */
    public void setRelAccountUin(String RelAccountUin) {
        this.RelAccountUin = RelAccountUin;
    }

    /**
     * Get 关联账号名 
     * @return RelAccountName 关联账号名
     */
    public String getRelAccountName() {
        return this.RelAccountName;
    }

    /**
     * Set 关联账号名
     * @param RelAccountName 关联账号名
     */
    public void setRelAccountName(String RelAccountName) {
        this.RelAccountName = RelAccountName;
    }

    /**
     * Get 描述信息 
     * @return PolicyDescription 描述信息
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set 描述信息
     * @param PolicyDescription 描述信息
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * Get 备注信息 
     * @return PolicyMarker 备注信息
     */
    public String getPolicyMarker() {
        return this.PolicyMarker;
    }

    /**
     * Set 备注信息
     * @param PolicyMarker 备注信息
     */
    public void setPolicyMarker(String PolicyMarker) {
        this.PolicyMarker = PolicyMarker;
    }

    /**
     * Get appid 
     * @return AppId appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 多账号场景下的id集合 
     * @return PolicyIdSet 多账号场景下的id集合
     */
    public Long [] getPolicyIdSet() {
        return this.PolicyIdSet;
    }

    /**
     * Set 多账号场景下的id集合
     * @param PolicyIdSet 多账号场景下的id集合
     */
    public void setPolicyIdSet(Long [] PolicyIdSet) {
        this.PolicyIdSet = PolicyIdSet;
    }

    /**
     * Get 是否处置历史数据状态  0 无须处置 1 需要处置 2 已处置 
     * @return PolicyHistoryHandleStatus 是否处置历史数据状态  0 无须处置 1 需要处置 2 已处置
     */
    public Long getPolicyHistoryHandleStatus() {
        return this.PolicyHistoryHandleStatus;
    }

    /**
     * Set 是否处置历史数据状态  0 无须处置 1 需要处置 2 已处置
     * @param PolicyHistoryHandleStatus 是否处置历史数据状态  0 无须处置 1 需要处置 2 已处置
     */
    public void setPolicyHistoryHandleStatus(Long PolicyHistoryHandleStatus) {
        this.PolicyHistoryHandleStatus = PolicyHistoryHandleStatus;
    }

    /**
     * Get 系统策略编辑状态 
     * @return SystemPolicyEditStatus 系统策略编辑状态
     */
    public Long getSystemPolicyEditStatus() {
        return this.SystemPolicyEditStatus;
    }

    /**
     * Set 系统策略编辑状态
     * @param SystemPolicyEditStatus 系统策略编辑状态
     */
    public void setSystemPolicyEditStatus(Long SystemPolicyEditStatus) {
        this.SystemPolicyEditStatus = SystemPolicyEditStatus;
    }

    public CosPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosPolicyInfo(CosPolicyInfo source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicySource != null) {
            this.PolicySource = new Long(source.PolicySource);
        }
        if (source.PolicyContent != null) {
            this.PolicyContent = new String(source.PolicyContent);
        }
        if (source.PolicyStatus != null) {
            this.PolicyStatus = new Long(source.PolicyStatus);
        }
        if (source.PolicyAbnormalType != null) {
            this.PolicyAbnormalType = new Long(source.PolicyAbnormalType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyCreateTime != null) {
            this.PolicyCreateTime = new Long(source.PolicyCreateTime);
        }
        if (source.PolicyUpdateTime != null) {
            this.PolicyUpdateTime = new Long(source.PolicyUpdateTime);
        }
        if (source.PolicyHitCount != null) {
            this.PolicyHitCount = new Long(source.PolicyHitCount);
        }
        if (source.PolicyContentHash != null) {
            this.PolicyContentHash = new String(source.PolicyContentHash);
        }
        if (source.RelAccountCount != null) {
            this.RelAccountCount = new Long(source.RelAccountCount);
        }
        if (source.RelAccountUin != null) {
            this.RelAccountUin = new String(source.RelAccountUin);
        }
        if (source.RelAccountName != null) {
            this.RelAccountName = new String(source.RelAccountName);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
        if (source.PolicyMarker != null) {
            this.PolicyMarker = new String(source.PolicyMarker);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PolicyIdSet != null) {
            this.PolicyIdSet = new Long[source.PolicyIdSet.length];
            for (int i = 0; i < source.PolicyIdSet.length; i++) {
                this.PolicyIdSet[i] = new Long(source.PolicyIdSet[i]);
            }
        }
        if (source.PolicyHistoryHandleStatus != null) {
            this.PolicyHistoryHandleStatus = new Long(source.PolicyHistoryHandleStatus);
        }
        if (source.SystemPolicyEditStatus != null) {
            this.SystemPolicyEditStatus = new Long(source.SystemPolicyEditStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicySource", this.PolicySource);
        this.setParamSimple(map, prefix + "PolicyContent", this.PolicyContent);
        this.setParamSimple(map, prefix + "PolicyStatus", this.PolicyStatus);
        this.setParamSimple(map, prefix + "PolicyAbnormalType", this.PolicyAbnormalType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyCreateTime", this.PolicyCreateTime);
        this.setParamSimple(map, prefix + "PolicyUpdateTime", this.PolicyUpdateTime);
        this.setParamSimple(map, prefix + "PolicyHitCount", this.PolicyHitCount);
        this.setParamSimple(map, prefix + "PolicyContentHash", this.PolicyContentHash);
        this.setParamSimple(map, prefix + "RelAccountCount", this.RelAccountCount);
        this.setParamSimple(map, prefix + "RelAccountUin", this.RelAccountUin);
        this.setParamSimple(map, prefix + "RelAccountName", this.RelAccountName);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "PolicyMarker", this.PolicyMarker);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArraySimple(map, prefix + "PolicyIdSet.", this.PolicyIdSet);
        this.setParamSimple(map, prefix + "PolicyHistoryHandleStatus", this.PolicyHistoryHandleStatus);
        this.setParamSimple(map, prefix + "SystemPolicyEditStatus", this.SystemPolicyEditStatus);

    }
}

