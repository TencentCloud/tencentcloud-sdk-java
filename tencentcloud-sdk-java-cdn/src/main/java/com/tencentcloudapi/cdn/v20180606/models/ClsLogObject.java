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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsLogObject extends AbstractModel{

    /**
    * 主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 主题名字
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志时间
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 日志内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 采集路径
    */
    @SerializedName("Filename")
    @Expose
    private String Filename;

    /**
    * 日志来源设备
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get 主题ID 
     * @return TopicId 主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题ID
     * @param TopicId 主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 主题名字 
     * @return TopicName 主题名字
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名字
     * @param TopicName 主题名字
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志时间 
     * @return Timestamp 日志时间
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 日志时间
     * @param Timestamp 日志时间
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
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

    /**
     * Get 采集路径 
     * @return Filename 采集路径
     */
    public String getFilename() {
        return this.Filename;
    }

    /**
     * Set 采集路径
     * @param Filename 采集路径
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * Get 日志来源设备 
     * @return Source 日志来源设备
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 日志来源设备
     * @param Source 日志来源设备
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Filename", this.Filename);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

