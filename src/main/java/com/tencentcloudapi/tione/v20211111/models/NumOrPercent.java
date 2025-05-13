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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NumOrPercent extends AbstractModel {

    /**
    * Num,Percent ,分别表示数量和百分比，默认为 Num
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get Num,Percent ,分别表示数量和百分比，默认为 Num 
     * @return Type Num,Percent ,分别表示数量和百分比，默认为 Num
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Num,Percent ,分别表示数量和百分比，默认为 Num
     * @param Type Num,Percent ,分别表示数量和百分比，默认为 Num
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数值 
     * @return Value 数值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 数值
     * @param Value 数值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public NumOrPercent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NumOrPercent(NumOrPercent source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

