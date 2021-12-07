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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceBenchmarkStandard extends AbstractModel{

    /**
    * 合规标准的ID
    */
    @SerializedName("StandardId")
    @Expose
    private Long StandardId;

    /**
    * 合规标准的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合规标准包含的数目
    */
    @SerializedName("PolicyItemCount")
    @Expose
    private Long PolicyItemCount;

    /**
    * 是否启用此标准
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 标准的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 合规标准的ID 
     * @return StandardId 合规标准的ID
     */
    public Long getStandardId() {
        return this.StandardId;
    }

    /**
     * Set 合规标准的ID
     * @param StandardId 合规标准的ID
     */
    public void setStandardId(Long StandardId) {
        this.StandardId = StandardId;
    }

    /**
     * Get 合规标准的名称 
     * @return Name 合规标准的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 合规标准的名称
     * @param Name 合规标准的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合规标准包含的数目 
     * @return PolicyItemCount 合规标准包含的数目
     */
    public Long getPolicyItemCount() {
        return this.PolicyItemCount;
    }

    /**
     * Set 合规标准包含的数目
     * @param PolicyItemCount 合规标准包含的数目
     */
    public void setPolicyItemCount(Long PolicyItemCount) {
        this.PolicyItemCount = PolicyItemCount;
    }

    /**
     * Get 是否启用此标准 
     * @return Enabled 是否启用此标准
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用此标准
     * @param Enabled 是否启用此标准
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 标准的描述 
     * @return Description 标准的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 标准的描述
     * @param Description 标准的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ComplianceBenchmarkStandard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceBenchmarkStandard(ComplianceBenchmarkStandard source) {
        if (source.StandardId != null) {
            this.StandardId = new Long(source.StandardId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PolicyItemCount != null) {
            this.PolicyItemCount = new Long(source.PolicyItemCount);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StandardId", this.StandardId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PolicyItemCount", this.PolicyItemCount);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

