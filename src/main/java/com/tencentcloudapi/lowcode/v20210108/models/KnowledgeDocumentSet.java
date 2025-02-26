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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeDocumentSet extends AbstractModel {

    /**
    * 文档id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentSetId")
    @Expose
    private String DocumentSetId;

    /**
    * 文档名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentSetName")
    @Expose
    private String DocumentSetName;

    /**
    * 文件完整内容。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 文件内容前 200个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextPrefix")
    @Expose
    private String TextPrefix;

    /**
    * 文件详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentSetInfo")
    @Expose
    private KnowledgeDocumentSetInfo DocumentSetInfo;

    /**
    * 文件拆分信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SplitterPreprocess")
    @Expose
    private KnowledgeSplitterPreprocess SplitterPreprocess;

    /**
    * 未使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文档标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileTitle")
    @Expose
    private String FileTitle;

    /**
    * 文档元信息，必须为jsonstring
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMetaData")
    @Expose
    private String FileMetaData;

    /**
    * 作者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
     * Get 文档id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentSetId 文档id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocumentSetId() {
        return this.DocumentSetId;
    }

    /**
     * Set 文档id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentSetId 文档id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentSetId(String DocumentSetId) {
        this.DocumentSetId = DocumentSetId;
    }

    /**
     * Get 文档名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentSetName 文档名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocumentSetName() {
        return this.DocumentSetName;
    }

    /**
     * Set 文档名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentSetName 文档名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentSetName(String DocumentSetName) {
        this.DocumentSetName = DocumentSetName;
    }

    /**
     * Get 文件完整内容。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 文件完整内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文件完整内容。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 文件完整内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 文件内容前 200个字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextPrefix 文件内容前 200个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTextPrefix() {
        return this.TextPrefix;
    }

    /**
     * Set 文件内容前 200个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextPrefix 文件内容前 200个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextPrefix(String TextPrefix) {
        this.TextPrefix = TextPrefix;
    }

    /**
     * Get 文件详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentSetInfo 文件详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeDocumentSetInfo getDocumentSetInfo() {
        return this.DocumentSetInfo;
    }

    /**
     * Set 文件详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentSetInfo 文件详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentSetInfo(KnowledgeDocumentSetInfo DocumentSetInfo) {
        this.DocumentSetInfo = DocumentSetInfo;
    }

    /**
     * Get 文件拆分信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SplitterPreprocess 文件拆分信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeSplitterPreprocess getSplitterPreprocess() {
        return this.SplitterPreprocess;
    }

    /**
     * Set 文件拆分信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SplitterPreprocess 文件拆分信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSplitterPreprocess(KnowledgeSplitterPreprocess SplitterPreprocess) {
        this.SplitterPreprocess = SplitterPreprocess;
    }

    /**
     * Get 未使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 未使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 未使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 未使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文档标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileTitle 文档标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileTitle() {
        return this.FileTitle;
    }

    /**
     * Set 文档标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileTitle 文档标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileTitle(String FileTitle) {
        this.FileTitle = FileTitle;
    }

    /**
     * Get 文档元信息，必须为jsonstring
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMetaData 文档元信息，必须为jsonstring
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMetaData() {
        return this.FileMetaData;
    }

    /**
     * Set 文档元信息，必须为jsonstring
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMetaData 文档元信息，必须为jsonstring
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMetaData(String FileMetaData) {
        this.FileMetaData = FileMetaData;
    }

    /**
     * Get 作者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Author 作者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 作者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Author 作者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public KnowledgeDocumentSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeDocumentSet(KnowledgeDocumentSet source) {
        if (source.DocumentSetId != null) {
            this.DocumentSetId = new String(source.DocumentSetId);
        }
        if (source.DocumentSetName != null) {
            this.DocumentSetName = new String(source.DocumentSetName);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TextPrefix != null) {
            this.TextPrefix = new String(source.TextPrefix);
        }
        if (source.DocumentSetInfo != null) {
            this.DocumentSetInfo = new KnowledgeDocumentSetInfo(source.DocumentSetInfo);
        }
        if (source.SplitterPreprocess != null) {
            this.SplitterPreprocess = new KnowledgeSplitterPreprocess(source.SplitterPreprocess);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FileTitle != null) {
            this.FileTitle = new String(source.FileTitle);
        }
        if (source.FileMetaData != null) {
            this.FileMetaData = new String(source.FileMetaData);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocumentSetId", this.DocumentSetId);
        this.setParamSimple(map, prefix + "DocumentSetName", this.DocumentSetName);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "TextPrefix", this.TextPrefix);
        this.setParamObj(map, prefix + "DocumentSetInfo.", this.DocumentSetInfo);
        this.setParamObj(map, prefix + "SplitterPreprocess.", this.SplitterPreprocess);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FileTitle", this.FileTitle);
        this.setParamSimple(map, prefix + "FileMetaData", this.FileMetaData);
        this.setParamSimple(map, prefix + "Author", this.Author);

    }
}

