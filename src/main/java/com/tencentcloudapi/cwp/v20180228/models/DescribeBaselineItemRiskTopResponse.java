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

public class DescribeBaselineItemRiskTopResponse extends AbstractModel{

    /**
    * 结果数组
    */
    @SerializedName("RiskItemTop5")
    @Expose
    private BaselineRiskItem [] RiskItemTop5;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 结果数组 
     * @return RiskItemTop5 结果数组
     */
    public BaselineRiskItem [] getRiskItemTop5() {
        return this.RiskItemTop5;
    }

    /**
     * Set 结果数组
     * @param RiskItemTop5 结果数组
     */
    public void setRiskItemTop5(BaselineRiskItem [] RiskItemTop5) {
        this.RiskItemTop5 = RiskItemTop5;
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

    public DescribeBaselineItemRiskTopResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineItemRiskTopResponse(DescribeBaselineItemRiskTopResponse source) {
        if (source.RiskItemTop5 != null) {
            this.RiskItemTop5 = new BaselineRiskItem[source.RiskItemTop5.length];
            for (int i = 0; i < source.RiskItemTop5.length; i++) {
                this.RiskItemTop5[i] = new BaselineRiskItem(source.RiskItemTop5[i]);
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
        this.setParamArrayObj(map, prefix + "RiskItemTop5.", this.RiskItemTop5);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

