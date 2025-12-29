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
package com.tencentcloudapi.cloudmate.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatEventContentPart extends AbstractModel {

    /**
    * 文本内容（流式或完整）
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 函数调用信息
    */
    @SerializedName("FunctionCall")
    @Expose
    private String FunctionCall;

    /**
    * 函数返回结果
    */
    @SerializedName("FunctionResponse")
    @Expose
    private String FunctionResponse;

    /**
     * Get 文本内容（流式或完整） 
     * @return Text 文本内容（流式或完整）
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文本内容（流式或完整）
     * @param Text 文本内容（流式或完整）
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 函数调用信息 
     * @return FunctionCall 函数调用信息
     */
    public String getFunctionCall() {
        return this.FunctionCall;
    }

    /**
     * Set 函数调用信息
     * @param FunctionCall 函数调用信息
     */
    public void setFunctionCall(String FunctionCall) {
        this.FunctionCall = FunctionCall;
    }

    /**
     * Get 函数返回结果 
     * @return FunctionResponse 函数返回结果
     */
    public String getFunctionResponse() {
        return this.FunctionResponse;
    }

    /**
     * Set 函数返回结果
     * @param FunctionResponse 函数返回结果
     */
    public void setFunctionResponse(String FunctionResponse) {
        this.FunctionResponse = FunctionResponse;
    }

    public ChatEventContentPart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatEventContentPart(ChatEventContentPart source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.FunctionCall != null) {
            this.FunctionCall = new String(source.FunctionCall);
        }
        if (source.FunctionResponse != null) {
            this.FunctionResponse = new String(source.FunctionResponse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "FunctionCall", this.FunctionCall);
        this.setParamSimple(map, prefix + "FunctionResponse", this.FunctionResponse);

    }
}

