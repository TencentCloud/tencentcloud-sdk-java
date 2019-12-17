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
package com.tencentcloudapi.tbp.v20190627.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Group extends AbstractModel{

    /**
    * 消息类型参考互联网MIME类型标准，当前仅支持"text/plain"。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 返回内容以链接形式提供。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 普通文本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 消息类型参考互联网MIME类型标准，当前仅支持"text/plain"。 
     * @return ContentType 消息类型参考互联网MIME类型标准，当前仅支持"text/plain"。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 消息类型参考互联网MIME类型标准，当前仅支持"text/plain"。
     * @param ContentType 消息类型参考互联网MIME类型标准，当前仅支持"text/plain"。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 返回内容以链接形式提供。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 返回内容以链接形式提供。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 返回内容以链接形式提供。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 返回内容以链接形式提供。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 普通文本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 普通文本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 普通文本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 普通文本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

