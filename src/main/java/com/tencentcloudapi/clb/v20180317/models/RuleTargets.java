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

public class RuleTargets extends AbstractModel{

    /**
    * 转发规则的 ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 转发规则的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则的路径。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 后端服务的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Targets")
    @Expose
    private Backend [] Targets;

    /**
     * Get 转发规则的 ID 
     * @return LocationId 转发规则的 ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则的 ID
     * @param LocationId 转发规则的 ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 转发规则的域名 
     * @return Domain 转发规则的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发规则的域名
     * @param Domain 转发规则的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发规则的路径。 
     * @return Url 转发规则的路径。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 转发规则的路径。
     * @param Url 转发规则的路径。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 后端服务的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Targets 后端服务的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Backend [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 后端服务的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Targets 后端服务的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargets(Backend [] Targets) {
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

