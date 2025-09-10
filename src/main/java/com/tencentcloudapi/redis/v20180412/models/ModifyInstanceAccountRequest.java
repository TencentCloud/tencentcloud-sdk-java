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
    * 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指定需修改的账号。
- root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。
- 自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 指定所修改账号访问的密码。
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * 账号描述信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 指定所修改账号读写请求路由的策略。
- master：表示读写请求路由至主节点。
- replication：表示读写请求路由至从节点。
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * 指定所修改账号的读写权限。
- r：只读。
- w：只写。
- rw：读写。
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * 指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。
- true：默认账号（root）设置为免密账号。
- false：默认账号（root）不设置为免密账号。
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * 指定所修改的账号是否加密密码
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
     * Get 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指定需修改的账号。
- root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。
- 自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。 
     * @return AccountName 指定需修改的账号。
- root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。
- 自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 指定需修改的账号。
- root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。
- 自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。
     * @param AccountName 指定需修改的账号。
- root：指在创建 Redis 数据库实例时自动生成的账号。用户无法修改其读写权限，仅可修改其请求路由策略。
- 自定义的账号：用户在实例创建成功后手动创建的账号。用户可以随时修改其读写权限与请求路由策略。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 指定所修改账号访问的密码。 
     * @return AccountPassword 指定所修改账号访问的密码。
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set 指定所修改账号访问的密码。
     * @param AccountPassword 指定所修改账号访问的密码。
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get 账号描述信息 
     * @return Remark 账号描述信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 账号描述信息
     * @param Remark 账号描述信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 指定所修改账号读写请求路由的策略。
- master：表示读写请求路由至主节点。
- replication：表示读写请求路由至从节点。 
     * @return ReadonlyPolicy 指定所修改账号读写请求路由的策略。
- master：表示读写请求路由至主节点。
- replication：表示读写请求路由至从节点。
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set 指定所修改账号读写请求路由的策略。
- master：表示读写请求路由至主节点。
- replication：表示读写请求路由至从节点。
     * @param ReadonlyPolicy 指定所修改账号读写请求路由的策略。
- master：表示读写请求路由至主节点。
- replication：表示读写请求路由至从节点。
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get 指定所修改账号的读写权限。
- r：只读。
- w：只写。
- rw：读写。 
     * @return Privilege 指定所修改账号的读写权限。
- r：只读。
- w：只写。
- rw：读写。
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 指定所修改账号的读写权限。
- r：只读。
- w：只写。
- rw：读写。
     * @param Privilege 指定所修改账号的读写权限。
- r：只读。
- w：只写。
- rw：读写。
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。
- true：默认账号（root）设置为免密账号。
- false：默认账号（root）不设置为免密账号。 
     * @return NoAuth 指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。
- true：默认账号（root）设置为免密账号。
- false：默认账号（root）不设置为免密账号。
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set 指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。
- true：默认账号（root）设置为免密账号。
- false：默认账号（root）不设置为免密账号。
     * @param NoAuth 指定是否将默认账号（root）设置为免密账号。自定义账号不支持免密访问。
- true：默认账号（root）设置为免密账号。
- false：默认账号（root）不设置为免密账号。
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get 指定所修改的账号是否加密密码 
     * @return EncryptPassword 指定所修改的账号是否加密密码
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set 指定所修改的账号是否加密密码
     * @param EncryptPassword 指定所修改的账号是否加密密码
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

