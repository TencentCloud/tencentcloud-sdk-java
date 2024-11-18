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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel {

    /**
    * 资产ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 实例ID，对应CVM、CDB等实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 地域编码
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * 操作系统名称
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 管理端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 所属资产组列表
    */
    @SerializedName("GroupSet")
    @Expose
    private Group [] GroupSet;

    /**
    * 资产绑定的账号数
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 堡垒机服务信息，注意没有绑定服务时为null
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * 资产所属部门
    */
    @SerializedName("Department")
    @Expose
    private Department Department;

    /**
    * 数据库资产的多节点
    */
    @SerializedName("IpPortSet")
    @Expose
    private String [] IpPortSet;

    /**
    * 网络域Id
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 网络域名称
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否启用SSL，仅支持Redis资产。0：禁用 1：启用
    */
    @SerializedName("EnableSSL")
    @Expose
    private Long EnableSSL;

    /**
    * 已上传的SSL证书名称
    */
    @SerializedName("SSLCertName")
    @Expose
    private String SSLCertName;

    /**
     * Get 资产ID 
     * @return Id 资产ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 资产ID
     * @param Id 资产ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 实例ID，对应CVM、CDB等实例ID 
     * @return InstanceId 实例ID，对应CVM、CDB等实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，对应CVM、CDB等实例ID
     * @param InstanceId 实例ID，对应CVM、CDB等实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产名 
     * @return Name 资产名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资产名
     * @param Name 资产名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 公网IP 
     * @return PublicIp 公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
     * @param PublicIp 公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网IP 
     * @return PrivateIp 内网IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网IP
     * @param PrivateIp 内网IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 地域编码 
     * @return ApCode 地域编码
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set 地域编码
     * @param ApCode 地域编码
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get 操作系统名称 
     * @return OsName 操作系统名称
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称
     * @param OsName 操作系统名称
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer 
     * @return Kind 资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer
     * @param Kind 资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 管理端口 
     * @return Port 管理端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 管理端口
     * @param Port 管理端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 所属资产组列表 
     * @return GroupSet 所属资产组列表
     */
    public Group [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set 所属资产组列表
     * @param GroupSet 所属资产组列表
     */
    public void setGroupSet(Group [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get 资产绑定的账号数 
     * @return AccountCount 资产绑定的账号数
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set 资产绑定的账号数
     * @param AccountCount 资产绑定的账号数
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 堡垒机服务信息，注意没有绑定服务时为null 
     * @return Resource 堡垒机服务信息，注意没有绑定服务时为null
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set 堡垒机服务信息，注意没有绑定服务时为null
     * @param Resource 堡垒机服务信息，注意没有绑定服务时为null
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 资产所属部门 
     * @return Department 资产所属部门
     */
    public Department getDepartment() {
        return this.Department;
    }

    /**
     * Set 资产所属部门
     * @param Department 资产所属部门
     */
    public void setDepartment(Department Department) {
        this.Department = Department;
    }

    /**
     * Get 数据库资产的多节点 
     * @return IpPortSet 数据库资产的多节点
     */
    public String [] getIpPortSet() {
        return this.IpPortSet;
    }

    /**
     * Set 数据库资产的多节点
     * @param IpPortSet 数据库资产的多节点
     */
    public void setIpPortSet(String [] IpPortSet) {
        this.IpPortSet = IpPortSet;
    }

    /**
     * Get 网络域Id 
     * @return DomainId 网络域Id
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 网络域Id
     * @param DomainId 网络域Id
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 网络域名称 
     * @return DomainName 网络域名称
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 网络域名称
     * @param DomainName 网络域名称
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 是否启用SSL，仅支持Redis资产。0：禁用 1：启用 
     * @return EnableSSL 是否启用SSL，仅支持Redis资产。0：禁用 1：启用
     */
    public Long getEnableSSL() {
        return this.EnableSSL;
    }

    /**
     * Set 是否启用SSL，仅支持Redis资产。0：禁用 1：启用
     * @param EnableSSL 是否启用SSL，仅支持Redis资产。0：禁用 1：启用
     */
    public void setEnableSSL(Long EnableSSL) {
        this.EnableSSL = EnableSSL;
    }

    /**
     * Get 已上传的SSL证书名称 
     * @return SSLCertName 已上传的SSL证书名称
     */
    public String getSSLCertName() {
        return this.SSLCertName;
    }

    /**
     * Set 已上传的SSL证书名称
     * @param SSLCertName 已上传的SSL证书名称
     */
    public void setSSLCertName(String SSLCertName) {
        this.SSLCertName = SSLCertName;
    }

    public Device() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Device(Device source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.ApCode != null) {
            this.ApCode = new String(source.ApCode);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.GroupSet != null) {
            this.GroupSet = new Group[source.GroupSet.length];
            for (int i = 0; i < source.GroupSet.length; i++) {
                this.GroupSet[i] = new Group(source.GroupSet[i]);
            }
        }
        if (source.AccountCount != null) {
            this.AccountCount = new Long(source.AccountCount);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Resource != null) {
            this.Resource = new Resource(source.Resource);
        }
        if (source.Department != null) {
            this.Department = new Department(source.Department);
        }
        if (source.IpPortSet != null) {
            this.IpPortSet = new String[source.IpPortSet.length];
            for (int i = 0; i < source.IpPortSet.length; i++) {
                this.IpPortSet[i] = new String(source.IpPortSet[i]);
            }
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.EnableSSL != null) {
            this.EnableSSL = new Long(source.EnableSSL);
        }
        if (source.SSLCertName != null) {
            this.SSLCertName = new String(source.SSLCertName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "ApCode", this.ApCode);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamObj(map, prefix + "Department.", this.Department);
        this.setParamArraySimple(map, prefix + "IpPortSet.", this.IpPortSet);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "EnableSSL", this.EnableSSL);
        this.setParamSimple(map, prefix + "SSLCertName", this.SSLCertName);

    }
}

