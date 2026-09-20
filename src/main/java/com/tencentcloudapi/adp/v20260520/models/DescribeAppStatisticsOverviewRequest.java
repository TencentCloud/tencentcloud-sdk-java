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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppStatisticsOverviewRequest extends AbstractModel {

    /**
    * <p>应用类型。可选值：APP_TYPE_RAG（RAG）、APP_TYPE_WORKFLOW（Workflow）、APP_TYPE_CLAW（Claw）、APP_TYPE_MULTIAGENT（MultiAgent）；本期仅 APP_TYPE_RAG 生效，其余为预留值，传入将返回 InvalidParameter</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG（本期唯一支持）</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow（预留，暂不支持）</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw（预留，暂不支持）</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent（预留，暂不支持）</td></tr></tbody></table>
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
    * <p>查询时间范围（Unix 秒）</p>
    */
    @SerializedName("TimeRange")
    @Expose
    private TimeRange TimeRange;

    /**
    * <p>视图范围：应用视图（VIEW_TYPE_APP），scope_id 填应用 ID（uint64 雪花 ID 的十进制字符串）</p>
    */
    @SerializedName("ViewScope")
    @Expose
    private ViewScope ViewScope;

    /**
    * <p>空间 ID</p><p>参数格式：<p>空间 ID</p></p><p>默认值：default_space</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>应用 ID</p><p>参数格式：</p><p>应用 ID</p><p></p><p>参考值：2099767969573745984</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>扩展过滤。Filter 组合规则：多项 AND，同项 value_list OR。支持 Name：space_id（空间 ID）、channel_type（调用方式/渠道类型，取值参考 trpc.adp.common.v2.ChannelType 枚举名）；channel_type 不传时按全部渠道聚合</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
     * Get <p>应用类型。可选值：APP_TYPE_RAG（RAG）、APP_TYPE_WORKFLOW（Workflow）、APP_TYPE_CLAW（Claw）、APP_TYPE_MULTIAGENT（MultiAgent）；本期仅 APP_TYPE_RAG 生效，其余为预留值，传入将返回 InvalidParameter</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG（本期唯一支持）</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow（预留，暂不支持）</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw（预留，暂不支持）</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent（预留，暂不支持）</td></tr></tbody></table> 
     * @return AppType <p>应用类型。可选值：APP_TYPE_RAG（RAG）、APP_TYPE_WORKFLOW（Workflow）、APP_TYPE_CLAW（Claw）、APP_TYPE_MULTIAGENT（MultiAgent）；本期仅 APP_TYPE_RAG 生效，其余为预留值，传入将返回 InvalidParameter</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG（本期唯一支持）</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow（预留，暂不支持）</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw（预留，暂不支持）</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent（预留，暂不支持）</td></tr></tbody></table>
     */
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set <p>应用类型。可选值：APP_TYPE_RAG（RAG）、APP_TYPE_WORKFLOW（Workflow）、APP_TYPE_CLAW（Claw）、APP_TYPE_MULTIAGENT（MultiAgent）；本期仅 APP_TYPE_RAG 生效，其余为预留值，传入将返回 InvalidParameter</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG（本期唯一支持）</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow（预留，暂不支持）</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw（预留，暂不支持）</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent（预留，暂不支持）</td></tr></tbody></table>
     * @param AppType <p>应用类型。可选值：APP_TYPE_RAG（RAG）、APP_TYPE_WORKFLOW（Workflow）、APP_TYPE_CLAW（Claw）、APP_TYPE_MULTIAGENT（MultiAgent）；本期仅 APP_TYPE_RAG 生效，其余为预留值，传入将返回 InvalidParameter</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG（本期唯一支持）</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow（预留，暂不支持）</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw（预留，暂不支持）</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent（预留，暂不支持）</td></tr></tbody></table>
     */
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    /**
     * Get <p>查询时间范围（Unix 秒）</p> 
     * @return TimeRange <p>查询时间范围（Unix 秒）</p>
     */
    public TimeRange getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>查询时间范围（Unix 秒）</p>
     * @param TimeRange <p>查询时间范围（Unix 秒）</p>
     */
    public void setTimeRange(TimeRange TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get <p>视图范围：应用视图（VIEW_TYPE_APP），scope_id 填应用 ID（uint64 雪花 ID 的十进制字符串）</p> 
     * @return ViewScope <p>视图范围：应用视图（VIEW_TYPE_APP），scope_id 填应用 ID（uint64 雪花 ID 的十进制字符串）</p>
     */
    public ViewScope getViewScope() {
        return this.ViewScope;
    }

    /**
     * Set <p>视图范围：应用视图（VIEW_TYPE_APP），scope_id 填应用 ID（uint64 雪花 ID 的十进制字符串）</p>
     * @param ViewScope <p>视图范围：应用视图（VIEW_TYPE_APP），scope_id 填应用 ID（uint64 雪花 ID 的十进制字符串）</p>
     */
    public void setViewScope(ViewScope ViewScope) {
        this.ViewScope = ViewScope;
    }

    /**
     * Get <p>空间 ID</p><p>参数格式：<p>空间 ID</p></p><p>默认值：default_space</p> 
     * @return SpaceId <p>空间 ID</p><p>参数格式：<p>空间 ID</p></p><p>默认值：default_space</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>空间 ID</p><p>参数格式：<p>空间 ID</p></p><p>默认值：default_space</p>
     * @param SpaceId <p>空间 ID</p><p>参数格式：<p>空间 ID</p></p><p>默认值：default_space</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>应用 ID</p><p>参数格式：</p><p>应用 ID</p><p></p><p>参考值：2099767969573745984</p> 
     * @return AppId <p>应用 ID</p><p>参数格式：</p><p>应用 ID</p><p></p><p>参考值：2099767969573745984</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p><p>参数格式：</p><p>应用 ID</p><p></p><p>参考值：2099767969573745984</p>
     * @param AppId <p>应用 ID</p><p>参数格式：</p><p>应用 ID</p><p></p><p>参考值：2099767969573745984</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>扩展过滤。Filter 组合规则：多项 AND，同项 value_list OR。支持 Name：space_id（空间 ID）、channel_type（调用方式/渠道类型，取值参考 trpc.adp.common.v2.ChannelType 枚举名）；channel_type 不传时按全部渠道聚合</p> 
     * @return FilterList <p>扩展过滤。Filter 组合规则：多项 AND，同项 value_list OR。支持 Name：space_id（空间 ID）、channel_type（调用方式/渠道类型，取值参考 trpc.adp.common.v2.ChannelType 枚举名）；channel_type 不传时按全部渠道聚合</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>扩展过滤。Filter 组合规则：多项 AND，同项 value_list OR。支持 Name：space_id（空间 ID）、channel_type（调用方式/渠道类型，取值参考 trpc.adp.common.v2.ChannelType 枚举名）；channel_type 不传时按全部渠道聚合</p>
     * @param FilterList <p>扩展过滤。Filter 组合规则：多项 AND，同项 value_list OR。支持 Name：space_id（空间 ID）、channel_type（调用方式/渠道类型，取值参考 trpc.adp.common.v2.ChannelType 枚举名）；channel_type 不传时按全部渠道聚合</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    public DescribeAppStatisticsOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppStatisticsOverviewRequest(DescribeAppStatisticsOverviewRequest source) {
        if (source.AppType != null) {
            this.AppType = new Long(source.AppType);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new TimeRange(source.TimeRange);
        }
        if (source.ViewScope != null) {
            this.ViewScope = new ViewScope(source.ViewScope);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamObj(map, prefix + "TimeRange.", this.TimeRange);
        this.setParamObj(map, prefix + "ViewScope.", this.ViewScope);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);

    }
}

