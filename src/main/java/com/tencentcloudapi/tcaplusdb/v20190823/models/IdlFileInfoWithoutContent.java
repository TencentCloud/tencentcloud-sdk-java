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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdlFileInfoWithoutContent extends AbstractModel {

    /**
    * 文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件扩展名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileExtType")
    @Expose
    private String FileExtType;

    /**
    * 文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private Long FileId;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
     * Get 文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType 数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件扩展名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileExtType 文件扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileExtType() {
        return this.FileExtType;
    }

    /**
     * Set 文件扩展名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileExtType 文件扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileExtType(String FileExtType) {
        this.FileExtType = FileExtType;
    }

    /**
     * Get 文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileId 文件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 文件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(Long FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    public IdlFileInfoWithoutContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdlFileInfoWithoutContent(IdlFileInfoWithoutContent source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileExtType != null) {
            this.FileExtType = new String(source.FileExtType);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FileId != null) {
            this.FileId = new Long(source.FileId);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
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
        this.setParamObj(map, prefix + "Error.", this.Error);

    }
}

