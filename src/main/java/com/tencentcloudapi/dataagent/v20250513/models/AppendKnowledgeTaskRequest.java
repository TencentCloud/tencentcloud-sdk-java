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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppendKnowledgeTaskRequest extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>知识库id</p>
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * <p>文件id</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>追加的文档列表</p>
    */
    @SerializedName("Documents")
    @Expose
    private AppendDocument [] Documents;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>知识库id</p> 
     * @return KnowledgeBaseId <p>知识库id</p>
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set <p>知识库id</p>
     * @param KnowledgeBaseId <p>知识库id</p>
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get <p>文件id</p> 
     * @return FileId <p>文件id</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件id</p>
     * @param FileId <p>文件id</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>追加的文档列表</p> 
     * @return Documents <p>追加的文档列表</p>
     */
    public AppendDocument [] getDocuments() {
        return this.Documents;
    }

    /**
     * Set <p>追加的文档列表</p>
     * @param Documents <p>追加的文档列表</p>
     */
    public void setDocuments(AppendDocument [] Documents) {
        this.Documents = Documents;
    }

    public AppendKnowledgeTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppendKnowledgeTaskRequest(AppendKnowledgeTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Documents != null) {
            this.Documents = new AppendDocument[source.Documents.length];
            for (int i = 0; i < source.Documents.length; i++) {
                this.Documents[i] = new AppendDocument(source.Documents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamArrayObj(map, prefix + "Documents.", this.Documents);

    }
}

