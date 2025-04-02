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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInfo extends AbstractModel {

    /**
    * 表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 内核版本，针对mariadb的不同内核版本等
    */
    @SerializedName("DbKernel")
    @Expose
    private String DbKernel;

    /**
    * 实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 实例的用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 实例的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * 专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * 数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnGwId")
    @Expose
    private String CcnGwId;

    /**
    * 私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 实例所属账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 跨账号迁移时的角色,只允许[a-zA-Z0-9\-\_]+
    */
    @SerializedName("AccountRole")
    @Expose
    private String AccountRole;

    /**
    * 资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源)
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
    * 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted
    */
    @SerializedName("EncryptConn")
    @Expose
    private String EncryptConn;

    /**
    * tdsql的分片id。如节点类型为set必填。
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
     * Get 表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。 
     * @return Role 表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。
     * @param Role 表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 内核版本，针对mariadb的不同内核版本等 
     * @return DbKernel 内核版本，针对mariadb的不同内核版本等
     */
    public String getDbKernel() {
        return this.DbKernel;
    }

    /**
     * Set 内核版本，针对mariadb的不同内核版本等
     * @param DbKernel 内核版本，针对mariadb的不同内核版本等
     */
    public void setDbKernel(String DbKernel) {
        this.DbKernel = DbKernel;
    }

    /**
     * Get 实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填 
     * @return Host 实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填
     * @param Host 实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填 
     * @return Port 实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填
     * @param Port 实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 实例的用户名 
     * @return User 实例的用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 实例的用户名
     * @param User 实例的用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 实例的密码 
     * @return Password 实例的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例的密码
     * @param Password 实例的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填 
     * @return CvmInstanceId CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填
     * @param CvmInstanceId CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填 
     * @return UniqVpnGwId VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填
     * @param UniqVpnGwId VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get 专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填 
     * @return UniqDcgId 专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set 专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填
     * @param UniqDcgId 专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get 数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填 
     * @return InstanceId 数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填
     * @param InstanceId 数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnGwId 云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnGwId() {
        return this.CcnGwId;
    }

    /**
     * Set 云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnGwId 云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnGwId(String CcnGwId) {
        this.CcnGwId = CcnGwId;
    }

    /**
     * Get 私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填 
     * @return VpcId 私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填
     * @param VpcId 私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填 
     * @return SubnetId 私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填
     * @param SubnetId 私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6 
     * @return EngineVersion 数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6
     * @param EngineVersion 数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 实例所属账号 
     * @return Account 实例所属账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 实例所属账号
     * @param Account 实例所属账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 跨账号迁移时的角色,只允许[a-zA-Z0-9\-\_]+ 
     * @return AccountRole 跨账号迁移时的角色,只允许[a-zA-Z0-9\-\_]+
     */
    public String getAccountRole() {
        return this.AccountRole;
    }

    /**
     * Set 跨账号迁移时的角色,只允许[a-zA-Z0-9\-\_]+
     * @param AccountRole 跨账号迁移时的角色,只允许[a-zA-Z0-9\-\_]+
     */
    public void setAccountRole(String AccountRole) {
        this.AccountRole = AccountRole;
    }

    /**
     * Get 资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源) 
     * @return AccountMode 资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源)
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set 资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源)
     * @param AccountMode 资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源)
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。 
     * @return TmpSecretId 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
     * @param TmpSecretId 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。 
     * @return TmpSecretKey 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
     * @param TmpSecretKey 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。 
     * @return TmpToken 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
     * @param TmpToken 临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    /**
     * Get 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted 
     * @return EncryptConn 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted
     */
    public String getEncryptConn() {
        return this.EncryptConn;
    }

    /**
     * Set 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted
     * @param EncryptConn 是否走加密传输、UnEncrypted表示不走加密传输，Encrypted表示走加密传输，默认UnEncrypted
     */
    public void setEncryptConn(String EncryptConn) {
        this.EncryptConn = EncryptConn;
    }

    /**
     * Get tdsql的分片id。如节点类型为set必填。 
     * @return SetId tdsql的分片id。如节点类型为set必填。
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set tdsql的分片id。如节点类型为set必填。
     * @param SetId tdsql的分片id。如节点类型为set必填。
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    public DBInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInfo(DBInfo source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.DbKernel != null) {
            this.DbKernel = new String(source.DbKernel);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
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
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.UniqVpnGwId != null) {
            this.UniqVpnGwId = new String(source.UniqVpnGwId);
        }
        if (source.UniqDcgId != null) {
            this.UniqDcgId = new String(source.UniqDcgId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CcnGwId != null) {
            this.CcnGwId = new String(source.CcnGwId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.AccountRole != null) {
            this.AccountRole = new String(source.AccountRole);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
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
        if (source.SetId != null) {
            this.SetId = new String(source.SetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "DbKernel", this.DbKernel);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "UniqVpnGwId", this.UniqVpnGwId);
        this.setParamSimple(map, prefix + "UniqDcgId", this.UniqDcgId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CcnGwId", this.CcnGwId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "AccountRole", this.AccountRole);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "TmpToken", this.TmpToken);
        this.setParamSimple(map, prefix + "EncryptConn", this.EncryptConn);
        this.setParamSimple(map, prefix + "SetId", this.SetId);

    }
}

