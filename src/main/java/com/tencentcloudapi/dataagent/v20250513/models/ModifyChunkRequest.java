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
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 文件ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 切片ID
    */
    @SerializedName("ChunkId")
    @Expose
    private String ChunkId;

    /**
    * 编辑后的文本
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 知识库id
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 文件ID 
     * @return FileId 文件ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID
     * @param FileId 文件ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 切片ID 
     * @return ChunkId 切片ID
     */
    public String getChunkId() {
        return this.ChunkId;
    }

    /**
     * Set 切片ID
     * @param ChunkId 切片ID
     */
    public void setChunkId(String ChunkId) {
        this.ChunkId = ChunkId;
    }

    /**
     * Get 编辑后的文本 
     * @return Content 编辑后的文本
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 编辑后的文本
     * @param Content 编辑后的文本
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 知识库id 
     * @return KnowledgeBaseId 知识库id
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 知识库id
     * @param KnowledgeBaseId 知识库id
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
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);

    }
}

