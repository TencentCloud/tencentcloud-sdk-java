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

public class ModifyDSPAAssessmentRiskRequest extends AbstractModel {

    /**
    * DSPA实例Id，格式“dspa-xxxxxxxx”
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 评估任务Id，格式“task-xxxxxxxx”
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 风险项Id，格式“risk-xxxxxxxx”
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 风险项状态。（waiting:待处理，processing:处理中，finished:已处理）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get DSPA实例Id，格式“dspa-xxxxxxxx” 
     * @return DspaId DSPA实例Id，格式“dspa-xxxxxxxx”
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例Id，格式“dspa-xxxxxxxx”
     * @param DspaId DSPA实例Id，格式“dspa-xxxxxxxx”
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 评估任务Id，格式“task-xxxxxxxx” 
     * @return TaskId 评估任务Id，格式“task-xxxxxxxx”
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 评估任务Id，格式“task-xxxxxxxx”
     * @param TaskId 评估任务Id，格式“task-xxxxxxxx”
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 风险项Id，格式“risk-xxxxxxxx” 
     * @return RiskId 风险项Id，格式“risk-xxxxxxxx”
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险项Id，格式“risk-xxxxxxxx”
     * @param RiskId 风险项Id，格式“risk-xxxxxxxx”
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 风险项状态。（waiting:待处理，processing:处理中，finished:已处理） 
     * @return Status 风险项状态。（waiting:待处理，processing:处理中，finished:已处理）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 风险项状态。（waiting:待处理，processing:处理中，finished:已处理）
     * @param Status 风险项状态。（waiting:待处理，processing:处理中，finished:已处理）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyDSPAAssessmentRiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDSPAAssessmentRiskRequest(ModifyDSPAAssessmentRiskRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

