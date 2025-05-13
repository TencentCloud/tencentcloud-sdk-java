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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatherRuleDetailResponse extends AbstractModel {

    /**
    * 归集规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 归集规则所属UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 归集规则最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 归集规则详情
    */
    @SerializedName("RuleDetail")
    @Expose
    private AllocationRuleExpression RuleDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 归集规则ID 
     * @return Id 归集规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 归集规则ID
     * @param Id 归集规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 归集规则所属UIN 
     * @return Uin 归集规则所属UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 归集规则所属UIN
     * @param Uin 归集规则所属UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 归集规则最后更新时间 
     * @return UpdateTime 归集规则最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 归集规则最后更新时间
     * @param UpdateTime 归集规则最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 归集规则详情 
     * @return RuleDetail 归集规则详情
     */
    public AllocationRuleExpression getRuleDetail() {
        return this.RuleDetail;
    }

    /**
     * Set 归集规则详情
     * @param RuleDetail 归集规则详情
     */
    public void setRuleDetail(AllocationRuleExpression RuleDetail) {
        this.RuleDetail = RuleDetail;
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

    public DescribeGatherRuleDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatherRuleDetailResponse(DescribeGatherRuleDetailResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RuleDetail != null) {
            this.RuleDetail = new AllocationRuleExpression(source.RuleDetail);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "RuleDetail.", this.RuleDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

