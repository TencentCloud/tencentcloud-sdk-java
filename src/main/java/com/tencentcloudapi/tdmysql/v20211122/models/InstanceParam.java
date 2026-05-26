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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceParam extends AbstractModel {

    /**
    * 配置参数key
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * 配置参数value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 配置参数key 
     * @return Param 配置参数key
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set 配置参数key
     * @param Param 配置参数key
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get 配置参数value 
     * @return Value 配置参数value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 配置参数value
     * @param Value 配置参数value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public InstanceParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceParam(InstanceParam source) {
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

