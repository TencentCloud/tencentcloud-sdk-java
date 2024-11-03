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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IgnoreRuleEffectHostInfo extends AbstractModel {

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 危害等级：1-低位，2-中危，3-高危，4-严重
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 主机标签数组
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
    * 状态：0-未通过，1-忽略，3-已通过，5-检测中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 最后检测时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 事件id
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 主机quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

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
     * Get 危害等级：1-低位，2-中危，3-高危，4-严重 
     * @return Level 危害等级：1-低位，2-中危，3-高危，4-严重
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危害等级：1-低位，2-中危，3-高危，4-严重
     * @param Level 危害等级：1-低位，2-中危，3-高危，4-严重
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 主机标签数组 
     * @return TagList 主机标签数组
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 主机标签数组
     * @param TagList 主机标签数组
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 状态：0-未通过，1-忽略，3-已通过，5-检测中 
     * @return Status 状态：0-未通过，1-忽略，3-已通过，5-检测中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：0-未通过，1-忽略，3-已通过，5-检测中
     * @param Status 状态：0-未通过，1-忽略，3-已通过，5-检测中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 最后检测时间 
     * @return LastScanTime 最后检测时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最后检测时间
     * @param LastScanTime 最后检测时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 事件id 
     * @return EventId 事件id
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
     * @param EventId 事件id
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 主机quuid 
     * @return Quuid 主机quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机quuid
     * @param Quuid 主机quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public IgnoreRuleEffectHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IgnoreRuleEffectHostInfo(IgnoreRuleEffectHostInfo source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

