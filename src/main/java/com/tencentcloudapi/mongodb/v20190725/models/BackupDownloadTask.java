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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupDownloadTask extends AbstractModel{

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 备份文件名
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 分片名称
    */
    @SerializedName("ReplicaSetId")
    @Expose
    private String ReplicaSetId;

    /**
    * 备份数据大小，单位为字节
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * 任务状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务进度百分比
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 耗时，单位为秒
    */
    @SerializedName("TimeSpend")
    @Expose
    private Long TimeSpend;

    /**
    * 备份数据下载链接
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 备份文件备份类型，0-逻辑备份，1-物理备份
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * 发起备份时指定的备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupDesc")
    @Expose
    private String BackupDesc;

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 备份文件名 
     * @return BackupName 备份文件名
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份文件名
     * @param BackupName 备份文件名
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 分片名称 
     * @return ReplicaSetId 分片名称
     */
    public String getReplicaSetId() {
        return this.ReplicaSetId;
    }

    /**
     * Set 分片名称
     * @param ReplicaSetId 分片名称
     */
    public void setReplicaSetId(String ReplicaSetId) {
        this.ReplicaSetId = ReplicaSetId;
    }

    /**
     * Get 备份数据大小，单位为字节 
     * @return BackupSize 备份数据大小，单位为字节
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set 备份数据大小，单位为字节
     * @param BackupSize 备份数据大小，单位为字节
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get 任务状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试 
     * @return Status 任务状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试
     * @param Status 任务状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务进度百分比 
     * @return Percent 任务进度百分比
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 任务进度百分比
     * @param Percent 任务进度百分比
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 耗时，单位为秒 
     * @return TimeSpend 耗时，单位为秒
     */
    public Long getTimeSpend() {
        return this.TimeSpend;
    }

    /**
     * Set 耗时，单位为秒
     * @param TimeSpend 耗时，单位为秒
     */
    public void setTimeSpend(Long TimeSpend) {
        this.TimeSpend = TimeSpend;
    }

    /**
     * Get 备份数据下载链接 
     * @return Url 备份数据下载链接
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 备份数据下载链接
     * @param Url 备份数据下载链接
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 备份文件备份类型，0-逻辑备份，1-物理备份 
     * @return BackupMethod 备份文件备份类型，0-逻辑备份，1-物理备份
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份文件备份类型，0-逻辑备份，1-物理备份
     * @param BackupMethod 备份文件备份类型，0-逻辑备份，1-物理备份
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 发起备份时指定的备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupDesc 发起备份时指定的备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupDesc() {
        return this.BackupDesc;
    }

    /**
     * Set 发起备份时指定的备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupDesc 发起备份时指定的备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupDesc(String BackupDesc) {
        this.BackupDesc = BackupDesc;
    }

    public BackupDownloadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupDownloadTask(BackupDownloadTask source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.ReplicaSetId != null) {
            this.ReplicaSetId = new String(source.ReplicaSetId);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.TimeSpend != null) {
            this.TimeSpend = new Long(source.TimeSpend);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackupDesc != null) {
            this.BackupDesc = new String(source.BackupDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "ReplicaSetId", this.ReplicaSetId);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "TimeSpend", this.TimeSpend);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupDesc", this.BackupDesc);

    }
}

