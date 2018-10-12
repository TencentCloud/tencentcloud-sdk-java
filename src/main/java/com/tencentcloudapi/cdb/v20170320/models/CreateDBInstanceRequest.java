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

public class CreateDBInstanceRequest  extends AbstractModel{

    /**
    * 实例内存大小，单位：MB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的内存规格
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例硬盘大小，单位：GB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的硬盘范围
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * 实例数量，默认值为1, 最小值1，最大值为100
    */
    @SerializedName("GoodsNum")
    @Expose
    private Integer GoodsNum;

    /**
    * 可用区信息，该参数缺省时，系统会自动选择一个可用区，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 私有网络ID，如果不传则默认选择基础网络，请使用[查询私有网络列表](/document/api/215/15778)
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有网络下的子网ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用[查询子网列表](/document/api/215/15784)
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 项目ID，不填为默认项目。请使用[查询项目列表](https://cloud.tencent.com/document/product/378/4400)接口获取项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 自定义端口，端口支持范围：[ 1024-65535 ]
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 实例ID，购买只读实例时必填，该字段表示只读实例的主实例ID，请使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872)接口查询云数据库实例ID
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * MySQL版本，值包括：5.5、5.6和5.7，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的实例版本
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 设置root帐号密码，密码规则：8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 数据复制方式，默认为0，支持值包括：0-表示异步复制，1-表示半同步复制，2-表示强同步复制
    */
    @SerializedName("ProtectMode")
    @Expose
    private Integer ProtectMode;

    /**
    * 多可用区域，默认为0，支持值包括：0-表示单可用区，1-表示多可用区
    */
    @SerializedName("DeployMode")
    @Expose
    private Integer DeployMode;

    /**
    * 备库1的可用区信息，默认为zone的值
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * 参数列表，参数格式如ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过[查询参数列表](/document/product/236/6369)查询支持设置的参数
    */
    @SerializedName("ParamList")
    @Expose
    private ParamInfo [] ParamList;

    /**
    * 备库2的可用区ID，默认为0，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * 自动续费标记，可选值为：0-不自动续费；1-自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Integer AutoRenewFlag;

    /**
    * 主实例地域信息，购买灾备实例时，该字段必填
    */
    @SerializedName("MasterRegion")
    @Expose
    private String MasterRegion;

    /**
    * 安全组参数，可使用[查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850)接口查询某个项目的安全组详情
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 只读实例参数
    */
    @SerializedName("RoGroup")
    @Expose
    private RoGroup RoGroup;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * 获取实例内存大小，单位：MB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的内存规格
     * @return Memory 实例内存大小，单位：MB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的内存规格
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例内存大小，单位：MB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的内存规格
     * @param Memory 实例内存大小，单位：MB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的内存规格
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例硬盘大小，单位：GB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的硬盘范围
     * @return Volume 实例硬盘大小，单位：GB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的硬盘范围
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置实例硬盘大小，单位：GB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的硬盘范围
     * @param Volume 实例硬盘大小，单位：GB，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的硬盘范围
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     * @return Period 实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     * @param Period 实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 获取实例数量，默认值为1, 最小值1，最大值为100
     * @return GoodsNum 实例数量，默认值为1, 最小值1，最大值为100
     */
    public Integer getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * 设置实例数量，默认值为1, 最小值1，最大值为100
     * @param GoodsNum 实例数量，默认值为1, 最小值1，最大值为100
     */
    public void setGoodsNum(Integer GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * 获取可用区信息，该参数缺省时，系统会自动选择一个可用区，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的可用区
     * @return Zone 可用区信息，该参数缺省时，系统会自动选择一个可用区，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区信息，该参数缺省时，系统会自动选择一个可用区，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的可用区
     * @param Zone 可用区信息，该参数缺省时，系统会自动选择一个可用区，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取私有网络ID，如果不传则默认选择基础网络，请使用[查询私有网络列表](/document/api/215/15778)
     * @return UniqVpcId 私有网络ID，如果不传则默认选择基础网络，请使用[查询私有网络列表](/document/api/215/15778)
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * 设置私有网络ID，如果不传则默认选择基础网络，请使用[查询私有网络列表](/document/api/215/15778)
     * @param UniqVpcId 私有网络ID，如果不传则默认选择基础网络，请使用[查询私有网络列表](/document/api/215/15778)
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * 获取私有网络下的子网ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用[查询子网列表](/document/api/215/15784)
     * @return UniqSubnetId 私有网络下的子网ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用[查询子网列表](/document/api/215/15784)
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * 设置私有网络下的子网ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用[查询子网列表](/document/api/215/15784)
     * @param UniqSubnetId 私有网络下的子网ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用[查询子网列表](/document/api/215/15784)
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * 获取项目ID，不填为默认项目。请使用[查询项目列表](https://cloud.tencent.com/document/product/378/4400)接口获取项目ID
     * @return ProjectId 项目ID，不填为默认项目。请使用[查询项目列表](https://cloud.tencent.com/document/product/378/4400)接口获取项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID，不填为默认项目。请使用[查询项目列表](https://cloud.tencent.com/document/product/378/4400)接口获取项目ID
     * @param ProjectId 项目ID，不填为默认项目。请使用[查询项目列表](https://cloud.tencent.com/document/product/378/4400)接口获取项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取自定义端口，端口支持范围：[ 1024-65535 ]
     * @return Port 自定义端口，端口支持范围：[ 1024-65535 ]
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置自定义端口，端口支持范围：[ 1024-65535 ]
     * @param Port 自定义端口，端口支持范围：[ 1024-65535 ]
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
     * @return InstanceRole 实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * 设置实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
     * @param InstanceRole 实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * 获取实例ID，购买只读实例时必填，该字段表示只读实例的主实例ID，请使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872)接口查询云数据库实例ID
     * @return MasterInstanceId 实例ID，购买只读实例时必填，该字段表示只读实例的主实例ID，请使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872)接口查询云数据库实例ID
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * 设置实例ID，购买只读实例时必填，该字段表示只读实例的主实例ID，请使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872)接口查询云数据库实例ID
     * @param MasterInstanceId 实例ID，购买只读实例时必填，该字段表示只读实例的主实例ID，请使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872)接口查询云数据库实例ID
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * 获取MySQL版本，值包括：5.5、5.6和5.7，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的实例版本
     * @return EngineVersion MySQL版本，值包括：5.5、5.6和5.7，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的实例版本
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * 设置MySQL版本，值包括：5.5、5.6和5.7，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的实例版本
     * @param EngineVersion MySQL版本，值包括：5.5、5.6和5.7，请使用[获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229)接口获取可创建的实例版本
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * 获取设置root帐号密码，密码规则：8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
     * @return Password 设置root帐号密码，密码规则：8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置设置root帐号密码，密码规则：8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
     * @param Password 设置root帐号密码，密码规则：8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()）中的两种，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取数据复制方式，默认为0，支持值包括：0-表示异步复制，1-表示半同步复制，2-表示强同步复制
     * @return ProtectMode 数据复制方式，默认为0，支持值包括：0-表示异步复制，1-表示半同步复制，2-表示强同步复制
     */
    public Integer getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * 设置数据复制方式，默认为0，支持值包括：0-表示异步复制，1-表示半同步复制，2-表示强同步复制
     * @param ProtectMode 数据复制方式，默认为0，支持值包括：0-表示异步复制，1-表示半同步复制，2-表示强同步复制
     */
    public void setProtectMode(Integer ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * 获取多可用区域，默认为0，支持值包括：0-表示单可用区，1-表示多可用区
     * @return DeployMode 多可用区域，默认为0，支持值包括：0-表示单可用区，1-表示多可用区
     */
    public Integer getDeployMode() {
        return this.DeployMode;
    }

    /**
     * 设置多可用区域，默认为0，支持值包括：0-表示单可用区，1-表示多可用区
     * @param DeployMode 多可用区域，默认为0，支持值包括：0-表示单可用区，1-表示多可用区
     */
    public void setDeployMode(Integer DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * 获取备库1的可用区信息，默认为zone的值
     * @return SlaveZone 备库1的可用区信息，默认为zone的值
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * 设置备库1的可用区信息，默认为zone的值
     * @param SlaveZone 备库1的可用区信息，默认为zone的值
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * 获取参数列表，参数格式如ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过[查询参数列表](/document/product/236/6369)查询支持设置的参数
     * @return ParamList 参数列表，参数格式如ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过[查询参数列表](/document/product/236/6369)查询支持设置的参数
     */
    public ParamInfo [] getParamList() {
        return this.ParamList;
    }

    /**
     * 设置参数列表，参数格式如ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过[查询参数列表](/document/product/236/6369)查询支持设置的参数
     * @param ParamList 参数列表，参数格式如ParamList.0.Name=auto_increment&ParamList.0.Value=1。可通过[查询参数列表](/document/product/236/6369)查询支持设置的参数
     */
    public void setParamList(ParamInfo [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * 获取备库2的可用区ID，默认为0，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
     * @return BackupZone 备库2的可用区ID，默认为0，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * 设置备库2的可用区ID，默认为0，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
     * @param BackupZone 备库2的可用区ID，默认为0，购买主实例时可指定该参数，购买只读实例或者灾备实例时指定该参数无意义
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * 获取自动续费标记，可选值为：0-不自动续费；1-自动续费
     * @return AutoRenewFlag 自动续费标记，可选值为：0-不自动续费；1-自动续费
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置自动续费标记，可选值为：0-不自动续费；1-自动续费
     * @param AutoRenewFlag 自动续费标记，可选值为：0-不自动续费；1-自动续费
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 获取主实例地域信息，购买灾备实例时，该字段必填
     * @return MasterRegion 主实例地域信息，购买灾备实例时，该字段必填
     */
    public String getMasterRegion() {
        return this.MasterRegion;
    }

    /**
     * 设置主实例地域信息，购买灾备实例时，该字段必填
     * @param MasterRegion 主实例地域信息，购买灾备实例时，该字段必填
     */
    public void setMasterRegion(String MasterRegion) {
        this.MasterRegion = MasterRegion;
    }

    /**
     * 获取安全组参数，可使用[查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850)接口查询某个项目的安全组详情
     * @return SecurityGroup 安全组参数，可使用[查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850)接口查询某个项目的安全组详情
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * 设置安全组参数，可使用[查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850)接口查询某个项目的安全组详情
     * @param SecurityGroup 安全组参数，可使用[查询项目安全组信息](https://cloud.tencent.com/document/api/236/15850)接口查询某个项目的安全组详情
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * 获取只读实例参数
     * @return RoGroup 只读实例参数
     */
    public RoGroup getRoGroup() {
        return this.RoGroup;
    }

    /**
     * 设置只读实例参数
     * @param RoGroup 只读实例参数
     */
    public void setRoGroup(RoGroup RoGroup) {
        this.RoGroup = RoGroup;
    }

    /**
     * 获取实例名称
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "BackupZone", this.BackupZone);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "MasterRegion", this.MasterRegion);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamObj(map, prefix + "RoGroup.", this.RoGroup);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

