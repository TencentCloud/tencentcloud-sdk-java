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

public class RateMsgRecordRequest extends AbstractModel {

    /**
    * 应用appKey
    */
    @SerializedName("BotAppKey")
    @Expose
    private String BotAppKey;

    /**
    * 消息ID 【大模型回复答案的RecordID】
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 1: 点赞;  2: 点踩;   
注：
1) 评测端不支持点赞、点踩
2) 消息回复类型为欢迎语、并发超限、实时文档，不支持点赞、点踩
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 原因，只有Score参数为2即点踩的时候才需要输入
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
     * Get 应用appKey 
     * @return BotAppKey 应用appKey
     */
    public String getBotAppKey() {
        return this.BotAppKey;
    }

    /**
     * Set 应用appKey
     * @param BotAppKey 应用appKey
     */
    public void setBotAppKey(String BotAppKey) {
        this.BotAppKey = BotAppKey;
    }

    /**
     * Get 消息ID 【大模型回复答案的RecordID】 
     * @return RecordId 消息ID 【大模型回复答案的RecordID】
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 消息ID 【大模型回复答案的RecordID】
     * @param RecordId 消息ID 【大模型回复答案的RecordID】
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 1: 点赞;  2: 点踩;   
注：
1) 评测端不支持点赞、点踩
2) 消息回复类型为欢迎语、并发超限、实时文档，不支持点赞、点踩 
     * @return Score 1: 点赞;  2: 点踩;   
注：
1) 评测端不支持点赞、点踩
2) 消息回复类型为欢迎语、并发超限、实时文档，不支持点赞、点踩
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 1: 点赞;  2: 点踩;   
注：
1) 评测端不支持点赞、点踩
2) 消息回复类型为欢迎语、并发超限、实时文档，不支持点赞、点踩
     * @param Score 1: 点赞;  2: 点踩;   
注：
1) 评测端不支持点赞、点踩
2) 消息回复类型为欢迎语、并发超限、实时文档，不支持点赞、点踩
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 原因，只有Score参数为2即点踩的时候才需要输入 
     * @return Reasons 原因，只有Score参数为2即点踩的时候才需要输入
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set 原因，只有Score参数为2即点踩的时候才需要输入
     * @param Reasons 原因，只有Score参数为2即点踩的时候才需要输入
     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    public RateMsgRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateMsgRecordRequest(RateMsgRecordRequest source) {
        if (source.BotAppKey != null) {
            this.BotAppKey = new String(source.BotAppKey);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotAppKey", this.BotAppKey);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);

    }
}

