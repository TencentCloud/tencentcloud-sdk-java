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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListChannelRequest extends AbstractModel {

    /**
    * 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)）
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 页码（必须大于0）
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页数量（取值范围为1-200）
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 渠道类型, 10000: 微信订阅号，10001: 微信服务号，10002：企微应用，10004：微信客服，10005：小程序，10009：企微智能机器人 。（默认为[]）
    */
    @SerializedName("ChannelType")
    @Expose
    private Long [] ChannelType;

    /**
    * 渠道状态 1未发布 2运行中 3已下线 （默认为[]）
    */
    @SerializedName("ChannelStatus")
    @Expose
    private Long [] ChannelStatus;

    /**
     * Get 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)） 
     * @return AppBizId 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)）
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)）
     * @param AppBizId 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)）
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     * @deprecated
     */
    @Deprecated
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     * @deprecated
     */
    @Deprecated
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 页码（必须大于0） 
     * @return PageNumber 页码（必须大于0）
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码（必须大于0）
     * @param PageNumber 页码（必须大于0）
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页数量（取值范围为1-200） 
     * @return PageSize 分页数量（取值范围为1-200）
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页数量（取值范围为1-200）
     * @param PageSize 分页数量（取值范围为1-200）
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 渠道类型, 10000: 微信订阅号，10001: 微信服务号，10002：企微应用，10004：微信客服，10005：小程序，10009：企微智能机器人 。（默认为[]） 
     * @return ChannelType 渠道类型, 10000: 微信订阅号，10001: 微信服务号，10002：企微应用，10004：微信客服，10005：小程序，10009：企微智能机器人 。（默认为[]）
     */
    public Long [] getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set 渠道类型, 10000: 微信订阅号，10001: 微信服务号，10002：企微应用，10004：微信客服，10005：小程序，10009：企微智能机器人 。（默认为[]）
     * @param ChannelType 渠道类型, 10000: 微信订阅号，10001: 微信服务号，10002：企微应用，10004：微信客服，10005：小程序，10009：企微智能机器人 。（默认为[]）
     */
    public void setChannelType(Long [] ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get 渠道状态 1未发布 2运行中 3已下线 （默认为[]） 
     * @return ChannelStatus 渠道状态 1未发布 2运行中 3已下线 （默认为[]）
     */
    public Long [] getChannelStatus() {
        return this.ChannelStatus;
    }

    /**
     * Set 渠道状态 1未发布 2运行中 3已下线 （默认为[]）
     * @param ChannelStatus 渠道状态 1未发布 2运行中 3已下线 （默认为[]）
     */
    public void setChannelStatus(Long [] ChannelStatus) {
        this.ChannelStatus = ChannelStatus;
    }

    public ListChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListChannelRequest(ListChannelRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ChannelType != null) {
            this.ChannelType = new Long[source.ChannelType.length];
            for (int i = 0; i < source.ChannelType.length; i++) {
                this.ChannelType[i] = new Long(source.ChannelType[i]);
            }
        }
        if (source.ChannelStatus != null) {
            this.ChannelStatus = new Long[source.ChannelStatus.length];
            for (int i = 0; i < source.ChannelStatus.length; i++) {
                this.ChannelStatus[i] = new Long(source.ChannelStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "ChannelType.", this.ChannelType);
        this.setParamArraySimple(map, prefix + "ChannelStatus.", this.ChannelStatus);

    }
}

