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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Endpoint extends AbstractModel{

    /**
    * 地域英文名，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * tdsql mysql版的节点类型，枚举值为proxy、set
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbKernel")
    @Expose
    private String DbKernel;

    /**
    * 数据库实例ID，格式如：cdb-powiqx8q
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例的IP地址，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 实例端口，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 用户名，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 数据库名，数据库为cdwpg时，需要提供
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * 专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * 云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * 数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 实例所属账号，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * 跨账号同步时的角色，只允许[a-zA-Z0-9\-\_]+，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountRole")
    @Expose
    private String AccountRole;

    /**
    * 外部角色id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleExternalId")
    @Expose
    private String RoleExternalId;

    /**
    * 临时密钥Id，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时密钥Key，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * 临时Token，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
    * 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptConn")
    @Expose
    private String EncryptConn;

    /**
    * 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseNetEnv")
    @Expose
    private String DatabaseNetEnv;

    /**
    * 数据库为跨账号云联网下的实例时、表示云联网所属主账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnOwnerUin")
    @Expose
    private String CcnOwnerUin;

    /**
     * Get 地域英文名，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域英文名，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域英文名，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域英文名，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get tdsql mysql版的节点类型，枚举值为proxy、set
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Role tdsql mysql版的节点类型，枚举值为proxy、set
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set tdsql mysql版的节点类型，枚举值为proxy、set
注意：此字段可能返回 null，表示取不到有效值。
     * @param Role tdsql mysql版的节点类型，枚举值为proxy、set
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbKernel 数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbKernel() {
        return this.DbKernel;
    }

    /**
     * Set 数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbKernel 数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbKernel(String DbKernel) {
        this.DbKernel = DbKernel;
    }

    /**
     * Get 数据库实例ID，格式如：cdb-powiqx8q
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 数据库实例ID，格式如：cdb-powiqx8q
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库实例ID，格式如：cdb-powiqx8q
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 数据库实例ID，格式如：cdb-powiqx8q
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例的IP地址，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 实例的IP地址，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 实例的IP地址，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 实例的IP地址，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 实例端口，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 实例端口，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例端口，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 实例端口，接入类型为非cdb时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 用户名，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户名，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户名，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码，对于访问需要用户名密码认证的实例必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 数据库名，数据库为cdwpg时，需要提供
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName 数据库名，数据库为cdwpg时，需要提供
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名，数据库为cdwpg时，需要提供
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName 数据库名，数据库为cdwpg时，需要提供
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmInstanceId CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmInstanceId CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get 专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqDcgId 专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set 专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqDcgId 专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpnGwId VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpnGwId VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get 云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnId 云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnId 云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Supplier 云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set 云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others
注意：此字段可能返回 null，表示取不到有效值。
     * @param Supplier 云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get 数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineVersion 数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineVersion 数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 实例所属账号，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Account 实例所属账号，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 实例所属账号，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Account 实例所属账号，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountMode 资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set 资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountMode 资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get 跨账号同步时的角色，只允许[a-zA-Z0-9\-\_]+，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountRole 跨账号同步时的角色，只允许[a-zA-Z0-9\-\_]+，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountRole() {
        return this.AccountRole;
    }

    /**
     * Set 跨账号同步时的角色，只允许[a-zA-Z0-9\-\_]+，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountRole 跨账号同步时的角色，只允许[a-zA-Z0-9\-\_]+，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountRole(String AccountRole) {
        this.AccountRole = AccountRole;
    }

    /**
     * Get 外部角色id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleExternalId 外部角色id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleExternalId() {
        return this.RoleExternalId;
    }

    /**
     * Set 外部角色id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleExternalId 外部角色id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleExternalId(String RoleExternalId) {
        this.RoleExternalId = RoleExternalId;
    }

    /**
     * Get 临时密钥Id，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmpSecretId 临时密钥Id，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时密钥Id，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmpSecretId 临时密钥Id，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时密钥Key，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmpSecretKey 临时密钥Key，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时密钥Key，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmpSecretKey 临时密钥Key，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get 临时Token，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmpToken 临时Token，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set 临时Token，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmpToken 临时Token，如果为跨账号实例此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    /**
     * Get 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptConn 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptConn() {
        return this.EncryptConn;
    }

    /**
     * Set 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptConn 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptConn(String EncryptConn) {
        this.EncryptConn = EncryptConn;
    }

    /**
     * Get 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseNetEnv 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseNetEnv() {
        return this.DatabaseNetEnv;
    }

    /**
     * Set 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseNetEnv 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseNetEnv(String DatabaseNetEnv) {
        this.DatabaseNetEnv = DatabaseNetEnv;
    }

    /**
     * Get 数据库为跨账号云联网下的实例时、表示云联网所属主账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnOwnerUin 数据库为跨账号云联网下的实例时、表示云联网所属主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnOwnerUin() {
        return this.CcnOwnerUin;
    }

    /**
     * Set 数据库为跨账号云联网下的实例时、表示云联网所属主账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnOwnerUin 数据库为跨账号云联网下的实例时、表示云联网所属主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnOwnerUin(String CcnOwnerUin) {
        this.CcnOwnerUin = CcnOwnerUin;
    }

    public Endpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Endpoint(Endpoint source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.DbKernel != null) {
            this.DbKernel = new String(source.DbKernel);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.UniqDcgId != null) {
            this.UniqDcgId = new String(source.UniqDcgId);
        }
        if (source.UniqVpnGwId != null) {
            this.UniqVpnGwId = new String(source.UniqVpnGwId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.Supplier != null) {
            this.Supplier = new String(source.Supplier);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
        }
        if (source.AccountRole != null) {
            this.AccountRole = new String(source.AccountRole);
        }
        if (source.RoleExternalId != null) {
            this.RoleExternalId = new String(source.RoleExternalId);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.TmpToken != null) {
            this.TmpToken = new String(source.TmpToken);
        }
        if (source.EncryptConn != null) {
            this.EncryptConn = new String(source.EncryptConn);
        }
        if (source.DatabaseNetEnv != null) {
            this.DatabaseNetEnv = new String(source.DatabaseNetEnv);
        }
        if (source.CcnOwnerUin != null) {
            this.CcnOwnerUin = new String(source.CcnOwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "DbKernel", this.DbKernel);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "UniqDcgId", this.UniqDcgId);
        this.setParamSimple(map, prefix + "UniqVpnGwId", this.UniqVpnGwId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "Supplier", this.Supplier);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "AccountRole", this.AccountRole);
        this.setParamSimple(map, prefix + "RoleExternalId", this.RoleExternalId);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "TmpToken", this.TmpToken);
        this.setParamSimple(map, prefix + "EncryptConn", this.EncryptConn);
        this.setParamSimple(map, prefix + "DatabaseNetEnv", this.DatabaseNetEnv);
        this.setParamSimple(map, prefix + "CcnOwnerUin", this.CcnOwnerUin);

    }
}

