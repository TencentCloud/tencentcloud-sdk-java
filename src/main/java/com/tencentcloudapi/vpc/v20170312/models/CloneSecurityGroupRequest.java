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

public class CloneSecurityGroupRequest extends AbstractModel{

    /**
    * 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 安全组名称，可任意命名，但不得超过60个字符。未提供参数时，克隆后的安全组名称和SecurityGroupId对应的安全组名称相同。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 安全组备注，最多100个字符。未提供参数时，克隆后的安全组备注和SecurityGroupId对应的安全组备注相同。
    */
    @SerializedName("GroupDescription")
    @Expose
    private String GroupDescription;

    /**
    * 项目ID，默认0。可在qcloud控制台项目管理页面查询到。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 源Region,跨地域克隆安全组时，需要传入源安全组所属地域信息，例如：克隆广州的安全组到上海，则这里需要传入广州安全的地域信息：ap-guangzhou。
    */
    @SerializedName("RemoteRegion")
    @Expose
    private String RemoteRegion;

    /**
     * Get 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。 
     * @return SecurityGroupId 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     * @param SecurityGroupId 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 安全组名称，可任意命名，但不得超过60个字符。未提供参数时，克隆后的安全组名称和SecurityGroupId对应的安全组名称相同。 
     * @return GroupName 安全组名称，可任意命名，但不得超过60个字符。未提供参数时，克隆后的安全组名称和SecurityGroupId对应的安全组名称相同。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 安全组名称，可任意命名，但不得超过60个字符。未提供参数时，克隆后的安全组名称和SecurityGroupId对应的安全组名称相同。
     * @param GroupName 安全组名称，可任意命名，但不得超过60个字符。未提供参数时，克隆后的安全组名称和SecurityGroupId对应的安全组名称相同。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 安全组备注，最多100个字符。未提供参数时，克隆后的安全组备注和SecurityGroupId对应的安全组备注相同。 
     * @return GroupDescription 安全组备注，最多100个字符。未提供参数时，克隆后的安全组备注和SecurityGroupId对应的安全组备注相同。
     */
    public String getGroupDescription() {
        return this.GroupDescription;
    }

    /**
     * Set 安全组备注，最多100个字符。未提供参数时，克隆后的安全组备注和SecurityGroupId对应的安全组备注相同。
     * @param GroupDescription 安全组备注，最多100个字符。未提供参数时，克隆后的安全组备注和SecurityGroupId对应的安全组备注相同。
     */
    public void setGroupDescription(String GroupDescription) {
        this.GroupDescription = GroupDescription;
    }

    /**
     * Get 项目ID，默认0。可在qcloud控制台项目管理页面查询到。 
     * @return ProjectId 项目ID，默认0。可在qcloud控制台项目管理页面查询到。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，默认0。可在qcloud控制台项目管理页面查询到。
     * @param ProjectId 项目ID，默认0。可在qcloud控制台项目管理页面查询到。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 源Region,跨地域克隆安全组时，需要传入源安全组所属地域信息，例如：克隆广州的安全组到上海，则这里需要传入广州安全的地域信息：ap-guangzhou。 
     * @return RemoteRegion 源Region,跨地域克隆安全组时，需要传入源安全组所属地域信息，例如：克隆广州的安全组到上海，则这里需要传入广州安全的地域信息：ap-guangzhou。
     */
    public String getRemoteRegion() {
        return this.RemoteRegion;
    }

    /**
     * Set 源Region,跨地域克隆安全组时，需要传入源安全组所属地域信息，例如：克隆广州的安全组到上海，则这里需要传入广州安全的地域信息：ap-guangzhou。
     * @param RemoteRegion 源Region,跨地域克隆安全组时，需要传入源安全组所属地域信息，例如：克隆广州的安全组到上海，则这里需要传入广州安全的地域信息：ap-guangzhou。
     */
    public void setRemoteRegion(String RemoteRegion) {
        this.RemoteRegion = RemoteRegion;
    }

    public CloneSecurityGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneSecurityGroupRequest(CloneSecurityGroupRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupDescription != null) {
            this.GroupDescription = new String(source.GroupDescription);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RemoteRegion != null) {
            this.RemoteRegion = new String(source.RemoteRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupDescription", this.GroupDescription);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RemoteRegion", this.RemoteRegion);

    }
}

