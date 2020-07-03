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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventHistoryItem extends AbstractModel{

    /**
    * 事件的时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeStamp")
    @Expose
    private Long TimeStamp;

    /**
    * 事件的产品ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 事件的设备名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 事件的标识符ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 事件的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件的数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 事件的时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeStamp 事件的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set 事件的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeStamp 事件的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    /**
     * Get 事件的产品ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 事件的产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 事件的产品ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 事件的产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 事件的设备名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceName 事件的设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 事件的设备名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceName 事件的设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 事件的标识符ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventId 事件的标识符ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件的标识符ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventId 事件的标识符ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 事件的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 事件的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件的数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 事件的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 事件的数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 事件的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

