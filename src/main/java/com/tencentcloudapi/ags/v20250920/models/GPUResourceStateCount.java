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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUResourceStateCount extends AbstractModel {

    /**
    * <p>准备中的资源数量，单位台。</p>
    */
    @SerializedName("Delivering")
    @Expose
    private Long Delivering;

    /**
    * <p>已生效的资源数量，单位台；不等于当前可领取数量。</p>
    */
    @SerializedName("Active")
    @Expose
    private Long Active;

    /**
    * <p>已隔离的资源数量，单位台。</p>
    */
    @SerializedName("Isolated")
    @Expose
    private Long Isolated;

    /**
    * <p>正在释放的资源数量，单位台。</p>
    */
    @SerializedName("Destroying")
    @Expose
    private Long Destroying;

    /**
     * Get <p>准备中的资源数量，单位台。</p> 
     * @return Delivering <p>准备中的资源数量，单位台。</p>
     */
    public Long getDelivering() {
        return this.Delivering;
    }

    /**
     * Set <p>准备中的资源数量，单位台。</p>
     * @param Delivering <p>准备中的资源数量，单位台。</p>
     */
    public void setDelivering(Long Delivering) {
        this.Delivering = Delivering;
    }

    /**
     * Get <p>已生效的资源数量，单位台；不等于当前可领取数量。</p> 
     * @return Active <p>已生效的资源数量，单位台；不等于当前可领取数量。</p>
     */
    public Long getActive() {
        return this.Active;
    }

    /**
     * Set <p>已生效的资源数量，单位台；不等于当前可领取数量。</p>
     * @param Active <p>已生效的资源数量，单位台；不等于当前可领取数量。</p>
     */
    public void setActive(Long Active) {
        this.Active = Active;
    }

    /**
     * Get <p>已隔离的资源数量，单位台。</p> 
     * @return Isolated <p>已隔离的资源数量，单位台。</p>
     */
    public Long getIsolated() {
        return this.Isolated;
    }

    /**
     * Set <p>已隔离的资源数量，单位台。</p>
     * @param Isolated <p>已隔离的资源数量，单位台。</p>
     */
    public void setIsolated(Long Isolated) {
        this.Isolated = Isolated;
    }

    /**
     * Get <p>正在释放的资源数量，单位台。</p> 
     * @return Destroying <p>正在释放的资源数量，单位台。</p>
     */
    public Long getDestroying() {
        return this.Destroying;
    }

    /**
     * Set <p>正在释放的资源数量，单位台。</p>
     * @param Destroying <p>正在释放的资源数量，单位台。</p>
     */
    public void setDestroying(Long Destroying) {
        this.Destroying = Destroying;
    }

    public GPUResourceStateCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUResourceStateCount(GPUResourceStateCount source) {
        if (source.Delivering != null) {
            this.Delivering = new Long(source.Delivering);
        }
        if (source.Active != null) {
            this.Active = new Long(source.Active);
        }
        if (source.Isolated != null) {
            this.Isolated = new Long(source.Isolated);
        }
        if (source.Destroying != null) {
            this.Destroying = new Long(source.Destroying);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Delivering", this.Delivering);
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "Isolated", this.Isolated);
        this.setParamSimple(map, prefix + "Destroying", this.Destroying);

    }
}

