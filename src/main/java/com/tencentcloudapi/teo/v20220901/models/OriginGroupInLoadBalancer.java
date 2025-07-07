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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupInLoadBalancer extends AbstractModel {

    /**
    * 优先级，填写格式为 "priority_" + "数字"，最高优先级为 "priority_1"。参考取值有：
<li>priority_1：第一优先级；</li>
<li>priority_2：第二优先级；</li>
<li>priority_3：第三优先级。</li>其他优先级可以将数字递增，最多可以递增至 "priority_10"。
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * 源站组 ID。
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
     * Get 优先级，填写格式为 "priority_" + "数字"，最高优先级为 "priority_1"。参考取值有：
<li>priority_1：第一优先级；</li>
<li>priority_2：第二优先级；</li>
<li>priority_3：第三优先级。</li>其他优先级可以将数字递增，最多可以递增至 "priority_10"。 
     * @return Priority 优先级，填写格式为 "priority_" + "数字"，最高优先级为 "priority_1"。参考取值有：
<li>priority_1：第一优先级；</li>
<li>priority_2：第二优先级；</li>
<li>priority_3：第三优先级。</li>其他优先级可以将数字递增，最多可以递增至 "priority_10"。
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级，填写格式为 "priority_" + "数字"，最高优先级为 "priority_1"。参考取值有：
<li>priority_1：第一优先级；</li>
<li>priority_2：第二优先级；</li>
<li>priority_3：第三优先级。</li>其他优先级可以将数字递增，最多可以递增至 "priority_10"。
     * @param Priority 优先级，填写格式为 "priority_" + "数字"，最高优先级为 "priority_1"。参考取值有：
<li>priority_1：第一优先级；</li>
<li>priority_2：第二优先级；</li>
<li>priority_3：第三优先级。</li>其他优先级可以将数字递增，最多可以递增至 "priority_10"。
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 源站组 ID。 
     * @return OriginGroupId 源站组 ID。
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set 源站组 ID。
     * @param OriginGroupId 源站组 ID。
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    public OriginGroupInLoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupInLoadBalancer(OriginGroupInLoadBalancer source) {
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
        }
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);

    }
}

