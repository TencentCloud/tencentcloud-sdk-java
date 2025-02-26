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

public class UploadKnowledgeDocumentSetRequest extends AbstractModel {

    /**
    * 知识库标识
    */
    @SerializedName("CollectionView")
    @Expose
    private String CollectionView;

    /**
    * 状态;ENABLED启用；NOT_ENABLED不启用
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件存储位置的可读地址
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * 文件类型，例如: .docx, .md
    */
    @SerializedName("DocumentType")
    @Expose
    private String DocumentType;

    /**
    * 对文件的描述
    */
    @SerializedName("DocumentDesc")
    @Expose
    private String DocumentDesc;

    /**
    * 文件标题
    */
    @SerializedName("FileTitle")
    @Expose
    private String FileTitle;

    /**
    * 	文件元信息，为jsonstring
    */
    @SerializedName("FileMetaData")
    @Expose
    private String FileMetaData;

    /**
    * 文件id
    */
    @SerializedName("DocumentSetId")
    @Expose
    private String DocumentSetId;

    /**
     * Get 知识库标识 
     * @return CollectionView 知识库标识
     */
    public String getCollectionView() {
        return this.CollectionView;
    }

    /**
     * Set 知识库标识
     * @param CollectionView 知识库标识
     */
    public void setCollectionView(String CollectionView) {
        this.CollectionView = CollectionView;
    }

    /**
     * Get 状态;ENABLED启用；NOT_ENABLED不启用 
     * @return FileName 状态;ENABLED启用；NOT_ENABLED不启用
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 状态;ENABLED启用；NOT_ENABLED不启用
     * @param FileName 状态;ENABLED启用；NOT_ENABLED不启用
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件存储位置的可读地址 
     * @return CosUrl 文件存储位置的可读地址
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set 文件存储位置的可读地址
     * @param CosUrl 文件存储位置的可读地址
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get 文件类型，例如: .docx, .md 
     * @return DocumentType 文件类型，例如: .docx, .md
     */
    public String getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set 文件类型，例如: .docx, .md
     * @param DocumentType 文件类型，例如: .docx, .md
     */
    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get 对文件的描述 
     * @return DocumentDesc 对文件的描述
     */
    public String getDocumentDesc() {
        return this.DocumentDesc;
    }

    /**
     * Set 对文件的描述
     * @param DocumentDesc 对文件的描述
     */
    public void setDocumentDesc(String DocumentDesc) {
        this.DocumentDesc = DocumentDesc;
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
     * Get 	文件元信息，为jsonstring 
     * @return FileMetaData 	文件元信息，为jsonstring
     */
    public String getFileMetaData() {
        return this.FileMetaData;
    }

    /**
     * Set 	文件元信息，为jsonstring
     * @param FileMetaData 	文件元信息，为jsonstring
     */
    public void setFileMetaData(String FileMetaData) {
        this.FileMetaData = FileMetaData;
    }

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

    public UploadKnowledgeDocumentSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadKnowledgeDocumentSetRequest(UploadKnowledgeDocumentSetRequest source) {
        if (source.CollectionView != null) {
            this.CollectionView = new String(source.CollectionView);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.DocumentType != null) {
            this.DocumentType = new String(source.DocumentType);
        }
        if (source.DocumentDesc != null) {
            this.DocumentDesc = new String(source.DocumentDesc);
        }
        if (source.FileTitle != null) {
            this.FileTitle = new String(source.FileTitle);
        }
        if (source.FileMetaData != null) {
            this.FileMetaData = new String(source.FileMetaData);
        }
        if (source.DocumentSetId != null) {
            this.DocumentSetId = new String(source.DocumentSetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CollectionView", this.CollectionView);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "DocumentDesc", this.DocumentDesc);
        this.setParamSimple(map, prefix + "FileTitle", this.FileTitle);
        this.setParamSimple(map, prefix + "FileMetaData", this.FileMetaData);
        this.setParamSimple(map, prefix + "DocumentSetId", this.DocumentSetId);

    }
}

