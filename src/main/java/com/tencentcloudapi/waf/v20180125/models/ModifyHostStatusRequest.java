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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHostStatusRequest extends AbstractModel {

    /**
    * 域名状态列表
    */
    @SerializedName("HostsStatus")
    @Expose
    private HostStatus [] HostsStatus;

    /**
     * Get 域名状态列表 
     * @return HostsStatus 域名状态列表
     */
    public HostStatus [] getHostsStatus() {
        return this.HostsStatus;
    }

    /**
     * Set 域名状态列表
     * @param HostsStatus 域名状态列表
     */
    public void setHostsStatus(HostStatus [] HostsStatus) {
        this.HostsStatus = HostsStatus;
    }

    public ModifyHostStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostStatusRequest(ModifyHostStatusRequest source) {
        if (source.HostsStatus != null) {
            this.HostsStatus = new HostStatus[source.HostsStatus.length];
            for (int i = 0; i < source.HostsStatus.length; i++) {
                this.HostsStatus[i] = new HostStatus(source.HostsStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HostsStatus.", this.HostsStatus);

    }
}

