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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Widget extends AbstractModel {

    /**
    * Widget配置ID

    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
    * Widget实例ID
    */
    @SerializedName("WidgetRunId")
    @Expose
    private String WidgetRunId;

    /**
    * Widget显示数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * Widget状态数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Widget位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * Base64编码的Widget信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncodedWidget")
    @Expose
    private String EncodedWidget;

    /**
    * 用户最近一次提交的payload
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
     * Get Widget配置ID
 
     * @return WidgetId Widget配置ID

     */
    public String getWidgetId() {
        return this.WidgetId;
    }

    /**
     * Set Widget配置ID

     * @param WidgetId Widget配置ID

     */
    public void setWidgetId(String WidgetId) {
        this.WidgetId = WidgetId;
    }

    /**
     * Get Widget实例ID 
     * @return WidgetRunId Widget实例ID
     */
    public String getWidgetRunId() {
        return this.WidgetRunId;
    }

    /**
     * Set Widget实例ID
     * @param WidgetRunId Widget实例ID
     */
    public void setWidgetRunId(String WidgetRunId) {
        this.WidgetRunId = WidgetRunId;
    }

    /**
     * Get Widget显示数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return View Widget显示数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set Widget显示数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param View Widget显示数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get Widget状态数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State Widget状态数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Widget状态数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param State Widget状态数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Widget位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position Widget位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set Widget位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position Widget位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get Base64编码的Widget信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncodedWidget Base64编码的Widget信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncodedWidget() {
        return this.EncodedWidget;
    }

    /**
     * Set Base64编码的Widget信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncodedWidget Base64编码的Widget信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncodedWidget(String EncodedWidget) {
        this.EncodedWidget = EncodedWidget;
    }

    /**
     * Get 用户最近一次提交的payload
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Payload 用户最近一次提交的payload
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 用户最近一次提交的payload
注意：此字段可能返回 null，表示取不到有效值。
     * @param Payload 用户最近一次提交的payload
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    public Widget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Widget(Widget source) {
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.WidgetRunId != null) {
            this.WidgetRunId = new String(source.WidgetRunId);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.EncodedWidget != null) {
            this.EncodedWidget = new String(source.EncodedWidget);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);
        this.setParamSimple(map, prefix + "WidgetRunId", this.WidgetRunId);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "EncodedWidget", this.EncodedWidget);
        this.setParamSimple(map, prefix + "Payload", this.Payload);

    }
}

