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

public class ResetPasswordRequest extends AbstractModel{

    /**
    * Redis实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 重置的密码（切换为免密实例时，可不传；其他情况必传）
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否切换免密实例，false-切换为非免密码实例，true-切换为免密码实例；默认false
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
     * Get Redis实例ID 
     * @return InstanceId Redis实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Redis实例ID
     * @param InstanceId Redis实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 重置的密码（切换为免密实例时，可不传；其他情况必传） 
     * @return Password 重置的密码（切换为免密实例时，可不传；其他情况必传）
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 重置的密码（切换为免密实例时，可不传；其他情况必传）
     * @param Password 重置的密码（切换为免密实例时，可不传；其他情况必传）
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 是否切换免密实例，false-切换为非免密码实例，true-切换为免密码实例；默认false 
     * @return NoAuth 是否切换免密实例，false-切换为非免密码实例，true-切换为免密码实例；默认false
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set 是否切换免密实例，false-切换为非免密码实例，true-切换为免密码实例；默认false
     * @param NoAuth 是否切换免密实例，false-切换为非免密码实例，true-切换为免密码实例；默认false
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);

    }
}

