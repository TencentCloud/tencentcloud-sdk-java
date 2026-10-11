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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel {

    /**
    * <p>资产ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>实例ID，对应CVM、CDB等实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>资产名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>公网IP</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>地域编码</p>
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * <p>地域名称</p>
    */
    @SerializedName("ApName")
    @Expose
    private String ApName;

    /**
    * <p>操作系统名称</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * <p>管理端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>所属资产组列表</p>
    */
    @SerializedName("GroupSet")
    @Expose
    private Group [] GroupSet;

    /**
    * <p>资产绑定的账号数</p>
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>堡垒机服务信息，注意没有绑定服务时为null</p>
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * <p>资产所属部门</p>
    */
    @SerializedName("Department")
    @Expose
    private Department Department;

    /**
    * <p>数据库资产的多节点</p>
    */
    @SerializedName("IpPortSet")
    @Expose
    private String [] IpPortSet;

    /**
    * <p>网络域Id</p>
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * <p>网络域名称</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>是否启用SSL，仅支持Redis资产。0：禁用 1：启用</p>
    */
    @SerializedName("EnableSSL")
    @Expose
    private Long EnableSSL;

    /**
    * <p>已上传的SSL证书名称</p>
    */
    @SerializedName("SSLCertName")
    @Expose
    private String SSLCertName;

    /**
    * <p>IOA侧的资源ID</p>
    */
    @SerializedName("IOAId")
    @Expose
    private Long IOAId;

    /**
    * <p>K8S集群托管维度。1-集群，2-命名空间，3-工作负载</p>
    */
    @SerializedName("ManageDimension")
    @Expose
    private Long ManageDimension;

    /**
    * <p>K8S集群托管账号id</p>
    */
    @SerializedName("ManageAccountId")
    @Expose
    private Long ManageAccountId;

    /**
    * <p>K8S集群命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>K8S集群工作负载</p>
    */
    @SerializedName("Workload")
    @Expose
    private String Workload;

    /**
    * <p>K8S集群pod已同步数量</p>
    */
    @SerializedName("SyncPodCount")
    @Expose
    private Long SyncPodCount;

    /**
    * <p>K8S集群pod总数量</p>
    */
    @SerializedName("TotalPodCount")
    @Expose
    private Long TotalPodCount;

    /**
    * <p>云账号id</p>
    */
    @SerializedName("CloudAccountId")
    @Expose
    private Long CloudAccountId;

    /**
    * <p>云账号名称</p>
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * <p>云厂商类型1-腾讯云，2-阿里云</p>
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
    * <p>云厂商名称</p>
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p>
    */
    @SerializedName("SyncCloudDeviceStatus")
    @Expose
    private Long SyncCloudDeviceStatus;

    /**
     * Get <p>资产ID</p> 
     * @return Id <p>资产ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>资产ID</p>
     * @param Id <p>资产ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>实例ID，对应CVM、CDB等实例ID</p> 
     * @return InstanceId <p>实例ID，对应CVM、CDB等实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID，对应CVM、CDB等实例ID</p>
     * @param InstanceId <p>实例ID，对应CVM、CDB等实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>资产名</p> 
     * @return Name <p>资产名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>资产名</p>
     * @param Name <p>资产名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>公网IP</p> 
     * @return PublicIp <p>公网IP</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网IP</p>
     * @param PublicIp <p>公网IP</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>内网IP</p> 
     * @return PrivateIp <p>内网IP</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>内网IP</p>
     * @param PrivateIp <p>内网IP</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>地域编码</p> 
     * @return ApCode <p>地域编码</p>
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set <p>地域编码</p>
     * @param ApCode <p>地域编码</p>
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get <p>地域名称</p> 
     * @return ApName <p>地域名称</p>
     */
    public String getApName() {
        return this.ApName;
    }

    /**
     * Set <p>地域名称</p>
     * @param ApName <p>地域名称</p>
     */
    public void setApName(String ApName) {
        this.ApName = ApName;
    }

    /**
     * Get <p>操作系统名称</p> 
     * @return OsName <p>操作系统名称</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>操作系统名称</p>
     * @param OsName <p>操作系统名称</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p> 
     * @return Kind <p>资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set <p>资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
     * @param Kind <p>资产类型 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>管理端口</p> 
     * @return Port <p>管理端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>管理端口</p>
     * @param Port <p>管理端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>所属资产组列表</p> 
     * @return GroupSet <p>所属资产组列表</p>
     */
    public Group [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set <p>所属资产组列表</p>
     * @param GroupSet <p>所属资产组列表</p>
     */
    public void setGroupSet(Group [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get <p>资产绑定的账号数</p> 
     * @return AccountCount <p>资产绑定的账号数</p>
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set <p>资产绑定的账号数</p>
     * @param AccountCount <p>资产绑定的账号数</p>
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>堡垒机服务信息，注意没有绑定服务时为null</p> 
     * @return Resource <p>堡垒机服务信息，注意没有绑定服务时为null</p>
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set <p>堡垒机服务信息，注意没有绑定服务时为null</p>
     * @param Resource <p>堡垒机服务信息，注意没有绑定服务时为null</p>
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>资产所属部门</p> 
     * @return Department <p>资产所属部门</p>
     */
    public Department getDepartment() {
        return this.Department;
    }

    /**
     * Set <p>资产所属部门</p>
     * @param Department <p>资产所属部门</p>
     */
    public void setDepartment(Department Department) {
        this.Department = Department;
    }

    /**
     * Get <p>数据库资产的多节点</p> 
     * @return IpPortSet <p>数据库资产的多节点</p>
     */
    public String [] getIpPortSet() {
        return this.IpPortSet;
    }

    /**
     * Set <p>数据库资产的多节点</p>
     * @param IpPortSet <p>数据库资产的多节点</p>
     */
    public void setIpPortSet(String [] IpPortSet) {
        this.IpPortSet = IpPortSet;
    }

    /**
     * Get <p>网络域Id</p> 
     * @return DomainId <p>网络域Id</p>
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>网络域Id</p>
     * @param DomainId <p>网络域Id</p>
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>网络域名称</p> 
     * @return DomainName <p>网络域名称</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>网络域名称</p>
     * @param DomainName <p>网络域名称</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>是否启用SSL，仅支持Redis资产。0：禁用 1：启用</p> 
     * @return EnableSSL <p>是否启用SSL，仅支持Redis资产。0：禁用 1：启用</p>
     */
    public Long getEnableSSL() {
        return this.EnableSSL;
    }

    /**
     * Set <p>是否启用SSL，仅支持Redis资产。0：禁用 1：启用</p>
     * @param EnableSSL <p>是否启用SSL，仅支持Redis资产。0：禁用 1：启用</p>
     */
    public void setEnableSSL(Long EnableSSL) {
        this.EnableSSL = EnableSSL;
    }

    /**
     * Get <p>已上传的SSL证书名称</p> 
     * @return SSLCertName <p>已上传的SSL证书名称</p>
     */
    public String getSSLCertName() {
        return this.SSLCertName;
    }

    /**
     * Set <p>已上传的SSL证书名称</p>
     * @param SSLCertName <p>已上传的SSL证书名称</p>
     */
    public void setSSLCertName(String SSLCertName) {
        this.SSLCertName = SSLCertName;
    }

    /**
     * Get <p>IOA侧的资源ID</p> 
     * @return IOAId <p>IOA侧的资源ID</p>
     */
    public Long getIOAId() {
        return this.IOAId;
    }

    /**
     * Set <p>IOA侧的资源ID</p>
     * @param IOAId <p>IOA侧的资源ID</p>
     */
    public void setIOAId(Long IOAId) {
        this.IOAId = IOAId;
    }

    /**
     * Get <p>K8S集群托管维度。1-集群，2-命名空间，3-工作负载</p> 
     * @return ManageDimension <p>K8S集群托管维度。1-集群，2-命名空间，3-工作负载</p>
     */
    public Long getManageDimension() {
        return this.ManageDimension;
    }

    /**
     * Set <p>K8S集群托管维度。1-集群，2-命名空间，3-工作负载</p>
     * @param ManageDimension <p>K8S集群托管维度。1-集群，2-命名空间，3-工作负载</p>
     */
    public void setManageDimension(Long ManageDimension) {
        this.ManageDimension = ManageDimension;
    }

    /**
     * Get <p>K8S集群托管账号id</p> 
     * @return ManageAccountId <p>K8S集群托管账号id</p>
     */
    public Long getManageAccountId() {
        return this.ManageAccountId;
    }

    /**
     * Set <p>K8S集群托管账号id</p>
     * @param ManageAccountId <p>K8S集群托管账号id</p>
     */
    public void setManageAccountId(Long ManageAccountId) {
        this.ManageAccountId = ManageAccountId;
    }

    /**
     * Get <p>K8S集群命名空间</p> 
     * @return Namespace <p>K8S集群命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>K8S集群命名空间</p>
     * @param Namespace <p>K8S集群命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>K8S集群工作负载</p> 
     * @return Workload <p>K8S集群工作负载</p>
     */
    public String getWorkload() {
        return this.Workload;
    }

    /**
     * Set <p>K8S集群工作负载</p>
     * @param Workload <p>K8S集群工作负载</p>
     */
    public void setWorkload(String Workload) {
        this.Workload = Workload;
    }

    /**
     * Get <p>K8S集群pod已同步数量</p> 
     * @return SyncPodCount <p>K8S集群pod已同步数量</p>
     */
    public Long getSyncPodCount() {
        return this.SyncPodCount;
    }

    /**
     * Set <p>K8S集群pod已同步数量</p>
     * @param SyncPodCount <p>K8S集群pod已同步数量</p>
     */
    public void setSyncPodCount(Long SyncPodCount) {
        this.SyncPodCount = SyncPodCount;
    }

    /**
     * Get <p>K8S集群pod总数量</p> 
     * @return TotalPodCount <p>K8S集群pod总数量</p>
     */
    public Long getTotalPodCount() {
        return this.TotalPodCount;
    }

    /**
     * Set <p>K8S集群pod总数量</p>
     * @param TotalPodCount <p>K8S集群pod总数量</p>
     */
    public void setTotalPodCount(Long TotalPodCount) {
        this.TotalPodCount = TotalPodCount;
    }

    /**
     * Get <p>云账号id</p> 
     * @return CloudAccountId <p>云账号id</p>
     */
    public Long getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set <p>云账号id</p>
     * @param CloudAccountId <p>云账号id</p>
     */
    public void setCloudAccountId(Long CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
    }

    /**
     * Get <p>云账号名称</p> 
     * @return CloudAccountName <p>云账号名称</p>
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set <p>云账号名称</p>
     * @param CloudAccountName <p>云账号名称</p>
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get <p>云厂商类型1-腾讯云，2-阿里云</p> 
     * @return ProviderType <p>云厂商类型1-腾讯云，2-阿里云</p>
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set <p>云厂商类型1-腾讯云，2-阿里云</p>
     * @param ProviderType <p>云厂商类型1-腾讯云，2-阿里云</p>
     */
    public void setProviderType(Long ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get <p>云厂商名称</p> 
     * @return ProviderName <p>云厂商名称</p>
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set <p>云厂商名称</p>
     * @param ProviderName <p>云厂商名称</p>
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p> 
     * @return SyncCloudDeviceStatus <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p>
     */
    public Long getSyncCloudDeviceStatus() {
        return this.SyncCloudDeviceStatus;
    }

    /**
     * Set <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p>
     * @param SyncCloudDeviceStatus <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p>
     */
    public void setSyncCloudDeviceStatus(Long SyncCloudDeviceStatus) {
        this.SyncCloudDeviceStatus = SyncCloudDeviceStatus;
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
        if (source.ApName != null) {
            this.ApName = new String(source.ApName);
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
        if (source.IOAId != null) {
            this.IOAId = new Long(source.IOAId);
        }
        if (source.ManageDimension != null) {
            this.ManageDimension = new Long(source.ManageDimension);
        }
        if (source.ManageAccountId != null) {
            this.ManageAccountId = new Long(source.ManageAccountId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Workload != null) {
            this.Workload = new String(source.Workload);
        }
        if (source.SyncPodCount != null) {
            this.SyncPodCount = new Long(source.SyncPodCount);
        }
        if (source.TotalPodCount != null) {
            this.TotalPodCount = new Long(source.TotalPodCount);
        }
        if (source.CloudAccountId != null) {
            this.CloudAccountId = new Long(source.CloudAccountId);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.ProviderType != null) {
            this.ProviderType = new Long(source.ProviderType);
        }
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.SyncCloudDeviceStatus != null) {
            this.SyncCloudDeviceStatus = new Long(source.SyncCloudDeviceStatus);
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
        this.setParamSimple(map, prefix + "ApName", this.ApName);
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
        this.setParamSimple(map, prefix + "IOAId", this.IOAId);
        this.setParamSimple(map, prefix + "ManageDimension", this.ManageDimension);
        this.setParamSimple(map, prefix + "ManageAccountId", this.ManageAccountId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Workload", this.Workload);
        this.setParamSimple(map, prefix + "SyncPodCount", this.SyncPodCount);
        this.setParamSimple(map, prefix + "TotalPodCount", this.TotalPodCount);
        this.setParamSimple(map, prefix + "CloudAccountId", this.CloudAccountId);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "SyncCloudDeviceStatus", this.SyncCloudDeviceStatus);

    }
}

