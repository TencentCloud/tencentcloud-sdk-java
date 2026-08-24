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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyPair extends AbstractModel {

    /**
    * 用户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 复制对ID（CVM 类型为 cvmcopypair-xxxxxxxx，DISK/CFS 类型为 copypair-xxxxxxxx）
    */
    @SerializedName("CopyPairId")
    @Expose
    private String CopyPairId;

    /**
    * 复制对名称
    */
    @SerializedName("CopyPairName")
    @Expose
    private String CopyPairName;

    /**
    * 所属容灾站点对ID
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 所属容灾站点对名称
    */
    @SerializedName("SitePairName")
    @Expose
    private String SitePairName;

    /**
    * 保护组ID
    */
    @SerializedName("ProtectGroupId")
    @Expose
    private String ProtectGroupId;

    /**
    * 保护组名称
    */
    @SerializedName("ProtectGroupName")
    @Expose
    private String ProtectGroupName;

    /**
    * 复制对状态。可选值：INIT、RUNNING、FULL_COPYING、INC_COPYING、NORMAL、DOWN、DEGRADE 等
    */
    @SerializedName("CopyPairState")
    @Expose
    private String CopyPairState;

    /**
    * 复制对类型。可选值：DISK、INSTANCE、CFS
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
    * 生产地域
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * 生产可用区
    */
    @SerializedName("SourceZone")
    @Expose
    private String SourceZone;

    /**
    * 生产端VPC
    */
    @SerializedName("SourceVpc")
    @Expose
    private String SourceVpc;

    /**
    * 容灾地域
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * 容灾可用区
    */
    @SerializedName("TargetZone")
    @Expose
    private String TargetZone;

    /**
    * 容灾端VPC
    */
    @SerializedName("TargetVpc")
    @Expose
    private String TargetVpc;

    /**
    * 生产资源ID。CVM 类型为源 InstanceId（ins-xxx）；DISK 类型为源 DiskId（disk-xxx）；CFS 类型为源 FilesystemId（cfs-xxx）
    */
    @SerializedName("SourceResourceId")
    @Expose
    private String SourceResourceId;

    /**
    * 容灾资源ID。语义同 SourceResourceId（CVM/DISK/CFS）。延迟创建模式且 CVM 未真实创建时为占位符 drp-xxx，CVM 创建后为真实 ins-xxx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetResourceId")
    @Expose
    private String TargetResourceId;

    /**
    * 生产站点盘挂载的实例ID（DISK 类型时为挂载的 CVM ins-xxx；INSTANCE 类型时与 SourceResourceId 一致）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 所属CVM复制对ID（仅 DISK 类型且其 CVM 复制对存在时返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCopyPairId")
    @Expose
    private String InstanceCopyPairId;

    /**
    * 复制进度。CVM 类型为所有挂载磁盘进度的平均值；DISK/CFS 类型为本盘进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 最新保护时间点。当 CopyPairState=FULL_COPYING 时为 null（首次全量未完成）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestProtectionTime")
    @Expose
    private String LatestProtectionTime;

    /**
    * RPO（秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecoveryPointObjective")
    @Expose
    private Long RecoveryPointObjective;

    /**
    * 数据方向。可选值：POSITIVE（正向）、REVERSE（反向，failover 后）。后端在 REVERSE 时已自动轮转 src/target 字段
    */
    @SerializedName("DataDirection")
    @Expose
    private String DataDirection;

    /**
    * 创建来源。可选值：LOCAL（本地侧创建）、PEER（对端创建）
    */
    @SerializedName("CreateFrom")
    @Expose
    private String CreateFrom;

    /**
    * 容灾类型。可选值：CROSS_ZONE（跨可用区）、CROSS_REGION（跨地域）、CROSS_CLOUD（跨云）
    */
    @SerializedName("DisasterRecoveryType")
    @Expose
    private String DisasterRecoveryType;

    /**
    * 对端云名称（仅跨云场景）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerCloudName")
    @Expose
    private String PeerCloudName;

    /**
    * 是否在回滚中（0/1）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rollbacking")
    @Expose
    private Long Rollbacking;

    /**
    * 回滚进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RollbackPercent")
    @Expose
    private Long RollbackPercent;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建账户 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * 创建协作者 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 演练组ID（用于演练组内过滤存量复制对，无演练时为 null）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrillGroupId")
    @Expose
    private String DrillGroupId;

    /**
    * 保护时间点列表（仅当 QueryProtectionTime=true 时返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectionTimeSet")
    @Expose
    private String [] ProtectionTimeSet;

    /**
    * CVM下挂载磁盘的复制对列表（仅 CopyPairType=INSTANCE 时返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskCopyPairSet")
    @Expose
    private DiskCopyPairForCvm [] DiskCopyPairSet;

    /**
    * 是否为延迟创建模式（创建后固定不变）。仅 CVM 复制对返回
    */
    @SerializedName("DeferredCreate")
    @Expose
    private Boolean DeferredCreate;

    /**
    * 目标 CVM 是否已真实创建（首次 failover 完成后置 true）。仅 CVM 复制对返回
    */
    @SerializedName("TargetCvmCreated")
    @Expose
    private Boolean TargetCvmCreated;

    /**
    * CVM 创建参数（JSON 字符串）。仅当请求传 QueryCvmCreateParams=true 且复制对处于 deferred_create=1 AND target_cvm_created=0 时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvmCreateParams")
    @Expose
    private String CvmCreateParams;

    /**
     * Get 用户ID 
     * @return AppId 用户ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户ID
     * @param AppId 用户ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 复制对ID（CVM 类型为 cvmcopypair-xxxxxxxx，DISK/CFS 类型为 copypair-xxxxxxxx） 
     * @return CopyPairId 复制对ID（CVM 类型为 cvmcopypair-xxxxxxxx，DISK/CFS 类型为 copypair-xxxxxxxx）
     */
    public String getCopyPairId() {
        return this.CopyPairId;
    }

    /**
     * Set 复制对ID（CVM 类型为 cvmcopypair-xxxxxxxx，DISK/CFS 类型为 copypair-xxxxxxxx）
     * @param CopyPairId 复制对ID（CVM 类型为 cvmcopypair-xxxxxxxx，DISK/CFS 类型为 copypair-xxxxxxxx）
     */
    public void setCopyPairId(String CopyPairId) {
        this.CopyPairId = CopyPairId;
    }

    /**
     * Get 复制对名称 
     * @return CopyPairName 复制对名称
     */
    public String getCopyPairName() {
        return this.CopyPairName;
    }

    /**
     * Set 复制对名称
     * @param CopyPairName 复制对名称
     */
    public void setCopyPairName(String CopyPairName) {
        this.CopyPairName = CopyPairName;
    }

    /**
     * Get 所属容灾站点对ID 
     * @return SitePairId 所属容灾站点对ID
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 所属容灾站点对ID
     * @param SitePairId 所属容灾站点对ID
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 所属容灾站点对名称 
     * @return SitePairName 所属容灾站点对名称
     */
    public String getSitePairName() {
        return this.SitePairName;
    }

    /**
     * Set 所属容灾站点对名称
     * @param SitePairName 所属容灾站点对名称
     */
    public void setSitePairName(String SitePairName) {
        this.SitePairName = SitePairName;
    }

    /**
     * Get 保护组ID 
     * @return ProtectGroupId 保护组ID
     */
    public String getProtectGroupId() {
        return this.ProtectGroupId;
    }

    /**
     * Set 保护组ID
     * @param ProtectGroupId 保护组ID
     */
    public void setProtectGroupId(String ProtectGroupId) {
        this.ProtectGroupId = ProtectGroupId;
    }

    /**
     * Get 保护组名称 
     * @return ProtectGroupName 保护组名称
     */
    public String getProtectGroupName() {
        return this.ProtectGroupName;
    }

    /**
     * Set 保护组名称
     * @param ProtectGroupName 保护组名称
     */
    public void setProtectGroupName(String ProtectGroupName) {
        this.ProtectGroupName = ProtectGroupName;
    }

    /**
     * Get 复制对状态。可选值：INIT、RUNNING、FULL_COPYING、INC_COPYING、NORMAL、DOWN、DEGRADE 等 
     * @return CopyPairState 复制对状态。可选值：INIT、RUNNING、FULL_COPYING、INC_COPYING、NORMAL、DOWN、DEGRADE 等
     */
    public String getCopyPairState() {
        return this.CopyPairState;
    }

    /**
     * Set 复制对状态。可选值：INIT、RUNNING、FULL_COPYING、INC_COPYING、NORMAL、DOWN、DEGRADE 等
     * @param CopyPairState 复制对状态。可选值：INIT、RUNNING、FULL_COPYING、INC_COPYING、NORMAL、DOWN、DEGRADE 等
     */
    public void setCopyPairState(String CopyPairState) {
        this.CopyPairState = CopyPairState;
    }

    /**
     * Get 复制对类型。可选值：DISK、INSTANCE、CFS 
     * @return CopyPairType 复制对类型。可选值：DISK、INSTANCE、CFS
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set 复制对类型。可选值：DISK、INSTANCE、CFS
     * @param CopyPairType 复制对类型。可选值：DISK、INSTANCE、CFS
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    /**
     * Get 生产地域 
     * @return SourceRegion 生产地域
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set 生产地域
     * @param SourceRegion 生产地域
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get 生产可用区 
     * @return SourceZone 生产可用区
     */
    public String getSourceZone() {
        return this.SourceZone;
    }

    /**
     * Set 生产可用区
     * @param SourceZone 生产可用区
     */
    public void setSourceZone(String SourceZone) {
        this.SourceZone = SourceZone;
    }

    /**
     * Get 生产端VPC 
     * @return SourceVpc 生产端VPC
     */
    public String getSourceVpc() {
        return this.SourceVpc;
    }

    /**
     * Set 生产端VPC
     * @param SourceVpc 生产端VPC
     */
    public void setSourceVpc(String SourceVpc) {
        this.SourceVpc = SourceVpc;
    }

    /**
     * Get 容灾地域 
     * @return TargetRegion 容灾地域
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set 容灾地域
     * @param TargetRegion 容灾地域
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get 容灾可用区 
     * @return TargetZone 容灾可用区
     */
    public String getTargetZone() {
        return this.TargetZone;
    }

    /**
     * Set 容灾可用区
     * @param TargetZone 容灾可用区
     */
    public void setTargetZone(String TargetZone) {
        this.TargetZone = TargetZone;
    }

    /**
     * Get 容灾端VPC 
     * @return TargetVpc 容灾端VPC
     */
    public String getTargetVpc() {
        return this.TargetVpc;
    }

    /**
     * Set 容灾端VPC
     * @param TargetVpc 容灾端VPC
     */
    public void setTargetVpc(String TargetVpc) {
        this.TargetVpc = TargetVpc;
    }

    /**
     * Get 生产资源ID。CVM 类型为源 InstanceId（ins-xxx）；DISK 类型为源 DiskId（disk-xxx）；CFS 类型为源 FilesystemId（cfs-xxx） 
     * @return SourceResourceId 生产资源ID。CVM 类型为源 InstanceId（ins-xxx）；DISK 类型为源 DiskId（disk-xxx）；CFS 类型为源 FilesystemId（cfs-xxx）
     */
    public String getSourceResourceId() {
        return this.SourceResourceId;
    }

    /**
     * Set 生产资源ID。CVM 类型为源 InstanceId（ins-xxx）；DISK 类型为源 DiskId（disk-xxx）；CFS 类型为源 FilesystemId（cfs-xxx）
     * @param SourceResourceId 生产资源ID。CVM 类型为源 InstanceId（ins-xxx）；DISK 类型为源 DiskId（disk-xxx）；CFS 类型为源 FilesystemId（cfs-xxx）
     */
    public void setSourceResourceId(String SourceResourceId) {
        this.SourceResourceId = SourceResourceId;
    }

    /**
     * Get 容灾资源ID。语义同 SourceResourceId（CVM/DISK/CFS）。延迟创建模式且 CVM 未真实创建时为占位符 drp-xxx，CVM 创建后为真实 ins-xxx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetResourceId 容灾资源ID。语义同 SourceResourceId（CVM/DISK/CFS）。延迟创建模式且 CVM 未真实创建时为占位符 drp-xxx，CVM 创建后为真实 ins-xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetResourceId() {
        return this.TargetResourceId;
    }

    /**
     * Set 容灾资源ID。语义同 SourceResourceId（CVM/DISK/CFS）。延迟创建模式且 CVM 未真实创建时为占位符 drp-xxx，CVM 创建后为真实 ins-xxx
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetResourceId 容灾资源ID。语义同 SourceResourceId（CVM/DISK/CFS）。延迟创建模式且 CVM 未真实创建时为占位符 drp-xxx，CVM 创建后为真实 ins-xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetResourceId(String TargetResourceId) {
        this.TargetResourceId = TargetResourceId;
    }

    /**
     * Get 生产站点盘挂载的实例ID（DISK 类型时为挂载的 CVM ins-xxx；INSTANCE 类型时与 SourceResourceId 一致）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 生产站点盘挂载的实例ID（DISK 类型时为挂载的 CVM ins-xxx；INSTANCE 类型时与 SourceResourceId 一致）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 生产站点盘挂载的实例ID（DISK 类型时为挂载的 CVM ins-xxx；INSTANCE 类型时与 SourceResourceId 一致）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 生产站点盘挂载的实例ID（DISK 类型时为挂载的 CVM ins-xxx；INSTANCE 类型时与 SourceResourceId 一致）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 所属CVM复制对ID（仅 DISK 类型且其 CVM 复制对存在时返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCopyPairId 所属CVM复制对ID（仅 DISK 类型且其 CVM 复制对存在时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceCopyPairId() {
        return this.InstanceCopyPairId;
    }

    /**
     * Set 所属CVM复制对ID（仅 DISK 类型且其 CVM 复制对存在时返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCopyPairId 所属CVM复制对ID（仅 DISK 类型且其 CVM 复制对存在时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCopyPairId(String InstanceCopyPairId) {
        this.InstanceCopyPairId = InstanceCopyPairId;
    }

    /**
     * Get 复制进度。CVM 类型为所有挂载磁盘进度的平均值；DISK/CFS 类型为本盘进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 复制进度。CVM 类型为所有挂载磁盘进度的平均值；DISK/CFS 类型为本盘进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 复制进度。CVM 类型为所有挂载磁盘进度的平均值；DISK/CFS 类型为本盘进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 复制进度。CVM 类型为所有挂载磁盘进度的平均值；DISK/CFS 类型为本盘进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 最新保护时间点。当 CopyPairState=FULL_COPYING 时为 null（首次全量未完成）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestProtectionTime 最新保护时间点。当 CopyPairState=FULL_COPYING 时为 null（首次全量未完成）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestProtectionTime() {
        return this.LatestProtectionTime;
    }

    /**
     * Set 最新保护时间点。当 CopyPairState=FULL_COPYING 时为 null（首次全量未完成）
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestProtectionTime 最新保护时间点。当 CopyPairState=FULL_COPYING 时为 null（首次全量未完成）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestProtectionTime(String LatestProtectionTime) {
        this.LatestProtectionTime = LatestProtectionTime;
    }

    /**
     * Get RPO（秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecoveryPointObjective RPO（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecoveryPointObjective() {
        return this.RecoveryPointObjective;
    }

    /**
     * Set RPO（秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecoveryPointObjective RPO（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecoveryPointObjective(Long RecoveryPointObjective) {
        this.RecoveryPointObjective = RecoveryPointObjective;
    }

    /**
     * Get 数据方向。可选值：POSITIVE（正向）、REVERSE（反向，failover 后）。后端在 REVERSE 时已自动轮转 src/target 字段 
     * @return DataDirection 数据方向。可选值：POSITIVE（正向）、REVERSE（反向，failover 后）。后端在 REVERSE 时已自动轮转 src/target 字段
     */
    public String getDataDirection() {
        return this.DataDirection;
    }

    /**
     * Set 数据方向。可选值：POSITIVE（正向）、REVERSE（反向，failover 后）。后端在 REVERSE 时已自动轮转 src/target 字段
     * @param DataDirection 数据方向。可选值：POSITIVE（正向）、REVERSE（反向，failover 后）。后端在 REVERSE 时已自动轮转 src/target 字段
     */
    public void setDataDirection(String DataDirection) {
        this.DataDirection = DataDirection;
    }

    /**
     * Get 创建来源。可选值：LOCAL（本地侧创建）、PEER（对端创建） 
     * @return CreateFrom 创建来源。可选值：LOCAL（本地侧创建）、PEER（对端创建）
     */
    public String getCreateFrom() {
        return this.CreateFrom;
    }

    /**
     * Set 创建来源。可选值：LOCAL（本地侧创建）、PEER（对端创建）
     * @param CreateFrom 创建来源。可选值：LOCAL（本地侧创建）、PEER（对端创建）
     */
    public void setCreateFrom(String CreateFrom) {
        this.CreateFrom = CreateFrom;
    }

    /**
     * Get 容灾类型。可选值：CROSS_ZONE（跨可用区）、CROSS_REGION（跨地域）、CROSS_CLOUD（跨云） 
     * @return DisasterRecoveryType 容灾类型。可选值：CROSS_ZONE（跨可用区）、CROSS_REGION（跨地域）、CROSS_CLOUD（跨云）
     */
    public String getDisasterRecoveryType() {
        return this.DisasterRecoveryType;
    }

    /**
     * Set 容灾类型。可选值：CROSS_ZONE（跨可用区）、CROSS_REGION（跨地域）、CROSS_CLOUD（跨云）
     * @param DisasterRecoveryType 容灾类型。可选值：CROSS_ZONE（跨可用区）、CROSS_REGION（跨地域）、CROSS_CLOUD（跨云）
     */
    public void setDisasterRecoveryType(String DisasterRecoveryType) {
        this.DisasterRecoveryType = DisasterRecoveryType;
    }

    /**
     * Get 对端云名称（仅跨云场景）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerCloudName 对端云名称（仅跨云场景）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerCloudName() {
        return this.PeerCloudName;
    }

    /**
     * Set 对端云名称（仅跨云场景）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerCloudName 对端云名称（仅跨云场景）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerCloudName(String PeerCloudName) {
        this.PeerCloudName = PeerCloudName;
    }

    /**
     * Get 是否在回滚中（0/1）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rollbacking 是否在回滚中（0/1）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRollbacking() {
        return this.Rollbacking;
    }

    /**
     * Set 是否在回滚中（0/1）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rollbacking 是否在回滚中（0/1）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRollbacking(Long Rollbacking) {
        this.Rollbacking = Rollbacking;
    }

    /**
     * Get 回滚进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RollbackPercent 回滚进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRollbackPercent() {
        return this.RollbackPercent;
    }

    /**
     * Set 回滚进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param RollbackPercent 回滚进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRollbackPercent(Long RollbackPercent) {
        this.RollbackPercent = RollbackPercent;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建账户 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUin 创建账户 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set 创建账户 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUin 创建账户 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get 创建协作者 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 创建协作者 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 创建协作者 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 创建协作者 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 演练组ID（用于演练组内过滤存量复制对，无演练时为 null）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrillGroupId 演练组ID（用于演练组内过滤存量复制对，无演练时为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDrillGroupId() {
        return this.DrillGroupId;
    }

    /**
     * Set 演练组ID（用于演练组内过滤存量复制对，无演练时为 null）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrillGroupId 演练组ID（用于演练组内过滤存量复制对，无演练时为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrillGroupId(String DrillGroupId) {
        this.DrillGroupId = DrillGroupId;
    }

    /**
     * Get 保护时间点列表（仅当 QueryProtectionTime=true 时返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectionTimeSet 保护时间点列表（仅当 QueryProtectionTime=true 时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProtectionTimeSet() {
        return this.ProtectionTimeSet;
    }

    /**
     * Set 保护时间点列表（仅当 QueryProtectionTime=true 时返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectionTimeSet 保护时间点列表（仅当 QueryProtectionTime=true 时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectionTimeSet(String [] ProtectionTimeSet) {
        this.ProtectionTimeSet = ProtectionTimeSet;
    }

    /**
     * Get CVM下挂载磁盘的复制对列表（仅 CopyPairType=INSTANCE 时返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskCopyPairSet CVM下挂载磁盘的复制对列表（仅 CopyPairType=INSTANCE 时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskCopyPairForCvm [] getDiskCopyPairSet() {
        return this.DiskCopyPairSet;
    }

    /**
     * Set CVM下挂载磁盘的复制对列表（仅 CopyPairType=INSTANCE 时返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskCopyPairSet CVM下挂载磁盘的复制对列表（仅 CopyPairType=INSTANCE 时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskCopyPairSet(DiskCopyPairForCvm [] DiskCopyPairSet) {
        this.DiskCopyPairSet = DiskCopyPairSet;
    }

    /**
     * Get 是否为延迟创建模式（创建后固定不变）。仅 CVM 复制对返回 
     * @return DeferredCreate 是否为延迟创建模式（创建后固定不变）。仅 CVM 复制对返回
     */
    public Boolean getDeferredCreate() {
        return this.DeferredCreate;
    }

    /**
     * Set 是否为延迟创建模式（创建后固定不变）。仅 CVM 复制对返回
     * @param DeferredCreate 是否为延迟创建模式（创建后固定不变）。仅 CVM 复制对返回
     */
    public void setDeferredCreate(Boolean DeferredCreate) {
        this.DeferredCreate = DeferredCreate;
    }

    /**
     * Get 目标 CVM 是否已真实创建（首次 failover 完成后置 true）。仅 CVM 复制对返回 
     * @return TargetCvmCreated 目标 CVM 是否已真实创建（首次 failover 完成后置 true）。仅 CVM 复制对返回
     */
    public Boolean getTargetCvmCreated() {
        return this.TargetCvmCreated;
    }

    /**
     * Set 目标 CVM 是否已真实创建（首次 failover 完成后置 true）。仅 CVM 复制对返回
     * @param TargetCvmCreated 目标 CVM 是否已真实创建（首次 failover 完成后置 true）。仅 CVM 复制对返回
     */
    public void setTargetCvmCreated(Boolean TargetCvmCreated) {
        this.TargetCvmCreated = TargetCvmCreated;
    }

    /**
     * Get CVM 创建参数（JSON 字符串）。仅当请求传 QueryCvmCreateParams=true 且复制对处于 deferred_create=1 AND target_cvm_created=0 时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmCreateParams CVM 创建参数（JSON 字符串）。仅当请求传 QueryCvmCreateParams=true 且复制对处于 deferred_create=1 AND target_cvm_created=0 时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCvmCreateParams() {
        return this.CvmCreateParams;
    }

    /**
     * Set CVM 创建参数（JSON 字符串）。仅当请求传 QueryCvmCreateParams=true 且复制对处于 deferred_create=1 AND target_cvm_created=0 时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmCreateParams CVM 创建参数（JSON 字符串）。仅当请求传 QueryCvmCreateParams=true 且复制对处于 deferred_create=1 AND target_cvm_created=0 时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvmCreateParams(String CvmCreateParams) {
        this.CvmCreateParams = CvmCreateParams;
    }

    public CopyPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyPair(CopyPair source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CopyPairId != null) {
            this.CopyPairId = new String(source.CopyPairId);
        }
        if (source.CopyPairName != null) {
            this.CopyPairName = new String(source.CopyPairName);
        }
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.SitePairName != null) {
            this.SitePairName = new String(source.SitePairName);
        }
        if (source.ProtectGroupId != null) {
            this.ProtectGroupId = new String(source.ProtectGroupId);
        }
        if (source.ProtectGroupName != null) {
            this.ProtectGroupName = new String(source.ProtectGroupName);
        }
        if (source.CopyPairState != null) {
            this.CopyPairState = new String(source.CopyPairState);
        }
        if (source.CopyPairType != null) {
            this.CopyPairType = new String(source.CopyPairType);
        }
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.SourceZone != null) {
            this.SourceZone = new String(source.SourceZone);
        }
        if (source.SourceVpc != null) {
            this.SourceVpc = new String(source.SourceVpc);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.TargetZone != null) {
            this.TargetZone = new String(source.TargetZone);
        }
        if (source.TargetVpc != null) {
            this.TargetVpc = new String(source.TargetVpc);
        }
        if (source.SourceResourceId != null) {
            this.SourceResourceId = new String(source.SourceResourceId);
        }
        if (source.TargetResourceId != null) {
            this.TargetResourceId = new String(source.TargetResourceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceCopyPairId != null) {
            this.InstanceCopyPairId = new String(source.InstanceCopyPairId);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.LatestProtectionTime != null) {
            this.LatestProtectionTime = new String(source.LatestProtectionTime);
        }
        if (source.RecoveryPointObjective != null) {
            this.RecoveryPointObjective = new Long(source.RecoveryPointObjective);
        }
        if (source.DataDirection != null) {
            this.DataDirection = new String(source.DataDirection);
        }
        if (source.CreateFrom != null) {
            this.CreateFrom = new String(source.CreateFrom);
        }
        if (source.DisasterRecoveryType != null) {
            this.DisasterRecoveryType = new String(source.DisasterRecoveryType);
        }
        if (source.PeerCloudName != null) {
            this.PeerCloudName = new String(source.PeerCloudName);
        }
        if (source.Rollbacking != null) {
            this.Rollbacking = new Long(source.Rollbacking);
        }
        if (source.RollbackPercent != null) {
            this.RollbackPercent = new Long(source.RollbackPercent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.DrillGroupId != null) {
            this.DrillGroupId = new String(source.DrillGroupId);
        }
        if (source.ProtectionTimeSet != null) {
            this.ProtectionTimeSet = new String[source.ProtectionTimeSet.length];
            for (int i = 0; i < source.ProtectionTimeSet.length; i++) {
                this.ProtectionTimeSet[i] = new String(source.ProtectionTimeSet[i]);
            }
        }
        if (source.DiskCopyPairSet != null) {
            this.DiskCopyPairSet = new DiskCopyPairForCvm[source.DiskCopyPairSet.length];
            for (int i = 0; i < source.DiskCopyPairSet.length; i++) {
                this.DiskCopyPairSet[i] = new DiskCopyPairForCvm(source.DiskCopyPairSet[i]);
            }
        }
        if (source.DeferredCreate != null) {
            this.DeferredCreate = new Boolean(source.DeferredCreate);
        }
        if (source.TargetCvmCreated != null) {
            this.TargetCvmCreated = new Boolean(source.TargetCvmCreated);
        }
        if (source.CvmCreateParams != null) {
            this.CvmCreateParams = new String(source.CvmCreateParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CopyPairId", this.CopyPairId);
        this.setParamSimple(map, prefix + "CopyPairName", this.CopyPairName);
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamSimple(map, prefix + "SitePairName", this.SitePairName);
        this.setParamSimple(map, prefix + "ProtectGroupId", this.ProtectGroupId);
        this.setParamSimple(map, prefix + "ProtectGroupName", this.ProtectGroupName);
        this.setParamSimple(map, prefix + "CopyPairState", this.CopyPairState);
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "SourceZone", this.SourceZone);
        this.setParamSimple(map, prefix + "SourceVpc", this.SourceVpc);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "TargetZone", this.TargetZone);
        this.setParamSimple(map, prefix + "TargetVpc", this.TargetVpc);
        this.setParamSimple(map, prefix + "SourceResourceId", this.SourceResourceId);
        this.setParamSimple(map, prefix + "TargetResourceId", this.TargetResourceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceCopyPairId", this.InstanceCopyPairId);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "LatestProtectionTime", this.LatestProtectionTime);
        this.setParamSimple(map, prefix + "RecoveryPointObjective", this.RecoveryPointObjective);
        this.setParamSimple(map, prefix + "DataDirection", this.DataDirection);
        this.setParamSimple(map, prefix + "CreateFrom", this.CreateFrom);
        this.setParamSimple(map, prefix + "DisasterRecoveryType", this.DisasterRecoveryType);
        this.setParamSimple(map, prefix + "PeerCloudName", this.PeerCloudName);
        this.setParamSimple(map, prefix + "Rollbacking", this.Rollbacking);
        this.setParamSimple(map, prefix + "RollbackPercent", this.RollbackPercent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "DrillGroupId", this.DrillGroupId);
        this.setParamArraySimple(map, prefix + "ProtectionTimeSet.", this.ProtectionTimeSet);
        this.setParamArrayObj(map, prefix + "DiskCopyPairSet.", this.DiskCopyPairSet);
        this.setParamSimple(map, prefix + "DeferredCreate", this.DeferredCreate);
        this.setParamSimple(map, prefix + "TargetCvmCreated", this.TargetCvmCreated);
        this.setParamSimple(map, prefix + "CvmCreateParams", this.CvmCreateParams);

    }
}

