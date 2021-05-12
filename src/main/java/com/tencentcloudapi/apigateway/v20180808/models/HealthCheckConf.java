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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckConf extends AbstractModel{

    /**
    * 是否开启健康检查。
    */
    @SerializedName("IsHealthCheck")
    @Expose
    private Boolean IsHealthCheck;

    /**
    * 健康检查阈值。
    */
    @SerializedName("RequestVolumeThreshold")
    @Expose
    private Long RequestVolumeThreshold;

    /**
    * 窗口大小。
    */
    @SerializedName("SleepWindowInMilliseconds")
    @Expose
    private Long SleepWindowInMilliseconds;

    /**
    * 阈值百分比。
    */
    @SerializedName("ErrorThresholdPercentage")
    @Expose
    private Long ErrorThresholdPercentage;

    /**
     * Get 是否开启健康检查。 
     * @return IsHealthCheck 是否开启健康检查。
     */
    public Boolean getIsHealthCheck() {
        return this.IsHealthCheck;
    }

    /**
     * Set 是否开启健康检查。
     * @param IsHealthCheck 是否开启健康检查。
     */
    public void setIsHealthCheck(Boolean IsHealthCheck) {
        this.IsHealthCheck = IsHealthCheck;
    }

    /**
     * Get 健康检查阈值。 
     * @return RequestVolumeThreshold 健康检查阈值。
     */
    public Long getRequestVolumeThreshold() {
        return this.RequestVolumeThreshold;
    }

    /**
     * Set 健康检查阈值。
     * @param RequestVolumeThreshold 健康检查阈值。
     */
    public void setRequestVolumeThreshold(Long RequestVolumeThreshold) {
        this.RequestVolumeThreshold = RequestVolumeThreshold;
    }

    /**
     * Get 窗口大小。 
     * @return SleepWindowInMilliseconds 窗口大小。
     */
    public Long getSleepWindowInMilliseconds() {
        return this.SleepWindowInMilliseconds;
    }

    /**
     * Set 窗口大小。
     * @param SleepWindowInMilliseconds 窗口大小。
     */
    public void setSleepWindowInMilliseconds(Long SleepWindowInMilliseconds) {
        this.SleepWindowInMilliseconds = SleepWindowInMilliseconds;
    }

    /**
     * Get 阈值百分比。 
     * @return ErrorThresholdPercentage 阈值百分比。
     */
    public Long getErrorThresholdPercentage() {
        return this.ErrorThresholdPercentage;
    }

    /**
     * Set 阈值百分比。
     * @param ErrorThresholdPercentage 阈值百分比。
     */
    public void setErrorThresholdPercentage(Long ErrorThresholdPercentage) {
        this.ErrorThresholdPercentage = ErrorThresholdPercentage;
    }

    public HealthCheckConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckConf(HealthCheckConf source) {
        if (source.IsHealthCheck != null) {
            this.IsHealthCheck = new Boolean(source.IsHealthCheck);
        }
        if (source.RequestVolumeThreshold != null) {
            this.RequestVolumeThreshold = new Long(source.RequestVolumeThreshold);
        }
        if (source.SleepWindowInMilliseconds != null) {
            this.SleepWindowInMilliseconds = new Long(source.SleepWindowInMilliseconds);
        }
        if (source.ErrorThresholdPercentage != null) {
            this.ErrorThresholdPercentage = new Long(source.ErrorThresholdPercentage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsHealthCheck", this.IsHealthCheck);
        this.setParamSimple(map, prefix + "RequestVolumeThreshold", this.RequestVolumeThreshold);
        this.setParamSimple(map, prefix + "SleepWindowInMilliseconds", this.SleepWindowInMilliseconds);
        this.setParamSimple(map, prefix + "ErrorThresholdPercentage", this.ErrorThresholdPercentage);

    }
}

