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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Strategy extends AbstractModel {

    /**
    * 策略名
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 基线检测项总数
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * 主机数量
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 扫描周期
    */
    @SerializedName("ScanCycle")
    @Expose
    private Long ScanCycle;

    /**
    * 扫描时间
    */
    @SerializedName("ScanAt")
    @Expose
    private String ScanAt;

    /**
    * 是否可用
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * 通过率
    */
    @SerializedName("PassRate")
    @Expose
    private Long PassRate;

    /**
    * 基线id
    */
    @SerializedName("CategoryIds")
    @Expose
    private String CategoryIds;

    /**
    * 是否默认策略
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
     * Get 策略名 
     * @return StrategyName 策略名
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名
     * @param StrategyName 策略名
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 策略id 
     * @return StrategyId 策略id
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id
     * @param StrategyId 策略id
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 基线检测项总数 
     * @return RuleCount 基线检测项总数
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set 基线检测项总数
     * @param RuleCount 基线检测项总数
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get 主机数量 
     * @return HostCount 主机数量
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 主机数量
     * @param HostCount 主机数量
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 扫描周期 
     * @return ScanCycle 扫描周期
     */
    public Long getScanCycle() {
        return this.ScanCycle;
    }

    /**
     * Set 扫描周期
     * @param ScanCycle 扫描周期
     */
    public void setScanCycle(Long ScanCycle) {
        this.ScanCycle = ScanCycle;
    }

    /**
     * Get 扫描时间 
     * @return ScanAt 扫描时间
     */
    public String getScanAt() {
        return this.ScanAt;
    }

    /**
     * Set 扫描时间
     * @param ScanAt 扫描时间
     */
    public void setScanAt(String ScanAt) {
        this.ScanAt = ScanAt;
    }

    /**
     * Get 是否可用 
     * @return Enabled 是否可用
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否可用
     * @param Enabled 是否可用
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 通过率 
     * @return PassRate 通过率
     */
    public Long getPassRate() {
        return this.PassRate;
    }

    /**
     * Set 通过率
     * @param PassRate 通过率
     */
    public void setPassRate(Long PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get 基线id 
     * @return CategoryIds 基线id
     */
    public String getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set 基线id
     * @param CategoryIds 基线id
     */
    public void setCategoryIds(String CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get 是否默认策略 
     * @return IsDefault 是否默认策略
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认策略
     * @param IsDefault 是否默认策略
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    public Strategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Strategy(Strategy source) {
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ScanCycle != null) {
            this.ScanCycle = new Long(source.ScanCycle);
        }
        if (source.ScanAt != null) {
            this.ScanAt = new String(source.ScanAt);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.PassRate != null) {
            this.PassRate = new Long(source.PassRate);
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new String(source.CategoryIds);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ScanCycle", this.ScanCycle);
        this.setParamSimple(map, prefix + "ScanAt", this.ScanAt);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamSimple(map, prefix + "CategoryIds", this.CategoryIds);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

