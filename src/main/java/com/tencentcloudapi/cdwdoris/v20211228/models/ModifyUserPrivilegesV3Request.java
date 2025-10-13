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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserPrivilegesV3Request extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户权限
    */
    @SerializedName("UserPrivileges")
    @Expose
    private UpdateUserPrivileges UserPrivileges;

    /**
    * 用户链接来自的 IP	
    */
    @SerializedName("WhiteHost")
    @Expose
    private String WhiteHost;

    /**
    * 更新类型，默认0，1为更新绑定计算组，2为更新默认计算组
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * 需绑定计算组列表
    */
    @SerializedName("UpdateComputeGroups")
    @Expose
    private String [] UpdateComputeGroups;

    /**
    * 默认计算组
    */
    @SerializedName("DefaultComputeGroup")
    @Expose
    private String DefaultComputeGroup;

    /**
    * 0: 灵活场景 1: 固定场景
    */
    @SerializedName("ComputeGroupType")
    @Expose
    private Long ComputeGroupType;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户权限 
     * @return UserPrivileges 用户权限
     */
    public UpdateUserPrivileges getUserPrivileges() {
        return this.UserPrivileges;
    }

    /**
     * Set 用户权限
     * @param UserPrivileges 用户权限
     */
    public void setUserPrivileges(UpdateUserPrivileges UserPrivileges) {
        this.UserPrivileges = UserPrivileges;
    }

    /**
     * Get 用户链接来自的 IP	 
     * @return WhiteHost 用户链接来自的 IP	
     */
    public String getWhiteHost() {
        return this.WhiteHost;
    }

    /**
     * Set 用户链接来自的 IP	
     * @param WhiteHost 用户链接来自的 IP	
     */
    public void setWhiteHost(String WhiteHost) {
        this.WhiteHost = WhiteHost;
    }

    /**
     * Get 更新类型，默认0，1为更新绑定计算组，2为更新默认计算组 
     * @return UpdateType 更新类型，默认0，1为更新绑定计算组，2为更新默认计算组
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 更新类型，默认0，1为更新绑定计算组，2为更新默认计算组
     * @param UpdateType 更新类型，默认0，1为更新绑定计算组，2为更新默认计算组
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get 需绑定计算组列表 
     * @return UpdateComputeGroups 需绑定计算组列表
     */
    public String [] getUpdateComputeGroups() {
        return this.UpdateComputeGroups;
    }

    /**
     * Set 需绑定计算组列表
     * @param UpdateComputeGroups 需绑定计算组列表
     */
    public void setUpdateComputeGroups(String [] UpdateComputeGroups) {
        this.UpdateComputeGroups = UpdateComputeGroups;
    }

    /**
     * Get 默认计算组 
     * @return DefaultComputeGroup 默认计算组
     */
    public String getDefaultComputeGroup() {
        return this.DefaultComputeGroup;
    }

    /**
     * Set 默认计算组
     * @param DefaultComputeGroup 默认计算组
     */
    public void setDefaultComputeGroup(String DefaultComputeGroup) {
        this.DefaultComputeGroup = DefaultComputeGroup;
    }

    /**
     * Get 0: 灵活场景 1: 固定场景 
     * @return ComputeGroupType 0: 灵活场景 1: 固定场景
     */
    public Long getComputeGroupType() {
        return this.ComputeGroupType;
    }

    /**
     * Set 0: 灵活场景 1: 固定场景
     * @param ComputeGroupType 0: 灵活场景 1: 固定场景
     */
    public void setComputeGroupType(Long ComputeGroupType) {
        this.ComputeGroupType = ComputeGroupType;
    }

    public ModifyUserPrivilegesV3Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserPrivilegesV3Request(ModifyUserPrivilegesV3Request source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserPrivileges != null) {
            this.UserPrivileges = new UpdateUserPrivileges(source.UserPrivileges);
        }
        if (source.WhiteHost != null) {
            this.WhiteHost = new String(source.WhiteHost);
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.UpdateComputeGroups != null) {
            this.UpdateComputeGroups = new String[source.UpdateComputeGroups.length];
            for (int i = 0; i < source.UpdateComputeGroups.length; i++) {
                this.UpdateComputeGroups[i] = new String(source.UpdateComputeGroups[i]);
            }
        }
        if (source.DefaultComputeGroup != null) {
            this.DefaultComputeGroup = new String(source.DefaultComputeGroup);
        }
        if (source.ComputeGroupType != null) {
            this.ComputeGroupType = new Long(source.ComputeGroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamObj(map, prefix + "UserPrivileges.", this.UserPrivileges);
        this.setParamSimple(map, prefix + "WhiteHost", this.WhiteHost);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamArraySimple(map, prefix + "UpdateComputeGroups.", this.UpdateComputeGroups);
        this.setParamSimple(map, prefix + "DefaultComputeGroup", this.DefaultComputeGroup);
        this.setParamSimple(map, prefix + "ComputeGroupType", this.ComputeGroupType);

    }
}

