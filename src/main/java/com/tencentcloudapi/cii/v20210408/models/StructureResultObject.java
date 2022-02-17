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

public class StructureResultObject extends AbstractModel{

    /**
    * 0表示正常返回；1代表结果未生成；2代表任务执行失败
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 报告类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历)
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 结构化结果
    */
    @SerializedName("StructureResult")
    @Expose
    private String StructureResult;

    /**
    * 子任务ID
    */
    @SerializedName("SubTaskId")
    @Expose
    private String SubTaskId;

    /**
    * 任务文件列表
    */
    @SerializedName("TaskFiles")
    @Expose
    private String [] TaskFiles;

    /**
     * Get 0表示正常返回；1代表结果未生成；2代表任务执行失败 
     * @return Code 0表示正常返回；1代表结果未生成；2代表任务执行失败
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 0表示正常返回；1代表结果未生成；2代表任务执行失败
     * @param Code 0表示正常返回；1代表结果未生成；2代表任务执行失败
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 报告类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历) 
     * @return TaskType 报告类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历)
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 报告类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历)
     * @param TaskType 报告类型:HealthReport(体检报告); BUltraReport(B超报告);MedCheckReport(检查报告);LaboratoryReport(检验报告); PathologyReport(病理报告);AdmissionReport(入院记录);DischargeReport(出院记录); DischargeSummary(出院小结);DiagnosisReport(诊断证明); MedicalRecordFront(病案首页);OperationReport(手术记录);OutpatientMedicalRecord(门诊病历)
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 结构化结果 
     * @return StructureResult 结构化结果
     */
    public String getStructureResult() {
        return this.StructureResult;
    }

    /**
     * Set 结构化结果
     * @param StructureResult 结构化结果
     */
    public void setStructureResult(String StructureResult) {
        this.StructureResult = StructureResult;
    }

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
     * Get 任务文件列表 
     * @return TaskFiles 任务文件列表
     */
    public String [] getTaskFiles() {
        return this.TaskFiles;
    }

    /**
     * Set 任务文件列表
     * @param TaskFiles 任务文件列表
     */
    public void setTaskFiles(String [] TaskFiles) {
        this.TaskFiles = TaskFiles;
    }

    public StructureResultObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StructureResultObject(StructureResultObject source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.StructureResult != null) {
            this.StructureResult = new String(source.StructureResult);
        }
        if (source.SubTaskId != null) {
            this.SubTaskId = new String(source.SubTaskId);
        }
        if (source.TaskFiles != null) {
            this.TaskFiles = new String[source.TaskFiles.length];
            for (int i = 0; i < source.TaskFiles.length; i++) {
                this.TaskFiles[i] = new String(source.TaskFiles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "StructureResult", this.StructureResult);
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);
        this.setParamArraySimple(map, prefix + "TaskFiles.", this.TaskFiles);

    }
}

