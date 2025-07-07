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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineHostTopList extends AbstractModel {

    /**
    * 事件等级与次数列表
    */
    @SerializedName("EventLevelList")
    @Expose
    private BaselineEventLevelInfo [] EventLevelList;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 计算权重的分数
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get 事件等级与次数列表 
     * @return EventLevelList 事件等级与次数列表
     */
    public BaselineEventLevelInfo [] getEventLevelList() {
        return this.EventLevelList;
    }

    /**
     * Set 事件等级与次数列表
     * @param EventLevelList 事件等级与次数列表
     */
    public void setEventLevelList(BaselineEventLevelInfo [] EventLevelList) {
        this.EventLevelList = EventLevelList;
    }

    /**
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 计算权重的分数 
     * @return Score 计算权重的分数
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 计算权重的分数
     * @param Score 计算权重的分数
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public BaselineHostTopList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineHostTopList(BaselineHostTopList source) {
        if (source.EventLevelList != null) {
            this.EventLevelList = new BaselineEventLevelInfo[source.EventLevelList.length];
            for (int i = 0; i < source.EventLevelList.length; i++) {
                this.EventLevelList[i] = new BaselineEventLevelInfo(source.EventLevelList[i]);
            }
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EventLevelList.", this.EventLevelList);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

