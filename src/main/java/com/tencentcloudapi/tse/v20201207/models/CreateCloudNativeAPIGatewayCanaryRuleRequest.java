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

public class CreateCloudNativeAPIGatewayCanaryRuleRequest extends AbstractModel {

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
    * 灰度规则配置
    */
    @SerializedName("CanaryRule")
    @Expose
    private CloudNativeAPIGatewayCanaryRule CanaryRule;

    /**
    * 灰度规则配置列表，如果配置了此参数，将以此参数为准，忽略CanaryRule参数
    */
    @SerializedName("CanaryRuleList")
    @Expose
    private CloudNativeAPIGatewayCanaryRule [] CanaryRuleList;

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
     * Get 灰度规则配置 
     * @return CanaryRule 灰度规则配置
     */
    public CloudNativeAPIGatewayCanaryRule getCanaryRule() {
        return this.CanaryRule;
    }

    /**
     * Set 灰度规则配置
     * @param CanaryRule 灰度规则配置
     */
    public void setCanaryRule(CloudNativeAPIGatewayCanaryRule CanaryRule) {
        this.CanaryRule = CanaryRule;
    }

    /**
     * Get 灰度规则配置列表，如果配置了此参数，将以此参数为准，忽略CanaryRule参数 
     * @return CanaryRuleList 灰度规则配置列表，如果配置了此参数，将以此参数为准，忽略CanaryRule参数
     */
    public CloudNativeAPIGatewayCanaryRule [] getCanaryRuleList() {
        return this.CanaryRuleList;
    }

    /**
     * Set 灰度规则配置列表，如果配置了此参数，将以此参数为准，忽略CanaryRule参数
     * @param CanaryRuleList 灰度规则配置列表，如果配置了此参数，将以此参数为准，忽略CanaryRule参数
     */
    public void setCanaryRuleList(CloudNativeAPIGatewayCanaryRule [] CanaryRuleList) {
        this.CanaryRuleList = CanaryRuleList;
    }

    public CreateCloudNativeAPIGatewayCanaryRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayCanaryRuleRequest(CreateCloudNativeAPIGatewayCanaryRuleRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.CanaryRule != null) {
            this.CanaryRule = new CloudNativeAPIGatewayCanaryRule(source.CanaryRule);
        }
        if (source.CanaryRuleList != null) {
            this.CanaryRuleList = new CloudNativeAPIGatewayCanaryRule[source.CanaryRuleList.length];
            for (int i = 0; i < source.CanaryRuleList.length; i++) {
                this.CanaryRuleList[i] = new CloudNativeAPIGatewayCanaryRule(source.CanaryRuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamObj(map, prefix + "CanaryRule.", this.CanaryRule);
        this.setParamArrayObj(map, prefix + "CanaryRuleList.", this.CanaryRuleList);

    }
}

