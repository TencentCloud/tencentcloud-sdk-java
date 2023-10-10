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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportFileTamperEventsRequest extends AbstractModel{

    /**
    * 过滤条件。
<li>Status - String - 是否必填：否 - 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略</li>
<li>ModifyTime - String - 是否必填：否 - 最近发生时间</li>
<li>Uuid- String - 是否必填：否 - 主机uuid查询</li>
<li>RuleCategory- string - 是否必填：否 - 规则类别 0 系统规则 1 自定义规则</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 需要导出的字段
    */
    @SerializedName("Fileds")
    @Expose
    private String [] Fileds;

    /**
    * 需要导出的字段
    */
    @SerializedName("Fields")
    @Expose
    private String Fields;

    /**
     * Get 过滤条件。
<li>Status - String - 是否必填：否 - 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略</li>
<li>ModifyTime - String - 是否必填：否 - 最近发生时间</li>
<li>Uuid- String - 是否必填：否 - 主机uuid查询</li>
<li>RuleCategory- string - 是否必填：否 - 规则类别 0 系统规则 1 自定义规则</li> 
     * @return Filters 过滤条件。
<li>Status - String - 是否必填：否 - 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略</li>
<li>ModifyTime - String - 是否必填：否 - 最近发生时间</li>
<li>Uuid- String - 是否必填：否 - 主机uuid查询</li>
<li>RuleCategory- string - 是否必填：否 - 规则类别 0 系统规则 1 自定义规则</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Status - String - 是否必填：否 - 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略</li>
<li>ModifyTime - String - 是否必填：否 - 最近发生时间</li>
<li>Uuid- String - 是否必填：否 - 主机uuid查询</li>
<li>RuleCategory- string - 是否必填：否 - 规则类别 0 系统规则 1 自定义规则</li>
     * @param Filters 过滤条件。
<li>Status - String - 是否必填：否 - 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略</li>
<li>ModifyTime - String - 是否必填：否 - 最近发生时间</li>
<li>Uuid- String - 是否必填：否 - 主机uuid查询</li>
<li>RuleCategory- string - 是否必填：否 - 规则类别 0 系统规则 1 自定义规则</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 需要导出的字段 
     * @return Fileds 需要导出的字段
     * @deprecated
     */
    @Deprecated
    public String [] getFileds() {
        return this.Fileds;
    }

    /**
     * Set 需要导出的字段
     * @param Fileds 需要导出的字段
     * @deprecated
     */
    @Deprecated
    public void setFileds(String [] Fileds) {
        this.Fileds = Fileds;
    }

    /**
     * Get 需要导出的字段 
     * @return Fields 需要导出的字段
     */
    public String getFields() {
        return this.Fields;
    }

    /**
     * Set 需要导出的字段
     * @param Fields 需要导出的字段
     */
    public void setFields(String Fields) {
        this.Fields = Fields;
    }

    public ExportFileTamperEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportFileTamperEventsRequest(ExportFileTamperEventsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Fileds != null) {
            this.Fileds = new String[source.Fileds.length];
            for (int i = 0; i < source.Fileds.length; i++) {
                this.Fileds[i] = new String(source.Fileds[i]);
            }
        }
        if (source.Fields != null) {
            this.Fields = new String(source.Fields);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Fileds.", this.Fileds);
        this.setParamSimple(map, prefix + "Fields", this.Fields);

    }
}

