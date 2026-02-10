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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlayRecordsRequest extends AbstractModel {

    /**
    * <p>低代码互动课堂的SdkAppId。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>房间ID。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * <p>开始时间，unix时间戳（秒）。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间，unix时间戳（秒）。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>页码，从1开始递增。</p><p>默认值：1</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页获取的记录条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>用户ID。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>低代码互动课堂的SdkAppId。</p> 
     * @return SdkAppId <p>低代码互动课堂的SdkAppId。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>低代码互动课堂的SdkAppId。</p>
     * @param SdkAppId <p>低代码互动课堂的SdkAppId。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>房间ID。</p> 
     * @return RoomId <p>房间ID。</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>房间ID。</p>
     * @param RoomId <p>房间ID。</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>开始时间，unix时间戳（秒）。</p> 
     * @return StartTime <p>开始时间，unix时间戳（秒）。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，unix时间戳（秒）。</p>
     * @param StartTime <p>开始时间，unix时间戳（秒）。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，unix时间戳（秒）。</p> 
     * @return EndTime <p>结束时间，unix时间戳（秒）。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，unix时间戳（秒）。</p>
     * @param EndTime <p>结束时间，unix时间戳（秒）。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>页码，从1开始递增。</p><p>默认值：1</p> 
     * @return Page <p>页码，从1开始递增。</p><p>默认值：1</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码，从1开始递增。</p><p>默认值：1</p>
     * @param Page <p>页码，从1开始递增。</p><p>默认值：1</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页获取的记录条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p> 
     * @return PageSize <p>每页获取的记录条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页获取的记录条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     * @param PageSize <p>每页获取的记录条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>用户ID。</p> 
     * @return UserId <p>用户ID。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户ID。</p>
     * @param UserId <p>用户ID。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DescribePlayRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlayRecordsRequest(DescribePlayRecordsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

