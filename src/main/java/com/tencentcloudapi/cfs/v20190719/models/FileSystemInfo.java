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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileSystemInfo extends AbstractModel {

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <p>用户自定义名称</p>
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * <p>文件系统 ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>文件系统状态。取值范围：</p><ul><li>creating:创建中</li><li>mounting:挂载中</li><li>create_failed:创建失败</li><li>available:可使用</li><li>unserviced:停服中</li><li>upgrading:升级中</li></ul>
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * <p>文件系统已使用容量。单位：Byte</p>
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * <p>文件系统空间限制。单位:GiB</p>
    */
    @SerializedName("SizeLimit")
    @Expose
    private Long SizeLimit;

    /**
    * <p>区域 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>区域名称</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>文件系统协议类型, 支持 NFS,CIFS,TURBO</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>存储类型，HP：通用性能型；SD：通用标准型；TP:turbo性能型；TB：turbo标准型；THP：吞吐型</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>文件系统绑定的预付费存储包</p>
    */
    @SerializedName("StorageResourcePkg")
    @Expose
    private String StorageResourcePkg;

    /**
    * <p>文件系统绑定的预付费带宽包（暂未支持）</p>
    */
    @SerializedName("BandwidthResourcePkg")
    @Expose
    private String BandwidthResourcePkg;

    /**
    * <p>文件系统绑定权限组信息</p>
    */
    @SerializedName("PGroup")
    @Expose
    private PGroup PGroup;

    /**
    * <p>用户自定义名称</p>
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <p>文件系统是否加密,true：代表加密，false：非加密</p>
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * <p>加密所使用的密钥，可以为密钥的 ID 或者 ARN</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>文件系统吞吐上限，吞吐上限是根据文件系统当前已使用存储量、绑定的存储资源包以及吞吐资源包一同确定. 单位MiB/s</p>
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Float BandwidthLimit;

    /**
    * <p>文件系统关联的快照策略</p>
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * <p>文件系统处理快照状态,snapping：快照中，normal：正常状态</p>
    */
    @SerializedName("SnapStatus")
    @Expose
    private String SnapStatus;

    /**
    * <p>文件系统容量规格上限<br>单位:GiB</p>
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * <p>文件系统标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>文件系统生命周期管理状态<br>NotAvailable：不可用<br>Available:可用</p>
    */
    @SerializedName("TieringState")
    @Expose
    private String TieringState;

    /**
    * <p>分层存储详情</p>
    */
    @SerializedName("TieringDetail")
    @Expose
    private TieringDetailInfo TieringDetail;

    /**
    * <p>文件系统自动扩容策略</p>
    */
    @SerializedName("AutoScaleUpRule")
    @Expose
    private AutoScaleUpRule AutoScaleUpRule;

    /**
    * <p>文件系统版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>额外性能信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExstraPerformanceInfo")
    @Expose
    private ExstraPerformanceInfo [] ExstraPerformanceInfo;

    /**
    * <p>basic：标准版元数据类型<br>enhanced：增项版元数据类型</p>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS</li></ul>
    */
    @SerializedName("Scenario")
    @Expose
    private String Scenario;

    /**
     * Get <p>创建时间</p> 
     * @return CreationTime <p>创建时间</p>
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreationTime <p>创建时间</p>
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>用户自定义名称</p> 
     * @return CreationToken <p>用户自定义名称</p>
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set <p>用户自定义名称</p>
     * @param CreationToken <p>用户自定义名称</p>
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
    }

    /**
     * Get <p>文件系统 ID</p> 
     * @return FileSystemId <p>文件系统 ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统 ID</p>
     * @param FileSystemId <p>文件系统 ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>文件系统状态。取值范围：</p><ul><li>creating:创建中</li><li>mounting:挂载中</li><li>create_failed:创建失败</li><li>available:可使用</li><li>unserviced:停服中</li><li>upgrading:升级中</li></ul> 
     * @return LifeCycleState <p>文件系统状态。取值范围：</p><ul><li>creating:创建中</li><li>mounting:挂载中</li><li>create_failed:创建失败</li><li>available:可使用</li><li>unserviced:停服中</li><li>upgrading:升级中</li></ul>
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set <p>文件系统状态。取值范围：</p><ul><li>creating:创建中</li><li>mounting:挂载中</li><li>create_failed:创建失败</li><li>available:可使用</li><li>unserviced:停服中</li><li>upgrading:升级中</li></ul>
     * @param LifeCycleState <p>文件系统状态。取值范围：</p><ul><li>creating:创建中</li><li>mounting:挂载中</li><li>create_failed:创建失败</li><li>available:可使用</li><li>unserviced:停服中</li><li>upgrading:升级中</li></ul>
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get <p>文件系统已使用容量。单位：Byte</p> 
     * @return SizeByte <p>文件系统已使用容量。单位：Byte</p>
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set <p>文件系统已使用容量。单位：Byte</p>
     * @param SizeByte <p>文件系统已使用容量。单位：Byte</p>
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get <p>文件系统空间限制。单位:GiB</p> 
     * @return SizeLimit <p>文件系统空间限制。单位:GiB</p>
     */
    public Long getSizeLimit() {
        return this.SizeLimit;
    }

    /**
     * Set <p>文件系统空间限制。单位:GiB</p>
     * @param SizeLimit <p>文件系统空间限制。单位:GiB</p>
     */
    public void setSizeLimit(Long SizeLimit) {
        this.SizeLimit = SizeLimit;
    }

    /**
     * Get <p>区域 ID</p> 
     * @return ZoneId <p>区域 ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>区域 ID</p>
     * @param ZoneId <p>区域 ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>区域名称</p> 
     * @return Zone <p>区域名称</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>区域名称</p>
     * @param Zone <p>区域名称</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>文件系统协议类型, 支持 NFS,CIFS,TURBO</p> 
     * @return Protocol <p>文件系统协议类型, 支持 NFS,CIFS,TURBO</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>文件系统协议类型, 支持 NFS,CIFS,TURBO</p>
     * @param Protocol <p>文件系统协议类型, 支持 NFS,CIFS,TURBO</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>存储类型，HP：通用性能型；SD：通用标准型；TP:turbo性能型；TB：turbo标准型；THP：吞吐型</p> 
     * @return StorageType <p>存储类型，HP：通用性能型；SD：通用标准型；TP:turbo性能型；TB：turbo标准型；THP：吞吐型</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型，HP：通用性能型；SD：通用标准型；TP:turbo性能型；TB：turbo标准型；THP：吞吐型</p>
     * @param StorageType <p>存储类型，HP：通用性能型；SD：通用标准型；TP:turbo性能型；TB：turbo标准型；THP：吞吐型</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>文件系统绑定的预付费存储包</p> 
     * @return StorageResourcePkg <p>文件系统绑定的预付费存储包</p>
     */
    public String getStorageResourcePkg() {
        return this.StorageResourcePkg;
    }

    /**
     * Set <p>文件系统绑定的预付费存储包</p>
     * @param StorageResourcePkg <p>文件系统绑定的预付费存储包</p>
     */
    public void setStorageResourcePkg(String StorageResourcePkg) {
        this.StorageResourcePkg = StorageResourcePkg;
    }

    /**
     * Get <p>文件系统绑定的预付费带宽包（暂未支持）</p> 
     * @return BandwidthResourcePkg <p>文件系统绑定的预付费带宽包（暂未支持）</p>
     */
    public String getBandwidthResourcePkg() {
        return this.BandwidthResourcePkg;
    }

    /**
     * Set <p>文件系统绑定的预付费带宽包（暂未支持）</p>
     * @param BandwidthResourcePkg <p>文件系统绑定的预付费带宽包（暂未支持）</p>
     */
    public void setBandwidthResourcePkg(String BandwidthResourcePkg) {
        this.BandwidthResourcePkg = BandwidthResourcePkg;
    }

    /**
     * Get <p>文件系统绑定权限组信息</p> 
     * @return PGroup <p>文件系统绑定权限组信息</p>
     */
    public PGroup getPGroup() {
        return this.PGroup;
    }

    /**
     * Set <p>文件系统绑定权限组信息</p>
     * @param PGroup <p>文件系统绑定权限组信息</p>
     */
    public void setPGroup(PGroup PGroup) {
        this.PGroup = PGroup;
    }

    /**
     * Get <p>用户自定义名称</p> 
     * @return FsName <p>用户自定义名称</p>
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <p>用户自定义名称</p>
     * @param FsName <p>用户自定义名称</p>
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <p>文件系统是否加密,true：代表加密，false：非加密</p> 
     * @return Encrypted <p>文件系统是否加密,true：代表加密，false：非加密</p>
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set <p>文件系统是否加密,true：代表加密，false：非加密</p>
     * @param Encrypted <p>文件系统是否加密,true：代表加密，false：非加密</p>
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get <p>加密所使用的密钥，可以为密钥的 ID 或者 ARN</p> 
     * @return KmsKeyId <p>加密所使用的密钥，可以为密钥的 ID 或者 ARN</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>加密所使用的密钥，可以为密钥的 ID 或者 ARN</p>
     * @param KmsKeyId <p>加密所使用的密钥，可以为密钥的 ID 或者 ARN</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>文件系统吞吐上限，吞吐上限是根据文件系统当前已使用存储量、绑定的存储资源包以及吞吐资源包一同确定. 单位MiB/s</p> 
     * @return BandwidthLimit <p>文件系统吞吐上限，吞吐上限是根据文件系统当前已使用存储量、绑定的存储资源包以及吞吐资源包一同确定. 单位MiB/s</p>
     */
    public Float getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set <p>文件系统吞吐上限，吞吐上限是根据文件系统当前已使用存储量、绑定的存储资源包以及吞吐资源包一同确定. 单位MiB/s</p>
     * @param BandwidthLimit <p>文件系统吞吐上限，吞吐上限是根据文件系统当前已使用存储量、绑定的存储资源包以及吞吐资源包一同确定. 单位MiB/s</p>
     */
    public void setBandwidthLimit(Float BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * Get <p>文件系统关联的快照策略</p> 
     * @return AutoSnapshotPolicyId <p>文件系统关联的快照策略</p>
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set <p>文件系统关联的快照策略</p>
     * @param AutoSnapshotPolicyId <p>文件系统关联的快照策略</p>
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get <p>文件系统处理快照状态,snapping：快照中，normal：正常状态</p> 
     * @return SnapStatus <p>文件系统处理快照状态,snapping：快照中，normal：正常状态</p>
     */
    public String getSnapStatus() {
        return this.SnapStatus;
    }

    /**
     * Set <p>文件系统处理快照状态,snapping：快照中，normal：正常状态</p>
     * @param SnapStatus <p>文件系统处理快照状态,snapping：快照中，normal：正常状态</p>
     */
    public void setSnapStatus(String SnapStatus) {
        this.SnapStatus = SnapStatus;
    }

    /**
     * Get <p>文件系统容量规格上限<br>单位:GiB</p> 
     * @return Capacity <p>文件系统容量规格上限<br>单位:GiB</p>
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set <p>文件系统容量规格上限<br>单位:GiB</p>
     * @param Capacity <p>文件系统容量规格上限<br>单位:GiB</p>
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get <p>文件系统标签列表</p> 
     * @return Tags <p>文件系统标签列表</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>文件系统标签列表</p>
     * @param Tags <p>文件系统标签列表</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>文件系统生命周期管理状态<br>NotAvailable：不可用<br>Available:可用</p> 
     * @return TieringState <p>文件系统生命周期管理状态<br>NotAvailable：不可用<br>Available:可用</p>
     */
    public String getTieringState() {
        return this.TieringState;
    }

    /**
     * Set <p>文件系统生命周期管理状态<br>NotAvailable：不可用<br>Available:可用</p>
     * @param TieringState <p>文件系统生命周期管理状态<br>NotAvailable：不可用<br>Available:可用</p>
     */
    public void setTieringState(String TieringState) {
        this.TieringState = TieringState;
    }

    /**
     * Get <p>分层存储详情</p> 
     * @return TieringDetail <p>分层存储详情</p>
     */
    public TieringDetailInfo getTieringDetail() {
        return this.TieringDetail;
    }

    /**
     * Set <p>分层存储详情</p>
     * @param TieringDetail <p>分层存储详情</p>
     */
    public void setTieringDetail(TieringDetailInfo TieringDetail) {
        this.TieringDetail = TieringDetail;
    }

    /**
     * Get <p>文件系统自动扩容策略</p> 
     * @return AutoScaleUpRule <p>文件系统自动扩容策略</p>
     */
    public AutoScaleUpRule getAutoScaleUpRule() {
        return this.AutoScaleUpRule;
    }

    /**
     * Set <p>文件系统自动扩容策略</p>
     * @param AutoScaleUpRule <p>文件系统自动扩容策略</p>
     */
    public void setAutoScaleUpRule(AutoScaleUpRule AutoScaleUpRule) {
        this.AutoScaleUpRule = AutoScaleUpRule;
    }

    /**
     * Get <p>文件系统版本</p> 
     * @return Version <p>文件系统版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>文件系统版本</p>
     * @param Version <p>文件系统版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>额外性能信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExstraPerformanceInfo <p>额外性能信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExstraPerformanceInfo [] getExstraPerformanceInfo() {
        return this.ExstraPerformanceInfo;
    }

    /**
     * Set <p>额外性能信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExstraPerformanceInfo <p>额外性能信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExstraPerformanceInfo(ExstraPerformanceInfo [] ExstraPerformanceInfo) {
        this.ExstraPerformanceInfo = ExstraPerformanceInfo;
    }

    /**
     * Get <p>basic：标准版元数据类型<br>enhanced：增项版元数据类型</p> 
     * @return MetaType <p>basic：标准版元数据类型<br>enhanced：增项版元数据类型</p>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>basic：标准版元数据类型<br>enhanced：增项版元数据类型</p>
     * @param MetaType <p>basic：标准版元数据类型<br>enhanced：增项版元数据类型</p>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS</li></ul> 
     * @return Scenario <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS</li></ul>
     */
    public String getScenario() {
        return this.Scenario;
    }

    /**
     * Set <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS</li></ul>
     * @param Scenario <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS</li></ul>
     */
    public void setScenario(String Scenario) {
        this.Scenario = Scenario;
    }

    public FileSystemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileSystemInfo(FileSystemInfo source) {
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.CreationToken != null) {
            this.CreationToken = new String(source.CreationToken);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.LifeCycleState != null) {
            this.LifeCycleState = new String(source.LifeCycleState);
        }
        if (source.SizeByte != null) {
            this.SizeByte = new Long(source.SizeByte);
        }
        if (source.SizeLimit != null) {
            this.SizeLimit = new Long(source.SizeLimit);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StorageResourcePkg != null) {
            this.StorageResourcePkg = new String(source.StorageResourcePkg);
        }
        if (source.BandwidthResourcePkg != null) {
            this.BandwidthResourcePkg = new String(source.BandwidthResourcePkg);
        }
        if (source.PGroup != null) {
            this.PGroup = new PGroup(source.PGroup);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BandwidthLimit != null) {
            this.BandwidthLimit = new Float(source.BandwidthLimit);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.SnapStatus != null) {
            this.SnapStatus = new String(source.SnapStatus);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.TieringState != null) {
            this.TieringState = new String(source.TieringState);
        }
        if (source.TieringDetail != null) {
            this.TieringDetail = new TieringDetailInfo(source.TieringDetail);
        }
        if (source.AutoScaleUpRule != null) {
            this.AutoScaleUpRule = new AutoScaleUpRule(source.AutoScaleUpRule);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ExstraPerformanceInfo != null) {
            this.ExstraPerformanceInfo = new ExstraPerformanceInfo[source.ExstraPerformanceInfo.length];
            for (int i = 0; i < source.ExstraPerformanceInfo.length; i++) {
                this.ExstraPerformanceInfo[i] = new ExstraPerformanceInfo(source.ExstraPerformanceInfo[i]);
            }
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.Scenario != null) {
            this.Scenario = new String(source.Scenario);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "CreationToken", this.CreationToken);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "LifeCycleState", this.LifeCycleState);
        this.setParamSimple(map, prefix + "SizeByte", this.SizeByte);
        this.setParamSimple(map, prefix + "SizeLimit", this.SizeLimit);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageResourcePkg", this.StorageResourcePkg);
        this.setParamSimple(map, prefix + "BandwidthResourcePkg", this.BandwidthResourcePkg);
        this.setParamObj(map, prefix + "PGroup.", this.PGroup);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BandwidthLimit", this.BandwidthLimit);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "SnapStatus", this.SnapStatus);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TieringState", this.TieringState);
        this.setParamObj(map, prefix + "TieringDetail.", this.TieringDetail);
        this.setParamObj(map, prefix + "AutoScaleUpRule.", this.AutoScaleUpRule);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "ExstraPerformanceInfo.", this.ExstraPerformanceInfo);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "Scenario", this.Scenario);

    }
}

