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

public class SetServerReservedRequest extends AbstractModel{

    /**
    * 扩缩容配置服务器舰队ID
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
    * 实例是否保留, 1-保留，0-不保留,默认
    */
    @SerializedName("ReserveValue")
    @Expose
    private Long ReserveValue;

    /**
     * Get 扩缩容配置服务器舰队ID 
     * @return FleetId 扩缩容配置服务器舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 扩缩容配置服务器舰队ID
     * @param FleetId 扩缩容配置服务器舰队ID
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
     * Get 实例是否保留, 1-保留，0-不保留,默认 
     * @return ReserveValue 实例是否保留, 1-保留，0-不保留,默认
     */
    public Long getReserveValue() {
        return this.ReserveValue;
    }

    /**
     * Set 实例是否保留, 1-保留，0-不保留,默认
     * @param ReserveValue 实例是否保留, 1-保留，0-不保留,默认
     */
    public void setReserveValue(Long ReserveValue) {
        this.ReserveValue = ReserveValue;
    }

    public SetServerReservedRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetServerReservedRequest(SetServerReservedRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReserveValue != null) {
            this.ReserveValue = new Long(source.ReserveValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReserveValue", this.ReserveValue);

    }
}

