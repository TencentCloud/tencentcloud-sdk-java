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

public class NodeRunContent extends AbstractModel {

    /**
    * 输入变量信息
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 输出变量信息
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 原始输出信息。部分节点才有值，如工具节点、代码节点
    */
    @SerializedName("OriginalOutput")
    @Expose
    private String OriginalOutput;

    /**
    * 节点输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值）
    */
    @SerializedName("InputRef")
    @Expose
    private String InputRef;

    /**
    * 节点输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值）
    */
    @SerializedName("OutputRef")
    @Expose
    private String OutputRef;

    /**
    * 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值）
    */
    @SerializedName("OriginalOutputRef")
    @Expose
    private String OriginalOutputRef;

    /**
     * Get 输入变量信息 
     * @return Input 输入变量信息
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 输入变量信息
     * @param Input 输入变量信息
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 输出变量信息 
     * @return Output 输出变量信息
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 输出变量信息
     * @param Output 输出变量信息
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 原始输出信息。部分节点才有值，如工具节点、代码节点 
     * @return OriginalOutput 原始输出信息。部分节点才有值，如工具节点、代码节点
     */
    public String getOriginalOutput() {
        return this.OriginalOutput;
    }

    /**
     * Set 原始输出信息。部分节点才有值，如工具节点、代码节点
     * @param OriginalOutput 原始输出信息。部分节点才有值，如工具节点、代码节点
     */
    public void setOriginalOutput(String OriginalOutput) {
        this.OriginalOutput = OriginalOutput;
    }

    /**
     * Get 节点输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值） 
     * @return InputRef 节点输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值）
     */
    public String getInputRef() {
        return this.InputRef;
    }

    /**
     * Set 节点输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值）
     * @param InputRef 节点输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值）
     */
    public void setInputRef(String InputRef) {
        this.InputRef = InputRef;
    }

    /**
     * Get 节点输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值） 
     * @return OutputRef 节点输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值）
     */
    public String getOutputRef() {
        return this.OutputRef;
    }

    /**
     * Set 节点输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值）
     * @param OutputRef 节点输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值）
     */
    public void setOutputRef(String OutputRef) {
        this.OutputRef = OutputRef;
    }

    /**
     * Get 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值） 
     * @return OriginalOutputRef 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值）
     */
    public String getOriginalOutputRef() {
        return this.OriginalOutputRef;
    }

    /**
     * Set 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值）
     * @param OriginalOutputRef 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值）
     */
    public void setOriginalOutputRef(String OriginalOutputRef) {
        this.OriginalOutputRef = OriginalOutputRef;
    }

    public NodeRunContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRunContent(NodeRunContent source) {
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.OriginalOutput != null) {
            this.OriginalOutput = new String(source.OriginalOutput);
        }
        if (source.InputRef != null) {
            this.InputRef = new String(source.InputRef);
        }
        if (source.OutputRef != null) {
            this.OutputRef = new String(source.OutputRef);
        }
        if (source.OriginalOutputRef != null) {
            this.OriginalOutputRef = new String(source.OriginalOutputRef);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "OriginalOutput", this.OriginalOutput);
        this.setParamSimple(map, prefix + "InputRef", this.InputRef);
        this.setParamSimple(map, prefix + "OutputRef", this.OutputRef);
        this.setParamSimple(map, prefix + "OriginalOutputRef", this.OriginalOutputRef);

    }
}

