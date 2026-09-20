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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventPartInfo extends AbstractModel {

    /**
    * 文本内容，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 是否为思考内容。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Thought")
    @Expose
    private Boolean Thought;

    /**
    * 工具调用信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FunctionCall")
    @Expose
    private String FunctionCall;

    /**
    * 工具返回信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FunctionResponse")
    @Expose
    private String FunctionResponse;

    /**
    * 内联数据。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InlineData")
    @Expose
    private InlineDataInfo InlineData;

    /**
     * Get 文本内容，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 文本内容，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文本内容，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 文本内容，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 是否为思考内容。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Thought 是否为思考内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getThought() {
        return this.Thought;
    }

    /**
     * Set 是否为思考内容。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Thought 是否为思考内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThought(Boolean Thought) {
        this.Thought = Thought;
    }

    /**
     * Get 工具调用信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FunctionCall 工具调用信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunctionCall() {
        return this.FunctionCall;
    }

    /**
     * Set 工具调用信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FunctionCall 工具调用信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunctionCall(String FunctionCall) {
        this.FunctionCall = FunctionCall;
    }

    /**
     * Get 工具返回信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FunctionResponse 工具返回信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunctionResponse() {
        return this.FunctionResponse;
    }

    /**
     * Set 工具返回信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FunctionResponse 工具返回信息，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunctionResponse(String FunctionResponse) {
        this.FunctionResponse = FunctionResponse;
    }

    /**
     * Get 内联数据。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InlineData 内联数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InlineDataInfo getInlineData() {
        return this.InlineData;
    }

    /**
     * Set 内联数据。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InlineData 内联数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInlineData(InlineDataInfo InlineData) {
        this.InlineData = InlineData;
    }

    public EventPartInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventPartInfo(EventPartInfo source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Thought != null) {
            this.Thought = new Boolean(source.Thought);
        }
        if (source.FunctionCall != null) {
            this.FunctionCall = new String(source.FunctionCall);
        }
        if (source.FunctionResponse != null) {
            this.FunctionResponse = new String(source.FunctionResponse);
        }
        if (source.InlineData != null) {
            this.InlineData = new InlineDataInfo(source.InlineData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Thought", this.Thought);
        this.setParamSimple(map, prefix + "FunctionCall", this.FunctionCall);
        this.setParamSimple(map, prefix + "FunctionResponse", this.FunctionResponse);
        this.setParamObj(map, prefix + "InlineData.", this.InlineData);

    }
}

