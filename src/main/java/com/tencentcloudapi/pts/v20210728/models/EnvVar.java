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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvVar extends AbstractModel {

    /**
    * 变量引用键，建议为 C_IDENTIFIER 全大写风格
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 默认 NORMAL，支持 NORMAL、PASSWORD 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 变量引用值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 描述内容
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 变量引用键，建议为 C_IDENTIFIER 全大写风格 
     * @return Name 变量引用键，建议为 C_IDENTIFIER 全大写风格
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 变量引用键，建议为 C_IDENTIFIER 全大写风格
     * @param Name 变量引用键，建议为 C_IDENTIFIER 全大写风格
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 默认 NORMAL，支持 NORMAL、PASSWORD 类型 
     * @return Type 默认 NORMAL，支持 NORMAL、PASSWORD 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 默认 NORMAL，支持 NORMAL、PASSWORD 类型
     * @param Type 默认 NORMAL，支持 NORMAL、PASSWORD 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 变量引用值 
     * @return Value 变量引用值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 变量引用值
     * @param Value 变量引用值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 描述内容 
     * @return Description 描述内容
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述内容
     * @param Description 描述内容
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public EnvVar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvVar(EnvVar source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

