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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStrategyDispatchStatusResponse extends AbstractModel {

    /**
    * 进度
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 下发开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 下发结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 下发状态，0无变动，1下发中，2下发成功，3下发失败，4更新待下发
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 下发规则组数量
    */
    @SerializedName("RuleGroupNum")
    @Expose
    private Long RuleGroupNum;

    /**
    * 下发失败错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 下发关联策略id列表
    */
    @SerializedName("DispatchStrategyList")
    @Expose
    private String [] DispatchStrategyList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 进度 
     * @return Progress 进度
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度
     * @param Progress 进度
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 下发开始时间 
     * @return StartTime 下发开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 下发开始时间
     * @param StartTime 下发开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 下发结束时间 
     * @return EndTime 下发结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 下发结束时间
     * @param EndTime 下发结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 下发状态，0无变动，1下发中，2下发成功，3下发失败，4更新待下发 
     * @return Status 下发状态，0无变动，1下发中，2下发成功，3下发失败，4更新待下发
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 下发状态，0无变动，1下发中，2下发成功，3下发失败，4更新待下发
     * @param Status 下发状态，0无变动，1下发中，2下发成功，3下发失败，4更新待下发
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 下发规则组数量 
     * @return RuleGroupNum 下发规则组数量
     */
    public Long getRuleGroupNum() {
        return this.RuleGroupNum;
    }

    /**
     * Set 下发规则组数量
     * @param RuleGroupNum 下发规则组数量
     */
    public void setRuleGroupNum(Long RuleGroupNum) {
        this.RuleGroupNum = RuleGroupNum;
    }

    /**
     * Get 下发失败错误信息 
     * @return ErrorMsg 下发失败错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 下发失败错误信息
     * @param ErrorMsg 下发失败错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 下发关联策略id列表 
     * @return DispatchStrategyList 下发关联策略id列表
     */
    public String [] getDispatchStrategyList() {
        return this.DispatchStrategyList;
    }

    /**
     * Set 下发关联策略id列表
     * @param DispatchStrategyList 下发关联策略id列表
     */
    public void setDispatchStrategyList(String [] DispatchStrategyList) {
        this.DispatchStrategyList = DispatchStrategyList;
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

    public DescribeStrategyDispatchStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStrategyDispatchStatusResponse(DescribeStrategyDispatchStatusResponse source) {
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleGroupNum != null) {
            this.RuleGroupNum = new Long(source.RuleGroupNum);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.DispatchStrategyList != null) {
            this.DispatchStrategyList = new String[source.DispatchStrategyList.length];
            for (int i = 0; i < source.DispatchStrategyList.length; i++) {
                this.DispatchStrategyList[i] = new String(source.DispatchStrategyList[i]);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleGroupNum", this.RuleGroupNum);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamArraySimple(map, prefix + "DispatchStrategyList.", this.DispatchStrategyList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

