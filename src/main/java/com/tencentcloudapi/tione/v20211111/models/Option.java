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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Option extends AbstractModel {

    /**
    * 指标名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 指标值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 指标名 
     * @return Name 指标名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指标名
     * @param Name 指标名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 指标值 
     * @return Value 指标值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 指标值
     * @param Value 指标值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public Option() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Option(Option source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
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

