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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Endpoint extends AbstractModel {

    /**
    * <p>地域英文名，如：ap-guangzhou</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>节点类型，proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql。注意TDSQL-C MySQL、TDSQL PostgreSQL无需填写此项值。</p>
    */
    @SerializedName("DbKernel")
    @Expose
    private String DbKernel;

    /**
    * <p>数据库实例ID，格式如：cdb-powiqx8q</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例的IP地址，接入类型为非cdb时此项必填</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>实例端口，接入类型为非cdb时此项必填</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>用户名，对于访问需要用户名密码认证的实例必填</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>密码，对于访问需要用户名密码认证的实例必填</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>数据库名，数据库为cdwpg时，需要提供</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段</p>
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * <p>专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb</p>
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * <p>VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q</p>
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * <p>云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others</p>
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * <p>数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>实例所属账号，如果为跨账号实例此项必填</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)</p>
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * <p>跨账号同步时的角色，只允许[a-zA-Z0-9-_]+，如果为跨账号实例此项必填</p>
    */
    @SerializedName("AccountRole")
    @Expose
    private String AccountRole;

    /**
    * <p>外部角色id</p>
    */
    @SerializedName("RoleExternalId")
    @Expose
    private String RoleExternalId;

    /**
    * <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
    * <p>是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted</p>
    */
    @SerializedName("EncryptConn")
    @Expose
    private String EncryptConn;

    /**
    * <p>数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；</p>
    */
    @SerializedName("DatabaseNetEnv")
    @Expose
    private String DatabaseNetEnv;

    /**
    * <p>数据库为跨账号云联网下的实例时、表示云联网所属主账号</p>
    */
    @SerializedName("CcnOwnerUin")
    @Expose
    private String CcnOwnerUin;

    /**
    * <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID</p>
    */
    @SerializedName("ChildInstanceId")
    @Expose
    private String ChildInstanceId;

    /**
    * <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw</p>
    */
    @SerializedName("ChildInstanceType")
    @Expose
    private String ChildInstanceType;

    /**
    * <p>tdsql的分片id。如节点类型为set必填。</p>
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
     * Get <p>地域英文名，如：ap-guangzhou</p> 
     * @return Region <p>地域英文名，如：ap-guangzhou</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域英文名，如：ap-guangzhou</p>
     * @param Region <p>地域英文名，如：ap-guangzhou</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>节点类型，proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填</p> 
     * @return Role <p>节点类型，proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>节点类型，proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填</p>
     * @param Role <p>节点类型，proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql。注意TDSQL-C MySQL、TDSQL PostgreSQL无需填写此项值。</p> 
     * @return DbKernel <p>数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql。注意TDSQL-C MySQL、TDSQL PostgreSQL无需填写此项值。</p>
     */
    public String getDbKernel() {
        return this.DbKernel;
    }

    /**
     * Set <p>数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql。注意TDSQL-C MySQL、TDSQL PostgreSQL无需填写此项值。</p>
     * @param DbKernel <p>数据库内核类型，tdsql中用于区分不同内核：percona,mariadb,mysql。注意TDSQL-C MySQL、TDSQL PostgreSQL无需填写此项值。</p>
     */
    public void setDbKernel(String DbKernel) {
        this.DbKernel = DbKernel;
    }

    /**
     * Get <p>数据库实例ID，格式如：cdb-powiqx8q</p> 
     * @return InstanceId <p>数据库实例ID，格式如：cdb-powiqx8q</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>数据库实例ID，格式如：cdb-powiqx8q</p>
     * @param InstanceId <p>数据库实例ID，格式如：cdb-powiqx8q</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例的IP地址，接入类型为非cdb时此项必填</p> 
     * @return Ip <p>实例的IP地址，接入类型为非cdb时此项必填</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>实例的IP地址，接入类型为非cdb时此项必填</p>
     * @param Ip <p>实例的IP地址，接入类型为非cdb时此项必填</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>实例端口，接入类型为非cdb时此项必填</p> 
     * @return Port <p>实例端口，接入类型为非cdb时此项必填</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>实例端口，接入类型为非cdb时此项必填</p>
     * @param Port <p>实例端口，接入类型为非cdb时此项必填</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>用户名，对于访问需要用户名密码认证的实例必填</p> 
     * @return User <p>用户名，对于访问需要用户名密码认证的实例必填</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>用户名，对于访问需要用户名密码认证的实例必填</p>
     * @param User <p>用户名，对于访问需要用户名密码认证的实例必填</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>密码，对于访问需要用户名密码认证的实例必填</p> 
     * @return Password <p>密码，对于访问需要用户名密码认证的实例必填</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>密码，对于访问需要用户名密码认证的实例必填</p>
     * @param Password <p>密码，对于访问需要用户名密码认证的实例必填</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>数据库名，数据库为cdwpg时，需要提供</p> 
     * @return DbName <p>数据库名，数据库为cdwpg时，需要提供</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>数据库名，数据库为cdwpg时，需要提供</p>
     * @param DbName <p>数据库名，数据库为cdwpg时，需要提供</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto</p> 
     * @return VpcId <p>私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto</p>
     * @param VpcId <p>私有网络ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：vpc-92jblxto</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz</p> 
     * @return SubnetId <p>私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz</p>
     * @param SubnetId <p>私有网络下的子网ID，对于私有网络、专线、VPN的接入方式此项必填，格式如：subnet-3paxmkdz</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段</p> 
     * @return CvmInstanceId <p>CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段</p>
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set <p>CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段</p>
     * @param CvmInstanceId <p>CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段</p>
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get <p>专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb</p> 
     * @return UniqDcgId <p>专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb</p>
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set <p>专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb</p>
     * @param UniqDcgId <p>专线网关ID，对于专线接入类型此项必填，格式如：dcg-0rxtqqxb</p>
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get <p>VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q</p> 
     * @return UniqVpnGwId <p>VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q</p>
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set <p>VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q</p>
     * @param UniqVpnGwId <p>VPN网关ID，对于vpn接入类型此项必填，格式如：vpngw-9ghexg7q</p>
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get <p>云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc</p> 
     * @return CcnId <p>云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc</p>
     * @param CcnId <p>云联网ID，对于云联网接入类型此项必填，如：ccn-afp6kltc</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others</p> 
     * @return Supplier <p>云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others</p>
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set <p>云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others</p>
     * @param Supplier <p>云厂商类型，当实例为RDS实例时，填写为aliyun, 其他情况均填写others，默认为others</p>
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get <p>数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6</p> 
     * @return EngineVersion <p>数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6</p>
     * @param EngineVersion <p>数据库版本，当实例为RDS实例时才有效，其他实例忽略，格式如：5.6或者5.7，默认为5.6</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>实例所属账号，如果为跨账号实例此项必填</p> 
     * @return Account <p>实例所属账号，如果为跨账号实例此项必填</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>实例所属账号，如果为跨账号实例此项必填</p>
     * @param Account <p>实例所属账号，如果为跨账号实例此项必填</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)</p> 
     * @return AccountMode <p>资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)</p>
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set <p>资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)</p>
     * @param AccountMode <p>资源所属账号 为空或self(表示本账号内资源)、other(表示跨账号资源)</p>
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get <p>跨账号同步时的角色，只允许[a-zA-Z0-9-_]+，如果为跨账号实例此项必填</p> 
     * @return AccountRole <p>跨账号同步时的角色，只允许[a-zA-Z0-9-_]+，如果为跨账号实例此项必填</p>
     */
    public String getAccountRole() {
        return this.AccountRole;
    }

    /**
     * Set <p>跨账号同步时的角色，只允许[a-zA-Z0-9-_]+，如果为跨账号实例此项必填</p>
     * @param AccountRole <p>跨账号同步时的角色，只允许[a-zA-Z0-9-_]+，如果为跨账号实例此项必填</p>
     */
    public void setAccountRole(String AccountRole) {
        this.AccountRole = AccountRole;
    }

    /**
     * Get <p>外部角色id</p> 
     * @return RoleExternalId <p>外部角色id</p>
     */
    public String getRoleExternalId() {
        return this.RoleExternalId;
    }

    /**
     * Set <p>外部角色id</p>
     * @param RoleExternalId <p>外部角色id</p>
     */
    public void setRoleExternalId(String RoleExternalId) {
        this.RoleExternalId = RoleExternalId;
    }

    /**
     * Get <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p> 
     * @return TmpSecretId <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
     * @param TmpSecretId <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p> 
     * @return TmpSecretKey <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
     * @param TmpSecretKey <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p> 
     * @return TmpToken <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
     * @param TmpToken <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号同步文档(https://cloud.tencent.com/document/product/571/68729)第4节中关于角色的定义。</p>
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    /**
     * Get <p>是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted</p> 
     * @return EncryptConn <p>是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted</p>
     */
    public String getEncryptConn() {
        return this.EncryptConn;
    }

    /**
     * Set <p>是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted</p>
     * @param EncryptConn <p>是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted</p>
     */
    public void setEncryptConn(String EncryptConn) {
        this.EncryptConn = EncryptConn;
    }

    /**
     * Get <p>数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；</p> 
     * @return DatabaseNetEnv <p>数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；</p>
     */
    public String getDatabaseNetEnv() {
        return this.DatabaseNetEnv;
    }

    /**
     * Set <p>数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；</p>
     * @param DatabaseNetEnv <p>数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；</p>
     */
    public void setDatabaseNetEnv(String DatabaseNetEnv) {
        this.DatabaseNetEnv = DatabaseNetEnv;
    }

    /**
     * Get <p>数据库为跨账号云联网下的实例时、表示云联网所属主账号</p> 
     * @return CcnOwnerUin <p>数据库为跨账号云联网下的实例时、表示云联网所属主账号</p>
     */
    public String getCcnOwnerUin() {
        return this.CcnOwnerUin;
    }

    /**
     * Set <p>数据库为跨账号云联网下的实例时、表示云联网所属主账号</p>
     * @param CcnOwnerUin <p>数据库为跨账号云联网下的实例时、表示云联网所属主账号</p>
     */
    public void setCcnOwnerUin(String CcnOwnerUin) {
        this.CcnOwnerUin = CcnOwnerUin;
    }

    /**
     * Get <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID</p> 
     * @return ChildInstanceId <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID</p>
     */
    public String getChildInstanceId() {
        return this.ChildInstanceId;
    }

    /**
     * Set <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID</p>
     * @param ChildInstanceId <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID</p>
     */
    public void setChildInstanceId(String ChildInstanceId) {
        this.ChildInstanceId = ChildInstanceId;
    }

    /**
     * Get <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw</p> 
     * @return ChildInstanceType <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw</p>
     */
    public String getChildInstanceType() {
        return this.ChildInstanceType;
    }

    /**
     * Set <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw</p>
     * @param ChildInstanceType <p>数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw</p>
     */
    public void setChildInstanceType(String ChildInstanceType) {
        this.ChildInstanceType = ChildInstanceType;
    }

    /**
     * Get <p>tdsql的分片id。如节点类型为set必填。</p> 
     * @return SetId <p>tdsql的分片id。如节点类型为set必填。</p>
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set <p>tdsql的分片id。如节点类型为set必填。</p>
     * @param SetId <p>tdsql的分片id。如节点类型为set必填。</p>
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
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
        if (source.ChildInstanceId != null) {
            this.ChildInstanceId = new String(source.ChildInstanceId);
        }
        if (source.ChildInstanceType != null) {
            this.ChildInstanceType = new String(source.ChildInstanceType);
        }
        if (source.SetId != null) {
            this.SetId = new String(source.SetId);
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
        this.setParamSimple(map, prefix + "ChildInstanceId", this.ChildInstanceId);
        this.setParamSimple(map, prefix + "ChildInstanceType", this.ChildInstanceType);
        this.setParamSimple(map, prefix + "SetId", this.SetId);

    }
}

