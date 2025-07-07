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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassScoreItem extends AbstractModel {

    /**
    * 课堂iD
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 评分时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 课堂评分
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 课堂评价
    */
    @SerializedName("ScoreMsg")
    @Expose
    private String ScoreMsg;

    /**
     * Get 课堂iD 
     * @return RoomId 课堂iD
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 课堂iD
     * @param RoomId 课堂iD
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 评分时间 
     * @return CreateTime 评分时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 评分时间
     * @param CreateTime 评分时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 课堂评分 
     * @return Score 课堂评分
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 课堂评分
     * @param Score 课堂评分
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 课堂评价 
     * @return ScoreMsg 课堂评价
     */
    public String getScoreMsg() {
        return this.ScoreMsg;
    }

    /**
     * Set 课堂评价
     * @param ScoreMsg 课堂评价
     */
    public void setScoreMsg(String ScoreMsg) {
        this.ScoreMsg = ScoreMsg;
    }

    public ClassScoreItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassScoreItem(ClassScoreItem source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.ScoreMsg != null) {
            this.ScoreMsg = new String(source.ScoreMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "ScoreMsg", this.ScoreMsg);

    }
}

