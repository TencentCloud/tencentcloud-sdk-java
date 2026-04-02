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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToolCallFunction extends AbstractModel {

    /**
    * <p>Function名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Function参数，一般为json字符串</p>
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
     * Get <p>Function名称</p> 
     * @return Name <p>Function名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Function名称</p>
     * @param Name <p>Function名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Function参数，一般为json字符串</p> 
     * @return Arguments <p>Function参数，一般为json字符串</p>
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set <p>Function参数，一般为json字符串</p>
     * @param Arguments <p>Function参数，一般为json字符串</p>
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
    }

    public ToolCallFunction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolCallFunction(ToolCallFunction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Arguments != null) {
            this.Arguments = new String(source.Arguments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Arguments", this.Arguments);

    }
}

