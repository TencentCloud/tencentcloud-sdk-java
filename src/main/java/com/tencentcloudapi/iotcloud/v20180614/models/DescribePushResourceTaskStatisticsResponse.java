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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePushResourceTaskStatisticsResponse extends AbstractModel {

    /**
    * 推送成功的设备总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessTotal")
    @Expose
    private Long SuccessTotal;

    /**
    * 推送失败的设备总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureTotal")
    @Expose
    private Long FailureTotal;

    /**
    * 正在推送的设备总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpgradingTotal")
    @Expose
    private Long UpgradingTotal;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 推送成功的设备总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessTotal 推送成功的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessTotal() {
        return this.SuccessTotal;
    }

    /**
     * Set 推送成功的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessTotal 推送成功的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessTotal(Long SuccessTotal) {
        this.SuccessTotal = SuccessTotal;
    }

    /**
     * Get 推送失败的设备总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureTotal 推送失败的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailureTotal() {
        return this.FailureTotal;
    }

    /**
     * Set 推送失败的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureTotal 推送失败的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureTotal(Long FailureTotal) {
        this.FailureTotal = FailureTotal;
    }

    /**
     * Get 正在推送的设备总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpgradingTotal 正在推送的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpgradingTotal() {
        return this.UpgradingTotal;
    }

    /**
     * Set 正在推送的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpgradingTotal 正在推送的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpgradingTotal(Long UpgradingTotal) {
        this.UpgradingTotal = UpgradingTotal;
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

    public DescribePushResourceTaskStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePushResourceTaskStatisticsResponse(DescribePushResourceTaskStatisticsResponse source) {
        if (source.SuccessTotal != null) {
            this.SuccessTotal = new Long(source.SuccessTotal);
        }
        if (source.FailureTotal != null) {
            this.FailureTotal = new Long(source.FailureTotal);
        }
        if (source.UpgradingTotal != null) {
            this.UpgradingTotal = new Long(source.UpgradingTotal);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuccessTotal", this.SuccessTotal);
        this.setParamSimple(map, prefix + "FailureTotal", this.FailureTotal);
        this.setParamSimple(map, prefix + "UpgradingTotal", this.UpgradingTotal);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

