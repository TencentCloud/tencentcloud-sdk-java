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

public class DescribeAutoBackupConfigResponse  extends AbstractModel{

    /**
    * 备份类型。自动备份类型： 1 “定时回档”
    */
    @SerializedName("AutoBackupType")
    @Expose
    private Integer AutoBackupType;

    /**
    * Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * 时间段。
    */
    @SerializedName("TimePeriod")
    @Expose
    private String TimePeriod;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取备份类型。自动备份类型： 1 “定时回档”
     * @return AutoBackupType 备份类型。自动备份类型： 1 “定时回档”
     */
    public Integer getAutoBackupType() {
        return this.AutoBackupType;
    }

    /**
     * 设置备份类型。自动备份类型： 1 “定时回档”
     * @param AutoBackupType 备份类型。自动备份类型： 1 “定时回档”
     */
    public void setAutoBackupType(Integer AutoBackupType) {
        this.AutoBackupType = AutoBackupType;
    }

    /**
     * 获取Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。
     * @return WeekDays Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * 设置Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。
     * @param WeekDays Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * 获取时间段。
     * @return TimePeriod 时间段。
     */
    public String getTimePeriod() {
        return this.TimePeriod;
    }

    /**
     * 设置时间段。
     * @param TimePeriod 时间段。
     */
    public void setTimePeriod(String TimePeriod) {
        this.TimePeriod = TimePeriod;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoBackupType", this.AutoBackupType);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "TimePeriod", this.TimePeriod);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

