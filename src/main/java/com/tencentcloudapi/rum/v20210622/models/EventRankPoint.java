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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventRankPoint extends AbstractModel {

    /**
    * <p>时间戳 Unix 毫秒</p>
    */
    @SerializedName("Ts")
    @Expose
    private Long Ts;

    /**
    * <p>次数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>失败次数</p>
    */
    @SerializedName("Fail")
    @Expose
    private Long Fail;

    /**
    * <p>耗时</p>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
     * Get <p>时间戳 Unix 毫秒</p> 
     * @return Ts <p>时间戳 Unix 毫秒</p>
     */
    public Long getTs() {
        return this.Ts;
    }

    /**
     * Set <p>时间戳 Unix 毫秒</p>
     * @param Ts <p>时间戳 Unix 毫秒</p>
     */
    public void setTs(Long Ts) {
        this.Ts = Ts;
    }

    /**
     * Get <p>次数</p> 
     * @return Count <p>次数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>次数</p>
     * @param Count <p>次数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>失败次数</p> 
     * @return Fail <p>失败次数</p>
     */
    public Long getFail() {
        return this.Fail;
    }

    /**
     * Set <p>失败次数</p>
     * @param Fail <p>失败次数</p>
     */
    public void setFail(Long Fail) {
        this.Fail = Fail;
    }

    /**
     * Get <p>耗时</p> 
     * @return Duration <p>耗时</p>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>耗时</p>
     * @param Duration <p>耗时</p>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    public EventRankPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventRankPoint(EventRankPoint source) {
        if (source.Ts != null) {
            this.Ts = new Long(source.Ts);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Fail != null) {
            this.Fail = new Long(source.Fail);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ts", this.Ts);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Fail", this.Fail);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

