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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmSmsQuotaResponse extends AbstractModel {

    /**
    * 配额总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 总使用量
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * 短信配额信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaList")
    @Expose
    private DescribeAlarmSmsQuotaQuota [] QuotaList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 配额总数 
     * @return Total 配额总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 配额总数
     * @param Total 配额总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 总使用量 
     * @return Used 总使用量
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 总使用量
     * @param Used 总使用量
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get 短信配额信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaList 短信配额信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeAlarmSmsQuotaQuota [] getQuotaList() {
        return this.QuotaList;
    }

    /**
     * Set 短信配额信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaList 短信配额信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaList(DescribeAlarmSmsQuotaQuota [] QuotaList) {
        this.QuotaList = QuotaList;
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

    public DescribeAlarmSmsQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmSmsQuotaResponse(DescribeAlarmSmsQuotaResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.QuotaList != null) {
            this.QuotaList = new DescribeAlarmSmsQuotaQuota[source.QuotaList.length];
            for (int i = 0; i < source.QuotaList.length; i++) {
                this.QuotaList[i] = new DescribeAlarmSmsQuotaQuota(source.QuotaList[i]);
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
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamArrayObj(map, prefix + "QuotaList.", this.QuotaList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

