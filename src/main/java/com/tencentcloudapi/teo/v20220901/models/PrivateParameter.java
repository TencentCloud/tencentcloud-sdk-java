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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateParameter extends AbstractModel {

    /**
    * 私有鉴权参数名称，取值有：
<li>AccessKeyId：鉴权参数 Access Key ID；</li>
<li>SecretAccessKey：鉴权参数 Secret Access Key；</li>
<li>SignatureVersion：鉴权版本，v2 或者 v4；</li>
<li>Region：存储桶地域。</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 私有鉴权参数值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 私有鉴权参数名称，取值有：
<li>AccessKeyId：鉴权参数 Access Key ID；</li>
<li>SecretAccessKey：鉴权参数 Secret Access Key；</li>
<li>SignatureVersion：鉴权版本，v2 或者 v4；</li>
<li>Region：存储桶地域。</li> 
     * @return Name 私有鉴权参数名称，取值有：
<li>AccessKeyId：鉴权参数 Access Key ID；</li>
<li>SecretAccessKey：鉴权参数 Secret Access Key；</li>
<li>SignatureVersion：鉴权版本，v2 或者 v4；</li>
<li>Region：存储桶地域。</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 私有鉴权参数名称，取值有：
<li>AccessKeyId：鉴权参数 Access Key ID；</li>
<li>SecretAccessKey：鉴权参数 Secret Access Key；</li>
<li>SignatureVersion：鉴权版本，v2 或者 v4；</li>
<li>Region：存储桶地域。</li>
     * @param Name 私有鉴权参数名称，取值有：
<li>AccessKeyId：鉴权参数 Access Key ID；</li>
<li>SecretAccessKey：鉴权参数 Secret Access Key；</li>
<li>SignatureVersion：鉴权版本，v2 或者 v4；</li>
<li>Region：存储桶地域。</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 私有鉴权参数值。 
     * @return Value 私有鉴权参数值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 私有鉴权参数值。
     * @param Value 私有鉴权参数值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public PrivateParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateParameter(PrivateParameter source) {
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

