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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgentRecordTaskRequest extends AbstractModel {

    /**
    * <p>直播间URL</p>
    */
    @SerializedName("LiveRoomUrl")
    @Expose
    private String LiveRoomUrl;

    /**
    * <p>最长录制时长</p><p>单位：分</p><p>最长支持720分</p>
    */
    @SerializedName("MaxDurationMinutes")
    @Expose
    private Long MaxDurationMinutes;

    /**
    * <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AgentStoreCosParam StoreCosParam;

    /**
    * <p>定时录制开始时刻</p><p>参数格式：2026-07-01T15:31:32+08:00</p><p>空表示提交后立即开始录制；非空表示从该时刻开始录制</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>中断策略</p><p>枚举值：</p><ul><li>STOP_ON_INTERRUPT： 直播流中断后立即结束录制</li><li>CONTINUE_UNTIL_END： 直播流中断时忽略中断，继续录制直到任务结束时间</li></ul><p>默认值：STOP_ON_INTERRUPT</p>
    */
    @SerializedName("InterruptPolicy")
    @Expose
    private String InterruptPolicy;

    /**
     * Get <p>直播间URL</p> 
     * @return LiveRoomUrl <p>直播间URL</p>
     */
    public String getLiveRoomUrl() {
        return this.LiveRoomUrl;
    }

    /**
     * Set <p>直播间URL</p>
     * @param LiveRoomUrl <p>直播间URL</p>
     */
    public void setLiveRoomUrl(String LiveRoomUrl) {
        this.LiveRoomUrl = LiveRoomUrl;
    }

    /**
     * Get <p>最长录制时长</p><p>单位：分</p><p>最长支持720分</p> 
     * @return MaxDurationMinutes <p>最长录制时长</p><p>单位：分</p><p>最长支持720分</p>
     */
    public Long getMaxDurationMinutes() {
        return this.MaxDurationMinutes;
    }

    /**
     * Set <p>最长录制时长</p><p>单位：分</p><p>最长支持720分</p>
     * @param MaxDurationMinutes <p>最长录制时长</p><p>单位：分</p><p>最长支持720分</p>
     */
    public void setMaxDurationMinutes(Long MaxDurationMinutes) {
        this.MaxDurationMinutes = MaxDurationMinutes;
    }

    /**
     * Get <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p> 
     * @return StoreCosParam <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     */
    public AgentStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     * @param StoreCosParam <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     */
    public void setStoreCosParam(AgentStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get <p>定时录制开始时刻</p><p>参数格式：2026-07-01T15:31:32+08:00</p><p>空表示提交后立即开始录制；非空表示从该时刻开始录制</p> 
     * @return StartTime <p>定时录制开始时刻</p><p>参数格式：2026-07-01T15:31:32+08:00</p><p>空表示提交后立即开始录制；非空表示从该时刻开始录制</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>定时录制开始时刻</p><p>参数格式：2026-07-01T15:31:32+08:00</p><p>空表示提交后立即开始录制；非空表示从该时刻开始录制</p>
     * @param StartTime <p>定时录制开始时刻</p><p>参数格式：2026-07-01T15:31:32+08:00</p><p>空表示提交后立即开始录制；非空表示从该时刻开始录制</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>中断策略</p><p>枚举值：</p><ul><li>STOP_ON_INTERRUPT： 直播流中断后立即结束录制</li><li>CONTINUE_UNTIL_END： 直播流中断时忽略中断，继续录制直到任务结束时间</li></ul><p>默认值：STOP_ON_INTERRUPT</p> 
     * @return InterruptPolicy <p>中断策略</p><p>枚举值：</p><ul><li>STOP_ON_INTERRUPT： 直播流中断后立即结束录制</li><li>CONTINUE_UNTIL_END： 直播流中断时忽略中断，继续录制直到任务结束时间</li></ul><p>默认值：STOP_ON_INTERRUPT</p>
     */
    public String getInterruptPolicy() {
        return this.InterruptPolicy;
    }

    /**
     * Set <p>中断策略</p><p>枚举值：</p><ul><li>STOP_ON_INTERRUPT： 直播流中断后立即结束录制</li><li>CONTINUE_UNTIL_END： 直播流中断时忽略中断，继续录制直到任务结束时间</li></ul><p>默认值：STOP_ON_INTERRUPT</p>
     * @param InterruptPolicy <p>中断策略</p><p>枚举值：</p><ul><li>STOP_ON_INTERRUPT： 直播流中断后立即结束录制</li><li>CONTINUE_UNTIL_END： 直播流中断时忽略中断，继续录制直到任务结束时间</li></ul><p>默认值：STOP_ON_INTERRUPT</p>
     */
    public void setInterruptPolicy(String InterruptPolicy) {
        this.InterruptPolicy = InterruptPolicy;
    }

    public CreateAgentRecordTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentRecordTaskRequest(CreateAgentRecordTaskRequest source) {
        if (source.LiveRoomUrl != null) {
            this.LiveRoomUrl = new String(source.LiveRoomUrl);
        }
        if (source.MaxDurationMinutes != null) {
            this.MaxDurationMinutes = new Long(source.MaxDurationMinutes);
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new AgentStoreCosParam(source.StoreCosParam);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.InterruptPolicy != null) {
            this.InterruptPolicy = new String(source.InterruptPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveRoomUrl", this.LiveRoomUrl);
        this.setParamSimple(map, prefix + "MaxDurationMinutes", this.MaxDurationMinutes);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "InterruptPolicy", this.InterruptPolicy);

    }
}

