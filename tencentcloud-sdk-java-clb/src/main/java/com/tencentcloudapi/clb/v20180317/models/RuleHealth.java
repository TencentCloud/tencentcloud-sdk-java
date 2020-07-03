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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleHealth extends AbstractModel{

    /**
    * 转发规则ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 转发规则的域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则的Url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Targets")
    @Expose
    private TargetHealth [] Targets;

    /**
     * Get 转发规则ID 
     * @return LocationId 转发规则ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则ID
     * @param LocationId 转发规则ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 转发规则的域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 转发规则的域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发规则的域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 转发规则的域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发规则的Url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 转发规则的Url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 转发规则的Url
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 转发规则的Url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Targets 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetHealth [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Targets 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargets(TargetHealth [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);

    }
}

