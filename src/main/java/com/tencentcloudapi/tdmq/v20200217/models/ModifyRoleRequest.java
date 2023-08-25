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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoleRequest extends AbstractModel{

    /**
    * 角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 必填字段，集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 备注说明，长度必须大等于0且小等于128。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 批量绑定名字空间信息
    */
    @SerializedName("EnvironmentRoleSets")
    @Expose
    private EnvironmentRoleSet [] EnvironmentRoleSets;

    /**
    * 全部解绑名字空间，设置为 true
    */
    @SerializedName("UnbindAllEnvironment")
    @Expose
    private Boolean UnbindAllEnvironment;

    /**
     * Get 角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。 
     * @return RoleName 角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。
     * @param RoleName 角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 必填字段，集群Id 
     * @return ClusterId 必填字段，集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 必填字段，集群Id
     * @param ClusterId 必填字段，集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 备注说明，长度必须大等于0且小等于128。 
     * @return Remark 备注说明，长度必须大等于0且小等于128。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注说明，长度必须大等于0且小等于128。
     * @param Remark 备注说明，长度必须大等于0且小等于128。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 批量绑定名字空间信息 
     * @return EnvironmentRoleSets 批量绑定名字空间信息
     */
    public EnvironmentRoleSet [] getEnvironmentRoleSets() {
        return this.EnvironmentRoleSets;
    }

    /**
     * Set 批量绑定名字空间信息
     * @param EnvironmentRoleSets 批量绑定名字空间信息
     */
    public void setEnvironmentRoleSets(EnvironmentRoleSet [] EnvironmentRoleSets) {
        this.EnvironmentRoleSets = EnvironmentRoleSets;
    }

    /**
     * Get 全部解绑名字空间，设置为 true 
     * @return UnbindAllEnvironment 全部解绑名字空间，设置为 true
     */
    public Boolean getUnbindAllEnvironment() {
        return this.UnbindAllEnvironment;
    }

    /**
     * Set 全部解绑名字空间，设置为 true
     * @param UnbindAllEnvironment 全部解绑名字空间，设置为 true
     */
    public void setUnbindAllEnvironment(Boolean UnbindAllEnvironment) {
        this.UnbindAllEnvironment = UnbindAllEnvironment;
    }

    public ModifyRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoleRequest(ModifyRoleRequest source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EnvironmentRoleSets != null) {
            this.EnvironmentRoleSets = new EnvironmentRoleSet[source.EnvironmentRoleSets.length];
            for (int i = 0; i < source.EnvironmentRoleSets.length; i++) {
                this.EnvironmentRoleSets[i] = new EnvironmentRoleSet(source.EnvironmentRoleSets[i]);
            }
        }
        if (source.UnbindAllEnvironment != null) {
            this.UnbindAllEnvironment = new Boolean(source.UnbindAllEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "EnvironmentRoleSets.", this.EnvironmentRoleSets);
        this.setParamSimple(map, prefix + "UnbindAllEnvironment", this.UnbindAllEnvironment);

    }
}

