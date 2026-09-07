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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetUserRequest extends AbstractModel {

    /**
    * <p>用户ID集合</p>
    */
    @SerializedName("IdSet")
    @Expose
    private Long [] IdSet;

    /**
    * <p>重置类型</p><p>枚举值：</p><ul><li>0： 同时重置本地认证密码、OTP验证码</li><li>1： 仅重置本地认证密码</li><li>2： 仅重置OTP验证码</li></ul><p>默认值：0</p>
    */
    @SerializedName("ResetType")
    @Expose
    private Long ResetType;

    /**
     * Get <p>用户ID集合</p> 
     * @return IdSet <p>用户ID集合</p>
     */
    public Long [] getIdSet() {
        return this.IdSet;
    }

    /**
     * Set <p>用户ID集合</p>
     * @param IdSet <p>用户ID集合</p>
     */
    public void setIdSet(Long [] IdSet) {
        this.IdSet = IdSet;
    }

    /**
     * Get <p>重置类型</p><p>枚举值：</p><ul><li>0： 同时重置本地认证密码、OTP验证码</li><li>1： 仅重置本地认证密码</li><li>2： 仅重置OTP验证码</li></ul><p>默认值：0</p> 
     * @return ResetType <p>重置类型</p><p>枚举值：</p><ul><li>0： 同时重置本地认证密码、OTP验证码</li><li>1： 仅重置本地认证密码</li><li>2： 仅重置OTP验证码</li></ul><p>默认值：0</p>
     */
    public Long getResetType() {
        return this.ResetType;
    }

    /**
     * Set <p>重置类型</p><p>枚举值：</p><ul><li>0： 同时重置本地认证密码、OTP验证码</li><li>1： 仅重置本地认证密码</li><li>2： 仅重置OTP验证码</li></ul><p>默认值：0</p>
     * @param ResetType <p>重置类型</p><p>枚举值：</p><ul><li>0： 同时重置本地认证密码、OTP验证码</li><li>1： 仅重置本地认证密码</li><li>2： 仅重置OTP验证码</li></ul><p>默认值：0</p>
     */
    public void setResetType(Long ResetType) {
        this.ResetType = ResetType;
    }

    public ResetUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetUserRequest(ResetUserRequest source) {
        if (source.IdSet != null) {
            this.IdSet = new Long[source.IdSet.length];
            for (int i = 0; i < source.IdSet.length; i++) {
                this.IdSet[i] = new Long(source.IdSet[i]);
            }
        }
        if (source.ResetType != null) {
            this.ResetType = new Long(source.ResetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IdSet.", this.IdSet);
        this.setParamSimple(map, prefix + "ResetType", this.ResetType);

    }
}

