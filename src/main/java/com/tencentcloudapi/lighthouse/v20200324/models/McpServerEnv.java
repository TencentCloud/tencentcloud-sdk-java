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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McpServerEnv extends AbstractModel {

    /**
    * MCP Server的环境变量键。最大长度：128
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * MCP Server的环境变量值。最大长度：1024。该字段可能存储密钥，出参时将固定返回“**********”，避免明文泄露。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get MCP Server的环境变量键。最大长度：128 
     * @return Key MCP Server的环境变量键。最大长度：128
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set MCP Server的环境变量键。最大长度：128
     * @param Key MCP Server的环境变量键。最大长度：128
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get MCP Server的环境变量值。最大长度：1024。该字段可能存储密钥，出参时将固定返回“**********”，避免明文泄露。 
     * @return Value MCP Server的环境变量值。最大长度：1024。该字段可能存储密钥，出参时将固定返回“**********”，避免明文泄露。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set MCP Server的环境变量值。最大长度：1024。该字段可能存储密钥，出参时将固定返回“**********”，避免明文泄露。
     * @param Value MCP Server的环境变量值。最大长度：1024。该字段可能存储密钥，出参时将固定返回“**********”，避免明文泄露。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public McpServerEnv() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpServerEnv(McpServerEnv source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

