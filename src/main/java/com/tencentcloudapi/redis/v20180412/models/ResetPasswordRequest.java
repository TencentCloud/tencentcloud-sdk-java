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

public class ResetPasswordRequest extends AbstractModel {

    /**
    * 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 重置的密码。若切换为免密实例时，可不配置该参数。其他情况必须配置。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否切换免密实例。
- false：切换为非免密码实例。
- true：切换为免密码实例。默认 false。
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
     * Get 重置的密码。若切换为免密实例时，可不配置该参数。其他情况必须配置。 
     * @return Password 重置的密码。若切换为免密实例时，可不配置该参数。其他情况必须配置。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 重置的密码。若切换为免密实例时，可不配置该参数。其他情况必须配置。
     * @param Password 重置的密码。若切换为免密实例时，可不配置该参数。其他情况必须配置。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 是否切换免密实例。
- false：切换为非免密码实例。
- true：切换为免密码实例。默认 false。 
     * @return NoAuth 是否切换免密实例。
- false：切换为非免密码实例。
- true：切换为免密码实例。默认 false。
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set 是否切换免密实例。
- false：切换为非免密码实例。
- true：切换为免密码实例。默认 false。
     * @param NoAuth 是否切换免密实例。
- false：切换为非免密码实例。
- true：切换为免密码实例。默认 false。
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    public ResetPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetPasswordRequest(ResetPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
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
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);

    }
}

