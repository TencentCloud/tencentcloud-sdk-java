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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFile extends AbstractModel{

    /**
    * 审计日志文件生成异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * 审计日志文件名称。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 审计日志文件创建时间。格式为 : "2019-03-20 17:09:13"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文件状态值。可能返回的值为：
"creating" - 生成中;
"failed" - 创建失败;
"success" - 已生成;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 文件大小，单位为 KB。
    */
    @SerializedName("FileSize")
    @Expose
    private Float FileSize;

    /**
    * 审计日志下载地址。
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 错误信息。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 文件生成进度。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 文件生成成功时间。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get 审计日志文件生成异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsyncRequestId 审计日志文件生成异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 审计日志文件生成异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsyncRequestId 审计日志文件生成异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get 审计日志文件名称。 
     * @return FileName 审计日志文件名称。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 审计日志文件名称。
     * @param FileName 审计日志文件名称。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 审计日志文件创建时间。格式为 : "2019-03-20 17:09:13"。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 审计日志文件创建时间。格式为 : "2019-03-20 17:09:13"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 审计日志文件创建时间。格式为 : "2019-03-20 17:09:13"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 审计日志文件创建时间。格式为 : "2019-03-20 17:09:13"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 文件状态值。可能返回的值为：
"creating" - 生成中;
"failed" - 创建失败;
"success" - 已生成;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 文件状态值。可能返回的值为：
"creating" - 生成中;
"failed" - 创建失败;
"success" - 已生成;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 文件状态值。可能返回的值为：
"creating" - 生成中;
"failed" - 创建失败;
"success" - 已生成;
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 文件状态值。可能返回的值为：
"creating" - 生成中;
"failed" - 创建失败;
"success" - 已生成;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 文件大小，单位为 KB。 
     * @return FileSize 文件大小，单位为 KB。
     */
    public Float getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位为 KB。
     * @param FileSize 文件大小，单位为 KB。
     */
    public void setFileSize(Float FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 审计日志下载地址。 
     * @return DownloadUrl 审计日志下载地址。
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 审计日志下载地址。
     * @param DownloadUrl 审计日志下载地址。
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 错误信息。 
     * @return ErrMsg 错误信息。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息。
     * @param ErrMsg 错误信息。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 文件生成进度。 
     * @return Progress 文件生成进度。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 文件生成进度。
     * @param Progress 文件生成进度。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 文件生成成功时间。 
     * @return FinishTime 文件生成成功时间。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 文件生成成功时间。
     * @param FinishTime 文件生成成功时间。
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
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileSize != null) {
            this.FileSize = new Float(source.FileSize);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

