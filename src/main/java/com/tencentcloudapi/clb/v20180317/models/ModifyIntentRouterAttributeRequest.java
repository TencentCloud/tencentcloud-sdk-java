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

public class ModifyIntentRouterAttributeRequest extends AbstractModel {

    /**
    * <p>意图路由ID（ir-xxx格式）。</p>
    */
    @SerializedName("IntentRouterId")
    @Expose
    private String IntentRouterId;

    /**
    * <p>模型路由实例ID。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>新的路由名称。</p><p>选填；必须以"IntentRouter/"为前缀，后缀仅支持字母、数字、连字符和下划线，后缀长度1-128个字符。不传则不修改。</p>
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * <p>意图路由描述。</p>
    */
    @SerializedName("RouterDescribe")
    @Expose
    private String RouterDescribe;

    /**
    * <p>新的分层配置列表（全量替换）。</p><p>选填；不传则不修改。传入时必须为完整分层集合：复杂度分层须包含全部 4 个分层 SIMPLE/MEDIUM/COMPLEX/REASONING；语义分层须包含 default 及各语义 Tier（取决于实例所用协议，且不可跨协议变更）。每个分层至少包含一个模型，模型名称必须是已关联到该实例的模型。</p>
    */
    @SerializedName("Tiers")
    @Expose
    private TierItem [] Tiers;

    /**
     * Get <p>意图路由ID（ir-xxx格式）。</p> 
     * @return IntentRouterId <p>意图路由ID（ir-xxx格式）。</p>
     */
    public String getIntentRouterId() {
        return this.IntentRouterId;
    }

    /**
     * Set <p>意图路由ID（ir-xxx格式）。</p>
     * @param IntentRouterId <p>意图路由ID（ir-xxx格式）。</p>
     */
    public void setIntentRouterId(String IntentRouterId) {
        this.IntentRouterId = IntentRouterId;
    }

    /**
     * Get <p>模型路由实例ID。</p> 
     * @return ModelRouterId <p>模型路由实例ID。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID。</p>
     * @param ModelRouterId <p>模型路由实例ID。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>新的路由名称。</p><p>选填；必须以"IntentRouter/"为前缀，后缀仅支持字母、数字、连字符和下划线，后缀长度1-128个字符。不传则不修改。</p> 
     * @return RouteName <p>新的路由名称。</p><p>选填；必须以"IntentRouter/"为前缀，后缀仅支持字母、数字、连字符和下划线，后缀长度1-128个字符。不传则不修改。</p>
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set <p>新的路由名称。</p><p>选填；必须以"IntentRouter/"为前缀，后缀仅支持字母、数字、连字符和下划线，后缀长度1-128个字符。不传则不修改。</p>
     * @param RouteName <p>新的路由名称。</p><p>选填；必须以"IntentRouter/"为前缀，后缀仅支持字母、数字、连字符和下划线，后缀长度1-128个字符。不传则不修改。</p>
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get <p>意图路由描述。</p> 
     * @return RouterDescribe <p>意图路由描述。</p>
     */
    public String getRouterDescribe() {
        return this.RouterDescribe;
    }

    /**
     * Set <p>意图路由描述。</p>
     * @param RouterDescribe <p>意图路由描述。</p>
     */
    public void setRouterDescribe(String RouterDescribe) {
        this.RouterDescribe = RouterDescribe;
    }

    /**
     * Get <p>新的分层配置列表（全量替换）。</p><p>选填；不传则不修改。传入时必须为完整分层集合：复杂度分层须包含全部 4 个分层 SIMPLE/MEDIUM/COMPLEX/REASONING；语义分层须包含 default 及各语义 Tier（取决于实例所用协议，且不可跨协议变更）。每个分层至少包含一个模型，模型名称必须是已关联到该实例的模型。</p> 
     * @return Tiers <p>新的分层配置列表（全量替换）。</p><p>选填；不传则不修改。传入时必须为完整分层集合：复杂度分层须包含全部 4 个分层 SIMPLE/MEDIUM/COMPLEX/REASONING；语义分层须包含 default 及各语义 Tier（取决于实例所用协议，且不可跨协议变更）。每个分层至少包含一个模型，模型名称必须是已关联到该实例的模型。</p>
     */
    public TierItem [] getTiers() {
        return this.Tiers;
    }

    /**
     * Set <p>新的分层配置列表（全量替换）。</p><p>选填；不传则不修改。传入时必须为完整分层集合：复杂度分层须包含全部 4 个分层 SIMPLE/MEDIUM/COMPLEX/REASONING；语义分层须包含 default 及各语义 Tier（取决于实例所用协议，且不可跨协议变更）。每个分层至少包含一个模型，模型名称必须是已关联到该实例的模型。</p>
     * @param Tiers <p>新的分层配置列表（全量替换）。</p><p>选填；不传则不修改。传入时必须为完整分层集合：复杂度分层须包含全部 4 个分层 SIMPLE/MEDIUM/COMPLEX/REASONING；语义分层须包含 default 及各语义 Tier（取决于实例所用协议，且不可跨协议变更）。每个分层至少包含一个模型，模型名称必须是已关联到该实例的模型。</p>
     */
    public void setTiers(TierItem [] Tiers) {
        this.Tiers = Tiers;
    }

    public ModifyIntentRouterAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIntentRouterAttributeRequest(ModifyIntentRouterAttributeRequest source) {
        if (source.IntentRouterId != null) {
            this.IntentRouterId = new String(source.IntentRouterId);
        }
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.RouterDescribe != null) {
            this.RouterDescribe = new String(source.RouterDescribe);
        }
        if (source.Tiers != null) {
            this.Tiers = new TierItem[source.Tiers.length];
            for (int i = 0; i < source.Tiers.length; i++) {
                this.Tiers[i] = new TierItem(source.Tiers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntentRouterId", this.IntentRouterId);
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamSimple(map, prefix + "RouterDescribe", this.RouterDescribe);
        this.setParamArrayObj(map, prefix + "Tiers.", this.Tiers);

    }
}

