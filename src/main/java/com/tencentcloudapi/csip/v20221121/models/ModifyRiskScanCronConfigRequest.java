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

public class ModifyRiskScanCronConfigRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>计划开启状态</p>
    */
    @SerializedName("CronStatus")
    @Expose
    private Long CronStatus;

    /**
    * <p>计划表达式</p>
    */
    @SerializedName("CronPlanContent")
    @Expose
    private String CronPlanContent;

    /**
    * <p>新增规则是否自动执行</p>
    */
    @SerializedName("RuleAutoEnable")
    @Expose
    private Boolean RuleAutoEnable;

    /**
    * <p>时区</p>
    */
    @SerializedName("ScanPlanTimezone")
    @Expose
    private String ScanPlanTimezone;

    /**
    * <p>增量资产开启风险扫描开关</p>
    */
    @SerializedName("IncrementAssetScanRisk")
    @Expose
    private Boolean IncrementAssetScanRisk;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>计划开启状态</p> 
     * @return CronStatus <p>计划开启状态</p>
     */
    public Long getCronStatus() {
        return this.CronStatus;
    }

    /**
     * Set <p>计划开启状态</p>
     * @param CronStatus <p>计划开启状态</p>
     */
    public void setCronStatus(Long CronStatus) {
        this.CronStatus = CronStatus;
    }

    /**
     * Get <p>计划表达式</p> 
     * @return CronPlanContent <p>计划表达式</p>
     */
    public String getCronPlanContent() {
        return this.CronPlanContent;
    }

    /**
     * Set <p>计划表达式</p>
     * @param CronPlanContent <p>计划表达式</p>
     */
    public void setCronPlanContent(String CronPlanContent) {
        this.CronPlanContent = CronPlanContent;
    }

    /**
     * Get <p>新增规则是否自动执行</p> 
     * @return RuleAutoEnable <p>新增规则是否自动执行</p>
     */
    public Boolean getRuleAutoEnable() {
        return this.RuleAutoEnable;
    }

    /**
     * Set <p>新增规则是否自动执行</p>
     * @param RuleAutoEnable <p>新增规则是否自动执行</p>
     */
    public void setRuleAutoEnable(Boolean RuleAutoEnable) {
        this.RuleAutoEnable = RuleAutoEnable;
    }

    /**
     * Get <p>时区</p> 
     * @return ScanPlanTimezone <p>时区</p>
     */
    public String getScanPlanTimezone() {
        return this.ScanPlanTimezone;
    }

    /**
     * Set <p>时区</p>
     * @param ScanPlanTimezone <p>时区</p>
     */
    public void setScanPlanTimezone(String ScanPlanTimezone) {
        this.ScanPlanTimezone = ScanPlanTimezone;
    }

    /**
     * Get <p>增量资产开启风险扫描开关</p> 
     * @return IncrementAssetScanRisk <p>增量资产开启风险扫描开关</p>
     */
    public Boolean getIncrementAssetScanRisk() {
        return this.IncrementAssetScanRisk;
    }

    /**
     * Set <p>增量资产开启风险扫描开关</p>
     * @param IncrementAssetScanRisk <p>增量资产开启风险扫描开关</p>
     */
    public void setIncrementAssetScanRisk(Boolean IncrementAssetScanRisk) {
        this.IncrementAssetScanRisk = IncrementAssetScanRisk;
    }

    public ModifyRiskScanCronConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRiskScanCronConfigRequest(ModifyRiskScanCronConfigRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.CronStatus != null) {
            this.CronStatus = new Long(source.CronStatus);
        }
        if (source.CronPlanContent != null) {
            this.CronPlanContent = new String(source.CronPlanContent);
        }
        if (source.RuleAutoEnable != null) {
            this.RuleAutoEnable = new Boolean(source.RuleAutoEnable);
        }
        if (source.ScanPlanTimezone != null) {
            this.ScanPlanTimezone = new String(source.ScanPlanTimezone);
        }
        if (source.IncrementAssetScanRisk != null) {
            this.IncrementAssetScanRisk = new Boolean(source.IncrementAssetScanRisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "CronStatus", this.CronStatus);
        this.setParamSimple(map, prefix + "CronPlanContent", this.CronPlanContent);
        this.setParamSimple(map, prefix + "RuleAutoEnable", this.RuleAutoEnable);
        this.setParamSimple(map, prefix + "ScanPlanTimezone", this.ScanPlanTimezone);
        this.setParamSimple(map, prefix + "IncrementAssetScanRisk", this.IncrementAssetScanRisk);

    }
}

