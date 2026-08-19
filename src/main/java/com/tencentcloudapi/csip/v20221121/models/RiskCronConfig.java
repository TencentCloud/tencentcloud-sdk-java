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

public class RiskCronConfig extends AbstractModel {

    /**
    * <p>周期任务创建者appid</p>
    */
    @SerializedName("CreateAppID")
    @Expose
    private Long CreateAppID;

    /**
    * <p>周期计划</p>
    */
    @SerializedName("PlanContent")
    @Expose
    private String PlanContent;

    /**
    * <p>周期扫描开启状态</p>
    */
    @SerializedName("CronStatus")
    @Expose
    private Long CronStatus;

    /**
    * <p>新增规则是否自动加入扫描</p>
    */
    @SerializedName("AddRuleEnableStatus")
    @Expose
    private Boolean AddRuleEnableStatus;

    /**
    * <p>时区</p>
    */
    @SerializedName("ScanPlanTimezone")
    @Expose
    private String ScanPlanTimezone;

    /**
    * <p>增量资产开启风险扫描</p>
    */
    @SerializedName("IncrementAssetScanRisk")
    @Expose
    private Boolean IncrementAssetScanRisk;

    /**
     * Get <p>周期任务创建者appid</p> 
     * @return CreateAppID <p>周期任务创建者appid</p>
     */
    public Long getCreateAppID() {
        return this.CreateAppID;
    }

    /**
     * Set <p>周期任务创建者appid</p>
     * @param CreateAppID <p>周期任务创建者appid</p>
     */
    public void setCreateAppID(Long CreateAppID) {
        this.CreateAppID = CreateAppID;
    }

    /**
     * Get <p>周期计划</p> 
     * @return PlanContent <p>周期计划</p>
     */
    public String getPlanContent() {
        return this.PlanContent;
    }

    /**
     * Set <p>周期计划</p>
     * @param PlanContent <p>周期计划</p>
     */
    public void setPlanContent(String PlanContent) {
        this.PlanContent = PlanContent;
    }

    /**
     * Get <p>周期扫描开启状态</p> 
     * @return CronStatus <p>周期扫描开启状态</p>
     */
    public Long getCronStatus() {
        return this.CronStatus;
    }

    /**
     * Set <p>周期扫描开启状态</p>
     * @param CronStatus <p>周期扫描开启状态</p>
     */
    public void setCronStatus(Long CronStatus) {
        this.CronStatus = CronStatus;
    }

    /**
     * Get <p>新增规则是否自动加入扫描</p> 
     * @return AddRuleEnableStatus <p>新增规则是否自动加入扫描</p>
     */
    public Boolean getAddRuleEnableStatus() {
        return this.AddRuleEnableStatus;
    }

    /**
     * Set <p>新增规则是否自动加入扫描</p>
     * @param AddRuleEnableStatus <p>新增规则是否自动加入扫描</p>
     */
    public void setAddRuleEnableStatus(Boolean AddRuleEnableStatus) {
        this.AddRuleEnableStatus = AddRuleEnableStatus;
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
     * Get <p>增量资产开启风险扫描</p> 
     * @return IncrementAssetScanRisk <p>增量资产开启风险扫描</p>
     */
    public Boolean getIncrementAssetScanRisk() {
        return this.IncrementAssetScanRisk;
    }

    /**
     * Set <p>增量资产开启风险扫描</p>
     * @param IncrementAssetScanRisk <p>增量资产开启风险扫描</p>
     */
    public void setIncrementAssetScanRisk(Boolean IncrementAssetScanRisk) {
        this.IncrementAssetScanRisk = IncrementAssetScanRisk;
    }

    public RiskCronConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCronConfig(RiskCronConfig source) {
        if (source.CreateAppID != null) {
            this.CreateAppID = new Long(source.CreateAppID);
        }
        if (source.PlanContent != null) {
            this.PlanContent = new String(source.PlanContent);
        }
        if (source.CronStatus != null) {
            this.CronStatus = new Long(source.CronStatus);
        }
        if (source.AddRuleEnableStatus != null) {
            this.AddRuleEnableStatus = new Boolean(source.AddRuleEnableStatus);
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
        this.setParamSimple(map, prefix + "CreateAppID", this.CreateAppID);
        this.setParamSimple(map, prefix + "PlanContent", this.PlanContent);
        this.setParamSimple(map, prefix + "CronStatus", this.CronStatus);
        this.setParamSimple(map, prefix + "AddRuleEnableStatus", this.AddRuleEnableStatus);
        this.setParamSimple(map, prefix + "ScanPlanTimezone", this.ScanPlanTimezone);
        this.setParamSimple(map, prefix + "IncrementAssetScanRisk", this.IncrementAssetScanRisk);

    }
}

