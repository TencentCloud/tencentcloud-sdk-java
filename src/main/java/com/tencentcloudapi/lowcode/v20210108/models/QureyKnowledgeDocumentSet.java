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

public class QureyKnowledgeDocumentSet extends AbstractModel {

    /**
    * 文件id
    */
    @SerializedName("DocumentSetId")
    @Expose
    private String DocumentSetId;

    /**
    * 文件名
    */
    @SerializedName("DocumentSetName")
    @Expose
    private String DocumentSetName;

    /**
    * 文件内容前 200个字符。
    */
    @SerializedName("TextPrefix")
    @Expose
    private String TextPrefix;

    /**
    * 文件拆分信息
    */
    @SerializedName("SplitterPreprocess")
    @Expose
    private KnowledgeSplitterPreprocess SplitterPreprocess;

    /**
    * 文件详情
    */
    @SerializedName("DocumentSetInfo")
    @Expose
    private QureyKnowledgeDocumentSetInfo DocumentSetInfo;

    /**
    * 文件标题
    */
    @SerializedName("FileTitle")
    @Expose
    private String FileTitle;

    /**
    * 文件元信息，必须为jsonstring
    */
    @SerializedName("FileMetaData")
    @Expose
    private String FileMetaData;

    /**
    * name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 作者
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 文档上传状态
    */
    @SerializedName("DocStatus")
    @Expose
    private String DocStatus;

    /**
    * 上传文件失败时具体的错误消息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * Cos存储文件ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get 文件id 
     * @return DocumentSetId 文件id
     */
    public String getDocumentSetId() {
        return this.DocumentSetId;
    }

    /**
     * Set 文件id
     * @param DocumentSetId 文件id
     */
    public void setDocumentSetId(String DocumentSetId) {
        this.DocumentSetId = DocumentSetId;
    }

    /**
     * Get 文件名 
     * @return DocumentSetName 文件名
     */
    public String getDocumentSetName() {
        return this.DocumentSetName;
    }

    /**
     * Set 文件名
     * @param DocumentSetName 文件名
     */
    public void setDocumentSetName(String DocumentSetName) {
        this.DocumentSetName = DocumentSetName;
    }

    /**
     * Get 文件内容前 200个字符。 
     * @return TextPrefix 文件内容前 200个字符。
     */
    public String getTextPrefix() {
        return this.TextPrefix;
    }

    /**
     * Set 文件内容前 200个字符。
     * @param TextPrefix 文件内容前 200个字符。
     */
    public void setTextPrefix(String TextPrefix) {
        this.TextPrefix = TextPrefix;
    }

    /**
     * Get 文件拆分信息 
     * @return SplitterPreprocess 文件拆分信息
     */
    public KnowledgeSplitterPreprocess getSplitterPreprocess() {
        return this.SplitterPreprocess;
    }

    /**
     * Set 文件拆分信息
     * @param SplitterPreprocess 文件拆分信息
     */
    public void setSplitterPreprocess(KnowledgeSplitterPreprocess SplitterPreprocess) {
        this.SplitterPreprocess = SplitterPreprocess;
    }

    /**
     * Get 文件详情 
     * @return DocumentSetInfo 文件详情
     */
    public QureyKnowledgeDocumentSetInfo getDocumentSetInfo() {
        return this.DocumentSetInfo;
    }

    /**
     * Set 文件详情
     * @param DocumentSetInfo 文件详情
     */
    public void setDocumentSetInfo(QureyKnowledgeDocumentSetInfo DocumentSetInfo) {
        this.DocumentSetInfo = DocumentSetInfo;
    }

    /**
     * Get 文件标题 
     * @return FileTitle 文件标题
     */
    public String getFileTitle() {
        return this.FileTitle;
    }

    /**
     * Set 文件标题
     * @param FileTitle 文件标题
     */
    public void setFileTitle(String FileTitle) {
        this.FileTitle = FileTitle;
    }

    /**
     * Get 文件元信息，必须为jsonstring 
     * @return FileMetaData 文件元信息，必须为jsonstring
     */
    public String getFileMetaData() {
        return this.FileMetaData;
    }

    /**
     * Set 文件元信息，必须为jsonstring
     * @param FileMetaData 文件元信息，必须为jsonstring
     */
    public void setFileMetaData(String FileMetaData) {
        this.FileMetaData = FileMetaData;
    }

    /**
     * Get name 
     * @return Name name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set name
     * @param Name name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 作者 
     * @return Author 作者
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 作者
     * @param Author 作者
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 文档上传状态 
     * @return DocStatus 文档上传状态
     */
    public String getDocStatus() {
        return this.DocStatus;
    }

    /**
     * Set 文档上传状态
     * @param DocStatus 文档上传状态
     */
    public void setDocStatus(String DocStatus) {
        this.DocStatus = DocStatus;
    }

    /**
     * Get 上传文件失败时具体的错误消息 
     * @return ErrMsg 上传文件失败时具体的错误消息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 上传文件失败时具体的错误消息
     * @param ErrMsg 上传文件失败时具体的错误消息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get Cos存储文件ID 
     * @return FileId Cos存储文件ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Cos存储文件ID
     * @param FileId Cos存储文件ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public QureyKnowledgeDocumentSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QureyKnowledgeDocumentSet(QureyKnowledgeDocumentSet source) {
        if (source.DocumentSetId != null) {
            this.DocumentSetId = new String(source.DocumentSetId);
        }
        if (source.DocumentSetName != null) {
            this.DocumentSetName = new String(source.DocumentSetName);
        }
        if (source.TextPrefix != null) {
            this.TextPrefix = new String(source.TextPrefix);
        }
        if (source.SplitterPreprocess != null) {
            this.SplitterPreprocess = new KnowledgeSplitterPreprocess(source.SplitterPreprocess);
        }
        if (source.DocumentSetInfo != null) {
            this.DocumentSetInfo = new QureyKnowledgeDocumentSetInfo(source.DocumentSetInfo);
        }
        if (source.FileTitle != null) {
            this.FileTitle = new String(source.FileTitle);
        }
        if (source.FileMetaData != null) {
            this.FileMetaData = new String(source.FileMetaData);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.DocStatus != null) {
            this.DocStatus = new String(source.DocStatus);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocumentSetId", this.DocumentSetId);
        this.setParamSimple(map, prefix + "DocumentSetName", this.DocumentSetName);
        this.setParamSimple(map, prefix + "TextPrefix", this.TextPrefix);
        this.setParamObj(map, prefix + "SplitterPreprocess.", this.SplitterPreprocess);
        this.setParamObj(map, prefix + "DocumentSetInfo.", this.DocumentSetInfo);
        this.setParamSimple(map, prefix + "FileTitle", this.FileTitle);
        this.setParamSimple(map, prefix + "FileMetaData", this.FileMetaData);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "DocStatus", this.DocStatus);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

