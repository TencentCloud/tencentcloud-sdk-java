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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionArtifactDetail extends AbstractModel {

    /**
    * <p>物料ID</p>
    */
    @SerializedName("ArtifactId")
    @Expose
    private String ArtifactId;

    /**
    * <p>会话ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>AgentID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件沙箱内路径</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>文件字节数</p>
    */
    @SerializedName("FileSizeBytes")
    @Expose
    private Long FileSizeBytes;

    /**
    * <p>文件摘要值(Sha256)</p>
    */
    @SerializedName("FileSha256")
    @Expose
    private String FileSha256;

    /**
    * <p>物料状态</p><p>枚举值：</p><ul><li>PENDING： 处理中</li><li>READY： 准备完毕</li><li>FAILED： 失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间</p><p>参数格式：RFC3339 UTC</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>更新时间</p><p>参数格式：RFC3339 UTC</p>
    */
    @SerializedName("UploadedTime")
    @Expose
    private String UploadedTime;

    /**
    * <p>过期时间</p><p>参数格式：RFC3339 UTC</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
     * Get <p>物料ID</p> 
     * @return ArtifactId <p>物料ID</p>
     */
    public String getArtifactId() {
        return this.ArtifactId;
    }

    /**
     * Set <p>物料ID</p>
     * @param ArtifactId <p>物料ID</p>
     */
    public void setArtifactId(String ArtifactId) {
        this.ArtifactId = ArtifactId;
    }

    /**
     * Get <p>会话ID</p> 
     * @return SessionId <p>会话ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话ID</p>
     * @param SessionId <p>会话ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>AgentID</p> 
     * @return AgentId <p>AgentID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>AgentID</p>
     * @param AgentId <p>AgentID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>文件名</p> 
     * @return FileName <p>文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名</p>
     * @param FileName <p>文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件沙箱内路径</p> 
     * @return FilePath <p>文件沙箱内路径</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>文件沙箱内路径</p>
     * @param FilePath <p>文件沙箱内路径</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>文件字节数</p> 
     * @return FileSizeBytes <p>文件字节数</p>
     */
    public Long getFileSizeBytes() {
        return this.FileSizeBytes;
    }

    /**
     * Set <p>文件字节数</p>
     * @param FileSizeBytes <p>文件字节数</p>
     */
    public void setFileSizeBytes(Long FileSizeBytes) {
        this.FileSizeBytes = FileSizeBytes;
    }

    /**
     * Get <p>文件摘要值(Sha256)</p> 
     * @return FileSha256 <p>文件摘要值(Sha256)</p>
     */
    public String getFileSha256() {
        return this.FileSha256;
    }

    /**
     * Set <p>文件摘要值(Sha256)</p>
     * @param FileSha256 <p>文件摘要值(Sha256)</p>
     */
    public void setFileSha256(String FileSha256) {
        this.FileSha256 = FileSha256;
    }

    /**
     * Get <p>物料状态</p><p>枚举值：</p><ul><li>PENDING： 处理中</li><li>READY： 准备完毕</li><li>FAILED： 失败</li></ul> 
     * @return Status <p>物料状态</p><p>枚举值：</p><ul><li>PENDING： 处理中</li><li>READY： 准备完毕</li><li>FAILED： 失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>物料状态</p><p>枚举值：</p><ul><li>PENDING： 处理中</li><li>READY： 准备完毕</li><li>FAILED： 失败</li></ul>
     * @param Status <p>物料状态</p><p>枚举值：</p><ul><li>PENDING： 处理中</li><li>READY： 准备完毕</li><li>FAILED： 失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：RFC3339 UTC</p> 
     * @return CreatedTime <p>创建时间</p><p>参数格式：RFC3339 UTC</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：RFC3339 UTC</p>
     * @param CreatedTime <p>创建时间</p><p>参数格式：RFC3339 UTC</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：RFC3339 UTC</p> 
     * @return UploadedTime <p>更新时间</p><p>参数格式：RFC3339 UTC</p>
     */
    public String getUploadedTime() {
        return this.UploadedTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：RFC3339 UTC</p>
     * @param UploadedTime <p>更新时间</p><p>参数格式：RFC3339 UTC</p>
     */
    public void setUploadedTime(String UploadedTime) {
        this.UploadedTime = UploadedTime;
    }

    /**
     * Get <p>过期时间</p><p>参数格式：RFC3339 UTC</p> 
     * @return ExpiredTime <p>过期时间</p><p>参数格式：RFC3339 UTC</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>过期时间</p><p>参数格式：RFC3339 UTC</p>
     * @param ExpiredTime <p>过期时间</p><p>参数格式：RFC3339 UTC</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public SessionArtifactDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionArtifactDetail(SessionArtifactDetail source) {
        if (source.ArtifactId != null) {
            this.ArtifactId = new String(source.ArtifactId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileSizeBytes != null) {
            this.FileSizeBytes = new Long(source.FileSizeBytes);
        }
        if (source.FileSha256 != null) {
            this.FileSha256 = new String(source.FileSha256);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UploadedTime != null) {
            this.UploadedTime = new String(source.UploadedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArtifactId", this.ArtifactId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileSizeBytes", this.FileSizeBytes);
        this.setParamSimple(map, prefix + "FileSha256", this.FileSha256);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UploadedTime", this.UploadedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

