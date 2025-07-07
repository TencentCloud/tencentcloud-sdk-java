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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDevicesRequest extends AbstractModel {

    /**
    * 多个设备标识
    */
    @SerializedName("DevicesItems")
    @Expose
    private DevicesItem [] DevicesItems;

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

    public DeleteDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDevicesRequest(DeleteDevicesRequest source) {
        if (source.DevicesItems != null) {
            this.DevicesItems = new DevicesItem[source.DevicesItems.length];
            for (int i = 0; i < source.DevicesItems.length; i++) {
                this.DevicesItems[i] = new DevicesItem(source.DevicesItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DevicesItems.", this.DevicesItems);

    }
}

