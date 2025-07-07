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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocFilterFlag extends AbstractModel {

    /**
    * 标识位
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * 标识值
    */
    @SerializedName("Value")
    @Expose
    private Boolean Value;

    /**
     * Get 标识位 
     * @return Flag 标识位
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set 标识位
     * @param Flag 标识位
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 标识值 
     * @return Value 标识值
     */
    public Boolean getValue() {
        return this.Value;
    }

    /**
     * Set 标识值
     * @param Value 标识值
     */
    public void setValue(Boolean Value) {
        this.Value = Value;
    }

    public DocFilterFlag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocFilterFlag(DocFilterFlag source) {
        if (source.Flag != null) {
            this.Flag = new String(source.Flag);
        }
        if (source.Value != null) {
            this.Value = new Boolean(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

