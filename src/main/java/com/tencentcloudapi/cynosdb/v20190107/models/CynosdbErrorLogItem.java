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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbErrorLogItem extends AbstractModel {

    /**
    * 日志时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 日志等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 日志内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 日志时间戳 
     * @return Timestamp 日志时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 日志时间戳
     * @param Timestamp 日志时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 日志等级 
     * @return Level 日志等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 日志等级
     * @param Level 日志等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 日志内容 
     * @return Content 日志内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 日志内容
     * @param Content 日志内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CynosdbErrorLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbErrorLogItem(CynosdbErrorLogItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
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
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

