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

public class ModifyInstancePasswordPolicyRequest extends AbstractModel {

    /**
    * <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例的密码复杂度策略控制对象，包含密码长度及各类字符（字母/数字/特殊符号）最小数量的校验指标。</p>
    */
    @SerializedName("PasswordPolicy")
    @Expose
    private PasswordPolicy PasswordPolicy;

    /**
     * Get <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例的密码复杂度策略控制对象，包含密码长度及各类字符（字母/数字/特殊符号）最小数量的校验指标。</p> 
     * @return PasswordPolicy <p>实例的密码复杂度策略控制对象，包含密码长度及各类字符（字母/数字/特殊符号）最小数量的校验指标。</p>
     */
    public PasswordPolicy getPasswordPolicy() {
        return this.PasswordPolicy;
    }

    /**
     * Set <p>实例的密码复杂度策略控制对象，包含密码长度及各类字符（字母/数字/特殊符号）最小数量的校验指标。</p>
     * @param PasswordPolicy <p>实例的密码复杂度策略控制对象，包含密码长度及各类字符（字母/数字/特殊符号）最小数量的校验指标。</p>
     */
    public void setPasswordPolicy(PasswordPolicy PasswordPolicy) {
        this.PasswordPolicy = PasswordPolicy;
    }

    public ModifyInstancePasswordPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancePasswordPolicyRequest(ModifyInstancePasswordPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PasswordPolicy != null) {
            this.PasswordPolicy = new PasswordPolicy(source.PasswordPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "PasswordPolicy.", this.PasswordPolicy);

    }
}

