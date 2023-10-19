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

public class ModifyDSPAAssessmentRiskLevelRequest extends AbstractModel {

    /**
    * dspa实例id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 风险等级名称
    */
    @SerializedName("RiskLevelName")
    @Expose
    private String RiskLevelName;

    /**
    * 风险的描述
    */
    @SerializedName("RiskLevelDescription")
    @Expose
    private String RiskLevelDescription;

    /**
    * 风险id
    */
    @SerializedName("RiskId")
    @Expose
    private Long RiskId;

    /**
    * 需要修改的风险列表
    */
    @SerializedName("ModifyRiskItem")
    @Expose
    private RiskLevelMatrix [] ModifyRiskItem;

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
     * Get 风险等级名称 
     * @return RiskLevelName 风险等级名称
     */
    public String getRiskLevelName() {
        return this.RiskLevelName;
    }

    /**
     * Set 风险等级名称
     * @param RiskLevelName 风险等级名称
     */
    public void setRiskLevelName(String RiskLevelName) {
        this.RiskLevelName = RiskLevelName;
    }

    /**
     * Get 风险的描述 
     * @return RiskLevelDescription 风险的描述
     */
    public String getRiskLevelDescription() {
        return this.RiskLevelDescription;
    }

    /**
     * Set 风险的描述
     * @param RiskLevelDescription 风险的描述
     */
    public void setRiskLevelDescription(String RiskLevelDescription) {
        this.RiskLevelDescription = RiskLevelDescription;
    }

    /**
     * Get 风险id 
     * @return RiskId 风险id
     */
    public Long getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险id
     * @param RiskId 风险id
     */
    public void setRiskId(Long RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 需要修改的风险列表 
     * @return ModifyRiskItem 需要修改的风险列表
     */
    public RiskLevelMatrix [] getModifyRiskItem() {
        return this.ModifyRiskItem;
    }

    /**
     * Set 需要修改的风险列表
     * @param ModifyRiskItem 需要修改的风险列表
     */
    public void setModifyRiskItem(RiskLevelMatrix [] ModifyRiskItem) {
        this.ModifyRiskItem = ModifyRiskItem;
    }

    public ModifyDSPAAssessmentRiskLevelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDSPAAssessmentRiskLevelRequest(ModifyDSPAAssessmentRiskLevelRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.RiskLevelName != null) {
            this.RiskLevelName = new String(source.RiskLevelName);
        }
        if (source.RiskLevelDescription != null) {
            this.RiskLevelDescription = new String(source.RiskLevelDescription);
        }
        if (source.RiskId != null) {
            this.RiskId = new Long(source.RiskId);
        }
        if (source.ModifyRiskItem != null) {
            this.ModifyRiskItem = new RiskLevelMatrix[source.ModifyRiskItem.length];
            for (int i = 0; i < source.ModifyRiskItem.length; i++) {
                this.ModifyRiskItem[i] = new RiskLevelMatrix(source.ModifyRiskItem[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "RiskLevelName", this.RiskLevelName);
        this.setParamSimple(map, prefix + "RiskLevelDescription", this.RiskLevelDescription);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamArrayObj(map, prefix + "ModifyRiskItem.", this.ModifyRiskItem);

    }
}

