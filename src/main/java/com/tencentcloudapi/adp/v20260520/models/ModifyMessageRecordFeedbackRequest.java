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

public class ModifyMessageRecordFeedbackRequest extends AbstractModel {

    /**
    * <p>需要反馈的消息记录ID</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>消息记录所属应用的授权AppKey</p>
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * <p>反馈分值</p><p>枚举值：</p><ul><li>0： 取消点赞或点踩</li><li>1： 点赞</li><li>2： 点踩</li></ul>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>反馈的原因列表</p>
    */
    @SerializedName("ReasonList")
    @Expose
    private String [] ReasonList;

    /**
    * <p>反馈的补充内容</p>
    */
    @SerializedName("FeedbackContent")
    @Expose
    private String FeedbackContent;

    /**
    * <p>消息记录所属的应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get <p>需要反馈的消息记录ID</p> 
     * @return RecordId <p>需要反馈的消息记录ID</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>需要反馈的消息记录ID</p>
     * @param RecordId <p>需要反馈的消息记录ID</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>消息记录所属应用的授权AppKey</p> 
     * @return AppKey <p>消息记录所属应用的授权AppKey</p>
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set <p>消息记录所属应用的授权AppKey</p>
     * @param AppKey <p>消息记录所属应用的授权AppKey</p>
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get <p>反馈分值</p><p>枚举值：</p><ul><li>0： 取消点赞或点踩</li><li>1： 点赞</li><li>2： 点踩</li></ul> 
     * @return Score <p>反馈分值</p><p>枚举值：</p><ul><li>0： 取消点赞或点踩</li><li>1： 点赞</li><li>2： 点踩</li></ul>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>反馈分值</p><p>枚举值：</p><ul><li>0： 取消点赞或点踩</li><li>1： 点赞</li><li>2： 点踩</li></ul>
     * @param Score <p>反馈分值</p><p>枚举值：</p><ul><li>0： 取消点赞或点踩</li><li>1： 点赞</li><li>2： 点踩</li></ul>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>反馈的原因列表</p> 
     * @return ReasonList <p>反馈的原因列表</p>
     */
    public String [] getReasonList() {
        return this.ReasonList;
    }

    /**
     * Set <p>反馈的原因列表</p>
     * @param ReasonList <p>反馈的原因列表</p>
     */
    public void setReasonList(String [] ReasonList) {
        this.ReasonList = ReasonList;
    }

    /**
     * Get <p>反馈的补充内容</p> 
     * @return FeedbackContent <p>反馈的补充内容</p>
     */
    public String getFeedbackContent() {
        return this.FeedbackContent;
    }

    /**
     * Set <p>反馈的补充内容</p>
     * @param FeedbackContent <p>反馈的补充内容</p>
     */
    public void setFeedbackContent(String FeedbackContent) {
        this.FeedbackContent = FeedbackContent;
    }

    /**
     * Get <p>消息记录所属的应用ID</p> 
     * @return AppId <p>消息记录所属的应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>消息记录所属的应用ID</p>
     * @param AppId <p>消息记录所属的应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public ModifyMessageRecordFeedbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMessageRecordFeedbackRequest(ModifyMessageRecordFeedbackRequest source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.ReasonList != null) {
            this.ReasonList = new String[source.ReasonList.length];
            for (int i = 0; i < source.ReasonList.length; i++) {
                this.ReasonList[i] = new String(source.ReasonList[i]);
            }
        }
        if (source.FeedbackContent != null) {
            this.FeedbackContent = new String(source.FeedbackContent);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "ReasonList.", this.ReasonList);
        this.setParamSimple(map, prefix + "FeedbackContent", this.FeedbackContent);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

