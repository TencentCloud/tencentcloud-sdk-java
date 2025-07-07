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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Clb extends AbstractModel {

    /**
    * 负载均衡IP
    */
    @SerializedName("ClbIp")
    @Expose
    private String ClbIp;

    /**
     * Get 负载均衡IP 
     * @return ClbIp 负载均衡IP
     */
    public String getClbIp() {
        return this.ClbIp;
    }

    /**
     * Set 负载均衡IP
     * @param ClbIp 负载均衡IP
     */
    public void setClbIp(String ClbIp) {
        this.ClbIp = ClbIp;
    }

    public Clb() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Clb(Clb source) {
        if (source.ClbIp != null) {
            this.ClbIp = new String(source.ClbIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClbIp", this.ClbIp);

    }
}

