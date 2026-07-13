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
    * <p>全球加速实例ID。</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>加速地域信息。</p><p>入参限制：数组长度不能超过10。</p>
    */
    @SerializedName("AcceleratorAreas")
    @Expose
    private AcceleratorAreas [] AcceleratorAreas;

    /**
     * Get <p>全球加速实例ID。</p> 
     * @return GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>全球加速实例ID。</p>
     * @param GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>加速地域信息。</p><p>入参限制：数组长度不能超过10。</p> 
     * @return AcceleratorAreas <p>加速地域信息。</p><p>入参限制：数组长度不能超过10。</p>
     */
    public AcceleratorAreas [] getAcceleratorAreas() {
        return this.AcceleratorAreas;
    }

    /**
     * Set <p>加速地域信息。</p><p>入参限制：数组长度不能超过10。</p>
     * @param AcceleratorAreas <p>加速地域信息。</p><p>入参限制：数组长度不能超过10。</p>
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

