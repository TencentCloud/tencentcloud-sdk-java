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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLoRaGatewayListResponse extends AbstractModel{

    /**
    * 返回总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 返回详情项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gateways")
    @Expose
    private LoRaGatewayItem [] Gateways;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回总数 
     * @return Total 返回总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 返回总数
     * @param Total 返回总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 返回详情项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gateways 返回详情项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoRaGatewayItem [] getGateways() {
        return this.Gateways;
    }

    /**
     * Set 返回详情项
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gateways 返回详情项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGateways(LoRaGatewayItem [] Gateways) {
        this.Gateways = Gateways;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetLoRaGatewayListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLoRaGatewayListResponse(GetLoRaGatewayListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Gateways != null) {
            this.Gateways = new LoRaGatewayItem[source.Gateways.length];
            for (int i = 0; i < source.Gateways.length; i++) {
                this.Gateways[i] = new LoRaGatewayItem(source.Gateways[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Gateways.", this.Gateways);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

