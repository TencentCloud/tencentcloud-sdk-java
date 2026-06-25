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

public class QueryFilter extends AbstractModel {

    /**
    * 字段值列表，与 Names 一一对应。InstanceId/ClusterId 为精确匹配，InstanceName 默认模糊匹配
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 搜索字段名称列表，仅支持以下 3 个字段（不区分大小写，多个值为 OR 关系）：ClusterId（按集群 ID 过滤，精确匹配）、InstanceId（按实例 ID 反查所属集群）、InstanceName（按实例名称反查所属集群，默认 LIKE 模糊匹配，ExactMatch=true 时精确匹配）。InstanceId 与 InstanceName 同时传入时取交集（AND 语义）。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 是否精确匹配。仅对 InstanceName 生效：true 精确匹配，false（默认）LIKE 模糊匹配。
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
    * 搜索字段名称（单个字段模式，与 Names 二选一）。支持：ClusterId、InstanceId、InstanceName
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 操作符（预留字段，当前未启用）。可选值：>、>=、!=、=、<、<=
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 字段值列表，与 Names 一一对应。InstanceId/ClusterId 为精确匹配，InstanceName 默认模糊匹配 
     * @return Values 字段值列表，与 Names 一一对应。InstanceId/ClusterId 为精确匹配，InstanceName 默认模糊匹配
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 字段值列表，与 Names 一一对应。InstanceId/ClusterId 为精确匹配，InstanceName 默认模糊匹配
     * @param Values 字段值列表，与 Names 一一对应。InstanceId/ClusterId 为精确匹配，InstanceName 默认模糊匹配
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 搜索字段名称列表，仅支持以下 3 个字段（不区分大小写，多个值为 OR 关系）：ClusterId（按集群 ID 过滤，精确匹配）、InstanceId（按实例 ID 反查所属集群）、InstanceName（按实例名称反查所属集群，默认 LIKE 模糊匹配，ExactMatch=true 时精确匹配）。InstanceId 与 InstanceName 同时传入时取交集（AND 语义）。 
     * @return Names 搜索字段名称列表，仅支持以下 3 个字段（不区分大小写，多个值为 OR 关系）：ClusterId（按集群 ID 过滤，精确匹配）、InstanceId（按实例 ID 反查所属集群）、InstanceName（按实例名称反查所属集群，默认 LIKE 模糊匹配，ExactMatch=true 时精确匹配）。InstanceId 与 InstanceName 同时传入时取交集（AND 语义）。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 搜索字段名称列表，仅支持以下 3 个字段（不区分大小写，多个值为 OR 关系）：ClusterId（按集群 ID 过滤，精确匹配）、InstanceId（按实例 ID 反查所属集群）、InstanceName（按实例名称反查所属集群，默认 LIKE 模糊匹配，ExactMatch=true 时精确匹配）。InstanceId 与 InstanceName 同时传入时取交集（AND 语义）。
     * @param Names 搜索字段名称列表，仅支持以下 3 个字段（不区分大小写，多个值为 OR 关系）：ClusterId（按集群 ID 过滤，精确匹配）、InstanceId（按实例 ID 反查所属集群）、InstanceName（按实例名称反查所属集群，默认 LIKE 模糊匹配，ExactMatch=true 时精确匹配）。InstanceId 与 InstanceName 同时传入时取交集（AND 语义）。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 是否精确匹配。仅对 InstanceName 生效：true 精确匹配，false（默认）LIKE 模糊匹配。 
     * @return ExactMatch 是否精确匹配。仅对 InstanceName 生效：true 精确匹配，false（默认）LIKE 模糊匹配。
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set 是否精确匹配。仅对 InstanceName 生效：true 精确匹配，false（默认）LIKE 模糊匹配。
     * @param ExactMatch 是否精确匹配。仅对 InstanceName 生效：true 精确匹配，false（默认）LIKE 模糊匹配。
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    /**
     * Get 搜索字段名称（单个字段模式，与 Names 二选一）。支持：ClusterId、InstanceId、InstanceName 
     * @return Name 搜索字段名称（单个字段模式，与 Names 二选一）。支持：ClusterId、InstanceId、InstanceName
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 搜索字段名称（单个字段模式，与 Names 二选一）。支持：ClusterId、InstanceId、InstanceName
     * @param Name 搜索字段名称（单个字段模式，与 Names 二选一）。支持：ClusterId、InstanceId、InstanceName
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 操作符（预留字段，当前未启用）。可选值：>、>=、!=、=、<、<= 
     * @return Operator 操作符（预留字段，当前未启用）。可选值：>、>=、!=、=、<、<=
     * @deprecated
     */
    @Deprecated
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作符（预留字段，当前未启用）。可选值：>、>=、!=、=、<、<=
     * @param Operator 操作符（预留字段，当前未启用）。可选值：>、>=、!=、=、<、<=
     * @deprecated
     */
    @Deprecated
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public QueryFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFilter(QueryFilter source) {
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new Boolean(source.ExactMatch);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

