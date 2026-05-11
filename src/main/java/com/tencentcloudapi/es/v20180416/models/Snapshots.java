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
    * <p>快照名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>快照Uuid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repository")
    @Expose
    private String Repository;

    /**
    * <p>该快照所属集群的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>备份的索引列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Indices")
    @Expose
    private String [] Indices;

    /**
    * <p>备份的datastream列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataStreams")
    @Expose
    private String [] DataStreams;

    /**
    * <p>备份的状态</p><p>FAILED            备份失败</p><p>IN_PROGRESS 备份执行中</p><p>PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示</p><p>SUCCESS     备份成功</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>快照备份的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>快照备份的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>快照备份的耗时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationInMillis")
    @Expose
    private Long DurationInMillis;

    /**
    * <p>备份的总分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalShards")
    @Expose
    private Long TotalShards;

    /**
    * <p>备份失败的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedShards")
    @Expose
    private Long FailedShards;

    /**
    * <p>备份成功的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessfulShards")
    @Expose
    private Long SuccessfulShards;

    /**
    * <p>备份失败的索引分片和失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Failures")
    @Expose
    private Failures [] Failures;

    /**
    * <p>是否用户备份</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserBackUp")
    @Expose
    private String UserBackUp;

    /**
    * <p>0 腾讯云仓库; 1 客户仓库</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsRepositoryType")
    @Expose
    private Long EsRepositoryType;

    /**
    * <p>托管快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaasEsRepository")
    @Expose
    private String PaasEsRepository;

    /**
    * <p>客户快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserEsRepository")
    @Expose
    private String UserEsRepository;

    /**
    * <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageDuration")
    @Expose
    private Long StorageDuration;

    /**
    * <p>自动备份频率, 如果是0,则等效24</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoBackupInterval")
    @Expose
    private Long AutoBackupInterval;

    /**
    * <p>备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosRetention")
    @Expose
    private Long CosRetention;

    /**
    * <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetainUntilDate")
    @Expose
    private String RetainUntilDate;

    /**
    * <p>锁定宽限期,单位天</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionGraceTime")
    @Expose
    private Long RetentionGraceTime;

    /**
    * <p>是否已经备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLocked")
    @Expose
    private Long IsLocked;

    /**
    * <p>跨地域备份 0 不跨地域; 1 跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteCos")
    @Expose
    private Long RemoteCos;

    /**
    * <p>跨地域备份地域名称 ap-guangzhou</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteCosRegion")
    @Expose
    private String RemoteCosRegion;

    /**
    * <p>备份加密 0 不加密; 1 加密</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosEncryption")
    @Expose
    private Long CosEncryption;

    /**
    * <p>kms密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKey")
    @Expose
    private String KmsKey;

    /**
    * <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiAz")
    @Expose
    private Long MultiAz;

    /**
    * <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxSnapshotPerSec")
    @Expose
    private String MaxSnapshotPerSec;

    /**
    * <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>快照名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotName <p>快照名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>快照名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotName <p>快照名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>快照Uuid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid <p>快照Uuid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>快照Uuid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid <p>快照Uuid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repository <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepository() {
        return this.Repository;
    }

    /**
     * Set <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repository <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepository(String Repository) {
        this.Repository = Repository;
    }

    /**
     * Get <p>该快照所属集群的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>该快照所属集群的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>该快照所属集群的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>该快照所属集群的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>备份的索引列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Indices <p>备份的索引列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIndices() {
        return this.Indices;
    }

    /**
     * Set <p>备份的索引列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Indices <p>备份的索引列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndices(String [] Indices) {
        this.Indices = Indices;
    }

    /**
     * Get <p>备份的datastream列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataStreams <p>备份的datastream列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDataStreams() {
        return this.DataStreams;
    }

    /**
     * Set <p>备份的datastream列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataStreams <p>备份的datastream列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataStreams(String [] DataStreams) {
        this.DataStreams = DataStreams;
    }

    /**
     * Get <p>备份的状态</p><p>FAILED            备份失败</p><p>IN_PROGRESS 备份执行中</p><p>PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示</p><p>SUCCESS     备份成功</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State <p>备份的状态</p><p>FAILED            备份失败</p><p>IN_PROGRESS 备份执行中</p><p>PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示</p><p>SUCCESS     备份成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>备份的状态</p><p>FAILED            备份失败</p><p>IN_PROGRESS 备份执行中</p><p>PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示</p><p>SUCCESS     备份成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param State <p>备份的状态</p><p>FAILED            备份失败</p><p>IN_PROGRESS 备份执行中</p><p>PARTIAL          备份部分成功，部分失败，备份失败的索引和原因会在Failures字段中展示</p><p>SUCCESS     备份成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>快照备份的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>快照备份的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>快照备份的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>快照备份的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>快照备份的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>快照备份的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>快照备份的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>快照备份的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>快照备份的耗时时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationInMillis <p>快照备份的耗时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationInMillis() {
        return this.DurationInMillis;
    }

    /**
     * Set <p>快照备份的耗时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationInMillis <p>快照备份的耗时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationInMillis(Long DurationInMillis) {
        this.DurationInMillis = DurationInMillis;
    }

    /**
     * Get <p>备份的总分片数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalShards <p>备份的总分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalShards() {
        return this.TotalShards;
    }

    /**
     * Set <p>备份的总分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalShards <p>备份的总分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalShards(Long TotalShards) {
        this.TotalShards = TotalShards;
    }

    /**
     * Get <p>备份失败的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedShards <p>备份失败的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedShards() {
        return this.FailedShards;
    }

    /**
     * Set <p>备份失败的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedShards <p>备份失败的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedShards(Long FailedShards) {
        this.FailedShards = FailedShards;
    }

    /**
     * Get <p>备份成功的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessfulShards <p>备份成功的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessfulShards() {
        return this.SuccessfulShards;
    }

    /**
     * Set <p>备份成功的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessfulShards <p>备份成功的分片数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessfulShards(Long SuccessfulShards) {
        this.SuccessfulShards = SuccessfulShards;
    }

    /**
     * Get <p>备份失败的索引分片和失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Failures <p>备份失败的索引分片和失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Failures [] getFailures() {
        return this.Failures;
    }

    /**
     * Set <p>备份失败的索引分片和失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Failures <p>备份失败的索引分片和失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailures(Failures [] Failures) {
        this.Failures = Failures;
    }

    /**
     * Get <p>是否用户备份</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserBackUp <p>是否用户备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserBackUp() {
        return this.UserBackUp;
    }

    /**
     * Set <p>是否用户备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserBackUp <p>是否用户备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserBackUp(String UserBackUp) {
        this.UserBackUp = UserBackUp;
    }

    /**
     * Get <p>0 腾讯云仓库; 1 客户仓库</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsRepositoryType <p>0 腾讯云仓库; 1 客户仓库</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEsRepositoryType() {
        return this.EsRepositoryType;
    }

    /**
     * Set <p>0 腾讯云仓库; 1 客户仓库</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsRepositoryType <p>0 腾讯云仓库; 1 客户仓库</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsRepositoryType(Long EsRepositoryType) {
        this.EsRepositoryType = EsRepositoryType;
    }

    /**
     * Get <p>托管快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaasEsRepository <p>托管快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaasEsRepository() {
        return this.PaasEsRepository;
    }

    /**
     * Set <p>托管快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaasEsRepository <p>托管快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaasEsRepository(String PaasEsRepository) {
        this.PaasEsRepository = PaasEsRepository;
    }

    /**
     * Get <p>客户快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserEsRepository <p>客户快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserEsRepository() {
        return this.UserEsRepository;
    }

    /**
     * Set <p>客户快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserEsRepository <p>客户快照仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserEsRepository(String UserEsRepository) {
        this.UserEsRepository = UserEsRepository;
    }

    /**
     * Get <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageDuration <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageDuration() {
        return this.StorageDuration;
    }

    /**
     * Set <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageDuration <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageDuration(Long StorageDuration) {
        this.StorageDuration = StorageDuration;
    }

    /**
     * Get <p>自动备份频率, 如果是0,则等效24</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoBackupInterval <p>自动备份频率, 如果是0,则等效24</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoBackupInterval() {
        return this.AutoBackupInterval;
    }

    /**
     * Set <p>自动备份频率, 如果是0,则等效24</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoBackupInterval <p>自动备份频率, 如果是0,则等效24</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoBackupInterval(Long AutoBackupInterval) {
        this.AutoBackupInterval = AutoBackupInterval;
    }

    /**
     * Get <p>备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosRetention <p>备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCosRetention() {
        return this.CosRetention;
    }

    /**
     * Set <p>备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosRetention <p>备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosRetention(Long CosRetention) {
        this.CosRetention = CosRetention;
    }

    /**
     * Get <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetainUntilDate <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRetainUntilDate() {
        return this.RetainUntilDate;
    }

    /**
     * Set <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetainUntilDate <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetainUntilDate(String RetainUntilDate) {
        this.RetainUntilDate = RetainUntilDate;
    }

    /**
     * Get <p>锁定宽限期,单位天</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionGraceTime <p>锁定宽限期,单位天</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetentionGraceTime() {
        return this.RetentionGraceTime;
    }

    /**
     * Set <p>锁定宽限期,单位天</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionGraceTime <p>锁定宽限期,单位天</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionGraceTime(Long RetentionGraceTime) {
        this.RetentionGraceTime = RetentionGraceTime;
    }

    /**
     * Get <p>是否已经备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLocked <p>是否已经备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsLocked() {
        return this.IsLocked;
    }

    /**
     * Set <p>是否已经备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLocked <p>是否已经备份锁定 0 不锁定; 1 锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLocked(Long IsLocked) {
        this.IsLocked = IsLocked;
    }

    /**
     * Get <p>跨地域备份 0 不跨地域; 1 跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteCos <p>跨地域备份 0 不跨地域; 1 跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemoteCos() {
        return this.RemoteCos;
    }

    /**
     * Set <p>跨地域备份 0 不跨地域; 1 跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteCos <p>跨地域备份 0 不跨地域; 1 跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteCos(Long RemoteCos) {
        this.RemoteCos = RemoteCos;
    }

    /**
     * Get <p>跨地域备份地域名称 ap-guangzhou</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteCosRegion <p>跨地域备份地域名称 ap-guangzhou</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteCosRegion() {
        return this.RemoteCosRegion;
    }

    /**
     * Set <p>跨地域备份地域名称 ap-guangzhou</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteCosRegion <p>跨地域备份地域名称 ap-guangzhou</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteCosRegion(String RemoteCosRegion) {
        this.RemoteCosRegion = RemoteCosRegion;
    }

    /**
     * Get <p>备份加密 0 不加密; 1 加密</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosEncryption <p>备份加密 0 不加密; 1 加密</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCosEncryption() {
        return this.CosEncryption;
    }

    /**
     * Set <p>备份加密 0 不加密; 1 加密</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosEncryption <p>备份加密 0 不加密; 1 加密</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosEncryption(Long CosEncryption) {
        this.CosEncryption = CosEncryption;
    }

    /**
     * Get <p>kms密钥</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKey <p>kms密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKey() {
        return this.KmsKey;
    }

    /**
     * Set <p>kms密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKey <p>kms密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKey(String KmsKey) {
        this.KmsKey = KmsKey;
    }

    /**
     * Get <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyName <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyName <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiAz <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMultiAz() {
        return this.MultiAz;
    }

    /**
     * Set <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiAz <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiAz(Long MultiAz) {
        this.MultiAz = MultiAz;
    }

    /**
     * Get <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxSnapshotPerSec <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxSnapshotPerSec() {
        return this.MaxSnapshotPerSec;
    }

    /**
     * Set <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxSnapshotPerSec <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxSnapshotPerSec(String MaxSnapshotPerSec) {
        this.MaxSnapshotPerSec = MaxSnapshotPerSec;
    }

    /**
     * Get <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
        if (source.EsRepositoryType != null) {
            this.EsRepositoryType = new Long(source.EsRepositoryType);
        }
        if (source.PaasEsRepository != null) {
            this.PaasEsRepository = new String(source.PaasEsRepository);
        }
        if (source.UserEsRepository != null) {
            this.UserEsRepository = new String(source.UserEsRepository);
        }
        if (source.StorageDuration != null) {
            this.StorageDuration = new Long(source.StorageDuration);
        }
        if (source.AutoBackupInterval != null) {
            this.AutoBackupInterval = new Long(source.AutoBackupInterval);
        }
        if (source.CosRetention != null) {
            this.CosRetention = new Long(source.CosRetention);
        }
        if (source.RetainUntilDate != null) {
            this.RetainUntilDate = new String(source.RetainUntilDate);
        }
        if (source.RetentionGraceTime != null) {
            this.RetentionGraceTime = new Long(source.RetentionGraceTime);
        }
        if (source.IsLocked != null) {
            this.IsLocked = new Long(source.IsLocked);
        }
        if (source.RemoteCos != null) {
            this.RemoteCos = new Long(source.RemoteCos);
        }
        if (source.RemoteCosRegion != null) {
            this.RemoteCosRegion = new String(source.RemoteCosRegion);
        }
        if (source.CosEncryption != null) {
            this.CosEncryption = new Long(source.CosEncryption);
        }
        if (source.KmsKey != null) {
            this.KmsKey = new String(source.KmsKey);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.MultiAz != null) {
            this.MultiAz = new Long(source.MultiAz);
        }
        if (source.MaxSnapshotPerSec != null) {
            this.MaxSnapshotPerSec = new String(source.MaxSnapshotPerSec);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "EsRepositoryType", this.EsRepositoryType);
        this.setParamSimple(map, prefix + "PaasEsRepository", this.PaasEsRepository);
        this.setParamSimple(map, prefix + "UserEsRepository", this.UserEsRepository);
        this.setParamSimple(map, prefix + "StorageDuration", this.StorageDuration);
        this.setParamSimple(map, prefix + "AutoBackupInterval", this.AutoBackupInterval);
        this.setParamSimple(map, prefix + "CosRetention", this.CosRetention);
        this.setParamSimple(map, prefix + "RetainUntilDate", this.RetainUntilDate);
        this.setParamSimple(map, prefix + "RetentionGraceTime", this.RetentionGraceTime);
        this.setParamSimple(map, prefix + "IsLocked", this.IsLocked);
        this.setParamSimple(map, prefix + "RemoteCos", this.RemoteCos);
        this.setParamSimple(map, prefix + "RemoteCosRegion", this.RemoteCosRegion);
        this.setParamSimple(map, prefix + "CosEncryption", this.CosEncryption);
        this.setParamSimple(map, prefix + "KmsKey", this.KmsKey);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "MultiAz", this.MultiAz);
        this.setParamSimple(map, prefix + "MaxSnapshotPerSec", this.MaxSnapshotPerSec);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

