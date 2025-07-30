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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDashboardsRequest extends AbstractModel {

    /**
    * 分页的偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页单页限制数目，默认值为20，最大值100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * - dashboardId 按照【仪表盘id】进行过滤，类型：String， 必选：否。
- dashboardName 按照【仪表盘名字】进行模糊搜索过滤，类型：String，必选：否。
- dashboardRegion 按照【仪表盘地域】进行过滤，为了兼容老的仪表盘，通过云API创建的仪表盘没有地域属性，类型：String，必选：否。 [地域和访问域名](https://cloud.tencent.com/document/product/614/18940)，例如：ap-guangzhou
- tagKey 按照【标签键】进行过滤，类型：String，必选：否。
- tag:tagKey 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换，类型：String，必选：否，使用请参考[示例2](https://cloud.tencent.com/document/api/614/95636#4.-.E7.A4.BA.E4.BE.8B)。

每次请求的Filters的上限为10，Filter.Values的上限为100。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 按照topicId和regionId过滤。

- topicId:日志主题Id。
    -  通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- regionId
    - 1:广州
    - 4:上海
    - 5:中国香港
    - 7:上海金融
    - 8:北京
    - 9:新加坡
    - 11:深圳金融
    - 15:硅谷
    - 16:成都
    - 17:法兰克福
    - 18:首尔
    - 19:重庆
    - 22:弗吉尼亚
    - 23:曼谷
    - 25:东京
    - 33:南京
    - 36:天津
    - 39:台北
    - 46:北京金融
    - 72:雅加达
    - 74:圣保罗
    - 78:上海自动驾驶云

    */
    @SerializedName("TopicIdRegionFilter")
    @Expose
    private TopicIdAndRegion [] TopicIdRegionFilter;

    /**
     * Get 分页的偏移量，默认值为0。 
     * @return Offset 分页的偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，默认值为0。
     * @param Offset 分页的偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页单页限制数目，默认值为20，最大值100。 
     * @return Limit 分页单页限制数目，默认值为20，最大值100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页单页限制数目，默认值为20，最大值100。
     * @param Limit 分页单页限制数目，默认值为20，最大值100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get - dashboardId 按照【仪表盘id】进行过滤，类型：String， 必选：否。
- dashboardName 按照【仪表盘名字】进行模糊搜索过滤，类型：String，必选：否。
- dashboardRegion 按照【仪表盘地域】进行过滤，为了兼容老的仪表盘，通过云API创建的仪表盘没有地域属性，类型：String，必选：否。 [地域和访问域名](https://cloud.tencent.com/document/product/614/18940)，例如：ap-guangzhou
- tagKey 按照【标签键】进行过滤，类型：String，必选：否。
- tag:tagKey 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换，类型：String，必选：否，使用请参考[示例2](https://cloud.tencent.com/document/api/614/95636#4.-.E7.A4.BA.E4.BE.8B)。

每次请求的Filters的上限为10，Filter.Values的上限为100。 
     * @return Filters - dashboardId 按照【仪表盘id】进行过滤，类型：String， 必选：否。
- dashboardName 按照【仪表盘名字】进行模糊搜索过滤，类型：String，必选：否。
- dashboardRegion 按照【仪表盘地域】进行过滤，为了兼容老的仪表盘，通过云API创建的仪表盘没有地域属性，类型：String，必选：否。 [地域和访问域名](https://cloud.tencent.com/document/product/614/18940)，例如：ap-guangzhou
- tagKey 按照【标签键】进行过滤，类型：String，必选：否。
- tag:tagKey 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换，类型：String，必选：否，使用请参考[示例2](https://cloud.tencent.com/document/api/614/95636#4.-.E7.A4.BA.E4.BE.8B)。

每次请求的Filters的上限为10，Filter.Values的上限为100。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set - dashboardId 按照【仪表盘id】进行过滤，类型：String， 必选：否。
- dashboardName 按照【仪表盘名字】进行模糊搜索过滤，类型：String，必选：否。
- dashboardRegion 按照【仪表盘地域】进行过滤，为了兼容老的仪表盘，通过云API创建的仪表盘没有地域属性，类型：String，必选：否。 [地域和访问域名](https://cloud.tencent.com/document/product/614/18940)，例如：ap-guangzhou
- tagKey 按照【标签键】进行过滤，类型：String，必选：否。
- tag:tagKey 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换，类型：String，必选：否，使用请参考[示例2](https://cloud.tencent.com/document/api/614/95636#4.-.E7.A4.BA.E4.BE.8B)。

每次请求的Filters的上限为10，Filter.Values的上限为100。
     * @param Filters - dashboardId 按照【仪表盘id】进行过滤，类型：String， 必选：否。
- dashboardName 按照【仪表盘名字】进行模糊搜索过滤，类型：String，必选：否。
- dashboardRegion 按照【仪表盘地域】进行过滤，为了兼容老的仪表盘，通过云API创建的仪表盘没有地域属性，类型：String，必选：否。 [地域和访问域名](https://cloud.tencent.com/document/product/614/18940)，例如：ap-guangzhou
- tagKey 按照【标签键】进行过滤，类型：String，必选：否。
- tag:tagKey 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换，类型：String，必选：否，使用请参考[示例2](https://cloud.tencent.com/document/api/614/95636#4.-.E7.A4.BA.E4.BE.8B)。

每次请求的Filters的上限为10，Filter.Values的上限为100。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 按照topicId和regionId过滤。

- topicId:日志主题Id。
    -  通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- regionId
    - 1:广州
    - 4:上海
    - 5:中国香港
    - 7:上海金融
    - 8:北京
    - 9:新加坡
    - 11:深圳金融
    - 15:硅谷
    - 16:成都
    - 17:法兰克福
    - 18:首尔
    - 19:重庆
    - 22:弗吉尼亚
    - 23:曼谷
    - 25:东京
    - 33:南京
    - 36:天津
    - 39:台北
    - 46:北京金融
    - 72:雅加达
    - 74:圣保罗
    - 78:上海自动驾驶云
 
     * @return TopicIdRegionFilter 按照topicId和regionId过滤。

- topicId:日志主题Id。
    -  通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- regionId
    - 1:广州
    - 4:上海
    - 5:中国香港
    - 7:上海金融
    - 8:北京
    - 9:新加坡
    - 11:深圳金融
    - 15:硅谷
    - 16:成都
    - 17:法兰克福
    - 18:首尔
    - 19:重庆
    - 22:弗吉尼亚
    - 23:曼谷
    - 25:东京
    - 33:南京
    - 36:天津
    - 39:台北
    - 46:北京金融
    - 72:雅加达
    - 74:圣保罗
    - 78:上海自动驾驶云

     */
    public TopicIdAndRegion [] getTopicIdRegionFilter() {
        return this.TopicIdRegionFilter;
    }

    /**
     * Set 按照topicId和regionId过滤。

- topicId:日志主题Id。
    -  通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- regionId
    - 1:广州
    - 4:上海
    - 5:中国香港
    - 7:上海金融
    - 8:北京
    - 9:新加坡
    - 11:深圳金融
    - 15:硅谷
    - 16:成都
    - 17:法兰克福
    - 18:首尔
    - 19:重庆
    - 22:弗吉尼亚
    - 23:曼谷
    - 25:东京
    - 33:南京
    - 36:天津
    - 39:台北
    - 46:北京金融
    - 72:雅加达
    - 74:圣保罗
    - 78:上海自动驾驶云

     * @param TopicIdRegionFilter 按照topicId和regionId过滤。

- topicId:日志主题Id。
    -  通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- regionId
    - 1:广州
    - 4:上海
    - 5:中国香港
    - 7:上海金融
    - 8:北京
    - 9:新加坡
    - 11:深圳金融
    - 15:硅谷
    - 16:成都
    - 17:法兰克福
    - 18:首尔
    - 19:重庆
    - 22:弗吉尼亚
    - 23:曼谷
    - 25:东京
    - 33:南京
    - 36:天津
    - 39:台北
    - 46:北京金融
    - 72:雅加达
    - 74:圣保罗
    - 78:上海自动驾驶云

     */
    public void setTopicIdRegionFilter(TopicIdAndRegion [] TopicIdRegionFilter) {
        this.TopicIdRegionFilter = TopicIdRegionFilter;
    }

    public DescribeDashboardsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDashboardsRequest(DescribeDashboardsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TopicIdRegionFilter != null) {
            this.TopicIdRegionFilter = new TopicIdAndRegion[source.TopicIdRegionFilter.length];
            for (int i = 0; i < source.TopicIdRegionFilter.length; i++) {
                this.TopicIdRegionFilter[i] = new TopicIdAndRegion(source.TopicIdRegionFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TopicIdRegionFilter.", this.TopicIdRegionFilter);

    }
}

