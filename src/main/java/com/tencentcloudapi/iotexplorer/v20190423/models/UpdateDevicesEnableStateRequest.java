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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDevicesEnableStateRequest extends AbstractModel{

    /**
    * 多个设备标识
    */
    @SerializedName("DevicesItems")
    @Expose
    private DevicesItem [] DevicesItems;

    /**
    * 1：启用；0：禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 多个设备标识 
     * @return DevicesItems 多个设备标识
     */
    public DevicesItem [] getDevicesItems() {
        return this.DevicesItems;
    }

    /**
     * Set 多个设备标识
     * @param DevicesItems 多个设备标识
     */
    public void setDevicesItems(DevicesItem [] DevicesItems) {
        this.DevicesItems = DevicesItems;
    }

    /**
     * Get 1：启用；0：禁用 
     * @return Status 1：启用；0：禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1：启用；0：禁用
     * @param Status 1：启用；0：禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdateDevicesEnableStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDevicesEnableStateRequest(UpdateDevicesEnableStateRequest source) {
        if (source.DevicesItems != null) {
            this.DevicesItems = new DevicesItem[source.DevicesItems.length];
            for (int i = 0; i < source.DevicesItems.length; i++) {
                this.DevicesItems[i] = new DevicesItem(source.DevicesItems[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DevicesItems.", this.DevicesItems);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

