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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimelineEvent extends AbstractModel{

    /**
    * 事件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 原文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 事件子类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 事件值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 位置坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rectangle")
    @Expose
    private Rectangle Rectangle;

    /**
    * 事件发生地点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Place")
    @Expose
    private String Place;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 事件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 原文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 原文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 原文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 事件子类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubType 事件子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 事件子类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubType 事件子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 事件值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 事件值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 事件值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 事件值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 位置坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rectangle 位置坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Rectangle getRectangle() {
        return this.Rectangle;
    }

    /**
     * Set 位置坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rectangle 位置坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRectangle(Rectangle Rectangle) {
        this.Rectangle = Rectangle;
    }

    /**
     * Get 事件发生地点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Place 事件发生地点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlace() {
        return this.Place;
    }

    /**
     * Set 事件发生地点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Place 事件发生地点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlace(String Place) {
        this.Place = Place;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public TimelineEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimelineEvent(TimelineEvent source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Rectangle != null) {
            this.Rectangle = new Rectangle(source.Rectangle);
        }
        if (source.Place != null) {
            this.Place = new String(source.Place);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamObj(map, prefix + "Rectangle.", this.Rectangle);
        this.setParamSimple(map, prefix + "Place", this.Place);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

