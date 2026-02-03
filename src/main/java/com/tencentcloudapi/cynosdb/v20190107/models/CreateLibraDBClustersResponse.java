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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLibraDBClustersResponse extends AbstractModel {

    /**
    * 预付费总订单号
    */
    @SerializedName("BigDealIds")
    @Expose
    private String [] BigDealIds;

    /**
    * 集群ID
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 每个资源对应一个dealName，业务需要根据dealName保证发货接口幂等
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * 冻结流水
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * 实例id
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 预付费总订单号 
     * @return BigDealIds 预付费总订单号
     */
    public String [] getBigDealIds() {
        return this.BigDealIds;
    }

    /**
     * Set 预付费总订单号
     * @param BigDealIds 预付费总订单号
     */
    public void setBigDealIds(String [] BigDealIds) {
        this.BigDealIds = BigDealIds;
    }

    /**
     * Get 集群ID 
     * @return ClusterIds 集群ID
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 集群ID
     * @param ClusterIds 集群ID
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 每个资源对应一个dealName，业务需要根据dealName保证发货接口幂等 
     * @return DealNames 每个资源对应一个dealName，业务需要根据dealName保证发货接口幂等
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 每个资源对应一个dealName，业务需要根据dealName保证发货接口幂等
     * @param DealNames 每个资源对应一个dealName，业务需要根据dealName保证发货接口幂等
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get 冻结流水 
     * @return TranId 冻结流水
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set 冻结流水
     * @param TranId 冻结流水
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get 实例id 
     * @return ResourceIds 实例id
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 实例id
     * @param ResourceIds 实例id
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
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

    public CreateLibraDBClustersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLibraDBClustersResponse(CreateLibraDBClustersResponse source) {
        if (source.BigDealIds != null) {
            this.BigDealIds = new String[source.BigDealIds.length];
            for (int i = 0; i < source.BigDealIds.length; i++) {
                this.BigDealIds[i] = new String(source.BigDealIds[i]);
            }
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
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
        this.setParamArraySimple(map, prefix + "BigDealIds.", this.BigDealIds);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

