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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardVideoResult extends AbstractModel{

    /**
    * 分析完成后的统计结果
    */
    @SerializedName("HighlightsInfo")
    @Expose
    private HighlightsInfomation [] HighlightsInfo;

    /**
    * 状态描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 分析完成后的统计结果 
     * @return HighlightsInfo 分析完成后的统计结果
     */
    public HighlightsInfomation [] getHighlightsInfo() {
        return this.HighlightsInfo;
    }

    /**
     * Set 分析完成后的统计结果
     * @param HighlightsInfo 分析完成后的统计结果
     */
    public void setHighlightsInfo(HighlightsInfomation [] HighlightsInfo) {
        this.HighlightsInfo = HighlightsInfo;
    }

    /**
     * Get 状态描述 
     * @return Message 状态描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 状态描述
     * @param Message 状态描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HighlightsInfo.", this.HighlightsInfo);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

