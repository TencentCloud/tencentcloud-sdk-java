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
    * <p>集群id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>用户权限</p>
    */
    @SerializedName("UserPrivileges")
    @Expose
    private UpdateUserPrivileges UserPrivileges;

    /**
    * <p>用户链接来自的 IP</p>
    */
    @SerializedName("WhiteHost")
    @Expose
    private String WhiteHost;

    /**
    * <p>更新类型，默认0，1为更新绑定计算组，2为更新默认计算组，4 为 GrantPrivileges, RevokePrivileges 接口专用批量授权</p><p>枚举值：</p><ul><li>0： 默认</li><li>1： 更新绑定计算组</li><li>2： 更新默认计算组</li><li>4： GrantPrivileges, RevokePrivileges 接口专用批量授权</li></ul>
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * <p>需绑定计算组列表</p>
    */
    @SerializedName("UpdateComputeGroups")
    @Expose
    private String [] UpdateComputeGroups;

    /**
    * <p>默认计算组</p>
    */
    @SerializedName("DefaultComputeGroup")
    @Expose
    private String DefaultComputeGroup;

    /**
    * <p>0: 灵活场景 1: 固定场景</p>
    */
    @SerializedName("ComputeGroupType")
    @Expose
    private Long ComputeGroupType;

    /**
    * <p>本次新增授权的库表，仅 UpdateType=4 时生效</p>
    */
    @SerializedName("GrantPrivileges")
    @Expose
    private UpdateUserPrivileges GrantPrivileges;

    /**
    * <p>本次取消授权的库表，仅 UpdateType=4 时生效</p>
    */
    @SerializedName("RevokePrivileges")
    @Expose
    private UpdateUserPrivileges RevokePrivileges;

    /**
     * Get <p>集群id</p> 
     * @return InstanceId <p>集群id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群id</p>
     * @param InstanceId <p>集群id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>用户权限</p> 
     * @return UserPrivileges <p>用户权限</p>
     */
    public UpdateUserPrivileges getUserPrivileges() {
        return this.UserPrivileges;
    }

    /**
     * Set <p>用户权限</p>
     * @param UserPrivileges <p>用户权限</p>
     */
    public void setUserPrivileges(UpdateUserPrivileges UserPrivileges) {
        this.UserPrivileges = UserPrivileges;
    }

    /**
     * Get <p>用户链接来自的 IP</p> 
     * @return WhiteHost <p>用户链接来自的 IP</p>
     */
    public String getWhiteHost() {
        return this.WhiteHost;
    }

    /**
     * Set <p>用户链接来自的 IP</p>
     * @param WhiteHost <p>用户链接来自的 IP</p>
     */
    public void setWhiteHost(String WhiteHost) {
        this.WhiteHost = WhiteHost;
    }

    /**
     * Get <p>更新类型，默认0，1为更新绑定计算组，2为更新默认计算组，4 为 GrantPrivileges, RevokePrivileges 接口专用批量授权</p><p>枚举值：</p><ul><li>0： 默认</li><li>1： 更新绑定计算组</li><li>2： 更新默认计算组</li><li>4： GrantPrivileges, RevokePrivileges 接口专用批量授权</li></ul> 
     * @return UpdateType <p>更新类型，默认0，1为更新绑定计算组，2为更新默认计算组，4 为 GrantPrivileges, RevokePrivileges 接口专用批量授权</p><p>枚举值：</p><ul><li>0： 默认</li><li>1： 更新绑定计算组</li><li>2： 更新默认计算组</li><li>4： GrantPrivileges, RevokePrivileges 接口专用批量授权</li></ul>
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set <p>更新类型，默认0，1为更新绑定计算组，2为更新默认计算组，4 为 GrantPrivileges, RevokePrivileges 接口专用批量授权</p><p>枚举值：</p><ul><li>0： 默认</li><li>1： 更新绑定计算组</li><li>2： 更新默认计算组</li><li>4： GrantPrivileges, RevokePrivileges 接口专用批量授权</li></ul>
     * @param UpdateType <p>更新类型，默认0，1为更新绑定计算组，2为更新默认计算组，4 为 GrantPrivileges, RevokePrivileges 接口专用批量授权</p><p>枚举值：</p><ul><li>0： 默认</li><li>1： 更新绑定计算组</li><li>2： 更新默认计算组</li><li>4： GrantPrivileges, RevokePrivileges 接口专用批量授权</li></ul>
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get <p>需绑定计算组列表</p> 
     * @return UpdateComputeGroups <p>需绑定计算组列表</p>
     */
    public String [] getUpdateComputeGroups() {
        return this.UpdateComputeGroups;
    }

    /**
     * Set <p>需绑定计算组列表</p>
     * @param UpdateComputeGroups <p>需绑定计算组列表</p>
     */
    public void setUpdateComputeGroups(String [] UpdateComputeGroups) {
        this.UpdateComputeGroups = UpdateComputeGroups;
    }

    /**
     * Get <p>默认计算组</p> 
     * @return DefaultComputeGroup <p>默认计算组</p>
     */
    public String getDefaultComputeGroup() {
        return this.DefaultComputeGroup;
    }

    /**
     * Set <p>默认计算组</p>
     * @param DefaultComputeGroup <p>默认计算组</p>
     */
    public void setDefaultComputeGroup(String DefaultComputeGroup) {
        this.DefaultComputeGroup = DefaultComputeGroup;
    }

    /**
     * Get <p>0: 灵活场景 1: 固定场景</p> 
     * @return ComputeGroupType <p>0: 灵活场景 1: 固定场景</p>
     */
    public Long getComputeGroupType() {
        return this.ComputeGroupType;
    }

    /**
     * Set <p>0: 灵活场景 1: 固定场景</p>
     * @param ComputeGroupType <p>0: 灵活场景 1: 固定场景</p>
     */
    public void setComputeGroupType(Long ComputeGroupType) {
        this.ComputeGroupType = ComputeGroupType;
    }

    /**
     * Get <p>本次新增授权的库表，仅 UpdateType=4 时生效</p> 
     * @return GrantPrivileges <p>本次新增授权的库表，仅 UpdateType=4 时生效</p>
     */
    public UpdateUserPrivileges getGrantPrivileges() {
        return this.GrantPrivileges;
    }

    /**
     * Set <p>本次新增授权的库表，仅 UpdateType=4 时生效</p>
     * @param GrantPrivileges <p>本次新增授权的库表，仅 UpdateType=4 时生效</p>
     */
    public void setGrantPrivileges(UpdateUserPrivileges GrantPrivileges) {
        this.GrantPrivileges = GrantPrivileges;
    }

    /**
     * Get <p>本次取消授权的库表，仅 UpdateType=4 时生效</p> 
     * @return RevokePrivileges <p>本次取消授权的库表，仅 UpdateType=4 时生效</p>
     */
    public UpdateUserPrivileges getRevokePrivileges() {
        return this.RevokePrivileges;
    }

    /**
     * Set <p>本次取消授权的库表，仅 UpdateType=4 时生效</p>
     * @param RevokePrivileges <p>本次取消授权的库表，仅 UpdateType=4 时生效</p>
     */
    public void setRevokePrivileges(UpdateUserPrivileges RevokePrivileges) {
        this.RevokePrivileges = RevokePrivileges;
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
        if (source.GrantPrivileges != null) {
            this.GrantPrivileges = new UpdateUserPrivileges(source.GrantPrivileges);
        }
        if (source.RevokePrivileges != null) {
            this.RevokePrivileges = new UpdateUserPrivileges(source.RevokePrivileges);
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
        this.setParamObj(map, prefix + "GrantPrivileges.", this.GrantPrivileges);
        this.setParamObj(map, prefix + "RevokePrivileges.", this.RevokePrivileges);

    }
}

