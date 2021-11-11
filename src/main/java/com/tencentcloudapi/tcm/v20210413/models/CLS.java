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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLS extends AbstractModel{

    /**
    * 是否启用
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 日志集
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * 日志主题
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
     * Get 是否启用 
     * @return Enable 是否启用
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用
     * @param Enable 是否启用
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 日志集 
     * @return LogSet 日志集
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set 日志集
     * @param LogSet 日志集
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get 日志主题 
     * @return Topic 日志主题
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 日志主题
     * @param Topic 日志主题
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public CLS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLS(CLS source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "Topic", this.Topic);

    }
}

