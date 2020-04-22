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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveStreamPublishedListRequest extends AbstractModel{

    /**
    * 您的推流域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 结束时间。
UTC 格式，例如：2016-06-30T19:00:00Z。
不超过当前时间。
注意：EndTime和StartTime相差不可超过30天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 起始时间。 
UTC 格式，例如：2016-06-29T19:00:00Z。
最长支持查询60天内数据。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。不支持模糊匹配。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 取得第几页。
默认值：1。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 流名称，支持模糊匹配。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get 您的推流域名。 
     * @return DomainName 您的推流域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 您的推流域名。
     * @param DomainName 您的推流域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 结束时间。
UTC 格式，例如：2016-06-30T19:00:00Z。
不超过当前时间。
注意：EndTime和StartTime相差不可超过30天。 
     * @return EndTime 结束时间。
UTC 格式，例如：2016-06-30T19:00:00Z。
不超过当前时间。
注意：EndTime和StartTime相差不可超过30天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
UTC 格式，例如：2016-06-30T19:00:00Z。
不超过当前时间。
注意：EndTime和StartTime相差不可超过30天。
     * @param EndTime 结束时间。
UTC 格式，例如：2016-06-30T19:00:00Z。
不超过当前时间。
注意：EndTime和StartTime相差不可超过30天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 起始时间。 
UTC 格式，例如：2016-06-29T19:00:00Z。
最长支持查询60天内数据。 
     * @return StartTime 起始时间。 
UTC 格式，例如：2016-06-29T19:00:00Z。
最长支持查询60天内数据。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间。 
UTC 格式，例如：2016-06-29T19:00:00Z。
最长支持查询60天内数据。
     * @param StartTime 起始时间。 
UTC 格式，例如：2016-06-29T19:00:00Z。
最长支持查询60天内数据。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。不支持模糊匹配。 
     * @return AppName 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。不支持模糊匹配。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。不支持模糊匹配。
     * @param AppName 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。不支持模糊匹配。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 取得第几页。
默认值：1。 
     * @return PageNum 取得第几页。
默认值：1。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 取得第几页。
默认值：1。
     * @param PageNum 取得第几页。
默认值：1。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。 
     * @return PageSize 分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。
     * @param PageSize 分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 流名称，支持模糊匹配。 
     * @return StreamName 流名称，支持模糊匹配。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称，支持模糊匹配。
     * @param StreamName 流名称，支持模糊匹配。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

