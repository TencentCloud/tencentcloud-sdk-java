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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUpstreamTargetsRequest extends AbstractModel {

    /**
    * 网关实例ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 服务名称或ID
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例列表
    */
    @SerializedName("Targets")
    @Expose
    private KongTarget [] Targets;

    /**
     * Get 网关实例ID 
     * @return GatewayId 网关实例ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例ID
     * @param GatewayId 网关实例ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 服务名称或ID 
     * @return Name 服务名称或ID
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名称或ID
     * @param Name 服务名称或ID
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例列表 
     * @return Targets 实例列表
     */
    public KongTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 实例列表
     * @param Targets 实例列表
     */
    public void setTargets(KongTarget [] Targets) {
        this.Targets = Targets;
    }

    public UpdateUpstreamTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUpstreamTargetsRequest(UpdateUpstreamTargetsRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Targets != null) {
            this.Targets = new KongTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new KongTarget(source.Targets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);

    }
}

