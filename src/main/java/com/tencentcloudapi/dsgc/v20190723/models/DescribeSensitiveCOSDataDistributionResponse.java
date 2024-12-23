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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSensitiveCOSDataDistributionResponse extends AbstractModel {

    /**
    * 分级分布
    */
    @SerializedName("LevelDistribution")
    @Expose
    private Note [] LevelDistribution;

    /**
    * 分类分布
    */
    @SerializedName("CategoryDistribution")
    @Expose
    private Note [] CategoryDistribution;

    /**
    * 规则分布详情
    */
    @SerializedName("RuleDistribution")
    @Expose
    private RuleDistribution [] RuleDistribution;

    /**
    * 计算占比
    */
    @SerializedName("SensitiveDataNum")
    @Expose
    private Long SensitiveDataNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分级分布 
     * @return LevelDistribution 分级分布
     */
    public Note [] getLevelDistribution() {
        return this.LevelDistribution;
    }

    /**
     * Set 分级分布
     * @param LevelDistribution 分级分布
     */
    public void setLevelDistribution(Note [] LevelDistribution) {
        this.LevelDistribution = LevelDistribution;
    }

    /**
     * Get 分类分布 
     * @return CategoryDistribution 分类分布
     */
    public Note [] getCategoryDistribution() {
        return this.CategoryDistribution;
    }

    /**
     * Set 分类分布
     * @param CategoryDistribution 分类分布
     */
    public void setCategoryDistribution(Note [] CategoryDistribution) {
        this.CategoryDistribution = CategoryDistribution;
    }

    /**
     * Get 规则分布详情 
     * @return RuleDistribution 规则分布详情
     */
    public RuleDistribution [] getRuleDistribution() {
        return this.RuleDistribution;
    }

    /**
     * Set 规则分布详情
     * @param RuleDistribution 规则分布详情
     */
    public void setRuleDistribution(RuleDistribution [] RuleDistribution) {
        this.RuleDistribution = RuleDistribution;
    }

    /**
     * Get 计算占比 
     * @return SensitiveDataNum 计算占比
     */
    public Long getSensitiveDataNum() {
        return this.SensitiveDataNum;
    }

    /**
     * Set 计算占比
     * @param SensitiveDataNum 计算占比
     */
    public void setSensitiveDataNum(Long SensitiveDataNum) {
        this.SensitiveDataNum = SensitiveDataNum;
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

    public DescribeSensitiveCOSDataDistributionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSensitiveCOSDataDistributionResponse(DescribeSensitiveCOSDataDistributionResponse source) {
        if (source.LevelDistribution != null) {
            this.LevelDistribution = new Note[source.LevelDistribution.length];
            for (int i = 0; i < source.LevelDistribution.length; i++) {
                this.LevelDistribution[i] = new Note(source.LevelDistribution[i]);
            }
        }
        if (source.CategoryDistribution != null) {
            this.CategoryDistribution = new Note[source.CategoryDistribution.length];
            for (int i = 0; i < source.CategoryDistribution.length; i++) {
                this.CategoryDistribution[i] = new Note(source.CategoryDistribution[i]);
            }
        }
        if (source.RuleDistribution != null) {
            this.RuleDistribution = new RuleDistribution[source.RuleDistribution.length];
            for (int i = 0; i < source.RuleDistribution.length; i++) {
                this.RuleDistribution[i] = new RuleDistribution(source.RuleDistribution[i]);
            }
        }
        if (source.SensitiveDataNum != null) {
            this.SensitiveDataNum = new Long(source.SensitiveDataNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LevelDistribution.", this.LevelDistribution);
        this.setParamArrayObj(map, prefix + "CategoryDistribution.", this.CategoryDistribution);
        this.setParamArrayObj(map, prefix + "RuleDistribution.", this.RuleDistribution);
        this.setParamSimple(map, prefix + "SensitiveDataNum", this.SensitiveDataNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

