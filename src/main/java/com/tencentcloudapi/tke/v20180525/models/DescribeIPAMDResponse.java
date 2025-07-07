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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIPAMDResponse extends AbstractModel {

    /**
    * 是否安装了eniipamd组件
    */
    @SerializedName("EnableIPAMD")
    @Expose
    private Boolean EnableIPAMD;

    /**
    * 是否开启自定义podcidr，默认为false，已安装eniipamd组件才意义
    */
    @SerializedName("EnableCustomizedPodCidr")
    @Expose
    private Boolean EnableCustomizedPodCidr;

    /**
    * 是否不开启vpccni模式，默认为false，已安装eniipamd组件才意义
    */
    @SerializedName("DisableVpcCniMode")
    @Expose
    private Boolean DisableVpcCniMode;

    /**
    * 组件状态，已安装eniipamd组件才会有值
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * 错误信息，已安装eniipamd组件且状态为非running才会有错误信息
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 子网信息，已安装eniipamd组件才会有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 固定ip回收时间，已安装eniipamd组件才会有值
    */
    @SerializedName("ClaimExpiredDuration")
    @Expose
    private String ClaimExpiredDuration;

    /**
    * 是否开启了中继网卡模式
    */
    @SerializedName("EnableTrunkingENI")
    @Expose
    private Boolean EnableTrunkingENI;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否安装了eniipamd组件 
     * @return EnableIPAMD 是否安装了eniipamd组件
     */
    public Boolean getEnableIPAMD() {
        return this.EnableIPAMD;
    }

    /**
     * Set 是否安装了eniipamd组件
     * @param EnableIPAMD 是否安装了eniipamd组件
     */
    public void setEnableIPAMD(Boolean EnableIPAMD) {
        this.EnableIPAMD = EnableIPAMD;
    }

    /**
     * Get 是否开启自定义podcidr，默认为false，已安装eniipamd组件才意义 
     * @return EnableCustomizedPodCidr 是否开启自定义podcidr，默认为false，已安装eniipamd组件才意义
     */
    public Boolean getEnableCustomizedPodCidr() {
        return this.EnableCustomizedPodCidr;
    }

    /**
     * Set 是否开启自定义podcidr，默认为false，已安装eniipamd组件才意义
     * @param EnableCustomizedPodCidr 是否开启自定义podcidr，默认为false，已安装eniipamd组件才意义
     */
    public void setEnableCustomizedPodCidr(Boolean EnableCustomizedPodCidr) {
        this.EnableCustomizedPodCidr = EnableCustomizedPodCidr;
    }

    /**
     * Get 是否不开启vpccni模式，默认为false，已安装eniipamd组件才意义 
     * @return DisableVpcCniMode 是否不开启vpccni模式，默认为false，已安装eniipamd组件才意义
     */
    public Boolean getDisableVpcCniMode() {
        return this.DisableVpcCniMode;
    }

    /**
     * Set 是否不开启vpccni模式，默认为false，已安装eniipamd组件才意义
     * @param DisableVpcCniMode 是否不开启vpccni模式，默认为false，已安装eniipamd组件才意义
     */
    public void setDisableVpcCniMode(Boolean DisableVpcCniMode) {
        this.DisableVpcCniMode = DisableVpcCniMode;
    }

    /**
     * Get 组件状态，已安装eniipamd组件才会有值 
     * @return Phase 组件状态，已安装eniipamd组件才会有值
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set 组件状态，已安装eniipamd组件才会有值
     * @param Phase 组件状态，已安装eniipamd组件才会有值
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get 错误信息，已安装eniipamd组件且状态为非running才会有错误信息 
     * @return Reason 错误信息，已安装eniipamd组件且状态为非running才会有错误信息
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 错误信息，已安装eniipamd组件且状态为非running才会有错误信息
     * @param Reason 错误信息，已安装eniipamd组件且状态为非running才会有错误信息
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 子网信息，已安装eniipamd组件才会有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetIds 子网信息，已安装eniipamd组件才会有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网信息，已安装eniipamd组件才会有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetIds 子网信息，已安装eniipamd组件才会有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 固定ip回收时间，已安装eniipamd组件才会有值 
     * @return ClaimExpiredDuration 固定ip回收时间，已安装eniipamd组件才会有值
     */
    public String getClaimExpiredDuration() {
        return this.ClaimExpiredDuration;
    }

    /**
     * Set 固定ip回收时间，已安装eniipamd组件才会有值
     * @param ClaimExpiredDuration 固定ip回收时间，已安装eniipamd组件才会有值
     */
    public void setClaimExpiredDuration(String ClaimExpiredDuration) {
        this.ClaimExpiredDuration = ClaimExpiredDuration;
    }

    /**
     * Get 是否开启了中继网卡模式 
     * @return EnableTrunkingENI 是否开启了中继网卡模式
     */
    public Boolean getEnableTrunkingENI() {
        return this.EnableTrunkingENI;
    }

    /**
     * Set 是否开启了中继网卡模式
     * @param EnableTrunkingENI 是否开启了中继网卡模式
     */
    public void setEnableTrunkingENI(Boolean EnableTrunkingENI) {
        this.EnableTrunkingENI = EnableTrunkingENI;
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

    public DescribeIPAMDResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPAMDResponse(DescribeIPAMDResponse source) {
        if (source.EnableIPAMD != null) {
            this.EnableIPAMD = new Boolean(source.EnableIPAMD);
        }
        if (source.EnableCustomizedPodCidr != null) {
            this.EnableCustomizedPodCidr = new Boolean(source.EnableCustomizedPodCidr);
        }
        if (source.DisableVpcCniMode != null) {
            this.DisableVpcCniMode = new Boolean(source.DisableVpcCniMode);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.ClaimExpiredDuration != null) {
            this.ClaimExpiredDuration = new String(source.ClaimExpiredDuration);
        }
        if (source.EnableTrunkingENI != null) {
            this.EnableTrunkingENI = new Boolean(source.EnableTrunkingENI);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableIPAMD", this.EnableIPAMD);
        this.setParamSimple(map, prefix + "EnableCustomizedPodCidr", this.EnableCustomizedPodCidr);
        this.setParamSimple(map, prefix + "DisableVpcCniMode", this.DisableVpcCniMode);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "ClaimExpiredDuration", this.ClaimExpiredDuration);
        this.setParamSimple(map, prefix + "EnableTrunkingENI", this.EnableTrunkingENI);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

