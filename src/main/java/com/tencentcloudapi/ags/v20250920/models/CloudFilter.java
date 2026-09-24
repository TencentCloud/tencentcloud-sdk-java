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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudFilter extends AbstractModel {

    /**
    * <p>过滤字段名。DescribeRegistryList 支持 <code>name</code> / <code>search</code>（模糊搜索）与 <code>archived</code> / <code>status</code>（true / false / all）；DescribeRegistryRecordList 支持 <code>name</code> / <code>search</code>（模糊）、<code>descriptor-type</code>、<code>lifecycle-status</code>（精确）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>过滤字段候选值列表；至少 1 项。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get <p>过滤字段名。DescribeRegistryList 支持 <code>name</code> / <code>search</code>（模糊搜索）与 <code>archived</code> / <code>status</code>（true / false / all）；DescribeRegistryRecordList 支持 <code>name</code> / <code>search</code>（模糊）、<code>descriptor-type</code>、<code>lifecycle-status</code>（精确）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>过滤字段名。DescribeRegistryList 支持 <code>name</code> / <code>search</code>（模糊搜索）与 <code>archived</code> / <code>status</code>（true / false / all）；DescribeRegistryRecordList 支持 <code>name</code> / <code>search</code>（模糊）、<code>descriptor-type</code>、<code>lifecycle-status</code>（精确）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>过滤字段名。DescribeRegistryList 支持 <code>name</code> / <code>search</code>（模糊搜索）与 <code>archived</code> / <code>status</code>（true / false / all）；DescribeRegistryRecordList 支持 <code>name</code> / <code>search</code>（模糊）、<code>descriptor-type</code>、<code>lifecycle-status</code>（精确）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>过滤字段名。DescribeRegistryList 支持 <code>name</code> / <code>search</code>（模糊搜索）与 <code>archived</code> / <code>status</code>（true / false / all）；DescribeRegistryRecordList 支持 <code>name</code> / <code>search</code>（模糊）、<code>descriptor-type</code>、<code>lifecycle-status</code>（精确）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>过滤字段候选值列表；至少 1 项。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values <p>过滤字段候选值列表；至少 1 项。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>过滤字段候选值列表；至少 1 项。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values <p>过滤字段候选值列表；至少 1 项。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public CloudFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudFilter(CloudFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

