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

public class DescribeAllocationRuleDetailResponse extends AbstractModel {

    /**
    * 公摊规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公摊规则所属UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 公摊规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 公摊策略类型，枚举值如下：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 公摊规则表达式
    */
    @SerializedName("RuleDetail")
    @Expose
    private AllocationRuleExpression RuleDetail;

    /**
    * 公摊比例表达式，Type为1和2时返回
    */
    @SerializedName("RatioDetail")
    @Expose
    private AllocationRationExpression [] RatioDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 公摊规则ID 
     * @return Id 公摊规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 公摊规则ID
     * @param Id 公摊规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公摊规则所属UIN 
     * @return Uin 公摊规则所属UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 公摊规则所属UIN
     * @param Uin 公摊规则所属UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 公摊规则名称 
     * @return Name 公摊规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 公摊规则名称
     * @param Name 公摊规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 公摊策略类型，枚举值如下：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊 
     * @return Type 公摊策略类型，枚举值如下：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 公摊策略类型，枚举值如下：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
     * @param Type 公摊策略类型，枚举值如下：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 公摊规则表达式 
     * @return RuleDetail 公摊规则表达式
     */
    public AllocationRuleExpression getRuleDetail() {
        return this.RuleDetail;
    }

    /**
     * Set 公摊规则表达式
     * @param RuleDetail 公摊规则表达式
     */
    public void setRuleDetail(AllocationRuleExpression RuleDetail) {
        this.RuleDetail = RuleDetail;
    }

    /**
     * Get 公摊比例表达式，Type为1和2时返回 
     * @return RatioDetail 公摊比例表达式，Type为1和2时返回
     */
    public AllocationRationExpression [] getRatioDetail() {
        return this.RatioDetail;
    }

    /**
     * Set 公摊比例表达式，Type为1和2时返回
     * @param RatioDetail 公摊比例表达式，Type为1和2时返回
     */
    public void setRatioDetail(AllocationRationExpression [] RatioDetail) {
        this.RatioDetail = RatioDetail;
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

    public DescribeAllocationRuleDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationRuleDetailResponse(DescribeAllocationRuleDetailResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RuleDetail != null) {
            this.RuleDetail = new AllocationRuleExpression(source.RuleDetail);
        }
        if (source.RatioDetail != null) {
            this.RatioDetail = new AllocationRationExpression[source.RatioDetail.length];
            for (int i = 0; i < source.RatioDetail.length; i++) {
                this.RatioDetail[i] = new AllocationRationExpression(source.RatioDetail[i]);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "RuleDetail.", this.RuleDetail);
        this.setParamArrayObj(map, prefix + "RatioDetail.", this.RatioDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

