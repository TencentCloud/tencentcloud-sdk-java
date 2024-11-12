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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefaultParameterConf extends AbstractModel {

    /**
    * 参数名。
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
    * 参数默认值。
    */
    @SerializedName("ParameterValue")
    @Expose
    private String ParameterValue;

    /**
    * 参数描述。
    */
    @SerializedName("ParameterDescription")
    @Expose
    private String ParameterDescription;

    /**
     * Get 参数名。 
     * @return ParameterName 参数名。
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set 参数名。
     * @param ParameterName 参数名。
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    /**
     * Get 参数默认值。 
     * @return ParameterValue 参数默认值。
     */
    public String getParameterValue() {
        return this.ParameterValue;
    }

    /**
     * Set 参数默认值。
     * @param ParameterValue 参数默认值。
     */
    public void setParameterValue(String ParameterValue) {
        this.ParameterValue = ParameterValue;
    }

    /**
     * Get 参数描述。 
     * @return ParameterDescription 参数描述。
     */
    public String getParameterDescription() {
        return this.ParameterDescription;
    }

    /**
     * Set 参数描述。
     * @param ParameterDescription 参数描述。
     */
    public void setParameterDescription(String ParameterDescription) {
        this.ParameterDescription = ParameterDescription;
    }

    public DefaultParameterConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultParameterConf(DefaultParameterConf source) {
        if (source.ParameterName != null) {
            this.ParameterName = new String(source.ParameterName);
        }
        if (source.ParameterValue != null) {
            this.ParameterValue = new String(source.ParameterValue);
        }
        if (source.ParameterDescription != null) {
            this.ParameterDescription = new String(source.ParameterDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParameterName", this.ParameterName);
        this.setParamSimple(map, prefix + "ParameterValue", this.ParameterValue);
        this.setParamSimple(map, prefix + "ParameterDescription", this.ParameterDescription);

    }
}

