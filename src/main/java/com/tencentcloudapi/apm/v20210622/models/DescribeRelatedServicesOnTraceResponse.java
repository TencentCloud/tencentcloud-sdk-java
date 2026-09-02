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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRelatedServicesOnTraceResponse extends AbstractModel {

    /**
    * 查询的总链路数
    */
    @SerializedName("TotalTraces")
    @Expose
    private Long TotalTraces;

    /**
    * 查询到的应用的数量
    */
    @SerializedName("TotalServices")
    @Expose
    private Long TotalServices;

    /**
    * 挑选的链路数量
    */
    @SerializedName("SelectedTraces")
    @Expose
    private Long SelectedTraces;

    /**
    * 相关的服务/应用名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceRelations")
    @Expose
    private ServiceRelation [] ServiceRelations;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询的总链路数 
     * @return TotalTraces 查询的总链路数
     */
    public Long getTotalTraces() {
        return this.TotalTraces;
    }

    /**
     * Set 查询的总链路数
     * @param TotalTraces 查询的总链路数
     */
    public void setTotalTraces(Long TotalTraces) {
        this.TotalTraces = TotalTraces;
    }

    /**
     * Get 查询到的应用的数量 
     * @return TotalServices 查询到的应用的数量
     */
    public Long getTotalServices() {
        return this.TotalServices;
    }

    /**
     * Set 查询到的应用的数量
     * @param TotalServices 查询到的应用的数量
     */
    public void setTotalServices(Long TotalServices) {
        this.TotalServices = TotalServices;
    }

    /**
     * Get 挑选的链路数量 
     * @return SelectedTraces 挑选的链路数量
     */
    public Long getSelectedTraces() {
        return this.SelectedTraces;
    }

    /**
     * Set 挑选的链路数量
     * @param SelectedTraces 挑选的链路数量
     */
    public void setSelectedTraces(Long SelectedTraces) {
        this.SelectedTraces = SelectedTraces;
    }

    /**
     * Get 相关的服务/应用名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceRelations 相关的服务/应用名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceRelation [] getServiceRelations() {
        return this.ServiceRelations;
    }

    /**
     * Set 相关的服务/应用名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceRelations 相关的服务/应用名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceRelations(ServiceRelation [] ServiceRelations) {
        this.ServiceRelations = ServiceRelations;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRelatedServicesOnTraceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelatedServicesOnTraceResponse(DescribeRelatedServicesOnTraceResponse source) {
        if (source.TotalTraces != null) {
            this.TotalTraces = new Long(source.TotalTraces);
        }
        if (source.TotalServices != null) {
            this.TotalServices = new Long(source.TotalServices);
        }
        if (source.SelectedTraces != null) {
            this.SelectedTraces = new Long(source.SelectedTraces);
        }
        if (source.ServiceRelations != null) {
            this.ServiceRelations = new ServiceRelation[source.ServiceRelations.length];
            for (int i = 0; i < source.ServiceRelations.length; i++) {
                this.ServiceRelations[i] = new ServiceRelation(source.ServiceRelations[i]);
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
        this.setParamSimple(map, prefix + "TotalTraces", this.TotalTraces);
        this.setParamSimple(map, prefix + "TotalServices", this.TotalServices);
        this.setParamSimple(map, prefix + "SelectedTraces", this.SelectedTraces);
        this.setParamArrayObj(map, prefix + "ServiceRelations.", this.ServiceRelations);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

