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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterCustomParameters extends AbstractModel {

    /**
    * 占位符名称
入参限制：长度 1-256
适用分支：腾讯云分支（IsCloud=true）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 一个或多个取值（多个取值以逗号拼接替换占位符）
入参限制：每个元素长度 1-256
适用分支：腾讯云分支（IsCloud=true）
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 是否精确匹配
默认值：false
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
     * Get 占位符名称
入参限制：长度 1-256
适用分支：腾讯云分支（IsCloud=true） 
     * @return Name 占位符名称
入参限制：长度 1-256
适用分支：腾讯云分支（IsCloud=true）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 占位符名称
入参限制：长度 1-256
适用分支：腾讯云分支（IsCloud=true）
     * @param Name 占位符名称
入参限制：长度 1-256
适用分支：腾讯云分支（IsCloud=true）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 一个或多个取值（多个取值以逗号拼接替换占位符）
入参限制：每个元素长度 1-256
适用分支：腾讯云分支（IsCloud=true） 
     * @return Values 一个或多个取值（多个取值以逗号拼接替换占位符）
入参限制：每个元素长度 1-256
适用分支：腾讯云分支（IsCloud=true）
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 一个或多个取值（多个取值以逗号拼接替换占位符）
入参限制：每个元素长度 1-256
适用分支：腾讯云分支（IsCloud=true）
     * @param Values 一个或多个取值（多个取值以逗号拼接替换占位符）
入参限制：每个元素长度 1-256
适用分支：腾讯云分支（IsCloud=true）
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 是否精确匹配
默认值：false 
     * @return ExactMatch 是否精确匹配
默认值：false
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set 是否精确匹配
默认值：false
     * @param ExactMatch 是否精确匹配
默认值：false
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public ClusterCustomParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterCustomParameters(ClusterCustomParameters source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);

    }
}

