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

public class ModifyChunkRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>文件ID</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>切片ID</p>
    */
    @SerializedName("ChunkId")
    @Expose
    private String ChunkId;

    /**
    * <p>编辑后的文本</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>分段概要</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>知识库id</p>
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>文件ID</p> 
     * @return FileId <p>文件ID</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件ID</p>
     * @param FileId <p>文件ID</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>切片ID</p> 
     * @return ChunkId <p>切片ID</p>
     */
    public String getChunkId() {
        return this.ChunkId;
    }

    /**
     * Set <p>切片ID</p>
     * @param ChunkId <p>切片ID</p>
     */
    public void setChunkId(String ChunkId) {
        this.ChunkId = ChunkId;
    }

    /**
     * Get <p>编辑后的文本</p> 
     * @return Content <p>编辑后的文本</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>编辑后的文本</p>
     * @param Content <p>编辑后的文本</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>分段概要</p> 
     * @return Summary <p>分段概要</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>分段概要</p>
     * @param Summary <p>分段概要</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
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

    public ModifyChunkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyChunkRequest(ModifyChunkRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ChunkId != null) {
            this.ChunkId = new String(source.ChunkId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "ChunkId", this.ChunkId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);

    }
}

