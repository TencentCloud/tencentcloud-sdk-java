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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigurationItem extends AbstractModel {

    /**
    * 配置项名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 配置项值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 所在的配置文件名
    */
    @SerializedName("InFile")
    @Expose
    private String InFile;

    /**
     * Get 配置项名称 
     * @return Name 配置项名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置项名称
     * @param Name 配置项名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 配置项值 
     * @return Value 配置项值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 配置项值
     * @param Value 配置项值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 所在的配置文件名 
     * @return InFile 所在的配置文件名
     */
    public String getInFile() {
        return this.InFile;
    }

    /**
     * Set 所在的配置文件名
     * @param InFile 所在的配置文件名
     */
    public void setInFile(String InFile) {
        this.InFile = InFile;
    }

    public ConfigurationItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigurationItem(ConfigurationItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.InFile != null) {
            this.InFile = new String(source.InFile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "InFile", this.InFile);

    }
}

