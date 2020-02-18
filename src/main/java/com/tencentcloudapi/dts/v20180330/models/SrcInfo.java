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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SrcInfo extends AbstractModel{

    /**
    * 阿里云AccessKey。源库是阿里云RDS5.6适用
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 实例的IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 实例的端口
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
    * 阿里云RDS实例ID。源库是阿里云RDS5.6/5.6适用
    */
    @SerializedName("RdsInstanceId")
    @Expose
    private String RdsInstanceId;

    /**
    * CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * 专线网关ID，格式如：dcg-0rxtqqxb
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * 私有网络ID，格式如：vpc-92jblxto
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络下的子网ID，格式如：subnet-3paxmkdz
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPN网关ID，格式如：vpngw-9ghexg7q
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * 数据库实例ID，格式如：cdb-powiqx8q
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 地域英文名，如：ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 当实例为RDS实例时，填写为aliyun, 其他情况均填写others
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * 云联网ID，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 数据库版本，当实例为RDS实例时才有效，格式如：5.6或者5.7，默认为5.6
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
     * Get 阿里云AccessKey。源库是阿里云RDS5.6适用 
     * @return AccessKey 阿里云AccessKey。源库是阿里云RDS5.6适用
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 阿里云AccessKey。源库是阿里云RDS5.6适用
     * @param AccessKey 阿里云AccessKey。源库是阿里云RDS5.6适用
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 实例的IP地址 
     * @return Ip 实例的IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 实例的IP地址
     * @param Ip 实例的IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 实例的端口 
     * @return Port 实例的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例的端口
     * @param Port 实例的端口
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
     * Get 阿里云RDS实例ID。源库是阿里云RDS5.6/5.6适用 
     * @return RdsInstanceId 阿里云RDS实例ID。源库是阿里云RDS5.6/5.6适用
     */
    public String getRdsInstanceId() {
        return this.RdsInstanceId;
    }

    /**
     * Set 阿里云RDS实例ID。源库是阿里云RDS5.6/5.6适用
     * @param RdsInstanceId 阿里云RDS实例ID。源库是阿里云RDS5.6/5.6适用
     */
    public void setRdsInstanceId(String RdsInstanceId) {
        this.RdsInstanceId = RdsInstanceId;
    }

    /**
     * Get CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段 
     * @return CvmInstanceId CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段
     * @param CvmInstanceId CVM实例短ID，格式如：ins-olgl39y8，与云服务器控制台页面显示的实例ID相同。如果是CVM自建实例，需要传递此字段
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get 专线网关ID，格式如：dcg-0rxtqqxb 
     * @return UniqDcgId 专线网关ID，格式如：dcg-0rxtqqxb
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set 专线网关ID，格式如：dcg-0rxtqqxb
     * @param UniqDcgId 专线网关ID，格式如：dcg-0rxtqqxb
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get 私有网络ID，格式如：vpc-92jblxto 
     * @return VpcId 私有网络ID，格式如：vpc-92jblxto
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，格式如：vpc-92jblxto
     * @param VpcId 私有网络ID，格式如：vpc-92jblxto
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络下的子网ID，格式如：subnet-3paxmkdz 
     * @return SubnetId 私有网络下的子网ID，格式如：subnet-3paxmkdz
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络下的子网ID，格式如：subnet-3paxmkdz
     * @param SubnetId 私有网络下的子网ID，格式如：subnet-3paxmkdz
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPN网关ID，格式如：vpngw-9ghexg7q 
     * @return UniqVpnGwId VPN网关ID，格式如：vpngw-9ghexg7q
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set VPN网关ID，格式如：vpngw-9ghexg7q
     * @param UniqVpnGwId VPN网关ID，格式如：vpngw-9ghexg7q
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get 数据库实例ID，格式如：cdb-powiqx8q 
     * @return InstanceId 数据库实例ID，格式如：cdb-powiqx8q
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库实例ID，格式如：cdb-powiqx8q
     * @param InstanceId 数据库实例ID，格式如：cdb-powiqx8q
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 地域英文名，如：ap-guangzhou 
     * @return Region 地域英文名，如：ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域英文名，如：ap-guangzhou
     * @param Region 地域英文名，如：ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 当实例为RDS实例时，填写为aliyun, 其他情况均填写others 
     * @return Supplier 当实例为RDS实例时，填写为aliyun, 其他情况均填写others
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set 当实例为RDS实例时，填写为aliyun, 其他情况均填写others
     * @param Supplier 当实例为RDS实例时，填写为aliyun, 其他情况均填写others
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get 云联网ID，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnId 云联网ID，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnId 云联网ID，如：ccn-afp6kltc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "RdsInstanceId", this.RdsInstanceId);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "UniqDcgId", this.UniqDcgId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "UniqVpnGwId", this.UniqVpnGwId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Supplier", this.Supplier);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);

    }
}

