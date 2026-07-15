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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkIOTTool extends AbstractModel {

    /**
    * 工具名称，同时作为IoT ActionId
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 工具描述，用于模型判断何时调用
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工具参数JSON Schema，JSON对象字符串，必须为type=object
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 必填参数名列表，必须存在于Parameters.properties中
    */
    @SerializedName("Required")
    @Expose
    private String [] Required;

    /**
     * Get 工具名称，同时作为IoT ActionId 
     * @return Name 工具名称，同时作为IoT ActionId
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工具名称，同时作为IoT ActionId
     * @param Name 工具名称，同时作为IoT ActionId
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 工具描述，用于模型判断何时调用 
     * @return Description 工具描述，用于模型判断何时调用
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 工具描述，用于模型判断何时调用
     * @param Description 工具描述，用于模型判断何时调用
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工具参数JSON Schema，JSON对象字符串，必须为type=object 
     * @return Parameters 工具参数JSON Schema，JSON对象字符串，必须为type=object
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 工具参数JSON Schema，JSON对象字符串，必须为type=object
     * @param Parameters 工具参数JSON Schema，JSON对象字符串，必须为type=object
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 必填参数名列表，必须存在于Parameters.properties中 
     * @return Required 必填参数名列表，必须存在于Parameters.properties中
     */
    public String [] getRequired() {
        return this.Required;
    }

    /**
     * Set 必填参数名列表，必须存在于Parameters.properties中
     * @param Required 必填参数名列表，必须存在于Parameters.properties中
     */
    public void setRequired(String [] Required) {
        this.Required = Required;
    }

    public TalkIOTTool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkIOTTool(TalkIOTTool source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.Required != null) {
            this.Required = new String[source.Required.length];
            for (int i = 0; i < source.Required.length; i++) {
                this.Required[i] = new String(source.Required[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamArraySimple(map, prefix + "Required.", this.Required);

    }
}

