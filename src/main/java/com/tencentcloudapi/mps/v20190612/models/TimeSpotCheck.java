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

public class TimeSpotCheck extends AbstractModel {

    /**
    * 每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400

    */
    @SerializedName("CheckDuration")
    @Expose
    private Long CheckDuration;

    /**
    * 抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测。取值范围（单位 s）：
- 最小值：10
- 最大值：3600
    */
    @SerializedName("CheckInterval")
    @Expose
    private Long CheckInterval;

    /**
    * 片头跳过时长。取值范围（单位 s）：
- 最小值：1
- 最大值：1800
    */
    @SerializedName("SkipDuration")
    @Expose
    private Long SkipDuration;

    /**
    * 循环次数。取值范围:
- 最小值：0
- 最大值：1000

取值为 0 或为空时，表示循环至视频结束。
    */
    @SerializedName("CirclesNumber")
    @Expose
    private Long CirclesNumber;

    /**
     * Get 每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400
 
     * @return CheckDuration 每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400

     */
    public Long getCheckDuration() {
        return this.CheckDuration;
    }

    /**
     * Set 每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400

     * @param CheckDuration 每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400

     */
    public void setCheckDuration(Long CheckDuration) {
        this.CheckDuration = CheckDuration;
    }

    /**
     * Get 抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测。取值范围（单位 s）：
- 最小值：10
- 最大值：3600 
     * @return CheckInterval 抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测。取值范围（单位 s）：
- 最小值：10
- 最大值：3600
     */
    public Long getCheckInterval() {
        return this.CheckInterval;
    }

    /**
     * Set 抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测。取值范围（单位 s）：
- 最小值：10
- 最大值：3600
     * @param CheckInterval 抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测。取值范围（单位 s）：
- 最小值：10
- 最大值：3600
     */
    public void setCheckInterval(Long CheckInterval) {
        this.CheckInterval = CheckInterval;
    }

    /**
     * Get 片头跳过时长。取值范围（单位 s）：
- 最小值：1
- 最大值：1800 
     * @return SkipDuration 片头跳过时长。取值范围（单位 s）：
- 最小值：1
- 最大值：1800
     */
    public Long getSkipDuration() {
        return this.SkipDuration;
    }

    /**
     * Set 片头跳过时长。取值范围（单位 s）：
- 最小值：1
- 最大值：1800
     * @param SkipDuration 片头跳过时长。取值范围（单位 s）：
- 最小值：1
- 最大值：1800
     */
    public void setSkipDuration(Long SkipDuration) {
        this.SkipDuration = SkipDuration;
    }

    /**
     * Get 循环次数。取值范围:
- 最小值：0
- 最大值：1000

取值为 0 或为空时，表示循环至视频结束。 
     * @return CirclesNumber 循环次数。取值范围:
- 最小值：0
- 最大值：1000

取值为 0 或为空时，表示循环至视频结束。
     */
    public Long getCirclesNumber() {
        return this.CirclesNumber;
    }

    /**
     * Set 循环次数。取值范围:
- 最小值：0
- 最大值：1000

取值为 0 或为空时，表示循环至视频结束。
     * @param CirclesNumber 循环次数。取值范围:
- 最小值：0
- 最大值：1000

取值为 0 或为空时，表示循环至视频结束。
     */
    public void setCirclesNumber(Long CirclesNumber) {
        this.CirclesNumber = CirclesNumber;
    }

    public TimeSpotCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeSpotCheck(TimeSpotCheck source) {
        if (source.CheckDuration != null) {
            this.CheckDuration = new Long(source.CheckDuration);
        }
        if (source.CheckInterval != null) {
            this.CheckInterval = new Long(source.CheckInterval);
        }
        if (source.SkipDuration != null) {
            this.SkipDuration = new Long(source.SkipDuration);
        }
        if (source.CirclesNumber != null) {
            this.CirclesNumber = new Long(source.CirclesNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckDuration", this.CheckDuration);
        this.setParamSimple(map, prefix + "CheckInterval", this.CheckInterval);
        this.setParamSimple(map, prefix + "SkipDuration", this.SkipDuration);
        this.setParamSimple(map, prefix + "CirclesNumber", this.CirclesNumber);

    }
}

