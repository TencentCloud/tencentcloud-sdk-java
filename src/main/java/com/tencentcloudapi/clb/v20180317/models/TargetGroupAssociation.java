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

public class TargetGroupAssociation extends AbstractModel {

    /**
    * 负载均衡ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 目标组ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 监听器ID。访问AssociateTargetGroups和DisassociateTargetGroups接口时必传此参数。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 转发规则ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 目标组权重，范围[0, 100]。仅绑定v2目标组时生效，如果不存在，则默认为10。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 负载均衡ID 
     * @return LoadBalancerId 负载均衡ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡ID
     * @param LoadBalancerId 负载均衡ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 目标组ID 
     * @return TargetGroupId 目标组ID
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组ID
     * @param TargetGroupId 目标组ID
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 监听器ID。访问AssociateTargetGroups和DisassociateTargetGroups接口时必传此参数。 
     * @return ListenerId 监听器ID。访问AssociateTargetGroups和DisassociateTargetGroups接口时必传此参数。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID。访问AssociateTargetGroups和DisassociateTargetGroups接口时必传此参数。
     * @param ListenerId 监听器ID。访问AssociateTargetGroups和DisassociateTargetGroups接口时必传此参数。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

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
     * Get 目标组权重，范围[0, 100]。仅绑定v2目标组时生效，如果不存在，则默认为10。 
     * @return Weight 目标组权重，范围[0, 100]。仅绑定v2目标组时生效，如果不存在，则默认为10。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 目标组权重，范围[0, 100]。仅绑定v2目标组时生效，如果不存在，则默认为10。
     * @param Weight 目标组权重，范围[0, 100]。仅绑定v2目标组时生效，如果不存在，则默认为10。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetGroupAssociation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupAssociation(TargetGroupAssociation source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

