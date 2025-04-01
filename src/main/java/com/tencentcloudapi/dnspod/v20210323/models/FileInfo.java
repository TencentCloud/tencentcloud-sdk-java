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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfo extends AbstractModel {

    /**
    * 文件 id。
    */
    @SerializedName("FileId")
    @Expose
    private Long FileId;

    /**
    * 文件生成时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 文件最后更新时间。
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 文件涉及到的域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 文件名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件下载链接。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 生成文件的任务 id。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 生成文件的进度。100 表示 完成度为100%。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 文件状态。
OK：已完成
RUNNING：正在生成中
ERROR：生成失败
CANCELED：文件已取消生成
CANCELING：文件正在取消生成
EXPIRED：文件已过期
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 生成文件的任务类型。
RECORD_LOG：解析量数据
RECORD_EXPORT：导出解析记录
DOMAIN_EXPORT：导出域名列表
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 剩余时间
    */
    @SerializedName("LeftTime")
    @Expose
    private LeftTime LeftTime;

    /**
     * Get 文件 id。 
     * @return FileId 文件 id。
     */
    public Long getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件 id。
     * @param FileId 文件 id。
     */
    public void setFileId(Long FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件生成时间。 
     * @return CreatedOn 文件生成时间。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 文件生成时间。
     * @param CreatedOn 文件生成时间。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 文件最后更新时间。 
     * @return UpdatedOn 文件最后更新时间。
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 文件最后更新时间。
     * @param UpdatedOn 文件最后更新时间。
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 文件涉及到的域名。 
     * @return Domains 文件涉及到的域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 文件涉及到的域名。
     * @param Domains 文件涉及到的域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 文件名称。 
     * @return Name 文件名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件名称。
     * @param Name 文件名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件下载链接。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileUrl 文件下载链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件下载链接。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileUrl 文件下载链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 生成文件的任务 id。 
     * @return JobId 生成文件的任务 id。
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 生成文件的任务 id。
     * @param JobId 生成文件的任务 id。
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 生成文件的进度。100 表示 完成度为100%。 
     * @return Progress 生成文件的进度。100 表示 完成度为100%。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 生成文件的进度。100 表示 完成度为100%。
     * @param Progress 生成文件的进度。100 表示 完成度为100%。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 文件状态。
OK：已完成
RUNNING：正在生成中
ERROR：生成失败
CANCELED：文件已取消生成
CANCELING：文件正在取消生成
EXPIRED：文件已过期 
     * @return Status 文件状态。
OK：已完成
RUNNING：正在生成中
ERROR：生成失败
CANCELED：文件已取消生成
CANCELING：文件正在取消生成
EXPIRED：文件已过期
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 文件状态。
OK：已完成
RUNNING：正在生成中
ERROR：生成失败
CANCELED：文件已取消生成
CANCELING：文件正在取消生成
EXPIRED：文件已过期
     * @param Status 文件状态。
OK：已完成
RUNNING：正在生成中
ERROR：生成失败
CANCELED：文件已取消生成
CANCELING：文件正在取消生成
EXPIRED：文件已过期
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 生成文件的任务类型。
RECORD_LOG：解析量数据
RECORD_EXPORT：导出解析记录
DOMAIN_EXPORT：导出域名列表 
     * @return Type 生成文件的任务类型。
RECORD_LOG：解析量数据
RECORD_EXPORT：导出解析记录
DOMAIN_EXPORT：导出域名列表
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 生成文件的任务类型。
RECORD_LOG：解析量数据
RECORD_EXPORT：导出解析记录
DOMAIN_EXPORT：导出域名列表
     * @param Type 生成文件的任务类型。
RECORD_LOG：解析量数据
RECORD_EXPORT：导出解析记录
DOMAIN_EXPORT：导出域名列表
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 剩余时间 
     * @return LeftTime 剩余时间
     */
    public LeftTime getLeftTime() {
        return this.LeftTime;
    }

    /**
     * Set 剩余时间
     * @param LeftTime 剩余时间
     */
    public void setLeftTime(LeftTime LeftTime) {
        this.LeftTime = LeftTime;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.FileId != null) {
            this.FileId = new Long(source.FileId);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LeftTime != null) {
            this.LeftTime = new LeftTime(source.LeftTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "LeftTime.", this.LeftTime);

    }
}

