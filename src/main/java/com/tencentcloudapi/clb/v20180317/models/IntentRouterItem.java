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

public class IntentRouterItem extends AbstractModel {

    /**
    * <p>创建时间（ISO 8601格式）。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>意图路由ID（ir-xxx格式）。</p>
    */
    @SerializedName("IntentRouterId")
    @Expose
    private String IntentRouterId;

    /**
    * <p>路由名称（例如 IntentRouter/customer-support）。</p>
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
    * <p>状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>ConfigureFailed：配置失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>分层配置列表。</p>
    */
    @SerializedName("Tiers")
    @Expose
    private IntentRouterTierItem [] Tiers;

    /**
    * <p>更新时间（ISO 8601格式）。</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get <p>创建时间（ISO 8601格式）。</p> 
     * @return CreatedTime <p>创建时间（ISO 8601格式）。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间（ISO 8601格式）。</p>
     * @param CreatedTime <p>创建时间（ISO 8601格式）。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

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
     * Get <p>路由名称（例如 IntentRouter/customer-support）。</p> 
     * @return RouteName <p>路由名称（例如 IntentRouter/customer-support）。</p>
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set <p>路由名称（例如 IntentRouter/customer-support）。</p>
     * @param RouteName <p>路由名称（例如 IntentRouter/customer-support）。</p>
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
     * Get <p>状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>ConfigureFailed：配置失败</li></ul> 
     * @return Status <p>状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>ConfigureFailed：配置失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>ConfigureFailed：配置失败</li></ul>
     * @param Status <p>状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>ConfigureFailed：配置失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>分层配置列表。</p> 
     * @return Tiers <p>分层配置列表。</p>
     */
    public IntentRouterTierItem [] getTiers() {
        return this.Tiers;
    }

    /**
     * Set <p>分层配置列表。</p>
     * @param Tiers <p>分层配置列表。</p>
     */
    public void setTiers(IntentRouterTierItem [] Tiers) {
        this.Tiers = Tiers;
    }

    /**
     * Get <p>更新时间（ISO 8601格式）。</p> 
     * @return UpdatedTime <p>更新时间（ISO 8601格式）。</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>更新时间（ISO 8601格式）。</p>
     * @param UpdatedTime <p>更新时间（ISO 8601格式）。</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public IntentRouterItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentRouterItem(IntentRouterItem source) {
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.IntentRouterId != null) {
            this.IntentRouterId = new String(source.IntentRouterId);
        }
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.RouterDescribe != null) {
            this.RouterDescribe = new String(source.RouterDescribe);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tiers != null) {
            this.Tiers = new IntentRouterTierItem[source.Tiers.length];
            for (int i = 0; i < source.Tiers.length; i++) {
                this.Tiers[i] = new IntentRouterTierItem(source.Tiers[i]);
            }
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "IntentRouterId", this.IntentRouterId);
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamSimple(map, prefix + "RouterDescribe", this.RouterDescribe);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tiers.", this.Tiers);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

