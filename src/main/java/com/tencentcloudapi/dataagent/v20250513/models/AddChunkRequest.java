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

public class AddChunkRequest extends AbstractModel {

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
    * 新增chunk的后面一个ChunkID。如果是空就是插到队尾。插入位置的下一个 chunkId。如果插到最前面，传入原切片的第一个。
    */
    @SerializedName("BeforeChunkId")
    @Expose
    private String BeforeChunkId;

    /**
    * 显式指定的位置,实际的位置。从 0 开始计算。0 代表插到最前面，chunk total 代表插到最后面。
    */
    @SerializedName("InsertPos")
    @Expose
    private Long InsertPos;

    /**
    * chunk内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 新 Chunk 插入到目标 Chunk ​之后的位置。插入位置的上一个 chunkId
    */
    @SerializedName("AfterChunkId")
    @Expose
    private String AfterChunkId;

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
     * Get 新增chunk的后面一个ChunkID。如果是空就是插到队尾。插入位置的下一个 chunkId。如果插到最前面，传入原切片的第一个。 
     * @return BeforeChunkId 新增chunk的后面一个ChunkID。如果是空就是插到队尾。插入位置的下一个 chunkId。如果插到最前面，传入原切片的第一个。
     */
    public String getBeforeChunkId() {
        return this.BeforeChunkId;
    }

    /**
     * Set 新增chunk的后面一个ChunkID。如果是空就是插到队尾。插入位置的下一个 chunkId。如果插到最前面，传入原切片的第一个。
     * @param BeforeChunkId 新增chunk的后面一个ChunkID。如果是空就是插到队尾。插入位置的下一个 chunkId。如果插到最前面，传入原切片的第一个。
     */
    public void setBeforeChunkId(String BeforeChunkId) {
        this.BeforeChunkId = BeforeChunkId;
    }

    /**
     * Get 显式指定的位置,实际的位置。从 0 开始计算。0 代表插到最前面，chunk total 代表插到最后面。 
     * @return InsertPos 显式指定的位置,实际的位置。从 0 开始计算。0 代表插到最前面，chunk total 代表插到最后面。
     */
    public Long getInsertPos() {
        return this.InsertPos;
    }

    /**
     * Set 显式指定的位置,实际的位置。从 0 开始计算。0 代表插到最前面，chunk total 代表插到最后面。
     * @param InsertPos 显式指定的位置,实际的位置。从 0 开始计算。0 代表插到最前面，chunk total 代表插到最后面。
     */
    public void setInsertPos(Long InsertPos) {
        this.InsertPos = InsertPos;
    }

    /**
     * Get chunk内容 
     * @return Content chunk内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set chunk内容
     * @param Content chunk内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 新 Chunk 插入到目标 Chunk ​之后的位置。插入位置的上一个 chunkId 
     * @return AfterChunkId 新 Chunk 插入到目标 Chunk ​之后的位置。插入位置的上一个 chunkId
     */
    public String getAfterChunkId() {
        return this.AfterChunkId;
    }

    /**
     * Set 新 Chunk 插入到目标 Chunk ​之后的位置。插入位置的上一个 chunkId
     * @param AfterChunkId 新 Chunk 插入到目标 Chunk ​之后的位置。插入位置的上一个 chunkId
     */
    public void setAfterChunkId(String AfterChunkId) {
        this.AfterChunkId = AfterChunkId;
    }

    public AddChunkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddChunkRequest(AddChunkRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.BeforeChunkId != null) {
            this.BeforeChunkId = new String(source.BeforeChunkId);
        }
        if (source.InsertPos != null) {
            this.InsertPos = new Long(source.InsertPos);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.AfterChunkId != null) {
            this.AfterChunkId = new String(source.AfterChunkId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "BeforeChunkId", this.BeforeChunkId);
        this.setParamSimple(map, prefix + "InsertPos", this.InsertPos);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "AfterChunkId", this.AfterChunkId);

    }
}

