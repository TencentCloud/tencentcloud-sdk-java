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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup  extends AbstractModel{

    /**
    * 安全组实例ID，例如：sg-ohuuioma。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 安全组名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * 安全组备注，最多100个字符。
    */
    @SerializedName("SecurityGroupDesc")
    @Expose
    private String SecurityGroupDesc;

    /**
    * 项目id，默认0。可在qcloud控制台项目管理页面查询到。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否是默认安全组，默认安全组不支持删除。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 安全组创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * 获取安全组实例ID，例如：sg-ohuuioma。
     * @return SecurityGroupId 安全组实例ID，例如：sg-ohuuioma。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置安全组实例ID，例如：sg-ohuuioma。
     * @param SecurityGroupId 安全组实例ID，例如：sg-ohuuioma。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * 获取安全组名称，可任意命名，但不得超过60个字符。
     * @return SecurityGroupName 安全组名称，可任意命名，但不得超过60个字符。
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * 设置安全组名称，可任意命名，但不得超过60个字符。
     * @param SecurityGroupName 安全组名称，可任意命名，但不得超过60个字符。
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * 获取安全组备注，最多100个字符。
     * @return SecurityGroupDesc 安全组备注，最多100个字符。
     */
    public String getSecurityGroupDesc() {
        return this.SecurityGroupDesc;
    }

    /**
     * 设置安全组备注，最多100个字符。
     * @param SecurityGroupDesc 安全组备注，最多100个字符。
     */
    public void setSecurityGroupDesc(String SecurityGroupDesc) {
        this.SecurityGroupDesc = SecurityGroupDesc;
    }

    /**
     * 获取项目id，默认0。可在qcloud控制台项目管理页面查询到。
     * @return ProjectId 项目id，默认0。可在qcloud控制台项目管理页面查询到。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目id，默认0。可在qcloud控制台项目管理页面查询到。
     * @param ProjectId 项目id，默认0。可在qcloud控制台项目管理页面查询到。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取是否是默认安全组，默认安全组不支持删除。
     * @return IsDefault 是否是默认安全组，默认安全组不支持删除。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * 设置是否是默认安全组，默认安全组不支持删除。
     * @param IsDefault 是否是默认安全组，默认安全组不支持删除。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * 获取安全组创建时间。
     * @return CreatedTime 安全组创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置安全组创建时间。
     * @param CreatedTime 安全组创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupDesc", this.SecurityGroupDesc);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

