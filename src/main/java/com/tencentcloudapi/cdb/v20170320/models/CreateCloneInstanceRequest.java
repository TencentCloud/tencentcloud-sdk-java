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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloneInstanceRequest extends AbstractModel {

    /**
    * <p>克隆源实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>如果需要克隆实例回档到指定时间，则指定该值。时间格式为：yyyy-mm-dd hh:mm:ss。<br>说明：此参数和 SpecifiedBackupId 参数需要2选1进行设置。</p>
    */
    @SerializedName("SpecifiedRollbackTime")
    @Expose
    private String SpecifiedRollbackTime;

    /**
    * <p>如果需要克隆实例回档到指定备份集，则指定该值为备份文件的 Id。请使用 <a href="/document/api/236/15842">查询数据备份文件列表</a>。<br>说明：如果是克隆双节点、三节点实例，备份文件为物理备份，如果是克隆单节点、云盘版实例，备份文件为快照备份。</p>
    */
    @SerializedName("SpecifiedBackupId")
    @Expose
    private Long SpecifiedBackupId;

    /**
    * <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>新产生的克隆实例名称。支持输入最大60个字符。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>安全组参数，可使用 <a href="https://cloud.tencent.com/document/api/236/15850">查询项目安全组信息</a> 接口查询某个项目的安全组详情。</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * <p>实例标签信息。</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * <p>实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。</p>
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * <p>备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。</p>
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * <p>克隆实例类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型。</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。</p>
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * <p>置放群组 ID。</p>
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * <p>是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>金融围拢 ID 。</p>
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * <p>项目ID，默认项目ID0</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>付费类型，PRE_PAID：包年包月，USED_PAID：按量计费。默认为按量计费</p>
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * <p>实例时长，PayType为PRE_PAID时必传，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>云盘版节点拓扑配置。</p>
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
    * <p>原实例所在地域名，当传入异地备份时为必选项，例：ap-guangzhou</p>
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * <p>异地数据备份id</p>
    */
    @SerializedName("SpecifiedSubBackupId")
    @Expose
    private Long SpecifiedSubBackupId;

    /**
    * <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get <p>克隆源实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/15872">DescribeDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>克隆源实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>克隆源实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/15872">DescribeDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>克隆源实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>如果需要克隆实例回档到指定时间，则指定该值。时间格式为：yyyy-mm-dd hh:mm:ss。<br>说明：此参数和 SpecifiedBackupId 参数需要2选1进行设置。</p> 
     * @return SpecifiedRollbackTime <p>如果需要克隆实例回档到指定时间，则指定该值。时间格式为：yyyy-mm-dd hh:mm:ss。<br>说明：此参数和 SpecifiedBackupId 参数需要2选1进行设置。</p>
     */
    public String getSpecifiedRollbackTime() {
        return this.SpecifiedRollbackTime;
    }

    /**
     * Set <p>如果需要克隆实例回档到指定时间，则指定该值。时间格式为：yyyy-mm-dd hh:mm:ss。<br>说明：此参数和 SpecifiedBackupId 参数需要2选1进行设置。</p>
     * @param SpecifiedRollbackTime <p>如果需要克隆实例回档到指定时间，则指定该值。时间格式为：yyyy-mm-dd hh:mm:ss。<br>说明：此参数和 SpecifiedBackupId 参数需要2选1进行设置。</p>
     */
    public void setSpecifiedRollbackTime(String SpecifiedRollbackTime) {
        this.SpecifiedRollbackTime = SpecifiedRollbackTime;
    }

    /**
     * Get <p>如果需要克隆实例回档到指定备份集，则指定该值为备份文件的 Id。请使用 <a href="/document/api/236/15842">查询数据备份文件列表</a>。<br>说明：如果是克隆双节点、三节点实例，备份文件为物理备份，如果是克隆单节点、云盘版实例，备份文件为快照备份。</p> 
     * @return SpecifiedBackupId <p>如果需要克隆实例回档到指定备份集，则指定该值为备份文件的 Id。请使用 <a href="/document/api/236/15842">查询数据备份文件列表</a>。<br>说明：如果是克隆双节点、三节点实例，备份文件为物理备份，如果是克隆单节点、云盘版实例，备份文件为快照备份。</p>
     */
    public Long getSpecifiedBackupId() {
        return this.SpecifiedBackupId;
    }

    /**
     * Set <p>如果需要克隆实例回档到指定备份集，则指定该值为备份文件的 Id。请使用 <a href="/document/api/236/15842">查询数据备份文件列表</a>。<br>说明：如果是克隆双节点、三节点实例，备份文件为物理备份，如果是克隆单节点、云盘版实例，备份文件为快照备份。</p>
     * @param SpecifiedBackupId <p>如果需要克隆实例回档到指定备份集，则指定该值为备份文件的 Id。请使用 <a href="/document/api/236/15842">查询数据备份文件列表</a>。<br>说明：如果是克隆双节点、三节点实例，备份文件为物理备份，如果是克隆单节点、云盘版实例，备份文件为快照备份。</p>
     */
    public void setSpecifiedBackupId(Long SpecifiedBackupId) {
        this.SpecifiedBackupId = SpecifiedBackupId;
    }

    /**
     * Get <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。</p> 
     * @return UniqVpcId <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。</p>
     * @param UniqVpcId <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。</p> 
     * @return UniqSubnetId <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。</p>
     * @param UniqSubnetId <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。</p> 
     * @return Memory <p>实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。</p>
     * @param Memory <p>实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。</p> 
     * @return Volume <p>实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。</p>
     * @param Volume <p>实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>新产生的克隆实例名称。支持输入最大60个字符。</p> 
     * @return InstanceName <p>新产生的克隆实例名称。支持输入最大60个字符。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>新产生的克隆实例名称。支持输入最大60个字符。</p>
     * @param InstanceName <p>新产生的克隆实例名称。支持输入最大60个字符。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>安全组参数，可使用 <a href="https://cloud.tencent.com/document/api/236/15850">查询项目安全组信息</a> 接口查询某个项目的安全组详情。</p> 
     * @return SecurityGroup <p>安全组参数，可使用 <a href="https://cloud.tencent.com/document/api/236/15850">查询项目安全组信息</a> 接口查询某个项目的安全组详情。</p>
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set <p>安全组参数，可使用 <a href="https://cloud.tencent.com/document/api/236/15850">查询项目安全组信息</a> 接口查询某个项目的安全组详情。</p>
     * @param SecurityGroup <p>安全组参数，可使用 <a href="https://cloud.tencent.com/document/api/236/15850">查询项目安全组信息</a> 接口查询某个项目的安全组详情。</p>
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get <p>实例标签信息。</p> 
     * @return ResourceTags <p>实例标签信息。</p>
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>实例标签信息。</p>
     * @param ResourceTags <p>实例标签信息。</p>
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。</p> 
     * @return Cpu <p>实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。</p>
     * @param Cpu <p>实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p> 
     * @return ProtectMode <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
     * @param ProtectMode <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p> 
     * @return DeployMode <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p>
     * @param DeployMode <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。</p> 
     * @return SlaveZone <p>新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。</p>
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set <p>新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。</p>
     * @param SlaveZone <p>新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。</p>
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get <p>备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。</p> 
     * @return BackupZone <p>备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。</p>
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set <p>备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。</p>
     * @param BackupZone <p>备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。</p>
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get <p>克隆实例类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型。</p> 
     * @return DeviceType <p>克隆实例类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型。</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>克隆实例类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型。</p>
     * @param DeviceType <p>克隆实例类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型。</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。</p> 
     * @return InstanceNodes <p>新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。</p>
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set <p>新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。</p>
     * @param InstanceNodes <p>新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。</p>
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get <p>置放群组 ID。</p> 
     * @return DeployGroupId <p>置放群组 ID。</p>
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set <p>置放群组 ID。</p>
     * @param DeployGroupId <p>置放群组 ID。</p>
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get <p>是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。</p> 
     * @return DryRun <p>是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。</p>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。</p>
     * @param DryRun <p>是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。</p>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>金融围拢 ID 。</p> 
     * @return CageId <p>金融围拢 ID 。</p>
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set <p>金融围拢 ID 。</p>
     * @param CageId <p>金融围拢 ID 。</p>
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * Get <p>项目ID，默认项目ID0</p> 
     * @return ProjectId <p>项目ID，默认项目ID0</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID，默认项目ID0</p>
     * @param ProjectId <p>项目ID，默认项目ID0</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>付费类型，PRE_PAID：包年包月，USED_PAID：按量计费。默认为按量计费</p> 
     * @return PayType <p>付费类型，PRE_PAID：包年包月，USED_PAID：按量计费。默认为按量计费</p>
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>付费类型，PRE_PAID：包年包月，USED_PAID：按量计费。默认为按量计费</p>
     * @param PayType <p>付费类型，PRE_PAID：包年包月，USED_PAID：按量计费。默认为按量计费</p>
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>实例时长，PayType为PRE_PAID时必传，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p> 
     * @return Period <p>实例时长，PayType为PRE_PAID时必传，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>实例时长，PayType为PRE_PAID时必传，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
     * @param Period <p>实例时长，PayType为PRE_PAID时必传，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>云盘版节点拓扑配置。</p> 
     * @return ClusterTopology <p>云盘版节点拓扑配置。</p>
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set <p>云盘版节点拓扑配置。</p>
     * @param ClusterTopology <p>云盘版节点拓扑配置。</p>
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    /**
     * Get <p>原实例所在地域名，当传入异地备份时为必选项，例：ap-guangzhou</p> 
     * @return SrcRegion <p>原实例所在地域名，当传入异地备份时为必选项，例：ap-guangzhou</p>
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set <p>原实例所在地域名，当传入异地备份时为必选项，例：ap-guangzhou</p>
     * @param SrcRegion <p>原实例所在地域名，当传入异地备份时为必选项，例：ap-guangzhou</p>
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get <p>异地数据备份id</p> 
     * @return SpecifiedSubBackupId <p>异地数据备份id</p>
     */
    public Long getSpecifiedSubBackupId() {
        return this.SpecifiedSubBackupId;
    }

    /**
     * Set <p>异地数据备份id</p>
     * @param SpecifiedSubBackupId <p>异地数据备份id</p>
     */
    public void setSpecifiedSubBackupId(Long SpecifiedSubBackupId) {
        this.SpecifiedSubBackupId = SpecifiedSubBackupId;
    }

    /**
     * Get <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p> 
     * @return MasterZone <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p>
     * @deprecated
     */
    @Deprecated
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p>
     * @param MasterZone <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p>
     * @deprecated
     */
    @Deprecated
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p> 
     * @return Zone <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p>
     * @param Zone <p>新产生的克隆实例主库的可用区信息，默认同源实例 Zone 的值。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public CreateCloneInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloneInstanceRequest(CreateCloneInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SpecifiedRollbackTime != null) {
            this.SpecifiedRollbackTime = new String(source.SpecifiedRollbackTime);
        }
        if (source.SpecifiedBackupId != null) {
            this.SpecifiedBackupId = new Long(source.SpecifiedBackupId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfo[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfo(source.ResourceTags[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.BackupZone != null) {
            this.BackupZone = new String(source.BackupZone);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new Long(source.InstanceNodes);
        }
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ClusterTopology != null) {
            this.ClusterTopology = new ClusterTopology(source.ClusterTopology);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.SpecifiedSubBackupId != null) {
            this.SpecifiedSubBackupId = new Long(source.SpecifiedSubBackupId);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SpecifiedRollbackTime", this.SpecifiedRollbackTime);
        this.setParamSimple(map, prefix + "SpecifiedBackupId", this.SpecifiedBackupId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "BackupZone", this.BackupZone);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "CageId", this.CageId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamObj(map, prefix + "ClusterTopology.", this.ClusterTopology);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "SpecifiedSubBackupId", this.SpecifiedSubBackupId);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

