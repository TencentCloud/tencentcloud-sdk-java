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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationFileInfo extends AbstractModel {

    /**
    * <p>文件创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>文档业务 ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件大小</p>
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * <p>文件类型</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>文件下载链接</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>文件在沙箱中的原始路径</p>
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * <p>文件审核状态</p><p>枚举值：</p><ul><li>1： 审核中</li><li>2： 审核通过</li><li>3： 审核不通过</li></ul>
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
     * Get <p>文件创建时间</p> 
     * @return CreateTime <p>文件创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>文件创建时间</p>
     * @param CreateTime <p>文件创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>文档业务 ID</p> 
     * @return DocId <p>文档业务 ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>文档业务 ID</p>
     * @param DocId <p>文档业务 ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
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
     * Get <p>文件大小</p> 
     * @return FileSize <p>文件大小</p>
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小</p>
     * @param FileSize <p>文件大小</p>
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>文件类型</p> 
     * @return FileType <p>文件类型</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型</p>
     * @param FileType <p>文件类型</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>文件下载链接</p> 
     * @return FileUrl <p>文件下载链接</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>文件下载链接</p>
     * @param FileUrl <p>文件下载链接</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>文件在沙箱中的原始路径</p> 
     * @return LocalPath <p>文件在沙箱中的原始路径</p>
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set <p>文件在沙箱中的原始路径</p>
     * @param LocalPath <p>文件在沙箱中的原始路径</p>
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get <p>文件审核状态</p><p>枚举值：</p><ul><li>1： 审核中</li><li>2： 审核通过</li><li>3： 审核不通过</li></ul> 
     * @return AuditStatus <p>文件审核状态</p><p>枚举值：</p><ul><li>1： 审核中</li><li>2： 审核通过</li><li>3： 审核不通过</li></ul>
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set <p>文件审核状态</p><p>枚举值：</p><ul><li>1： 审核中</li><li>2： 审核通过</li><li>3： 审核不通过</li></ul>
     * @param AuditStatus <p>文件审核状态</p><p>枚举值：</p><ul><li>1： 审核中</li><li>2： 审核通过</li><li>3： 审核不通过</li></ul>
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    public ConversationFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationFileInfo(ConversationFileInfo source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);

    }
}

