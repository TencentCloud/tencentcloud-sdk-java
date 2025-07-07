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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DecribeSuggestRiskLevelMatrixRequest extends AbstractModel {

    /**
    * dspaId

    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 分类分级等级列表
    */
    @SerializedName("SensitiveLevelList")
    @Expose
    private RiskMatrixLevel [] SensitiveLevelList;

    /**
    * 脆弱项等级列表
    */
    @SerializedName("VulnerabilityLevelList")
    @Expose
    private RiskMatrixLevel [] VulnerabilityLevelList;

    /**
     * Get dspaId
 
     * @return DspaId dspaId

     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set dspaId

     * @param DspaId dspaId

     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 分类分级等级列表 
     * @return SensitiveLevelList 分类分级等级列表
     */
    public RiskMatrixLevel [] getSensitiveLevelList() {
        return this.SensitiveLevelList;
    }

    /**
     * Set 分类分级等级列表
     * @param SensitiveLevelList 分类分级等级列表
     */
    public void setSensitiveLevelList(RiskMatrixLevel [] SensitiveLevelList) {
        this.SensitiveLevelList = SensitiveLevelList;
    }

    /**
     * Get 脆弱项等级列表 
     * @return VulnerabilityLevelList 脆弱项等级列表
     */
    public RiskMatrixLevel [] getVulnerabilityLevelList() {
        return this.VulnerabilityLevelList;
    }

    /**
     * Set 脆弱项等级列表
     * @param VulnerabilityLevelList 脆弱项等级列表
     */
    public void setVulnerabilityLevelList(RiskMatrixLevel [] VulnerabilityLevelList) {
        this.VulnerabilityLevelList = VulnerabilityLevelList;
    }

    public DecribeSuggestRiskLevelMatrixRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DecribeSuggestRiskLevelMatrixRequest(DecribeSuggestRiskLevelMatrixRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.SensitiveLevelList != null) {
            this.SensitiveLevelList = new RiskMatrixLevel[source.SensitiveLevelList.length];
            for (int i = 0; i < source.SensitiveLevelList.length; i++) {
                this.SensitiveLevelList[i] = new RiskMatrixLevel(source.SensitiveLevelList[i]);
            }
        }
        if (source.VulnerabilityLevelList != null) {
            this.VulnerabilityLevelList = new RiskMatrixLevel[source.VulnerabilityLevelList.length];
            for (int i = 0; i < source.VulnerabilityLevelList.length; i++) {
                this.VulnerabilityLevelList[i] = new RiskMatrixLevel(source.VulnerabilityLevelList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamArrayObj(map, prefix + "SensitiveLevelList.", this.SensitiveLevelList);
        this.setParamArrayObj(map, prefix + "VulnerabilityLevelList.", this.VulnerabilityLevelList);

    }
}

