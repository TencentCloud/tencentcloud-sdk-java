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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeInfoResult extends AbstractModel{

    /**
    * 持续时间，单位毫秒
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 结束时间戳，单位毫秒
    */
    @SerializedName("EndTs")
    @Expose
    private Long EndTs;

    /**
    * 开始时间戳，单位毫秒
    */
    @SerializedName("StartTs")
    @Expose
    private Long StartTs;

    /**
     * Get 持续时间，单位毫秒 
     * @return Duration 持续时间，单位毫秒
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 持续时间，单位毫秒
     * @param Duration 持续时间，单位毫秒
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 结束时间戳，单位毫秒 
     * @return EndTs 结束时间戳，单位毫秒
     */
    public Long getEndTs() {
        return this.EndTs;
    }

    /**
     * Set 结束时间戳，单位毫秒
     * @param EndTs 结束时间戳，单位毫秒
     */
    public void setEndTs(Long EndTs) {
        this.EndTs = EndTs;
    }

    /**
     * Get 开始时间戳，单位毫秒 
     * @return StartTs 开始时间戳，单位毫秒
     */
    public Long getStartTs() {
        return this.StartTs;
    }

    /**
     * Set 开始时间戳，单位毫秒
     * @param StartTs 开始时间戳，单位毫秒
     */
    public void setStartTs(Long StartTs) {
        this.StartTs = StartTs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "EndTs", this.EndTs);
        this.setParamSimple(map, prefix + "StartTs", this.StartTs);

    }
}

