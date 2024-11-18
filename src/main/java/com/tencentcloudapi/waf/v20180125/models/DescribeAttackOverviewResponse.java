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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttackOverviewResponse extends AbstractModel {

    /**
    * 访问请求总数
    */
    @SerializedName("AccessCount")
    @Expose
    private Long AccessCount;

    /**
    * Web攻击总数
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * 访问控制总数
    */
    @SerializedName("ACLCount")
    @Expose
    private Long ACLCount;

    /**
    * CC攻击总数
    */
    @SerializedName("CCCount")
    @Expose
    private Long CCCount;

    /**
    * Bot攻击总数
    */
    @SerializedName("BotCount")
    @Expose
    private Long BotCount;

    /**
    * api资产总数
    */
    @SerializedName("ApiAssetsCount")
    @Expose
    private Long ApiAssetsCount;

    /**
    * api风险事件数量
    */
    @SerializedName("ApiRiskEventCount")
    @Expose
    private Long ApiRiskEventCount;

    /**
    * 黑名单总数
    */
    @SerializedName("IPBlackCount")
    @Expose
    private Long IPBlackCount;

    /**
    * 防篡改总数
    */
    @SerializedName("TamperCount")
    @Expose
    private Long TamperCount;

    /**
    * 信息泄露总数
    */
    @SerializedName("LeakCount")
    @Expose
    private Long LeakCount;

    /**
    * API风险事件周环比
    */
    @SerializedName("ApiRiskEventCircleCount")
    @Expose
    private Long ApiRiskEventCircleCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 访问请求总数 
     * @return AccessCount 访问请求总数
     */
    public Long getAccessCount() {
        return this.AccessCount;
    }

    /**
     * Set 访问请求总数
     * @param AccessCount 访问请求总数
     */
    public void setAccessCount(Long AccessCount) {
        this.AccessCount = AccessCount;
    }

    /**
     * Get Web攻击总数 
     * @return AttackCount Web攻击总数
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set Web攻击总数
     * @param AttackCount Web攻击总数
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get 访问控制总数 
     * @return ACLCount 访问控制总数
     */
    public Long getACLCount() {
        return this.ACLCount;
    }

    /**
     * Set 访问控制总数
     * @param ACLCount 访问控制总数
     */
    public void setACLCount(Long ACLCount) {
        this.ACLCount = ACLCount;
    }

    /**
     * Get CC攻击总数 
     * @return CCCount CC攻击总数
     */
    public Long getCCCount() {
        return this.CCCount;
    }

    /**
     * Set CC攻击总数
     * @param CCCount CC攻击总数
     */
    public void setCCCount(Long CCCount) {
        this.CCCount = CCCount;
    }

    /**
     * Get Bot攻击总数 
     * @return BotCount Bot攻击总数
     */
    public Long getBotCount() {
        return this.BotCount;
    }

    /**
     * Set Bot攻击总数
     * @param BotCount Bot攻击总数
     */
    public void setBotCount(Long BotCount) {
        this.BotCount = BotCount;
    }

    /**
     * Get api资产总数 
     * @return ApiAssetsCount api资产总数
     */
    public Long getApiAssetsCount() {
        return this.ApiAssetsCount;
    }

    /**
     * Set api资产总数
     * @param ApiAssetsCount api资产总数
     */
    public void setApiAssetsCount(Long ApiAssetsCount) {
        this.ApiAssetsCount = ApiAssetsCount;
    }

    /**
     * Get api风险事件数量 
     * @return ApiRiskEventCount api风险事件数量
     */
    public Long getApiRiskEventCount() {
        return this.ApiRiskEventCount;
    }

    /**
     * Set api风险事件数量
     * @param ApiRiskEventCount api风险事件数量
     */
    public void setApiRiskEventCount(Long ApiRiskEventCount) {
        this.ApiRiskEventCount = ApiRiskEventCount;
    }

    /**
     * Get 黑名单总数 
     * @return IPBlackCount 黑名单总数
     */
    public Long getIPBlackCount() {
        return this.IPBlackCount;
    }

    /**
     * Set 黑名单总数
     * @param IPBlackCount 黑名单总数
     */
    public void setIPBlackCount(Long IPBlackCount) {
        this.IPBlackCount = IPBlackCount;
    }

    /**
     * Get 防篡改总数 
     * @return TamperCount 防篡改总数
     */
    public Long getTamperCount() {
        return this.TamperCount;
    }

    /**
     * Set 防篡改总数
     * @param TamperCount 防篡改总数
     */
    public void setTamperCount(Long TamperCount) {
        this.TamperCount = TamperCount;
    }

    /**
     * Get 信息泄露总数 
     * @return LeakCount 信息泄露总数
     */
    public Long getLeakCount() {
        return this.LeakCount;
    }

    /**
     * Set 信息泄露总数
     * @param LeakCount 信息泄露总数
     */
    public void setLeakCount(Long LeakCount) {
        this.LeakCount = LeakCount;
    }

    /**
     * Get API风险事件周环比 
     * @return ApiRiskEventCircleCount API风险事件周环比
     */
    public Long getApiRiskEventCircleCount() {
        return this.ApiRiskEventCircleCount;
    }

    /**
     * Set API风险事件周环比
     * @param ApiRiskEventCircleCount API风险事件周环比
     */
    public void setApiRiskEventCircleCount(Long ApiRiskEventCircleCount) {
        this.ApiRiskEventCircleCount = ApiRiskEventCircleCount;
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

    public DescribeAttackOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackOverviewResponse(DescribeAttackOverviewResponse source) {
        if (source.AccessCount != null) {
            this.AccessCount = new Long(source.AccessCount);
        }
        if (source.AttackCount != null) {
            this.AttackCount = new Long(source.AttackCount);
        }
        if (source.ACLCount != null) {
            this.ACLCount = new Long(source.ACLCount);
        }
        if (source.CCCount != null) {
            this.CCCount = new Long(source.CCCount);
        }
        if (source.BotCount != null) {
            this.BotCount = new Long(source.BotCount);
        }
        if (source.ApiAssetsCount != null) {
            this.ApiAssetsCount = new Long(source.ApiAssetsCount);
        }
        if (source.ApiRiskEventCount != null) {
            this.ApiRiskEventCount = new Long(source.ApiRiskEventCount);
        }
        if (source.IPBlackCount != null) {
            this.IPBlackCount = new Long(source.IPBlackCount);
        }
        if (source.TamperCount != null) {
            this.TamperCount = new Long(source.TamperCount);
        }
        if (source.LeakCount != null) {
            this.LeakCount = new Long(source.LeakCount);
        }
        if (source.ApiRiskEventCircleCount != null) {
            this.ApiRiskEventCircleCount = new Long(source.ApiRiskEventCircleCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessCount", this.AccessCount);
        this.setParamSimple(map, prefix + "AttackCount", this.AttackCount);
        this.setParamSimple(map, prefix + "ACLCount", this.ACLCount);
        this.setParamSimple(map, prefix + "CCCount", this.CCCount);
        this.setParamSimple(map, prefix + "BotCount", this.BotCount);
        this.setParamSimple(map, prefix + "ApiAssetsCount", this.ApiAssetsCount);
        this.setParamSimple(map, prefix + "ApiRiskEventCount", this.ApiRiskEventCount);
        this.setParamSimple(map, prefix + "IPBlackCount", this.IPBlackCount);
        this.setParamSimple(map, prefix + "TamperCount", this.TamperCount);
        this.setParamSimple(map, prefix + "LeakCount", this.LeakCount);
        this.setParamSimple(map, prefix + "ApiRiskEventCircleCount", this.ApiRiskEventCircleCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

