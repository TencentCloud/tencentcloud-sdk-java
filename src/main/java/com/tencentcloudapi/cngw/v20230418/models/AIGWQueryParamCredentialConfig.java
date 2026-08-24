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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWQueryParamCredentialConfig extends AbstractModel {

    /**
    * <p>参数名</p>
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * <p>参数值</p>
    */
    @SerializedName("ParamValue")
    @Expose
    private String ParamValue;

    /**
     * Get <p>参数名</p> 
     * @return ParamName <p>参数名</p>
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set <p>参数名</p>
     * @param ParamName <p>参数名</p>
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get <p>参数值</p> 
     * @return ParamValue <p>参数值</p>
     */
    public String getParamValue() {
        return this.ParamValue;
    }

    /**
     * Set <p>参数值</p>
     * @param ParamValue <p>参数值</p>
     */
    public void setParamValue(String ParamValue) {
        this.ParamValue = ParamValue;
    }

    public AIGWQueryParamCredentialConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWQueryParamCredentialConfig(AIGWQueryParamCredentialConfig source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamValue != null) {
            this.ParamValue = new String(source.ParamValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamValue", this.ParamValue);

    }
}

