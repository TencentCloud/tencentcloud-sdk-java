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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDSPAAssessmentRiskLatestRequest extends AbstractModel{

    /**
    * dspa实例id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 最新风险项Id
    */
    @SerializedName("RiskLatestTableId")
    @Expose
    private Long RiskLatestTableId;

    /**
    * 风险状态（waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 处置人
    */
    @SerializedName("ProcessPeople")
    @Expose
    private String ProcessPeople;

    /**
     * Get dspa实例id 
     * @return DspaId dspa实例id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set dspa实例id
     * @param DspaId dspa实例id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 最新风险项Id 
     * @return RiskLatestTableId 最新风险项Id
     */
    public Long getRiskLatestTableId() {
        return this.RiskLatestTableId;
    }

    /**
     * Set 最新风险项Id
     * @param RiskLatestTableId 最新风险项Id
     */
    public void setRiskLatestTableId(Long RiskLatestTableId) {
        this.RiskLatestTableId = RiskLatestTableId;
    }

    /**
     * Get 风险状态（waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略） 
     * @return Status 风险状态（waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 风险状态（waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略）
     * @param Status 风险状态（waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 处置人 
     * @return ProcessPeople 处置人
     */
    public String getProcessPeople() {
        return this.ProcessPeople;
    }

    /**
     * Set 处置人
     * @param ProcessPeople 处置人
     */
    public void setProcessPeople(String ProcessPeople) {
        this.ProcessPeople = ProcessPeople;
    }

    public ModifyDSPAAssessmentRiskLatestRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDSPAAssessmentRiskLatestRequest(ModifyDSPAAssessmentRiskLatestRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.RiskLatestTableId != null) {
            this.RiskLatestTableId = new Long(source.RiskLatestTableId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.ProcessPeople != null) {
            this.ProcessPeople = new String(source.ProcessPeople);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "RiskLatestTableId", this.RiskLatestTableId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "ProcessPeople", this.ProcessPeople);

    }
}

