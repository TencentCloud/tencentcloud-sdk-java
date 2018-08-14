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

public class SrcInfo  extends AbstractModel{

    /**
    * 阿里云AccessKey
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
    private Integer Port;

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
    * 阿里云rds实例id
    */
    @SerializedName("RdsInstanceId")
    @Expose
    private String RdsInstanceId;

    /**
    * CVM实例短ID，格式如：ins-olgl89y8，与云主机控制台页面显示的实例ID相同，如果是CVM自建实例或者通过自建VPN接入的公网实例，需要传递此字段
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * 专线网关ID
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * 私有网络ID，和原来的数字vpcId对应，需要调vpc的接口去转换
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络下的子网ID, 和原来的数字子网ID对应，需要调用vpc的接口去转换
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 系统分配的VPN网关ID
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * 实例短Id
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
    * 服务提供商，如:aliyun,others
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
     * 获取阿里云AccessKey
     * @return AccessKey 阿里云AccessKey
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * 设置阿里云AccessKey
     * @param AccessKey 阿里云AccessKey
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * 获取实例的IP地址
     * @return Ip 实例的IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置实例的IP地址
     * @param Ip 实例的IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取实例的端口
     * @return Port 实例的端口
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置实例的端口
     * @param Port 实例的端口
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取实例的用户名
     * @return User 实例的用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * 设置实例的用户名
     * @param User 实例的用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * 获取实例的密码
     * @return Password 实例的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置实例的密码
     * @param Password 实例的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取阿里云rds实例id
     * @return RdsInstanceId 阿里云rds实例id
     */
    public String getRdsInstanceId() {
        return this.RdsInstanceId;
    }

    /**
     * 设置阿里云rds实例id
     * @param RdsInstanceId 阿里云rds实例id
     */
    public void setRdsInstanceId(String RdsInstanceId) {
        this.RdsInstanceId = RdsInstanceId;
    }

    /**
     * 获取CVM实例短ID，格式如：ins-olgl89y8，与云主机控制台页面显示的实例ID相同，如果是CVM自建实例或者通过自建VPN接入的公网实例，需要传递此字段
     * @return CvmInstanceId CVM实例短ID，格式如：ins-olgl89y8，与云主机控制台页面显示的实例ID相同，如果是CVM自建实例或者通过自建VPN接入的公网实例，需要传递此字段
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * 设置CVM实例短ID，格式如：ins-olgl89y8，与云主机控制台页面显示的实例ID相同，如果是CVM自建实例或者通过自建VPN接入的公网实例，需要传递此字段
     * @param CvmInstanceId CVM实例短ID，格式如：ins-olgl89y8，与云主机控制台页面显示的实例ID相同，如果是CVM自建实例或者通过自建VPN接入的公网实例，需要传递此字段
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * 获取专线网关ID
     * @return UniqDcgId 专线网关ID
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * 设置专线网关ID
     * @param UniqDcgId 专线网关ID
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * 获取私有网络ID，和原来的数字vpcId对应，需要调vpc的接口去转换
     * @return VpcId 私有网络ID，和原来的数字vpcId对应，需要调vpc的接口去转换
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID，和原来的数字vpcId对应，需要调vpc的接口去转换
     * @param VpcId 私有网络ID，和原来的数字vpcId对应，需要调vpc的接口去转换
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络下的子网ID, 和原来的数字子网ID对应，需要调用vpc的接口去转换
     * @return SubnetId 私有网络下的子网ID, 和原来的数字子网ID对应，需要调用vpc的接口去转换
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络下的子网ID, 和原来的数字子网ID对应，需要调用vpc的接口去转换
     * @param SubnetId 私有网络下的子网ID, 和原来的数字子网ID对应，需要调用vpc的接口去转换
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取系统分配的VPN网关ID
     * @return UniqVpnGwId 系统分配的VPN网关ID
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * 设置系统分配的VPN网关ID
     * @param UniqVpnGwId 系统分配的VPN网关ID
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * 获取实例短Id
     * @return InstanceId 实例短Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例短Id
     * @param InstanceId 实例短Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取地域英文名，如：ap-guangzhou
     * @return Region 地域英文名，如：ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域英文名，如：ap-guangzhou
     * @param Region 地域英文名，如：ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取服务提供商，如:aliyun,others
     * @return Supplier 服务提供商，如:aliyun,others
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * 设置服务提供商，如:aliyun,others
     * @param Supplier 服务提供商，如:aliyun,others
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

