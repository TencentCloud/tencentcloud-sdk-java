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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaneTrafficEntry extends AbstractModel {

    /**
    *    // type == "polarismesh.cn/gateway/tse-gateway, 则 selector 为 TSEGatewaySelector
   // type == "polarismesh.cn/gateway/spring-cloud-gateway", 则 selector 为 ServiceGatewaySelector
   // type == "polarismesh.cn/service, 则 selector 为 ServiceSelector
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntryType")
    @Expose
    private String EntryType;

    /**
    * TSE云原生网关选择器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TSEGatewaySelector")
    @Expose
    private TSEGatewaySelector TSEGatewaySelector;

    /**
    * 微服务网关选择器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceGatewaySelector")
    @Expose
    private ServiceGatewaySelector ServiceGatewaySelector;

    /**
    * 普通微服务选择器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceSelector")
    @Expose
    private ServiceSelector ServiceSelector;

    /**
     * Get    // type == "polarismesh.cn/gateway/tse-gateway, 则 selector 为 TSEGatewaySelector
   // type == "polarismesh.cn/gateway/spring-cloud-gateway", 则 selector 为 ServiceGatewaySelector
   // type == "polarismesh.cn/service, 则 selector 为 ServiceSelector
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntryType    // type == "polarismesh.cn/gateway/tse-gateway, 则 selector 为 TSEGatewaySelector
   // type == "polarismesh.cn/gateway/spring-cloud-gateway", 则 selector 为 ServiceGatewaySelector
   // type == "polarismesh.cn/service, 则 selector 为 ServiceSelector
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntryType() {
        return this.EntryType;
    }

    /**
     * Set    // type == "polarismesh.cn/gateway/tse-gateway, 则 selector 为 TSEGatewaySelector
   // type == "polarismesh.cn/gateway/spring-cloud-gateway", 则 selector 为 ServiceGatewaySelector
   // type == "polarismesh.cn/service, 则 selector 为 ServiceSelector
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntryType    // type == "polarismesh.cn/gateway/tse-gateway, 则 selector 为 TSEGatewaySelector
   // type == "polarismesh.cn/gateway/spring-cloud-gateway", 则 selector 为 ServiceGatewaySelector
   // type == "polarismesh.cn/service, 则 selector 为 ServiceSelector
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntryType(String EntryType) {
        this.EntryType = EntryType;
    }

    /**
     * Get TSE云原生网关选择器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TSEGatewaySelector TSE云原生网关选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TSEGatewaySelector getTSEGatewaySelector() {
        return this.TSEGatewaySelector;
    }

    /**
     * Set TSE云原生网关选择器
注意：此字段可能返回 null，表示取不到有效值。
     * @param TSEGatewaySelector TSE云原生网关选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTSEGatewaySelector(TSEGatewaySelector TSEGatewaySelector) {
        this.TSEGatewaySelector = TSEGatewaySelector;
    }

    /**
     * Get 微服务网关选择器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceGatewaySelector 微服务网关选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceGatewaySelector getServiceGatewaySelector() {
        return this.ServiceGatewaySelector;
    }

    /**
     * Set 微服务网关选择器
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceGatewaySelector 微服务网关选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceGatewaySelector(ServiceGatewaySelector ServiceGatewaySelector) {
        this.ServiceGatewaySelector = ServiceGatewaySelector;
    }

    /**
     * Get 普通微服务选择器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceSelector 普通微服务选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceSelector getServiceSelector() {
        return this.ServiceSelector;
    }

    /**
     * Set 普通微服务选择器
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceSelector 普通微服务选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceSelector(ServiceSelector ServiceSelector) {
        this.ServiceSelector = ServiceSelector;
    }

    public LaneTrafficEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaneTrafficEntry(LaneTrafficEntry source) {
        if (source.EntryType != null) {
            this.EntryType = new String(source.EntryType);
        }
        if (source.TSEGatewaySelector != null) {
            this.TSEGatewaySelector = new TSEGatewaySelector(source.TSEGatewaySelector);
        }
        if (source.ServiceGatewaySelector != null) {
            this.ServiceGatewaySelector = new ServiceGatewaySelector(source.ServiceGatewaySelector);
        }
        if (source.ServiceSelector != null) {
            this.ServiceSelector = new ServiceSelector(source.ServiceSelector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntryType", this.EntryType);
        this.setParamObj(map, prefix + "TSEGatewaySelector.", this.TSEGatewaySelector);
        this.setParamObj(map, prefix + "ServiceGatewaySelector.", this.ServiceGatewaySelector);
        this.setParamObj(map, prefix + "ServiceSelector.", this.ServiceSelector);

    }
}

