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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccountUserRequest extends AbstractModel{

    /**
    * 指定待删除账号的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置待删除的账号名。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 配置 mongouser 对应的密码。mongouser为系统默认账号，输入其对应的密码。
    */
    @SerializedName("MongoUserPassword")
    @Expose
    private String MongoUserPassword;

    /**
     * Get 指定待删除账号的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
 
     * @return InstanceId 指定待删除账号的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定待删除账号的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     * @param InstanceId 指定待删除账号的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置待删除的账号名。 
     * @return UserName 配置待删除的账号名。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 配置待删除的账号名。
     * @param UserName 配置待删除的账号名。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 配置 mongouser 对应的密码。mongouser为系统默认账号，输入其对应的密码。 
     * @return MongoUserPassword 配置 mongouser 对应的密码。mongouser为系统默认账号，输入其对应的密码。
     */
    public String getMongoUserPassword() {
        return this.MongoUserPassword;
    }

    /**
     * Set 配置 mongouser 对应的密码。mongouser为系统默认账号，输入其对应的密码。
     * @param MongoUserPassword 配置 mongouser 对应的密码。mongouser为系统默认账号，输入其对应的密码。
     */
    public void setMongoUserPassword(String MongoUserPassword) {
        this.MongoUserPassword = MongoUserPassword;
    }

    public DeleteAccountUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccountUserRequest(DeleteAccountUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.MongoUserPassword != null) {
            this.MongoUserPassword = new String(source.MongoUserPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "MongoUserPassword", this.MongoUserPassword);

    }
}

