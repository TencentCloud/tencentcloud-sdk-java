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

public class MCPResourceContents extends AbstractModel {

    /**
    * <p>二进制内容，与 text 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Blob")
    @Expose
    private String Blob;

    /**
    * <p>JSON：单个资源的 _meta 原文</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
    * <p>MIME 类型，MCP App 的 HTML 为 text/html;profile=mcp-app</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MimeType")
    @Expose
    private String MimeType;

    /**
    * <p>文本内容，与 blob 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>资源 URI</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
     * Get <p>二进制内容，与 text 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Blob <p>二进制内容，与 text 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlob() {
        return this.Blob;
    }

    /**
     * Set <p>二进制内容，与 text 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Blob <p>二进制内容，与 text 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlob(String Blob) {
        this.Blob = Blob;
    }

    /**
     * Get <p>JSON：单个资源的 _meta 原文</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Meta <p>JSON：单个资源的 _meta 原文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMeta() {
        return this.Meta;
    }

    /**
     * Set <p>JSON：单个资源的 _meta 原文</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Meta <p>JSON：单个资源的 _meta 原文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMeta(String Meta) {
        this.Meta = Meta;
    }

    /**
     * Get <p>MIME 类型，MCP App 的 HTML 为 text/html;profile=mcp-app</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MimeType <p>MIME 类型，MCP App 的 HTML 为 text/html;profile=mcp-app</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMimeType() {
        return this.MimeType;
    }

    /**
     * Set <p>MIME 类型，MCP App 的 HTML 为 text/html;profile=mcp-app</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MimeType <p>MIME 类型，MCP App 的 HTML 为 text/html;profile=mcp-app</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }

    /**
     * Get <p>文本内容，与 blob 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text <p>文本内容，与 blob 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>文本内容，与 blob 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text <p>文本内容，与 blob 二选一</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>资源 URI</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uri <p>资源 URI</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set <p>资源 URI</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uri <p>资源 URI</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    public MCPResourceContents() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPResourceContents(MCPResourceContents source) {
        if (source.Blob != null) {
            this.Blob = new String(source.Blob);
        }
        if (source.Meta != null) {
            this.Meta = new String(source.Meta);
        }
        if (source.MimeType != null) {
            this.MimeType = new String(source.MimeType);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Blob", this.Blob);
        this.setParamSimple(map, prefix + "Meta", this.Meta);
        this.setParamSimple(map, prefix + "MimeType", this.MimeType);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Uri", this.Uri);

    }
}

