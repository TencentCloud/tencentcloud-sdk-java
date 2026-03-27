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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * <p>过滤字段。</p><p>枚举值：</p><ul><li>InstanceId： 实例 ID。</li><li>InstanceName： 实例名称。</li><li>TagKey： 标签键。</li><li>InstanceTags： 实例标签键值，标签key值&amp;标签value值。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>过滤字段的值。</p>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * <p>精确匹配开关。</p><ul><li>false：关闭。</li><li>true：开启。</li></ul>
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
     * Get <p>过滤字段。</p><p>枚举值：</p><ul><li>InstanceId： 实例 ID。</li><li>InstanceName： 实例名称。</li><li>TagKey： 标签键。</li><li>InstanceTags： 实例标签键值，标签key值&amp;标签value值。</li></ul> 
     * @return Name <p>过滤字段。</p><p>枚举值：</p><ul><li>InstanceId： 实例 ID。</li><li>InstanceName： 实例名称。</li><li>TagKey： 标签键。</li><li>InstanceTags： 实例标签键值，标签key值&amp;标签value值。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>过滤字段。</p><p>枚举值：</p><ul><li>InstanceId： 实例 ID。</li><li>InstanceName： 实例名称。</li><li>TagKey： 标签键。</li><li>InstanceTags： 实例标签键值，标签key值&amp;标签value值。</li></ul>
     * @param Name <p>过滤字段。</p><p>枚举值：</p><ul><li>InstanceId： 实例 ID。</li><li>InstanceName： 实例名称。</li><li>TagKey： 标签键。</li><li>InstanceTags： 实例标签键值，标签key值&amp;标签value值。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>过滤字段的值。</p> 
     * @return Values <p>过滤字段的值。</p>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>过滤字段的值。</p>
     * @param Values <p>过滤字段的值。</p>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get <p>精确匹配开关。</p><ul><li>false：关闭。</li><li>true：开启。</li></ul> 
     * @return ExactMatch <p>精确匹配开关。</p><ul><li>false：关闭。</li><li>true：开启。</li></ul>
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set <p>精确匹配开关。</p><ul><li>false：关闭。</li><li>true：开启。</li></ul>
     * @param ExactMatch <p>精确匹配开关。</p><ul><li>false：关闭。</li><li>true：开启。</li></ul>
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
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

