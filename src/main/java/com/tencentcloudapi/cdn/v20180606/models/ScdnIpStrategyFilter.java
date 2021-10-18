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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnIpStrategyFilter extends AbstractModel{

    /**
    * 过滤字段名，支持domain, ip
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤字段值
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get 过滤字段名，支持domain, ip 
     * @return Name 过滤字段名，支持domain, ip
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤字段名，支持domain, ip
     * @param Name 过滤字段名，支持domain, ip
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤字段值 
     * @return Value 过滤字段值
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 过滤字段值
     * @param Value 过滤字段值
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1 
     * @return Fuzzy 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1
     * @param Fuzzy 是否启用模糊查询，仅支持过滤字段名为domain。
模糊查询时，Value长度最大为1
     */
    public void setFuzzy(Boolean Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    public ScdnIpStrategyFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnIpStrategyFilter(ScdnIpStrategyFilter source) {
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

