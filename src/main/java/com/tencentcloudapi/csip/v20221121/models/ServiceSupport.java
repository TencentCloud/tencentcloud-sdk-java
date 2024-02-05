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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceSupport extends AbstractModel {

    /**
    * 产品名称:
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 已处理的资产总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportHandledCount")
    @Expose
    private Long SupportHandledCount;

    /**
    * 支持的资产总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportTotalCount")
    @Expose
    private Long SupportTotalCount;

    /**
    * 是否支持该产品1支持；0不支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupport")
    @Expose
    private Boolean IsSupport;

    /**
     * Get 产品名称:
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 产品名称:
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 产品名称:
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 产品名称:
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 已处理的资产总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportHandledCount 已处理的资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSupportHandledCount() {
        return this.SupportHandledCount;
    }

    /**
     * Set 已处理的资产总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportHandledCount 已处理的资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportHandledCount(Long SupportHandledCount) {
        this.SupportHandledCount = SupportHandledCount;
    }

    /**
     * Get 支持的资产总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportTotalCount 支持的资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSupportTotalCount() {
        return this.SupportTotalCount;
    }

    /**
     * Set 支持的资产总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportTotalCount 支持的资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportTotalCount(Long SupportTotalCount) {
        this.SupportTotalCount = SupportTotalCount;
    }

    /**
     * Get 是否支持该产品1支持；0不支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupport 是否支持该产品1支持；0不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSupport() {
        return this.IsSupport;
    }

    /**
     * Set 是否支持该产品1支持；0不支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupport 是否支持该产品1支持；0不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupport(Boolean IsSupport) {
        this.IsSupport = IsSupport;
    }

    public ServiceSupport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceSupport(ServiceSupport source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.SupportHandledCount != null) {
            this.SupportHandledCount = new Long(source.SupportHandledCount);
        }
        if (source.SupportTotalCount != null) {
            this.SupportTotalCount = new Long(source.SupportTotalCount);
        }
        if (source.IsSupport != null) {
            this.IsSupport = new Boolean(source.IsSupport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "SupportHandledCount", this.SupportHandledCount);
        this.setParamSimple(map, prefix + "SupportTotalCount", this.SupportTotalCount);
        this.setParamSimple(map, prefix + "IsSupport", this.IsSupport);

    }
}

