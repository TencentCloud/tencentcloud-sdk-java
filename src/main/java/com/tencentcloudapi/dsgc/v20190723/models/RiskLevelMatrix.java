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

public class RiskLevelMatrix extends AbstractModel {

    /**
    * 存储id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 分类分级levelID
    */
    @SerializedName("SensitiveLevelId")
    @Expose
    private Long SensitiveLevelId;

    /**
    * 分类分级名称
    */
    @SerializedName("SensitiveLevelName")
    @Expose
    private String SensitiveLevelName;

    /**
    * 漏洞级别
    */
    @SerializedName("VulnerabilityLevel")
    @Expose
    private String VulnerabilityLevel;

    /**
    * 风险级别
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
     * Get 存储id 
     * @return Id 存储id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 存储id
     * @param Id 存储id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 分类分级levelID 
     * @return SensitiveLevelId 分类分级levelID
     */
    public Long getSensitiveLevelId() {
        return this.SensitiveLevelId;
    }

    /**
     * Set 分类分级levelID
     * @param SensitiveLevelId 分类分级levelID
     */
    public void setSensitiveLevelId(Long SensitiveLevelId) {
        this.SensitiveLevelId = SensitiveLevelId;
    }

    /**
     * Get 分类分级名称 
     * @return SensitiveLevelName 分类分级名称
     */
    public String getSensitiveLevelName() {
        return this.SensitiveLevelName;
    }

    /**
     * Set 分类分级名称
     * @param SensitiveLevelName 分类分级名称
     */
    public void setSensitiveLevelName(String SensitiveLevelName) {
        this.SensitiveLevelName = SensitiveLevelName;
    }

    /**
     * Get 漏洞级别 
     * @return VulnerabilityLevel 漏洞级别
     */
    public String getVulnerabilityLevel() {
        return this.VulnerabilityLevel;
    }

    /**
     * Set 漏洞级别
     * @param VulnerabilityLevel 漏洞级别
     */
    public void setVulnerabilityLevel(String VulnerabilityLevel) {
        this.VulnerabilityLevel = VulnerabilityLevel;
    }

    /**
     * Get 风险级别 
     * @return RiskLevel 风险级别
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险级别
     * @param RiskLevel 风险级别
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    public RiskLevelMatrix() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskLevelMatrix(RiskLevelMatrix source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SensitiveLevelId != null) {
            this.SensitiveLevelId = new Long(source.SensitiveLevelId);
        }
        if (source.SensitiveLevelName != null) {
            this.SensitiveLevelName = new String(source.SensitiveLevelName);
        }
        if (source.VulnerabilityLevel != null) {
            this.VulnerabilityLevel = new String(source.VulnerabilityLevel);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SensitiveLevelId", this.SensitiveLevelId);
        this.setParamSimple(map, prefix + "SensitiveLevelName", this.SensitiveLevelName);
        this.setParamSimple(map, prefix + "VulnerabilityLevel", this.VulnerabilityLevel);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);

    }
}

