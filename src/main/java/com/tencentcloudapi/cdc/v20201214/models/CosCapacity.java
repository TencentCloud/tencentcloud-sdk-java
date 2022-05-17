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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosCapacity extends AbstractModel{

    /**
    * 已购cos的总容量大小，单位GB
    */
    @SerializedName("TotalCapacity")
    @Expose
    private Float TotalCapacity;

    /**
    * 剩余可用cos的容量大小，单位GB
    */
    @SerializedName("TotalFreeCapacity")
    @Expose
    private Float TotalFreeCapacity;

    /**
    * 已用cos的容量大小，单位GB
    */
    @SerializedName("TotalUsedCapacity")
    @Expose
    private Float TotalUsedCapacity;

    /**
     * Get 已购cos的总容量大小，单位GB 
     * @return TotalCapacity 已购cos的总容量大小，单位GB
     */
    public Float getTotalCapacity() {
        return this.TotalCapacity;
    }

    /**
     * Set 已购cos的总容量大小，单位GB
     * @param TotalCapacity 已购cos的总容量大小，单位GB
     */
    public void setTotalCapacity(Float TotalCapacity) {
        this.TotalCapacity = TotalCapacity;
    }

    /**
     * Get 剩余可用cos的容量大小，单位GB 
     * @return TotalFreeCapacity 剩余可用cos的容量大小，单位GB
     */
    public Float getTotalFreeCapacity() {
        return this.TotalFreeCapacity;
    }

    /**
     * Set 剩余可用cos的容量大小，单位GB
     * @param TotalFreeCapacity 剩余可用cos的容量大小，单位GB
     */
    public void setTotalFreeCapacity(Float TotalFreeCapacity) {
        this.TotalFreeCapacity = TotalFreeCapacity;
    }

    /**
     * Get 已用cos的容量大小，单位GB 
     * @return TotalUsedCapacity 已用cos的容量大小，单位GB
     */
    public Float getTotalUsedCapacity() {
        return this.TotalUsedCapacity;
    }

    /**
     * Set 已用cos的容量大小，单位GB
     * @param TotalUsedCapacity 已用cos的容量大小，单位GB
     */
    public void setTotalUsedCapacity(Float TotalUsedCapacity) {
        this.TotalUsedCapacity = TotalUsedCapacity;
    }

    public CosCapacity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosCapacity(CosCapacity source) {
        if (source.TotalCapacity != null) {
            this.TotalCapacity = new Float(source.TotalCapacity);
        }
        if (source.TotalFreeCapacity != null) {
            this.TotalFreeCapacity = new Float(source.TotalFreeCapacity);
        }
        if (source.TotalUsedCapacity != null) {
            this.TotalUsedCapacity = new Float(source.TotalUsedCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCapacity", this.TotalCapacity);
        this.setParamSimple(map, prefix + "TotalFreeCapacity", this.TotalFreeCapacity);
        this.setParamSimple(map, prefix + "TotalUsedCapacity", this.TotalUsedCapacity);

    }
}

