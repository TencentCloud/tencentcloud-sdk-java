/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteFunctionRequest extends AbstractModel{

    /**
    * 调用后端接口名称。
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 接口参数，具体参数格式调用时与后端协调。
    */
    @SerializedName("FunctionArg")
    @Expose
    private String FunctionArg;

    /**
     * Get 调用后端接口名称。 
     * @return FunctionName 调用后端接口名称。
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 调用后端接口名称。
     * @param FunctionName 调用后端接口名称。
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 接口参数，具体参数格式调用时与后端协调。 
     * @return FunctionArg 接口参数，具体参数格式调用时与后端协调。
     */
    public String getFunctionArg() {
        return this.FunctionArg;
    }

    /**
     * Set 接口参数，具体参数格式调用时与后端协调。
     * @param FunctionArg 接口参数，具体参数格式调用时与后端协调。
     */
    public void setFunctionArg(String FunctionArg) {
        this.FunctionArg = FunctionArg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionArg", this.FunctionArg);

    }
}

