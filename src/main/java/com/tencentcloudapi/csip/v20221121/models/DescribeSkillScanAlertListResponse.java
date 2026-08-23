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

public class DescribeSkillScanAlertListResponse extends AbstractModel {

    /**
    * 符合条件的告警总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 告警列表
    */
    @SerializedName("AlertList")
    @Expose
    private SkillScanAlertItem [] AlertList;

    /**
    * 融合规则目录全集（rule_id → rule_name），前端据此翻译 AlertList[].HitRules[].RuleID。语言通过云API公共参数 Language 切换
    */
    @SerializedName("RuleCatalog")
    @Expose
    private SkillRuleCatalogItem [] RuleCatalog;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的告警总数 
     * @return TotalCount 符合条件的告警总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的告警总数
     * @param TotalCount 符合条件的告警总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 告警列表 
     * @return AlertList 告警列表
     */
    public SkillScanAlertItem [] getAlertList() {
        return this.AlertList;
    }

    /**
     * Set 告警列表
     * @param AlertList 告警列表
     */
    public void setAlertList(SkillScanAlertItem [] AlertList) {
        this.AlertList = AlertList;
    }

    /**
     * Get 融合规则目录全集（rule_id → rule_name），前端据此翻译 AlertList[].HitRules[].RuleID。语言通过云API公共参数 Language 切换 
     * @return RuleCatalog 融合规则目录全集（rule_id → rule_name），前端据此翻译 AlertList[].HitRules[].RuleID。语言通过云API公共参数 Language 切换
     */
    public SkillRuleCatalogItem [] getRuleCatalog() {
        return this.RuleCatalog;
    }

    /**
     * Set 融合规则目录全集（rule_id → rule_name），前端据此翻译 AlertList[].HitRules[].RuleID。语言通过云API公共参数 Language 切换
     * @param RuleCatalog 融合规则目录全集（rule_id → rule_name），前端据此翻译 AlertList[].HitRules[].RuleID。语言通过云API公共参数 Language 切换
     */
    public void setRuleCatalog(SkillRuleCatalogItem [] RuleCatalog) {
        this.RuleCatalog = RuleCatalog;
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

    public DescribeSkillScanAlertListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanAlertListResponse(DescribeSkillScanAlertListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AlertList != null) {
            this.AlertList = new SkillScanAlertItem[source.AlertList.length];
            for (int i = 0; i < source.AlertList.length; i++) {
                this.AlertList[i] = new SkillScanAlertItem(source.AlertList[i]);
            }
        }
        if (source.RuleCatalog != null) {
            this.RuleCatalog = new SkillRuleCatalogItem[source.RuleCatalog.length];
            for (int i = 0; i < source.RuleCatalog.length; i++) {
                this.RuleCatalog[i] = new SkillRuleCatalogItem(source.RuleCatalog[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AlertList.", this.AlertList);
        this.setParamArrayObj(map, prefix + "RuleCatalog.", this.RuleCatalog);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

