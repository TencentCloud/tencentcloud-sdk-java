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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsgFileInfo extends AbstractModel {

    /**
    * 文档名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文档大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * 文档URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文档类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文档ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
     * Get 文档名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 文档名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文档名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文档名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文档大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 文档大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文档大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文档大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文档URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileUrl 文档URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文档URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileUrl 文档URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文档类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType 文档类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文档类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 文档类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文档ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocId 文档ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set 文档ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocId 文档ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    public MsgFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgFileInfo(MsgFileInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "DocId", this.DocId);

    }
}

