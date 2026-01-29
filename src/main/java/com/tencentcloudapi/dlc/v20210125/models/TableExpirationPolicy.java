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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableExpirationPolicy extends AbstractModel {

    /**
    * 是否启用策略
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 表过期时间，单位：天
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
     * Get 是否启用策略 
     * @return Enabled 是否启用策略
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用策略
     * @param Enabled 是否启用策略
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 表过期时间，单位：天 
     * @return Expiration 表过期时间，单位：天
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 表过期时间，单位：天
     * @param Expiration 表过期时间，单位：天
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    public TableExpirationPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableExpirationPolicy(TableExpirationPolicy source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Expiration != null) {
            this.Expiration = new Long(source.Expiration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);

    }
}

