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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetServerWeightRequest extends AbstractModel {

    /**
    * 服务器舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 权重，最小值0，最大值10，默认值5
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 服务器舰队ID 
     * @return FleetId 服务器舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队ID
     * @param FleetId 服务器舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 权重，最小值0，最大值10，默认值5 
     * @return Weight 权重，最小值0，最大值10，默认值5
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重，最小值0，最大值10，默认值5
     * @param Weight 权重，最小值0，最大值10，默认值5
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public SetServerWeightRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetServerWeightRequest(SetServerWeightRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

