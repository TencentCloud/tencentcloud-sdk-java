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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToolFunction extends AbstractModel {

    /**
    * function名称，只能包含a-z，A-Z，0-9，_或-
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * function参数，一般为json字符串
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * function的简单描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get function名称，只能包含a-z，A-Z，0-9，_或- 
     * @return Name function名称，只能包含a-z，A-Z，0-9，_或-
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set function名称，只能包含a-z，A-Z，0-9，_或-
     * @param Name function名称，只能包含a-z，A-Z，0-9，_或-
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get function参数，一般为json字符串 
     * @return Parameters function参数，一般为json字符串
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set function参数，一般为json字符串
     * @param Parameters function参数，一般为json字符串
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get function的简单描述 
     * @return Description function的简单描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set function的简单描述
     * @param Description function的简单描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ToolFunction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolFunction(ToolFunction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
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
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

