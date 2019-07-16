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

public class RoleInfo  extends AbstractModel{

    /**
    * 角色ID
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色名称
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 角色的策略文档
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * 角色描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 角色的创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 角色的最近一次时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 角色是否允许登录
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
     * 获取角色ID
     * @return RoleId 角色ID
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * 设置角色ID
     * @param RoleId 角色ID
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * 获取角色名称
     * @return RoleName 角色名称
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * 设置角色名称
     * @param RoleName 角色名称
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * 获取角色的策略文档
     * @return PolicyDocument 角色的策略文档
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * 设置角色的策略文档
     * @param PolicyDocument 角色的策略文档
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * 获取角色描述
     * @return Description 角色描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置角色描述
     * @param Description 角色描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取角色的创建时间
     * @return AddTime 角色的创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * 设置角色的创建时间
     * @param AddTime 角色的创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * 获取角色的最近一次时间
     * @return UpdateTime 角色的最近一次时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置角色的最近一次时间
     * @param UpdateTime 角色的最近一次时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取角色是否允许登录
     * @return ConsoleLogin 角色是否允许登录
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * 设置角色是否允许登录
     * @param ConsoleLogin 角色是否允许登录
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);

    }
}

