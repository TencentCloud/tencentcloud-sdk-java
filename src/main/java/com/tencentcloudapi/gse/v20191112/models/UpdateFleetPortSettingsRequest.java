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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFleetPortSettingsRequest extends AbstractModel{

    /**
    * 服务器舰队 Id
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 新增安全组
    */
    @SerializedName("InboundPermissionAuthorizations")
    @Expose
    private InboundPermissionAuthorization [] InboundPermissionAuthorizations;

    /**
    * 移除安全组
    */
    @SerializedName("InboundPermissionRevocations")
    @Expose
    private InboundPermissionRevocations [] InboundPermissionRevocations;

    /**
     * Get 服务器舰队 Id 
     * @return FleetId 服务器舰队 Id
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队 Id
     * @param FleetId 服务器舰队 Id
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 新增安全组 
     * @return InboundPermissionAuthorizations 新增安全组
     */
    public InboundPermissionAuthorization [] getInboundPermissionAuthorizations() {
        return this.InboundPermissionAuthorizations;
    }

    /**
     * Set 新增安全组
     * @param InboundPermissionAuthorizations 新增安全组
     */
    public void setInboundPermissionAuthorizations(InboundPermissionAuthorization [] InboundPermissionAuthorizations) {
        this.InboundPermissionAuthorizations = InboundPermissionAuthorizations;
    }

    /**
     * Get 移除安全组 
     * @return InboundPermissionRevocations 移除安全组
     */
    public InboundPermissionRevocations [] getInboundPermissionRevocations() {
        return this.InboundPermissionRevocations;
    }

    /**
     * Set 移除安全组
     * @param InboundPermissionRevocations 移除安全组
     */
    public void setInboundPermissionRevocations(InboundPermissionRevocations [] InboundPermissionRevocations) {
        this.InboundPermissionRevocations = InboundPermissionRevocations;
    }

    public UpdateFleetPortSettingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFleetPortSettingsRequest(UpdateFleetPortSettingsRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.InboundPermissionAuthorizations != null) {
            this.InboundPermissionAuthorizations = new InboundPermissionAuthorization[source.InboundPermissionAuthorizations.length];
            for (int i = 0; i < source.InboundPermissionAuthorizations.length; i++) {
                this.InboundPermissionAuthorizations[i] = new InboundPermissionAuthorization(source.InboundPermissionAuthorizations[i]);
            }
        }
        if (source.InboundPermissionRevocations != null) {
            this.InboundPermissionRevocations = new InboundPermissionRevocations[source.InboundPermissionRevocations.length];
            for (int i = 0; i < source.InboundPermissionRevocations.length; i++) {
                this.InboundPermissionRevocations[i] = new InboundPermissionRevocations(source.InboundPermissionRevocations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamArrayObj(map, prefix + "InboundPermissionAuthorizations.", this.InboundPermissionAuthorizations);
        this.setParamArrayObj(map, prefix + "InboundPermissionRevocations.", this.InboundPermissionRevocations);

    }
}

