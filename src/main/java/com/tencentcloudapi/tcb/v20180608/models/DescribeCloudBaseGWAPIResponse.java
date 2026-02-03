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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseGWAPIResponse extends AbstractModel {

    /**
    * API列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("APISet")
    @Expose
    private CloudBaseGWAPI [] APISet;

    /**
    * 是否开启http调用
    */
    @SerializedName("EnableService")
    @Expose
    private Boolean EnableService;

    /**
    * 查询结果的数据总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get API列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return APISet API列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudBaseGWAPI [] getAPISet() {
        return this.APISet;
    }

    /**
     * Set API列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param APISet API列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAPISet(CloudBaseGWAPI [] APISet) {
        this.APISet = APISet;
    }

    /**
     * Get 是否开启http调用 
     * @return EnableService 是否开启http调用
     */
    public Boolean getEnableService() {
        return this.EnableService;
    }

    /**
     * Set 是否开启http调用
     * @param EnableService 是否开启http调用
     */
    public void setEnableService(Boolean EnableService) {
        this.EnableService = EnableService;
    }

    /**
     * Get 查询结果的数据总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 查询结果的数据总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 查询结果的数据总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 查询结果的数据总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Limit 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Limit 查询的分页参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    public DescribeCloudBaseGWAPIResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseGWAPIResponse(DescribeCloudBaseGWAPIResponse source) {
        if (source.APISet != null) {
            this.APISet = new CloudBaseGWAPI[source.APISet.length];
            for (int i = 0; i < source.APISet.length; i++) {
                this.APISet[i] = new CloudBaseGWAPI(source.APISet[i]);
            }
        }
        if (source.EnableService != null) {
            this.EnableService = new Boolean(source.EnableService);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "APISet.", this.APISet);
        this.setParamSimple(map, prefix + "EnableService", this.EnableService);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

