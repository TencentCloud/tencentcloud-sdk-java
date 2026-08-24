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

public class DescribeMsgRecordListRequest extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <ul><li><strong>ChannelType</strong> :   0-表示全部 2-体验页面（腾讯云）3-调试页面（腾讯云）4-体验页面（手机号）5-对话端API接入 6-应用评测 7-调试API&#39; 10000-微信服务号 10001-微信订阅号 10002-企微应用 10004-微信客服 10005-微信小程序 10006-腾讯元器 10007-应用宝 10009-企微智能机器人 10014-企微智能机器人 10011-LINE 10012-Telegram 10013-钉钉机器人 10016-飞书机器人 30000-定时任务 30001-触发器 </li><li><strong>FeedbackType</strong> :   反馈类型，-1-表示全部 0-未评价 1-点赞 2-点踩 </li><li><strong>QueryType</strong> :    检索类型（按平台约定取值）, SessionId-sessionID Question-问题  Answer-回复 Intent-意图 User-用户 </li><li><strong>Query</strong> : 对应QueryType输入的过滤条件 </li><li><strong>CategoryId</strong> :  分类ID </li><li><strong>ReplyMethod</strong> :  回复类型 0-全部回复类型  1-拒答问题回复 2-问答直接回复 3-审核失败回复 4-知识润色回复 6-工作流回复 8-图片理解回复 9-搜索引擎回复 10-大模型直接回复 11-兜底回复 </li><li><strong>StartTime</strong> : 开始时间，秒级时间戳 </li><li><strong>EndTime</strong>:  结束时间，秒级时间戳 </li><li><strong>Cursor</strong> : 游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor  </li><li><strong>Direction</strong> : 方向，next 下一页，prev 上一页</li><li><strong>CallResult</strong> : 调用结果：0 全部 / 1 成功 / 2 失败 / 3 用户取消 &lt;</li><li><strong>FailReason</strong> : 失败原因 0-全部  1-审核失败 2-达到QPM上限 3-达到TPM上限 4-达到并发上限  5-系统异常 </li><li><strong>Intent</strong> :  意图</li></ul>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>页码，从 0 开始；不传时按 0 处理</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>排序条件，只支持按 CreateTime 排序</p>
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <ul><li><strong>ChannelType</strong> :   0-表示全部 2-体验页面（腾讯云）3-调试页面（腾讯云）4-体验页面（手机号）5-对话端API接入 6-应用评测 7-调试API&#39; 10000-微信服务号 10001-微信订阅号 10002-企微应用 10004-微信客服 10005-微信小程序 10006-腾讯元器 10007-应用宝 10009-企微智能机器人 10014-企微智能机器人 10011-LINE 10012-Telegram 10013-钉钉机器人 10016-飞书机器人 30000-定时任务 30001-触发器 </li><li><strong>FeedbackType</strong> :   反馈类型，-1-表示全部 0-未评价 1-点赞 2-点踩 </li><li><strong>QueryType</strong> :    检索类型（按平台约定取值）, SessionId-sessionID Question-问题  Answer-回复 Intent-意图 User-用户 </li><li><strong>Query</strong> : 对应QueryType输入的过滤条件 </li><li><strong>CategoryId</strong> :  分类ID </li><li><strong>ReplyMethod</strong> :  回复类型 0-全部回复类型  1-拒答问题回复 2-问答直接回复 3-审核失败回复 4-知识润色回复 6-工作流回复 8-图片理解回复 9-搜索引擎回复 10-大模型直接回复 11-兜底回复 </li><li><strong>StartTime</strong> : 开始时间，秒级时间戳 </li><li><strong>EndTime</strong>:  结束时间，秒级时间戳 </li><li><strong>Cursor</strong> : 游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor  </li><li><strong>Direction</strong> : 方向，next 下一页，prev 上一页</li><li><strong>CallResult</strong> : 调用结果：0 全部 / 1 成功 / 2 失败 / 3 用户取消 &lt;</li><li><strong>FailReason</strong> : 失败原因 0-全部  1-审核失败 2-达到QPM上限 3-达到TPM上限 4-达到并发上限  5-系统异常 </li><li><strong>Intent</strong> :  意图</li></ul> 
     * @return FilterList <ul><li><strong>ChannelType</strong> :   0-表示全部 2-体验页面（腾讯云）3-调试页面（腾讯云）4-体验页面（手机号）5-对话端API接入 6-应用评测 7-调试API&#39; 10000-微信服务号 10001-微信订阅号 10002-企微应用 10004-微信客服 10005-微信小程序 10006-腾讯元器 10007-应用宝 10009-企微智能机器人 10014-企微智能机器人 10011-LINE 10012-Telegram 10013-钉钉机器人 10016-飞书机器人 30000-定时任务 30001-触发器 </li><li><strong>FeedbackType</strong> :   反馈类型，-1-表示全部 0-未评价 1-点赞 2-点踩 </li><li><strong>QueryType</strong> :    检索类型（按平台约定取值）, SessionId-sessionID Question-问题  Answer-回复 Intent-意图 User-用户 </li><li><strong>Query</strong> : 对应QueryType输入的过滤条件 </li><li><strong>CategoryId</strong> :  分类ID </li><li><strong>ReplyMethod</strong> :  回复类型 0-全部回复类型  1-拒答问题回复 2-问答直接回复 3-审核失败回复 4-知识润色回复 6-工作流回复 8-图片理解回复 9-搜索引擎回复 10-大模型直接回复 11-兜底回复 </li><li><strong>StartTime</strong> : 开始时间，秒级时间戳 </li><li><strong>EndTime</strong>:  结束时间，秒级时间戳 </li><li><strong>Cursor</strong> : 游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor  </li><li><strong>Direction</strong> : 方向，next 下一页，prev 上一页</li><li><strong>CallResult</strong> : 调用结果：0 全部 / 1 成功 / 2 失败 / 3 用户取消 &lt;</li><li><strong>FailReason</strong> : 失败原因 0-全部  1-审核失败 2-达到QPM上限 3-达到TPM上限 4-达到并发上限  5-系统异常 </li><li><strong>Intent</strong> :  意图</li></ul>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <ul><li><strong>ChannelType</strong> :   0-表示全部 2-体验页面（腾讯云）3-调试页面（腾讯云）4-体验页面（手机号）5-对话端API接入 6-应用评测 7-调试API&#39; 10000-微信服务号 10001-微信订阅号 10002-企微应用 10004-微信客服 10005-微信小程序 10006-腾讯元器 10007-应用宝 10009-企微智能机器人 10014-企微智能机器人 10011-LINE 10012-Telegram 10013-钉钉机器人 10016-飞书机器人 30000-定时任务 30001-触发器 </li><li><strong>FeedbackType</strong> :   反馈类型，-1-表示全部 0-未评价 1-点赞 2-点踩 </li><li><strong>QueryType</strong> :    检索类型（按平台约定取值）, SessionId-sessionID Question-问题  Answer-回复 Intent-意图 User-用户 </li><li><strong>Query</strong> : 对应QueryType输入的过滤条件 </li><li><strong>CategoryId</strong> :  分类ID </li><li><strong>ReplyMethod</strong> :  回复类型 0-全部回复类型  1-拒答问题回复 2-问答直接回复 3-审核失败回复 4-知识润色回复 6-工作流回复 8-图片理解回复 9-搜索引擎回复 10-大模型直接回复 11-兜底回复 </li><li><strong>StartTime</strong> : 开始时间，秒级时间戳 </li><li><strong>EndTime</strong>:  结束时间，秒级时间戳 </li><li><strong>Cursor</strong> : 游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor  </li><li><strong>Direction</strong> : 方向，next 下一页，prev 上一页</li><li><strong>CallResult</strong> : 调用结果：0 全部 / 1 成功 / 2 失败 / 3 用户取消 &lt;</li><li><strong>FailReason</strong> : 失败原因 0-全部  1-审核失败 2-达到QPM上限 3-达到TPM上限 4-达到并发上限  5-系统异常 </li><li><strong>Intent</strong> :  意图</li></ul>
     * @param FilterList <ul><li><strong>ChannelType</strong> :   0-表示全部 2-体验页面（腾讯云）3-调试页面（腾讯云）4-体验页面（手机号）5-对话端API接入 6-应用评测 7-调试API&#39; 10000-微信服务号 10001-微信订阅号 10002-企微应用 10004-微信客服 10005-微信小程序 10006-腾讯元器 10007-应用宝 10009-企微智能机器人 10014-企微智能机器人 10011-LINE 10012-Telegram 10013-钉钉机器人 10016-飞书机器人 30000-定时任务 30001-触发器 </li><li><strong>FeedbackType</strong> :   反馈类型，-1-表示全部 0-未评价 1-点赞 2-点踩 </li><li><strong>QueryType</strong> :    检索类型（按平台约定取值）, SessionId-sessionID Question-问题  Answer-回复 Intent-意图 User-用户 </li><li><strong>Query</strong> : 对应QueryType输入的过滤条件 </li><li><strong>CategoryId</strong> :  分类ID </li><li><strong>ReplyMethod</strong> :  回复类型 0-全部回复类型  1-拒答问题回复 2-问答直接回复 3-审核失败回复 4-知识润色回复 6-工作流回复 8-图片理解回复 9-搜索引擎回复 10-大模型直接回复 11-兜底回复 </li><li><strong>StartTime</strong> : 开始时间，秒级时间戳 </li><li><strong>EndTime</strong>:  结束时间，秒级时间戳 </li><li><strong>Cursor</strong> : 游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor  </li><li><strong>Direction</strong> : 方向，next 下一页，prev 上一页</li><li><strong>CallResult</strong> : 调用结果：0 全部 / 1 成功 / 2 失败 / 3 用户取消 &lt;</li><li><strong>FailReason</strong> : 失败原因 0-全部  1-审核失败 2-达到QPM上限 3-达到TPM上限 4-达到并发上限  5-系统异常 </li><li><strong>Intent</strong> :  意图</li></ul>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>页码，从 0 开始；不传时按 0 处理</p> 
     * @return PageNumber <p>页码，从 0 开始；不传时按 0 处理</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，从 0 开始；不传时按 0 处理</p>
     * @param PageNumber <p>页码，从 0 开始；不传时按 0 处理</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p> 
     * @return PageSize <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p>
     * @param PageSize <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>排序条件，只支持按 CreateTime 排序</p> 
     * @return Sort <p>排序条件，只支持按 CreateTime 排序</p>
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序条件，只支持按 CreateTime 排序</p>
     * @param Sort <p>排序条件，只支持按 CreateTime 排序</p>
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    public DescribeMsgRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMsgRecordListRequest(DescribeMsgRecordListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Sort != null) {
            this.Sort = new Sort(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "Sort.", this.Sort);

    }
}

