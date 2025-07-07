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
    * 子账号名称，如果要修改主账号，填 root。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 子账号密码。
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * 子账号描述信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 账号读写路由策略。
- master：表示主节点。
- replication：表示从节点。
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * 子账号读写策略。
- r：只读。
- w：只写。
- rw：读写。
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * 指定是否将主账号切换为免密账号。这里只适用于主账号，子账号不可免密。
- true：将主账号切换为免密账号。
- false：不切换。
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

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
     * Get 子账号名称，如果要修改主账号，填 root。 
     * @return AccountName 子账号名称，如果要修改主账号，填 root。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 子账号名称，如果要修改主账号，填 root。
     * @param AccountName 子账号名称，如果要修改主账号，填 root。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 子账号密码。 
     * @return AccountPassword 子账号密码。
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set 子账号密码。
     * @param AccountPassword 子账号密码。
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get 子账号描述信息 
     * @return Remark 子账号描述信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 子账号描述信息
     * @param Remark 子账号描述信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 账号读写路由策略。
- master：表示主节点。
- replication：表示从节点。 
     * @return ReadonlyPolicy 账号读写路由策略。
- master：表示主节点。
- replication：表示从节点。
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set 账号读写路由策略。
- master：表示主节点。
- replication：表示从节点。
     * @param ReadonlyPolicy 账号读写路由策略。
- master：表示主节点。
- replication：表示从节点。
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get 子账号读写策略。
- r：只读。
- w：只写。
- rw：读写。 
     * @return Privilege 子账号读写策略。
- r：只读。
- w：只写。
- rw：读写。
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 子账号读写策略。
- r：只读。
- w：只写。
- rw：读写。
     * @param Privilege 子账号读写策略。
- r：只读。
- w：只写。
- rw：读写。
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 指定是否将主账号切换为免密账号。这里只适用于主账号，子账号不可免密。
- true：将主账号切换为免密账号。
- false：不切换。 
     * @return NoAuth 指定是否将主账号切换为免密账号。这里只适用于主账号，子账号不可免密。
- true：将主账号切换为免密账号。
- false：不切换。
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set 指定是否将主账号切换为免密账号。这里只适用于主账号，子账号不可免密。
- true：将主账号切换为免密账号。
- false：不切换。
     * @param NoAuth 指定是否将主账号切换为免密账号。这里只适用于主账号，子账号不可免密。
- true：将主账号切换为免密账号。
- false：不切换。
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
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

    }
}

