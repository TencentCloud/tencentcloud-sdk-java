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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthToken extends AbstractModel {

    /**
    * AuthToken 基础信息
    */
    @SerializedName("Base")
    @Expose
    private AuthTokenBase Base;

    /**
    * AuthToken 限流数组
    */
    @SerializedName("Limits")
    @Expose
    private AuthTokenLimit [] Limits;

    /**
     * Get AuthToken 基础信息 
     * @return Base AuthToken 基础信息
     */
    public AuthTokenBase getBase() {
        return this.Base;
    }

    /**
     * Set AuthToken 基础信息
     * @param Base AuthToken 基础信息
     */
    public void setBase(AuthTokenBase Base) {
        this.Base = Base;
    }

    /**
     * Get AuthToken 限流数组 
     * @return Limits AuthToken 限流数组
     */
    public AuthTokenLimit [] getLimits() {
        return this.Limits;
    }

    /**
     * Set AuthToken 限流数组
     * @param Limits AuthToken 限流数组
     */
    public void setLimits(AuthTokenLimit [] Limits) {
        this.Limits = Limits;
    }

    public AuthToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthToken(AuthToken source) {
        if (source.Base != null) {
            this.Base = new AuthTokenBase(source.Base);
        }
        if (source.Limits != null) {
            this.Limits = new AuthTokenLimit[source.Limits.length];
            for (int i = 0; i < source.Limits.length; i++) {
                this.Limits[i] = new AuthTokenLimit(source.Limits[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Base.", this.Base);
        this.setParamArrayObj(map, prefix + "Limits.", this.Limits);

    }
}

