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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentCruiseDialingCampaignResponse extends AbstractModel {

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 座席账号
    */
    @SerializedName("Agent")
    @Expose
    private String Agent;

    /**
    * 单轮并发呼叫量 1-20
    */
    @SerializedName("ConcurrencyNumber")
    @Expose
    private Long ConcurrencyNumber;

    /**
    * 任务启动时间，Unix 时间戳，到此时间后会自动启动任务
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 任务结束时间，Unix 时间戳，到此时间后会自动终止任务
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 被叫呼叫顺序 0 随机 1 顺序
    */
    @SerializedName("CallOrder")
    @Expose
    private Long CallOrder;

    /**
    * 调用方自定义数据，最大长度 1024
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * 任务状态 0 未启动 1 运行中 2 已完成 3 已终止
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 被叫总数
    */
    @SerializedName("TotalCalleeCount")
    @Expose
    private Long TotalCalleeCount;

    /**
    * 已呼被叫数
    */
    @SerializedName("CalledCalleeCount")
    @Expose
    private Long CalledCalleeCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 座席账号 
     * @return Agent 座席账号
     */
    public String getAgent() {
        return this.Agent;
    }

    /**
     * Set 座席账号
     * @param Agent 座席账号
     */
    public void setAgent(String Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 单轮并发呼叫量 1-20 
     * @return ConcurrencyNumber 单轮并发呼叫量 1-20
     */
    public Long getConcurrencyNumber() {
        return this.ConcurrencyNumber;
    }

    /**
     * Set 单轮并发呼叫量 1-20
     * @param ConcurrencyNumber 单轮并发呼叫量 1-20
     */
    public void setConcurrencyNumber(Long ConcurrencyNumber) {
        this.ConcurrencyNumber = ConcurrencyNumber;
    }

    /**
     * Get 任务启动时间，Unix 时间戳，到此时间后会自动启动任务 
     * @return StartTime 任务启动时间，Unix 时间戳，到此时间后会自动启动任务
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务启动时间，Unix 时间戳，到此时间后会自动启动任务
     * @param StartTime 任务启动时间，Unix 时间戳，到此时间后会自动启动任务
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间，Unix 时间戳，到此时间后会自动终止任务 
     * @return EndTime 任务结束时间，Unix 时间戳，到此时间后会自动终止任务
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间，Unix 时间戳，到此时间后会自动终止任务
     * @param EndTime 任务结束时间，Unix 时间戳，到此时间后会自动终止任务
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 被叫呼叫顺序 0 随机 1 顺序 
     * @return CallOrder 被叫呼叫顺序 0 随机 1 顺序
     */
    public Long getCallOrder() {
        return this.CallOrder;
    }

    /**
     * Set 被叫呼叫顺序 0 随机 1 顺序
     * @param CallOrder 被叫呼叫顺序 0 随机 1 顺序
     */
    public void setCallOrder(Long CallOrder) {
        this.CallOrder = CallOrder;
    }

    /**
     * Get 调用方自定义数据，最大长度 1024 
     * @return UUI 调用方自定义数据，最大长度 1024
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set 调用方自定义数据，最大长度 1024
     * @param UUI 调用方自定义数据，最大长度 1024
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get 任务状态 0 未启动 1 运行中 2 已完成 3 已终止 
     * @return State 任务状态 0 未启动 1 运行中 2 已完成 3 已终止
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 任务状态 0 未启动 1 运行中 2 已完成 3 已终止
     * @param State 任务状态 0 未启动 1 运行中 2 已完成 3 已终止
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 被叫总数 
     * @return TotalCalleeCount 被叫总数
     */
    public Long getTotalCalleeCount() {
        return this.TotalCalleeCount;
    }

    /**
     * Set 被叫总数
     * @param TotalCalleeCount 被叫总数
     */
    public void setTotalCalleeCount(Long TotalCalleeCount) {
        this.TotalCalleeCount = TotalCalleeCount;
    }

    /**
     * Get 已呼被叫数 
     * @return CalledCalleeCount 已呼被叫数
     */
    public Long getCalledCalleeCount() {
        return this.CalledCalleeCount;
    }

    /**
     * Set 已呼被叫数
     * @param CalledCalleeCount 已呼被叫数
     */
    public void setCalledCalleeCount(Long CalledCalleeCount) {
        this.CalledCalleeCount = CalledCalleeCount;
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

    public DescribeAgentCruiseDialingCampaignResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentCruiseDialingCampaignResponse(DescribeAgentCruiseDialingCampaignResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Agent != null) {
            this.Agent = new String(source.Agent);
        }
        if (source.ConcurrencyNumber != null) {
            this.ConcurrencyNumber = new Long(source.ConcurrencyNumber);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.CallOrder != null) {
            this.CallOrder = new Long(source.CallOrder);
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.TotalCalleeCount != null) {
            this.TotalCalleeCount = new Long(source.TotalCalleeCount);
        }
        if (source.CalledCalleeCount != null) {
            this.CalledCalleeCount = new Long(source.CalledCalleeCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Agent", this.Agent);
        this.setParamSimple(map, prefix + "ConcurrencyNumber", this.ConcurrencyNumber);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CallOrder", this.CallOrder);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TotalCalleeCount", this.TotalCalleeCount);
        this.setParamSimple(map, prefix + "CalledCalleeCount", this.CalledCalleeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

