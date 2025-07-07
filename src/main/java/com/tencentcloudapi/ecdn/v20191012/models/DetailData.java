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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailData extends AbstractModel {

    /**
    * 数据类型的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据值
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get 数据类型的名称 
     * @return Name 数据类型的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据类型的名称
     * @param Name 数据类型的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据值 
     * @return Value 数据值
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 数据值
     * @param Value 数据值
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public DetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailData(DetailData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
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

