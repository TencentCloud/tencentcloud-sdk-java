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

public class ModifyDSPADiscoveryRuleRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 规则名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则描述，最大长度为1024个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * RDB类敏感数据识别规则
    */
    @SerializedName("RDBRules")
    @Expose
    private ScanTaskRDBRules RDBRules;

    /**
    * COS类敏感数据识别规则
    */
    @SerializedName("COSRules")
    @Expose
    private ScanTaskCOSRules COSRules;

    /**
    * 规则状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get 规则名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复 
     * @return Name 规则名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     * @param Name 规则名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则描述，最大长度为1024个字符 
     * @return Description 规则描述，最大长度为1024个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述，最大长度为1024个字符
     * @param Description 规则描述，最大长度为1024个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get RDB类敏感数据识别规则 
     * @return RDBRules RDB类敏感数据识别规则
     */
    public ScanTaskRDBRules getRDBRules() {
        return this.RDBRules;
    }

    /**
     * Set RDB类敏感数据识别规则
     * @param RDBRules RDB类敏感数据识别规则
     */
    public void setRDBRules(ScanTaskRDBRules RDBRules) {
        this.RDBRules = RDBRules;
    }

    /**
     * Get COS类敏感数据识别规则 
     * @return COSRules COS类敏感数据识别规则
     */
    public ScanTaskCOSRules getCOSRules() {
        return this.COSRules;
    }

    /**
     * Set COS类敏感数据识别规则
     * @param COSRules COS类敏感数据识别规则
     */
    public void setCOSRules(ScanTaskCOSRules COSRules) {
        this.COSRules = COSRules;
    }

    /**
     * Get 规则状态 
     * @return Status 规则状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态
     * @param Status 规则状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyDSPADiscoveryRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDSPADiscoveryRuleRequest(ModifyDSPADiscoveryRuleRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RDBRules != null) {
            this.RDBRules = new ScanTaskRDBRules(source.RDBRules);
        }
        if (source.COSRules != null) {
            this.COSRules = new ScanTaskCOSRules(source.COSRules);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "RDBRules.", this.RDBRules);
        this.setParamObj(map, prefix + "COSRules.", this.COSRules);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

