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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称，如ens-34241f3s。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例状态。取值范围：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中。
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 实例当前使用的镜像的信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private Image Image;

    /**
    * 实例当前所属的模块简要信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimpleModule")
    @Expose
    private SimpleModule SimpleModule;

    /**
    * 实例所在的位置相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Position Position;

    /**
    * 实例的网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Internet")
    @Expose
    private Internet Internet;

    /**
    * 实例的配置相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTypeConfig")
    @Expose
    private InstanceTypeConfig InstanceTypeConfig;

    /**
    * 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 实例最后一次操作。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 实例最后一次操作结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * 实例业务状态。取值范围：
NORMAL：表示正常状态的实例
EXPIRED：表示过期的实例
PROTECTIVELY_ISOLATED：表示被安全隔离的实例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * 系统盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * 数据盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Long DataDiskSize;

    /**
    * 实例UUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 付费方式。
    0为后付费。
    1为预付费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 过期时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 隔离时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 是否自动续费。
      0为不自动续费。
      1为自动续费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 过期状态。
    NORMAL 表示机器运行正常。
    WILL_EXPIRE 表示即将过期。
    EXPIRED 表示已过期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireState")
    @Expose
    private String ExpireState;

    /**
    * 系统盘信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemDisk")
    @Expose
    private DiskInfo SystemDisk;

    /**
    * 数据盘信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDisks")
    @Expose
    private DiskInfo [] DataDisks;

    /**
    * 新实例标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewFlag")
    @Expose
    private Long NewFlag;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称，如ens-34241f3s。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称，如ens-34241f3s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，如ens-34241f3s。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称，如ens-34241f3s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例状态。取值范围：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中。 
     * @return InstanceState 实例状态。取值范围：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中。
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态。取值范围：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中。
     * @param InstanceState 实例状态。取值范围：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中。
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 实例当前使用的镜像的信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 实例当前使用的镜像的信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Image getImage() {
        return this.Image;
    }

    /**
     * Set 实例当前使用的镜像的信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 实例当前使用的镜像的信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(Image Image) {
        this.Image = Image;
    }

    /**
     * Get 实例当前所属的模块简要信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SimpleModule 实例当前所属的模块简要信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimpleModule getSimpleModule() {
        return this.SimpleModule;
    }

    /**
     * Set 实例当前所属的模块简要信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SimpleModule 实例当前所属的模块简要信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimpleModule(SimpleModule SimpleModule) {
        this.SimpleModule = SimpleModule;
    }

    /**
     * Get 实例所在的位置相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 实例所在的位置相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Position getPosition() {
        return this.Position;
    }

    /**
     * Set 实例所在的位置相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 实例所在的位置相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Position Position) {
        this.Position = Position;
    }

    /**
     * Get 实例的网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Internet 实例的网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Internet getInternet() {
        return this.Internet;
    }

    /**
     * Set 实例的网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Internet 实例的网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternet(Internet Internet) {
        this.Internet = Internet;
    }

    /**
     * Get 实例的配置相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTypeConfig 实例的配置相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceTypeConfig getInstanceTypeConfig() {
        return this.InstanceTypeConfig;
    }

    /**
     * Set 实例的配置相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTypeConfig 实例的配置相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTypeConfig(InstanceTypeConfig InstanceTypeConfig) {
        this.InstanceTypeConfig = InstanceTypeConfig;
    }

    /**
     * Get 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 实例最后一次操作。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperation 实例最后一次操作。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 实例最后一次操作。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperation 实例最后一次操作。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 实例最后一次操作结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationState 实例最后一次操作结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 实例最后一次操作结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationState 实例最后一次操作结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get 实例业务状态。取值范围：
NORMAL：表示正常状态的实例
EXPIRED：表示过期的实例
PROTECTIVELY_ISOLATED：表示被安全隔离的实例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestrictState 实例业务状态。取值范围：
NORMAL：表示正常状态的实例
EXPIRED：表示过期的实例
PROTECTIVELY_ISOLATED：表示被安全隔离的实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set 实例业务状态。取值范围：
NORMAL：表示正常状态的实例
EXPIRED：表示过期的实例
PROTECTIVELY_ISOLATED：表示被安全隔离的实例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestrictState 实例业务状态。取值范围：
NORMAL：表示正常状态的实例
EXPIRED：表示过期的实例
PROTECTIVELY_ISOLATED：表示被安全隔离的实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Get 系统盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemDiskSize 系统盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set 系统盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemDiskSize 系统盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get 数据盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDiskSize 数据盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * Set 数据盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDiskSize 数据盘大小，单位GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDiskSize(Long DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * Get 实例UUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UUID 实例UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 实例UUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UUID 实例UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 付费方式。
    0为后付费。
    1为预付费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 付费方式。
    0为后付费。
    1为预付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费方式。
    0为后付费。
    1为预付费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 付费方式。
    0为后付费。
    1为预付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 过期时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 隔离时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime 隔离时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 隔离时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime 隔离时间。格式为yyyy-mm-dd HH:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 是否自动续费。
      0为不自动续费。
      1为自动续费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 是否自动续费。
      0为不自动续费。
      1为自动续费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 是否自动续费。
      0为不自动续费。
      1为自动续费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 是否自动续费。
      0为不自动续费。
      1为自动续费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 过期状态。
    NORMAL 表示机器运行正常。
    WILL_EXPIRE 表示即将过期。
    EXPIRED 表示已过期。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireState 过期状态。
    NORMAL 表示机器运行正常。
    WILL_EXPIRE 表示即将过期。
    EXPIRED 表示已过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireState() {
        return this.ExpireState;
    }

    /**
     * Set 过期状态。
    NORMAL 表示机器运行正常。
    WILL_EXPIRE 表示即将过期。
    EXPIRED 表示已过期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireState 过期状态。
    NORMAL 表示机器运行正常。
    WILL_EXPIRE 表示即将过期。
    EXPIRED 表示已过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireState(String ExpireState) {
        this.ExpireState = ExpireState;
    }

    /**
     * Get 系统盘信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemDisk 系统盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskInfo getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemDisk 系统盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemDisk(DiskInfo SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 数据盘信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDisks 数据盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskInfo [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 数据盘信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDisks 数据盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDisks(DiskInfo [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get 新实例标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewFlag 新实例标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewFlag() {
        return this.NewFlag;
    }

    /**
     * Set 新实例标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewFlag 新实例标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewFlag(Long NewFlag) {
        this.NewFlag = NewFlag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "SimpleModule.", this.SimpleModule);
        this.setParamObj(map, prefix + "Position.", this.Position);
        this.setParamObj(map, prefix + "Internet.", this.Internet);
        this.setParamObj(map, prefix + "InstanceTypeConfig.", this.InstanceTypeConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ExpireState", this.ExpireState);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "NewFlag", this.NewFlag);

    }
}

