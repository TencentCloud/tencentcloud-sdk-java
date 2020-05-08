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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallDetailRequest extends AbstractModel{

    /**
    * 通话ID（唯一标识一次通话）= sdkappid+roomgString（房间号）+房间创建时间（unix时间戳，s）。通过 DescribeRoomInformation（查询房间列表）接口获取。
    */
    @SerializedName("CommId")
    @Expose
    private String CommId;

    /**
    * 查询开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 用户sdkappid
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 需查询的用户数组，不填默认返回6个用户,最多可填6个用户
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 需查询的指标，不填则只返回用户列表，填all则返回所有指标。
appCpu：APP CPU使用率；
sysCpu：系统 CPU使用率；
aBit：上/下行音频码率；
aBlock：音频卡顿时长；
vBit：上/下行视频码率；
vCapFps：视频采集帧率；
vEncFps：视频发送帧率；
vDecFps：渲染帧率；
vBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
vLoss：上/下行视频丢包；
vWidth：上/下行分辨率宽；
vHeight：上/下行分辨率高
    */
    @SerializedName("DataType")
    @Expose
    private String [] DataType;

    /**
     * Get 通话ID（唯一标识一次通话）= sdkappid+roomgString（房间号）+房间创建时间（unix时间戳，s）。通过 DescribeRoomInformation（查询房间列表）接口获取。 
     * @return CommId 通话ID（唯一标识一次通话）= sdkappid+roomgString（房间号）+房间创建时间（unix时间戳，s）。通过 DescribeRoomInformation（查询房间列表）接口获取。
     */
    public String getCommId() {
        return this.CommId;
    }

    /**
     * Set 通话ID（唯一标识一次通话）= sdkappid+roomgString（房间号）+房间创建时间（unix时间戳，s）。通过 DescribeRoomInformation（查询房间列表）接口获取。
     * @param CommId 通话ID（唯一标识一次通话）= sdkappid+roomgString（房间号）+房间创建时间（unix时间戳，s）。通过 DescribeRoomInformation（查询房间列表）接口获取。
     */
    public void setCommId(String CommId) {
        this.CommId = CommId;
    }

    /**
     * Get 查询开始时间 
     * @return StartTime 查询开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间
     * @param StartTime 查询开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 用户sdkappid 
     * @return SdkAppId 用户sdkappid
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 用户sdkappid
     * @param SdkAppId 用户sdkappid
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 需查询的用户数组，不填默认返回6个用户,最多可填6个用户 
     * @return UserIds 需查询的用户数组，不填默认返回6个用户,最多可填6个用户
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 需查询的用户数组，不填默认返回6个用户,最多可填6个用户
     * @param UserIds 需查询的用户数组，不填默认返回6个用户,最多可填6个用户
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 需查询的指标，不填则只返回用户列表，填all则返回所有指标。
appCpu：APP CPU使用率；
sysCpu：系统 CPU使用率；
aBit：上/下行音频码率；
aBlock：音频卡顿时长；
vBit：上/下行视频码率；
vCapFps：视频采集帧率；
vEncFps：视频发送帧率；
vDecFps：渲染帧率；
vBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
vLoss：上/下行视频丢包；
vWidth：上/下行分辨率宽；
vHeight：上/下行分辨率高 
     * @return DataType 需查询的指标，不填则只返回用户列表，填all则返回所有指标。
appCpu：APP CPU使用率；
sysCpu：系统 CPU使用率；
aBit：上/下行音频码率；
aBlock：音频卡顿时长；
vBit：上/下行视频码率；
vCapFps：视频采集帧率；
vEncFps：视频发送帧率；
vDecFps：渲染帧率；
vBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
vLoss：上/下行视频丢包；
vWidth：上/下行分辨率宽；
vHeight：上/下行分辨率高
     */
    public String [] getDataType() {
        return this.DataType;
    }

    /**
     * Set 需查询的指标，不填则只返回用户列表，填all则返回所有指标。
appCpu：APP CPU使用率；
sysCpu：系统 CPU使用率；
aBit：上/下行音频码率；
aBlock：音频卡顿时长；
vBit：上/下行视频码率；
vCapFps：视频采集帧率；
vEncFps：视频发送帧率；
vDecFps：渲染帧率；
vBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
vLoss：上/下行视频丢包；
vWidth：上/下行分辨率宽；
vHeight：上/下行分辨率高
     * @param DataType 需查询的指标，不填则只返回用户列表，填all则返回所有指标。
appCpu：APP CPU使用率；
sysCpu：系统 CPU使用率；
aBit：上/下行音频码率；
aBlock：音频卡顿时长；
vBit：上/下行视频码率；
vCapFps：视频采集帧率；
vEncFps：视频发送帧率；
vDecFps：渲染帧率；
vBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
vLoss：上/下行视频丢包；
vWidth：上/下行分辨率宽；
vHeight：上/下行分辨率高
     */
    public void setDataType(String [] DataType) {
        this.DataType = DataType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommId", this.CommId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "DataType.", this.DataType);

    }
}

