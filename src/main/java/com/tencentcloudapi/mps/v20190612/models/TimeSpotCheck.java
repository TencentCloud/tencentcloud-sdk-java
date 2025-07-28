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
    * 抽检策略的每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400

    */
    @SerializedName("CheckDuration")
    @Expose
    private Long CheckDuration;

    /**
    * 抽检测略的检测间隔，表示在一次检测结束后，等待多长时间后，再次检测。
    */
    @SerializedName("CheckInterval")
    @Expose
    private Long CheckInterval;

    /**
    * 片头跳过时长。
    */
    @SerializedName("SkipDuration")
    @Expose
    private Long SkipDuration;

    /**
    * 循环次数，该字段为空或 0 时，默认循环直至视频结束。
    */
    @SerializedName("CirclesNumber")
    @Expose
    private Long CirclesNumber;

    /**
     * Get 抽检策略的每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400
 
     * @return CheckDuration 抽检策略的每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400

     */
    public Long getCheckDuration() {
        return this.CheckDuration;
    }

    /**
     * Set 抽检策略的每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400

     * @param CheckDuration 抽检策略的每次循环检测的时长。取值范围（单位s）：

- 最小值：10
- 最大值：86400

     */
    public void setCheckDuration(Long CheckDuration) {
        this.CheckDuration = CheckDuration;
    }

    /**
     * Get 抽检测略的检测间隔，表示在一次检测结束后，等待多长时间后，再次检测。 
     * @return CheckInterval 抽检测略的检测间隔，表示在一次检测结束后，等待多长时间后，再次检测。
     */
    public Long getCheckInterval() {
        return this.CheckInterval;
    }

    /**
     * Set 抽检测略的检测间隔，表示在一次检测结束后，等待多长时间后，再次检测。
     * @param CheckInterval 抽检测略的检测间隔，表示在一次检测结束后，等待多长时间后，再次检测。
     */
    public void setCheckInterval(Long CheckInterval) {
        this.CheckInterval = CheckInterval;
    }

    /**
     * Get 片头跳过时长。 
     * @return SkipDuration 片头跳过时长。
     */
    public Long getSkipDuration() {
        return this.SkipDuration;
    }

    /**
     * Set 片头跳过时长。
     * @param SkipDuration 片头跳过时长。
     */
    public void setSkipDuration(Long SkipDuration) {
        this.SkipDuration = SkipDuration;
    }

    /**
     * Get 循环次数，该字段为空或 0 时，默认循环直至视频结束。 
     * @return CirclesNumber 循环次数，该字段为空或 0 时，默认循环直至视频结束。
     */
    public Long getCirclesNumber() {
        return this.CirclesNumber;
    }

    /**
     * Set 循环次数，该字段为空或 0 时，默认循环直至视频结束。
     * @param CirclesNumber 循环次数，该字段为空或 0 时，默认循环直至视频结束。
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

