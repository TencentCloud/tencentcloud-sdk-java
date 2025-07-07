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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChartNameValue extends AbstractModel {

    /**
    * 图表项名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 图表项值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 图表项名称 
     * @return Name 图表项名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 图表项名称
     * @param Name 图表项名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 图表项值 
     * @return Value 图表项值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 图表项值
     * @param Value 图表项值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public ChartNameValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChartNameValue(ChartNameValue source) {
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

