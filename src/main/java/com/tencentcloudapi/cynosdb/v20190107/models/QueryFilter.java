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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFilter extends AbstractModel{

    /**
    * 搜索字段，目前支持："InstanceId", "ProjectId", "InstanceName", "Vip"
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 搜索字符串
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 是否精确匹配
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
    * 搜索字段
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 搜索字段，目前支持："InstanceId", "ProjectId", "InstanceName", "Vip" 
     * @return Names 搜索字段，目前支持："InstanceId", "ProjectId", "InstanceName", "Vip"
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 搜索字段，目前支持："InstanceId", "ProjectId", "InstanceName", "Vip"
     * @param Names 搜索字段，目前支持："InstanceId", "ProjectId", "InstanceName", "Vip"
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 搜索字符串 
     * @return Values 搜索字符串
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 搜索字符串
     * @param Values 搜索字符串
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 是否精确匹配 
     * @return ExactMatch 是否精确匹配
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set 是否精确匹配
     * @param ExactMatch 是否精确匹配
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    /**
     * Get 搜索字段 
     * @return Name 搜索字段
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 搜索字段
     * @param Name 搜索字段
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public QueryFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFilter(QueryFilter source) {
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new Boolean(source.ExactMatch);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

