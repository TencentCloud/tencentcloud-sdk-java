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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchInstanceVipRequest extends AbstractModel{

    /**
    * 源实例ID
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * 目标实例ID
    */
    @SerializedName("DstInstanceId")
    @Expose
    private String DstInstanceId;

    /**
    * 单位为秒。源实例与目标实例间DTS已断开时间，如果DTS断开时间大于TimeDelay，则不切换VIP，建议尽量根据业务设置一个可接受的值。
    */
    @SerializedName("TimeDelay")
    @Expose
    private Long TimeDelay;

    /**
    * 在DTS断开的情况下是否强制切换。1：强制切换，0：不强制切换
    */
    @SerializedName("ForceSwitch")
    @Expose
    private Long ForceSwitch;

    /**
    * now: 立即切换，syncComplete：等待同步完成后切换
    */
    @SerializedName("SwitchTime")
    @Expose
    private String SwitchTime;

    /**
     * Get 源实例ID 
     * @return SrcInstanceId 源实例ID
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set 源实例ID
     * @param SrcInstanceId 源实例ID
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get 目标实例ID 
     * @return DstInstanceId 目标实例ID
     */
    public String getDstInstanceId() {
        return this.DstInstanceId;
    }

    /**
     * Set 目标实例ID
     * @param DstInstanceId 目标实例ID
     */
    public void setDstInstanceId(String DstInstanceId) {
        this.DstInstanceId = DstInstanceId;
    }

    /**
     * Get 单位为秒。源实例与目标实例间DTS已断开时间，如果DTS断开时间大于TimeDelay，则不切换VIP，建议尽量根据业务设置一个可接受的值。 
     * @return TimeDelay 单位为秒。源实例与目标实例间DTS已断开时间，如果DTS断开时间大于TimeDelay，则不切换VIP，建议尽量根据业务设置一个可接受的值。
     */
    public Long getTimeDelay() {
        return this.TimeDelay;
    }

    /**
     * Set 单位为秒。源实例与目标实例间DTS已断开时间，如果DTS断开时间大于TimeDelay，则不切换VIP，建议尽量根据业务设置一个可接受的值。
     * @param TimeDelay 单位为秒。源实例与目标实例间DTS已断开时间，如果DTS断开时间大于TimeDelay，则不切换VIP，建议尽量根据业务设置一个可接受的值。
     */
    public void setTimeDelay(Long TimeDelay) {
        this.TimeDelay = TimeDelay;
    }

    /**
     * Get 在DTS断开的情况下是否强制切换。1：强制切换，0：不强制切换 
     * @return ForceSwitch 在DTS断开的情况下是否强制切换。1：强制切换，0：不强制切换
     */
    public Long getForceSwitch() {
        return this.ForceSwitch;
    }

    /**
     * Set 在DTS断开的情况下是否强制切换。1：强制切换，0：不强制切换
     * @param ForceSwitch 在DTS断开的情况下是否强制切换。1：强制切换，0：不强制切换
     */
    public void setForceSwitch(Long ForceSwitch) {
        this.ForceSwitch = ForceSwitch;
    }

    /**
     * Get now: 立即切换，syncComplete：等待同步完成后切换 
     * @return SwitchTime now: 立即切换，syncComplete：等待同步完成后切换
     */
    public String getSwitchTime() {
        return this.SwitchTime;
    }

    /**
     * Set now: 立即切换，syncComplete：等待同步完成后切换
     * @param SwitchTime now: 立即切换，syncComplete：等待同步完成后切换
     */
    public void setSwitchTime(String SwitchTime) {
        this.SwitchTime = SwitchTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "DstInstanceId", this.DstInstanceId);
        this.setParamSimple(map, prefix + "TimeDelay", this.TimeDelay);
        this.setParamSimple(map, prefix + "ForceSwitch", this.ForceSwitch);
        this.setParamSimple(map, prefix + "SwitchTime", this.SwitchTime);

    }
}

