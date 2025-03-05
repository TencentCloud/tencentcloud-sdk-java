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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 账号名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账户属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Perms")
    @Expose
    private String [] Perms;

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
     * Get 账号名 
     * @return UserName 账号名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 账号名
     * @param UserName 账号名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 账户属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Perms 账户属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPerms() {
        return this.Perms;
    }

    /**
     * Set 账户属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Perms 账户属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPerms(String [] Perms) {
        this.Perms = Perms;
    }

    public AccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountInfo(AccountInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Perms != null) {
            this.Perms = new String[source.Perms.length];
            for (int i = 0; i < source.Perms.length; i++) {
                this.Perms[i] = new String(source.Perms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArraySimple(map, prefix + "Perms.", this.Perms);

    }
}

