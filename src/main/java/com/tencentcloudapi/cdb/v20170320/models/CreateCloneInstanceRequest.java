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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloneInstanceRequest extends AbstractModel{

    /**
    * 克隆源实例Id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 如果需要克隆实例回档到指定时间，则指定该值。时间格式为： yyyy-mm-dd hh:mm:ss 。
    */
    @SerializedName("SpecifiedRollbackTime")
    @Expose
    private String SpecifiedRollbackTime;

    /**
    * 如果需要克隆实例回档到指定备份的时间点，则指定该值为物理备份的Id。请使用 [查询数据备份文件列表](/document/api/236/15842) 。
    */
    @SerializedName("SpecifiedBackupId")
    @Expose
    private Long SpecifiedBackupId;

    /**
    * 私有网络 ID，如果不传则默认选择基础网络，请使用 [查询私有网络列表](/document/api/215/15778) 。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 新产生的克隆实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 安全组参数，可使用 [查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850) 接口查询某个项目的安全组详情。
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 实例标签信息。
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * 实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * 新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * 备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * 克隆实例类型。支持值包括： "UNIVERSAL" - 通用型实例， "EXCLUSIVE" - 独享型实例。 不指定则默认为通用型。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * 置放群组 ID。
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * 是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 金融围拢 ID 。
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * 项目ID，默认项目ID0
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 克隆源实例Id。 
     * @return InstanceId 克隆源实例Id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 克隆源实例Id。
     * @param InstanceId 克隆源实例Id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 如果需要克隆实例回档到指定时间，则指定该值。时间格式为： yyyy-mm-dd hh:mm:ss 。 
     * @return SpecifiedRollbackTime 如果需要克隆实例回档到指定时间，则指定该值。时间格式为： yyyy-mm-dd hh:mm:ss 。
     */
    public String getSpecifiedRollbackTime() {
        return this.SpecifiedRollbackTime;
    }

    /**
     * Set 如果需要克隆实例回档到指定时间，则指定该值。时间格式为： yyyy-mm-dd hh:mm:ss 。
     * @param SpecifiedRollbackTime 如果需要克隆实例回档到指定时间，则指定该值。时间格式为： yyyy-mm-dd hh:mm:ss 。
     */
    public void setSpecifiedRollbackTime(String SpecifiedRollbackTime) {
        this.SpecifiedRollbackTime = SpecifiedRollbackTime;
    }

    /**
     * Get 如果需要克隆实例回档到指定备份的时间点，则指定该值为物理备份的Id。请使用 [查询数据备份文件列表](/document/api/236/15842) 。 
     * @return SpecifiedBackupId 如果需要克隆实例回档到指定备份的时间点，则指定该值为物理备份的Id。请使用 [查询数据备份文件列表](/document/api/236/15842) 。
     */
    public Long getSpecifiedBackupId() {
        return this.SpecifiedBackupId;
    }

    /**
     * Set 如果需要克隆实例回档到指定备份的时间点，则指定该值为物理备份的Id。请使用 [查询数据备份文件列表](/document/api/236/15842) 。
     * @param SpecifiedBackupId 如果需要克隆实例回档到指定备份的时间点，则指定该值为物理备份的Id。请使用 [查询数据备份文件列表](/document/api/236/15842) 。
     */
    public void setSpecifiedBackupId(Long SpecifiedBackupId) {
        this.SpecifiedBackupId = SpecifiedBackupId;
    }

    /**
     * Get 私有网络 ID，如果不传则默认选择基础网络，请使用 [查询私有网络列表](/document/api/215/15778) 。 
     * @return UniqVpcId 私有网络 ID，如果不传则默认选择基础网络，请使用 [查询私有网络列表](/document/api/215/15778) 。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络 ID，如果不传则默认选择基础网络，请使用 [查询私有网络列表](/document/api/215/15778) 。
     * @param UniqVpcId 私有网络 ID，如果不传则默认选择基础网络，请使用 [查询私有网络列表](/document/api/215/15778) 。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。 
     * @return UniqSubnetId 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。
     * @param UniqSubnetId 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。 
     * @return Memory 实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。
     * @param Memory 实例内存大小，单位：MB，需要不低于克隆源实例，默认和源实例相同。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。 
     * @return Volume 实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。
     * @param Volume 实例硬盘大小，单位：GB，需要不低于克隆源实例，默认和源实例相同。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 新产生的克隆实例名称。 
     * @return InstanceName 新产生的克隆实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 新产生的克隆实例名称。
     * @param InstanceName 新产生的克隆实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 安全组参数，可使用 [查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850) 接口查询某个项目的安全组详情。 
     * @return SecurityGroup 安全组参数，可使用 [查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850) 接口查询某个项目的安全组详情。
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组参数，可使用 [查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850) 接口查询某个项目的安全组详情。
     * @param SecurityGroup 安全组参数，可使用 [查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850) 接口查询某个项目的安全组详情。
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 实例标签信息。 
     * @return ResourceTags 实例标签信息。
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 实例标签信息。
     * @param ResourceTags 实例标签信息。
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。 
     * @return Cpu 实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。
     * @param Cpu 实例Cpu核数，需要不低于克隆源实例，默认和源实例相同。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。 
     * @return ProtectMode 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
     * @param ProtectMode 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。 
     * @return DeployMode 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。
     * @param DeployMode 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。 
     * @return SlaveZone 新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set 新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。
     * @param SlaveZone 新产生的克隆实例备库 1 的可用区信息，默认同源实例 Zone 的值。
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get 备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。 
     * @return BackupZone 备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set 备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。
     * @param BackupZone 备库 2 的可用区信息，默认为空，克隆强同步主实例时可指定该参数。
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get 克隆实例类型。支持值包括： "UNIVERSAL" - 通用型实例， "EXCLUSIVE" - 独享型实例。 不指定则默认为通用型。 
     * @return DeviceType 克隆实例类型。支持值包括： "UNIVERSAL" - 通用型实例， "EXCLUSIVE" - 独享型实例。 不指定则默认为通用型。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 克隆实例类型。支持值包括： "UNIVERSAL" - 通用型实例， "EXCLUSIVE" - 独享型实例。 不指定则默认为通用型。
     * @param DeviceType 克隆实例类型。支持值包括： "UNIVERSAL" - 通用型实例， "EXCLUSIVE" - 独享型实例。 不指定则默认为通用型。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。 
     * @return InstanceNodes 新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set 新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。
     * @param InstanceNodes 新克隆实例节点数。如果需要克隆出三节点实例， 请将该值设置为3 或指定 BackupZone 参数。如果需要克隆出两节点实例，请将该值设置为2。默认克隆出两节点实例。
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get 置放群组 ID。 
     * @return DeployGroupId 置放群组 ID。
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set 置放群组 ID。
     * @param DeployGroupId 置放群组 ID。
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get 是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。 
     * @return DryRun 是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。
     * @param DryRun 是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 金融围拢 ID 。 
     * @return CageId 金融围拢 ID 。
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set 金融围拢 ID 。
     * @param CageId 金融围拢 ID 。
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * Get 项目ID，默认项目ID0 
     * @return ProjectId 项目ID，默认项目ID0
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，默认项目ID0
     * @param ProjectId 项目ID，默认项目ID0
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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

    }
}

