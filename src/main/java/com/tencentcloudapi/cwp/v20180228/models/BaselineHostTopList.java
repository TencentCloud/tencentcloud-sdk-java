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

public class BaselineHostTopList extends AbstractModel{

    /**
    * 事件等级与次数列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventLevelList")
    @Expose
    private BaselineEventLevelInfo [] EventLevelList;

    /**
    * 主机名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 计算权重的分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get 事件等级与次数列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventLevelList 事件等级与次数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineEventLevelInfo [] getEventLevelList() {
        return this.EventLevelList;
    }

    /**
     * Set 事件等级与次数列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventLevelList 事件等级与次数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventLevelList(BaselineEventLevelInfo [] EventLevelList) {
        this.EventLevelList = EventLevelList;
    }

    /**
     * Get 主机名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quuid 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quuid 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 计算权重的分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 计算权重的分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 计算权重的分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 计算权重的分数
注意：此字段可能返回 null，表示取不到有效值。
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

