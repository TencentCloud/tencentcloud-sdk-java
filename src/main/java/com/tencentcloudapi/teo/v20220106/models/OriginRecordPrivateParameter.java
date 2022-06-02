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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginRecordPrivateParameter extends AbstractModel{

    /**
    * 私有鉴权参数名称：
"AccessKeyId"：Access Key ID
"SecretAccessKey"：Secret Access Key
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 私有鉴权参数数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 私有鉴权参数名称：
"AccessKeyId"：Access Key ID
"SecretAccessKey"：Secret Access Key 
     * @return Name 私有鉴权参数名称：
"AccessKeyId"：Access Key ID
"SecretAccessKey"：Secret Access Key
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 私有鉴权参数名称：
"AccessKeyId"：Access Key ID
"SecretAccessKey"：Secret Access Key
     * @param Name 私有鉴权参数名称：
"AccessKeyId"：Access Key ID
"SecretAccessKey"：Secret Access Key
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 私有鉴权参数数值 
     * @return Value 私有鉴权参数数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 私有鉴权参数数值
     * @param Value 私有鉴权参数数值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public OriginRecordPrivateParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginRecordPrivateParameter(OriginRecordPrivateParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
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

