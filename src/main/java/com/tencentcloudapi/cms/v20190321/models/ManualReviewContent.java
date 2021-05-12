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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManualReviewContent extends AbstractModel{

    /**
    * 审核批次号
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 审核内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 消息Id
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * 审核内容类型 1 图片 2 视频 3 文本 4 音频
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * 用户信息
    */
    @SerializedName("UserInfo")
    @Expose
    private User UserInfo;

    /**
    * 机器审核类型，与腾讯机器审核定义一致
100 正常
20001 政治
20002 色情
20006 违法
20007 谩骂
24001 暴恐
20105 广告
20103 性感
    */
    @SerializedName("AutoDetailCode")
    @Expose
    private Long AutoDetailCode;

    /**
    * 机器审核结果 0 放过 1 拦截
    */
    @SerializedName("AutoResult")
    @Expose
    private Long AutoResult;

    /**
    * 回调信息标识，回传数据时原样返回
    */
    @SerializedName("CallBackInfo")
    @Expose
    private String CallBackInfo;

    /**
    * 创建时间 格式“2020-01-01 00:00:12”
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 审核优先级，可选值 [1,2,3,4]，其中 1 最高，4 最低
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get 审核批次号 
     * @return BatchId 审核批次号
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 审核批次号
     * @param BatchId 审核批次号
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 审核内容 
     * @return Content 审核内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 审核内容
     * @param Content 审核内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 消息Id 
     * @return ContentId 消息Id
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 消息Id
     * @param ContentId 消息Id
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get 审核内容类型 1 图片 2 视频 3 文本 4 音频 
     * @return ContentType 审核内容类型 1 图片 2 视频 3 文本 4 音频
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 审核内容类型 1 图片 2 视频 3 文本 4 音频
     * @param ContentType 审核内容类型 1 图片 2 视频 3 文本 4 音频
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 用户信息 
     * @return UserInfo 用户信息
     */
    public User getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 用户信息
     * @param UserInfo 用户信息
     */
    public void setUserInfo(User UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 机器审核类型，与腾讯机器审核定义一致
100 正常
20001 政治
20002 色情
20006 违法
20007 谩骂
24001 暴恐
20105 广告
20103 性感 
     * @return AutoDetailCode 机器审核类型，与腾讯机器审核定义一致
100 正常
20001 政治
20002 色情
20006 违法
20007 谩骂
24001 暴恐
20105 广告
20103 性感
     */
    public Long getAutoDetailCode() {
        return this.AutoDetailCode;
    }

    /**
     * Set 机器审核类型，与腾讯机器审核定义一致
100 正常
20001 政治
20002 色情
20006 违法
20007 谩骂
24001 暴恐
20105 广告
20103 性感
     * @param AutoDetailCode 机器审核类型，与腾讯机器审核定义一致
100 正常
20001 政治
20002 色情
20006 违法
20007 谩骂
24001 暴恐
20105 广告
20103 性感
     */
    public void setAutoDetailCode(Long AutoDetailCode) {
        this.AutoDetailCode = AutoDetailCode;
    }

    /**
     * Get 机器审核结果 0 放过 1 拦截 
     * @return AutoResult 机器审核结果 0 放过 1 拦截
     */
    public Long getAutoResult() {
        return this.AutoResult;
    }

    /**
     * Set 机器审核结果 0 放过 1 拦截
     * @param AutoResult 机器审核结果 0 放过 1 拦截
     */
    public void setAutoResult(Long AutoResult) {
        this.AutoResult = AutoResult;
    }

    /**
     * Get 回调信息标识，回传数据时原样返回 
     * @return CallBackInfo 回调信息标识，回传数据时原样返回
     */
    public String getCallBackInfo() {
        return this.CallBackInfo;
    }

    /**
     * Set 回调信息标识，回传数据时原样返回
     * @param CallBackInfo 回调信息标识，回传数据时原样返回
     */
    public void setCallBackInfo(String CallBackInfo) {
        this.CallBackInfo = CallBackInfo;
    }

    /**
     * Get 创建时间 格式“2020-01-01 00:00:12” 
     * @return CreateTime 创建时间 格式“2020-01-01 00:00:12”
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间 格式“2020-01-01 00:00:12”
     * @param CreateTime 创建时间 格式“2020-01-01 00:00:12”
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 审核优先级，可选值 [1,2,3,4]，其中 1 最高，4 最低 
     * @return Priority 审核优先级，可选值 [1,2,3,4]，其中 1 最高，4 最低
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 审核优先级，可选值 [1,2,3,4]，其中 1 最高，4 最低
     * @param Priority 审核优先级，可选值 [1,2,3,4]，其中 1 最高，4 最低
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public ManualReviewContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManualReviewContent(ManualReviewContent source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new User(source.UserInfo);
        }
        if (source.AutoDetailCode != null) {
            this.AutoDetailCode = new Long(source.AutoDetailCode);
        }
        if (source.AutoResult != null) {
            this.AutoResult = new Long(source.AutoResult);
        }
        if (source.CallBackInfo != null) {
            this.CallBackInfo = new String(source.CallBackInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "AutoDetailCode", this.AutoDetailCode);
        this.setParamSimple(map, prefix + "AutoResult", this.AutoResult);
        this.setParamSimple(map, prefix + "CallBackInfo", this.CallBackInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

