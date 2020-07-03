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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdlFileInfo extends AbstractModel{

    /**
    * 文件名称，不包含扩展名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 数据描述语言（IDL）类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件扩展名
    */
    @SerializedName("FileExtType")
    @Expose
    private String FileExtType;

    /**
    * 文件大小（Bytes）
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件ID，对于已上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private Long FileId;

    /**
    * 文件内容，对于本次新上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
     * Get 文件名称，不包含扩展名 
     * @return FileName 文件名称，不包含扩展名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称，不包含扩展名
     * @param FileName 文件名称，不包含扩展名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 数据描述语言（IDL）类型 
     * @return FileType 数据描述语言（IDL）类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 数据描述语言（IDL）类型
     * @param FileType 数据描述语言（IDL）类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件扩展名 
     * @return FileExtType 文件扩展名
     */
    public String getFileExtType() {
        return this.FileExtType;
    }

    /**
     * Set 文件扩展名
     * @param FileExtType 文件扩展名
     */
    public void setFileExtType(String FileExtType) {
        this.FileExtType = FileExtType;
    }

    /**
     * Get 文件大小（Bytes） 
     * @return FileSize 文件大小（Bytes）
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小（Bytes）
     * @param FileSize 文件大小（Bytes）
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件ID，对于已上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileId 文件ID，对于已上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID，对于已上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 文件ID，对于已上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(Long FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件内容，对于本次新上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileContent 文件内容，对于本次新上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 文件内容，对于本次新上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileContent 文件内容，对于本次新上传的文件有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileExtType", this.FileExtType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);

    }
}

