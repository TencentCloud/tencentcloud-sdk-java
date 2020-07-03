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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceAliasesRequest extends AbstractModel{

    /**
    * 需要改名的设备与别名列表
    */
    @SerializedName("DeviceAliases")
    @Expose
    private DeviceAlias [] DeviceAliases;

    /**
     * Get 需要改名的设备与别名列表 
     * @return DeviceAliases 需要改名的设备与别名列表
     */
    public DeviceAlias [] getDeviceAliases() {
        return this.DeviceAliases;
    }

    /**
     * Set 需要改名的设备与别名列表
     * @param DeviceAliases 需要改名的设备与别名列表
     */
    public void setDeviceAliases(DeviceAlias [] DeviceAliases) {
        this.DeviceAliases = DeviceAliases;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DeviceAliases.", this.DeviceAliases);

    }
}

