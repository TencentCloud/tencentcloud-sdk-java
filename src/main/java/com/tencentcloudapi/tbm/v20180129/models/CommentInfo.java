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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommentInfo extends AbstractModel {

    /**
    * 用户评论内容
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 评论的时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get 用户评论内容 
     * @return Comment 用户评论内容
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 用户评论内容
     * @param Comment 用户评论内容
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 评论的时间 
     * @return Date 评论的时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 评论的时间
     * @param Date 评论的时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public CommentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommentInfo(CommentInfo source) {
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

