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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotifySettingAkResponse extends AbstractModel {

    /**
    * <p>告警类型/等级 (类型: AbnBehavior-异常行为, LeakDetect-泄露监测; 等级: 1-提示, 2-低危, 3-中危, 4-高危, 5-严重)</p>
    */
    @SerializedName("Alert")
    @Expose
    private LevelOption [] Alert;

    /**
    * <p>告警通知粒度</p><p>枚举值：</p><ul><li>0： 按告警聚合推送</li><li>1： 按调用记录推送</li></ul>
    */
    @SerializedName("AlertGranularity")
    @Expose
    private Long AlertGranularity;

    /**
    * <p>资产事件</p><p>枚举值：</p><ul><li>NewAk： AK新增</li></ul>
    */
    @SerializedName("Asset")
    @Expose
    private String [] Asset;

    /**
    * <p>通知开始时间</p><p>参数格式：hh:mm:ss</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>通知结束时间</p><p>参数格式：hh:mm:ss</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>告警类型/等级 (类型: AbnBehavior-异常行为, LeakDetect-泄露监测; 等级: 1-提示, 2-低危, 3-中危, 4-高危, 5-严重)</p> 
     * @return Alert <p>告警类型/等级 (类型: AbnBehavior-异常行为, LeakDetect-泄露监测; 等级: 1-提示, 2-低危, 3-中危, 4-高危, 5-严重)</p>
     */
    public LevelOption [] getAlert() {
        return this.Alert;
    }

    /**
     * Set <p>告警类型/等级 (类型: AbnBehavior-异常行为, LeakDetect-泄露监测; 等级: 1-提示, 2-低危, 3-中危, 4-高危, 5-严重)</p>
     * @param Alert <p>告警类型/等级 (类型: AbnBehavior-异常行为, LeakDetect-泄露监测; 等级: 1-提示, 2-低危, 3-中危, 4-高危, 5-严重)</p>
     */
    public void setAlert(LevelOption [] Alert) {
        this.Alert = Alert;
    }

    /**
     * Get <p>告警通知粒度</p><p>枚举值：</p><ul><li>0： 按告警聚合推送</li><li>1： 按调用记录推送</li></ul> 
     * @return AlertGranularity <p>告警通知粒度</p><p>枚举值：</p><ul><li>0： 按告警聚合推送</li><li>1： 按调用记录推送</li></ul>
     */
    public Long getAlertGranularity() {
        return this.AlertGranularity;
    }

    /**
     * Set <p>告警通知粒度</p><p>枚举值：</p><ul><li>0： 按告警聚合推送</li><li>1： 按调用记录推送</li></ul>
     * @param AlertGranularity <p>告警通知粒度</p><p>枚举值：</p><ul><li>0： 按告警聚合推送</li><li>1： 按调用记录推送</li></ul>
     */
    public void setAlertGranularity(Long AlertGranularity) {
        this.AlertGranularity = AlertGranularity;
    }

    /**
     * Get <p>资产事件</p><p>枚举值：</p><ul><li>NewAk： AK新增</li></ul> 
     * @return Asset <p>资产事件</p><p>枚举值：</p><ul><li>NewAk： AK新增</li></ul>
     */
    public String [] getAsset() {
        return this.Asset;
    }

    /**
     * Set <p>资产事件</p><p>枚举值：</p><ul><li>NewAk： AK新增</li></ul>
     * @param Asset <p>资产事件</p><p>枚举值：</p><ul><li>NewAk： AK新增</li></ul>
     */
    public void setAsset(String [] Asset) {
        this.Asset = Asset;
    }

    /**
     * Get <p>通知开始时间</p><p>参数格式：hh:mm:ss</p> 
     * @return BeginTime <p>通知开始时间</p><p>参数格式：hh:mm:ss</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>通知开始时间</p><p>参数格式：hh:mm:ss</p>
     * @param BeginTime <p>通知开始时间</p><p>参数格式：hh:mm:ss</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>通知结束时间</p><p>参数格式：hh:mm:ss</p> 
     * @return EndTime <p>通知结束时间</p><p>参数格式：hh:mm:ss</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>通知结束时间</p><p>参数格式：hh:mm:ss</p>
     * @param EndTime <p>通知结束时间</p><p>参数格式：hh:mm:ss</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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

    public DescribeNotifySettingAkResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotifySettingAkResponse(DescribeNotifySettingAkResponse source) {
        if (source.Alert != null) {
            this.Alert = new LevelOption[source.Alert.length];
            for (int i = 0; i < source.Alert.length; i++) {
                this.Alert[i] = new LevelOption(source.Alert[i]);
            }
        }
        if (source.AlertGranularity != null) {
            this.AlertGranularity = new Long(source.AlertGranularity);
        }
        if (source.Asset != null) {
            this.Asset = new String[source.Asset.length];
            for (int i = 0; i < source.Asset.length; i++) {
                this.Asset[i] = new String(source.Asset[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Alert.", this.Alert);
        this.setParamSimple(map, prefix + "AlertGranularity", this.AlertGranularity);
        this.setParamArraySimple(map, prefix + "Asset.", this.Asset);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

