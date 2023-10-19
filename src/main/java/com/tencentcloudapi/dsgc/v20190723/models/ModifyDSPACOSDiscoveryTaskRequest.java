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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDSPACOSDiscoveryTaskRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务描述，最大长度为1024个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 任务开关，0 关闭，1 启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 通用规则集开关；0 关闭，1 启用
    */
    @SerializedName("GeneralRuleSetEnable")
    @Expose
    private Long GeneralRuleSetEnable;

    /**
    * 合规组ID列表，最多支持添加5个
    */
    @SerializedName("ComplianceGroupIds")
    @Expose
    private Long [] ComplianceGroupIds;

    /**
    * 执行计划； 0立即 1定时，选择“立即”时，扫描周期只能选择单次
    */
    @SerializedName("Plan")
    @Expose
    private Long Plan;

    /**
    * 扫描周期；0单次 1每天 2每周 3每月
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 任务定时启动时间，格式：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。
    */
    @SerializedName("TimingStartTime")
    @Expose
    private String TimingStartTime;

    /**
    * 待扫描文件类型，用逗号隔开，格式如：[".txt", ".csv", ".log", ".xml",".html", ".json"]。
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持100MB（102400KB）
    */
    @SerializedName("FileSizeLimit")
    @Expose
    private Long FileSizeLimit;

    /**
    * 资源所在地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复 
     * @return Name 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     * @param Name 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务描述，最大长度为1024个字符 
     * @return Description 任务描述，最大长度为1024个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述，最大长度为1024个字符
     * @param Description 任务描述，最大长度为1024个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 任务开关，0 关闭，1 启用 
     * @return Enable 任务开关，0 关闭，1 启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 任务开关，0 关闭，1 启用
     * @param Enable 任务开关，0 关闭，1 启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 通用规则集开关；0 关闭，1 启用 
     * @return GeneralRuleSetEnable 通用规则集开关；0 关闭，1 启用
     */
    public Long getGeneralRuleSetEnable() {
        return this.GeneralRuleSetEnable;
    }

    /**
     * Set 通用规则集开关；0 关闭，1 启用
     * @param GeneralRuleSetEnable 通用规则集开关；0 关闭，1 启用
     */
    public void setGeneralRuleSetEnable(Long GeneralRuleSetEnable) {
        this.GeneralRuleSetEnable = GeneralRuleSetEnable;
    }

    /**
     * Get 合规组ID列表，最多支持添加5个 
     * @return ComplianceGroupIds 合规组ID列表，最多支持添加5个
     */
    public Long [] getComplianceGroupIds() {
        return this.ComplianceGroupIds;
    }

    /**
     * Set 合规组ID列表，最多支持添加5个
     * @param ComplianceGroupIds 合规组ID列表，最多支持添加5个
     */
    public void setComplianceGroupIds(Long [] ComplianceGroupIds) {
        this.ComplianceGroupIds = ComplianceGroupIds;
    }

    /**
     * Get 执行计划； 0立即 1定时，选择“立即”时，扫描周期只能选择单次 
     * @return Plan 执行计划； 0立即 1定时，选择“立即”时，扫描周期只能选择单次
     */
    public Long getPlan() {
        return this.Plan;
    }

    /**
     * Set 执行计划； 0立即 1定时，选择“立即”时，扫描周期只能选择单次
     * @param Plan 执行计划； 0立即 1定时，选择“立即”时，扫描周期只能选择单次
     */
    public void setPlan(Long Plan) {
        this.Plan = Plan;
    }

    /**
     * Get 扫描周期；0单次 1每天 2每周 3每月 
     * @return Period 扫描周期；0单次 1每天 2每周 3每月
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 扫描周期；0单次 1每天 2每周 3每月
     * @param Period 扫描周期；0单次 1每天 2每周 3每月
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 任务定时启动时间，格式：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。 
     * @return TimingStartTime 任务定时启动时间，格式：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。
     */
    public String getTimingStartTime() {
        return this.TimingStartTime;
    }

    /**
     * Set 任务定时启动时间，格式：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。
     * @param TimingStartTime 任务定时启动时间，格式：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。
     */
    public void setTimingStartTime(String TimingStartTime) {
        this.TimingStartTime = TimingStartTime;
    }

    /**
     * Get 待扫描文件类型，用逗号隔开，格式如：[".txt", ".csv", ".log", ".xml",".html", ".json"]。 
     * @return FileTypes 待扫描文件类型，用逗号隔开，格式如：[".txt", ".csv", ".log", ".xml",".html", ".json"]。
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set 待扫描文件类型，用逗号隔开，格式如：[".txt", ".csv", ".log", ".xml",".html", ".json"]。
     * @param FileTypes 待扫描文件类型，用逗号隔开，格式如：[".txt", ".csv", ".log", ".xml",".html", ".json"]。
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持100MB（102400KB） 
     * @return FileSizeLimit 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持100MB（102400KB）
     */
    public Long getFileSizeLimit() {
        return this.FileSizeLimit;
    }

    /**
     * Set 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持100MB（102400KB）
     * @param FileSizeLimit 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持100MB（102400KB）
     */
    public void setFileSizeLimit(Long FileSizeLimit) {
        this.FileSizeLimit = FileSizeLimit;
    }

    /**
     * Get 资源所在地域 
     * @return ResourceRegion 资源所在地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
     * @param ResourceRegion 资源所在地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    public ModifyDSPACOSDiscoveryTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDSPACOSDiscoveryTaskRequest(ModifyDSPACOSDiscoveryTaskRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.GeneralRuleSetEnable != null) {
            this.GeneralRuleSetEnable = new Long(source.GeneralRuleSetEnable);
        }
        if (source.ComplianceGroupIds != null) {
            this.ComplianceGroupIds = new Long[source.ComplianceGroupIds.length];
            for (int i = 0; i < source.ComplianceGroupIds.length; i++) {
                this.ComplianceGroupIds[i] = new Long(source.ComplianceGroupIds[i]);
            }
        }
        if (source.Plan != null) {
            this.Plan = new Long(source.Plan);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.TimingStartTime != null) {
            this.TimingStartTime = new String(source.TimingStartTime);
        }
        if (source.FileTypes != null) {
            this.FileTypes = new String[source.FileTypes.length];
            for (int i = 0; i < source.FileTypes.length; i++) {
                this.FileTypes[i] = new String(source.FileTypes[i]);
            }
        }
        if (source.FileSizeLimit != null) {
            this.FileSizeLimit = new Long(source.FileSizeLimit);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "GeneralRuleSetEnable", this.GeneralRuleSetEnable);
        this.setParamArraySimple(map, prefix + "ComplianceGroupIds.", this.ComplianceGroupIds);
        this.setParamSimple(map, prefix + "Plan", this.Plan);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "TimingStartTime", this.TimingStartTime);
        this.setParamArraySimple(map, prefix + "FileTypes.", this.FileTypes);
        this.setParamSimple(map, prefix + "FileSizeLimit", this.FileSizeLimit);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);

    }
}

