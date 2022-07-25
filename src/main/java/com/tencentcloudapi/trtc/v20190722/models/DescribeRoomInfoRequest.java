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

public class DescribeRoomInfoRequest extends AbstractModel{

    /**
    * 用户SdkAppId（如：1400xxxxxx）
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 查询开始时间，本地unix时间戳，单位为秒（如：1590065777）
注意：支持查询14天内的数据
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询结束时间，本地unix时间戳，单位为秒（如：1590065877）
注意：与StartTime间隔时间不超过24小时。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 房间号（如：223)
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 当前页数，默认为0，
注意：PageNumber和PageSize 其中一个不填均默认返回10条数据。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页个数，默认为10，
范围：[1，100]
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 用户SdkAppId（如：1400xxxxxx） 
     * @return SdkAppId 用户SdkAppId（如：1400xxxxxx）
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 用户SdkAppId（如：1400xxxxxx）
     * @param SdkAppId 用户SdkAppId（如：1400xxxxxx）
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 查询开始时间，本地unix时间戳，单位为秒（如：1590065777）
注意：支持查询14天内的数据 
     * @return StartTime 查询开始时间，本地unix时间戳，单位为秒（如：1590065777）
注意：支持查询14天内的数据
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，本地unix时间戳，单位为秒（如：1590065777）
注意：支持查询14天内的数据
     * @param StartTime 查询开始时间，本地unix时间戳，单位为秒（如：1590065777）
注意：支持查询14天内的数据
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，本地unix时间戳，单位为秒（如：1590065877）
注意：与StartTime间隔时间不超过24小时。 
     * @return EndTime 查询结束时间，本地unix时间戳，单位为秒（如：1590065877）
注意：与StartTime间隔时间不超过24小时。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，本地unix时间戳，单位为秒（如：1590065877）
注意：与StartTime间隔时间不超过24小时。
     * @param EndTime 查询结束时间，本地unix时间戳，单位为秒（如：1590065877）
注意：与StartTime间隔时间不超过24小时。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 房间号（如：223) 
     * @return RoomId 房间号（如：223)
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间号（如：223)
     * @param RoomId 房间号（如：223)
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 当前页数，默认为0，
注意：PageNumber和PageSize 其中一个不填均默认返回10条数据。 
     * @return PageNumber 当前页数，默认为0，
注意：PageNumber和PageSize 其中一个不填均默认返回10条数据。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页数，默认为0，
注意：PageNumber和PageSize 其中一个不填均默认返回10条数据。
     * @param PageNumber 当前页数，默认为0，
注意：PageNumber和PageSize 其中一个不填均默认返回10条数据。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页个数，默认为10，
范围：[1，100] 
     * @return PageSize 每页个数，默认为10，
范围：[1，100]
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页个数，默认为10，
范围：[1，100]
     * @param PageSize 每页个数，默认为10，
范围：[1，100]
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeRoomInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomInfoRequest(DescribeRoomInfoRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
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

