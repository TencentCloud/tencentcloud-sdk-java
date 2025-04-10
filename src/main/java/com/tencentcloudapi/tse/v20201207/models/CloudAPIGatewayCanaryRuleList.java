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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAPIGatewayCanaryRuleList extends AbstractModel {

    /**
    * 灰度规则
    */
    @SerializedName("CanaryRuleList")
    @Expose
    private CloudNativeAPIGatewayCanaryRule [] CanaryRuleList;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 灰度规则 
     * @return CanaryRuleList 灰度规则
     */
    public CloudNativeAPIGatewayCanaryRule [] getCanaryRuleList() {
        return this.CanaryRuleList;
    }

    /**
     * Set 灰度规则
     * @param CanaryRuleList 灰度规则
     */
    public void setCanaryRuleList(CloudNativeAPIGatewayCanaryRule [] CanaryRuleList) {
        this.CanaryRuleList = CanaryRuleList;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public CloudAPIGatewayCanaryRuleList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAPIGatewayCanaryRuleList(CloudAPIGatewayCanaryRuleList source) {
        if (source.CanaryRuleList != null) {
            this.CanaryRuleList = new CloudNativeAPIGatewayCanaryRule[source.CanaryRuleList.length];
            for (int i = 0; i < source.CanaryRuleList.length; i++) {
                this.CanaryRuleList[i] = new CloudNativeAPIGatewayCanaryRule(source.CanaryRuleList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CanaryRuleList.", this.CanaryRuleList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

