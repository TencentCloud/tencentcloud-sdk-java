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

public class CreateDSPAComplianceGroupRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 合规组名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合规组描述，最大长度为1024个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 合规组规则配置（参数已废弃，请传空数组）
    */
    @SerializedName("ComplianceGroupRules")
    @Expose
    private ComplianceGroupRuleIdInfo [] ComplianceGroupRules;

    /**
    * 分级组ID，默认值为1，新增参数，可选
    */
    @SerializedName("LevelGroupId")
    @Expose
    private Long LevelGroupId;

    /**
    * 1代表模版开启，0代表模版关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 该complianceId的开启状态将被关闭
    */
    @SerializedName("CloseComplianceId")
    @Expose
    private Long CloseComplianceId;

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
     * Get 合规组名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复 
     * @return Name 合规组名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 合规组名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     * @param Name 合规组名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合规组描述，最大长度为1024个字符 
     * @return Description 合规组描述，最大长度为1024个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 合规组描述，最大长度为1024个字符
     * @param Description 合规组描述，最大长度为1024个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 合规组规则配置（参数已废弃，请传空数组） 
     * @return ComplianceGroupRules 合规组规则配置（参数已废弃，请传空数组）
     */
    public ComplianceGroupRuleIdInfo [] getComplianceGroupRules() {
        return this.ComplianceGroupRules;
    }

    /**
     * Set 合规组规则配置（参数已废弃，请传空数组）
     * @param ComplianceGroupRules 合规组规则配置（参数已废弃，请传空数组）
     */
    public void setComplianceGroupRules(ComplianceGroupRuleIdInfo [] ComplianceGroupRules) {
        this.ComplianceGroupRules = ComplianceGroupRules;
    }

    /**
     * Get 分级组ID，默认值为1，新增参数，可选 
     * @return LevelGroupId 分级组ID，默认值为1，新增参数，可选
     */
    public Long getLevelGroupId() {
        return this.LevelGroupId;
    }

    /**
     * Set 分级组ID，默认值为1，新增参数，可选
     * @param LevelGroupId 分级组ID，默认值为1，新增参数，可选
     */
    public void setLevelGroupId(Long LevelGroupId) {
        this.LevelGroupId = LevelGroupId;
    }

    /**
     * Get 1代表模版开启，0代表模版关闭 
     * @return Status 1代表模版开启，0代表模版关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1代表模版开启，0代表模版关闭
     * @param Status 1代表模版开启，0代表模版关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 该complianceId的开启状态将被关闭 
     * @return CloseComplianceId 该complianceId的开启状态将被关闭
     */
    public Long getCloseComplianceId() {
        return this.CloseComplianceId;
    }

    /**
     * Set 该complianceId的开启状态将被关闭
     * @param CloseComplianceId 该complianceId的开启状态将被关闭
     */
    public void setCloseComplianceId(Long CloseComplianceId) {
        this.CloseComplianceId = CloseComplianceId;
    }

    public CreateDSPAComplianceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPAComplianceGroupRequest(CreateDSPAComplianceGroupRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ComplianceGroupRules != null) {
            this.ComplianceGroupRules = new ComplianceGroupRuleIdInfo[source.ComplianceGroupRules.length];
            for (int i = 0; i < source.ComplianceGroupRules.length; i++) {
                this.ComplianceGroupRules[i] = new ComplianceGroupRuleIdInfo(source.ComplianceGroupRules[i]);
            }
        }
        if (source.LevelGroupId != null) {
            this.LevelGroupId = new Long(source.LevelGroupId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CloseComplianceId != null) {
            this.CloseComplianceId = new Long(source.CloseComplianceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ComplianceGroupRules.", this.ComplianceGroupRules);
        this.setParamSimple(map, prefix + "LevelGroupId", this.LevelGroupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CloseComplianceId", this.CloseComplianceId);

    }
}

