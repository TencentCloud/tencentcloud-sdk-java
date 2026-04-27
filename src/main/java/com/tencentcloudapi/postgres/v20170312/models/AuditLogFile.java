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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFile extends AbstractModel {

    /**
    * <p>文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>running： 创建中</li><li>failed： 失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>文件大小</p><p>单位：MB</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>下载链接</p>
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>下载进度</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>完成时间</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

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
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>running： 创建中</li><li>failed： 失败</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>running： 创建中</li><li>failed： 失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>running： 创建中</li><li>failed： 失败</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>running： 创建中</li><li>failed： 失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>文件大小</p><p>单位：MB</p> 
     * @return FileSize <p>文件大小</p><p>单位：MB</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小</p><p>单位：MB</p>
     * @param FileSize <p>文件大小</p><p>单位：MB</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
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
     * Get <p>下载链接</p> 
     * @return DownloadUrl <p>下载链接</p>
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set <p>下载链接</p>
     * @param DownloadUrl <p>下载链接</p>
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrMsg <p>错误信息</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrMsg <p>错误信息</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>下载进度</p> 
     * @return Progress <p>下载进度</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>下载进度</p>
     * @param Progress <p>下载进度</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>完成时间</p> 
     * @return FinishTime <p>完成时间</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>完成时间</p>
     * @param FinishTime <p>完成时间</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AuditLogFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogFile(AuditLogFile source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

