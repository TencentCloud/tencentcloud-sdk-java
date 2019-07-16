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

public class DetachRolePolicyRequest  extends AbstractModel{

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 角色ID，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
    */
    @SerializedName("DetachRoleId")
    @Expose
    private String DetachRoleId;

    /**
    * 角色名称，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
    */
    @SerializedName("DetachRoleName")
    @Expose
    private String DetachRoleName;

    /**
     * 获取策略ID
     * @return PolicyId 策略ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * 设置策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * 获取角色ID，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
     * @return DetachRoleId 角色ID，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
     */
    public String getDetachRoleId() {
        return this.DetachRoleId;
    }

    /**
     * 设置角色ID，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
     * @param DetachRoleId 角色ID，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
     */
    public void setDetachRoleId(String DetachRoleId) {
        this.DetachRoleId = DetachRoleId;
    }

    /**
     * 获取角色名称，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
     * @return DetachRoleName 角色名称，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
     */
    public String getDetachRoleName() {
        return this.DetachRoleName;
    }

    /**
     * 设置角色名称，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
     * @param DetachRoleName 角色名称，用于指定角色，入参 AttachRoleId 与 AttachRoleName 二选一
     */
    public void setDetachRoleName(String DetachRoleName) {
        this.DetachRoleName = DetachRoleName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "DetachRoleId", this.DetachRoleId);
        this.setParamSimple(map, prefix + "DetachRoleName", this.DetachRoleName);

    }
}

