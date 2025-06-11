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

public class SearchDocInfo extends AbstractModel {

    /**
    * 知识库名称
    */
    @SerializedName("CollectionViewName")
    @Expose
    private String CollectionViewName;

    /**
    * 文档Id
    */
    @SerializedName("DocSetId")
    @Expose
    private String DocSetId;

    /**
    * 文档Name
    */
    @SerializedName("DocSetName")
    @Expose
    private String DocSetName;

    /**
    * 文档类型
    */
    @SerializedName("DocType")
    @Expose
    private String DocType;

    /**
    * 文档标题
    */
    @SerializedName("FileTitle")
    @Expose
    private String FileTitle;

    /**
    * 文档元信息
    */
    @SerializedName("FileMetaData")
    @Expose
    private String FileMetaData;

    /**
    * 文档描述
    */
    @SerializedName("DocDesc")
    @Expose
    private String DocDesc;

    /**
    * 文档大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Cos存储文件ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get 知识库名称 
     * @return CollectionViewName 知识库名称
     */
    public String getCollectionViewName() {
        return this.CollectionViewName;
    }

    /**
     * Set 知识库名称
     * @param CollectionViewName 知识库名称
     */
    public void setCollectionViewName(String CollectionViewName) {
        this.CollectionViewName = CollectionViewName;
    }

    /**
     * Get 文档Id 
     * @return DocSetId 文档Id
     */
    public String getDocSetId() {
        return this.DocSetId;
    }

    /**
     * Set 文档Id
     * @param DocSetId 文档Id
     */
    public void setDocSetId(String DocSetId) {
        this.DocSetId = DocSetId;
    }

    /**
     * Get 文档Name 
     * @return DocSetName 文档Name
     */
    public String getDocSetName() {
        return this.DocSetName;
    }

    /**
     * Set 文档Name
     * @param DocSetName 文档Name
     */
    public void setDocSetName(String DocSetName) {
        this.DocSetName = DocSetName;
    }

    /**
     * Get 文档类型 
     * @return DocType 文档类型
     */
    public String getDocType() {
        return this.DocType;
    }

    /**
     * Set 文档类型
     * @param DocType 文档类型
     */
    public void setDocType(String DocType) {
        this.DocType = DocType;
    }

    /**
     * Get 文档标题 
     * @return FileTitle 文档标题
     */
    public String getFileTitle() {
        return this.FileTitle;
    }

    /**
     * Set 文档标题
     * @param FileTitle 文档标题
     */
    public void setFileTitle(String FileTitle) {
        this.FileTitle = FileTitle;
    }

    /**
     * Get 文档元信息 
     * @return FileMetaData 文档元信息
     */
    public String getFileMetaData() {
        return this.FileMetaData;
    }

    /**
     * Set 文档元信息
     * @param FileMetaData 文档元信息
     */
    public void setFileMetaData(String FileMetaData) {
        this.FileMetaData = FileMetaData;
    }

    /**
     * Get 文档描述 
     * @return DocDesc 文档描述
     */
    public String getDocDesc() {
        return this.DocDesc;
    }

    /**
     * Set 文档描述
     * @param DocDesc 文档描述
     */
    public void setDocDesc(String DocDesc) {
        this.DocDesc = DocDesc;
    }

    /**
     * Get 文档大小 
     * @return FileSize 文档大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文档大小
     * @param FileSize 文档大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
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

    public SearchDocInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchDocInfo(SearchDocInfo source) {
        if (source.CollectionViewName != null) {
            this.CollectionViewName = new String(source.CollectionViewName);
        }
        if (source.DocSetId != null) {
            this.DocSetId = new String(source.DocSetId);
        }
        if (source.DocSetName != null) {
            this.DocSetName = new String(source.DocSetName);
        }
        if (source.DocType != null) {
            this.DocType = new String(source.DocType);
        }
        if (source.FileTitle != null) {
            this.FileTitle = new String(source.FileTitle);
        }
        if (source.FileMetaData != null) {
            this.FileMetaData = new String(source.FileMetaData);
        }
        if (source.DocDesc != null) {
            this.DocDesc = new String(source.DocDesc);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CollectionViewName", this.CollectionViewName);
        this.setParamSimple(map, prefix + "DocSetId", this.DocSetId);
        this.setParamSimple(map, prefix + "DocSetName", this.DocSetName);
        this.setParamSimple(map, prefix + "DocType", this.DocType);
        this.setParamSimple(map, prefix + "FileTitle", this.FileTitle);
        this.setParamSimple(map, prefix + "FileMetaData", this.FileMetaData);
        this.setParamSimple(map, prefix + "DocDesc", this.DocDesc);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

