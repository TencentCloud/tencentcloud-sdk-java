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

public class UpdateAssumeRolePolicyRequest extends AbstractModel{

    /**
    * 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * 角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo 
     * @return PolicyDocument 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
     * @param PolicyDocument 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get 角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一 
     * @return RoleId 角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一
     * @param RoleId 角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一 
     * @return RoleName 角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一
     * @param RoleName 角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

