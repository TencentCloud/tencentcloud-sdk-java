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

public class ModifyAlarmConfigRequest extends AbstractModel{

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
    * 告警维度值列表。
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * 告警阈值，不传或者传0表示不修改阈值。
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 是否使用默认值，只有在不传Threshold或者Threshold=0时该参数有效。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

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
     * Get 告警维度值列表。 
     * @return EntityList 告警维度值列表。
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set 告警维度值列表。
     * @param EntityList 告警维度值列表。
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get 告警阈值，不传或者传0表示不修改阈值。 
     * @return Threshold 告警阈值，不传或者传0表示不修改阈值。
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 告警阈值，不传或者传0表示不修改阈值。
     * @param Threshold 告警阈值，不传或者传0表示不修改阈值。
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 是否使用默认值，只有在不传Threshold或者Threshold=0时该参数有效。 
     * @return IsDefault 是否使用默认值，只有在不传Threshold或者Threshold=0时该参数有效。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否使用默认值，只有在不传Threshold或者Threshold=0时该参数有效。
     * @param IsDefault 是否使用默认值，只有在不传Threshold或者Threshold=0时该参数有效。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public ModifyAlarmConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmConfigRequest(ModifyAlarmConfigRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EntityList != null) {
            this.EntityList = new String[source.EntityList.length];
            for (int i = 0; i < source.EntityList.length; i++) {
                this.EntityList[i] = new String(source.EntityList[i]);
            }
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

