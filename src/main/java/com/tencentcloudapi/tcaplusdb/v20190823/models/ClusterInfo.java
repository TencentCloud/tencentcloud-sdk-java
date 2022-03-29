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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfo extends AbstractModel{

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 集群数据描述语言类型，如：`PROTO`,`TDR`
    */
    @SerializedName("IdlType")
    @Expose
    private String IdlType;

    /**
    * 网络类型
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 集群关联的用户私有网络实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群关联的用户子网实例ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 集群密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 密码状态
    */
    @SerializedName("PasswordStatus")
    @Expose
    private String PasswordStatus;

    /**
    * TcaplusDB SDK连接参数，接入ID
    */
    @SerializedName("ApiAccessId")
    @Expose
    private String ApiAccessId;

    /**
    * TcaplusDB SDK连接参数，接入地址
    */
    @SerializedName("ApiAccessIp")
    @Expose
    private String ApiAccessIp;

    /**
    * TcaplusDB SDK连接参数，接入端口
    */
    @SerializedName("ApiAccessPort")
    @Expose
    private Long ApiAccessPort;

    /**
    * 如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldPasswordExpireTime")
    @Expose
    private String OldPasswordExpireTime;

    /**
    * TcaplusDB SDK连接参数，接入ipv6地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiAccessIpv6")
    @Expose
    private String ApiAccessIpv6;

    /**
    * 集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * 集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * 读CU
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadCapacityUnit")
    @Expose
    private Long ReadCapacityUnit;

    /**
    * 写CU
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteCapacityUnit")
    @Expose
    private Long WriteCapacityUnit;

    /**
    * 磁盘容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskVolume")
    @Expose
    private Long DiskVolume;

    /**
    * 独占server机器信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerList")
    @Expose
    private ServerDetailInfo [] ServerList;

    /**
    * 独占proxy机器信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyList")
    @Expose
    private ProxyDetailInfo [] ProxyList;

    /**
    * 是否开启审核 0-不开启 1-开启
    */
    @SerializedName("Censorship")
    @Expose
    private Long Censorship;

    /**
    * 审批人uin列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbaUins")
    @Expose
    private String [] DbaUins;

    /**
    * 是否开启了数据订阅
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataFlowStatus")
    @Expose
    private Long DataFlowStatus;

    /**
    * 数据订阅的kafka信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaInfo")
    @Expose
    private KafkaInfo KafkaInfo;

    /**
    * 集群Txh备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TxhBackupExpireDay")
    @Expose
    private Long TxhBackupExpireDay;

    /**
    * 集群Ulog备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UlogBackupExpireDay")
    @Expose
    private Long UlogBackupExpireDay;

    /**
    * 集群Ulog备份文件过期策略是否为只读， 0： UlogBackupExpire是只读，不可修改， 1： UlogBackupExpire可以修改（当前业务存在Svrid第二段等于clusterid的机器）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsReadOnlyUlogBackupExpireDay")
    @Expose
    private Long IsReadOnlyUlogBackupExpireDay;

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群所在地域 
     * @return Region 集群所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 集群所在地域
     * @param Region 集群所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 集群数据描述语言类型，如：`PROTO`,`TDR` 
     * @return IdlType 集群数据描述语言类型，如：`PROTO`,`TDR`
     */
    public String getIdlType() {
        return this.IdlType;
    }

    /**
     * Set 集群数据描述语言类型，如：`PROTO`,`TDR`
     * @param IdlType 集群数据描述语言类型，如：`PROTO`,`TDR`
     */
    public void setIdlType(String IdlType) {
        this.IdlType = IdlType;
    }

    /**
     * Get 网络类型 
     * @return NetworkType 网络类型
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型
     * @param NetworkType 网络类型
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 集群关联的用户私有网络实例ID 
     * @return VpcId 集群关联的用户私有网络实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群关联的用户私有网络实例ID
     * @param VpcId 集群关联的用户私有网络实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集群关联的用户子网实例ID 
     * @return SubnetId 集群关联的用户子网实例ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 集群关联的用户子网实例ID
     * @param SubnetId 集群关联的用户子网实例ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 集群密码 
     * @return Password 集群密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 集群密码
     * @param Password 集群密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 密码状态 
     * @return PasswordStatus 密码状态
     */
    public String getPasswordStatus() {
        return this.PasswordStatus;
    }

    /**
     * Set 密码状态
     * @param PasswordStatus 密码状态
     */
    public void setPasswordStatus(String PasswordStatus) {
        this.PasswordStatus = PasswordStatus;
    }

    /**
     * Get TcaplusDB SDK连接参数，接入ID 
     * @return ApiAccessId TcaplusDB SDK连接参数，接入ID
     */
    public String getApiAccessId() {
        return this.ApiAccessId;
    }

    /**
     * Set TcaplusDB SDK连接参数，接入ID
     * @param ApiAccessId TcaplusDB SDK连接参数，接入ID
     */
    public void setApiAccessId(String ApiAccessId) {
        this.ApiAccessId = ApiAccessId;
    }

    /**
     * Get TcaplusDB SDK连接参数，接入地址 
     * @return ApiAccessIp TcaplusDB SDK连接参数，接入地址
     */
    public String getApiAccessIp() {
        return this.ApiAccessIp;
    }

    /**
     * Set TcaplusDB SDK连接参数，接入地址
     * @param ApiAccessIp TcaplusDB SDK连接参数，接入地址
     */
    public void setApiAccessIp(String ApiAccessIp) {
        this.ApiAccessIp = ApiAccessIp;
    }

    /**
     * Get TcaplusDB SDK连接参数，接入端口 
     * @return ApiAccessPort TcaplusDB SDK连接参数，接入端口
     */
    public Long getApiAccessPort() {
        return this.ApiAccessPort;
    }

    /**
     * Set TcaplusDB SDK连接参数，接入端口
     * @param ApiAccessPort TcaplusDB SDK连接参数，接入端口
     */
    public void setApiAccessPort(Long ApiAccessPort) {
        this.ApiAccessPort = ApiAccessPort;
    }

    /**
     * Get 如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldPasswordExpireTime 如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldPasswordExpireTime() {
        return this.OldPasswordExpireTime;
    }

    /**
     * Set 如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldPasswordExpireTime 如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldPasswordExpireTime(String OldPasswordExpireTime) {
        this.OldPasswordExpireTime = OldPasswordExpireTime;
    }

    /**
     * Get TcaplusDB SDK连接参数，接入ipv6地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiAccessIpv6 TcaplusDB SDK连接参数，接入ipv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiAccessIpv6() {
        return this.ApiAccessIpv6;
    }

    /**
     * Set TcaplusDB SDK连接参数，接入ipv6地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiAccessIpv6 TcaplusDB SDK连接参数，接入ipv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiAccessIpv6(String ApiAccessIpv6) {
        this.ApiAccessIpv6 = ApiAccessIpv6;
    }

    /**
     * Get 集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterStatus 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterStatus 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 读CU
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadCapacityUnit 读CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReadCapacityUnit() {
        return this.ReadCapacityUnit;
    }

    /**
     * Set 读CU
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadCapacityUnit 读CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadCapacityUnit(Long ReadCapacityUnit) {
        this.ReadCapacityUnit = ReadCapacityUnit;
    }

    /**
     * Get 写CU
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteCapacityUnit 写CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWriteCapacityUnit() {
        return this.WriteCapacityUnit;
    }

    /**
     * Set 写CU
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteCapacityUnit 写CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteCapacityUnit(Long WriteCapacityUnit) {
        this.WriteCapacityUnit = WriteCapacityUnit;
    }

    /**
     * Get 磁盘容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskVolume 磁盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskVolume() {
        return this.DiskVolume;
    }

    /**
     * Set 磁盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskVolume 磁盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskVolume(Long DiskVolume) {
        this.DiskVolume = DiskVolume;
    }

    /**
     * Get 独占server机器信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerList 独占server机器信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerDetailInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set 独占server机器信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerList 独占server机器信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerList(ServerDetailInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get 独占proxy机器信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyList 独占proxy机器信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyDetailInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set 独占proxy机器信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyList 独占proxy机器信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyList(ProxyDetailInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Get 是否开启审核 0-不开启 1-开启 
     * @return Censorship 是否开启审核 0-不开启 1-开启
     */
    public Long getCensorship() {
        return this.Censorship;
    }

    /**
     * Set 是否开启审核 0-不开启 1-开启
     * @param Censorship 是否开启审核 0-不开启 1-开启
     */
    public void setCensorship(Long Censorship) {
        this.Censorship = Censorship;
    }

    /**
     * Get 审批人uin列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbaUins 审批人uin列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDbaUins() {
        return this.DbaUins;
    }

    /**
     * Set 审批人uin列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbaUins 审批人uin列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbaUins(String [] DbaUins) {
        this.DbaUins = DbaUins;
    }

    /**
     * Get 是否开启了数据订阅
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataFlowStatus 是否开启了数据订阅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataFlowStatus() {
        return this.DataFlowStatus;
    }

    /**
     * Set 是否开启了数据订阅
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataFlowStatus 是否开启了数据订阅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataFlowStatus(Long DataFlowStatus) {
        this.DataFlowStatus = DataFlowStatus;
    }

    /**
     * Get 数据订阅的kafka信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaInfo 数据订阅的kafka信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KafkaInfo getKafkaInfo() {
        return this.KafkaInfo;
    }

    /**
     * Set 数据订阅的kafka信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaInfo 数据订阅的kafka信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaInfo(KafkaInfo KafkaInfo) {
        this.KafkaInfo = KafkaInfo;
    }

    /**
     * Get 集群Txh备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TxhBackupExpireDay 集群Txh备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTxhBackupExpireDay() {
        return this.TxhBackupExpireDay;
    }

    /**
     * Set 集群Txh备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param TxhBackupExpireDay 集群Txh备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTxhBackupExpireDay(Long TxhBackupExpireDay) {
        this.TxhBackupExpireDay = TxhBackupExpireDay;
    }

    /**
     * Get 集群Ulog备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UlogBackupExpireDay 集群Ulog备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUlogBackupExpireDay() {
        return this.UlogBackupExpireDay;
    }

    /**
     * Set 集群Ulog备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param UlogBackupExpireDay 集群Ulog备份文件多少天后过期删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUlogBackupExpireDay(Long UlogBackupExpireDay) {
        this.UlogBackupExpireDay = UlogBackupExpireDay;
    }

    /**
     * Get 集群Ulog备份文件过期策略是否为只读， 0： UlogBackupExpire是只读，不可修改， 1： UlogBackupExpire可以修改（当前业务存在Svrid第二段等于clusterid的机器）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsReadOnlyUlogBackupExpireDay 集群Ulog备份文件过期策略是否为只读， 0： UlogBackupExpire是只读，不可修改， 1： UlogBackupExpire可以修改（当前业务存在Svrid第二段等于clusterid的机器）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsReadOnlyUlogBackupExpireDay() {
        return this.IsReadOnlyUlogBackupExpireDay;
    }

    /**
     * Set 集群Ulog备份文件过期策略是否为只读， 0： UlogBackupExpire是只读，不可修改， 1： UlogBackupExpire可以修改（当前业务存在Svrid第二段等于clusterid的机器）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsReadOnlyUlogBackupExpireDay 集群Ulog备份文件过期策略是否为只读， 0： UlogBackupExpire是只读，不可修改， 1： UlogBackupExpire可以修改（当前业务存在Svrid第二段等于clusterid的机器）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsReadOnlyUlogBackupExpireDay(Long IsReadOnlyUlogBackupExpireDay) {
        this.IsReadOnlyUlogBackupExpireDay = IsReadOnlyUlogBackupExpireDay;
    }

    public ClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfo(ClusterInfo source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IdlType != null) {
            this.IdlType = new String(source.IdlType);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.PasswordStatus != null) {
            this.PasswordStatus = new String(source.PasswordStatus);
        }
        if (source.ApiAccessId != null) {
            this.ApiAccessId = new String(source.ApiAccessId);
        }
        if (source.ApiAccessIp != null) {
            this.ApiAccessIp = new String(source.ApiAccessIp);
        }
        if (source.ApiAccessPort != null) {
            this.ApiAccessPort = new Long(source.ApiAccessPort);
        }
        if (source.OldPasswordExpireTime != null) {
            this.OldPasswordExpireTime = new String(source.OldPasswordExpireTime);
        }
        if (source.ApiAccessIpv6 != null) {
            this.ApiAccessIpv6 = new String(source.ApiAccessIpv6);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.ReadCapacityUnit != null) {
            this.ReadCapacityUnit = new Long(source.ReadCapacityUnit);
        }
        if (source.WriteCapacityUnit != null) {
            this.WriteCapacityUnit = new Long(source.WriteCapacityUnit);
        }
        if (source.DiskVolume != null) {
            this.DiskVolume = new Long(source.DiskVolume);
        }
        if (source.ServerList != null) {
            this.ServerList = new ServerDetailInfo[source.ServerList.length];
            for (int i = 0; i < source.ServerList.length; i++) {
                this.ServerList[i] = new ServerDetailInfo(source.ServerList[i]);
            }
        }
        if (source.ProxyList != null) {
            this.ProxyList = new ProxyDetailInfo[source.ProxyList.length];
            for (int i = 0; i < source.ProxyList.length; i++) {
                this.ProxyList[i] = new ProxyDetailInfo(source.ProxyList[i]);
            }
        }
        if (source.Censorship != null) {
            this.Censorship = new Long(source.Censorship);
        }
        if (source.DbaUins != null) {
            this.DbaUins = new String[source.DbaUins.length];
            for (int i = 0; i < source.DbaUins.length; i++) {
                this.DbaUins[i] = new String(source.DbaUins[i]);
            }
        }
        if (source.DataFlowStatus != null) {
            this.DataFlowStatus = new Long(source.DataFlowStatus);
        }
        if (source.KafkaInfo != null) {
            this.KafkaInfo = new KafkaInfo(source.KafkaInfo);
        }
        if (source.TxhBackupExpireDay != null) {
            this.TxhBackupExpireDay = new Long(source.TxhBackupExpireDay);
        }
        if (source.UlogBackupExpireDay != null) {
            this.UlogBackupExpireDay = new Long(source.UlogBackupExpireDay);
        }
        if (source.IsReadOnlyUlogBackupExpireDay != null) {
            this.IsReadOnlyUlogBackupExpireDay = new Long(source.IsReadOnlyUlogBackupExpireDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IdlType", this.IdlType);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PasswordStatus", this.PasswordStatus);
        this.setParamSimple(map, prefix + "ApiAccessId", this.ApiAccessId);
        this.setParamSimple(map, prefix + "ApiAccessIp", this.ApiAccessIp);
        this.setParamSimple(map, prefix + "ApiAccessPort", this.ApiAccessPort);
        this.setParamSimple(map, prefix + "OldPasswordExpireTime", this.OldPasswordExpireTime);
        this.setParamSimple(map, prefix + "ApiAccessIpv6", this.ApiAccessIpv6);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ReadCapacityUnit", this.ReadCapacityUnit);
        this.setParamSimple(map, prefix + "WriteCapacityUnit", this.WriteCapacityUnit);
        this.setParamSimple(map, prefix + "DiskVolume", this.DiskVolume);
        this.setParamArrayObj(map, prefix + "ServerList.", this.ServerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);
        this.setParamSimple(map, prefix + "Censorship", this.Censorship);
        this.setParamArraySimple(map, prefix + "DbaUins.", this.DbaUins);
        this.setParamSimple(map, prefix + "DataFlowStatus", this.DataFlowStatus);
        this.setParamObj(map, prefix + "KafkaInfo.", this.KafkaInfo);
        this.setParamSimple(map, prefix + "TxhBackupExpireDay", this.TxhBackupExpireDay);
        this.setParamSimple(map, prefix + "UlogBackupExpireDay", this.UlogBackupExpireDay);
        this.setParamSimple(map, prefix + "IsReadOnlyUlogBackupExpireDay", this.IsReadOnlyUlogBackupExpireDay);

    }
}

