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

public class ModifyDSPAESTaskResultRequest extends AbstractModel{

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 字段扫描结果ID
    */
    @SerializedName("FieldResultId")
    @Expose
    private Long FieldResultId;

    /**
    * 合规组ID
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * 是否设置为非敏感字段
    */
    @SerializedName("IsSetNonSensitiveField")
    @Expose
    private Boolean IsSetNonSensitiveField;

    /**
    * 调整后新的规则ID
    */
    @SerializedName("DestRuleId")
    @Expose
    private Long DestRuleId;

    /**
    * 调整后新的分类ID
    */
    @SerializedName("DestCategoryId")
    @Expose
    private Long DestCategoryId;

    /**
    * 调整后新的分级ID
    */
    @SerializedName("DestLevelId")
    @Expose
    private Long DestLevelId;

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
     * Get 字段扫描结果ID 
     * @return FieldResultId 字段扫描结果ID
     */
    public Long getFieldResultId() {
        return this.FieldResultId;
    }

    /**
     * Set 字段扫描结果ID
     * @param FieldResultId 字段扫描结果ID
     */
    public void setFieldResultId(Long FieldResultId) {
        this.FieldResultId = FieldResultId;
    }

    /**
     * Get 合规组ID 
     * @return ComplianceId 合规组ID
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 合规组ID
     * @param ComplianceId 合规组ID
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get 是否设置为非敏感字段 
     * @return IsSetNonSensitiveField 是否设置为非敏感字段
     */
    public Boolean getIsSetNonSensitiveField() {
        return this.IsSetNonSensitiveField;
    }

    /**
     * Set 是否设置为非敏感字段
     * @param IsSetNonSensitiveField 是否设置为非敏感字段
     */
    public void setIsSetNonSensitiveField(Boolean IsSetNonSensitiveField) {
        this.IsSetNonSensitiveField = IsSetNonSensitiveField;
    }

    /**
     * Get 调整后新的规则ID 
     * @return DestRuleId 调整后新的规则ID
     */
    public Long getDestRuleId() {
        return this.DestRuleId;
    }

    /**
     * Set 调整后新的规则ID
     * @param DestRuleId 调整后新的规则ID
     */
    public void setDestRuleId(Long DestRuleId) {
        this.DestRuleId = DestRuleId;
    }

    /**
     * Get 调整后新的分类ID 
     * @return DestCategoryId 调整后新的分类ID
     */
    public Long getDestCategoryId() {
        return this.DestCategoryId;
    }

    /**
     * Set 调整后新的分类ID
     * @param DestCategoryId 调整后新的分类ID
     */
    public void setDestCategoryId(Long DestCategoryId) {
        this.DestCategoryId = DestCategoryId;
    }

    /**
     * Get 调整后新的分级ID 
     * @return DestLevelId 调整后新的分级ID
     */
    public Long getDestLevelId() {
        return this.DestLevelId;
    }

    /**
     * Set 调整后新的分级ID
     * @param DestLevelId 调整后新的分级ID
     */
    public void setDestLevelId(Long DestLevelId) {
        this.DestLevelId = DestLevelId;
    }

    public ModifyDSPAESTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDSPAESTaskResultRequest(ModifyDSPAESTaskResultRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.FieldResultId != null) {
            this.FieldResultId = new Long(source.FieldResultId);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.IsSetNonSensitiveField != null) {
            this.IsSetNonSensitiveField = new Boolean(source.IsSetNonSensitiveField);
        }
        if (source.DestRuleId != null) {
            this.DestRuleId = new Long(source.DestRuleId);
        }
        if (source.DestCategoryId != null) {
            this.DestCategoryId = new Long(source.DestCategoryId);
        }
        if (source.DestLevelId != null) {
            this.DestLevelId = new Long(source.DestLevelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "FieldResultId", this.FieldResultId);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "IsSetNonSensitiveField", this.IsSetNonSensitiveField);
        this.setParamSimple(map, prefix + "DestRuleId", this.DestRuleId);
        this.setParamSimple(map, prefix + "DestCategoryId", this.DestCategoryId);
        this.setParamSimple(map, prefix + "DestLevelId", this.DestLevelId);

    }
}

