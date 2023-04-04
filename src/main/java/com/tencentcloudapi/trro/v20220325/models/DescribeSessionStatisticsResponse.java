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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionStatisticsResponse extends AbstractModel{

    /**
    * 会话数量
    */
    @SerializedName("SessionNum")
    @Expose
    private Long SessionNum;

    /**
    * 通话时长，单位：分钟
    */
    @SerializedName("TotalDuration")
    @Expose
    private Long TotalDuration;

    /**
    * 活跃现场设备数
    */
    @SerializedName("ActiveFieldDeviceNum")
    @Expose
    private Long ActiveFieldDeviceNum;

    /**
    * 活跃远端设备数
    */
    @SerializedName("ActiveRemoteDeviceNum")
    @Expose
    private Long ActiveRemoteDeviceNum;

    /**
    * 优良会话占比，单位：%
    */
    @SerializedName("NotBadSessionRatio")
    @Expose
    private Long NotBadSessionRatio;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 会话数量 
     * @return SessionNum 会话数量
     */
    public Long getSessionNum() {
        return this.SessionNum;
    }

    /**
     * Set 会话数量
     * @param SessionNum 会话数量
     */
    public void setSessionNum(Long SessionNum) {
        this.SessionNum = SessionNum;
    }

    /**
     * Get 通话时长，单位：分钟 
     * @return TotalDuration 通话时长，单位：分钟
     */
    public Long getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set 通话时长，单位：分钟
     * @param TotalDuration 通话时长，单位：分钟
     */
    public void setTotalDuration(Long TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    /**
     * Get 活跃现场设备数 
     * @return ActiveFieldDeviceNum 活跃现场设备数
     */
    public Long getActiveFieldDeviceNum() {
        return this.ActiveFieldDeviceNum;
    }

    /**
     * Set 活跃现场设备数
     * @param ActiveFieldDeviceNum 活跃现场设备数
     */
    public void setActiveFieldDeviceNum(Long ActiveFieldDeviceNum) {
        this.ActiveFieldDeviceNum = ActiveFieldDeviceNum;
    }

    /**
     * Get 活跃远端设备数 
     * @return ActiveRemoteDeviceNum 活跃远端设备数
     */
    public Long getActiveRemoteDeviceNum() {
        return this.ActiveRemoteDeviceNum;
    }

    /**
     * Set 活跃远端设备数
     * @param ActiveRemoteDeviceNum 活跃远端设备数
     */
    public void setActiveRemoteDeviceNum(Long ActiveRemoteDeviceNum) {
        this.ActiveRemoteDeviceNum = ActiveRemoteDeviceNum;
    }

    /**
     * Get 优良会话占比，单位：% 
     * @return NotBadSessionRatio 优良会话占比，单位：%
     */
    public Long getNotBadSessionRatio() {
        return this.NotBadSessionRatio;
    }

    /**
     * Set 优良会话占比，单位：%
     * @param NotBadSessionRatio 优良会话占比，单位：%
     */
    public void setNotBadSessionRatio(Long NotBadSessionRatio) {
        this.NotBadSessionRatio = NotBadSessionRatio;
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

    public DescribeSessionStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionStatisticsResponse(DescribeSessionStatisticsResponse source) {
        if (source.SessionNum != null) {
            this.SessionNum = new Long(source.SessionNum);
        }
        if (source.TotalDuration != null) {
            this.TotalDuration = new Long(source.TotalDuration);
        }
        if (source.ActiveFieldDeviceNum != null) {
            this.ActiveFieldDeviceNum = new Long(source.ActiveFieldDeviceNum);
        }
        if (source.ActiveRemoteDeviceNum != null) {
            this.ActiveRemoteDeviceNum = new Long(source.ActiveRemoteDeviceNum);
        }
        if (source.NotBadSessionRatio != null) {
            this.NotBadSessionRatio = new Long(source.NotBadSessionRatio);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionNum", this.SessionNum);
        this.setParamSimple(map, prefix + "TotalDuration", this.TotalDuration);
        this.setParamSimple(map, prefix + "ActiveFieldDeviceNum", this.ActiveFieldDeviceNum);
        this.setParamSimple(map, prefix + "ActiveRemoteDeviceNum", this.ActiveRemoteDeviceNum);
        this.setParamSimple(map, prefix + "NotBadSessionRatio", this.NotBadSessionRatio);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

