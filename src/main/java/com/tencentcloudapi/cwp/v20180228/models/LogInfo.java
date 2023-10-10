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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInfo extends AbstractModel{

    /**
    * 日志内容的Json序列化字符串
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 日志文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 日志来源IP
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 日志时间，单位ms
    */
    @SerializedName("TimeStamp")
    @Expose
    private Long TimeStamp;

    /**
     * Get 日志内容的Json序列化字符串 
     * @return Content 日志内容的Json序列化字符串
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 日志内容的Json序列化字符串
     * @param Content 日志内容的Json序列化字符串
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 日志文件名称 
     * @return FileName 日志文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 日志文件名称
     * @param FileName 日志文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 日志来源IP 
     * @return Source 日志来源IP
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 日志来源IP
     * @param Source 日志来源IP
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 日志时间，单位ms 
     * @return TimeStamp 日志时间，单位ms
     */
    public Long getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set 日志时间，单位ms
     * @param TimeStamp 日志时间，单位ms
     */
    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public LogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInfo(LogInfo source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.TimeStamp != null) {
            this.TimeStamp = new Long(source.TimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);

    }
}

