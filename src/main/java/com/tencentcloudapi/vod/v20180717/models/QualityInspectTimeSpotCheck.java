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

public class QualityInspectTimeSpotCheck extends AbstractModel {

    /**
    * <p>每次循环检测的时长。</p><p>取值范围：[10, 86400]</p><p>单位：秒。</p>
    */
    @SerializedName("CheckDuration")
    @Expose
    private Long CheckDuration;

    /**
    * <p>抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测</p><p>取值范围：[10, 3600]</p><p>单位：秒。</p>
    */
    @SerializedName("CheckInterval")
    @Expose
    private Long CheckInterval;

    /**
    * <p>片头跳过时长。</p><p>取值范围：[1, 1800]</p><p>单位：秒。</p>
    */
    @SerializedName("SkipDuration")
    @Expose
    private Long SkipDuration;

    /**
    * <p>循环次数。</p><p>取值范围：[0, 1000]</p>
    */
    @SerializedName("CirclesNumber")
    @Expose
    private Long CirclesNumber;

    /**
     * Get <p>每次循环检测的时长。</p><p>取值范围：[10, 86400]</p><p>单位：秒。</p> 
     * @return CheckDuration <p>每次循环检测的时长。</p><p>取值范围：[10, 86400]</p><p>单位：秒。</p>
     */
    public Long getCheckDuration() {
        return this.CheckDuration;
    }

    /**
     * Set <p>每次循环检测的时长。</p><p>取值范围：[10, 86400]</p><p>单位：秒。</p>
     * @param CheckDuration <p>每次循环检测的时长。</p><p>取值范围：[10, 86400]</p><p>单位：秒。</p>
     */
    public void setCheckDuration(Long CheckDuration) {
        this.CheckDuration = CheckDuration;
    }

    /**
     * Get <p>抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测</p><p>取值范围：[10, 3600]</p><p>单位：秒。</p> 
     * @return CheckInterval <p>抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测</p><p>取值范围：[10, 3600]</p><p>单位：秒。</p>
     */
    public Long getCheckInterval() {
        return this.CheckInterval;
    }

    /**
     * Set <p>抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测</p><p>取值范围：[10, 3600]</p><p>单位：秒。</p>
     * @param CheckInterval <p>抽检间隔，表示在一次检测结束后，等待多长时间后，再次检测</p><p>取值范围：[10, 3600]</p><p>单位：秒。</p>
     */
    public void setCheckInterval(Long CheckInterval) {
        this.CheckInterval = CheckInterval;
    }

    /**
     * Get <p>片头跳过时长。</p><p>取值范围：[1, 1800]</p><p>单位：秒。</p> 
     * @return SkipDuration <p>片头跳过时长。</p><p>取值范围：[1, 1800]</p><p>单位：秒。</p>
     */
    public Long getSkipDuration() {
        return this.SkipDuration;
    }

    /**
     * Set <p>片头跳过时长。</p><p>取值范围：[1, 1800]</p><p>单位：秒。</p>
     * @param SkipDuration <p>片头跳过时长。</p><p>取值范围：[1, 1800]</p><p>单位：秒。</p>
     */
    public void setSkipDuration(Long SkipDuration) {
        this.SkipDuration = SkipDuration;
    }

    /**
     * Get <p>循环次数。</p><p>取值范围：[0, 1000]</p> 
     * @return CirclesNumber <p>循环次数。</p><p>取值范围：[0, 1000]</p>
     */
    public Long getCirclesNumber() {
        return this.CirclesNumber;
    }

    /**
     * Set <p>循环次数。</p><p>取值范围：[0, 1000]</p>
     * @param CirclesNumber <p>循环次数。</p><p>取值范围：[0, 1000]</p>
     */
    public void setCirclesNumber(Long CirclesNumber) {
        this.CirclesNumber = CirclesNumber;
    }

    public QualityInspectTimeSpotCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectTimeSpotCheck(QualityInspectTimeSpotCheck source) {
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

