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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTIWRoomDailyUsageRequest extends AbstractModel{

    /**
    * 互动白板应用SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 需要查询的子产品用量，支持传入以下值
- sp_tiw_board: 互动白板时长，单位为分钟
- sp_tiw_ric: 实时录制时长，单位分钟
    */
    @SerializedName("SubProduct")
    @Expose
    private String SubProduct;

    /**
    * 开始时间，格式YYYY-MM-DD，查询结果里包括该天数据
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，格式YYYY-MM-DD，查询结果里包括该天数据，单次查询统计区间最多不能超过31天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 需要查询的房间ID列表，不填默认查询全部房间
    */
    @SerializedName("RoomIDs")
    @Expose
    private Long [] RoomIDs;

    /**
    * 查询偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每次查询返回条目限制，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 互动白板应用SdkAppId 
     * @return SdkAppId 互动白板应用SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 互动白板应用SdkAppId
     * @param SdkAppId 互动白板应用SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 需要查询的子产品用量，支持传入以下值
- sp_tiw_board: 互动白板时长，单位为分钟
- sp_tiw_ric: 实时录制时长，单位分钟 
     * @return SubProduct 需要查询的子产品用量，支持传入以下值
- sp_tiw_board: 互动白板时长，单位为分钟
- sp_tiw_ric: 实时录制时长，单位分钟
     */
    public String getSubProduct() {
        return this.SubProduct;
    }

    /**
     * Set 需要查询的子产品用量，支持传入以下值
- sp_tiw_board: 互动白板时长，单位为分钟
- sp_tiw_ric: 实时录制时长，单位分钟
     * @param SubProduct 需要查询的子产品用量，支持传入以下值
- sp_tiw_board: 互动白板时长，单位为分钟
- sp_tiw_ric: 实时录制时长，单位分钟
     */
    public void setSubProduct(String SubProduct) {
        this.SubProduct = SubProduct;
    }

    /**
     * Get 开始时间，格式YYYY-MM-DD，查询结果里包括该天数据 
     * @return StartTime 开始时间，格式YYYY-MM-DD，查询结果里包括该天数据
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，格式YYYY-MM-DD，查询结果里包括该天数据
     * @param StartTime 开始时间，格式YYYY-MM-DD，查询结果里包括该天数据
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，格式YYYY-MM-DD，查询结果里包括该天数据，单次查询统计区间最多不能超过31天。 
     * @return EndTime 结束时间，格式YYYY-MM-DD，查询结果里包括该天数据，单次查询统计区间最多不能超过31天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式YYYY-MM-DD，查询结果里包括该天数据，单次查询统计区间最多不能超过31天。
     * @param EndTime 结束时间，格式YYYY-MM-DD，查询结果里包括该天数据，单次查询统计区间最多不能超过31天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 需要查询的房间ID列表，不填默认查询全部房间 
     * @return RoomIDs 需要查询的房间ID列表，不填默认查询全部房间
     */
    public Long [] getRoomIDs() {
        return this.RoomIDs;
    }

    /**
     * Set 需要查询的房间ID列表，不填默认查询全部房间
     * @param RoomIDs 需要查询的房间ID列表，不填默认查询全部房间
     */
    public void setRoomIDs(Long [] RoomIDs) {
        this.RoomIDs = RoomIDs;
    }

    /**
     * Get 查询偏移量，默认为0 
     * @return Offset 查询偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量，默认为0
     * @param Offset 查询偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每次查询返回条目限制，默认为20 
     * @return Limit 每次查询返回条目限制，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次查询返回条目限制，默认为20
     * @param Limit 每次查询返回条目限制，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTIWRoomDailyUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTIWRoomDailyUsageRequest(DescribeTIWRoomDailyUsageRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SubProduct != null) {
            this.SubProduct = new String(source.SubProduct);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RoomIDs != null) {
            this.RoomIDs = new Long[source.RoomIDs.length];
            for (int i = 0; i < source.RoomIDs.length; i++) {
                this.RoomIDs[i] = new Long(source.RoomIDs[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SubProduct", this.SubProduct);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "RoomIDs.", this.RoomIDs);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

