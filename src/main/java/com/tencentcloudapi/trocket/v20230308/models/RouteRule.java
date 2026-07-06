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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteRule extends AbstractModel {

    /**
    * <p>路由匹配条件</p>
    */
    @SerializedName("MatchCondition")
    @Expose
    private String MatchCondition;

    /**
    * <p>标签</p>
    */
    @SerializedName("TargetConsumerLabel")
    @Expose
    private String TargetConsumerLabel;

    /**
     * Get <p>路由匹配条件</p> 
     * @return MatchCondition <p>路由匹配条件</p>
     */
    public String getMatchCondition() {
        return this.MatchCondition;
    }

    /**
     * Set <p>路由匹配条件</p>
     * @param MatchCondition <p>路由匹配条件</p>
     */
    public void setMatchCondition(String MatchCondition) {
        this.MatchCondition = MatchCondition;
    }

    /**
     * Get <p>标签</p> 
     * @return TargetConsumerLabel <p>标签</p>
     */
    public String getTargetConsumerLabel() {
        return this.TargetConsumerLabel;
    }

    /**
     * Set <p>标签</p>
     * @param TargetConsumerLabel <p>标签</p>
     */
    public void setTargetConsumerLabel(String TargetConsumerLabel) {
        this.TargetConsumerLabel = TargetConsumerLabel;
    }

    public RouteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteRule(RouteRule source) {
        if (source.MatchCondition != null) {
            this.MatchCondition = new String(source.MatchCondition);
        }
        if (source.TargetConsumerLabel != null) {
            this.TargetConsumerLabel = new String(source.TargetConsumerLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchCondition", this.MatchCondition);
        this.setParamSimple(map, prefix + "TargetConsumerLabel", this.TargetConsumerLabel);

    }
}

