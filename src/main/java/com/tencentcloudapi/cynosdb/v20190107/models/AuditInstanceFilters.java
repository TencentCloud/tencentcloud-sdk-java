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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstanceFilters extends AbstractModel {

    /**
    * 过滤条件值。支持InstanceId-实例ID，InstanceName-实例名称，ProjectId-项目ID，TagKey-标签键，Tag-标签（以竖线分割，例：Tagkey|Tagvalue）。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * true表示精确查找，false表示模糊匹配。
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
    * 筛选值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 过滤条件值。支持InstanceId-实例ID，InstanceName-实例名称，ProjectId-项目ID，TagKey-标签键，Tag-标签（以竖线分割，例：Tagkey|Tagvalue）。 
     * @return Name 过滤条件值。支持InstanceId-实例ID，InstanceName-实例名称，ProjectId-项目ID，TagKey-标签键，Tag-标签（以竖线分割，例：Tagkey|Tagvalue）。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤条件值。支持InstanceId-实例ID，InstanceName-实例名称，ProjectId-项目ID，TagKey-标签键，Tag-标签（以竖线分割，例：Tagkey|Tagvalue）。
     * @param Name 过滤条件值。支持InstanceId-实例ID，InstanceName-实例名称，ProjectId-项目ID，TagKey-标签键，Tag-标签（以竖线分割，例：Tagkey|Tagvalue）。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get true表示精确查找，false表示模糊匹配。 
     * @return ExactMatch true表示精确查找，false表示模糊匹配。
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set true表示精确查找，false表示模糊匹配。
     * @param ExactMatch true表示精确查找，false表示模糊匹配。
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    /**
     * Get 筛选值 
     * @return Values 筛选值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 筛选值
     * @param Values 筛选值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public AuditInstanceFilters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstanceFilters(AuditInstanceFilters source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new Boolean(source.ExactMatch);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

