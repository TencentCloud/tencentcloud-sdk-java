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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleBasicInfo extends AbstractModel {

    /**
    * <p>角色ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>角色名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>角色描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>显示名称</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>角色类型</p>
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * <p>角色来源，参考 web_enum_standard.proto -&gt; RoleSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>继承来源的用户组名称列表，Source=1 时为空</p>
    */
    @SerializedName("GroupNames")
    @Expose
    private String [] GroupNames;

    /**
     * Get <p>角色ID</p> 
     * @return Id <p>角色ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>角色ID</p>
     * @param Id <p>角色ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>角色名称</p> 
     * @return Name <p>角色名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>角色名称</p>
     * @param Name <p>角色名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>角色描述</p> 
     * @return Description <p>角色描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>角色描述</p>
     * @param Description <p>角色描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>显示名称</p> 
     * @return DisplayName <p>显示名称</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>显示名称</p>
     * @param DisplayName <p>显示名称</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>角色类型</p> 
     * @return RoleType <p>角色类型</p>
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set <p>角色类型</p>
     * @param RoleType <p>角色类型</p>
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get <p>角色来源，参考 web_enum_standard.proto -&gt; RoleSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有</p> 
     * @return Source <p>角色来源，参考 web_enum_standard.proto -&gt; RoleSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>角色来源，参考 web_enum_standard.proto -&gt; RoleSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有</p>
     * @param Source <p>角色来源，参考 web_enum_standard.proto -&gt; RoleSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>继承来源的用户组名称列表，Source=1 时为空</p> 
     * @return GroupNames <p>继承来源的用户组名称列表，Source=1 时为空</p>
     */
    public String [] getGroupNames() {
        return this.GroupNames;
    }

    /**
     * Set <p>继承来源的用户组名称列表，Source=1 时为空</p>
     * @param GroupNames <p>继承来源的用户组名称列表，Source=1 时为空</p>
     */
    public void setGroupNames(String [] GroupNames) {
        this.GroupNames = GroupNames;
    }

    public RoleBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleBasicInfo(RoleBasicInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.GroupNames != null) {
            this.GroupNames = new String[source.GroupNames.length];
            for (int i = 0; i < source.GroupNames.length; i++) {
                this.GroupNames[i] = new String(source.GroupNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "GroupNames.", this.GroupNames);

    }
}

