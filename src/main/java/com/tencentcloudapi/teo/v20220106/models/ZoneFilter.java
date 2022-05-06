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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneFilter extends AbstractModel{

    /**
    * 过滤字段名，支持的列表如下：
- name: 站点名。
- status: 站点状态
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤字段值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 是否启用模糊查询，仅支持过滤字段名为name。模糊查询时，Values长度最大为1
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get 过滤字段名，支持的列表如下：
- name: 站点名。
- status: 站点状态 
     * @return Name 过滤字段名，支持的列表如下：
- name: 站点名。
- status: 站点状态
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤字段名，支持的列表如下：
- name: 站点名。
- status: 站点状态
     * @param Name 过滤字段名，支持的列表如下：
- name: 站点名。
- status: 站点状态
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤字段值 
     * @return Values 过滤字段值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤字段值
     * @param Values 过滤字段值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 是否启用模糊查询，仅支持过滤字段名为name。模糊查询时，Values长度最大为1 
     * @return Fuzzy 是否启用模糊查询，仅支持过滤字段名为name。模糊查询时，Values长度最大为1
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set 是否启用模糊查询，仅支持过滤字段名为name。模糊查询时，Values长度最大为1
     * @param Fuzzy 是否启用模糊查询，仅支持过滤字段名为name。模糊查询时，Values长度最大为1
     */
    public void setFuzzy(Boolean Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    public ZoneFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneFilter(ZoneFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
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
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);

    }
}

