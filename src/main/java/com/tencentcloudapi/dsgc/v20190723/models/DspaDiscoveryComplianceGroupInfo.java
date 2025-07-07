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

public class DspaDiscoveryComplianceGroupInfo extends AbstractModel {

    /**
    * 合规组ID
    */
    @SerializedName("ComplianceGroupId")
    @Expose
    private Long ComplianceGroupId;

    /**
    * 合规组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合规组描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组
    */
    @SerializedName("ComplianceGroupType")
    @Expose
    private Long ComplianceGroupType;

    /**
    * 合规组对应的规则项
    */
    @SerializedName("ComplianceGroupRules")
    @Expose
    private DspaDiscoveryComplianceGroupRule [] ComplianceGroupRules;

    /**
    * 合规组对应的分级组ID
    */
    @SerializedName("LevelGroupId")
    @Expose
    private Long LevelGroupId;

    /**
    * 是否禁止使用（true，禁止使用，false，可以使用）
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * 是否别名
    */
    @SerializedName("IsAlias")
    @Expose
    private Boolean IsAlias;

    /**
    * 1代表模版开启，0代表模版关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 模版最后修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 合规组ID 
     * @return ComplianceGroupId 合规组ID
     */
    public Long getComplianceGroupId() {
        return this.ComplianceGroupId;
    }

    /**
     * Set 合规组ID
     * @param ComplianceGroupId 合规组ID
     */
    public void setComplianceGroupId(Long ComplianceGroupId) {
        this.ComplianceGroupId = ComplianceGroupId;
    }

    /**
     * Get 合规组名称 
     * @return Name 合规组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 合规组名称
     * @param Name 合规组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合规组描述信息 
     * @return Description 合规组描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 合规组描述信息
     * @param Description 合规组描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组 
     * @return ComplianceGroupType 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组
     */
    public Long getComplianceGroupType() {
        return this.ComplianceGroupType;
    }

    /**
     * Set 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组
     * @param ComplianceGroupType 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组
     */
    public void setComplianceGroupType(Long ComplianceGroupType) {
        this.ComplianceGroupType = ComplianceGroupType;
    }

    /**
     * Get 合规组对应的规则项 
     * @return ComplianceGroupRules 合规组对应的规则项
     */
    public DspaDiscoveryComplianceGroupRule [] getComplianceGroupRules() {
        return this.ComplianceGroupRules;
    }

    /**
     * Set 合规组对应的规则项
     * @param ComplianceGroupRules 合规组对应的规则项
     */
    public void setComplianceGroupRules(DspaDiscoveryComplianceGroupRule [] ComplianceGroupRules) {
        this.ComplianceGroupRules = ComplianceGroupRules;
    }

    /**
     * Get 合规组对应的分级组ID 
     * @return LevelGroupId 合规组对应的分级组ID
     */
    public Long getLevelGroupId() {
        return this.LevelGroupId;
    }

    /**
     * Set 合规组对应的分级组ID
     * @param LevelGroupId 合规组对应的分级组ID
     */
    public void setLevelGroupId(Long LevelGroupId) {
        this.LevelGroupId = LevelGroupId;
    }

    /**
     * Get 是否禁止使用（true，禁止使用，false，可以使用） 
     * @return Disabled 是否禁止使用（true，禁止使用，false，可以使用）
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 是否禁止使用（true，禁止使用，false，可以使用）
     * @param Disabled 是否禁止使用（true，禁止使用，false，可以使用）
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get 是否别名 
     * @return IsAlias 是否别名
     */
    public Boolean getIsAlias() {
        return this.IsAlias;
    }

    /**
     * Set 是否别名
     * @param IsAlias 是否别名
     */
    public void setIsAlias(Boolean IsAlias) {
        this.IsAlias = IsAlias;
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
     * Get 模版最后修改时间 
     * @return ModifyTime 模版最后修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 模版最后修改时间
     * @param ModifyTime 模版最后修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public DspaDiscoveryComplianceGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryComplianceGroupInfo(DspaDiscoveryComplianceGroupInfo source) {
        if (source.ComplianceGroupId != null) {
            this.ComplianceGroupId = new Long(source.ComplianceGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ComplianceGroupType != null) {
            this.ComplianceGroupType = new Long(source.ComplianceGroupType);
        }
        if (source.ComplianceGroupRules != null) {
            this.ComplianceGroupRules = new DspaDiscoveryComplianceGroupRule[source.ComplianceGroupRules.length];
            for (int i = 0; i < source.ComplianceGroupRules.length; i++) {
                this.ComplianceGroupRules[i] = new DspaDiscoveryComplianceGroupRule(source.ComplianceGroupRules[i]);
            }
        }
        if (source.LevelGroupId != null) {
            this.LevelGroupId = new Long(source.LevelGroupId);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
        if (source.IsAlias != null) {
            this.IsAlias = new Boolean(source.IsAlias);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceGroupId", this.ComplianceGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ComplianceGroupType", this.ComplianceGroupType);
        this.setParamArrayObj(map, prefix + "ComplianceGroupRules.", this.ComplianceGroupRules);
        this.setParamSimple(map, prefix + "LevelGroupId", this.LevelGroupId);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "IsAlias", this.IsAlias);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

