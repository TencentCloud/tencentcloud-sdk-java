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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeviceLogResponse  extends AbstractModel{

    /**
    * 设备日志
    */
    @SerializedName("DeviceLog")
    @Expose
    private DeviceLogEntry [] DeviceLog;

    /**
    * 查询游标
    */
    @SerializedName("ScrollId")
    @Expose
    private String ScrollId;

    /**
    * 游标超时
    */
    @SerializedName("ScrollTimeout")
    @Expose
    private Integer ScrollTimeout;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取设备日志
     * @return DeviceLog 设备日志
     */
    public DeviceLogEntry [] getDeviceLog() {
        return this.DeviceLog;
    }

    /**
     * 设置设备日志
     * @param DeviceLog 设备日志
     */
    public void setDeviceLog(DeviceLogEntry [] DeviceLog) {
        this.DeviceLog = DeviceLog;
    }

    /**
     * 获取查询游标
     * @return ScrollId 查询游标
     */
    public String getScrollId() {
        return this.ScrollId;
    }

    /**
     * 设置查询游标
     * @param ScrollId 查询游标
     */
    public void setScrollId(String ScrollId) {
        this.ScrollId = ScrollId;
    }

    /**
     * 获取游标超时
     * @return ScrollTimeout 游标超时
     */
    public Integer getScrollTimeout() {
        return this.ScrollTimeout;
    }

    /**
     * 设置游标超时
     * @param ScrollTimeout 游标超时
     */
    public void setScrollTimeout(Integer ScrollTimeout) {
        this.ScrollTimeout = ScrollTimeout;
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
        this.setParamArrayObj(map, prefix + "DeviceLog.", this.DeviceLog);
        this.setParamSimple(map, prefix + "ScrollId", this.ScrollId);
        this.setParamSimple(map, prefix + "ScrollTimeout", this.ScrollTimeout);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

