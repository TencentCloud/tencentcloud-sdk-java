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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAMQPRouteRelationRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Vhost名称
    */
    @SerializedName("VHostId")
    @Expose
    private String VHostId;

    /**
    * 路由关系ID
    */
    @SerializedName("RouteRelationId")
    @Expose
    private String RouteRelationId;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Vhost名称 
     * @return VHostId Vhost名称
     */
    public String getVHostId() {
        return this.VHostId;
    }

    /**
     * Set Vhost名称
     * @param VHostId Vhost名称
     */
    public void setVHostId(String VHostId) {
        this.VHostId = VHostId;
    }

    /**
     * Get 路由关系ID 
     * @return RouteRelationId 路由关系ID
     */
    public String getRouteRelationId() {
        return this.RouteRelationId;
    }

    /**
     * Set 路由关系ID
     * @param RouteRelationId 路由关系ID
     */
    public void setRouteRelationId(String RouteRelationId) {
        this.RouteRelationId = RouteRelationId;
    }

    public DeleteAMQPRouteRelationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAMQPRouteRelationRequest(DeleteAMQPRouteRelationRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VHostId != null) {
            this.VHostId = new String(source.VHostId);
        }
        if (source.RouteRelationId != null) {
            this.RouteRelationId = new String(source.RouteRelationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VHostId", this.VHostId);
        this.setParamSimple(map, prefix + "RouteRelationId", this.RouteRelationId);

    }
}

