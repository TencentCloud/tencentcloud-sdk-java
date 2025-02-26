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

public class UploadKnowledgeDocumentSetRsp extends AbstractModel {

    /**
    * 给文件分配的 ID 信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentSetId")
    @Expose
    private String DocumentSetId;

    /**
    * 文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentSetName")
    @Expose
    private String DocumentSetName;

    /**
    * 文件标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileTitle")
    @Expose
    private String FileTitle;

    /**
    * 文件元信息，为jsonstring
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMetaData")
    @Expose
    private String FileMetaData;

    /**
     * Get 给文件分配的 ID 信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentSetId 给文件分配的 ID 信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocumentSetId() {
        return this.DocumentSetId;
    }

    /**
     * Set 给文件分配的 ID 信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentSetId 给文件分配的 ID 信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentSetId(String DocumentSetId) {
        this.DocumentSetId = DocumentSetId;
    }

    /**
     * Get 文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentSetName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocumentSetName() {
        return this.DocumentSetName;
    }

    /**
     * Set 文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentSetName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentSetName(String DocumentSetName) {
        this.DocumentSetName = DocumentSetName;
    }

    /**
     * Get 文件标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileTitle 文件标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileTitle() {
        return this.FileTitle;
    }

    /**
     * Set 文件标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileTitle 文件标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileTitle(String FileTitle) {
        this.FileTitle = FileTitle;
    }

    /**
     * Get 文件元信息，为jsonstring
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMetaData 文件元信息，为jsonstring
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMetaData() {
        return this.FileMetaData;
    }

    /**
     * Set 文件元信息，为jsonstring
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMetaData 文件元信息，为jsonstring
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMetaData(String FileMetaData) {
        this.FileMetaData = FileMetaData;
    }

    public UploadKnowledgeDocumentSetRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadKnowledgeDocumentSetRsp(UploadKnowledgeDocumentSetRsp source) {
        if (source.DocumentSetId != null) {
            this.DocumentSetId = new String(source.DocumentSetId);
        }
        if (source.DocumentSetName != null) {
            this.DocumentSetName = new String(source.DocumentSetName);
        }
        if (source.FileTitle != null) {
            this.FileTitle = new String(source.FileTitle);
        }
        if (source.FileMetaData != null) {
            this.FileMetaData = new String(source.FileMetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocumentSetId", this.DocumentSetId);
        this.setParamSimple(map, prefix + "DocumentSetName", this.DocumentSetName);
        this.setParamSimple(map, prefix + "FileTitle", this.FileTitle);
        this.setParamSimple(map, prefix + "FileMetaData", this.FileMetaData);

    }
}

