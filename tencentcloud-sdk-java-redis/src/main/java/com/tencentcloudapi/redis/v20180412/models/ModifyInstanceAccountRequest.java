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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAccountRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 子账号名称，如果要修改主账号，填root
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 子账号密码
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
    * 子账号路由策略：填写master或者slave，表示路由主节点，从节点
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * 子账号读写策略：填写r、w、rw，表示只读，只写，读写策略
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * true表示将主账号切换为免密账号，这里只适用于主账号，子账号不可免密
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 子账号名称，如果要修改主账号，填root 
     * @return AccountName 子账号名称，如果要修改主账号，填root
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 子账号名称，如果要修改主账号，填root
     * @param AccountName 子账号名称，如果要修改主账号，填root
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 子账号密码 
     * @return AccountPassword 子账号密码
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set 子账号密码
     * @param AccountPassword 子账号密码
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
     * Get 子账号路由策略：填写master或者slave，表示路由主节点，从节点 
     * @return ReadonlyPolicy 子账号路由策略：填写master或者slave，表示路由主节点，从节点
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set 子账号路由策略：填写master或者slave，表示路由主节点，从节点
     * @param ReadonlyPolicy 子账号路由策略：填写master或者slave，表示路由主节点，从节点
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get 子账号读写策略：填写r、w、rw，表示只读，只写，读写策略 
     * @return Privilege 子账号读写策略：填写r、w、rw，表示只读，只写，读写策略
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 子账号读写策略：填写r、w、rw，表示只读，只写，读写策略
     * @param Privilege 子账号读写策略：填写r、w、rw，表示只读，只写，读写策略
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get true表示将主账号切换为免密账号，这里只适用于主账号，子账号不可免密 
     * @return NoAuth true表示将主账号切换为免密账号，这里只适用于主账号，子账号不可免密
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set true表示将主账号切换为免密账号，这里只适用于主账号，子账号不可免密
     * @param NoAuth true表示将主账号切换为免密账号，这里只适用于主账号，子账号不可免密
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
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

