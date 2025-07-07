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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Limit extends AbstractModel {

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 配额的类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 配置的值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 用户名 
     * @return Username 用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
     * @param Username 用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 配额的类型 
     * @return Type 配额的类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 配额的类型
     * @param Type 配额的类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 配置的值 
     * @return Value 配置的值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 配置的值
     * @param Value 配置的值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public Limit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Limit(Limit source) {
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
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
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

