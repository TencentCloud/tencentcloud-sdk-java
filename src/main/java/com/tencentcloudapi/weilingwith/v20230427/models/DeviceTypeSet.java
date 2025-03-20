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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceTypeSet extends AbstractModel {

    /**
    * 设备类型列表
    */
    @SerializedName("Set")
    @Expose
    private DeviceType [] Set;

    /**
     * Get 设备类型列表 
     * @return Set 设备类型列表
     */
    public DeviceType [] getSet() {
        return this.Set;
    }

    /**
     * Set 设备类型列表
     * @param Set 设备类型列表
     */
    public void setSet(DeviceType [] Set) {
        this.Set = Set;
    }

    public DeviceTypeSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceTypeSet(DeviceTypeSet source) {
        if (source.Set != null) {
            this.Set = new DeviceType[source.Set.length];
            for (int i = 0; i < source.Set.length; i++) {
                this.Set[i] = new DeviceType(source.Set[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Set.", this.Set);

    }
}

