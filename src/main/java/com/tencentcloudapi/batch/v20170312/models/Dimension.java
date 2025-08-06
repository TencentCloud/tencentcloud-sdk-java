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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Dimension extends AbstractModel {

    /**
    * 查询指标的维度名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 查询指标的维度值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 查询指标的维度名称 
     * @return Name 查询指标的维度名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 查询指标的维度名称
     * @param Name 查询指标的维度名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 查询指标的维度值 
     * @return Value 查询指标的维度值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 查询指标的维度值
     * @param Value 查询指标的维度值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public Dimension() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Dimension(Dimension source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

