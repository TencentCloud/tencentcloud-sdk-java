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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindItem extends AbstractModel {

    /**
    * 配置绑定的CLB ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 配置绑定的监听器ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 配置绑定的域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 配置绑定的规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
     * Get 配置绑定的CLB ID 
     * @return LoadBalancerId 配置绑定的CLB ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 配置绑定的CLB ID
     * @param LoadBalancerId 配置绑定的CLB ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 配置绑定的监听器ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerId 配置绑定的监听器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 配置绑定的监听器ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerId 配置绑定的监听器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 配置绑定的域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 配置绑定的域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 配置绑定的域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 配置绑定的域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 配置绑定的规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocationId 配置绑定的规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 配置绑定的规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocationId 配置绑定的规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    public BindItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindItem(BindItem source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);

    }
}

