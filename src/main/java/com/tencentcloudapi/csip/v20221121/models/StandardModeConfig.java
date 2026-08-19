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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardModeConfig extends AbstractModel {

    /**
    * <p>阻断时长，单位：秒</p>
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
     * Get <p>阻断时长，单位：秒</p> 
     * @return Ttl <p>阻断时长，单位：秒</p>
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set <p>阻断时长，单位：秒</p>
     * @param Ttl <p>阻断时长，单位：秒</p>
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    public StandardModeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardModeConfig(StandardModeConfig source) {
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);

    }
}

