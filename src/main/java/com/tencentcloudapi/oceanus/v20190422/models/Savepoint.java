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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Savepoint extends AbstractModel {

    /**
    * <p>主键</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private Long VersionId;

    /**
    * <p>状态 1: Active; 2: Expired; 3: InProgress; 4: Failed; 5: Timeout</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>大小</p><p>单位：Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordType")
    @Expose
    private Long RecordType;

    /**
    * <p>运行作业实例的顺序 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobRuntimeId")
    @Expose
    private Long JobRuntimeId;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>固定超时时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>快照 serialId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * <p>耗时</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeConsuming")
    @Expose
    private Long TimeConsuming;

    /**
    * <p>快照路径状态 1：可用；2：不可用；</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathStatus")
    @Expose
    private Long PathStatus;

    /**
    * <p>Flink版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * <p>CheckPoint是否增量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIncremental")
    @Expose
    private String IsIncremental;

    /**
    * <p>checkpoint 大小</p><p>单位：Byte</p>
    */
    @SerializedName("CheckpointSize")
    @Expose
    private Long CheckpointSize;

    /**
     * Get <p>主键</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>主键</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>主键</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(Long VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>状态 1: Active; 2: Expired; 3: InProgress; 4: Failed; 5: Timeout</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态 1: Active; 2: Expired; 3: InProgress; 4: Failed; 5: Timeout</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态 1: Active; 2: Expired; 3: InProgress; 4: Failed; 5: Timeout</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态 1: Active; 2: Expired; 3: InProgress; 4: Failed; 5: Timeout</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>大小</p><p>单位：Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size <p>大小</p><p>单位：Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>大小</p><p>单位：Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size <p>大小</p><p>单位：Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordType <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordType() {
        return this.RecordType;
    }

    /**
     * Set <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordType <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordType(Long RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get <p>运行作业实例的顺序 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobRuntimeId <p>运行作业实例的顺序 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobRuntimeId() {
        return this.JobRuntimeId;
    }

    /**
     * Set <p>运行作业实例的顺序 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobRuntimeId <p>运行作业实例的顺序 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobRuntimeId(Long JobRuntimeId) {
        this.JobRuntimeId = JobRuntimeId;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>固定超时时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout <p>固定超时时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>固定超时时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout <p>固定超时时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>快照 serialId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialId <p>快照 serialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set <p>快照 serialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialId <p>快照 serialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get <p>耗时</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeConsuming <p>耗时</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeConsuming() {
        return this.TimeConsuming;
    }

    /**
     * Set <p>耗时</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeConsuming <p>耗时</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeConsuming(Long TimeConsuming) {
        this.TimeConsuming = TimeConsuming;
    }

    /**
     * Get <p>快照路径状态 1：可用；2：不可用；</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathStatus <p>快照路径状态 1：可用；2：不可用；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPathStatus() {
        return this.PathStatus;
    }

    /**
     * Set <p>快照路径状态 1：可用；2：不可用；</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathStatus <p>快照路径状态 1：可用；2：不可用；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathStatus(Long PathStatus) {
        this.PathStatus = PathStatus;
    }

    /**
     * Get <p>Flink版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlinkVersion <p>Flink版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set <p>Flink版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlinkVersion <p>Flink版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get <p>CheckPoint是否增量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIncremental <p>CheckPoint是否增量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsIncremental() {
        return this.IsIncremental;
    }

    /**
     * Set <p>CheckPoint是否增量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIncremental <p>CheckPoint是否增量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIncremental(String IsIncremental) {
        this.IsIncremental = IsIncremental;
    }

    /**
     * Get <p>checkpoint 大小</p><p>单位：Byte</p> 
     * @return CheckpointSize <p>checkpoint 大小</p><p>单位：Byte</p>
     */
    public Long getCheckpointSize() {
        return this.CheckpointSize;
    }

    /**
     * Set <p>checkpoint 大小</p><p>单位：Byte</p>
     * @param CheckpointSize <p>checkpoint 大小</p><p>单位：Byte</p>
     */
    public void setCheckpointSize(Long CheckpointSize) {
        this.CheckpointSize = CheckpointSize;
    }

    public Savepoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Savepoint(Savepoint source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.VersionId != null) {
            this.VersionId = new Long(source.VersionId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.RecordType != null) {
            this.RecordType = new Long(source.RecordType);
        }
        if (source.JobRuntimeId != null) {
            this.JobRuntimeId = new Long(source.JobRuntimeId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
        }
        if (source.TimeConsuming != null) {
            this.TimeConsuming = new Long(source.TimeConsuming);
        }
        if (source.PathStatus != null) {
            this.PathStatus = new Long(source.PathStatus);
        }
        if (source.FlinkVersion != null) {
            this.FlinkVersion = new String(source.FlinkVersion);
        }
        if (source.IsIncremental != null) {
            this.IsIncremental = new String(source.IsIncremental);
        }
        if (source.CheckpointSize != null) {
            this.CheckpointSize = new Long(source.CheckpointSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "JobRuntimeId", this.JobRuntimeId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "TimeConsuming", this.TimeConsuming);
        this.setParamSimple(map, prefix + "PathStatus", this.PathStatus);
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamSimple(map, prefix + "IsIncremental", this.IsIncremental);
        this.setParamSimple(map, prefix + "CheckpointSize", this.CheckpointSize);

    }
}

