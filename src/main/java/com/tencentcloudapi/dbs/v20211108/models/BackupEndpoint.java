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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupEndpoint extends AbstractModel {

    /**
    * 数据库类型。目前支持的值["mysql", "mariadb", "percona"]。注意，该值必须和备份计划的类型一致。
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * 实例接入类型，支持的值包括：
"extranet" - 外网;
"cvm" - cvm自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网接入。
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 用户名。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 登录密码。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 接入地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 服务提供商，支持的值包括["aliyun", "aws", "others"]。
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * 实例 Ip。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 实例端口号。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 云数据库实例ID，格式如：cdb-qcloudtest。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CVM 实例ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要填写该字段。
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * 专线网关ID，格式如：dcg-0rxtqqxb。
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * VPN网关ID，格式如：vpngw-9ghexg7q。
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * 私有网络ID，格式如：vpc-92jblxto。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID，格式如：subnet-3paxmkdz。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 云联网ID，如：ccn-afp6kltc。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 数据库版本，当实例为 RDS 或 AWS 实例时才有效，格式如：5.6或者5.7，默认为5.6。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * mariadb三引擎版本。
    */
    @SerializedName("DBKernel")
    @Expose
    private String DBKernel;

    /**
     * Get 数据库类型。目前支持的值["mysql", "mariadb", "percona"]。注意，该值必须和备份计划的类型一致。 
     * @return DatabaseType 数据库类型。目前支持的值["mysql", "mariadb", "percona"]。注意，该值必须和备份计划的类型一致。
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set 数据库类型。目前支持的值["mysql", "mariadb", "percona"]。注意，该值必须和备份计划的类型一致。
     * @param DatabaseType 数据库类型。目前支持的值["mysql", "mariadb", "percona"]。注意，该值必须和备份计划的类型一致。
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get 实例接入类型，支持的值包括：
"extranet" - 外网;
"cvm" - cvm自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网接入。 
     * @return AccessType 实例接入类型，支持的值包括：
"extranet" - 外网;
"cvm" - cvm自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网接入。
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 实例接入类型，支持的值包括：
"extranet" - 外网;
"cvm" - cvm自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网接入。
     * @param AccessType 实例接入类型，支持的值包括：
"extranet" - 外网;
"cvm" - cvm自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网接入。
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 用户名。 
     * @return UserName 用户名。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名。
     * @param UserName 用户名。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 登录密码。 
     * @return Password 登录密码。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 登录密码。
     * @param Password 登录密码。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 接入地域。 
     * @return Region 接入地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 接入地域。
     * @param Region 接入地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 服务提供商，支持的值包括["aliyun", "aws", "others"]。 
     * @return Supplier 服务提供商，支持的值包括["aliyun", "aws", "others"]。
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set 服务提供商，支持的值包括["aliyun", "aws", "others"]。
     * @param Supplier 服务提供商，支持的值包括["aliyun", "aws", "others"]。
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get 实例 Ip。 
     * @return Ip 实例 Ip。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 实例 Ip。
     * @param Ip 实例 Ip。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 实例端口号。 
     * @return Port 实例端口号。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例端口号。
     * @param Port 实例端口号。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 云数据库实例ID，格式如：cdb-qcloudtest。 
     * @return InstanceId 云数据库实例ID，格式如：cdb-qcloudtest。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 云数据库实例ID，格式如：cdb-qcloudtest。
     * @param InstanceId 云数据库实例ID，格式如：cdb-qcloudtest。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CVM 实例ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要填写该字段。 
     * @return CvmInstanceId CVM 实例ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要填写该字段。
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set CVM 实例ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要填写该字段。
     * @param CvmInstanceId CVM 实例ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要填写该字段。
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get 专线网关ID，格式如：dcg-0rxtqqxb。 
     * @return UniqDcgId 专线网关ID，格式如：dcg-0rxtqqxb。
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set 专线网关ID，格式如：dcg-0rxtqqxb。
     * @param UniqDcgId 专线网关ID，格式如：dcg-0rxtqqxb。
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get VPN网关ID，格式如：vpngw-9ghexg7q。 
     * @return UniqVpnGwId VPN网关ID，格式如：vpngw-9ghexg7q。
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set VPN网关ID，格式如：vpngw-9ghexg7q。
     * @param UniqVpnGwId VPN网关ID，格式如：vpngw-9ghexg7q。
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get 私有网络ID，格式如：vpc-92jblxto。 
     * @return VpcId 私有网络ID，格式如：vpc-92jblxto。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，格式如：vpc-92jblxto。
     * @param VpcId 私有网络ID，格式如：vpc-92jblxto。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID，格式如：subnet-3paxmkdz。 
     * @return SubnetId 子网ID，格式如：subnet-3paxmkdz。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID，格式如：subnet-3paxmkdz。
     * @param SubnetId 子网ID，格式如：subnet-3paxmkdz。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 云联网ID，如：ccn-afp6kltc。 
     * @return CcnId 云联网ID，如：ccn-afp6kltc。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID，如：ccn-afp6kltc。
     * @param CcnId 云联网ID，如：ccn-afp6kltc。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 数据库版本，当实例为 RDS 或 AWS 实例时才有效，格式如：5.6或者5.7，默认为5.6。 
     * @return EngineVersion 数据库版本，当实例为 RDS 或 AWS 实例时才有效，格式如：5.6或者5.7，默认为5.6。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 数据库版本，当实例为 RDS 或 AWS 实例时才有效，格式如：5.6或者5.7，默认为5.6。
     * @param EngineVersion 数据库版本，当实例为 RDS 或 AWS 实例时才有效，格式如：5.6或者5.7，默认为5.6。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get mariadb三引擎版本。 
     * @return DBKernel mariadb三引擎版本。
     */
    public String getDBKernel() {
        return this.DBKernel;
    }

    /**
     * Set mariadb三引擎版本。
     * @param DBKernel mariadb三引擎版本。
     */
    public void setDBKernel(String DBKernel) {
        this.DBKernel = DBKernel;
    }

    public BackupEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupEndpoint(BackupEndpoint source) {
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Supplier != null) {
            this.Supplier = new String(source.Supplier);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
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
        if (source.UniqVpnGwId != null) {
            this.UniqVpnGwId = new String(source.UniqVpnGwId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.DBKernel != null) {
            this.DBKernel = new String(source.DBKernel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Supplier", this.Supplier);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "UniqDcgId", this.UniqDcgId);
        this.setParamSimple(map, prefix + "UniqVpnGwId", this.UniqVpnGwId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "DBKernel", this.DBKernel);

    }
}

