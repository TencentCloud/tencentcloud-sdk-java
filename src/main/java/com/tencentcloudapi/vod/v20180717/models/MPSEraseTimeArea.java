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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSEraseTimeArea extends AbstractModel {

    /**
    * <p>开始时间，单位:毫秒</p>
    */
    @SerializedName("BeginMs")
    @Expose
    private Long BeginMs;

    /**
    * <p>结束时间，单位:毫秒</p>
    */
    @SerializedName("EndMs")
    @Expose
    private Long EndMs;

    /**
    * <p>时间段内擦除区域列表</p>
    */
    @SerializedName("Areas")
    @Expose
    private MPSEraseArea [] Areas;

    /**
     * Get <p>开始时间，单位:毫秒</p> 
     * @return BeginMs <p>开始时间，单位:毫秒</p>
     */
    public Long getBeginMs() {
        return this.BeginMs;
    }

    /**
     * Set <p>开始时间，单位:毫秒</p>
     * @param BeginMs <p>开始时间，单位:毫秒</p>
     */
    public void setBeginMs(Long BeginMs) {
        this.BeginMs = BeginMs;
    }

    /**
     * Get <p>结束时间，单位:毫秒</p> 
     * @return EndMs <p>结束时间，单位:毫秒</p>
     */
    public Long getEndMs() {
        return this.EndMs;
    }

    /**
     * Set <p>结束时间，单位:毫秒</p>
     * @param EndMs <p>结束时间，单位:毫秒</p>
     */
    public void setEndMs(Long EndMs) {
        this.EndMs = EndMs;
    }

    /**
     * Get <p>时间段内擦除区域列表</p> 
     * @return Areas <p>时间段内擦除区域列表</p>
     */
    public MPSEraseArea [] getAreas() {
        return this.Areas;
    }

    /**
     * Set <p>时间段内擦除区域列表</p>
     * @param Areas <p>时间段内擦除区域列表</p>
     */
    public void setAreas(MPSEraseArea [] Areas) {
        this.Areas = Areas;
    }

    public MPSEraseTimeArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSEraseTimeArea(MPSEraseTimeArea source) {
        if (source.BeginMs != null) {
            this.BeginMs = new Long(source.BeginMs);
        }
        if (source.EndMs != null) {
            this.EndMs = new Long(source.EndMs);
        }
        if (source.Areas != null) {
            this.Areas = new MPSEraseArea[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new MPSEraseArea(source.Areas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginMs", this.BeginMs);
        this.setParamSimple(map, prefix + "EndMs", this.EndMs);
        this.setParamArrayObj(map, prefix + "Areas.", this.Areas);

    }
}

