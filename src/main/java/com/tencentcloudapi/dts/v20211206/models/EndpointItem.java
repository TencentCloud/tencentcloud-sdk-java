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

public class EndpointItem extends AbstractModel {

    /**
    * 源库所在地域。如果 AccessType 为 ccn，请填vpc所在地域，因为此时不知道源库在哪个地域。其他接入方式，请填订阅任务所在地域，因为确保订阅任务与源库在同一地域是最优的网络方案。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseRegion")
    @Expose
    private String DatabaseRegion;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码。作为入参时必填，作为出参时为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云主机ID。如果 AccessType 为 cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * 专线网关ID。如果 AccessType 为 dcg，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * 云联网ID。如果 AccessType 为 ccn，此项必填。 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * vpn网关ID。如果 AccessType 为 vpncloud，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptConn")
    @Expose
    private String EncryptConn;

    /**
    * 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseNetEnv")
    @Expose
    private String DatabaseNetEnv;

    /**
    * 云联网网关所属的主账号uin、跨账号云联网需要。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnOwnerUin")
    @Expose
    private String CcnOwnerUin;

    /**
    * 为业务添加的额外信息。参数名作key，参数值作value。 tdpg必填参数：PgDatabase-订阅的库名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
     * Get 源库所在地域。如果 AccessType 为 ccn，请填vpc所在地域，因为此时不知道源库在哪个地域。其他接入方式，请填订阅任务所在地域，因为确保订阅任务与源库在同一地域是最优的网络方案。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseRegion 源库所在地域。如果 AccessType 为 ccn，请填vpc所在地域，因为此时不知道源库在哪个地域。其他接入方式，请填订阅任务所在地域，因为确保订阅任务与源库在同一地域是最优的网络方案。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseRegion() {
        return this.DatabaseRegion;
    }

    /**
     * Set 源库所在地域。如果 AccessType 为 ccn，请填vpc所在地域，因为此时不知道源库在哪个地域。其他接入方式，请填订阅任务所在地域，因为确保订阅任务与源库在同一地域是最优的网络方案。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseRegion 源库所在地域。如果 AccessType 为 ccn，请填vpc所在地域，因为此时不知道源库在哪个地域。其他接入方式，请填订阅任务所在地域，因为确保订阅任务与源库在同一地域是最优的网络方案。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseRegion(String DatabaseRegion) {
        this.DatabaseRegion = DatabaseRegion;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码。作为入参时必填，作为出参时为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码。作为入参时必填，作为出参时为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码。作为入参时必填，作为出参时为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码。作为入参时必填，作为出参时为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云主机ID。如果 AccessType 为 cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmInstanceId 云主机ID。如果 AccessType 为 cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set 云主机ID。如果 AccessType 为 cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmInstanceId 云主机ID。如果 AccessType 为 cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get 专线网关ID。如果 AccessType 为 dcg，此项必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqDcgId 专线网关ID。如果 AccessType 为 dcg，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set 专线网关ID。如果 AccessType 为 dcg，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqDcgId 专线网关ID。如果 AccessType 为 dcg，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get 云联网ID。如果 AccessType 为 ccn，此项必填。 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnId 云联网ID。如果 AccessType 为 ccn，此项必填。 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID。如果 AccessType 为 ccn，此项必填。 
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnId 云联网ID。如果 AccessType 为 ccn，此项必填。 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get vpn网关ID。如果 AccessType 为 vpncloud，此项必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpnGwId vpn网关ID。如果 AccessType 为 vpncloud，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set vpn网关ID。如果 AccessType 为 vpncloud，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpnGwId vpn网关ID。如果 AccessType 为 vpncloud，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptConn 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptConn() {
        return this.EncryptConn;
    }

    /**
     * Set 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptConn 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptConn(String EncryptConn) {
        this.EncryptConn = EncryptConn;
    }

    /**
     * Get 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseNetEnv 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseNetEnv() {
        return this.DatabaseNetEnv;
    }

    /**
     * Set 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseNetEnv 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseNetEnv(String DatabaseNetEnv) {
        this.DatabaseNetEnv = DatabaseNetEnv;
    }

    /**
     * Get 云联网网关所属的主账号uin、跨账号云联网需要。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnOwnerUin 云联网网关所属的主账号uin、跨账号云联网需要。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnOwnerUin() {
        return this.CcnOwnerUin;
    }

    /**
     * Set 云联网网关所属的主账号uin、跨账号云联网需要。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnOwnerUin 云联网网关所属的主账号uin、跨账号云联网需要。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnOwnerUin(String CcnOwnerUin) {
        this.CcnOwnerUin = CcnOwnerUin;
    }

    /**
     * Get 为业务添加的额外信息。参数名作key，参数值作value。 tdpg必填参数：PgDatabase-订阅的库名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraAttr 为业务添加的额外信息。参数名作key，参数值作value。 tdpg必填参数：PgDatabase-订阅的库名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set 为业务添加的额外信息。参数名作key，参数值作value。 tdpg必填参数：PgDatabase-订阅的库名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraAttr 为业务添加的额外信息。参数名作key，参数值作value。 tdpg必填参数：PgDatabase-订阅的库名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    public EndpointItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointItem(EndpointItem source) {
        if (source.DatabaseRegion != null) {
            this.DatabaseRegion = new String(source.DatabaseRegion);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.UniqDcgId != null) {
            this.UniqDcgId = new String(source.UniqDcgId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.UniqVpnGwId != null) {
            this.UniqVpnGwId = new String(source.UniqVpnGwId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
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
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseRegion", this.DatabaseRegion);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "UniqDcgId", this.UniqDcgId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "UniqVpnGwId", this.UniqVpnGwId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "EncryptConn", this.EncryptConn);
        this.setParamSimple(map, prefix + "DatabaseNetEnv", this.DatabaseNetEnv);
        this.setParamSimple(map, prefix + "CcnOwnerUin", this.CcnOwnerUin);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);

    }
}

