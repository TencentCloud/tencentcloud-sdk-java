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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCloudNativeAPIGatewayCanaryRuleRequest extends AbstractModel {

    /**
    * 网关 ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 服务 ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 优先级列表，如果配置了此参数，将以此参数为准，忽略Priority参数
    */
    @SerializedName("PriorityList")
    @Expose
    private Long [] PriorityList;

    /**
     * Get 网关 ID 
     * @return GatewayId 网关 ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关 ID
     * @param GatewayId 网关 ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 服务 ID 
     * @return ServiceId 服务 ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务 ID
     * @param ServiceId 服务 ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 优先级 
     * @return Priority 优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
     * @param Priority 优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 优先级列表，如果配置了此参数，将以此参数为准，忽略Priority参数 
     * @return PriorityList 优先级列表，如果配置了此参数，将以此参数为准，忽略Priority参数
     */
    public Long [] getPriorityList() {
        return this.PriorityList;
    }

    /**
     * Set 优先级列表，如果配置了此参数，将以此参数为准，忽略Priority参数
     * @param PriorityList 优先级列表，如果配置了此参数，将以此参数为准，忽略Priority参数
     */
    public void setPriorityList(Long [] PriorityList) {
        this.PriorityList = PriorityList;
    }

    public DeleteCloudNativeAPIGatewayCanaryRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudNativeAPIGatewayCanaryRuleRequest(DeleteCloudNativeAPIGatewayCanaryRuleRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.PriorityList != null) {
            this.PriorityList = new Long[source.PriorityList.length];
            for (int i = 0; i < source.PriorityList.length; i++) {
                this.PriorityList[i] = new Long(source.PriorityList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArraySimple(map, prefix + "PriorityList.", this.PriorityList);

    }
}

