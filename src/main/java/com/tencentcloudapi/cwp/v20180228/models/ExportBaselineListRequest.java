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

public class ExportBaselineListRequest extends AbstractModel{

    /**
    * 过滤条件：
<li>StrategyId- Uint64 - 基线策略id</li>
<li>Status - Uint64 - 事件状态：0-未通过，1-忽略，3-通过，5-检测中</li>
<li>BaselineName  - String - 基线名称</li>
<li>AliasName- String - 服务器名称/服务器ip</li>
<li>Uuid- String - 主机uuid</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 已废弃
    */
    @SerializedName("IfDetail")
    @Expose
    private Long IfDetail;

    /**
     * Get 过滤条件：
<li>StrategyId- Uint64 - 基线策略id</li>
<li>Status - Uint64 - 事件状态：0-未通过，1-忽略，3-通过，5-检测中</li>
<li>BaselineName  - String - 基线名称</li>
<li>AliasName- String - 服务器名称/服务器ip</li>
<li>Uuid- String - 主机uuid</li> 
     * @return Filters 过滤条件：
<li>StrategyId- Uint64 - 基线策略id</li>
<li>Status - Uint64 - 事件状态：0-未通过，1-忽略，3-通过，5-检测中</li>
<li>BaselineName  - String - 基线名称</li>
<li>AliasName- String - 服务器名称/服务器ip</li>
<li>Uuid- String - 主机uuid</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件：
<li>StrategyId- Uint64 - 基线策略id</li>
<li>Status - Uint64 - 事件状态：0-未通过，1-忽略，3-通过，5-检测中</li>
<li>BaselineName  - String - 基线名称</li>
<li>AliasName- String - 服务器名称/服务器ip</li>
<li>Uuid- String - 主机uuid</li>
     * @param Filters 过滤条件：
<li>StrategyId- Uint64 - 基线策略id</li>
<li>Status - Uint64 - 事件状态：0-未通过，1-忽略，3-通过，5-检测中</li>
<li>BaselineName  - String - 基线名称</li>
<li>AliasName- String - 服务器名称/服务器ip</li>
<li>Uuid- String - 主机uuid</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 已废弃 
     * @return IfDetail 已废弃
     */
    public Long getIfDetail() {
        return this.IfDetail;
    }

    /**
     * Set 已废弃
     * @param IfDetail 已废弃
     */
    public void setIfDetail(Long IfDetail) {
        this.IfDetail = IfDetail;
    }

    public ExportBaselineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportBaselineListRequest(ExportBaselineListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.IfDetail != null) {
            this.IfDetail = new Long(source.IfDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IfDetail", this.IfDetail);

    }
}

