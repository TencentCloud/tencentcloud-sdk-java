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

public class BashPolicy extends AbstractModel {

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 1:有效 0:无效
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 0:黑名单 1:白名单
    */
    @SerializedName("White")
    @Expose
    private Long White;

    /**
    * 0:告警 1:白名单 2:拦截
    */
    @SerializedName("BashAction")
    @Expose
    private Long BashAction;

    /**
    * 正则表达式
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 危险等级(0:无，1: 高危 2:中危 3: 低危)
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机）
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 策略ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 策略描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * 事件列表点击“加入白名单”时,需要传EventId 事件的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 是否处理旧事件为白名单 0=不处理 1=处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * 生效主机的QUUID集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * 策略类型，0:系统  1:用户
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 老版本兼容可能会用到
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 1:有效 0:无效 
     * @return Enable 1:有效 0:无效
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 1:有效 0:无效
     * @param Enable 1:有效 0:无效
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 0:黑名单 1:白名单 
     * @return White 0:黑名单 1:白名单
     */
    public Long getWhite() {
        return this.White;
    }

    /**
     * Set 0:黑名单 1:白名单
     * @param White 0:黑名单 1:白名单
     */
    public void setWhite(Long White) {
        this.White = White;
    }

    /**
     * Get 0:告警 1:白名单 2:拦截 
     * @return BashAction 0:告警 1:白名单 2:拦截
     */
    public Long getBashAction() {
        return this.BashAction;
    }

    /**
     * Set 0:告警 1:白名单 2:拦截
     * @param BashAction 0:告警 1:白名单 2:拦截
     */
    public void setBashAction(Long BashAction) {
        this.BashAction = BashAction;
    }

    /**
     * Get 正则表达式 
     * @return Rule 正则表达式
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 正则表达式
     * @param Rule 正则表达式
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 危险等级(0:无，1: 高危 2:中危 3: 低危) 
     * @return Level 危险等级(0:无，1: 高危 2:中危 3: 低危)
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危险等级(0:无，1: 高危 2:中危 3: 低危)
     * @param Level 危险等级(0:无，1: 高危 2:中危 3: 低危)
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机） 
     * @return Scope 生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机）
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机）
     * @param Scope 生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机）
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 策略ID 
     * @return Id 策略ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 策略ID
     * @param Id 策略ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 策略描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Descript 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Descript 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    /**
     * Get 事件列表点击“加入白名单”时,需要传EventId 事件的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventId 事件列表点击“加入白名单”时,需要传EventId 事件的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件列表点击“加入白名单”时,需要传EventId 事件的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventId 事件列表点击“加入白名单”时,需要传EventId 事件的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 是否处理旧事件为白名单 0=不处理 1=处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealOldEvents 是否处理旧事件为白名单 0=不处理 1=处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set 是否处理旧事件为白名单 0=不处理 1=处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealOldEvents 是否处理旧事件为白名单 0=不处理 1=处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    /**
     * Get 生效主机的QUUID集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quuids 生效主机的QUUID集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 生效主机的QUUID集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quuids 生效主机的QUUID集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get 策略类型，0:系统  1:用户 
     * @return Category 策略类型，0:系统  1:用户
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set 策略类型，0:系统  1:用户
     * @param Category 策略类型，0:系统  1:用户
     */
    public void setCategory(Long Category) {
        this.Category = Category;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 老版本兼容可能会用到 
     * @return Uuids 老版本兼容可能会用到
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set 老版本兼容可能会用到
     * @param Uuids 老版本兼容可能会用到
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    public BashPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BashPolicy(BashPolicy source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.White != null) {
            this.White = new Long(source.White);
        }
        if (source.BashAction != null) {
            this.BashAction = new Long(source.BashAction);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "White", this.White);
        this.setParamSimple(map, prefix + "BashAction", this.BashAction);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Descript", this.Descript);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);

    }
}

