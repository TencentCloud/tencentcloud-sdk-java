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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListPoliciesGrantingServiceAccessRequest extends AbstractModel{

    /**
    * 子账号uin，与RoleId、GroupId三选一必传
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * 角色ID，与TargetUin、GroupId三选一必传
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * 用户组ID，与TargetUin、RoleId三选一必传
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 服务名，查看服务授权接口详情时需传该字段
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
     * Get 子账号uin，与RoleId、GroupId三选一必传 
     * @return TargetUin 子账号uin，与RoleId、GroupId三选一必传
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 子账号uin，与RoleId、GroupId三选一必传
     * @param TargetUin 子账号uin，与RoleId、GroupId三选一必传
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get 角色ID，与TargetUin、GroupId三选一必传 
     * @return RoleId 角色ID，与TargetUin、GroupId三选一必传
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色ID，与TargetUin、GroupId三选一必传
     * @param RoleId 角色ID，与TargetUin、GroupId三选一必传
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 用户组ID，与TargetUin、RoleId三选一必传 
     * @return GroupId 用户组ID，与TargetUin、RoleId三选一必传
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 用户组ID，与TargetUin、RoleId三选一必传
     * @param GroupId 用户组ID，与TargetUin、RoleId三选一必传
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 服务名，查看服务授权接口详情时需传该字段 
     * @return ServiceType 服务名，查看服务授权接口详情时需传该字段
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务名，查看服务授权接口详情时需传该字段
     * @param ServiceType 服务名，查看服务授权接口详情时需传该字段
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    public ListPoliciesGrantingServiceAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPoliciesGrantingServiceAccessRequest(ListPoliciesGrantingServiceAccessRequest source) {
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

