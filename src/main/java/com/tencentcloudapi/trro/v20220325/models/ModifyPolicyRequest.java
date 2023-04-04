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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPolicyRequest extends AbstractModel{

    /**
    * 修改权限配置的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 修改权限配置的远端设备ID
    */
    @SerializedName("RemoteDeviceId")
    @Expose
    private String RemoteDeviceId;

    /**
    * 权限修改涉及的现场设备ID数组
    */
    @SerializedName("FieldDeviceIds")
    @Expose
    private String [] FieldDeviceIds;

    /**
    * 修改的目标权限模式，black为黑名单，white为白名单
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
    * 修改模式，add为新增（添加现场设备I关联），remove为删除（解除现场设备关联），set为设置（更新现场设备关联）
    */
    @SerializedName("ModifyMode")
    @Expose
    private String ModifyMode;

    /**
     * Get 修改权限配置的项目ID 
     * @return ProjectId 修改权限配置的项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 修改权限配置的项目ID
     * @param ProjectId 修改权限配置的项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 修改权限配置的远端设备ID 
     * @return RemoteDeviceId 修改权限配置的远端设备ID
     */
    public String getRemoteDeviceId() {
        return this.RemoteDeviceId;
    }

    /**
     * Set 修改权限配置的远端设备ID
     * @param RemoteDeviceId 修改权限配置的远端设备ID
     */
    public void setRemoteDeviceId(String RemoteDeviceId) {
        this.RemoteDeviceId = RemoteDeviceId;
    }

    /**
     * Get 权限修改涉及的现场设备ID数组 
     * @return FieldDeviceIds 权限修改涉及的现场设备ID数组
     */
    public String [] getFieldDeviceIds() {
        return this.FieldDeviceIds;
    }

    /**
     * Set 权限修改涉及的现场设备ID数组
     * @param FieldDeviceIds 权限修改涉及的现场设备ID数组
     */
    public void setFieldDeviceIds(String [] FieldDeviceIds) {
        this.FieldDeviceIds = FieldDeviceIds;
    }

    /**
     * Get 修改的目标权限模式，black为黑名单，white为白名单 
     * @return PolicyMode 修改的目标权限模式，black为黑名单，white为白名单
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set 修改的目标权限模式，black为黑名单，white为白名单
     * @param PolicyMode 修改的目标权限模式，black为黑名单，white为白名单
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    /**
     * Get 修改模式，add为新增（添加现场设备I关联），remove为删除（解除现场设备关联），set为设置（更新现场设备关联） 
     * @return ModifyMode 修改模式，add为新增（添加现场设备I关联），remove为删除（解除现场设备关联），set为设置（更新现场设备关联）
     */
    public String getModifyMode() {
        return this.ModifyMode;
    }

    /**
     * Set 修改模式，add为新增（添加现场设备I关联），remove为删除（解除现场设备关联），set为设置（更新现场设备关联）
     * @param ModifyMode 修改模式，add为新增（添加现场设备I关联），remove为删除（解除现场设备关联），set为设置（更新现场设备关联）
     */
    public void setModifyMode(String ModifyMode) {
        this.ModifyMode = ModifyMode;
    }

    public ModifyPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPolicyRequest(ModifyPolicyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RemoteDeviceId != null) {
            this.RemoteDeviceId = new String(source.RemoteDeviceId);
        }
        if (source.FieldDeviceIds != null) {
            this.FieldDeviceIds = new String[source.FieldDeviceIds.length];
            for (int i = 0; i < source.FieldDeviceIds.length; i++) {
                this.FieldDeviceIds[i] = new String(source.FieldDeviceIds[i]);
            }
        }
        if (source.PolicyMode != null) {
            this.PolicyMode = new String(source.PolicyMode);
        }
        if (source.ModifyMode != null) {
            this.ModifyMode = new String(source.ModifyMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RemoteDeviceId", this.RemoteDeviceId);
        this.setParamArraySimple(map, prefix + "FieldDeviceIds.", this.FieldDeviceIds);
        this.setParamSimple(map, prefix + "PolicyMode", this.PolicyMode);
        this.setParamSimple(map, prefix + "ModifyMode", this.ModifyMode);

    }
}

