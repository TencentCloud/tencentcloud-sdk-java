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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadLetterConfig extends AbstractModel {

    /**
    * 死信队列模式
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 死信队列名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 死信队列主题模式的标签形式
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
     * Get 死信队列模式 
     * @return Type 死信队列模式
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 死信队列模式
     * @param Type 死信队列模式
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 死信队列名称 
     * @return Name 死信队列名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 死信队列名称
     * @param Name 死信队列名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 死信队列主题模式的标签形式 
     * @return FilterType 死信队列主题模式的标签形式
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 死信队列主题模式的标签形式
     * @param FilterType 死信队列主题模式的标签形式
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    public DeadLetterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadLetterConfig(DeadLetterConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);

    }
}

