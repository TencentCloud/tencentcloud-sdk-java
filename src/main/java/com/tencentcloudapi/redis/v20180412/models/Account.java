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

public class Account extends AbstractModel {

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 账号名称。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 账号描述信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 读写权限策略。
- r：只读。
- w：只写。
- rw：读写。
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * 只读路由策略。
- master：主节点。
- replication：从节点。
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * 子账号状态.
- 1：账号变更中。
- 2：账号有效。
- 4：账号已删除。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 账号名称。 
     * @return AccountName 账号名称。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号名称。
     * @param AccountName 账号名称。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 账号描述信息。 
     * @return Remark 账号描述信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 账号描述信息。
     * @param Remark 账号描述信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 读写权限策略。
- r：只读。
- w：只写。
- rw：读写。 
     * @return Privilege 读写权限策略。
- r：只读。
- w：只写。
- rw：读写。
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 读写权限策略。
- r：只读。
- w：只写。
- rw：读写。
     * @param Privilege 读写权限策略。
- r：只读。
- w：只写。
- rw：读写。
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 只读路由策略。
- master：主节点。
- replication：从节点。 
     * @return ReadonlyPolicy 只读路由策略。
- master：主节点。
- replication：从节点。
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set 只读路由策略。
- master：主节点。
- replication：从节点。
     * @param ReadonlyPolicy 只读路由策略。
- master：主节点。
- replication：从节点。
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get 子账号状态.
- 1：账号变更中。
- 2：账号有效。
- 4：账号已删除。 
     * @return Status 子账号状态.
- 1：账号变更中。
- 2：账号有效。
- 4：账号已删除。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 子账号状态.
- 1：账号变更中。
- 2：账号有效。
- 4：账号已删除。
     * @param Status 子账号状态.
- 1：账号变更中。
- 2：账号有效。
- 4：账号已删除。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Account() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Account(Account source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
        if (source.ReadonlyPolicy != null) {
            this.ReadonlyPolicy = new String[source.ReadonlyPolicy.length];
            for (int i = 0; i < source.ReadonlyPolicy.length; i++) {
                this.ReadonlyPolicy[i] = new String(source.ReadonlyPolicy[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

