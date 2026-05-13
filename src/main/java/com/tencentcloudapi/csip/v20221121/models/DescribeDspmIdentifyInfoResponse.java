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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmIdentifyInfoResponse extends AbstractModel {

    /**
    * 身份id
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * 身份统计信息
    */
    @SerializedName("IdentifyCount")
    @Expose
    private DspmIdentifyCount [] IdentifyCount;

    /**
    * 申请单个数
    */
    @SerializedName("ApplyOrderCount")
    @Expose
    private Long ApplyOrderCount;

    /**
    * 审批单个数
    */
    @SerializedName("ApproveOrderCount")
    @Expose
    private Long ApproveOrderCount;

    /**
    * 已审批个数
    */
    @SerializedName("ApproveHistoryCount")
    @Expose
    private Long ApproveHistoryCount;

    /**
    * 资产总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 云账号总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UinAccountCount")
    @Expose
    private Long UinAccountCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 身份id 
     * @return IdentifyId 身份id
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set 身份id
     * @param IdentifyId 身份id
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get 身份统计信息 
     * @return IdentifyCount 身份统计信息
     */
    public DspmIdentifyCount [] getIdentifyCount() {
        return this.IdentifyCount;
    }

    /**
     * Set 身份统计信息
     * @param IdentifyCount 身份统计信息
     */
    public void setIdentifyCount(DspmIdentifyCount [] IdentifyCount) {
        this.IdentifyCount = IdentifyCount;
    }

    /**
     * Get 申请单个数 
     * @return ApplyOrderCount 申请单个数
     */
    public Long getApplyOrderCount() {
        return this.ApplyOrderCount;
    }

    /**
     * Set 申请单个数
     * @param ApplyOrderCount 申请单个数
     */
    public void setApplyOrderCount(Long ApplyOrderCount) {
        this.ApplyOrderCount = ApplyOrderCount;
    }

    /**
     * Get 审批单个数 
     * @return ApproveOrderCount 审批单个数
     */
    public Long getApproveOrderCount() {
        return this.ApproveOrderCount;
    }

    /**
     * Set 审批单个数
     * @param ApproveOrderCount 审批单个数
     */
    public void setApproveOrderCount(Long ApproveOrderCount) {
        this.ApproveOrderCount = ApproveOrderCount;
    }

    /**
     * Get 已审批个数 
     * @return ApproveHistoryCount 已审批个数
     */
    public Long getApproveHistoryCount() {
        return this.ApproveHistoryCount;
    }

    /**
     * Set 已审批个数
     * @param ApproveHistoryCount 已审批个数
     */
    public void setApproveHistoryCount(Long ApproveHistoryCount) {
        this.ApproveHistoryCount = ApproveHistoryCount;
    }

    /**
     * Get 资产总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetCount 资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 资产总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetCount 资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 云账号总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UinAccountCount 云账号总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUinAccountCount() {
        return this.UinAccountCount;
    }

    /**
     * Set 云账号总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UinAccountCount 云账号总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUinAccountCount(Long UinAccountCount) {
        this.UinAccountCount = UinAccountCount;
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

    public DescribeDspmIdentifyInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmIdentifyInfoResponse(DescribeDspmIdentifyInfoResponse source) {
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.IdentifyCount != null) {
            this.IdentifyCount = new DspmIdentifyCount[source.IdentifyCount.length];
            for (int i = 0; i < source.IdentifyCount.length; i++) {
                this.IdentifyCount[i] = new DspmIdentifyCount(source.IdentifyCount[i]);
            }
        }
        if (source.ApplyOrderCount != null) {
            this.ApplyOrderCount = new Long(source.ApplyOrderCount);
        }
        if (source.ApproveOrderCount != null) {
            this.ApproveOrderCount = new Long(source.ApproveOrderCount);
        }
        if (source.ApproveHistoryCount != null) {
            this.ApproveHistoryCount = new Long(source.ApproveHistoryCount);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.UinAccountCount != null) {
            this.UinAccountCount = new Long(source.UinAccountCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamArrayObj(map, prefix + "IdentifyCount.", this.IdentifyCount);
        this.setParamSimple(map, prefix + "ApplyOrderCount", this.ApplyOrderCount);
        this.setParamSimple(map, prefix + "ApproveOrderCount", this.ApproveOrderCount);
        this.setParamSimple(map, prefix + "ApproveHistoryCount", this.ApproveHistoryCount);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "UinAccountCount", this.UinAccountCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

