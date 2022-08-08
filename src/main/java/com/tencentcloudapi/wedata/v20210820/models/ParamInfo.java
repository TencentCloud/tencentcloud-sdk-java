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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamInfo extends AbstractModel{

    /**
    * 参数名
    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * 参数值
    */
    @SerializedName("ParamValue")
    @Expose
    private String ParamValue;

    /**
     * Get 参数名 
     * @return ParamKey 参数名
     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set 参数名
     * @param ParamKey 参数名
     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get 参数值 
     * @return ParamValue 参数值
     */
    public String getParamValue() {
        return this.ParamValue;
    }

    /**
     * Set 参数值
     * @param ParamValue 参数值
     */
    public void setParamValue(String ParamValue) {
        this.ParamValue = ParamValue;
    }

    public ParamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamInfo(ParamInfo source) {
        if (source.ParamKey != null) {
            this.ParamKey = new String(source.ParamKey);
        }
        if (source.ParamValue != null) {
            this.ParamValue = new String(source.ParamValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamKey", this.ParamKey);
        this.setParamSimple(map, prefix + "ParamValue", this.ParamValue);

    }
}

