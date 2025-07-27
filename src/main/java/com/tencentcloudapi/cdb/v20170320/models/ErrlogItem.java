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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrlogItem extends AbstractModel {

    /**
    * 错误发生时间。时间戳，秒级
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 错误详情
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 错误发生时间。时间戳，秒级 
     * @return Timestamp 错误发生时间。时间戳，秒级
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 错误发生时间。时间戳，秒级
     * @param Timestamp 错误发生时间。时间戳，秒级
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 错误详情 
     * @return Content 错误详情
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 错误详情
     * @param Content 错误详情
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ErrlogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrlogItem(ErrlogItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

