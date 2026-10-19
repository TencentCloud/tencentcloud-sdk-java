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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiSnapshotMode extends AbstractModel {

    /**
    * <p>是否启用多张模式</p><p>false时为单张模式，忽略Interval、Total参数</p><p>默认值：false</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>截帧间隔</p><p>取值范围：[10, 600]</p><p>单位：秒</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>截帧张数</p><p>取值范围：[1, 10]</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get <p>是否启用多张模式</p><p>false时为单张模式，忽略Interval、Total参数</p><p>默认值：false</p> 
     * @return Enable <p>是否启用多张模式</p><p>false时为单张模式，忽略Interval、Total参数</p><p>默认值：false</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否启用多张模式</p><p>false时为单张模式，忽略Interval、Total参数</p><p>默认值：false</p>
     * @param Enable <p>是否启用多张模式</p><p>false时为单张模式，忽略Interval、Total参数</p><p>默认值：false</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>截帧间隔</p><p>取值范围：[10, 600]</p><p>单位：秒</p> 
     * @return Interval <p>截帧间隔</p><p>取值范围：[10, 600]</p><p>单位：秒</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>截帧间隔</p><p>取值范围：[10, 600]</p><p>单位：秒</p>
     * @param Interval <p>截帧间隔</p><p>取值范围：[10, 600]</p><p>单位：秒</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>截帧张数</p><p>取值范围：[1, 10]</p> 
     * @return Total <p>截帧张数</p><p>取值范围：[1, 10]</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>截帧张数</p><p>取值范围：[1, 10]</p>
     * @param Total <p>截帧张数</p><p>取值范围：[1, 10]</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public MultiSnapshotMode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiSnapshotMode(MultiSnapshotMode source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

