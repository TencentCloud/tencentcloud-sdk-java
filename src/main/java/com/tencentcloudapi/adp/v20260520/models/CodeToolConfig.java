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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeToolConfig extends AbstractModel {

    /**
    * 代码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 示例
    */
    @SerializedName("Example")
    @Expose
    private ToolExample Example;

    /**
    * 输入参数
    */
    @SerializedName("Inputs")
    @Expose
    private RequestParam [] Inputs;

    /**
    * 输出参数
    */
    @SerializedName("Outputs")
    @Expose
    private ResponseParam [] Outputs;

    /**
     * Get 代码 
     * @return Code 代码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 代码
     * @param Code 代码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 示例 
     * @return Example 示例
     */
    public ToolExample getExample() {
        return this.Example;
    }

    /**
     * Set 示例
     * @param Example 示例
     */
    public void setExample(ToolExample Example) {
        this.Example = Example;
    }

    /**
     * Get 输入参数 
     * @return Inputs 输入参数
     */
    public RequestParam [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set 输入参数
     * @param Inputs 输入参数
     */
    public void setInputs(RequestParam [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get 输出参数 
     * @return Outputs 输出参数
     */
    public ResponseParam [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set 输出参数
     * @param Outputs 输出参数
     */
    public void setOutputs(ResponseParam [] Outputs) {
        this.Outputs = Outputs;
    }

    public CodeToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeToolConfig(CodeToolConfig source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Example != null) {
            this.Example = new ToolExample(source.Example);
        }
        if (source.Inputs != null) {
            this.Inputs = new RequestParam[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new RequestParam(source.Inputs[i]);
            }
        }
        if (source.Outputs != null) {
            this.Outputs = new ResponseParam[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new ResponseParam(source.Outputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamObj(map, prefix + "Example.", this.Example);
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);

    }
}

