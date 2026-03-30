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
    * <p>实例数量，默认值为 1，最小值 1，最大值为 100。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>实例内存大小，单位：MB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的内存规格。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例硬盘大小，单位：GB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的硬盘范围。</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的实例版本。<br>说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。<br>说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。<br>说明：若此项不填，则系统会选择默认 VPC 下的默认子网。</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>项目 ID，不填为默认项目。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>可用区信息，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的可用区。<br>说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口查询云数据库实例 ID。</p>
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * <p>实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。<br>说明：请选择实例类型，不填会默认选择 master。</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>主实例地域信息，购买灾备、RO实例时，该字段必填。</p>
    */
    @SerializedName("MasterRegion")
    @Expose
    private String MasterRegion;

    /**
    * <p>自定义端口，端口支持范围：[1024 - 65535]。<br>说明：不填则默认为3306。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&amp;=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>参数列表，参数格式如 ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1。可通过 <a href="https://cloud.tencent.com/document/api/236/32662">查询默认的可设置参数列表</a> 查询支持设置的参数。<br>说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。</p>
    */
    @SerializedName("ParamList")
    @Expose
    private ParamInfo [] ParamList;

    /**
    * <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>备库 1 的可用区信息。<br>说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。</p>
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * <p>备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。</p>
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * <p>安全组参数，可使用 <a href="https://cloud.tencent.com/document/api/236/15850">查询项目安全组信息</a> 接口查询某个项目的安全组详情。</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * <p>只读实例信息。购买只读实例时，该参数必传。</p>
    */
    @SerializedName("RoGroup")
    @Expose
    private RoGroup RoGroup;

    /**
    * <p>购买按量计费实例该字段无意义。</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例标签信息。</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * <p>置放群组 ID。</p>
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>实例隔离类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;BASIC_V2&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型实例。<br>说明：如果创建的是云盘版实例，此参数为必填。</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>参数模板 id。<br>备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。</p>
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private Long [] AlarmPolicyList;

    /**
    * <p>实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。</p>
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * <p>实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。</p>
    */
    @SerializedName("AutoSyncFlag")
    @Expose
    private Long AutoSyncFlag;

    /**
    * <p>金融围拢 ID 。</p>
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * <p>默认参数模板类型。支持值包括：&quot;HIGH_STABILITY&quot; - 高稳定模板，&quot;HIGH_PERFORMANCE&quot; - 高性能模板，默认值是：&quot;HIGH_STABILITY&quot;。<br>备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。</p>
    */
    @SerializedName("ParamTemplateType")
    @Expose
    private String ParamTemplateType;

    /**
    * <p>告警策略名数组，例如:[&quot;policy-uyoee9wg&quot;]，AlarmPolicyList不为空时该参数无效。</p>
    */
    @SerializedName("AlarmPolicyIdList")
    @Expose
    private String [] AlarmPolicyIdList;

    /**
    * <p>是否只预检此次请求。true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId.默认为false：发送正常请求，通过检查后直接创建实例。</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>实例引擎类型，默认为&quot;InnoDB&quot;，支持值包括：&quot;InnoDB&quot;，&quot;RocksDB&quot;。</p>
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * <p>指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。</p>
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * <p>云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。</p>
    */
    @SerializedName("DataProtectVolume")
    @Expose
    private Long DataProtectVolume;

    /**
    * <p>云盘版节点拓扑配置。<br>说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。</p>
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
    * <p>硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。<br>说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 <a href="https://cloud.tencent.com/document/product/236/8458">地域和可用区</a>。</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>开启或关闭实例销毁保护。on-开启，off-关闭</p>
    */
    @SerializedName("DestroyProtect")
    @Expose
    private String DestroyProtect;

    /**
     * Get <p>实例数量，默认值为 1，最小值 1，最大值为 100。</p> 
     * @return GoodsNum <p>实例数量，默认值为 1，最小值 1，最大值为 100。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>实例数量，默认值为 1，最小值 1，最大值为 100。</p>
     * @param GoodsNum <p>实例数量，默认值为 1，最小值 1，最大值为 100。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>实例内存大小，单位：MB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的内存规格。</p> 
     * @return Memory <p>实例内存大小，单位：MB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的内存规格。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存大小，单位：MB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的内存规格。</p>
     * @param Memory <p>实例内存大小，单位：MB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的内存规格。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例硬盘大小，单位：GB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的硬盘范围。</p> 
     * @return Volume <p>实例硬盘大小，单位：GB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的硬盘范围。</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>实例硬盘大小，单位：GB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的硬盘范围。</p>
     * @param Volume <p>实例硬盘大小，单位：GB，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的硬盘范围。</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的实例版本。<br>说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。</p> 
     * @return EngineVersion <p>MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的实例版本。<br>说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的实例版本。<br>说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。</p>
     * @param EngineVersion <p>MySQL 版本，值包括：5.5、5.6、5.7和8.0，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的实例版本。<br>说明：创建非云盘版实例时，请根据需要指定实例版本（推荐5.7或8.0），若此参数不填，则默认值为8.0；若创建的是云盘版实例，则此参数仅能指定为5.7或8.0。</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。<br>说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。</p> 
     * @return UniqVpcId <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。<br>说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。<br>说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。</p>
     * @param UniqVpcId <p>私有网络 ID，请使用 <a href="/document/api/215/15778">查询私有网络列表</a>。<br>说明：如果创建的是云盘版实例，此参数为必填且为私有网络类型。若此项不填，则系统会选择默认的 VPC。</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。<br>说明：若此项不填，则系统会选择默认 VPC 下的默认子网。</p> 
     * @return UniqSubnetId <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。<br>说明：若此项不填，则系统会选择默认 VPC 下的默认子网。</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。<br>说明：若此项不填，则系统会选择默认 VPC 下的默认子网。</p>
     * @param UniqSubnetId <p>私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 <a href="/document/api/215/15784">查询子网列表</a>。<br>说明：若此项不填，则系统会选择默认 VPC 下的默认子网。</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>项目 ID，不填为默认项目。</p> 
     * @return ProjectId <p>项目 ID，不填为默认项目。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID，不填为默认项目。</p>
     * @param ProjectId <p>项目 ID，不填为默认项目。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>可用区信息，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的可用区。<br>说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。</p> 
     * @return Zone <p>可用区信息，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的可用区。<br>说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区信息，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的可用区。<br>说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。</p>
     * @param Zone <p>可用区信息，请使用 <a href="https://cloud.tencent.com/document/api/236/17229">获取云数据库可售卖规格</a> 接口获取可创建的可用区。<br>说明：若您创建单节点、双节点、三节点实例，此参数为必填项，请指定可用区，若不指定可用区，则系统会自动选择一个可用区（可能不是您希望部署的可用区）；若您创建云盘版实例，此参数不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口查询云数据库实例 ID。</p> 
     * @return MasterInstanceId <p>实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口查询云数据库实例 ID。</p>
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set <p>实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口查询云数据库实例 ID。</p>
     * @param MasterInstanceId <p>实例 ID，购买只读实例或者灾备实例时必填，该字段表示只读实例或者灾备实例的主实例 ID，请使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口查询云数据库实例 ID。</p>
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get <p>实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。<br>说明：请选择实例类型，不填会默认选择 master。</p> 
     * @return InstanceRole <p>实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。<br>说明：请选择实例类型，不填会默认选择 master。</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。<br>说明：请选择实例类型，不填会默认选择 master。</p>
     * @param InstanceRole <p>实例类型，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。<br>说明：请选择实例类型，不填会默认选择 master。</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>主实例地域信息，购买灾备、RO实例时，该字段必填。</p> 
     * @return MasterRegion <p>主实例地域信息，购买灾备、RO实例时，该字段必填。</p>
     */
    public String getMasterRegion() {
        return this.MasterRegion;
    }

    /**
     * Set <p>主实例地域信息，购买灾备、RO实例时，该字段必填。</p>
     * @param MasterRegion <p>主实例地域信息，购买灾备、RO实例时，该字段必填。</p>
     */
    public void setMasterRegion(String MasterRegion) {
        this.MasterRegion = MasterRegion;
    }

    /**
     * Get <p>自定义端口，端口支持范围：[1024 - 65535]。<br>说明：不填则默认为3306。</p> 
     * @return Port <p>自定义端口，端口支持范围：[1024 - 65535]。<br>说明：不填则默认为3306。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>自定义端口，端口支持范围：[1024 - 65535]。<br>说明：不填则默认为3306。</p>
     * @param Port <p>自定义端口，端口支持范围：[1024 - 65535]。<br>说明：不填则默认为3306。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&amp;=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p> 
     * @return Password <p>设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&amp;=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&amp;=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
     * @param Password <p>设置 root 账号密码，密码规则：8 - 64 个字符，至少包含字母、数字、字符（支持的字符：_+-&amp;=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>参数列表，参数格式如 ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1。可通过 <a href="https://cloud.tencent.com/document/api/236/32662">查询默认的可设置参数列表</a> 查询支持设置的参数。<br>说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。</p> 
     * @return ParamList <p>参数列表，参数格式如 ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1。可通过 <a href="https://cloud.tencent.com/document/api/236/32662">查询默认的可设置参数列表</a> 查询支持设置的参数。<br>说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。</p>
     */
    public ParamInfo [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>参数列表，参数格式如 ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1。可通过 <a href="https://cloud.tencent.com/document/api/236/32662">查询默认的可设置参数列表</a> 查询支持设置的参数。<br>说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。</p>
     * @param ParamList <p>参数列表，参数格式如 ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1。可通过 <a href="https://cloud.tencent.com/document/api/236/32662">查询默认的可设置参数列表</a> 查询支持设置的参数。<br>说明：表名大小写敏感的开启和关闭可通过参数 lower_case_table_names 进行设置，参数值为0表示开启，参数值为1表示关闭，若不设置则此参数默认值为0。若您创建的是 MySQL 8.0 版本的实例，则需要在创建实例时通过设置 lower_case_table_names 参数来开启或关闭表名大小写敏感，创建实例后无法修改参数，即创建后无法修改表名大小写敏感。其他数据库版本的实例支持在创建实例后修改 lower_case_table_names 参数。创建实例时设置表名大小写敏感的 API 调用方法请参见本文中的示例2。</p>
     */
    public void setParamList(ParamInfo [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p> 
     * @return ProtectMode <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
     * @param ProtectMode <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p> 
     * @return DeployMode <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
     * @param DeployMode <p>多可用区域，默认为 0，支持值包括：0 - 表示单可用区，1 - 表示多可用区，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>备库 1 的可用区信息。<br>说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。</p> 
     * @return SlaveZone <p>备库 1 的可用区信息。<br>说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。</p>
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set <p>备库 1 的可用区信息。<br>说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。</p>
     * @param SlaveZone <p>备库 1 的可用区信息。<br>说明：双节点、三节点实例请指定此参数值，若不指定，则默认为 Zone 的值；云盘版实例此参数可不填，请通过参数 ClusterTopology 进行读写节点和只读节点的可用区配置；单节点实例为单可用区，无需指定此参数。</p>
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get <p>备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。</p> 
     * @return BackupZone <p>备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。</p>
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set <p>备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。</p>
     * @param BackupZone <p>备库 2 的可用区信息，默认为空，购买三节点主实例时可指定该参数。</p>
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
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
     * Get <p>只读实例信息。购买只读实例时，该参数必传。</p> 
     * @return RoGroup <p>只读实例信息。购买只读实例时，该参数必传。</p>
     */
    public RoGroup getRoGroup() {
        return this.RoGroup;
    }

    /**
     * Set <p>只读实例信息。购买只读实例时，该参数必传。</p>
     * @param RoGroup <p>只读实例信息。购买只读实例时，该参数必传。</p>
     */
    public void setRoGroup(RoGroup RoGroup) {
        this.RoGroup = RoGroup;
    }

    /**
     * Get <p>购买按量计费实例该字段无意义。</p> 
     * @return AutoRenewFlag <p>购买按量计费实例该字段无意义。</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>购买按量计费实例该字段无意义。</p>
     * @param AutoRenewFlag <p>购买按量计费实例该字段无意义。</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。</p> 
     * @return InstanceName <p>实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。</p>
     * @param InstanceName <p>实例名称。一次购买多个实例命名会用后缀数字区分，例instanceName=db，goodsNum=3，实例命名分别为db1，db2，db3。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p> 
     * @return ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     * @param ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间在48小时内唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>实例隔离类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;BASIC_V2&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型实例。<br>说明：如果创建的是云盘版实例，此参数为必填。</p> 
     * @return DeviceType <p>实例隔离类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;BASIC_V2&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型实例。<br>说明：如果创建的是云盘版实例，此参数为必填。</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例隔离类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;BASIC_V2&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型实例。<br>说明：如果创建的是云盘版实例，此参数为必填。</p>
     * @param DeviceType <p>实例隔离类型。支持值包括：&quot;UNIVERSAL&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;BASIC_V2&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。不指定则默认为通用型实例。<br>说明：如果创建的是云盘版实例，此参数为必填。</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>参数模板 id。<br>备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。</p> 
     * @return ParamTemplateId <p>参数模板 id。<br>备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。</p>
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>参数模板 id。<br>备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。</p>
     * @param ParamTemplateId <p>参数模板 id。<br>备注：如您使用自定义参数模板 id，可传入自定义参数模板 id；如您计划使用默认参数模板，该参数模板 id 传入 id 无效，需设置 ParamTemplateType。</p>
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。</p> 
     * @return AlarmPolicyList <p>告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。</p>
     */
    public Long [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set <p>告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。</p>
     * @param AlarmPolicyList <p>告警策略id数组。腾讯云可观测平台DescribeAlarmPolicy接口返回的OriginId。</p>
     */
    public void setAlarmPolicyList(Long [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
    }

    /**
     * Get <p>实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。</p> 
     * @return InstanceNodes <p>实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。</p>
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set <p>实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。</p>
     * @param InstanceNodes <p>实例节点数。对于 RO 和 基础版实例， 该值默认为1。 如果需要购买三节点实例， 请将该值设置为3 或指定 BackupZone 参数。当购买主实例，且未指定该参数和 BackupZone 参数时，该值默认是 2， 即购买两节点实例。</p>
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get <p>实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。</p> 
     * @return Cpu <p>实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。</p>
     * @param Cpu <p>实例cpu核数， 如果不传将根据memory指定的内存值自动填充对应的cpu值。</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。</p> 
     * @return AutoSyncFlag <p>是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。</p>
     */
    public Long getAutoSyncFlag() {
        return this.AutoSyncFlag;
    }

    /**
     * Set <p>是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。</p>
     * @param AutoSyncFlag <p>是否自动发起灾备同步功能。该参数仅对购买灾备实例生效。 可选值为：0 - 不自动发起灾备同步；1 - 自动发起灾备同步。该值默认为0。</p>
     */
    public void setAutoSyncFlag(Long AutoSyncFlag) {
        this.AutoSyncFlag = AutoSyncFlag;
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
     * Get <p>默认参数模板类型。支持值包括：&quot;HIGH_STABILITY&quot; - 高稳定模板，&quot;HIGH_PERFORMANCE&quot; - 高性能模板，默认值是：&quot;HIGH_STABILITY&quot;。<br>备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。</p> 
     * @return ParamTemplateType <p>默认参数模板类型。支持值包括：&quot;HIGH_STABILITY&quot; - 高稳定模板，&quot;HIGH_PERFORMANCE&quot; - 高性能模板，默认值是：&quot;HIGH_STABILITY&quot;。<br>备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。</p>
     */
    public String getParamTemplateType() {
        return this.ParamTemplateType;
    }

    /**
     * Set <p>默认参数模板类型。支持值包括：&quot;HIGH_STABILITY&quot; - 高稳定模板，&quot;HIGH_PERFORMANCE&quot; - 高性能模板，默认值是：&quot;HIGH_STABILITY&quot;。<br>备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。</p>
     * @param ParamTemplateType <p>默认参数模板类型。支持值包括：&quot;HIGH_STABILITY&quot; - 高稳定模板，&quot;HIGH_PERFORMANCE&quot; - 高性能模板，默认值是：&quot;HIGH_STABILITY&quot;。<br>备注：如您需使用云数据库 MySQL 默认参数模板，请设置 ParamTemplateType。</p>
     */
    public void setParamTemplateType(String ParamTemplateType) {
        this.ParamTemplateType = ParamTemplateType;
    }

    /**
     * Get <p>告警策略名数组，例如:[&quot;policy-uyoee9wg&quot;]，AlarmPolicyList不为空时该参数无效。</p> 
     * @return AlarmPolicyIdList <p>告警策略名数组，例如:[&quot;policy-uyoee9wg&quot;]，AlarmPolicyList不为空时该参数无效。</p>
     */
    public String [] getAlarmPolicyIdList() {
        return this.AlarmPolicyIdList;
    }

    /**
     * Set <p>告警策略名数组，例如:[&quot;policy-uyoee9wg&quot;]，AlarmPolicyList不为空时该参数无效。</p>
     * @param AlarmPolicyIdList <p>告警策略名数组，例如:[&quot;policy-uyoee9wg&quot;]，AlarmPolicyList不为空时该参数无效。</p>
     */
    public void setAlarmPolicyIdList(String [] AlarmPolicyIdList) {
        this.AlarmPolicyIdList = AlarmPolicyIdList;
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
     * Get <p>实例引擎类型，默认为&quot;InnoDB&quot;，支持值包括：&quot;InnoDB&quot;，&quot;RocksDB&quot;。</p> 
     * @return EngineType <p>实例引擎类型，默认为&quot;InnoDB&quot;，支持值包括：&quot;InnoDB&quot;，&quot;RocksDB&quot;。</p>
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>实例引擎类型，默认为&quot;InnoDB&quot;，支持值包括：&quot;InnoDB&quot;，&quot;RocksDB&quot;。</p>
     * @param EngineType <p>实例引擎类型，默认为&quot;InnoDB&quot;，支持值包括：&quot;InnoDB&quot;，&quot;RocksDB&quot;。</p>
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get <p>指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。</p> 
     * @return Vips <p>指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。</p>
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set <p>指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。</p>
     * @param Vips <p>指定实例的IP列表。仅支持主实例指定，按实例顺序，不足则按未指定处理。</p>
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get <p>云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。</p> 
     * @return DataProtectVolume <p>云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。</p>
     */
    public Long getDataProtectVolume() {
        return this.DataProtectVolume;
    }

    /**
     * Set <p>云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。</p>
     * @param DataProtectVolume <p>云盘版实例的数据保护空间大小，单位 GB，设置范围1 - 10。</p>
     */
    public void setDataProtectVolume(Long DataProtectVolume) {
        this.DataProtectVolume = DataProtectVolume;
    }

    /**
     * Get <p>云盘版节点拓扑配置。<br>说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。</p> 
     * @return ClusterTopology <p>云盘版节点拓扑配置。<br>说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。</p>
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set <p>云盘版节点拓扑配置。<br>说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。</p>
     * @param ClusterTopology <p>云盘版节点拓扑配置。<br>说明：若购买的是云盘版实例，此参数为必填，需设置云盘版实例的 RW 和 RO 节点拓扑，RO 节点范围是1 - 5个，请至少设置1个 RO 节点。</p>
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    /**
     * Get <p>硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。<br>说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 <a href="https://cloud.tencent.com/document/product/236/8458">地域和可用区</a>。</p> 
     * @return DiskType <p>硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。<br>说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 <a href="https://cloud.tencent.com/document/product/236/8458">地域和可用区</a>。</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。<br>说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 <a href="https://cloud.tencent.com/document/product/236/8458">地域和可用区</a>。</p>
     * @param DiskType <p>硬盘类型，单节点（云盘）或者云盘版实例可以指定此参数。CLOUD_SSD 表示 SSD 云硬盘，CLOUD_HSSD 表示增强型 SSD 云硬盘，CLOUD_PREMIUM 表示高性能云硬盘。<br>说明：单节点（云盘）、云盘版实例硬盘类型所支持的地域略有不同，具体支持情况请参考 <a href="https://cloud.tencent.com/document/product/236/8458">地域和可用区</a>。</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群</p> 
     * @return ClusterType <p>集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群</p>
     * @param ClusterType <p>集群类型:cage——金融围拢，cdc——CDB ON CDC；dedicate——独享集群</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>开启或关闭实例销毁保护。on-开启，off-关闭</p> 
     * @return DestroyProtect <p>开启或关闭实例销毁保护。on-开启，off-关闭</p>
     */
    public String getDestroyProtect() {
        return this.DestroyProtect;
    }

    /**
     * Set <p>开启或关闭实例销毁保护。on-开启，off-关闭</p>
     * @param DestroyProtect <p>开启或关闭实例销毁保护。on-开启，off-关闭</p>
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

