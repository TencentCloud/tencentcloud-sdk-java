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

public class DBInfo extends AbstractModel {

    /**
    * <p>表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>内核版本，针对mariadb的不同内核版本等</p>
    */
    @SerializedName("DbKernel")
    @Expose
    private String DbKernel;

    /**
    * <p>实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>实例的用户名</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>实例的密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填</p>
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * <p>VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填</p>
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * <p>专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填</p>
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * <p>数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。</p>
    */
    @SerializedName("CcnGwId")
    @Expose
    private String CcnGwId;

    /**
    * <p>私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>实例所属账号</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>跨账号迁移时的角色,只允许[a-zA-Z0-9-_]+</p>
    */
    @SerializedName("AccountRole")
    @Expose
    private String AccountRole;

    /**
    * <p>资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源)</p>
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
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
    * <p>tdsql的分片id。如节点类型为set必填。</p>
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
     * Get <p>表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。</p> 
     * @return Role <p>表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。</p>
     * @param Role <p>表示节点角色，针对分布式数据库，如mongodb中的mongos节点。tdsqlmysql的可选项：proxy表示节点类型为主机，set表示节点类型为节点。proxy类型必须填在数组第一项。tdsqlmysql类型的源/目标配置必填。</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>内核版本，针对mariadb的不同内核版本等</p> 
     * @return DbKernel <p>内核版本，针对mariadb的不同内核版本等</p>
     */
    public String getDbKernel() {
        return this.DbKernel;
    }

    /**
     * Set <p>内核版本，针对mariadb的不同内核版本等</p>
     * @param DbKernel <p>内核版本，针对mariadb的不同内核版本等</p>
     */
    public void setDbKernel(String DbKernel) {
        this.DbKernel = DbKernel;
    }

    /**
     * Get <p>实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p> 
     * @return Host <p>实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p>
     * @param Host <p>实例的IP地址，对于公网、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p> 
     * @return Port <p>实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p>
     * @param Port <p>实例的端口，对于公网、云主机自建、专线、VPN、云联网、自研上云、VPC等接入方式此项必填</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>实例的用户名</p> 
     * @return User <p>实例的用户名</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>实例的用户名</p>
     * @param User <p>实例的用户名</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>实例的密码</p> 
     * @return Password <p>实例的密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>实例的密码</p>
     * @param Password <p>实例的密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填</p> 
     * @return CvmInstanceId <p>CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填</p>
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set <p>CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填</p>
     * @param CvmInstanceId <p>CVM实例短ID，格式如：ins-olgl39y8；与云服务器控制台页面显示的实例ID相同；如果接入类型为云主机自建的方式，此项必填</p>
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get <p>VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填</p> 
     * @return UniqVpnGwId <p>VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填</p>
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set <p>VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填</p>
     * @param UniqVpnGwId <p>VPN网关ID，格式如：vpngw-9ghexg7q；如果接入类型为vpncloud的方式，此项必填</p>
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get <p>专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填</p> 
     * @return UniqDcgId <p>专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填</p>
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set <p>专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填</p>
     * @param UniqDcgId <p>专线网关ID，格式如：dcg-0rxtqqxb；如果接入类型为专线接入的方式，此项必填</p>
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get <p>数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填</p> 
     * @return InstanceId <p>数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填</p>
     * @param InstanceId <p>数据库实例ID，格式如：cdb-powiqx8q；如果接入类型为云数据库的方式，此项必填</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。</p> 
     * @return CcnGwId <p>云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。</p>
     */
    public String getCcnGwId() {
        return this.CcnGwId;
    }

    /**
     * Set <p>云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。</p>
     * @param CcnGwId <p>云联网ID，如：ccn-afp6kltc 注意：此字段可能返回 null，表示取不到有效值。</p>
     */
    public void setCcnGwId(String CcnGwId) {
        this.CcnGwId = CcnGwId;
    }

    /**
     * Get <p>私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p> 
     * @return VpcId <p>私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p>
     * @param VpcId <p>私有网络ID，格式如：vpc-92jblxto；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p> 
     * @return SubnetId <p>私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p>
     * @param SubnetId <p>私有网络下的子网ID，格式如：subnet-3paxmkdz；如果接入类型为vpc、vpncloud、ccn、dcg的方式，此项必填</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6</p> 
     * @return EngineVersion <p>数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6</p>
     * @param EngineVersion <p>数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>实例所属账号</p> 
     * @return Account <p>实例所属账号</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>实例所属账号</p>
     * @param Account <p>实例所属账号</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>跨账号迁移时的角色,只允许[a-zA-Z0-9-_]+</p> 
     * @return AccountRole <p>跨账号迁移时的角色,只允许[a-zA-Z0-9-_]+</p>
     */
    public String getAccountRole() {
        return this.AccountRole;
    }

    /**
     * Set <p>跨账号迁移时的角色,只允许[a-zA-Z0-9-_]+</p>
     * @param AccountRole <p>跨账号迁移时的角色,只允许[a-zA-Z0-9-_]+</p>
     */
    public void setAccountRole(String AccountRole) {
        this.AccountRole = AccountRole;
    }

    /**
     * Get <p>资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源)</p> 
     * @return AccountMode <p>资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源)</p>
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set <p>资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源)</p>
     * @param AccountMode <p>资源所属账号 为空或self(表示本账号内资源)、other(表示其他账户资源)</p>
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p> 
     * @return TmpSecretId <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     * @param TmpSecretId <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p> 
     * @return TmpSecretKey <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     * @param TmpSecretKey <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p> 
     * @return TmpToken <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     * @param TmpToken <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
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

