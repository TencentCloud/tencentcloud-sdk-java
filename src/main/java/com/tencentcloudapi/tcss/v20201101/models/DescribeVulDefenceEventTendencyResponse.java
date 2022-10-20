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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDefenceEventTendencyResponse extends AbstractModel{

    /**
    * 漏洞防御事件趋势
    */
    @SerializedName("DefendedList")
    @Expose
    private VulDefenceEventTendency [] DefendedList;

    /**
    * 漏洞攻击事件趋势
    */
    @SerializedName("AttackList")
    @Expose
    private VulDefenceEventTendency [] AttackList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 漏洞防御事件趋势 
     * @return DefendedList 漏洞防御事件趋势
     */
    public VulDefenceEventTendency [] getDefendedList() {
        return this.DefendedList;
    }

    /**
     * Set 漏洞防御事件趋势
     * @param DefendedList 漏洞防御事件趋势
     */
    public void setDefendedList(VulDefenceEventTendency [] DefendedList) {
        this.DefendedList = DefendedList;
    }

    /**
     * Get 漏洞攻击事件趋势 
     * @return AttackList 漏洞攻击事件趋势
     */
    public VulDefenceEventTendency [] getAttackList() {
        return this.AttackList;
    }

    /**
     * Set 漏洞攻击事件趋势
     * @param AttackList 漏洞攻击事件趋势
     */
    public void setAttackList(VulDefenceEventTendency [] AttackList) {
        this.AttackList = AttackList;
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

    public DescribeVulDefenceEventTendencyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefenceEventTendencyResponse(DescribeVulDefenceEventTendencyResponse source) {
        if (source.DefendedList != null) {
            this.DefendedList = new VulDefenceEventTendency[source.DefendedList.length];
            for (int i = 0; i < source.DefendedList.length; i++) {
                this.DefendedList[i] = new VulDefenceEventTendency(source.DefendedList[i]);
            }
        }
        if (source.AttackList != null) {
            this.AttackList = new VulDefenceEventTendency[source.AttackList.length];
            for (int i = 0; i < source.AttackList.length; i++) {
                this.AttackList[i] = new VulDefenceEventTendency(source.AttackList[i]);
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
        this.setParamArrayObj(map, prefix + "DefendedList.", this.DefendedList);
        this.setParamArrayObj(map, prefix + "AttackList.", this.AttackList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

