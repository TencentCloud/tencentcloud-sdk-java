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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Comment extends AbstractModel{

    /**
    * 评论的日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 差评的个数
    */
    @SerializedName("NegCommentCount")
    @Expose
    private Long NegCommentCount;

    /**
    * 好评的个数
    */
    @SerializedName("PosCommentCount")
    @Expose
    private Long PosCommentCount;

    /**
     * Get 评论的日期 
     * @return Date 评论的日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 评论的日期
     * @param Date 评论的日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 差评的个数 
     * @return NegCommentCount 差评的个数
     */
    public Long getNegCommentCount() {
        return this.NegCommentCount;
    }

    /**
     * Set 差评的个数
     * @param NegCommentCount 差评的个数
     */
    public void setNegCommentCount(Long NegCommentCount) {
        this.NegCommentCount = NegCommentCount;
    }

    /**
     * Get 好评的个数 
     * @return PosCommentCount 好评的个数
     */
    public Long getPosCommentCount() {
        return this.PosCommentCount;
    }

    /**
     * Set 好评的个数
     * @param PosCommentCount 好评的个数
     */
    public void setPosCommentCount(Long PosCommentCount) {
        this.PosCommentCount = PosCommentCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "NegCommentCount", this.NegCommentCount);
        this.setParamSimple(map, prefix + "PosCommentCount", this.PosCommentCount);

    }
}

