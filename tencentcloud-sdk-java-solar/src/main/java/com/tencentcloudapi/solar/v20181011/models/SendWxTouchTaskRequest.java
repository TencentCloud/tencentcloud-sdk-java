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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendWxTouchTaskRequest extends AbstractModel{

    /**
    * 客户分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 去除今日已发送的客户
    */
    @SerializedName("DistinctFlag")
    @Expose
    private Boolean DistinctFlag;

    /**
    * 是否立马发送
    */
    @SerializedName("IsSendNow")
    @Expose
    private Boolean IsSendNow;

    /**
    * 发送时间，一般为0
    */
    @SerializedName("SendDate")
    @Expose
    private Long SendDate;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 微信触达类型，text, news, smallapp, tmplmsg
    */
    @SerializedName("WxTouchType")
    @Expose
    private String WxTouchType;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 文本内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 图文素材ID
    */
    @SerializedName("NewsId")
    @Expose
    private String NewsId;

    /**
    * 小程序卡片ID
    */
    @SerializedName("SmallProgramId")
    @Expose
    private String SmallProgramId;

    /**
    * 模板消息ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 微信公众号appId
    */
    @SerializedName("WxAppId")
    @Expose
    private String WxAppId;

    /**
     * Get 客户分组ID 
     * @return GroupId 客户分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 客户分组ID
     * @param GroupId 客户分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 去除今日已发送的客户 
     * @return DistinctFlag 去除今日已发送的客户
     */
    public Boolean getDistinctFlag() {
        return this.DistinctFlag;
    }

    /**
     * Set 去除今日已发送的客户
     * @param DistinctFlag 去除今日已发送的客户
     */
    public void setDistinctFlag(Boolean DistinctFlag) {
        this.DistinctFlag = DistinctFlag;
    }

    /**
     * Get 是否立马发送 
     * @return IsSendNow 是否立马发送
     */
    public Boolean getIsSendNow() {
        return this.IsSendNow;
    }

    /**
     * Set 是否立马发送
     * @param IsSendNow 是否立马发送
     */
    public void setIsSendNow(Boolean IsSendNow) {
        this.IsSendNow = IsSendNow;
    }

    /**
     * Get 发送时间，一般为0 
     * @return SendDate 发送时间，一般为0
     */
    public Long getSendDate() {
        return this.SendDate;
    }

    /**
     * Set 发送时间，一般为0
     * @param SendDate 发送时间，一般为0
     */
    public void setSendDate(Long SendDate) {
        this.SendDate = SendDate;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 微信触达类型，text, news, smallapp, tmplmsg 
     * @return WxTouchType 微信触达类型，text, news, smallapp, tmplmsg
     */
    public String getWxTouchType() {
        return this.WxTouchType;
    }

    /**
     * Set 微信触达类型，text, news, smallapp, tmplmsg
     * @param WxTouchType 微信触达类型，text, news, smallapp, tmplmsg
     */
    public void setWxTouchType(String WxTouchType) {
        this.WxTouchType = WxTouchType;
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

    /**
     * Get 文本内容 
     * @return Content 文本内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文本内容
     * @param Content 文本内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 图文素材ID 
     * @return NewsId 图文素材ID
     */
    public String getNewsId() {
        return this.NewsId;
    }

    /**
     * Set 图文素材ID
     * @param NewsId 图文素材ID
     */
    public void setNewsId(String NewsId) {
        this.NewsId = NewsId;
    }

    /**
     * Get 小程序卡片ID 
     * @return SmallProgramId 小程序卡片ID
     */
    public String getSmallProgramId() {
        return this.SmallProgramId;
    }

    /**
     * Set 小程序卡片ID
     * @param SmallProgramId 小程序卡片ID
     */
    public void setSmallProgramId(String SmallProgramId) {
        this.SmallProgramId = SmallProgramId;
    }

    /**
     * Get 模板消息ID 
     * @return TemplateId 模板消息ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板消息ID
     * @param TemplateId 模板消息ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 微信公众号appId 
     * @return WxAppId 微信公众号appId
     */
    public String getWxAppId() {
        return this.WxAppId;
    }

    /**
     * Set 微信公众号appId
     * @param WxAppId 微信公众号appId
     */
    public void setWxAppId(String WxAppId) {
        this.WxAppId = WxAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DistinctFlag", this.DistinctFlag);
        this.setParamSimple(map, prefix + "IsSendNow", this.IsSendNow);
        this.setParamSimple(map, prefix + "SendDate", this.SendDate);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WxTouchType", this.WxTouchType);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "NewsId", this.NewsId);
        this.setParamSimple(map, prefix + "SmallProgramId", this.SmallProgramId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "WxAppId", this.WxAppId);

    }
}

