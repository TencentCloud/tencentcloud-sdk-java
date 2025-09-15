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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EraseTimeArea extends AbstractModel {

    /**
    * 开始时间，单位:毫秒
    */
    @SerializedName("BeginMs")
    @Expose
    private Long BeginMs;

    /**
    * 结束时间，单位:毫秒
    */
    @SerializedName("EndMs")
    @Expose
    private Long EndMs;

    /**
    * 时间段内擦除区域列表
    */
    @SerializedName("Areas")
    @Expose
    private EraseArea [] Areas;

    /**
     * Get 开始时间，单位:毫秒 
     * @return BeginMs 开始时间，单位:毫秒
     */
    public Long getBeginMs() {
        return this.BeginMs;
    }

    /**
     * Set 开始时间，单位:毫秒
     * @param BeginMs 开始时间，单位:毫秒
     */
    public void setBeginMs(Long BeginMs) {
        this.BeginMs = BeginMs;
    }

    /**
     * Get 结束时间，单位:毫秒 
     * @return EndMs 结束时间，单位:毫秒
     */
    public Long getEndMs() {
        return this.EndMs;
    }

    /**
     * Set 结束时间，单位:毫秒
     * @param EndMs 结束时间，单位:毫秒
     */
    public void setEndMs(Long EndMs) {
        this.EndMs = EndMs;
    }

    /**
     * Get 时间段内擦除区域列表 
     * @return Areas 时间段内擦除区域列表
     */
    public EraseArea [] getAreas() {
        return this.Areas;
    }

    /**
     * Set 时间段内擦除区域列表
     * @param Areas 时间段内擦除区域列表
     */
    public void setAreas(EraseArea [] Areas) {
        this.Areas = Areas;
    }

    public EraseTimeArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EraseTimeArea(EraseTimeArea source) {
        if (source.BeginMs != null) {
            this.BeginMs = new Long(source.BeginMs);
        }
        if (source.EndMs != null) {
            this.EndMs = new Long(source.EndMs);
        }
        if (source.Areas != null) {
            this.Areas = new EraseArea[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new EraseArea(source.Areas[i]);
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

