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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckTemplateRule extends AbstractModel {

    /**
    * 健康检测项目名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 健康检测规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 修复动作
    */
    @SerializedName("RepairAction")
    @Expose
    private String RepairAction;

    /**
    * 修复影响
    */
    @SerializedName("RepairEffect")
    @Expose
    private String RepairEffect;

    /**
    * 是否建议开启检测
    */
    @SerializedName("ShouldEnable")
    @Expose
    private Boolean ShouldEnable;

    /**
    * 是否建议修复
    */
    @SerializedName("ShouldRepair")
    @Expose
    private Boolean ShouldRepair;

    /**
    * 问题严重程度
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
     * Get 健康检测项目名称 
     * @return Name 健康检测项目名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 健康检测项目名称
     * @param Name 健康检测项目名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 健康检测规则描述 
     * @return Description 健康检测规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 健康检测规则描述
     * @param Description 健康检测规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 修复动作 
     * @return RepairAction 修复动作
     */
    public String getRepairAction() {
        return this.RepairAction;
    }

    /**
     * Set 修复动作
     * @param RepairAction 修复动作
     */
    public void setRepairAction(String RepairAction) {
        this.RepairAction = RepairAction;
    }

    /**
     * Get 修复影响 
     * @return RepairEffect 修复影响
     */
    public String getRepairEffect() {
        return this.RepairEffect;
    }

    /**
     * Set 修复影响
     * @param RepairEffect 修复影响
     */
    public void setRepairEffect(String RepairEffect) {
        this.RepairEffect = RepairEffect;
    }

    /**
     * Get 是否建议开启检测 
     * @return ShouldEnable 是否建议开启检测
     */
    public Boolean getShouldEnable() {
        return this.ShouldEnable;
    }

    /**
     * Set 是否建议开启检测
     * @param ShouldEnable 是否建议开启检测
     */
    public void setShouldEnable(Boolean ShouldEnable) {
        this.ShouldEnable = ShouldEnable;
    }

    /**
     * Get 是否建议修复 
     * @return ShouldRepair 是否建议修复
     */
    public Boolean getShouldRepair() {
        return this.ShouldRepair;
    }

    /**
     * Set 是否建议修复
     * @param ShouldRepair 是否建议修复
     */
    public void setShouldRepair(Boolean ShouldRepair) {
        this.ShouldRepair = ShouldRepair;
    }

    /**
     * Get 问题严重程度 
     * @return Severity 问题严重程度
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 问题严重程度
     * @param Severity 问题严重程度
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    public HealthCheckTemplateRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckTemplateRule(HealthCheckTemplateRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RepairAction != null) {
            this.RepairAction = new String(source.RepairAction);
        }
        if (source.RepairEffect != null) {
            this.RepairEffect = new String(source.RepairEffect);
        }
        if (source.ShouldEnable != null) {
            this.ShouldEnable = new Boolean(source.ShouldEnable);
        }
        if (source.ShouldRepair != null) {
            this.ShouldRepair = new Boolean(source.ShouldRepair);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RepairAction", this.RepairAction);
        this.setParamSimple(map, prefix + "RepairEffect", this.RepairEffect);
        this.setParamSimple(map, prefix + "ShouldEnable", this.ShouldEnable);
        this.setParamSimple(map, prefix + "ShouldRepair", this.ShouldRepair);
        this.setParamSimple(map, prefix + "Severity", this.Severity);

    }
}

