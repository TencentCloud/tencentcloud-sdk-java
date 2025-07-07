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

public class AppAsset extends AbstractModel {

    /**
    * 应用资产id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用服务器id
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * 应用服务器账号id
    */
    @SerializedName("DeviceAccountId")
    @Expose
    private Long DeviceAccountId;

    /**
    * 应用资产类型。1-web应用
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 客户端工具路径
    */
    @SerializedName("ClientAppPath")
    @Expose
    private String ClientAppPath;

    /**
    * 客户端工具类型
    */
    @SerializedName("ClientAppKind")
    @Expose
    private String ClientAppKind;

    /**
    * 应用资产url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 托管状态。0-未托管，1-已托管
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * 应用服务器实例id
    */
    @SerializedName("DeviceInstanceId")
    @Expose
    private String DeviceInstanceId;

    /**
    * 应用服务器名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 应用服务器账号名称
    */
    @SerializedName("DeviceAccountName")
    @Expose
    private String DeviceAccountName;

    /**
    * 堡垒机实例id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 堡垒机实例信息
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * 网络域id
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
    * 资产组信息
    */
    @SerializedName("GroupSet")
    @Expose
    private Group [] GroupSet;

    /**
    * 资产所属部门
    */
    @SerializedName("Department")
    @Expose
    private Department Department;

    /**
     * Get 应用资产id 
     * @return Id 应用资产id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 应用资产id
     * @param Id 应用资产id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产名称 
     * @return Name 资产名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资产名称
     * @param Name 资产名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用服务器id 
     * @return DeviceId 应用服务器id
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 应用服务器id
     * @param DeviceId 应用服务器id
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 应用服务器账号id 
     * @return DeviceAccountId 应用服务器账号id
     */
    public Long getDeviceAccountId() {
        return this.DeviceAccountId;
    }

    /**
     * Set 应用服务器账号id
     * @param DeviceAccountId 应用服务器账号id
     */
    public void setDeviceAccountId(Long DeviceAccountId) {
        this.DeviceAccountId = DeviceAccountId;
    }

    /**
     * Get 应用资产类型。1-web应用 
     * @return Kind 应用资产类型。1-web应用
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 应用资产类型。1-web应用
     * @param Kind 应用资产类型。1-web应用
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 客户端工具路径 
     * @return ClientAppPath 客户端工具路径
     */
    public String getClientAppPath() {
        return this.ClientAppPath;
    }

    /**
     * Set 客户端工具路径
     * @param ClientAppPath 客户端工具路径
     */
    public void setClientAppPath(String ClientAppPath) {
        this.ClientAppPath = ClientAppPath;
    }

    /**
     * Get 客户端工具类型 
     * @return ClientAppKind 客户端工具类型
     */
    public String getClientAppKind() {
        return this.ClientAppKind;
    }

    /**
     * Set 客户端工具类型
     * @param ClientAppKind 客户端工具类型
     */
    public void setClientAppKind(String ClientAppKind) {
        this.ClientAppKind = ClientAppKind;
    }

    /**
     * Get 应用资产url 
     * @return Url 应用资产url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 应用资产url
     * @param Url 应用资产url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 托管状态。0-未托管，1-已托管 
     * @return BindStatus 托管状态。0-未托管，1-已托管
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 托管状态。0-未托管，1-已托管
     * @param BindStatus 托管状态。0-未托管，1-已托管
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get 应用服务器实例id 
     * @return DeviceInstanceId 应用服务器实例id
     */
    public String getDeviceInstanceId() {
        return this.DeviceInstanceId;
    }

    /**
     * Set 应用服务器实例id
     * @param DeviceInstanceId 应用服务器实例id
     */
    public void setDeviceInstanceId(String DeviceInstanceId) {
        this.DeviceInstanceId = DeviceInstanceId;
    }

    /**
     * Get 应用服务器名称 
     * @return DeviceName 应用服务器名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 应用服务器名称
     * @param DeviceName 应用服务器名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 应用服务器账号名称 
     * @return DeviceAccountName 应用服务器账号名称
     */
    public String getDeviceAccountName() {
        return this.DeviceAccountName;
    }

    /**
     * Set 应用服务器账号名称
     * @param DeviceAccountName 应用服务器账号名称
     */
    public void setDeviceAccountName(String DeviceAccountName) {
        this.DeviceAccountName = DeviceAccountName;
    }

    /**
     * Get 堡垒机实例id 
     * @return ResourceId 堡垒机实例id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 堡垒机实例id
     * @param ResourceId 堡垒机实例id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 堡垒机实例信息 
     * @return Resource 堡垒机实例信息
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set 堡垒机实例信息
     * @param Resource 堡垒机实例信息
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 网络域id 
     * @return DomainId 网络域id
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 网络域id
     * @param DomainId 网络域id
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
     * Get 资产组信息 
     * @return GroupSet 资产组信息
     */
    public Group [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set 资产组信息
     * @param GroupSet 资产组信息
     */
    public void setGroupSet(Group [] GroupSet) {
        this.GroupSet = GroupSet;
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

    public AppAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppAsset(AppAsset source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new Long(source.DeviceId);
        }
        if (source.DeviceAccountId != null) {
            this.DeviceAccountId = new Long(source.DeviceAccountId);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.ClientAppPath != null) {
            this.ClientAppPath = new String(source.ClientAppPath);
        }
        if (source.ClientAppKind != null) {
            this.ClientAppKind = new String(source.ClientAppKind);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new Long(source.BindStatus);
        }
        if (source.DeviceInstanceId != null) {
            this.DeviceInstanceId = new String(source.DeviceInstanceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceAccountName != null) {
            this.DeviceAccountName = new String(source.DeviceAccountName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Resource != null) {
            this.Resource = new Resource(source.Resource);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.GroupSet != null) {
            this.GroupSet = new Group[source.GroupSet.length];
            for (int i = 0; i < source.GroupSet.length; i++) {
                this.GroupSet[i] = new Group(source.GroupSet[i]);
            }
        }
        if (source.Department != null) {
            this.Department = new Department(source.Department);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceAccountId", this.DeviceAccountId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "ClientAppPath", this.ClientAppPath);
        this.setParamSimple(map, prefix + "ClientAppKind", this.ClientAppKind);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "DeviceInstanceId", this.DeviceInstanceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceAccountName", this.DeviceAccountName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamArrayObj(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamObj(map, prefix + "Department.", this.Department);

    }
}

