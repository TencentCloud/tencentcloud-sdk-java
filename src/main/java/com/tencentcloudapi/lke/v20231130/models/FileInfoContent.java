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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfoContent extends AbstractModel {

    /**
    * <p>实时文档解析接口返回的 DocBizId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * <p>文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>文件大小，单位为Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * <p>文件 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>实时文档解析接口返回的 doc_id。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>文件创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>实时文档解析接口返回的 DocBizId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocBizId <p>实时文档解析接口返回的 DocBizId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set <p>实时文档解析接口返回的 DocBizId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocBizId <p>实时文档解析接口返回的 DocBizId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get <p>文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName <p>文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName <p>文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType <p>文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType <p>文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>文件大小，单位为Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize <p>文件大小，单位为Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小，单位为Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize <p>文件大小，单位为Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>文件 URL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileUrl <p>文件 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>文件 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileUrl <p>文件 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>实时文档解析接口返回的 doc_id。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocId <p>实时文档解析接口返回的 doc_id。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>实时文档解析接口返回的 doc_id。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocId <p>实时文档解析接口返回的 doc_id。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>文件创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>文件创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>文件创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>文件创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public FileInfoContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfoContent(FileInfoContent source) {
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

