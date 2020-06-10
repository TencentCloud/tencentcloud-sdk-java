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

public class DescribeLiveStreamEventListRequest extends AbstractModel{

    /**
    * 起始时间。 
UTC 格式，例如：2018-12-29T19:00:00Z。
支持查询60天内的历史记录。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
UTC 格式，例如：2018-12-29T20:00:00Z。
不超过当前时间，且和起始时间相差不得超过30天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 推流域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 流名称，不支持通配符（*）查询，默认模糊匹配。
可使用IsStrict字段改为精确查询。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 取得第几页。
默认值：1。
注： 目前只支持10000条内的查询。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 分页大小。
最大值：100。
取值范围：1~100 之间的任意整数。
默认值：10。
注： 目前只支持10000条内的查询。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 是否过滤，默认不过滤。
0：不进行任何过滤。
1：过滤掉开播失败的，只返回开播成功的。
    */
    @SerializedName("IsFilter")
    @Expose
    private Long IsFilter;

    /**
    * 是否精确查询，默认模糊匹配。
0：模糊匹配。
1：精确查询。
注：使用StreamName时该参数生效。
    */
    @SerializedName("IsStrict")
    @Expose
    private Long IsStrict;

    /**
    * 是否按结束时间正序显示，默认逆序。
0：逆序。
1：正序。
    */
    @SerializedName("IsAsc")
    @Expose
    private Long IsAsc;

    /**
     * Get 起始时间。 
UTC 格式，例如：2018-12-29T19:00:00Z。
支持查询60天内的历史记录。 
     * @return StartTime 起始时间。 
UTC 格式，例如：2018-12-29T19:00:00Z。
支持查询60天内的历史记录。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间。 
UTC 格式，例如：2018-12-29T19:00:00Z。
支持查询60天内的历史记录。
     * @param StartTime 起始时间。 
UTC 格式，例如：2018-12-29T19:00:00Z。
支持查询60天内的历史记录。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。
UTC 格式，例如：2018-12-29T20:00:00Z。
不超过当前时间，且和起始时间相差不得超过30天。 
     * @return EndTime 结束时间。
UTC 格式，例如：2018-12-29T20:00:00Z。
不超过当前时间，且和起始时间相差不得超过30天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
UTC 格式，例如：2018-12-29T20:00:00Z。
不超过当前时间，且和起始时间相差不得超过30天。
     * @param EndTime 结束时间。
UTC 格式，例如：2018-12-29T20:00:00Z。
不超过当前时间，且和起始时间相差不得超过30天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。 
     * @return AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     * @param AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 推流域名。 
     * @return DomainName 推流域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。
     * @param DomainName 推流域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 流名称，不支持通配符（*）查询，默认模糊匹配。
可使用IsStrict字段改为精确查询。 
     * @return StreamName 流名称，不支持通配符（*）查询，默认模糊匹配。
可使用IsStrict字段改为精确查询。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称，不支持通配符（*）查询，默认模糊匹配。
可使用IsStrict字段改为精确查询。
     * @param StreamName 流名称，不支持通配符（*）查询，默认模糊匹配。
可使用IsStrict字段改为精确查询。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 取得第几页。
默认值：1。
注： 目前只支持10000条内的查询。 
     * @return PageNum 取得第几页。
默认值：1。
注： 目前只支持10000条内的查询。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 取得第几页。
默认值：1。
注： 目前只支持10000条内的查询。
     * @param PageNum 取得第几页。
默认值：1。
注： 目前只支持10000条内的查询。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 分页大小。
最大值：100。
取值范围：1~100 之间的任意整数。
默认值：10。
注： 目前只支持10000条内的查询。 
     * @return PageSize 分页大小。
最大值：100。
取值范围：1~100 之间的任意整数。
默认值：10。
注： 目前只支持10000条内的查询。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小。
最大值：100。
取值范围：1~100 之间的任意整数。
默认值：10。
注： 目前只支持10000条内的查询。
     * @param PageSize 分页大小。
最大值：100。
取值范围：1~100 之间的任意整数。
默认值：10。
注： 目前只支持10000条内的查询。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 是否过滤，默认不过滤。
0：不进行任何过滤。
1：过滤掉开播失败的，只返回开播成功的。 
     * @return IsFilter 是否过滤，默认不过滤。
0：不进行任何过滤。
1：过滤掉开播失败的，只返回开播成功的。
     */
    public Long getIsFilter() {
        return this.IsFilter;
    }

    /**
     * Set 是否过滤，默认不过滤。
0：不进行任何过滤。
1：过滤掉开播失败的，只返回开播成功的。
     * @param IsFilter 是否过滤，默认不过滤。
0：不进行任何过滤。
1：过滤掉开播失败的，只返回开播成功的。
     */
    public void setIsFilter(Long IsFilter) {
        this.IsFilter = IsFilter;
    }

    /**
     * Get 是否精确查询，默认模糊匹配。
0：模糊匹配。
1：精确查询。
注：使用StreamName时该参数生效。 
     * @return IsStrict 是否精确查询，默认模糊匹配。
0：模糊匹配。
1：精确查询。
注：使用StreamName时该参数生效。
     */
    public Long getIsStrict() {
        return this.IsStrict;
    }

    /**
     * Set 是否精确查询，默认模糊匹配。
0：模糊匹配。
1：精确查询。
注：使用StreamName时该参数生效。
     * @param IsStrict 是否精确查询，默认模糊匹配。
0：模糊匹配。
1：精确查询。
注：使用StreamName时该参数生效。
     */
    public void setIsStrict(Long IsStrict) {
        this.IsStrict = IsStrict;
    }

    /**
     * Get 是否按结束时间正序显示，默认逆序。
0：逆序。
1：正序。 
     * @return IsAsc 是否按结束时间正序显示，默认逆序。
0：逆序。
1：正序。
     */
    public Long getIsAsc() {
        return this.IsAsc;
    }

    /**
     * Set 是否按结束时间正序显示，默认逆序。
0：逆序。
1：正序。
     * @param IsAsc 是否按结束时间正序显示，默认逆序。
0：逆序。
1：正序。
     */
    public void setIsAsc(Long IsAsc) {
        this.IsAsc = IsAsc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "IsFilter", this.IsFilter);
        this.setParamSimple(map, prefix + "IsStrict", this.IsStrict);
        this.setParamSimple(map, prefix + "IsAsc", this.IsAsc);

    }
}

