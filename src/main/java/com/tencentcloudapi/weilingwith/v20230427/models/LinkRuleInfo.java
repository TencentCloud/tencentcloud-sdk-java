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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LinkRuleInfo extends AbstractModel {

    /**
    * 联动id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 联动名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventSet")
    @Expose
    private Event [] EventSet;

    /**
    * 动作列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionSet")
    @Expose
    private Action [] ActionSet;

    /**
    * 状态：0开，-1关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 起始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 有效周期内容,有效字段为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidPeriod")
    @Expose
    private String ValidPeriod;

    /**
     * Get 联动id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 联动id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 联动id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 联动id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 联动名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 联动名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 联动名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 联动名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 事件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventSet 事件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Event [] getEventSet() {
        return this.EventSet;
    }

    /**
     * Set 事件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventSet 事件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventSet(Event [] EventSet) {
        this.EventSet = EventSet;
    }

    /**
     * Get 动作列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionSet 动作列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Action [] getActionSet() {
        return this.ActionSet;
    }

    /**
     * Set 动作列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionSet 动作列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionSet(Action [] ActionSet) {
        this.ActionSet = ActionSet;
    }

    /**
     * Get 状态：0开，-1关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态：0开，-1关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：0开，-1关
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态：0开，-1关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 起始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginDate 起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 起始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginDate 起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndDate 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndDate 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 有效周期内容,有效字段为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidPeriod 有效周期内容,有效字段为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidPeriod() {
        return this.ValidPeriod;
    }

    /**
     * Set 有效周期内容,有效字段为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidPeriod 有效周期内容,有效字段为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidPeriod(String ValidPeriod) {
        this.ValidPeriod = ValidPeriod;
    }

    public LinkRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinkRuleInfo(LinkRuleInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EventSet != null) {
            this.EventSet = new Event[source.EventSet.length];
            for (int i = 0; i < source.EventSet.length; i++) {
                this.EventSet[i] = new Event(source.EventSet[i]);
            }
        }
        if (source.ActionSet != null) {
            this.ActionSet = new Action[source.ActionSet.length];
            for (int i = 0; i < source.ActionSet.length; i++) {
                this.ActionSet[i] = new Action(source.ActionSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.ValidPeriod != null) {
            this.ValidPeriod = new String(source.ValidPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "EventSet.", this.EventSet);
        this.setParamArrayObj(map, prefix + "ActionSet.", this.ActionSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ValidPeriod", this.ValidPeriod);

    }
}

