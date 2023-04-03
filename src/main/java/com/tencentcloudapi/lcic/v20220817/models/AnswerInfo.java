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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnswerInfo extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
    */
    @SerializedName("Answer")
    @Expose
    private Long Answer;

    /**
    * 答题用时
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 答案是否正确（1正确0错误）
    */
    @SerializedName("IsCorrect")
    @Expose
    private Long IsCorrect;

    /**
     * Get 用户名 
     * @return Name 用户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户名
     * @param Name 用户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB） 
     * @return Answer 答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
     */
    public Long getAnswer() {
        return this.Answer;
    }

    /**
     * Set 答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
     * @param Answer 答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
     */
    public void setAnswer(Long Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 答题用时 
     * @return CostTime 答题用时
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 答题用时
     * @param CostTime 答题用时
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
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
     * Get 答案是否正确（1正确0错误） 
     * @return IsCorrect 答案是否正确（1正确0错误）
     */
    public Long getIsCorrect() {
        return this.IsCorrect;
    }

    /**
     * Set 答案是否正确（1正确0错误）
     * @param IsCorrect 答案是否正确（1正确0错误）
     */
    public void setIsCorrect(Long IsCorrect) {
        this.IsCorrect = IsCorrect;
    }

    public AnswerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnswerInfo(AnswerInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Answer != null) {
            this.Answer = new Long(source.Answer);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.IsCorrect != null) {
            this.IsCorrect = new Long(source.IsCorrect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "IsCorrect", this.IsCorrect);

    }
}

