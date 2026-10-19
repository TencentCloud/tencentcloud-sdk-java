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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageConfig extends AbstractModel {

    /**
    * <p>模型内路由策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutingStrategy")
    @Expose
    private String RoutingStrategy;

    /**
    * <p>路由参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutingStrategyArgs")
    @Expose
    private RoutingStrategyArgs RoutingStrategyArgs;

    /**
    * <p>同一模型请求重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumRetries")
    @Expose
    private Long NumRetries;

    /**
    * <p>同步超时时间</p><p>取值范围：[0, 60]</p><p>单位：秒</p>
    */
    @SerializedName("WaitSeconds")
    @Expose
    private Long WaitSeconds;

    /**
     * Get <p>模型内路由策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutingStrategy <p>模型内路由策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoutingStrategy() {
        return this.RoutingStrategy;
    }

    /**
     * Set <p>模型内路由策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutingStrategy <p>模型内路由策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutingStrategy(String RoutingStrategy) {
        this.RoutingStrategy = RoutingStrategy;
    }

    /**
     * Get <p>路由参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutingStrategyArgs <p>路由参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoutingStrategyArgs getRoutingStrategyArgs() {
        return this.RoutingStrategyArgs;
    }

    /**
     * Set <p>路由参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutingStrategyArgs <p>路由参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutingStrategyArgs(RoutingStrategyArgs RoutingStrategyArgs) {
        this.RoutingStrategyArgs = RoutingStrategyArgs;
    }

    /**
     * Get <p>同一模型请求重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumRetries <p>同一模型请求重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumRetries() {
        return this.NumRetries;
    }

    /**
     * Set <p>同一模型请求重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumRetries <p>同一模型请求重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumRetries(Long NumRetries) {
        this.NumRetries = NumRetries;
    }

    /**
     * Get <p>同步超时时间</p><p>取值范围：[0, 60]</p><p>单位：秒</p> 
     * @return WaitSeconds <p>同步超时时间</p><p>取值范围：[0, 60]</p><p>单位：秒</p>
     */
    public Long getWaitSeconds() {
        return this.WaitSeconds;
    }

    /**
     * Set <p>同步超时时间</p><p>取值范围：[0, 60]</p><p>单位：秒</p>
     * @param WaitSeconds <p>同步超时时间</p><p>取值范围：[0, 60]</p><p>单位：秒</p>
     */
    public void setWaitSeconds(Long WaitSeconds) {
        this.WaitSeconds = WaitSeconds;
    }

    public ImageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageConfig(ImageConfig source) {
        if (source.RoutingStrategy != null) {
            this.RoutingStrategy = new String(source.RoutingStrategy);
        }
        if (source.RoutingStrategyArgs != null) {
            this.RoutingStrategyArgs = new RoutingStrategyArgs(source.RoutingStrategyArgs);
        }
        if (source.NumRetries != null) {
            this.NumRetries = new Long(source.NumRetries);
        }
        if (source.WaitSeconds != null) {
            this.WaitSeconds = new Long(source.WaitSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutingStrategy", this.RoutingStrategy);
        this.setParamObj(map, prefix + "RoutingStrategyArgs.", this.RoutingStrategyArgs);
        this.setParamSimple(map, prefix + "NumRetries", this.NumRetries);
        this.setParamSimple(map, prefix + "WaitSeconds", this.WaitSeconds);

    }
}

