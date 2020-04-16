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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGroupRequest extends AbstractModel{

    /**
    * 部署组所属的应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 部署组所属命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 部署组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 部署组描述
    */
    @SerializedName("GroupDesc")
    @Expose
    private String GroupDesc;

    /**
    * 部署组资源类型
    */
    @SerializedName("GroupResourceType")
    @Expose
    private String GroupResourceType;

    /**
     * Get 部署组所属的应用ID 
     * @return ApplicationId 部署组所属的应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 部署组所属的应用ID
     * @param ApplicationId 部署组所属的应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 部署组所属命名空间ID 
     * @return NamespaceId 部署组所属命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 部署组所属命名空间ID
     * @param NamespaceId 部署组所属命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 部署组名称 
     * @return GroupName 部署组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 部署组名称
     * @param GroupName 部署组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 部署组描述 
     * @return GroupDesc 部署组描述
     */
    public String getGroupDesc() {
        return this.GroupDesc;
    }

    /**
     * Set 部署组描述
     * @param GroupDesc 部署组描述
     */
    public void setGroupDesc(String GroupDesc) {
        this.GroupDesc = GroupDesc;
    }

    /**
     * Get 部署组资源类型 
     * @return GroupResourceType 部署组资源类型
     */
    public String getGroupResourceType() {
        return this.GroupResourceType;
    }

    /**
     * Set 部署组资源类型
     * @param GroupResourceType 部署组资源类型
     */
    public void setGroupResourceType(String GroupResourceType) {
        this.GroupResourceType = GroupResourceType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupDesc", this.GroupDesc);
        this.setParamSimple(map, prefix + "GroupResourceType", this.GroupResourceType);

    }
}

