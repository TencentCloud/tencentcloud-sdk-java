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

public class FileInfo extends AbstractModel {

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小，字节
    */
    @SerializedName("FileSize")
    @Expose
    private Float FileSize;

    /**
    * 文件类型,0=文本,1=表格，默认0

    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 文件ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 状态，0：数据处理中  1：可用 -1：错误
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 操作者

    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 分片策略
    */
    @SerializedName("ChunkConfig")
    @Expose
    private KnowledgeTaskConfig ChunkConfig;

    /**
    * 文件来源0=unknow,1=user_cos,2=local
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 文件url
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 是否官方示例，0=否，1=是
    */
    @SerializedName("IsShowCase")
    @Expose
    private Long IsShowCase;

    /**
    * 文档摘要
    */
    @SerializedName("DocumentSummary")
    @Expose
    private String DocumentSummary;

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小，字节 
     * @return FileSize 文件大小，字节
     */
    public Float getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，字节
     * @param FileSize 文件大小，字节
     */
    public void setFileSize(Float FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件类型,0=文本,1=表格，默认0
 
     * @return Type 文件类型,0=文本,1=表格，默认0

     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 文件类型,0=文本,1=表格，默认0

     * @param Type 文件类型,0=文本,1=表格，默认0

     */
    public void setType(Long Type) {
        this.Type = Type;
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
     * Get 状态，0：数据处理中  1：可用 -1：错误 
     * @return Status 状态，0：数据处理中  1：可用 -1：错误
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，0：数据处理中  1：可用 -1：错误
     * @param Status 状态，0：数据处理中  1：可用 -1：错误
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 操作者
 
     * @return CreateUser 操作者

     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set 操作者

     * @param CreateUser 操作者

     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 分片策略 
     * @return ChunkConfig 分片策略
     */
    public KnowledgeTaskConfig getChunkConfig() {
        return this.ChunkConfig;
    }

    /**
     * Set 分片策略
     * @param ChunkConfig 分片策略
     */
    public void setChunkConfig(KnowledgeTaskConfig ChunkConfig) {
        this.ChunkConfig = ChunkConfig;
    }

    /**
     * Get 文件来源0=unknow,1=user_cos,2=local 
     * @return Source 文件来源0=unknow,1=user_cos,2=local
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 文件来源0=unknow,1=user_cos,2=local
     * @param Source 文件来源0=unknow,1=user_cos,2=local
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 文件url 
     * @return FileUrl 文件url
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件url
     * @param FileUrl 文件url
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 是否官方示例，0=否，1=是 
     * @return IsShowCase 是否官方示例，0=否，1=是
     */
    public Long getIsShowCase() {
        return this.IsShowCase;
    }

    /**
     * Set 是否官方示例，0=否，1=是
     * @param IsShowCase 是否官方示例，0=否，1=是
     */
    public void setIsShowCase(Long IsShowCase) {
        this.IsShowCase = IsShowCase;
    }

    /**
     * Get 文档摘要 
     * @return DocumentSummary 文档摘要
     */
    public String getDocumentSummary() {
        return this.DocumentSummary;
    }

    /**
     * Set 文档摘要
     * @param DocumentSummary 文档摘要
     */
    public void setDocumentSummary(String DocumentSummary) {
        this.DocumentSummary = DocumentSummary;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Float(source.FileSize);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ChunkConfig != null) {
            this.ChunkConfig = new KnowledgeTaskConfig(source.ChunkConfig);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.IsShowCase != null) {
            this.IsShowCase = new Long(source.IsShowCase);
        }
        if (source.DocumentSummary != null) {
            this.DocumentSummary = new String(source.DocumentSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "ChunkConfig.", this.ChunkConfig);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "IsShowCase", this.IsShowCase);
        this.setParamSimple(map, prefix + "DocumentSummary", this.DocumentSummary);

    }
}

