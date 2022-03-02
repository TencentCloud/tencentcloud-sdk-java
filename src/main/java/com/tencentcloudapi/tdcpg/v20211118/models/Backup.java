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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Backup extends AbstractModel{

    /**
    * 备份集ID，集群内唯一
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * 备份集类型，目前只支持 SNAPSHOT：快照
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份集产生的方案，目前只支持 AUTO：自动
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 备份集对应的数据时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
    */
    @SerializedName("BackupDataTime")
    @Expose
    private String BackupDataTime;

    /**
    * 备份集数据大小，单位GiB
    */
    @SerializedName("BackupDataSize")
    @Expose
    private Long BackupDataSize;

    /**
    * 备份集对应的任务开始时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
    */
    @SerializedName("BackupTaskStartTime")
    @Expose
    private String BackupTaskStartTime;

    /**
    * 备份集对应的任务结束时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
    */
    @SerializedName("BackupTaskEndTime")
    @Expose
    private String BackupTaskEndTime;

    /**
    * 备份集对应的任务状态  SUCCESS：成功
    */
    @SerializedName("BackupTaskStatus")
    @Expose
    private String BackupTaskStatus;

    /**
     * Get 备份集ID，集群内唯一 
     * @return BackupId 备份集ID，集群内唯一
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份集ID，集群内唯一
     * @param BackupId 备份集ID，集群内唯一
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份集类型，目前只支持 SNAPSHOT：快照 
     * @return BackupType 备份集类型，目前只支持 SNAPSHOT：快照
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份集类型，目前只支持 SNAPSHOT：快照
     * @param BackupType 备份集类型，目前只支持 SNAPSHOT：快照
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份集产生的方案，目前只支持 AUTO：自动 
     * @return BackupMethod 备份集产生的方案，目前只支持 AUTO：自动
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份集产生的方案，目前只支持 AUTO：自动
     * @param BackupMethod 备份集产生的方案，目前只支持 AUTO：自动
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 备份集对应的数据时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。 
     * @return BackupDataTime 备份集对应的数据时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public String getBackupDataTime() {
        return this.BackupDataTime;
    }

    /**
     * Set 备份集对应的数据时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     * @param BackupDataTime 备份集对应的数据时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public void setBackupDataTime(String BackupDataTime) {
        this.BackupDataTime = BackupDataTime;
    }

    /**
     * Get 备份集数据大小，单位GiB 
     * @return BackupDataSize 备份集数据大小，单位GiB
     */
    public Long getBackupDataSize() {
        return this.BackupDataSize;
    }

    /**
     * Set 备份集数据大小，单位GiB
     * @param BackupDataSize 备份集数据大小，单位GiB
     */
    public void setBackupDataSize(Long BackupDataSize) {
        this.BackupDataSize = BackupDataSize;
    }

    /**
     * Get 备份集对应的任务开始时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。 
     * @return BackupTaskStartTime 备份集对应的任务开始时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public String getBackupTaskStartTime() {
        return this.BackupTaskStartTime;
    }

    /**
     * Set 备份集对应的任务开始时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     * @param BackupTaskStartTime 备份集对应的任务开始时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public void setBackupTaskStartTime(String BackupTaskStartTime) {
        this.BackupTaskStartTime = BackupTaskStartTime;
    }

    /**
     * Get 备份集对应的任务结束时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。 
     * @return BackupTaskEndTime 备份集对应的任务结束时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public String getBackupTaskEndTime() {
        return this.BackupTaskEndTime;
    }

    /**
     * Set 备份集对应的任务结束时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     * @param BackupTaskEndTime 备份集对应的任务结束时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public void setBackupTaskEndTime(String BackupTaskEndTime) {
        this.BackupTaskEndTime = BackupTaskEndTime;
    }

    /**
     * Get 备份集对应的任务状态  SUCCESS：成功 
     * @return BackupTaskStatus 备份集对应的任务状态  SUCCESS：成功
     */
    public String getBackupTaskStatus() {
        return this.BackupTaskStatus;
    }

    /**
     * Set 备份集对应的任务状态  SUCCESS：成功
     * @param BackupTaskStatus 备份集对应的任务状态  SUCCESS：成功
     */
    public void setBackupTaskStatus(String BackupTaskStatus) {
        this.BackupTaskStatus = BackupTaskStatus;
    }

    public Backup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Backup(Backup source) {
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupDataTime != null) {
            this.BackupDataTime = new String(source.BackupDataTime);
        }
        if (source.BackupDataSize != null) {
            this.BackupDataSize = new Long(source.BackupDataSize);
        }
        if (source.BackupTaskStartTime != null) {
            this.BackupTaskStartTime = new String(source.BackupTaskStartTime);
        }
        if (source.BackupTaskEndTime != null) {
            this.BackupTaskEndTime = new String(source.BackupTaskEndTime);
        }
        if (source.BackupTaskStatus != null) {
            this.BackupTaskStatus = new String(source.BackupTaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupDataTime", this.BackupDataTime);
        this.setParamSimple(map, prefix + "BackupDataSize", this.BackupDataSize);
        this.setParamSimple(map, prefix + "BackupTaskStartTime", this.BackupTaskStartTime);
        this.setParamSimple(map, prefix + "BackupTaskEndTime", this.BackupTaskEndTime);
        this.setParamSimple(map, prefix + "BackupTaskStatus", this.BackupTaskStatus);

    }
}

