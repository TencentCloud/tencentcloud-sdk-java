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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotResult extends AbstractModel {

    /**
    * 表格所属表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表格名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 任务ID，对于创建单任务的接口有效
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 错误信息
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * 快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照的时间点
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
    * 快照的过期时间点
    */
    @SerializedName("SnapshotDeadTime")
    @Expose
    private String SnapshotDeadTime;

    /**
    * 快照创建时间点
    */
    @SerializedName("SnapshotCreateTime")
    @Expose
    private String SnapshotCreateTime;

    /**
    * 快照大小
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Long SnapshotSize;

    /**
    * 快照状态，0 生成中 1 正常 2 删除中 3 已失效 4 回档使用中
    */
    @SerializedName("SnapshotStatus")
    @Expose
    private Long SnapshotStatus;

    /**
    * 申请单ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
     * Get 表格所属表格组ID 
     * @return TableGroupId 表格所属表格组ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格所属表格组ID
     * @param TableGroupId 表格所属表格组ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表格名称 
     * @return TableName 表格名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名称
     * @param TableName 表格名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 任务ID，对于创建单任务的接口有效 
     * @return TaskId 任务ID，对于创建单任务的接口有效
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，对于创建单任务的接口有效
     * @param TaskId 任务ID，对于创建单任务的接口有效
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 错误信息 
     * @return Error 错误信息
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
     * @param Error 错误信息
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get 快照名称 
     * @return SnapshotName 快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称
     * @param SnapshotName 快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 快照的时间点 
     * @return SnapshotTime 快照的时间点
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set 快照的时间点
     * @param SnapshotTime 快照的时间点
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    /**
     * Get 快照的过期时间点 
     * @return SnapshotDeadTime 快照的过期时间点
     */
    public String getSnapshotDeadTime() {
        return this.SnapshotDeadTime;
    }

    /**
     * Set 快照的过期时间点
     * @param SnapshotDeadTime 快照的过期时间点
     */
    public void setSnapshotDeadTime(String SnapshotDeadTime) {
        this.SnapshotDeadTime = SnapshotDeadTime;
    }

    /**
     * Get 快照创建时间点 
     * @return SnapshotCreateTime 快照创建时间点
     */
    public String getSnapshotCreateTime() {
        return this.SnapshotCreateTime;
    }

    /**
     * Set 快照创建时间点
     * @param SnapshotCreateTime 快照创建时间点
     */
    public void setSnapshotCreateTime(String SnapshotCreateTime) {
        this.SnapshotCreateTime = SnapshotCreateTime;
    }

    /**
     * Get 快照大小 
     * @return SnapshotSize 快照大小
     */
    public Long getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * Set 快照大小
     * @param SnapshotSize 快照大小
     */
    public void setSnapshotSize(Long SnapshotSize) {
        this.SnapshotSize = SnapshotSize;
    }

    /**
     * Get 快照状态，0 生成中 1 正常 2 删除中 3 已失效 4 回档使用中 
     * @return SnapshotStatus 快照状态，0 生成中 1 正常 2 删除中 3 已失效 4 回档使用中
     */
    public Long getSnapshotStatus() {
        return this.SnapshotStatus;
    }

    /**
     * Set 快照状态，0 生成中 1 正常 2 删除中 3 已失效 4 回档使用中
     * @param SnapshotStatus 快照状态，0 生成中 1 正常 2 删除中 3 已失效 4 回档使用中
     */
    public void setSnapshotStatus(Long SnapshotStatus) {
        this.SnapshotStatus = SnapshotStatus;
    }

    /**
     * Get 申请单ID 
     * @return ApplicationId 申请单ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 申请单ID
     * @param ApplicationId 申请单ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    public SnapshotResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotResult(SnapshotResult source) {
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
        }
        if (source.SnapshotDeadTime != null) {
            this.SnapshotDeadTime = new String(source.SnapshotDeadTime);
        }
        if (source.SnapshotCreateTime != null) {
            this.SnapshotCreateTime = new String(source.SnapshotCreateTime);
        }
        if (source.SnapshotSize != null) {
            this.SnapshotSize = new Long(source.SnapshotSize);
        }
        if (source.SnapshotStatus != null) {
            this.SnapshotStatus = new Long(source.SnapshotStatus);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);
        this.setParamSimple(map, prefix + "SnapshotDeadTime", this.SnapshotDeadTime);
        this.setParamSimple(map, prefix + "SnapshotCreateTime", this.SnapshotCreateTime);
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);
        this.setParamSimple(map, prefix + "SnapshotStatus", this.SnapshotStatus);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);

    }
}

