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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageEventMessage extends AbstractModel {

    /**
    * <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Token用量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenUsage")
    @Expose
    private TokenUsage TokenUsage;

    /**
     * Get <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Token用量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenUsage <p>Token用量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TokenUsage getTokenUsage() {
        return this.TokenUsage;
    }

    /**
     * Set <p>Token用量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenUsage <p>Token用量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenUsage(TokenUsage TokenUsage) {
        this.TokenUsage = TokenUsage;
    }

    public MessageEventMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageEventMessage(MessageEventMessage source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.TokenUsage != null) {
            this.TokenUsage = new TokenUsage(source.TokenUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamObj(map, prefix + "TokenUsage.", this.TokenUsage);

    }
}

