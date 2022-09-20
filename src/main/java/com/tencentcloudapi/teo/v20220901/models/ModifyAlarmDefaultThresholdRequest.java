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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmDefaultThresholdRequest extends AbstractModel{

    /**
    * 告警服务类型，取值有：
<li>ddos：ddos告警服务。</li>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 新的阈值，单位为Mbps，最小阈值为10。
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 防护实体，如果是四层防护，防护实体为通道ID。如果是七层防护，防护实体为站点名称。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
     * Get 告警服务类型，取值有：
<li>ddos：ddos告警服务。</li> 
     * @return ServiceType 告警服务类型，取值有：
<li>ddos：ddos告警服务。</li>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 告警服务类型，取值有：
<li>ddos：ddos告警服务。</li>
     * @param ServiceType 告警服务类型，取值有：
<li>ddos：ddos告警服务。</li>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 新的阈值，单位为Mbps，最小阈值为10。 
     * @return Threshold 新的阈值，单位为Mbps，最小阈值为10。
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 新的阈值，单位为Mbps，最小阈值为10。
     * @param Threshold 新的阈值，单位为Mbps，最小阈值为10。
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 防护实体，如果是四层防护，防护实体为通道ID。如果是七层防护，防护实体为站点名称。 
     * @return Entity 防护实体，如果是四层防护，防护实体为通道ID。如果是七层防护，防护实体为站点名称。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 防护实体，如果是四层防护，防护实体为通道ID。如果是七层防护，防护实体为站点名称。
     * @param Entity 防护实体，如果是四层防护，防护实体为通道ID。如果是七层防护，防护实体为站点名称。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    public ModifyAlarmDefaultThresholdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmDefaultThresholdRequest(ModifyAlarmDefaultThresholdRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Entity", this.Entity);

    }
}

