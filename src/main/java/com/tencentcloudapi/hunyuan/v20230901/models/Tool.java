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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tool extends AbstractModel {

    /**
    * 工具类型，当前只支持function
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 具体要调用的function
    */
    @SerializedName("Function")
    @Expose
    private ToolFunction Function;

    /**
     * Get 工具类型，当前只支持function 
     * @return Type 工具类型，当前只支持function
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 工具类型，当前只支持function
     * @param Type 工具类型，当前只支持function
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 具体要调用的function 
     * @return Function 具体要调用的function
     */
    public ToolFunction getFunction() {
        return this.Function;
    }

    /**
     * Set 具体要调用的function
     * @param Function 具体要调用的function
     */
    public void setFunction(ToolFunction Function) {
        this.Function = Function;
    }

    public Tool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tool(Tool source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Function != null) {
            this.Function = new ToolFunction(source.Function);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Function.", this.Function);

    }
}

