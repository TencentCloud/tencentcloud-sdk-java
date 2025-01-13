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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestsPerSecond extends AbstractModel {

    /**
    * 最大RPS
    */
    @SerializedName("MaxRequestsPerSecond")
    @Expose
    private Long MaxRequestsPerSecond;

    /**
    * 施压时间
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
    * deprecated
    */
    @SerializedName("TargetVirtualUsers")
    @Expose
    private Long TargetVirtualUsers;

    /**
    * 资源数
    */
    @SerializedName("Resources")
    @Expose
    private Long Resources;

    /**
    * 起始RPS
    */
    @SerializedName("StartRequestsPerSecond")
    @Expose
    private Long StartRequestsPerSecond;

    /**
    * 目标RPS，入参无效
    */
    @SerializedName("TargetRequestsPerSecond")
    @Expose
    private Long TargetRequestsPerSecond;

    /**
    * 优雅关停的等待时间
    */
    @SerializedName("GracefulStopSeconds")
    @Expose
    private Long GracefulStopSeconds;

    /**
     * Get 最大RPS 
     * @return MaxRequestsPerSecond 最大RPS
     */
    public Long getMaxRequestsPerSecond() {
        return this.MaxRequestsPerSecond;
    }

    /**
     * Set 最大RPS
     * @param MaxRequestsPerSecond 最大RPS
     */
    public void setMaxRequestsPerSecond(Long MaxRequestsPerSecond) {
        this.MaxRequestsPerSecond = MaxRequestsPerSecond;
    }

    /**
     * Get 施压时间 
     * @return DurationSeconds 施压时间
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set 施压时间
     * @param DurationSeconds 施压时间
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * Get deprecated 
     * @return TargetVirtualUsers deprecated
     */
    public Long getTargetVirtualUsers() {
        return this.TargetVirtualUsers;
    }

    /**
     * Set deprecated
     * @param TargetVirtualUsers deprecated
     */
    public void setTargetVirtualUsers(Long TargetVirtualUsers) {
        this.TargetVirtualUsers = TargetVirtualUsers;
    }

    /**
     * Get 资源数 
     * @return Resources 资源数
     */
    public Long getResources() {
        return this.Resources;
    }

    /**
     * Set 资源数
     * @param Resources 资源数
     */
    public void setResources(Long Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 起始RPS 
     * @return StartRequestsPerSecond 起始RPS
     */
    public Long getStartRequestsPerSecond() {
        return this.StartRequestsPerSecond;
    }

    /**
     * Set 起始RPS
     * @param StartRequestsPerSecond 起始RPS
     */
    public void setStartRequestsPerSecond(Long StartRequestsPerSecond) {
        this.StartRequestsPerSecond = StartRequestsPerSecond;
    }

    /**
     * Get 目标RPS，入参无效 
     * @return TargetRequestsPerSecond 目标RPS，入参无效
     */
    public Long getTargetRequestsPerSecond() {
        return this.TargetRequestsPerSecond;
    }

    /**
     * Set 目标RPS，入参无效
     * @param TargetRequestsPerSecond 目标RPS，入参无效
     */
    public void setTargetRequestsPerSecond(Long TargetRequestsPerSecond) {
        this.TargetRequestsPerSecond = TargetRequestsPerSecond;
    }

    /**
     * Get 优雅关停的等待时间 
     * @return GracefulStopSeconds 优雅关停的等待时间
     */
    public Long getGracefulStopSeconds() {
        return this.GracefulStopSeconds;
    }

    /**
     * Set 优雅关停的等待时间
     * @param GracefulStopSeconds 优雅关停的等待时间
     */
    public void setGracefulStopSeconds(Long GracefulStopSeconds) {
        this.GracefulStopSeconds = GracefulStopSeconds;
    }

    public RequestsPerSecond() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestsPerSecond(RequestsPerSecond source) {
        if (source.MaxRequestsPerSecond != null) {
            this.MaxRequestsPerSecond = new Long(source.MaxRequestsPerSecond);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
        if (source.TargetVirtualUsers != null) {
            this.TargetVirtualUsers = new Long(source.TargetVirtualUsers);
        }
        if (source.Resources != null) {
            this.Resources = new Long(source.Resources);
        }
        if (source.StartRequestsPerSecond != null) {
            this.StartRequestsPerSecond = new Long(source.StartRequestsPerSecond);
        }
        if (source.TargetRequestsPerSecond != null) {
            this.TargetRequestsPerSecond = new Long(source.TargetRequestsPerSecond);
        }
        if (source.GracefulStopSeconds != null) {
            this.GracefulStopSeconds = new Long(source.GracefulStopSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxRequestsPerSecond", this.MaxRequestsPerSecond);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);
        this.setParamSimple(map, prefix + "TargetVirtualUsers", this.TargetVirtualUsers);
        this.setParamSimple(map, prefix + "Resources", this.Resources);
        this.setParamSimple(map, prefix + "StartRequestsPerSecond", this.StartRequestsPerSecond);
        this.setParamSimple(map, prefix + "TargetRequestsPerSecond", this.TargetRequestsPerSecond);
        this.setParamSimple(map, prefix + "GracefulStopSeconds", this.GracefulStopSeconds);

    }
}

