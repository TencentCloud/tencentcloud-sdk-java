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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Snapshots extends AbstractModel {

    /**
    * 快照名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照Uuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repository")
    @Expose
    private String Repository;

    /**
    * 该快照所属集群的版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 备份的索引列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Indices")
    @Expose
    private String [] Indices;

    /**
    * 备份的datastream列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataStreams")
    @Expose
    private String [] DataStreams;

    /**
    * 备份的状态

FAILED            备份失败

IN_PROGRESS 备份执行中

PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示

SUCCESS     备份成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 快照备份的开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 快照备份的结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 快照备份的耗时时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationInMillis")
    @Expose
    private Long DurationInMillis;

    /**
    * 备份的总分片数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalShards")
    @Expose
    private Long TotalShards;

    /**
    * 备份失败的分片数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedShards")
    @Expose
    private Long FailedShards;

    /**
    * 备份成功的分片数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessfulShards")
    @Expose
    private Long SuccessfulShards;

    /**
    * 备份失败的索引分片和失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Failures")
    @Expose
    private Failures [] Failures;

    /**
    * 是否用户备份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserBackUp")
    @Expose
    private String UserBackUp;

    /**
     * Get 快照名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotName 快照名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotName 快照名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 快照Uuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid 快照Uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 快照Uuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid 快照Uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 仓库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repository 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepository() {
        return this.Repository;
    }

    /**
     * Set 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repository 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepository(String Repository) {
        this.Repository = Repository;
    }

    /**
     * Get 该快照所属集群的版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 该快照所属集群的版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 该快照所属集群的版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 该快照所属集群的版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 备份的索引列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Indices 备份的索引列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIndices() {
        return this.Indices;
    }

    /**
     * Set 备份的索引列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Indices 备份的索引列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndices(String [] Indices) {
        this.Indices = Indices;
    }

    /**
     * Get 备份的datastream列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataStreams 备份的datastream列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDataStreams() {
        return this.DataStreams;
    }

    /**
     * Set 备份的datastream列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataStreams 备份的datastream列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataStreams(String [] DataStreams) {
        this.DataStreams = DataStreams;
    }

    /**
     * Get 备份的状态

FAILED            备份失败

IN_PROGRESS 备份执行中

PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示

SUCCESS     备份成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 备份的状态

FAILED            备份失败

IN_PROGRESS 备份执行中

PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示

SUCCESS     备份成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 备份的状态

FAILED            备份失败

IN_PROGRESS 备份执行中

PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示

SUCCESS     备份成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 备份的状态

FAILED            备份失败

IN_PROGRESS 备份执行中

PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示

SUCCESS     备份成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 快照备份的开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 快照备份的开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 快照备份的开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 快照备份的开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 快照备份的结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 快照备份的结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 快照备份的结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 快照备份的结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 快照备份的耗时时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationInMillis 快照备份的耗时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationInMillis() {
        return this.DurationInMillis;
    }

    /**
     * Set 快照备份的耗时时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationInMillis 快照备份的耗时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationInMillis(Long DurationInMillis) {
        this.DurationInMillis = DurationInMillis;
    }

    /**
     * Get 备份的总分片数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalShards 备份的总分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalShards() {
        return this.TotalShards;
    }

    /**
     * Set 备份的总分片数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalShards 备份的总分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalShards(Long TotalShards) {
        this.TotalShards = TotalShards;
    }

    /**
     * Get 备份失败的分片数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedShards 备份失败的分片数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedShards() {
        return this.FailedShards;
    }

    /**
     * Set 备份失败的分片数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedShards 备份失败的分片数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedShards(Long FailedShards) {
        this.FailedShards = FailedShards;
    }

    /**
     * Get 备份成功的分片数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessfulShards 备份成功的分片数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessfulShards() {
        return this.SuccessfulShards;
    }

    /**
     * Set 备份成功的分片数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessfulShards 备份成功的分片数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessfulShards(Long SuccessfulShards) {
        this.SuccessfulShards = SuccessfulShards;
    }

    /**
     * Get 备份失败的索引分片和失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Failures 备份失败的索引分片和失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Failures [] getFailures() {
        return this.Failures;
    }

    /**
     * Set 备份失败的索引分片和失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Failures 备份失败的索引分片和失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailures(Failures [] Failures) {
        this.Failures = Failures;
    }

    /**
     * Get 是否用户备份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserBackUp 是否用户备份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserBackUp() {
        return this.UserBackUp;
    }

    /**
     * Set 是否用户备份
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserBackUp 是否用户备份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserBackUp(String UserBackUp) {
        this.UserBackUp = UserBackUp;
    }

    public Snapshots() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Snapshots(Snapshots source) {
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Repository != null) {
            this.Repository = new String(source.Repository);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Indices != null) {
            this.Indices = new String[source.Indices.length];
            for (int i = 0; i < source.Indices.length; i++) {
                this.Indices[i] = new String(source.Indices[i]);
            }
        }
        if (source.DataStreams != null) {
            this.DataStreams = new String[source.DataStreams.length];
            for (int i = 0; i < source.DataStreams.length; i++) {
                this.DataStreams[i] = new String(source.DataStreams[i]);
            }
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DurationInMillis != null) {
            this.DurationInMillis = new Long(source.DurationInMillis);
        }
        if (source.TotalShards != null) {
            this.TotalShards = new Long(source.TotalShards);
        }
        if (source.FailedShards != null) {
            this.FailedShards = new Long(source.FailedShards);
        }
        if (source.SuccessfulShards != null) {
            this.SuccessfulShards = new Long(source.SuccessfulShards);
        }
        if (source.Failures != null) {
            this.Failures = new Failures[source.Failures.length];
            for (int i = 0; i < source.Failures.length; i++) {
                this.Failures[i] = new Failures(source.Failures[i]);
            }
        }
        if (source.UserBackUp != null) {
            this.UserBackUp = new String(source.UserBackUp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Repository", this.Repository);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArraySimple(map, prefix + "Indices.", this.Indices);
        this.setParamArraySimple(map, prefix + "DataStreams.", this.DataStreams);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DurationInMillis", this.DurationInMillis);
        this.setParamSimple(map, prefix + "TotalShards", this.TotalShards);
        this.setParamSimple(map, prefix + "FailedShards", this.FailedShards);
        this.setParamSimple(map, prefix + "SuccessfulShards", this.SuccessfulShards);
        this.setParamArrayObj(map, prefix + "Failures.", this.Failures);
        this.setParamSimple(map, prefix + "UserBackUp", this.UserBackUp);

    }
}

