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
    * 数字房间号
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 分页index（不填默认只返回10个）
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * 分页大小（不填默认返回10个,最多不超过100条）
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
     * Get 分页index（不填默认只返回10个） 
     * @return PageNumber 分页index（不填默认只返回10个）
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页index（不填默认只返回10个）
     * @param PageNumber 分页index（不填默认只返回10个）
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小（不填默认返回10个,最多不超过100条） 
     * @return PageSize 分页大小（不填默认返回10个,最多不超过100条）
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小（不填默认返回10个,最多不超过100条）
     * @param PageSize 分页大小（不填默认返回10个,最多不超过100条）
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

