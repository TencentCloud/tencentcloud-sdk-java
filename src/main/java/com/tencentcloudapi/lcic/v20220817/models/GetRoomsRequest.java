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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRoomsRequest extends AbstractModel{

    /**
    * 低代码平台的SdkAppId。

    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 开始时间。默认以当前时间减去半小时作为开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间。默认以当前时间加上半小时作为结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 分页查询当前页数，从1开始递增
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 默认是10条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 课堂状态。默认展示所有课堂，0为未开始，1为正在上课，2为已结束，3为已过期
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get 低代码平台的SdkAppId。
 
     * @return SdkAppId 低代码平台的SdkAppId。

     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码平台的SdkAppId。

     * @param SdkAppId 低代码平台的SdkAppId。

     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 开始时间。默认以当前时间减去半小时作为开始时间。 
     * @return StartTime 开始时间。默认以当前时间减去半小时作为开始时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。默认以当前时间减去半小时作为开始时间。
     * @param StartTime 开始时间。默认以当前时间减去半小时作为开始时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。默认以当前时间加上半小时作为结束时间。 
     * @return EndTime 结束时间。默认以当前时间加上半小时作为结束时间。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。默认以当前时间加上半小时作为结束时间。
     * @param EndTime 结束时间。默认以当前时间加上半小时作为结束时间。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页查询当前页数，从1开始递增 
     * @return Page 分页查询当前页数，从1开始递增
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页查询当前页数，从1开始递增
     * @param Page 分页查询当前页数，从1开始递增
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 默认是10条 
     * @return Limit 默认是10条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 默认是10条
     * @param Limit 默认是10条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 课堂状态。默认展示所有课堂，0为未开始，1为正在上课，2为已结束，3为已过期 
     * @return Status 课堂状态。默认展示所有课堂，0为未开始，1为正在上课，2为已结束，3为已过期
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 课堂状态。默认展示所有课堂，0为未开始，1为正在上课，2为已结束，3为已过期
     * @param Status 课堂状态。默认展示所有课堂，0为未开始，1为正在上课，2为已结束，3为已过期
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public GetRoomsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRoomsRequest(GetRoomsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
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
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

