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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScreenHostInvasionResponse extends AbstractModel {

    /**
    * 网络攻击事件列表
    */
    @SerializedName("DefendAttackLog")
    @Expose
    private ScreenDefendAttackLog [] DefendAttackLog;

    /**
    * 入侵检测事件列表
    */
    @SerializedName("InvasionEvents")
    @Expose
    private ScreenInvasion [] InvasionEvents;

    /**
    * 漏洞事件列表
    */
    @SerializedName("Vul")
    @Expose
    private ScreenVulInfo [] Vul;

    /**
    * 基线事件列表
    */
    @SerializedName("Baseline")
    @Expose
    private ScreenBaselineInfo [] Baseline;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 网络攻击事件列表 
     * @return DefendAttackLog 网络攻击事件列表
     */
    public ScreenDefendAttackLog [] getDefendAttackLog() {
        return this.DefendAttackLog;
    }

    /**
     * Set 网络攻击事件列表
     * @param DefendAttackLog 网络攻击事件列表
     */
    public void setDefendAttackLog(ScreenDefendAttackLog [] DefendAttackLog) {
        this.DefendAttackLog = DefendAttackLog;
    }

    /**
     * Get 入侵检测事件列表 
     * @return InvasionEvents 入侵检测事件列表
     */
    public ScreenInvasion [] getInvasionEvents() {
        return this.InvasionEvents;
    }

    /**
     * Set 入侵检测事件列表
     * @param InvasionEvents 入侵检测事件列表
     */
    public void setInvasionEvents(ScreenInvasion [] InvasionEvents) {
        this.InvasionEvents = InvasionEvents;
    }

    /**
     * Get 漏洞事件列表 
     * @return Vul 漏洞事件列表
     */
    public ScreenVulInfo [] getVul() {
        return this.Vul;
    }

    /**
     * Set 漏洞事件列表
     * @param Vul 漏洞事件列表
     */
    public void setVul(ScreenVulInfo [] Vul) {
        this.Vul = Vul;
    }

    /**
     * Get 基线事件列表 
     * @return Baseline 基线事件列表
     */
    public ScreenBaselineInfo [] getBaseline() {
        return this.Baseline;
    }

    /**
     * Set 基线事件列表
     * @param Baseline 基线事件列表
     */
    public void setBaseline(ScreenBaselineInfo [] Baseline) {
        this.Baseline = Baseline;
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

    public DescribeScreenHostInvasionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScreenHostInvasionResponse(DescribeScreenHostInvasionResponse source) {
        if (source.DefendAttackLog != null) {
            this.DefendAttackLog = new ScreenDefendAttackLog[source.DefendAttackLog.length];
            for (int i = 0; i < source.DefendAttackLog.length; i++) {
                this.DefendAttackLog[i] = new ScreenDefendAttackLog(source.DefendAttackLog[i]);
            }
        }
        if (source.InvasionEvents != null) {
            this.InvasionEvents = new ScreenInvasion[source.InvasionEvents.length];
            for (int i = 0; i < source.InvasionEvents.length; i++) {
                this.InvasionEvents[i] = new ScreenInvasion(source.InvasionEvents[i]);
            }
        }
        if (source.Vul != null) {
            this.Vul = new ScreenVulInfo[source.Vul.length];
            for (int i = 0; i < source.Vul.length; i++) {
                this.Vul[i] = new ScreenVulInfo(source.Vul[i]);
            }
        }
        if (source.Baseline != null) {
            this.Baseline = new ScreenBaselineInfo[source.Baseline.length];
            for (int i = 0; i < source.Baseline.length; i++) {
                this.Baseline[i] = new ScreenBaselineInfo(source.Baseline[i]);
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
        this.setParamArrayObj(map, prefix + "DefendAttackLog.", this.DefendAttackLog);
        this.setParamArrayObj(map, prefix + "InvasionEvents.", this.InvasionEvents);
        this.setParamArrayObj(map, prefix + "Vul.", this.Vul);
        this.setParamArrayObj(map, prefix + "Baseline.", this.Baseline);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

