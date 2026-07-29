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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildSecret extends AbstractModel {

    /**
    * <p>标准化为 DNS Label 风格；构建时注入为 $SECRET_&lt;NAME&gt;（同时也提供原大写形式 $SECRET_&lt;NAME_UPPERCASE&gt;）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>平台 AES 加密落库；DescribeVersion 永不回显明文</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>标准化为 DNS Label 风格；构建时注入为 $SECRET_&lt;NAME&gt;（同时也提供原大写形式 $SECRET_&lt;NAME_UPPERCASE&gt;）</p> 
     * @return Name <p>标准化为 DNS Label 风格；构建时注入为 $SECRET_&lt;NAME&gt;（同时也提供原大写形式 $SECRET_&lt;NAME_UPPERCASE&gt;）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>标准化为 DNS Label 风格；构建时注入为 $SECRET_&lt;NAME&gt;（同时也提供原大写形式 $SECRET_&lt;NAME_UPPERCASE&gt;）</p>
     * @param Name <p>标准化为 DNS Label 风格；构建时注入为 $SECRET_&lt;NAME&gt;（同时也提供原大写形式 $SECRET_&lt;NAME_UPPERCASE&gt;）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>平台 AES 加密落库；DescribeVersion 永不回显明文</p> 
     * @return Value <p>平台 AES 加密落库；DescribeVersion 永不回显明文</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>平台 AES 加密落库；DescribeVersion 永不回显明文</p>
     * @param Value <p>平台 AES 加密落库；DescribeVersion 永不回显明文</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public BuildSecret() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildSecret(BuildSecret source) {
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

