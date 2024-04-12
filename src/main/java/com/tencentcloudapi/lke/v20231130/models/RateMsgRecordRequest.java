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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateMsgRecordRequest extends AbstractModel {

    /**
    * 机器人appKey
    */
    @SerializedName("BotAppKey")
    @Expose
    private String BotAppKey;

    /**
    * 消息ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 1点赞2点踩
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 原因
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
     * Get 机器人appKey 
     * @return BotAppKey 机器人appKey
     */
    public String getBotAppKey() {
        return this.BotAppKey;
    }

    /**
     * Set 机器人appKey
     * @param BotAppKey 机器人appKey
     */
    public void setBotAppKey(String BotAppKey) {
        this.BotAppKey = BotAppKey;
    }

    /**
     * Get 消息ID 
     * @return RecordId 消息ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 消息ID
     * @param RecordId 消息ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 1点赞2点踩 
     * @return Score 1点赞2点踩
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 1点赞2点踩
     * @param Score 1点赞2点踩
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 原因 
     * @return Reasons 原因
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set 原因
     * @param Reasons 原因
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

