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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup extends AbstractModel {

    /**
    * <p>安全组实例ID，例如：sg-ohuuioma。</p>
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * <p>安全组名称，可任意命名，但不得超过60个字符。</p>
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * <p>安全组备注，最多100个字符。</p>
    */
    @SerializedName("SecurityGroupDesc")
    @Expose
    private String SecurityGroupDesc;

    /**
    * <p>项目id，默认0。可在qcloud控制台项目管理页面查询到。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>是否是默认安全组，默认安全组不支持删除。</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * <p>安全组创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>标签键值对。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * <p>安全组更新时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>是否为托管安全组</p>
    */
    @SerializedName("ServiceManaged")
    @Expose
    private Boolean ServiceManaged;

    /**
     * Get <p>安全组实例ID，例如：sg-ohuuioma。</p> 
     * @return SecurityGroupId <p>安全组实例ID，例如：sg-ohuuioma。</p>
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set <p>安全组实例ID，例如：sg-ohuuioma。</p>
     * @param SecurityGroupId <p>安全组实例ID，例如：sg-ohuuioma。</p>
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get <p>安全组名称，可任意命名，但不得超过60个字符。</p> 
     * @return SecurityGroupName <p>安全组名称，可任意命名，但不得超过60个字符。</p>
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set <p>安全组名称，可任意命名，但不得超过60个字符。</p>
     * @param SecurityGroupName <p>安全组名称，可任意命名，但不得超过60个字符。</p>
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get <p>安全组备注，最多100个字符。</p> 
     * @return SecurityGroupDesc <p>安全组备注，最多100个字符。</p>
     */
    public String getSecurityGroupDesc() {
        return this.SecurityGroupDesc;
    }

    /**
     * Set <p>安全组备注，最多100个字符。</p>
     * @param SecurityGroupDesc <p>安全组备注，最多100个字符。</p>
     */
    public void setSecurityGroupDesc(String SecurityGroupDesc) {
        this.SecurityGroupDesc = SecurityGroupDesc;
    }

    /**
     * Get <p>项目id，默认0。可在qcloud控制台项目管理页面查询到。</p> 
     * @return ProjectId <p>项目id，默认0。可在qcloud控制台项目管理页面查询到。</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id，默认0。可在qcloud控制台项目管理页面查询到。</p>
     * @param ProjectId <p>项目id，默认0。可在qcloud控制台项目管理页面查询到。</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>是否是默认安全组，默认安全组不支持删除。</p> 
     * @return IsDefault <p>是否是默认安全组，默认安全组不支持删除。</p>
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否是默认安全组，默认安全组不支持删除。</p>
     * @param IsDefault <p>是否是默认安全组，默认安全组不支持删除。</p>
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>安全组创建时间。</p> 
     * @return CreatedTime <p>安全组创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>安全组创建时间。</p>
     * @param CreatedTime <p>安全组创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>标签键值对。</p> 
     * @return TagSet <p>标签键值对。</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签键值对。</p>
     * @param TagSet <p>标签键值对。</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>安全组更新时间。</p> 
     * @return UpdateTime <p>安全组更新时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>安全组更新时间。</p>
     * @param UpdateTime <p>安全组更新时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>是否为托管安全组</p> 
     * @return ServiceManaged <p>是否为托管安全组</p>
     */
    public Boolean getServiceManaged() {
        return this.ServiceManaged;
    }

    /**
     * Set <p>是否为托管安全组</p>
     * @param ServiceManaged <p>是否为托管安全组</p>
     */
    public void setServiceManaged(Boolean ServiceManaged) {
        this.ServiceManaged = ServiceManaged;
    }

    public SecurityGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroup(SecurityGroup source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupName != null) {
            this.SecurityGroupName = new String(source.SecurityGroupName);
        }
        if (source.SecurityGroupDesc != null) {
            this.SecurityGroupDesc = new String(source.SecurityGroupDesc);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ServiceManaged != null) {
            this.ServiceManaged = new Boolean(source.ServiceManaged);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupDesc", this.SecurityGroupDesc);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ServiceManaged", this.ServiceManaged);

    }
}

