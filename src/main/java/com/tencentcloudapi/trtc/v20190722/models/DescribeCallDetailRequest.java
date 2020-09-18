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
    * 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位为s）例：1400353843_218695_1590065777。通过 DescribeRoomInformation（查询房间列表）接口获取（链接：https://cloud.tencent.com/document/product/647/44050）
    */
    @SerializedName("CommId")
    @Expose
    private String CommId;

    /**
    * 查询开始时间，5天内。本地unix时间戳（1588031999s）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询结束时间，本地unix时间戳（1588031999s）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 用户SDKAppID（1400188366）
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
bigvBit：上/下行视频码率；
bigvCapFps：视频采集帧率；
bigvEncFps：视频发送帧率；
bigvDecFps：渲染帧率；
bigvBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
bigvLoss：上/下行视频丢包；
bigvWidth：上/下行分辨率宽；
bigvHeight：上/下行分辨率高
    */
    @SerializedName("DataType")
    @Expose
    private String [] DataType;

    /**
    * 设置分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回6条数据）
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * 设置分页大小（PageNumber和PageSize 其中一个不填均默认返回6条数据,DataType，UserIds不为null，PageSize最大不超过6，DataType，UserIds为null，PageSize最大不超过100）
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
     * Get 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位为s）例：1400353843_218695_1590065777。通过 DescribeRoomInformation（查询房间列表）接口获取（链接：https://cloud.tencent.com/document/product/647/44050） 
     * @return CommId 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位为s）例：1400353843_218695_1590065777。通过 DescribeRoomInformation（查询房间列表）接口获取（链接：https://cloud.tencent.com/document/product/647/44050）
     */
    public String getCommId() {
        return this.CommId;
    }

    /**
     * Set 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位为s）例：1400353843_218695_1590065777。通过 DescribeRoomInformation（查询房间列表）接口获取（链接：https://cloud.tencent.com/document/product/647/44050）
     * @param CommId 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位为s）例：1400353843_218695_1590065777。通过 DescribeRoomInformation（查询房间列表）接口获取（链接：https://cloud.tencent.com/document/product/647/44050）
     */
    public void setCommId(String CommId) {
        this.CommId = CommId;
    }

    /**
     * Get 查询开始时间，5天内。本地unix时间戳（1588031999s） 
     * @return StartTime 查询开始时间，5天内。本地unix时间戳（1588031999s）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，5天内。本地unix时间戳（1588031999s）
     * @param StartTime 查询开始时间，5天内。本地unix时间戳（1588031999s）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，本地unix时间戳（1588031999s） 
     * @return EndTime 查询结束时间，本地unix时间戳（1588031999s）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，本地unix时间戳（1588031999s）
     * @param EndTime 查询结束时间，本地unix时间戳（1588031999s）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 用户SDKAppID（1400188366） 
     * @return SdkAppId 用户SDKAppID（1400188366）
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 用户SDKAppID（1400188366）
     * @param SdkAppId 用户SDKAppID（1400188366）
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
bigvBit：上/下行视频码率；
bigvCapFps：视频采集帧率；
bigvEncFps：视频发送帧率；
bigvDecFps：渲染帧率；
bigvBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
bigvLoss：上/下行视频丢包；
bigvWidth：上/下行分辨率宽；
bigvHeight：上/下行分辨率高 
     * @return DataType 需查询的指标，不填则只返回用户列表，填all则返回所有指标。
appCpu：APP CPU使用率；
sysCpu：系统 CPU使用率；
aBit：上/下行音频码率；
aBlock：音频卡顿时长；
bigvBit：上/下行视频码率；
bigvCapFps：视频采集帧率；
bigvEncFps：视频发送帧率；
bigvDecFps：渲染帧率；
bigvBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
bigvLoss：上/下行视频丢包；
bigvWidth：上/下行分辨率宽；
bigvHeight：上/下行分辨率高
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
bigvBit：上/下行视频码率；
bigvCapFps：视频采集帧率；
bigvEncFps：视频发送帧率；
bigvDecFps：渲染帧率；
bigvBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
bigvLoss：上/下行视频丢包；
bigvWidth：上/下行分辨率宽；
bigvHeight：上/下行分辨率高
     * @param DataType 需查询的指标，不填则只返回用户列表，填all则返回所有指标。
appCpu：APP CPU使用率；
sysCpu：系统 CPU使用率；
aBit：上/下行音频码率；
aBlock：音频卡顿时长；
bigvBit：上/下行视频码率；
bigvCapFps：视频采集帧率；
bigvEncFps：视频发送帧率；
bigvDecFps：渲染帧率；
bigvBlock：视频卡顿时长；
aLoss：上/下行音频丢包；
bigvLoss：上/下行视频丢包；
bigvWidth：上/下行分辨率宽；
bigvHeight：上/下行分辨率高
     */
    public void setDataType(String [] DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 设置分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回6条数据） 
     * @return PageNumber 设置分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回6条数据）
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 设置分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回6条数据）
     * @param PageNumber 设置分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回6条数据）
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 设置分页大小（PageNumber和PageSize 其中一个不填均默认返回6条数据,DataType，UserIds不为null，PageSize最大不超过6，DataType，UserIds为null，PageSize最大不超过100） 
     * @return PageSize 设置分页大小（PageNumber和PageSize 其中一个不填均默认返回6条数据,DataType，UserIds不为null，PageSize最大不超过6，DataType，UserIds为null，PageSize最大不超过100）
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 设置分页大小（PageNumber和PageSize 其中一个不填均默认返回6条数据,DataType，UserIds不为null，PageSize最大不超过6，DataType，UserIds为null，PageSize最大不超过100）
     * @param PageSize 设置分页大小（PageNumber和PageSize 其中一个不填均默认返回6条数据,DataType，UserIds不为null，PageSize最大不超过6，DataType，UserIds为null，PageSize最大不超过100）
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

