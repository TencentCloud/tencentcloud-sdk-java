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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScdnTopDataResponse extends AbstractModel{

    /**
    * WAF 攻击类型统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopTypeData")
    @Expose
    private ScdnTypeData [] TopTypeData;

    /**
    * TOP 攻击源 IP 统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopIpData")
    @Expose
    private ScdnTopData [] TopIpData;

    /**
    * 查询的SCDN类型，当前仅支持 waf
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * TOP URL 统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopUrlData")
    @Expose
    private ScdnTopUrlData [] TopUrlData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get WAF 攻击类型统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopTypeData WAF 攻击类型统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnTypeData [] getTopTypeData() {
        return this.TopTypeData;
    }

    /**
     * Set WAF 攻击类型统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopTypeData WAF 攻击类型统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopTypeData(ScdnTypeData [] TopTypeData) {
        this.TopTypeData = TopTypeData;
    }

    /**
     * Get TOP 攻击源 IP 统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopIpData TOP 攻击源 IP 统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnTopData [] getTopIpData() {
        return this.TopIpData;
    }

    /**
     * Set TOP 攻击源 IP 统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopIpData TOP 攻击源 IP 统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopIpData(ScdnTopData [] TopIpData) {
        this.TopIpData = TopIpData;
    }

    /**
     * Get 查询的SCDN类型，当前仅支持 waf 
     * @return Mode 查询的SCDN类型，当前仅支持 waf
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 查询的SCDN类型，当前仅支持 waf
     * @param Mode 查询的SCDN类型，当前仅支持 waf
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get TOP URL 统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopUrlData TOP URL 统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnTopUrlData [] getTopUrlData() {
        return this.TopUrlData;
    }

    /**
     * Set TOP URL 统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopUrlData TOP URL 统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopUrlData(ScdnTopUrlData [] TopUrlData) {
        this.TopUrlData = TopUrlData;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopTypeData.", this.TopTypeData);
        this.setParamArrayObj(map, prefix + "TopIpData.", this.TopIpData);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "TopUrlData.", this.TopUrlData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

