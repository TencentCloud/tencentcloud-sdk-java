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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceFilter extends AbstractModel {

    /**
    * 过滤字段名，支持的列表如下：
- type：主资源类型，CDN。
- instanceId：IGTM实例ID。此为必传参数，未传将导致接口查询失败。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤字段值。

    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1，否则Value长度最大为5。(预留字段，暂未使用)
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get 过滤字段名，支持的列表如下：
- type：主资源类型，CDN。
- instanceId：IGTM实例ID。此为必传参数，未传将导致接口查询失败。 
     * @return Name 过滤字段名，支持的列表如下：
- type：主资源类型，CDN。
- instanceId：IGTM实例ID。此为必传参数，未传将导致接口查询失败。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤字段名，支持的列表如下：
- type：主资源类型，CDN。
- instanceId：IGTM实例ID。此为必传参数，未传将导致接口查询失败。
     * @param Name 过滤字段名，支持的列表如下：
- type：主资源类型，CDN。
- instanceId：IGTM实例ID。此为必传参数，未传将导致接口查询失败。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤字段值。
 
     * @return Value 过滤字段值。

     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 过滤字段值。

     * @param Value 过滤字段值。

     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1，否则Value长度最大为5。(预留字段，暂未使用) 
     * @return Fuzzy 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1，否则Value长度最大为5。(预留字段，暂未使用)
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1，否则Value长度最大为5。(预留字段，暂未使用)
     * @param Fuzzy 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1，否则Value长度最大为5。(预留字段，暂未使用)
     */
    public void setFuzzy(Boolean Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    public ResourceFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceFilter(ResourceFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
        if (source.Fuzzy != null) {
            this.Fuzzy = new Boolean(source.Fuzzy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);

    }
}

