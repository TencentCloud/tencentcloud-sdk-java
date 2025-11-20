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

public class SyncDevicesToIOARequest extends AbstractModel {

    /**
    * 资产ID集合。资产必须已绑定支持IOA功能的堡垒机实例。每次最多同步200个资产。
    */
    @SerializedName("DeviceIdSet")
    @Expose
    private Long [] DeviceIdSet;

    /**
     * Get 资产ID集合。资产必须已绑定支持IOA功能的堡垒机实例。每次最多同步200个资产。 
     * @return DeviceIdSet 资产ID集合。资产必须已绑定支持IOA功能的堡垒机实例。每次最多同步200个资产。
     */
    public Long [] getDeviceIdSet() {
        return this.DeviceIdSet;
    }

    /**
     * Set 资产ID集合。资产必须已绑定支持IOA功能的堡垒机实例。每次最多同步200个资产。
     * @param DeviceIdSet 资产ID集合。资产必须已绑定支持IOA功能的堡垒机实例。每次最多同步200个资产。
     */
    public void setDeviceIdSet(Long [] DeviceIdSet) {
        this.DeviceIdSet = DeviceIdSet;
    }

    public SyncDevicesToIOARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDevicesToIOARequest(SyncDevicesToIOARequest source) {
        if (source.DeviceIdSet != null) {
            this.DeviceIdSet = new Long[source.DeviceIdSet.length];
            for (int i = 0; i < source.DeviceIdSet.length; i++) {
                this.DeviceIdSet[i] = new Long(source.DeviceIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeviceIdSet.", this.DeviceIdSet);

    }
}

