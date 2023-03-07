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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineDetectOverviewResponse extends AbstractModel{

    /**
    * 检测服务器数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 检测项
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * 检测策略项
    */
    @SerializedName("PolicyCount")
    @Expose
    private Long PolicyCount;

    /**
    * 通过率*100%
    */
    @SerializedName("PassRate")
    @Expose
    private Long PassRate;

    /**
    * 最近一次检测通过个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestPassCount")
    @Expose
    private Long LatestPassCount;

    /**
    * 最近一次检测未通过个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestNotPassCount")
    @Expose
    private Long LatestNotPassCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检测服务器数 
     * @return HostCount 检测服务器数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 检测服务器数
     * @param HostCount 检测服务器数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 检测项 
     * @return ItemCount 检测项
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set 检测项
     * @param ItemCount 检测项
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get 检测策略项 
     * @return PolicyCount 检测策略项
     */
    public Long getPolicyCount() {
        return this.PolicyCount;
    }

    /**
     * Set 检测策略项
     * @param PolicyCount 检测策略项
     */
    public void setPolicyCount(Long PolicyCount) {
        this.PolicyCount = PolicyCount;
    }

    /**
     * Get 通过率*100% 
     * @return PassRate 通过率*100%
     */
    public Long getPassRate() {
        return this.PassRate;
    }

    /**
     * Set 通过率*100%
     * @param PassRate 通过率*100%
     */
    public void setPassRate(Long PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get 最近一次检测通过个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestPassCount 最近一次检测通过个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLatestPassCount() {
        return this.LatestPassCount;
    }

    /**
     * Set 最近一次检测通过个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestPassCount 最近一次检测通过个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestPassCount(Long LatestPassCount) {
        this.LatestPassCount = LatestPassCount;
    }

    /**
     * Get 最近一次检测未通过个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestNotPassCount 最近一次检测未通过个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLatestNotPassCount() {
        return this.LatestNotPassCount;
    }

    /**
     * Set 最近一次检测未通过个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestNotPassCount 最近一次检测未通过个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestNotPassCount(Long LatestNotPassCount) {
        this.LatestNotPassCount = LatestNotPassCount;
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

    public DescribeBaselineDetectOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineDetectOverviewResponse(DescribeBaselineDetectOverviewResponse source) {
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.PolicyCount != null) {
            this.PolicyCount = new Long(source.PolicyCount);
        }
        if (source.PassRate != null) {
            this.PassRate = new Long(source.PassRate);
        }
        if (source.LatestPassCount != null) {
            this.LatestPassCount = new Long(source.LatestPassCount);
        }
        if (source.LatestNotPassCount != null) {
            this.LatestNotPassCount = new Long(source.LatestNotPassCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "PolicyCount", this.PolicyCount);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamSimple(map, prefix + "LatestPassCount", this.LatestPassCount);
        this.setParamSimple(map, prefix + "LatestNotPassCount", this.LatestNotPassCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

