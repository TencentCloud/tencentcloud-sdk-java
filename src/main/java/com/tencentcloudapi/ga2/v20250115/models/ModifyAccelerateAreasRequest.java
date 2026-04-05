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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccelerateAreasRequest extends AbstractModel {

    /**
    * 全球加速实例ID。
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * 加速地域信息。
    */
    @SerializedName("AcceleratorAreas")
    @Expose
    private AcceleratorAreas [] AcceleratorAreas;

    /**
     * Get 全球加速实例ID。 
     * @return GlobalAcceleratorId 全球加速实例ID。
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set 全球加速实例ID。
     * @param GlobalAcceleratorId 全球加速实例ID。
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get 加速地域信息。 
     * @return AcceleratorAreas 加速地域信息。
     */
    public AcceleratorAreas [] getAcceleratorAreas() {
        return this.AcceleratorAreas;
    }

    /**
     * Set 加速地域信息。
     * @param AcceleratorAreas 加速地域信息。
     */
    public void setAcceleratorAreas(AcceleratorAreas [] AcceleratorAreas) {
        this.AcceleratorAreas = AcceleratorAreas;
    }

    public ModifyAccelerateAreasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccelerateAreasRequest(ModifyAccelerateAreasRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.AcceleratorAreas != null) {
            this.AcceleratorAreas = new AcceleratorAreas[source.AcceleratorAreas.length];
            for (int i = 0; i < source.AcceleratorAreas.length; i++) {
                this.AcceleratorAreas[i] = new AcceleratorAreas(source.AcceleratorAreas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamArrayObj(map, prefix + "AcceleratorAreas.", this.AcceleratorAreas);

    }
}

