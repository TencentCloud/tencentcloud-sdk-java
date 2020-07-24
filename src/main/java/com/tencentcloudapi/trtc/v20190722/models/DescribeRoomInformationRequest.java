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

public class DescribeRoomInformationRequest extends AbstractModel{

    /**
    * 用户sdkappid
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

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
    * 数字房间号
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回10条数据）
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * 分页大小（PageNumber和PageSize 其中一个不填均默认返回10条数据,最大不超过100）
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

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
     * Get 数字房间号 
     * @return RoomId 数字房间号
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 数字房间号
     * @param RoomId 数字房间号
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回10条数据） 
     * @return PageNumber 分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回10条数据）
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回10条数据）
     * @param PageNumber 分页index，从0开始（PageNumber和PageSize 其中一个不填均默认返回10条数据）
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小（PageNumber和PageSize 其中一个不填均默认返回10条数据,最大不超过100） 
     * @return PageSize 分页大小（PageNumber和PageSize 其中一个不填均默认返回10条数据,最大不超过100）
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小（PageNumber和PageSize 其中一个不填均默认返回10条数据,最大不超过100）
     * @param PageSize 分页大小（PageNumber和PageSize 其中一个不填均默认返回10条数据,最大不超过100）
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

