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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Literal extends AbstractModel {

    /**
    * <p>数值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>类型</p><p>枚举值：</p><ul><li>integer： 整数类型</li></ul>
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
     * Get <p>数值</p> 
     * @return Value <p>数值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>数值</p>
     * @param Value <p>数值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>类型</p><p>枚举值：</p><ul><li>integer： 整数类型</li></ul> 
     * @return DataType <p>类型</p><p>枚举值：</p><ul><li>integer： 整数类型</li></ul>
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set <p>类型</p><p>枚举值：</p><ul><li>integer： 整数类型</li></ul>
     * @param DataType <p>类型</p><p>枚举值：</p><ul><li>integer： 整数类型</li></ul>
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    public Literal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Literal(Literal source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

