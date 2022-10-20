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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestsPerSecond extends AbstractModel{

    /**
    * 最大RPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRequestsPerSecond")
    @Expose
    private Long MaxRequestsPerSecond;

    /**
    * 施压时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
    * deprecated
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetVirtualUsers")
    @Expose
    private Long TargetVirtualUsers;

    /**
    * 资源数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resources")
    @Expose
    private Long Resources;

    /**
    * 起始RPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartRequestsPerSecond")
    @Expose
    private Long StartRequestsPerSecond;

    /**
    * 目标RPS，入参无效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetRequestsPerSecond")
    @Expose
    private Long TargetRequestsPerSecond;

    /**
    * 优雅关停的等待时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GracefulStopSeconds")
    @Expose
    private Long GracefulStopSeconds;

    /**
     * Get 最大RPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRequestsPerSecond 最大RPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRequestsPerSecond() {
        return this.MaxRequestsPerSecond;
    }

    /**
     * Set 最大RPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRequestsPerSecond 最大RPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRequestsPerSecond(Long MaxRequestsPerSecond) {
        this.MaxRequestsPerSecond = MaxRequestsPerSecond;
    }

    /**
     * Get 施压时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationSeconds 施压时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set 施压时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationSeconds 施压时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * Get deprecated
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetVirtualUsers deprecated
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetVirtualUsers() {
        return this.TargetVirtualUsers;
    }

    /**
     * Set deprecated
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetVirtualUsers deprecated
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetVirtualUsers(Long TargetVirtualUsers) {
        this.TargetVirtualUsers = TargetVirtualUsers;
    }

    /**
     * Get 资源数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resources 资源数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResources() {
        return this.Resources;
    }

    /**
     * Set 资源数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resources 资源数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResources(Long Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 起始RPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartRequestsPerSecond 起始RPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartRequestsPerSecond() {
        return this.StartRequestsPerSecond;
    }

    /**
     * Set 起始RPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartRequestsPerSecond 起始RPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartRequestsPerSecond(Long StartRequestsPerSecond) {
        this.StartRequestsPerSecond = StartRequestsPerSecond;
    }

    /**
     * Get 目标RPS，入参无效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetRequestsPerSecond 目标RPS，入参无效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetRequestsPerSecond() {
        return this.TargetRequestsPerSecond;
    }

    /**
     * Set 目标RPS，入参无效
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetRequestsPerSecond 目标RPS，入参无效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetRequestsPerSecond(Long TargetRequestsPerSecond) {
        this.TargetRequestsPerSecond = TargetRequestsPerSecond;
    }

    /**
     * Get 优雅关停的等待时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GracefulStopSeconds 优雅关停的等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGracefulStopSeconds() {
        return this.GracefulStopSeconds;
    }

    /**
     * Set 优雅关停的等待时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param GracefulStopSeconds 优雅关停的等待时间
注意：此字段可能返回 null，表示取不到有效值。
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

