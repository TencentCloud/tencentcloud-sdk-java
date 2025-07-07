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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCFrequencyRulesResponse extends AbstractModel {

    /**
    * 访问频率控制规则列表
    */
    @SerializedName("CCFrequencyRuleList")
    @Expose
    private CCFrequencyRule [] CCFrequencyRuleList;

    /**
    * 访问频率控制规则开关状态，取值[on(开启)，off(关闭)]
    */
    @SerializedName("CCFrequencyRuleStatus")
    @Expose
    private String CCFrequencyRuleStatus;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 访问频率控制规则列表 
     * @return CCFrequencyRuleList 访问频率控制规则列表
     */
    public CCFrequencyRule [] getCCFrequencyRuleList() {
        return this.CCFrequencyRuleList;
    }

    /**
     * Set 访问频率控制规则列表
     * @param CCFrequencyRuleList 访问频率控制规则列表
     */
    public void setCCFrequencyRuleList(CCFrequencyRule [] CCFrequencyRuleList) {
        this.CCFrequencyRuleList = CCFrequencyRuleList;
    }

    /**
     * Get 访问频率控制规则开关状态，取值[on(开启)，off(关闭)] 
     * @return CCFrequencyRuleStatus 访问频率控制规则开关状态，取值[on(开启)，off(关闭)]
     */
    public String getCCFrequencyRuleStatus() {
        return this.CCFrequencyRuleStatus;
    }

    /**
     * Set 访问频率控制规则开关状态，取值[on(开启)，off(关闭)]
     * @param CCFrequencyRuleStatus 访问频率控制规则开关状态，取值[on(开启)，off(关闭)]
     */
    public void setCCFrequencyRuleStatus(String CCFrequencyRuleStatus) {
        this.CCFrequencyRuleStatus = CCFrequencyRuleStatus;
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

    public DescribeCCFrequencyRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCFrequencyRulesResponse(DescribeCCFrequencyRulesResponse source) {
        if (source.CCFrequencyRuleList != null) {
            this.CCFrequencyRuleList = new CCFrequencyRule[source.CCFrequencyRuleList.length];
            for (int i = 0; i < source.CCFrequencyRuleList.length; i++) {
                this.CCFrequencyRuleList[i] = new CCFrequencyRule(source.CCFrequencyRuleList[i]);
            }
        }
        if (source.CCFrequencyRuleStatus != null) {
            this.CCFrequencyRuleStatus = new String(source.CCFrequencyRuleStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CCFrequencyRuleList.", this.CCFrequencyRuleList);
        this.setParamSimple(map, prefix + "CCFrequencyRuleStatus", this.CCFrequencyRuleStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

