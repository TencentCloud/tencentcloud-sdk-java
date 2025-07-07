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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatusCodeCacheParameters extends AbstractModel {

    /**
    * 状态码缓存 TTL 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusCodeCacheParams")
    @Expose
    private StatusCodeCacheParam [] StatusCodeCacheParams;

    /**
     * Get 状态码缓存 TTL 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusCodeCacheParams 状态码缓存 TTL 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusCodeCacheParam [] getStatusCodeCacheParams() {
        return this.StatusCodeCacheParams;
    }

    /**
     * Set 状态码缓存 TTL 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusCodeCacheParams 状态码缓存 TTL 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusCodeCacheParams(StatusCodeCacheParam [] StatusCodeCacheParams) {
        this.StatusCodeCacheParams = StatusCodeCacheParams;
    }

    public StatusCodeCacheParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatusCodeCacheParameters(StatusCodeCacheParameters source) {
        if (source.StatusCodeCacheParams != null) {
            this.StatusCodeCacheParams = new StatusCodeCacheParam[source.StatusCodeCacheParams.length];
            for (int i = 0; i < source.StatusCodeCacheParams.length; i++) {
                this.StatusCodeCacheParams[i] = new StatusCodeCacheParam(source.StatusCodeCacheParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "StatusCodeCacheParams.", this.StatusCodeCacheParams);

    }
}

