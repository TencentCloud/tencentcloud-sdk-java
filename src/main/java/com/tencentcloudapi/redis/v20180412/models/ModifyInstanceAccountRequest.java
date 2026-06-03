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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAccountRequest extends AbstractModel {

    /**
    * <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>指定需修改的账号。</p><ul><li>root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。</li><li>自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。</li></ul>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>指定所修改账号访问的密码。</p>
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * <p>账号描述信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>指定所修改账号读写请求路由的策略。</p><ul><li>master：表示读写请求路由至主节点。</li><li>replication：表示读写请求路由至从节点。</li></ul>
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * <p>指定所修改账号的读写权限。</p><ul><li>r：只读。</li><li>w：只写。</li><li>rw：读写。</li></ul>
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * <p>指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。</p><ul><li>true：默认账号（root）设置为免密账号。</li><li>false：默认账号（root）不设置为免密账号。</li></ul>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul>
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
     * Get <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>指定需修改的账号。</p><ul><li>root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。</li><li>自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。</li></ul> 
     * @return AccountName <p>指定需修改的账号。</p><ul><li>root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。</li><li>自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。</li></ul>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>指定需修改的账号。</p><ul><li>root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。</li><li>自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。</li></ul>
     * @param AccountName <p>指定需修改的账号。</p><ul><li>root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。</li><li>自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。</li></ul>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>指定所修改账号访问的密码。</p> 
     * @return AccountPassword <p>指定所修改账号访问的密码。</p>
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set <p>指定所修改账号访问的密码。</p>
     * @param AccountPassword <p>指定所修改账号访问的密码。</p>
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get <p>账号描述信息</p> 
     * @return Remark <p>账号描述信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>账号描述信息</p>
     * @param Remark <p>账号描述信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>指定所修改账号读写请求路由的策略。</p><ul><li>master：表示读写请求路由至主节点。</li><li>replication：表示读写请求路由至从节点。</li></ul> 
     * @return ReadonlyPolicy <p>指定所修改账号读写请求路由的策略。</p><ul><li>master：表示读写请求路由至主节点。</li><li>replication：表示读写请求路由至从节点。</li></ul>
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set <p>指定所修改账号读写请求路由的策略。</p><ul><li>master：表示读写请求路由至主节点。</li><li>replication：表示读写请求路由至从节点。</li></ul>
     * @param ReadonlyPolicy <p>指定所修改账号读写请求路由的策略。</p><ul><li>master：表示读写请求路由至主节点。</li><li>replication：表示读写请求路由至从节点。</li></ul>
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get <p>指定所修改账号的读写权限。</p><ul><li>r：只读。</li><li>w：只写。</li><li>rw：读写。</li></ul> 
     * @return Privilege <p>指定所修改账号的读写权限。</p><ul><li>r：只读。</li><li>w：只写。</li><li>rw：读写。</li></ul>
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>指定所修改账号的读写权限。</p><ul><li>r：只读。</li><li>w：只写。</li><li>rw：读写。</li></ul>
     * @param Privilege <p>指定所修改账号的读写权限。</p><ul><li>r：只读。</li><li>w：只写。</li><li>rw：读写。</li></ul>
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get <p>指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。</p><ul><li>true：默认账号（root）设置为免密账号。</li><li>false：默认账号（root）不设置为免密账号。</li></ul> 
     * @return NoAuth <p>指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。</p><ul><li>true：默认账号（root）设置为免密账号。</li><li>false：默认账号（root）不设置为免密账号。</li></ul>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。</p><ul><li>true：默认账号（root）设置为免密账号。</li><li>false：默认账号（root）不设置为免密账号。</li></ul>
     * @param NoAuth <p>指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。</p><ul><li>true：默认账号（root）设置为免密账号。</li><li>false：默认账号（root）不设置为免密账号。</li></ul>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul> 
     * @return EncryptPassword <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul>
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul>
     * @param EncryptPassword <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul>
     */
    public void setEncryptPassword(Boolean EncryptPassword) {
        this.EncryptPassword = EncryptPassword;
    }

    public ModifyInstanceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAccountRequest(ModifyInstanceAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ReadonlyPolicy != null) {
            this.ReadonlyPolicy = new String[source.ReadonlyPolicy.length];
            for (int i = 0; i < source.ReadonlyPolicy.length; i++) {
                this.ReadonlyPolicy[i] = new String(source.ReadonlyPolicy[i]);
            }
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.EncryptPassword != null) {
            this.EncryptPassword = new Boolean(source.EncryptPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);

    }
}

