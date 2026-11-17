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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Account extends AbstractModel {

    /**
    * <p>实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>账号名称。</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>账号描述信息。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>读写权限策略。</p><p>枚举值：</p><ul><li>r： 只读。</li><li>rw： 读写。</li></ul>
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * <p>只读路由策略。</p><p>枚举值：</p><ul><li>master： 主节点。</li><li>replication： 从节点。</li></ul>
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * <p>子账号状态。</p><p>枚举值：</p><ul><li>1： 账号变更中。</li><li>2： 账号有效。</li><li>4： 账号已删除。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>实例 ID。</p> 
     * @return InstanceId <p>实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。</p>
     * @param InstanceId <p>实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>账号名称。</p> 
     * @return AccountName <p>账号名称。</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>账号名称。</p>
     * @param AccountName <p>账号名称。</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>账号描述信息。</p> 
     * @return Remark <p>账号描述信息。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>账号描述信息。</p>
     * @param Remark <p>账号描述信息。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>读写权限策略。</p><p>枚举值：</p><ul><li>r： 只读。</li><li>rw： 读写。</li></ul> 
     * @return Privilege <p>读写权限策略。</p><p>枚举值：</p><ul><li>r： 只读。</li><li>rw： 读写。</li></ul>
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>读写权限策略。</p><p>枚举值：</p><ul><li>r： 只读。</li><li>rw： 读写。</li></ul>
     * @param Privilege <p>读写权限策略。</p><p>枚举值：</p><ul><li>r： 只读。</li><li>rw： 读写。</li></ul>
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get <p>只读路由策略。</p><p>枚举值：</p><ul><li>master： 主节点。</li><li>replication： 从节点。</li></ul> 
     * @return ReadonlyPolicy <p>只读路由策略。</p><p>枚举值：</p><ul><li>master： 主节点。</li><li>replication： 从节点。</li></ul>
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set <p>只读路由策略。</p><p>枚举值：</p><ul><li>master： 主节点。</li><li>replication： 从节点。</li></ul>
     * @param ReadonlyPolicy <p>只读路由策略。</p><p>枚举值：</p><ul><li>master： 主节点。</li><li>replication： 从节点。</li></ul>
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get <p>子账号状态。</p><p>枚举值：</p><ul><li>1： 账号变更中。</li><li>2： 账号有效。</li><li>4： 账号已删除。</li></ul> 
     * @return Status <p>子账号状态。</p><p>枚举值：</p><ul><li>1： 账号变更中。</li><li>2： 账号有效。</li><li>4： 账号已删除。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>子账号状态。</p><p>枚举值：</p><ul><li>1： 账号变更中。</li><li>2： 账号有效。</li><li>4： 账号已删除。</li></ul>
     * @param Status <p>子账号状态。</p><p>枚举值：</p><ul><li>1： 账号变更中。</li><li>2： 账号有效。</li><li>4： 账号已删除。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    }
}

