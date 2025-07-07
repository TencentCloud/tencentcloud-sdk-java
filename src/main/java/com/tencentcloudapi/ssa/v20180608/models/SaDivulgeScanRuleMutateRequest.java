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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaDivulgeScanRuleMutateRequest extends AbstractModel {

    /**
    * Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * DivulgeSoure
    */
    @SerializedName("DivulgeSoure")
    @Expose
    private String DivulgeSoure;

    /**
    * DivulgeSoureUrl
    */
    @SerializedName("DivulgeSoureUrl")
    @Expose
    private String DivulgeSoureUrl;

    /**
    * RuleName
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * RuleWord
    */
    @SerializedName("RuleWord")
    @Expose
    private String RuleWord;

    /**
    * ScanStatus
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * DivulgeType
    */
    @SerializedName("DivulgeType")
    @Expose
    private String DivulgeType;

    /**
    * RepairAdvice
    */
    @SerializedName("RepairAdvice")
    @Expose
    private String RepairAdvice;

    /**
     * Get Id 
     * @return Id Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id
     * @param Id Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get DivulgeSoure 
     * @return DivulgeSoure DivulgeSoure
     */
    public String getDivulgeSoure() {
        return this.DivulgeSoure;
    }

    /**
     * Set DivulgeSoure
     * @param DivulgeSoure DivulgeSoure
     */
    public void setDivulgeSoure(String DivulgeSoure) {
        this.DivulgeSoure = DivulgeSoure;
    }

    /**
     * Get DivulgeSoureUrl 
     * @return DivulgeSoureUrl DivulgeSoureUrl
     */
    public String getDivulgeSoureUrl() {
        return this.DivulgeSoureUrl;
    }

    /**
     * Set DivulgeSoureUrl
     * @param DivulgeSoureUrl DivulgeSoureUrl
     */
    public void setDivulgeSoureUrl(String DivulgeSoureUrl) {
        this.DivulgeSoureUrl = DivulgeSoureUrl;
    }

    /**
     * Get RuleName 
     * @return RuleName RuleName
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set RuleName
     * @param RuleName RuleName
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get RuleWord 
     * @return RuleWord RuleWord
     */
    public String getRuleWord() {
        return this.RuleWord;
    }

    /**
     * Set RuleWord
     * @param RuleWord RuleWord
     */
    public void setRuleWord(String RuleWord) {
        this.RuleWord = RuleWord;
    }

    /**
     * Get ScanStatus 
     * @return ScanStatus ScanStatus
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set ScanStatus
     * @param ScanStatus ScanStatus
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get DivulgeType 
     * @return DivulgeType DivulgeType
     */
    public String getDivulgeType() {
        return this.DivulgeType;
    }

    /**
     * Set DivulgeType
     * @param DivulgeType DivulgeType
     */
    public void setDivulgeType(String DivulgeType) {
        this.DivulgeType = DivulgeType;
    }

    /**
     * Get RepairAdvice 
     * @return RepairAdvice RepairAdvice
     */
    public String getRepairAdvice() {
        return this.RepairAdvice;
    }

    /**
     * Set RepairAdvice
     * @param RepairAdvice RepairAdvice
     */
    public void setRepairAdvice(String RepairAdvice) {
        this.RepairAdvice = RepairAdvice;
    }

    public SaDivulgeScanRuleMutateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaDivulgeScanRuleMutateRequest(SaDivulgeScanRuleMutateRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.DivulgeSoure != null) {
            this.DivulgeSoure = new String(source.DivulgeSoure);
        }
        if (source.DivulgeSoureUrl != null) {
            this.DivulgeSoureUrl = new String(source.DivulgeSoureUrl);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleWord != null) {
            this.RuleWord = new String(source.RuleWord);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.DivulgeType != null) {
            this.DivulgeType = new String(source.DivulgeType);
        }
        if (source.RepairAdvice != null) {
            this.RepairAdvice = new String(source.RepairAdvice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DivulgeSoure", this.DivulgeSoure);
        this.setParamSimple(map, prefix + "DivulgeSoureUrl", this.DivulgeSoureUrl);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleWord", this.RuleWord);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "DivulgeType", this.DivulgeType);
        this.setParamSimple(map, prefix + "RepairAdvice", this.RepairAdvice);

    }
}

