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
    * <p>应用资产id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>资产名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>应用服务器id</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * <p>应用服务器账号id</p>
    */
    @SerializedName("DeviceAccountId")
    @Expose
    private Long DeviceAccountId;

    /**
    * <p>应用资产类型。1-web应用</p>
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * <p>客户端工具路径</p>
    */
    @SerializedName("ClientAppPath")
    @Expose
    private String ClientAppPath;

    /**
    * <p>客户端工具类型</p>
    */
    @SerializedName("ClientAppKind")
    @Expose
    private String ClientAppKind;

    /**
    * <p>应用资产url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>托管状态</p><p>枚举值：</p><ul><li>0： 未托管</li><li>1： 已托管</li></ul>
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * <p>应用服务器实例id</p>
    */
    @SerializedName("DeviceInstanceId")
    @Expose
    private String DeviceInstanceId;

    /**
    * <p>应用服务器名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>应用服务器账号名称</p>
    */
    @SerializedName("DeviceAccountName")
    @Expose
    private String DeviceAccountName;

    /**
    * <p>堡垒机实例id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>堡垒机实例信息</p>
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * <p>网络域id</p>
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
    * <p>资产组信息</p>
    */
    @SerializedName("GroupSet")
    @Expose
    private Group [] GroupSet;

    /**
    * <p>资产所属部门</p>
    */
    @SerializedName("Department")
    @Expose
    private Department Department;

    /**
    * <p>账号数量</p>
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * <p>代填类型</p><p>枚举值：</p><ul><li>0： 不支持代填</li><li>1： 元素定位代填</li></ul>
    */
    @SerializedName("AgentInputType")
    @Expose
    private Long AgentInputType;

    /**
    * <p>是否自动提交</p><p>枚举值：</p><ul><li>0： 不自动提交</li><li>1： 自动提交</li></ul>
    */
    @SerializedName("AgentInputSubmit")
    @Expose
    private Long AgentInputSubmit;

    /**
    * <p>用户名输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
    */
    @SerializedName("UserNameType")
    @Expose
    private String UserNameType;

    /**
    * <p>用户名输入框选择器属性</p>
    */
    @SerializedName("UserNameValue")
    @Expose
    private String UserNameValue;

    /**
    * <p>密码输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
    */
    @SerializedName("PasswordType")
    @Expose
    private String PasswordType;

    /**
    * <p>密码输入框选择器属性</p>
    */
    @SerializedName("PasswordValue")
    @Expose
    private String PasswordValue;

    /**
    * <p>提交按钮选择器类型，为空表示不支持自动提交</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
    */
    @SerializedName("SubmitType")
    @Expose
    private String SubmitType;

    /**
    * <p>提交按钮选择器属性值</p>
    */
    @SerializedName("SubmitValue")
    @Expose
    private String SubmitValue;

    /**
     * Get <p>应用资产id</p> 
     * @return Id <p>应用资产id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>应用资产id</p>
     * @param Id <p>应用资产id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>资产名称</p> 
     * @return Name <p>资产名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>资产名称</p>
     * @param Name <p>资产名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>应用服务器id</p> 
     * @return DeviceId <p>应用服务器id</p>
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>应用服务器id</p>
     * @param DeviceId <p>应用服务器id</p>
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>应用服务器账号id</p> 
     * @return DeviceAccountId <p>应用服务器账号id</p>
     */
    public Long getDeviceAccountId() {
        return this.DeviceAccountId;
    }

    /**
     * Set <p>应用服务器账号id</p>
     * @param DeviceAccountId <p>应用服务器账号id</p>
     */
    public void setDeviceAccountId(Long DeviceAccountId) {
        this.DeviceAccountId = DeviceAccountId;
    }

    /**
     * Get <p>应用资产类型。1-web应用</p> 
     * @return Kind <p>应用资产类型。1-web应用</p>
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set <p>应用资产类型。1-web应用</p>
     * @param Kind <p>应用资产类型。1-web应用</p>
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>客户端工具路径</p> 
     * @return ClientAppPath <p>客户端工具路径</p>
     */
    public String getClientAppPath() {
        return this.ClientAppPath;
    }

    /**
     * Set <p>客户端工具路径</p>
     * @param ClientAppPath <p>客户端工具路径</p>
     */
    public void setClientAppPath(String ClientAppPath) {
        this.ClientAppPath = ClientAppPath;
    }

    /**
     * Get <p>客户端工具类型</p> 
     * @return ClientAppKind <p>客户端工具类型</p>
     */
    public String getClientAppKind() {
        return this.ClientAppKind;
    }

    /**
     * Set <p>客户端工具类型</p>
     * @param ClientAppKind <p>客户端工具类型</p>
     */
    public void setClientAppKind(String ClientAppKind) {
        this.ClientAppKind = ClientAppKind;
    }

    /**
     * Get <p>应用资产url</p> 
     * @return Url <p>应用资产url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>应用资产url</p>
     * @param Url <p>应用资产url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>托管状态</p><p>枚举值：</p><ul><li>0： 未托管</li><li>1： 已托管</li></ul> 
     * @return BindStatus <p>托管状态</p><p>枚举值：</p><ul><li>0： 未托管</li><li>1： 已托管</li></ul>
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set <p>托管状态</p><p>枚举值：</p><ul><li>0： 未托管</li><li>1： 已托管</li></ul>
     * @param BindStatus <p>托管状态</p><p>枚举值：</p><ul><li>0： 未托管</li><li>1： 已托管</li></ul>
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get <p>应用服务器实例id</p> 
     * @return DeviceInstanceId <p>应用服务器实例id</p>
     */
    public String getDeviceInstanceId() {
        return this.DeviceInstanceId;
    }

    /**
     * Set <p>应用服务器实例id</p>
     * @param DeviceInstanceId <p>应用服务器实例id</p>
     */
    public void setDeviceInstanceId(String DeviceInstanceId) {
        this.DeviceInstanceId = DeviceInstanceId;
    }

    /**
     * Get <p>应用服务器名称</p> 
     * @return DeviceName <p>应用服务器名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>应用服务器名称</p>
     * @param DeviceName <p>应用服务器名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>应用服务器账号名称</p> 
     * @return DeviceAccountName <p>应用服务器账号名称</p>
     */
    public String getDeviceAccountName() {
        return this.DeviceAccountName;
    }

    /**
     * Set <p>应用服务器账号名称</p>
     * @param DeviceAccountName <p>应用服务器账号名称</p>
     */
    public void setDeviceAccountName(String DeviceAccountName) {
        this.DeviceAccountName = DeviceAccountName;
    }

    /**
     * Get <p>堡垒机实例id</p> 
     * @return ResourceId <p>堡垒机实例id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>堡垒机实例id</p>
     * @param ResourceId <p>堡垒机实例id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>堡垒机实例信息</p> 
     * @return Resource <p>堡垒机实例信息</p>
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set <p>堡垒机实例信息</p>
     * @param Resource <p>堡垒机实例信息</p>
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>网络域id</p> 
     * @return DomainId <p>网络域id</p>
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>网络域id</p>
     * @param DomainId <p>网络域id</p>
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
     * Get <p>资产组信息</p> 
     * @return GroupSet <p>资产组信息</p>
     */
    public Group [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set <p>资产组信息</p>
     * @param GroupSet <p>资产组信息</p>
     */
    public void setGroupSet(Group [] GroupSet) {
        this.GroupSet = GroupSet;
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
     * Get <p>账号数量</p> 
     * @return AccountCount <p>账号数量</p>
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set <p>账号数量</p>
     * @param AccountCount <p>账号数量</p>
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get <p>代填类型</p><p>枚举值：</p><ul><li>0： 不支持代填</li><li>1： 元素定位代填</li></ul> 
     * @return AgentInputType <p>代填类型</p><p>枚举值：</p><ul><li>0： 不支持代填</li><li>1： 元素定位代填</li></ul>
     */
    public Long getAgentInputType() {
        return this.AgentInputType;
    }

    /**
     * Set <p>代填类型</p><p>枚举值：</p><ul><li>0： 不支持代填</li><li>1： 元素定位代填</li></ul>
     * @param AgentInputType <p>代填类型</p><p>枚举值：</p><ul><li>0： 不支持代填</li><li>1： 元素定位代填</li></ul>
     */
    public void setAgentInputType(Long AgentInputType) {
        this.AgentInputType = AgentInputType;
    }

    /**
     * Get <p>是否自动提交</p><p>枚举值：</p><ul><li>0： 不自动提交</li><li>1： 自动提交</li></ul> 
     * @return AgentInputSubmit <p>是否自动提交</p><p>枚举值：</p><ul><li>0： 不自动提交</li><li>1： 自动提交</li></ul>
     */
    public Long getAgentInputSubmit() {
        return this.AgentInputSubmit;
    }

    /**
     * Set <p>是否自动提交</p><p>枚举值：</p><ul><li>0： 不自动提交</li><li>1： 自动提交</li></ul>
     * @param AgentInputSubmit <p>是否自动提交</p><p>枚举值：</p><ul><li>0： 不自动提交</li><li>1： 自动提交</li></ul>
     */
    public void setAgentInputSubmit(Long AgentInputSubmit) {
        this.AgentInputSubmit = AgentInputSubmit;
    }

    /**
     * Get <p>用户名输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul> 
     * @return UserNameType <p>用户名输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
     */
    public String getUserNameType() {
        return this.UserNameType;
    }

    /**
     * Set <p>用户名输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
     * @param UserNameType <p>用户名输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
     */
    public void setUserNameType(String UserNameType) {
        this.UserNameType = UserNameType;
    }

    /**
     * Get <p>用户名输入框选择器属性</p> 
     * @return UserNameValue <p>用户名输入框选择器属性</p>
     */
    public String getUserNameValue() {
        return this.UserNameValue;
    }

    /**
     * Set <p>用户名输入框选择器属性</p>
     * @param UserNameValue <p>用户名输入框选择器属性</p>
     */
    public void setUserNameValue(String UserNameValue) {
        this.UserNameValue = UserNameValue;
    }

    /**
     * Get <p>密码输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul> 
     * @return PasswordType <p>密码输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
     */
    public String getPasswordType() {
        return this.PasswordType;
    }

    /**
     * Set <p>密码输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
     * @param PasswordType <p>密码输入框选择器类型</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
     */
    public void setPasswordType(String PasswordType) {
        this.PasswordType = PasswordType;
    }

    /**
     * Get <p>密码输入框选择器属性</p> 
     * @return PasswordValue <p>密码输入框选择器属性</p>
     */
    public String getPasswordValue() {
        return this.PasswordValue;
    }

    /**
     * Set <p>密码输入框选择器属性</p>
     * @param PasswordValue <p>密码输入框选择器属性</p>
     */
    public void setPasswordValue(String PasswordValue) {
        this.PasswordValue = PasswordValue;
    }

    /**
     * Get <p>提交按钮选择器类型，为空表示不支持自动提交</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul> 
     * @return SubmitType <p>提交按钮选择器类型，为空表示不支持自动提交</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
     */
    public String getSubmitType() {
        return this.SubmitType;
    }

    /**
     * Set <p>提交按钮选择器类型，为空表示不支持自动提交</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
     * @param SubmitType <p>提交按钮选择器类型，为空表示不支持自动提交</p><p>枚举值：</p><ul><li>id： html标签id属性</li><li>name： html标签name属性</li><li>selector： css选择器</li><li>xpath： xpath</li></ul>
     */
    public void setSubmitType(String SubmitType) {
        this.SubmitType = SubmitType;
    }

    /**
     * Get <p>提交按钮选择器属性值</p> 
     * @return SubmitValue <p>提交按钮选择器属性值</p>
     */
    public String getSubmitValue() {
        return this.SubmitValue;
    }

    /**
     * Set <p>提交按钮选择器属性值</p>
     * @param SubmitValue <p>提交按钮选择器属性值</p>
     */
    public void setSubmitValue(String SubmitValue) {
        this.SubmitValue = SubmitValue;
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
        if (source.AccountCount != null) {
            this.AccountCount = new Long(source.AccountCount);
        }
        if (source.AgentInputType != null) {
            this.AgentInputType = new Long(source.AgentInputType);
        }
        if (source.AgentInputSubmit != null) {
            this.AgentInputSubmit = new Long(source.AgentInputSubmit);
        }
        if (source.UserNameType != null) {
            this.UserNameType = new String(source.UserNameType);
        }
        if (source.UserNameValue != null) {
            this.UserNameValue = new String(source.UserNameValue);
        }
        if (source.PasswordType != null) {
            this.PasswordType = new String(source.PasswordType);
        }
        if (source.PasswordValue != null) {
            this.PasswordValue = new String(source.PasswordValue);
        }
        if (source.SubmitType != null) {
            this.SubmitType = new String(source.SubmitType);
        }
        if (source.SubmitValue != null) {
            this.SubmitValue = new String(source.SubmitValue);
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
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "AgentInputType", this.AgentInputType);
        this.setParamSimple(map, prefix + "AgentInputSubmit", this.AgentInputSubmit);
        this.setParamSimple(map, prefix + "UserNameType", this.UserNameType);
        this.setParamSimple(map, prefix + "UserNameValue", this.UserNameValue);
        this.setParamSimple(map, prefix + "PasswordType", this.PasswordType);
        this.setParamSimple(map, prefix + "PasswordValue", this.PasswordValue);
        this.setParamSimple(map, prefix + "SubmitType", this.SubmitType);
        this.setParamSimple(map, prefix + "SubmitValue", this.SubmitValue);

    }
}

