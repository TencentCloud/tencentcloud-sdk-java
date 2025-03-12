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
    */
    @SerializedName("DatabaseRegion")
    @Expose
    private String DatabaseRegion;

    /**
    * 用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码。作为入参时必填，作为出参时为空。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云主机ID。如果 AccessType 为 cvm，此项必填。
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * 专线网关ID。如果 AccessType 为 dcg，此项必填。
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * 云联网ID。如果 AccessType 为 ccn，此项必填。 
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * vpn网关ID。如果 AccessType 为 vpncloud，此项必填。
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。
    */
    @SerializedName("EncryptConn")
    @Expose
    private String EncryptConn;

    /**
    * 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。
    */
    @SerializedName("DatabaseNetEnv")
    @Expose
    private String DatabaseNetEnv;

    /**
    * 云联网网关所属的主账号uin、跨账号云联网需要。
    */
    @SerializedName("CcnOwnerUin")
    @Expose
    private String CcnOwnerUin;

    /**
    * 为业务添加的额外信息。参数名作key，参数值作value。 
tdpg必填参数：PgDatabase-订阅的库名；
mongo选填参数：InstanceType-实例类型：replicaset-副本集，cluster-分片集，主要用于控制台跳转到mongo实例页面，如不填不影响任务运行；
全业务选填参数：EngineVersion-内核版本。
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
    * 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID
    */
    @SerializedName("ChildInstanceId")
    @Expose
    private String ChildInstanceId;

    /**
    * 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw
    */
    @SerializedName("ChildInstanceType")
    @Expose
    private String ChildInstanceType;

    /**
     * Get 源库所在地域。如果 AccessType 为 ccn，请填vpc所在地域，因为此时不知道源库在哪个地域。其他接入方式，请填订阅任务所在地域，因为确保订阅任务与源库在同一地域是最优的网络方案。 
     * @return DatabaseRegion 源库所在地域。如果 AccessType 为 ccn，请填vpc所在地域，因为此时不知道源库在哪个地域。其他接入方式，请填订阅任务所在地域，因为确保订阅任务与源库在同一地域是最优的网络方案。
     */
    public String getDatabaseRegion() {
        return this.DatabaseRegion;
    }

    /**
     * Set 源库所在地域。如果 AccessType 为 ccn，请填vpc所在地域，因为此时不知道源库在哪个地域。其他接入方式，请填订阅任务所在地域，因为确保订阅任务与源库在同一地域是最优的网络方案。
     * @param DatabaseRegion 源库所在地域。如果 AccessType 为 ccn，请填vpc所在地域，因为此时不知道源库在哪个地域。其他接入方式，请填订阅任务所在地域，因为确保订阅任务与源库在同一地域是最优的网络方案。
     */
    public void setDatabaseRegion(String DatabaseRegion) {
        this.DatabaseRegion = DatabaseRegion;
    }

    /**
     * Get 用户名 
     * @return User 用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名
     * @param User 用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码。作为入参时必填，作为出参时为空。 
     * @return Password 密码。作为入参时必填，作为出参时为空。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码。作为入参时必填，作为出参时为空。
     * @param Password 密码。作为入参时必填，作为出参时为空。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。 
     * @return InstanceId 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。
     * @param InstanceId 目标实例ID。如果 AccessType 为 cdb，此项必填。配置InstanceId时会查询并校验实例信息。mysql的查询接口经过了鉴权，请确保子用户有 cdb:DescribeDBInstances 的接口权限。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云主机ID。如果 AccessType 为 cvm，此项必填。 
     * @return CvmInstanceId 云主机ID。如果 AccessType 为 cvm，此项必填。
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set 云主机ID。如果 AccessType 为 cvm，此项必填。
     * @param CvmInstanceId 云主机ID。如果 AccessType 为 cvm，此项必填。
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get 专线网关ID。如果 AccessType 为 dcg，此项必填。 
     * @return UniqDcgId 专线网关ID。如果 AccessType 为 dcg，此项必填。
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set 专线网关ID。如果 AccessType 为 dcg，此项必填。
     * @param UniqDcgId 专线网关ID。如果 AccessType 为 dcg，此项必填。
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get 云联网ID。如果 AccessType 为 ccn，此项必填。  
     * @return CcnId 云联网ID。如果 AccessType 为 ccn，此项必填。 
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID。如果 AccessType 为 ccn，此项必填。 
     * @param CcnId 云联网ID。如果 AccessType 为 ccn，此项必填。 
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get vpn网关ID。如果 AccessType 为 vpncloud，此项必填。 
     * @return UniqVpnGwId vpn网关ID。如果 AccessType 为 vpncloud，此项必填。
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set vpn网关ID。如果 AccessType 为 vpncloud，此项必填。
     * @param UniqVpnGwId vpn网关ID。如果 AccessType 为 vpncloud，此项必填。
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。 
     * @return VpcId VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
     * @param VpcId VpcID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。 
     * @return SubnetId 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
     * @param SubnetId 子网ID。如果 AccessType 为 dcg\ccn\vpncloud\vpc，此项必填。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。 
     * @return HostName 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。
     * @param HostName 数据库地址，支持域名与IP。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet，此项必填。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。 
     * @return Port 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。
     * @param Port 数据库端口。如果 AccessType 为 dcg\ccn\vpncloud\vpc\extranet\intranet\cvm，此项必填。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。 
     * @return EncryptConn 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。
     */
    public String getEncryptConn() {
        return this.EncryptConn;
    }

    /**
     * Set 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。
     * @param EncryptConn 是否走加密传输，枚举值：UnEncrypted-不加密，Encrypted-加密。只有mysql支持，不填默认不加密，其他产品不填。
     */
    public void setEncryptConn(String EncryptConn) {
        this.EncryptConn = EncryptConn;
    }

    /**
     * Get 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。 
     * @return DatabaseNetEnv 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。
     */
    public String getDatabaseNetEnv() {
        return this.DatabaseNetEnv;
    }

    /**
     * Set 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。
     * @param DatabaseNetEnv 数据库网络环境。如果 AccessType 为 ccn 此项必填。枚举值：UserIDC-自建idc，TencentVPC-腾讯云，Aws-aws，AliYun-阿里云，Others-其他。
     */
    public void setDatabaseNetEnv(String DatabaseNetEnv) {
        this.DatabaseNetEnv = DatabaseNetEnv;
    }

    /**
     * Get 云联网网关所属的主账号uin、跨账号云联网需要。 
     * @return CcnOwnerUin 云联网网关所属的主账号uin、跨账号云联网需要。
     */
    public String getCcnOwnerUin() {
        return this.CcnOwnerUin;
    }

    /**
     * Set 云联网网关所属的主账号uin、跨账号云联网需要。
     * @param CcnOwnerUin 云联网网关所属的主账号uin、跨账号云联网需要。
     */
    public void setCcnOwnerUin(String CcnOwnerUin) {
        this.CcnOwnerUin = CcnOwnerUin;
    }

    /**
     * Get 为业务添加的额外信息。参数名作key，参数值作value。 
tdpg必填参数：PgDatabase-订阅的库名；
mongo选填参数：InstanceType-实例类型：replicaset-副本集，cluster-分片集，主要用于控制台跳转到mongo实例页面，如不填不影响任务运行；
全业务选填参数：EngineVersion-内核版本。 
     * @return ExtraAttr 为业务添加的额外信息。参数名作key，参数值作value。 
tdpg必填参数：PgDatabase-订阅的库名；
mongo选填参数：InstanceType-实例类型：replicaset-副本集，cluster-分片集，主要用于控制台跳转到mongo实例页面，如不填不影响任务运行；
全业务选填参数：EngineVersion-内核版本。
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set 为业务添加的额外信息。参数名作key，参数值作value。 
tdpg必填参数：PgDatabase-订阅的库名；
mongo选填参数：InstanceType-实例类型：replicaset-副本集，cluster-分片集，主要用于控制台跳转到mongo实例页面，如不填不影响任务运行；
全业务选填参数：EngineVersion-内核版本。
     * @param ExtraAttr 为业务添加的额外信息。参数名作key，参数值作value。 
tdpg必填参数：PgDatabase-订阅的库名；
mongo选填参数：InstanceType-实例类型：replicaset-副本集，cluster-分片集，主要用于控制台跳转到mongo实例页面，如不填不影响任务运行；
全业务选填参数：EngineVersion-内核版本。
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    /**
     * Get 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID 
     * @return ChildInstanceId 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID
     */
    public String getChildInstanceId() {
        return this.ChildInstanceId;
    }

    /**
     * Set 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID
     * @param ChildInstanceId 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的ID
     */
    public void setChildInstanceId(String ChildInstanceId) {
        this.ChildInstanceId = ChildInstanceId;
    }

    /**
     * Get 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw 
     * @return ChildInstanceType 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw
     */
    public String getChildInstanceType() {
        return this.ChildInstanceType;
    }

    /**
     * Set 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw
     * @param ChildInstanceType 数据库为cynos、且是cynos集群内的一个子数据库实例时、该参数为该子实例的类型、例如：只读实例传ro、读写实例传rw
     */
    public void setChildInstanceType(String ChildInstanceType) {
        this.ChildInstanceType = ChildInstanceType;
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
        if (source.ChildInstanceId != null) {
            this.ChildInstanceId = new String(source.ChildInstanceId);
        }
        if (source.ChildInstanceType != null) {
            this.ChildInstanceType = new String(source.ChildInstanceType);
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
        this.setParamSimple(map, prefix + "ChildInstanceId", this.ChildInstanceId);
        this.setParamSimple(map, prefix + "ChildInstanceType", this.ChildInstanceType);

    }
}

