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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQPublicAccessPointResponse extends AbstractModel {

    /**
    * 公网接入点状态：
0， 已开启
1， 已关闭
2，开启中
3，关闭中
4，修改中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 支付状态：
0, 未知
1，正常
2，欠费
    */
    @SerializedName("PayStatus")
    @Expose
    private Long PayStatus;

    /**
    * 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessUrl")
    @Expose
    private String AccessUrl;

    /**
    * 安全访问规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private PublicAccessRule [] Rules;

    /**
    * 带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 付费模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingFlow")
    @Expose
    private Boolean BillingFlow;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 公网接入点状态：
0， 已开启
1， 已关闭
2，开启中
3，关闭中
4，修改中 
     * @return Status 公网接入点状态：
0， 已开启
1， 已关闭
2，开启中
3，关闭中
4，修改中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 公网接入点状态：
0， 已开启
1， 已关闭
2，开启中
3，关闭中
4，修改中
     * @param Status 公网接入点状态：
0， 已开启
1， 已关闭
2，开启中
3，关闭中
4，修改中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 支付状态：
0, 未知
1，正常
2，欠费 
     * @return PayStatus 支付状态：
0, 未知
1，正常
2，欠费
     */
    public Long getPayStatus() {
        return this.PayStatus;
    }

    /**
     * Set 支付状态：
0, 未知
1，正常
2，欠费
     * @param PayStatus 支付状态：
0, 未知
1，正常
2，欠费
     */
    public void setPayStatus(Long PayStatus) {
        this.PayStatus = PayStatus;
    }

    /**
     * Get 接入点地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessUrl 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessUrl() {
        return this.AccessUrl;
    }

    /**
     * Set 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessUrl 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessUrl(String AccessUrl) {
        this.AccessUrl = AccessUrl;
    }

    /**
     * Get 安全访问规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 安全访问规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PublicAccessRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 安全访问规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 安全访问规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(PublicAccessRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth 带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth 带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 付费模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 付费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 付费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingFlow 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBillingFlow() {
        return this.BillingFlow;
    }

    /**
     * Set 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingFlow 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingFlow(Boolean BillingFlow) {
        this.BillingFlow = BillingFlow;
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

    public DescribeRocketMQPublicAccessPointResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQPublicAccessPointResponse(DescribeRocketMQPublicAccessPointResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PayStatus != null) {
            this.PayStatus = new Long(source.PayStatus);
        }
        if (source.AccessUrl != null) {
            this.AccessUrl = new String(source.AccessUrl);
        }
        if (source.Rules != null) {
            this.Rules = new PublicAccessRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PublicAccessRule(source.Rules[i]);
            }
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.BillingFlow != null) {
            this.BillingFlow = new Boolean(source.BillingFlow);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PayStatus", this.PayStatus);
        this.setParamSimple(map, prefix + "AccessUrl", this.AccessUrl);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "BillingFlow", this.BillingFlow);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

