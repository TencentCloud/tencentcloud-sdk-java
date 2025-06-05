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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoundPlaysRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 过滤条件：轮播播单标识，数组长度限制：100。
    */
    @SerializedName("RoundPlayIds")
    @Expose
    private String [] RoundPlayIds;

    /**
    * 过滤条件，轮播播单状态，可选值： <li>Enabled：启动状态；</li> <li>Disabled：停止状态。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 过滤条件：轮播播单创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * 过滤条件：轮播播单更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private TimeRange UpdateTime;

    /**
    * 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 分页偏移量，默认值：0。已经废弃，请根据 ScrollToken 参数进行分批次查询。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：10，最大值：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 过滤条件：轮播播单标识，数组长度限制：100。 
     * @return RoundPlayIds 过滤条件：轮播播单标识，数组长度限制：100。
     */
    public String [] getRoundPlayIds() {
        return this.RoundPlayIds;
    }

    /**
     * Set 过滤条件：轮播播单标识，数组长度限制：100。
     * @param RoundPlayIds 过滤条件：轮播播单标识，数组长度限制：100。
     */
    public void setRoundPlayIds(String [] RoundPlayIds) {
        this.RoundPlayIds = RoundPlayIds;
    }

    /**
     * Get 过滤条件，轮播播单状态，可选值： <li>Enabled：启动状态；</li> <li>Disabled：停止状态。</li> 
     * @return Status 过滤条件，轮播播单状态，可选值： <li>Enabled：启动状态；</li> <li>Disabled：停止状态。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 过滤条件，轮播播单状态，可选值： <li>Enabled：启动状态；</li> <li>Disabled：停止状态。</li>
     * @param Status 过滤条件，轮播播单状态，可选值： <li>Enabled：启动状态；</li> <li>Disabled：停止状态。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 过滤条件：轮播播单创建时间。 
     * @return CreateTime 过滤条件：轮播播单创建时间。
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 过滤条件：轮播播单创建时间。
     * @param CreateTime 过滤条件：轮播播单创建时间。
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过滤条件：轮播播单更新时间。 
     * @return UpdateTime 过滤条件：轮播播单更新时间。
     */
    public TimeRange getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 过滤条件：轮播播单更新时间。
     * @param UpdateTime 过滤条件：轮播播单更新时间。
     */
    public void setUpdateTime(TimeRange UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。 
     * @return ScrollToken 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
     * @param ScrollToken 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get 分页偏移量，默认值：0。已经废弃，请根据 ScrollToken 参数进行分批次查询。 
     * @return Offset 分页偏移量，默认值：0。已经废弃，请根据 ScrollToken 参数进行分批次查询。
     * @deprecated
     */
    @Deprecated
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。已经废弃，请根据 ScrollToken 参数进行分批次查询。
     * @param Offset 分页偏移量，默认值：0。已经废弃，请根据 ScrollToken 参数进行分批次查询。
     * @deprecated
     */
    @Deprecated
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：10，最大值：100。 
     * @return Limit 返回记录条数，默认值：10，最大值：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：10，最大值：100。
     * @param Limit 返回记录条数，默认值：10，最大值：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRoundPlaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoundPlaysRequest(DescribeRoundPlaysRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RoundPlayIds != null) {
            this.RoundPlayIds = new String[source.RoundPlayIds.length];
            for (int i = 0; i < source.RoundPlayIds.length; i++) {
                this.RoundPlayIds[i] = new String(source.RoundPlayIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new TimeRange(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new TimeRange(source.UpdateTime);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "RoundPlayIds.", this.RoundPlayIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamObj(map, prefix + "UpdateTime.", this.UpdateTime);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

