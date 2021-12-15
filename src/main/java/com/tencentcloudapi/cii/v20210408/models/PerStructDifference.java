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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PerStructDifference extends AbstractModel{

    /**
    * 子任务ID
    */
    @SerializedName("SubTaskId")
    @Expose
    private String SubTaskId;

    /**
    * 任务类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历)
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 修改的项
    */
    @SerializedName("ModifyItems")
    @Expose
    private StructureModifyItem [] ModifyItems;

    /**
    * 新增的项
    */
    @SerializedName("NewItems")
    @Expose
    private StructureOneItem [] NewItems;

    /**
    * 删除的项
    */
    @SerializedName("RemoveItems")
    @Expose
    private StructureOneItem [] RemoveItems;

    /**
     * Get 子任务ID 
     * @return SubTaskId 子任务ID
     */
    public String getSubTaskId() {
        return this.SubTaskId;
    }

    /**
     * Set 子任务ID
     * @param SubTaskId 子任务ID
     */
    public void setSubTaskId(String SubTaskId) {
        this.SubTaskId = SubTaskId;
    }

    /**
     * Get 任务类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历) 
     * @return TaskType 任务类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历)
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历)
     * @param TaskType 任务类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历)
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 修改的项 
     * @return ModifyItems 修改的项
     */
    public StructureModifyItem [] getModifyItems() {
        return this.ModifyItems;
    }

    /**
     * Set 修改的项
     * @param ModifyItems 修改的项
     */
    public void setModifyItems(StructureModifyItem [] ModifyItems) {
        this.ModifyItems = ModifyItems;
    }

    /**
     * Get 新增的项 
     * @return NewItems 新增的项
     */
    public StructureOneItem [] getNewItems() {
        return this.NewItems;
    }

    /**
     * Set 新增的项
     * @param NewItems 新增的项
     */
    public void setNewItems(StructureOneItem [] NewItems) {
        this.NewItems = NewItems;
    }

    /**
     * Get 删除的项 
     * @return RemoveItems 删除的项
     */
    public StructureOneItem [] getRemoveItems() {
        return this.RemoveItems;
    }

    /**
     * Set 删除的项
     * @param RemoveItems 删除的项
     */
    public void setRemoveItems(StructureOneItem [] RemoveItems) {
        this.RemoveItems = RemoveItems;
    }

    public PerStructDifference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PerStructDifference(PerStructDifference source) {
        if (source.SubTaskId != null) {
            this.SubTaskId = new String(source.SubTaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ModifyItems != null) {
            this.ModifyItems = new StructureModifyItem[source.ModifyItems.length];
            for (int i = 0; i < source.ModifyItems.length; i++) {
                this.ModifyItems[i] = new StructureModifyItem(source.ModifyItems[i]);
            }
        }
        if (source.NewItems != null) {
            this.NewItems = new StructureOneItem[source.NewItems.length];
            for (int i = 0; i < source.NewItems.length; i++) {
                this.NewItems[i] = new StructureOneItem(source.NewItems[i]);
            }
        }
        if (source.RemoveItems != null) {
            this.RemoveItems = new StructureOneItem[source.RemoveItems.length];
            for (int i = 0; i < source.RemoveItems.length; i++) {
                this.RemoveItems[i] = new StructureOneItem(source.RemoveItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "ModifyItems.", this.ModifyItems);
        this.setParamArrayObj(map, prefix + "NewItems.", this.NewItems);
        this.setParamArrayObj(map, prefix + "RemoveItems.", this.RemoveItems);

    }
}

