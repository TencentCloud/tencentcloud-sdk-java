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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertHistoryItem extends AbstractModel{

    /**
    * 告警名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 告警开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 告警内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 告警名称 
     * @return RuleName 告警名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 告警名称
     * @param RuleName 告警名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 告警开始时间 
     * @return StartTime 告警开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 告警开始时间
     * @param StartTime 告警开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 告警内容 
     * @return Content 告警内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 告警内容
     * @param Content 告警内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

