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

public class CreateAgentCruiseDialingCampaignRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

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
    * 被叫列表，支持 E.164 或不带国家码形式的号码
    */
    @SerializedName("Callees")
    @Expose
    private String [] Callees;

    /**
    * 主叫列表，使用管理端展示的号码格式
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

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
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

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
     * Get 被叫列表，支持 E.164 或不带国家码形式的号码 
     * @return Callees 被叫列表，支持 E.164 或不带国家码形式的号码
     */
    public String [] getCallees() {
        return this.Callees;
    }

    /**
     * Set 被叫列表，支持 E.164 或不带国家码形式的号码
     * @param Callees 被叫列表，支持 E.164 或不带国家码形式的号码
     */
    public void setCallees(String [] Callees) {
        this.Callees = Callees;
    }

    /**
     * Get 主叫列表，使用管理端展示的号码格式 
     * @return Callers 主叫列表，使用管理端展示的号码格式
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫列表，使用管理端展示的号码格式
     * @param Callers 主叫列表，使用管理端展示的号码格式
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
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

    public CreateAgentCruiseDialingCampaignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentCruiseDialingCampaignRequest(CreateAgentCruiseDialingCampaignRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
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
        if (source.Callees != null) {
            this.Callees = new String[source.Callees.length];
            for (int i = 0; i < source.Callees.length; i++) {
                this.Callees[i] = new String(source.Callees[i]);
            }
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.CallOrder != null) {
            this.CallOrder = new Long(source.CallOrder);
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Agent", this.Agent);
        this.setParamSimple(map, prefix + "ConcurrencyNumber", this.ConcurrencyNumber);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Callees.", this.Callees);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "CallOrder", this.CallOrder);
        this.setParamSimple(map, prefix + "UUI", this.UUI);

    }
}

