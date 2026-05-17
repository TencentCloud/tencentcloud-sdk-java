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

public class CosRiskViewInfo extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略id
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 策略分类
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * 策略风险等级
    */
    @SerializedName("PolicyRiskLevel")
    @Expose
    private Long PolicyRiskLevel;

    /**
    * 策略描述
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * 待处理的桶数
    */
    @SerializedName("HandleBucketCount")
    @Expose
    private Long HandleBucketCount;

    /**
    * 最近风险检出时间Unix时间单位毫秒
    */
    @SerializedName("LastScanTimestamp")
    @Expose
    private Long LastScanTimestamp;

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
     * Get 策略id 
     * @return PolicyId 策略id
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略id
     * @param PolicyId 策略id
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略分类 
     * @return PolicyType 策略分类
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略分类
     * @param PolicyType 策略分类
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略风险等级 
     * @return PolicyRiskLevel 策略风险等级
     */
    public Long getPolicyRiskLevel() {
        return this.PolicyRiskLevel;
    }

    /**
     * Set 策略风险等级
     * @param PolicyRiskLevel 策略风险等级
     */
    public void setPolicyRiskLevel(Long PolicyRiskLevel) {
        this.PolicyRiskLevel = PolicyRiskLevel;
    }

    /**
     * Get 策略描述 
     * @return PolicyDescription 策略描述
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set 策略描述
     * @param PolicyDescription 策略描述
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * Get 待处理的桶数 
     * @return HandleBucketCount 待处理的桶数
     */
    public Long getHandleBucketCount() {
        return this.HandleBucketCount;
    }

    /**
     * Set 待处理的桶数
     * @param HandleBucketCount 待处理的桶数
     */
    public void setHandleBucketCount(Long HandleBucketCount) {
        this.HandleBucketCount = HandleBucketCount;
    }

    /**
     * Get 最近风险检出时间Unix时间单位毫秒 
     * @return LastScanTimestamp 最近风险检出时间Unix时间单位毫秒
     */
    public Long getLastScanTimestamp() {
        return this.LastScanTimestamp;
    }

    /**
     * Set 最近风险检出时间Unix时间单位毫秒
     * @param LastScanTimestamp 最近风险检出时间Unix时间单位毫秒
     */
    public void setLastScanTimestamp(Long LastScanTimestamp) {
        this.LastScanTimestamp = LastScanTimestamp;
    }

    public CosRiskViewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRiskViewInfo(CosRiskViewInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyRiskLevel != null) {
            this.PolicyRiskLevel = new Long(source.PolicyRiskLevel);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
        if (source.HandleBucketCount != null) {
            this.HandleBucketCount = new Long(source.HandleBucketCount);
        }
        if (source.LastScanTimestamp != null) {
            this.LastScanTimestamp = new Long(source.LastScanTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyRiskLevel", this.PolicyRiskLevel);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "HandleBucketCount", this.HandleBucketCount);
        this.setParamSimple(map, prefix + "LastScanTimestamp", this.LastScanTimestamp);

    }
}

