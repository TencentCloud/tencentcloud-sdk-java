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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBanModeRequest extends AbstractModel {

    /**
    * <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>阻断时间，用于标准阻断模式</p>
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
     * Get <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p> 
     * @return Mode <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p>
     * @param Mode <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>阻断时间，用于标准阻断模式</p> 
     * @return Ttl <p>阻断时间，用于标准阻断模式</p>
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set <p>阻断时间，用于标准阻断模式</p>
     * @param Ttl <p>阻断时间，用于标准阻断模式</p>
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    public ModifyBanModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBanModeRequest(ModifyBanModeRequest source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);

    }
}

