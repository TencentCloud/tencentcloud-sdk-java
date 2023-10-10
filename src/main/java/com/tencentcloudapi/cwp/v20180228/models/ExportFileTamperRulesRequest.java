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

public class ExportFileTamperRulesRequest extends AbstractModel{

    /**
    * 过滤条件。
<li>RuleCategory- string- 规则类别  0=系统规则，1=用户规则</li>
<li>Name- String - 规则名称/li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 过滤条件。
<li>RuleCategory- string- 规则类别  0=系统规则，1=用户规则</li>
<li>Name- String - 规则名称/li> 
     * @return Filters 过滤条件。
<li>RuleCategory- string- 规则类别  0=系统规则，1=用户规则</li>
<li>Name- String - 规则名称/li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>RuleCategory- string- 规则类别  0=系统规则，1=用户规则</li>
<li>Name- String - 规则名称/li>
     * @param Filters 过滤条件。
<li>RuleCategory- string- 规则类别  0=系统规则，1=用户规则</li>
<li>Name- String - 规则名称/li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public ExportFileTamperRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportFileTamperRulesRequest(ExportFileTamperRulesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

