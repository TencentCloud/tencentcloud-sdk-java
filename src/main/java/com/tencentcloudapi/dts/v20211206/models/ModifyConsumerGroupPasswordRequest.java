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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConsumerGroupPasswordRequest extends AbstractModel {

    /**
    * 数据订阅实例的 ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 账号名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName}
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * 新密码。字符长度不小于3，不大于32
    */
    @SerializedName("NewPassword")
    @Expose
    private String NewPassword;

    /**
    * 旧密码，非必选
    */
    @SerializedName("OldPassword")
    @Expose
    private String OldPassword;

    /**
     * Get 数据订阅实例的 ID 
     * @return SubscribeId 数据订阅实例的 ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 数据订阅实例的 ID
     * @param SubscribeId 数据订阅实例的 ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 账号名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName} 
     * @return AccountName 账号名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName}
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName}
     * @param AccountName 账号名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName}
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName} 
     * @return ConsumerGroupName 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}
     * @param ConsumerGroupName 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get 新密码。字符长度不小于3，不大于32 
     * @return NewPassword 新密码。字符长度不小于3，不大于32
     */
    public String getNewPassword() {
        return this.NewPassword;
    }

    /**
     * Set 新密码。字符长度不小于3，不大于32
     * @param NewPassword 新密码。字符长度不小于3，不大于32
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    /**
     * Get 旧密码，非必选 
     * @return OldPassword 旧密码，非必选
     */
    public String getOldPassword() {
        return this.OldPassword;
    }

    /**
     * Set 旧密码，非必选
     * @param OldPassword 旧密码，非必选
     */
    public void setOldPassword(String OldPassword) {
        this.OldPassword = OldPassword;
    }

    public ModifyConsumerGroupPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsumerGroupPasswordRequest(ModifyConsumerGroupPasswordRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.NewPassword != null) {
            this.NewPassword = new String(source.NewPassword);
        }
        if (source.OldPassword != null) {
            this.OldPassword = new String(source.OldPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamSimple(map, prefix + "NewPassword", this.NewPassword);
        this.setParamSimple(map, prefix + "OldPassword", this.OldPassword);

    }
}

