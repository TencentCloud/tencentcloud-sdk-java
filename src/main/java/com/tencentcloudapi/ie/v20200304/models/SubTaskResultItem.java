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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubTaskResultItem extends AbstractModel{

    /**
    * 子任务名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 子任务状态。
0：成功；
1：执行中；
其他值：失败。
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 子任务状态描述。
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * 子任务进度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgressRate")
    @Expose
    private Long ProgressRate;

    /**
    * 画质重生处理后文件的下载地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 画质重生处理后文件的MD5。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 画质重生处理后文件的详细信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileInfo")
    @Expose
    private FileInfo FileInfo;

    /**
     * Get 子任务名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 子任务名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 子任务名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 子任务名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 子任务状态。
0：成功；
1：执行中；
其他值：失败。 
     * @return StatusCode 子任务状态。
0：成功；
1：执行中；
其他值：失败。
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 子任务状态。
0：成功；
1：执行中；
其他值：失败。
     * @param StatusCode 子任务状态。
0：成功；
1：执行中；
其他值：失败。
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 子任务状态描述。 
     * @return StatusMsg 子任务状态描述。
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set 子任务状态描述。
     * @param StatusMsg 子任务状态描述。
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get 子任务进度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgressRate 子任务进度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProgressRate() {
        return this.ProgressRate;
    }

    /**
     * Set 子任务进度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgressRate 子任务进度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgressRate(Long ProgressRate) {
        this.ProgressRate = ProgressRate;
    }

    /**
     * Get 画质重生处理后文件的下载地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadUrl 画质重生处理后文件的下载地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 画质重生处理后文件的下载地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadUrl 画质重生处理后文件的下载地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 画质重生处理后文件的MD5。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Md5 画质重生处理后文件的MD5。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 画质重生处理后文件的MD5。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5 画质重生处理后文件的MD5。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 画质重生处理后文件的详细信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileInfo 画质重生处理后文件的详细信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo getFileInfo() {
        return this.FileInfo;
    }

    /**
     * Set 画质重生处理后文件的详细信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileInfo 画质重生处理后文件的详细信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileInfo(FileInfo FileInfo) {
        this.FileInfo = FileInfo;
    }

    public SubTaskResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubTaskResultItem(SubTaskResultItem source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.StatusMsg != null) {
            this.StatusMsg = new String(source.StatusMsg);
        }
        if (source.ProgressRate != null) {
            this.ProgressRate = new Long(source.ProgressRate);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.FileInfo != null) {
            this.FileInfo = new FileInfo(source.FileInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "StatusMsg", this.StatusMsg);
        this.setParamSimple(map, prefix + "ProgressRate", this.ProgressRate);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamObj(map, prefix + "FileInfo.", this.FileInfo);

    }
}

