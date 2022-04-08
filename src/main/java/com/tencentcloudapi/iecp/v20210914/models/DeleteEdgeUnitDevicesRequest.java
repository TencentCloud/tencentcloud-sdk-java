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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteEdgeUnitDevicesRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 无
    */
    @SerializedName("Devices")
    @Expose
    private DeleteEdgeUnitDevicesDevice [] Devices;

    /**
     * Get 无 
     * @return EdgeUnitId 无
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set 无
     * @param EdgeUnitId 无
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 无 
     * @return Devices 无
     */
    public DeleteEdgeUnitDevicesDevice [] getDevices() {
        return this.Devices;
    }

    /**
     * Set 无
     * @param Devices 无
     */
    public void setDevices(DeleteEdgeUnitDevicesDevice [] Devices) {
        this.Devices = Devices;
    }

    public DeleteEdgeUnitDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEdgeUnitDevicesRequest(DeleteEdgeUnitDevicesRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.Devices != null) {
            this.Devices = new DeleteEdgeUnitDevicesDevice[source.Devices.length];
            for (int i = 0; i < source.Devices.length; i++) {
                this.Devices[i] = new DeleteEdgeUnitDevicesDevice(source.Devices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamArrayObj(map, prefix + "Devices.", this.Devices);

    }
}

