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

public class RouterSettingWithFallBack extends AbstractModel {

    /**
    * <p>回退策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FallBack")
    @Expose
    private FallBackItem FallBack;

    /**
    * <p>模型内路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutingStrategy")
    @Expose
    private String RoutingStrategy;

    /**
    * <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossModelGroupRoutingStrategy")
    @Expose
    private String CrossModelGroupRoutingStrategy;

    /**
     * Get <p>回退策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FallBack <p>回退策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FallBackItem getFallBack() {
        return this.FallBack;
    }

    /**
     * Set <p>回退策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FallBack <p>回退策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFallBack(FallBackItem FallBack) {
        this.FallBack = FallBack;
    }

    /**
     * Get <p>模型内路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutingStrategy <p>模型内路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoutingStrategy() {
        return this.RoutingStrategy;
    }

    /**
     * Set <p>模型内路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutingStrategy <p>模型内路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutingStrategy(String RoutingStrategy) {
        this.RoutingStrategy = RoutingStrategy;
    }

    /**
     * Get <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossModelGroupRoutingStrategy <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrossModelGroupRoutingStrategy() {
        return this.CrossModelGroupRoutingStrategy;
    }

    /**
     * Set <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossModelGroupRoutingStrategy <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossModelGroupRoutingStrategy(String CrossModelGroupRoutingStrategy) {
        this.CrossModelGroupRoutingStrategy = CrossModelGroupRoutingStrategy;
    }

    public RouterSettingWithFallBack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouterSettingWithFallBack(RouterSettingWithFallBack source) {
        if (source.FallBack != null) {
            this.FallBack = new FallBackItem(source.FallBack);
        }
        if (source.RoutingStrategy != null) {
            this.RoutingStrategy = new String(source.RoutingStrategy);
        }
        if (source.CrossModelGroupRoutingStrategy != null) {
            this.CrossModelGroupRoutingStrategy = new String(source.CrossModelGroupRoutingStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FallBack.", this.FallBack);
        this.setParamSimple(map, prefix + "RoutingStrategy", this.RoutingStrategy);
        this.setParamSimple(map, prefix + "CrossModelGroupRoutingStrategy", this.CrossModelGroupRoutingStrategy);

    }
}

