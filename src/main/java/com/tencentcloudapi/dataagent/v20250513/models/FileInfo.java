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
    * <p>文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件大小，字节</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Float FileSize;

    /**
    * <p>文件类型,0=文本,1=表格，默认0</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>文件ID</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>状态，0：数据处理中  1：可用 -1：错误</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>操作者</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>分片策略</p>
    */
    @SerializedName("ChunkConfig")
    @Expose
    private KnowledgeTaskConfig ChunkConfig;

    /**
    * <p>文件来源0=unknow,1=user_cos,2=local</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>文件url</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>是否官方示例，0=否，1=是</p>
    */
    @SerializedName("IsShowCase")
    @Expose
    private Long IsShowCase;

    /**
    * <p>文档摘要</p>
    */
    @SerializedName("DocumentSummary")
    @Expose
    private String DocumentSummary;

    /**
    * <p>网页地址</p>
    */
    @SerializedName("WebUrl")
    @Expose
    private String WebUrl;

    /**
     * Get <p>文件名称</p> 
     * @return FileName <p>文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称</p>
     * @param FileName <p>文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件大小，字节</p> 
     * @return FileSize <p>文件大小，字节</p>
     */
    public Float getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小，字节</p>
     * @param FileSize <p>文件大小，字节</p>
     */
    public void setFileSize(Float FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>文件类型,0=文本,1=表格，默认0</p> 
     * @return Type <p>文件类型,0=文本,1=表格，默认0</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>文件类型,0=文本,1=表格，默认0</p>
     * @param Type <p>文件类型,0=文本,1=表格，默认0</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
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
     * Get <p>状态，0：数据处理中  1：可用 -1：错误</p> 
     * @return Status <p>状态，0：数据处理中  1：可用 -1：错误</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态，0：数据处理中  1：可用 -1：错误</p>
     * @param Status <p>状态，0：数据处理中  1：可用 -1：错误</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>操作者</p> 
     * @return CreateUser <p>操作者</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>操作者</p>
     * @param CreateUser <p>操作者</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>分片策略</p> 
     * @return ChunkConfig <p>分片策略</p>
     */
    public KnowledgeTaskConfig getChunkConfig() {
        return this.ChunkConfig;
    }

    /**
     * Set <p>分片策略</p>
     * @param ChunkConfig <p>分片策略</p>
     */
    public void setChunkConfig(KnowledgeTaskConfig ChunkConfig) {
        this.ChunkConfig = ChunkConfig;
    }

    /**
     * Get <p>文件来源0=unknow,1=user_cos,2=local</p> 
     * @return Source <p>文件来源0=unknow,1=user_cos,2=local</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>文件来源0=unknow,1=user_cos,2=local</p>
     * @param Source <p>文件来源0=unknow,1=user_cos,2=local</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>文件url</p> 
     * @return FileUrl <p>文件url</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>文件url</p>
     * @param FileUrl <p>文件url</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>是否官方示例，0=否，1=是</p> 
     * @return IsShowCase <p>是否官方示例，0=否，1=是</p>
     */
    public Long getIsShowCase() {
        return this.IsShowCase;
    }

    /**
     * Set <p>是否官方示例，0=否，1=是</p>
     * @param IsShowCase <p>是否官方示例，0=否，1=是</p>
     */
    public void setIsShowCase(Long IsShowCase) {
        this.IsShowCase = IsShowCase;
    }

    /**
     * Get <p>文档摘要</p> 
     * @return DocumentSummary <p>文档摘要</p>
     */
    public String getDocumentSummary() {
        return this.DocumentSummary;
    }

    /**
     * Set <p>文档摘要</p>
     * @param DocumentSummary <p>文档摘要</p>
     */
    public void setDocumentSummary(String DocumentSummary) {
        this.DocumentSummary = DocumentSummary;
    }

    /**
     * Get <p>网页地址</p> 
     * @return WebUrl <p>网页地址</p>
     */
    public String getWebUrl() {
        return this.WebUrl;
    }

    /**
     * Set <p>网页地址</p>
     * @param WebUrl <p>网页地址</p>
     */
    public void setWebUrl(String WebUrl) {
        this.WebUrl = WebUrl;
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
        if (source.WebUrl != null) {
            this.WebUrl = new String(source.WebUrl);
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
        this.setParamSimple(map, prefix + "WebUrl", this.WebUrl);

    }
}

