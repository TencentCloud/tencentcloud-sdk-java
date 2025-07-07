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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRealServerNameRequest extends AbstractModel {

    /**
    * 源站名称
    */
    @SerializedName("RealServerName")
    @Expose
    private String RealServerName;

    /**
    * 源站ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
     * Get 源站名称 
     * @return RealServerName 源站名称
     */
    public String getRealServerName() {
        return this.RealServerName;
    }

    /**
     * Set 源站名称
     * @param RealServerName 源站名称
     */
    public void setRealServerName(String RealServerName) {
        this.RealServerName = RealServerName;
    }

    /**
     * Get 源站ID 
     * @return RealServerId 源站ID
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set 源站ID
     * @param RealServerId 源站ID
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    public ModifyRealServerNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRealServerNameRequest(ModifyRealServerNameRequest source) {
        if (source.RealServerName != null) {
            this.RealServerName = new String(source.RealServerName);
        }
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerName", this.RealServerName);
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);

    }
}

