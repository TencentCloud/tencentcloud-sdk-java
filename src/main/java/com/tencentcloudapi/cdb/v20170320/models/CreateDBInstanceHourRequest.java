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

public class CreateDBInstanceHourRequest extends AbstractModel {

    /**
    * 实例数量，默认值为 1，最小值 1，最大值为 100。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 实例内存大小，单位：MB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的内存规格。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小，单位：GB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的硬盘范围。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的实例版本。
说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 私有网络 ID，请使用 [查询私有网络列表](/document/api/215/15778)。
说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。
说明：若此项不填，则系统会选择默认 VPC 下的默认子网。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 项目 ID，不填为默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 可用区信息，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的可用区。
说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询云数据库实例 ID。
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * 实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。
说明：请选择实例类型，不填会默认选择 master。
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 主实例地域信息，购买灾备、RO实例时，该字段必填。
    */
    @SerializedName("MasterRegion")
    @Expose
    private String MasterRegion;

    /**
    * 自定义端口，端口支持范围：[1024 - 65535]。
说明：不填则默认为3306。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 参数列表，参数格式如 ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过 [查询默认的可设置参数列表](https://cloud.tencent.com/document/api/236/32662) 查询支持设置的参数。
说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。
    */
    @SerializedName("ParamList")
    @Expose
    private ParamInfo [] ParamList;

    /**
    * 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * 备库 1 的可用区信息。
说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * 备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * 安全组参数，可使用 [查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850) 接口查询某个项目的安全组详情。
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 只读实例信息。购买只读实例时，该参数必传。
    */
    @SerializedName("RoGroup")
    @Expose
    private RoGroup RoGroup;

    /**
    * 购买按量计费实例该字段无意义。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例标签信息。
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * 置放群组 ID。
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 实例隔离类型。支持值包括："UNIVERSAL" - 通用型实例，"EXCLUSIVE" - 独享型实例，"BASIC_V2" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。不指定则默认为通用型实例。
说明：如果创建的是云盘版实例，此参数为必填。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 参数模板 id。
备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * 告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private Long [] AlarmPolicyList;

    /**
    * 实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * 实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。
    */
    @SerializedName("AutoSyncFlag")
    @Expose
    private Long AutoSyncFlag;

    /**
    * 金融围拢 ID 。
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板，默认值是："HIGH_STABILITY"。
备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。
    */
    @SerializedName("ParamTemplateType")
    @Expose
    private String ParamTemplateType;

    /**
    * 告警策略名数组，例如:["policy-uyoee9wg"]，AlarmPolicyList不为空时该参数无效。
    */
    @SerializedName("AlarmPolicyIdList")
    @Expose
    private String [] AlarmPolicyIdList;

    /**
    * 是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 实例引擎类型，默认为"InnoDB"，支持值包括："InnoDB"，"RocksDB"。
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * 云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。
    */
    @SerializedName("DataProtectVolume")
    @Expose
    private Long DataProtectVolume;

    /**
    * 云盘版节点拓扑配置。
说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
    * 硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。
说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 [地域和可用区](https://cloud.tencent.com/document/product/236/8458)。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 开启或关闭实例销毁保护。on-开启，off-关闭
    */
    @SerializedName("DestroyProtect")
    @Expose
    private String DestroyProtect;

    /**
     * Get 实例数量，默认值为 1，最小值 1，最大值为 100。 
     * @return GoodsNum 实例数量，默认值为 1，最小值 1，最大值为 100。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量，默认值为 1，最小值 1，最大值为 100。
     * @param GoodsNum 实例数量，默认值为 1，最小值 1，最大值为 100。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 实例内存大小，单位：MB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的内存规格。 
     * @return Memory 实例内存大小，单位：MB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的内存规格。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位：MB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的内存规格。
     * @param Memory 实例内存大小，单位：MB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的内存规格。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小，单位：GB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的硬盘范围。 
     * @return Volume 实例硬盘大小，单位：GB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的硬盘范围。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小，单位：GB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的硬盘范围。
     * @param Volume 实例硬盘大小，单位：GB，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的硬盘范围。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的实例版本。
说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。 
     * @return EngineVersion MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的实例版本。
说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的实例版本。
说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。
     * @param EngineVersion MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的实例版本。
说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 私有网络 ID，请使用 [查询私有网络列表](/document/api/215/15778)。
说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。 
     * @return UniqVpcId 私有网络 ID，请使用 [查询私有网络列表](/document/api/215/15778)。
说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络 ID，请使用 [查询私有网络列表](/document/api/215/15778)。
说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。
     * @param UniqVpcId 私有网络 ID，请使用 [查询私有网络列表](/document/api/215/15778)。
说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。
说明：若此项不填，则系统会选择默认 VPC 下的默认子网。 
     * @return UniqSubnetId 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。
说明：若此项不填，则系统会选择默认 VPC 下的默认子网。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。
说明：若此项不填，则系统会选择默认 VPC 下的默认子网。
     * @param UniqSubnetId 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 [查询子网列表](/document/api/215/15784)。
说明：若此项不填，则系统会选择默认 VPC 下的默认子网。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 项目 ID，不填为默认项目。 
     * @return ProjectId 项目 ID，不填为默认项目。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID，不填为默认项目。
     * @param ProjectId 项目 ID，不填为默认项目。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 可用区信息，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的可用区。
说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。 
     * @return Zone 可用区信息，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的可用区。
说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的可用区。
说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。
     * @param Zone 可用区信息，请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口获取可创建的可用区。
说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询云数据库实例 ID。 
     * @return MasterInstanceId 实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询云数据库实例 ID。
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set 实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询云数据库实例 ID。
     * @param MasterInstanceId 实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询云数据库实例 ID。
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get 实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。
说明：请选择实例类型，不填会默认选择 master。 
     * @return InstanceRole 实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。
说明：请选择实例类型，不填会默认选择 master。
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。
说明：请选择实例类型，不填会默认选择 master。
     * @param InstanceRole 实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。
说明：请选择实例类型，不填会默认选择 master。
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 主实例地域信息，购买灾备、RO实例时，该字段必填。 
     * @return MasterRegion 主实例地域信息，购买灾备、RO实例时，该字段必填。
     */
    public String getMasterRegion() {
        return this.MasterRegion;
    }

    /**
     * Set 主实例地域信息，购买灾备、RO实例时，该字段必填。
     * @param MasterRegion 主实例地域信息，购买灾备、RO实例时，该字段必填。
     */
    public void setMasterRegion(String MasterRegion) {
        this.MasterRegion = MasterRegion;
    }

    /**
     * Get 自定义端口，端口支持范围：[1024 - 65535]。
说明：不填则默认为3306。 
     * @return Port 自定义端口，端口支持范围：[1024 - 65535]。
说明：不填则默认为3306。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 自定义端口，端口支持范围：[1024 - 65535]。
说明：不填则默认为3306。
     * @param Port 自定义端口，端口支持范围：[1024 - 65535]。
说明：不填则默认为3306。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。 
     * @return Password 设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
     * @param Password 设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 参数列表，参数格式如 ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过 [查询默认的可设置参数列表](https://cloud.tencent.com/document/api/236/32662) 查询支持设置的参数。
说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。 
     * @return ParamList 参数列表，参数格式如 ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过 [查询默认的可设置参数列表](https://cloud.tencent.com/document/api/236/32662) 查询支持设置的参数。
说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。
     */
    public ParamInfo [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 参数列表，参数格式如 ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过 [查询默认的可设置参数列表](https://cloud.tencent.com/document/api/236/32662) 查询支持设置的参数。
说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。
     * @param ParamList 参数列表，参数格式如 ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过 [查询默认的可设置参数列表](https://cloud.tencent.com/document/api/236/32662) 查询支持设置的参数。
说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。
     */
    public void setParamList(ParamInfo [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。 
     * @return ProtectMode 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
     * @param ProtectMode 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。 
     * @return DeployMode 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
     * @param DeployMode 多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 备库 1 的可用区信息。
说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。 
     * @return SlaveZone 备库 1 的可用区信息。
说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set 备库 1 的可用区信息。
说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。
     * @param SlaveZone 备库 1 的可用区信息。
说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get 备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。 
     * @return BackupZone 备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set 备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。
     * @param BackupZone 备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
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
     * Get 只读实例信息。购买只读实例时，该参数必传。 
     * @return RoGroup 只读实例信息。购买只读实例时，该参数必传。
     */
    public RoGroup getRoGroup() {
        return this.RoGroup;
    }

    /**
     * Set 只读实例信息。购买只读实例时，该参数必传。
     * @param RoGroup 只读实例信息。购买只读实例时，该参数必传。
     */
    public void setRoGroup(RoGroup RoGroup) {
        this.RoGroup = RoGroup;
    }

    /**
     * Get 购买按量计费实例该字段无意义。 
     * @return AutoRenewFlag 购买按量计费实例该字段无意义。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 购买按量计费实例该字段无意义。
     * @param AutoRenewFlag 购买按量计费实例该字段无意义。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。 
     * @return InstanceName 实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。
     * @param InstanceName 实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 实例隔离类型。支持值包括："UNIVERSAL" - 通用型实例，"EXCLUSIVE" - 独享型实例，"BASIC_V2" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。不指定则默认为通用型实例。
说明：如果创建的是云盘版实例，此参数为必填。 
     * @return DeviceType 实例隔离类型。支持值包括："UNIVERSAL" - 通用型实例，"EXCLUSIVE" - 独享型实例，"BASIC_V2" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。不指定则默认为通用型实例。
说明：如果创建的是云盘版实例，此参数为必填。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 实例隔离类型。支持值包括："UNIVERSAL" - 通用型实例，"EXCLUSIVE" - 独享型实例，"BASIC_V2" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。不指定则默认为通用型实例。
说明：如果创建的是云盘版实例，此参数为必填。
     * @param DeviceType 实例隔离类型。支持值包括："UNIVERSAL" - 通用型实例，"EXCLUSIVE" - 独享型实例，"BASIC_V2" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。不指定则默认为通用型实例。
说明：如果创建的是云盘版实例，此参数为必填。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 参数模板 id。
备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。 
     * @return ParamTemplateId 参数模板 id。
备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 参数模板 id。
备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。
     * @param ParamTemplateId 参数模板 id。
备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get 告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。 
     * @return AlarmPolicyList 告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。
     */
    public Long [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set 告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。
     * @param AlarmPolicyList 告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。
     */
    public void setAlarmPolicyList(Long [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
    }

    /**
     * Get 实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。 
     * @return InstanceNodes 实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set 实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。
     * @param InstanceNodes 实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get 实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。 
     * @return Cpu 实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。
     * @param Cpu 实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。 
     * @return AutoSyncFlag 是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。
     */
    public Long getAutoSyncFlag() {
        return this.AutoSyncFlag;
    }

    /**
     * Set 是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。
     * @param AutoSyncFlag 是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。
     */
    public void setAutoSyncFlag(Long AutoSyncFlag) {
        this.AutoSyncFlag = AutoSyncFlag;
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
     * Get 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板，默认值是："HIGH_STABILITY"。
备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。 
     * @return ParamTemplateType 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板，默认值是："HIGH_STABILITY"。
备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。
     */
    public String getParamTemplateType() {
        return this.ParamTemplateType;
    }

    /**
     * Set 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板，默认值是："HIGH_STABILITY"。
备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。
     * @param ParamTemplateType 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板，默认值是："HIGH_STABILITY"。
备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。
     */
    public void setParamTemplateType(String ParamTemplateType) {
        this.ParamTemplateType = ParamTemplateType;
    }

    /**
     * Get 告警策略名数组，例如:["policy-uyoee9wg"]，AlarmPolicyList不为空时该参数无效。 
     * @return AlarmPolicyIdList 告警策略名数组，例如:["policy-uyoee9wg"]，AlarmPolicyList不为空时该参数无效。
     */
    public String [] getAlarmPolicyIdList() {
        return this.AlarmPolicyIdList;
    }

    /**
     * Set 告警策略名数组，例如:["policy-uyoee9wg"]，AlarmPolicyList不为空时该参数无效。
     * @param AlarmPolicyIdList 告警策略名数组，例如:["policy-uyoee9wg"]，AlarmPolicyList不为空时该参数无效。
     */
    public void setAlarmPolicyIdList(String [] AlarmPolicyIdList) {
        this.AlarmPolicyIdList = AlarmPolicyIdList;
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
     * Get 实例引擎类型，默认为"InnoDB"，支持值包括："InnoDB"，"RocksDB"。 
     * @return EngineType 实例引擎类型，默认为"InnoDB"，支持值包括："InnoDB"，"RocksDB"。
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 实例引擎类型，默认为"InnoDB"，支持值包括："InnoDB"，"RocksDB"。
     * @param EngineType 实例引擎类型，默认为"InnoDB"，支持值包括："InnoDB"，"RocksDB"。
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。 
     * @return Vips 指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set 指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。
     * @param Vips 指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get 云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。 
     * @return DataProtectVolume 云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。
     */
    public Long getDataProtectVolume() {
        return this.DataProtectVolume;
    }

    /**
     * Set 云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。
     * @param DataProtectVolume 云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。
     */
    public void setDataProtectVolume(Long DataProtectVolume) {
        this.DataProtectVolume = DataProtectVolume;
    }

    /**
     * Get 云盘版节点拓扑配置。
说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。 
     * @return ClusterTopology 云盘版节点拓扑配置。
说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set 云盘版节点拓扑配置。
说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。
     * @param ClusterTopology 云盘版节点拓扑配置。
说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    /**
     * Get 硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。
说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 [地域和可用区](https://cloud.tencent.com/document/product/236/8458)。 
     * @return DiskType 硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。
说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 [地域和可用区](https://cloud.tencent.com/document/product/236/8458)。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。
说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 [地域和可用区](https://cloud.tencent.com/document/product/236/8458)。
     * @param DiskType 硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。
说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 [地域和可用区](https://cloud.tencent.com/document/product/236/8458)。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群 
     * @return ClusterType 集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群
     * @param ClusterType 集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 开启或关闭实例销毁保护。on-开启，off-关闭 
     * @return DestroyProtect 开启或关闭实例销毁保护。on-开启，off-关闭
     */
    public String getDestroyProtect() {
        return this.DestroyProtect;
    }

    /**
     * Set 开启或关闭实例销毁保护。on-开启，off-关闭
     * @param DestroyProtect 开启或关闭实例销毁保护。on-开启，off-关闭
     */
    public void setDestroyProtect(String DestroyProtect) {
        this.DestroyProtect = DestroyProtect;
    }

    public CreateDBInstanceHourRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceHourRequest(CreateDBInstanceHourRequest source) {
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.MasterInstanceId != null) {
            this.MasterInstanceId = new String(source.MasterInstanceId);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.MasterRegion != null) {
            this.MasterRegion = new String(source.MasterRegion);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamInfo[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamInfo(source.ParamList[i]);
            }
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
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.RoGroup != null) {
            this.RoGroup = new RoGroup(source.RoGroup);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfo[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfo(source.ResourceTags[i]);
            }
        }
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.AlarmPolicyList != null) {
            this.AlarmPolicyList = new Long[source.AlarmPolicyList.length];
            for (int i = 0; i < source.AlarmPolicyList.length; i++) {
                this.AlarmPolicyList[i] = new Long(source.AlarmPolicyList[i]);
            }
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new Long(source.InstanceNodes);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.AutoSyncFlag != null) {
            this.AutoSyncFlag = new Long(source.AutoSyncFlag);
        }
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
        if (source.ParamTemplateType != null) {
            this.ParamTemplateType = new String(source.ParamTemplateType);
        }
        if (source.AlarmPolicyIdList != null) {
            this.AlarmPolicyIdList = new String[source.AlarmPolicyIdList.length];
            for (int i = 0; i < source.AlarmPolicyIdList.length; i++) {
                this.AlarmPolicyIdList[i] = new String(source.AlarmPolicyIdList[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
        if (source.DataProtectVolume != null) {
            this.DataProtectVolume = new Long(source.DataProtectVolume);
        }
        if (source.ClusterTopology != null) {
            this.ClusterTopology = new ClusterTopology(source.ClusterTopology);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.DestroyProtect != null) {
            this.DestroyProtect = new String(source.DestroyProtect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "MasterRegion", this.MasterRegion);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "BackupZone", this.BackupZone);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamObj(map, prefix + "RoGroup.", this.RoGroup);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamArraySimple(map, prefix + "AlarmPolicyList.", this.AlarmPolicyList);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "AutoSyncFlag", this.AutoSyncFlag);
        this.setParamSimple(map, prefix + "CageId", this.CageId);
        this.setParamSimple(map, prefix + "ParamTemplateType", this.ParamTemplateType);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIdList.", this.AlarmPolicyIdList);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamSimple(map, prefix + "DataProtectVolume", this.DataProtectVolume);
        this.setParamObj(map, prefix + "ClusterTopology.", this.ClusterTopology);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "DestroyProtect", this.DestroyProtect);

    }
}

