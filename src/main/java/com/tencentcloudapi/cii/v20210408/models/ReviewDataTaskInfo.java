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

public class ReviewDataTaskInfo extends AbstractModel{

    /**
    * 主任务号
    */
    @SerializedName("MainTaskId")
    @Expose
    private String MainTaskId;

    /**
    * 子任务号
    */
    @SerializedName("SubTaskId")
    @Expose
    private String SubTaskId;

    /**
    * 任务名
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历)
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
     * Get 主任务号 
     * @return MainTaskId 主任务号
     */
    public String getMainTaskId() {
        return this.MainTaskId;
    }

    /**
     * Set 主任务号
     * @param MainTaskId 主任务号
     */
    public void setMainTaskId(String MainTaskId) {
        this.MainTaskId = MainTaskId;
    }

    /**
     * Get 子任务号 
     * @return SubTaskId 子任务号
     */
    public String getSubTaskId() {
        return this.SubTaskId;
    }

    /**
     * Set 子任务号
     * @param SubTaskId 子任务号
     */
    public void setSubTaskId(String SubTaskId) {
        this.SubTaskId = SubTaskId;
    }

    /**
     * Get 任务名 
     * @return TaskName 任务名
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
     * @param TaskName 任务名
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
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

    public ReviewDataTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewDataTaskInfo(ReviewDataTaskInfo source) {
        if (source.MainTaskId != null) {
            this.MainTaskId = new String(source.MainTaskId);
        }
        if (source.SubTaskId != null) {
            this.SubTaskId = new String(source.SubTaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainTaskId", this.MainTaskId);
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

