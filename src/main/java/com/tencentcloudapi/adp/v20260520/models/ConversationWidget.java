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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationWidget extends AbstractModel {

    /**
    * <p>Base64 编码的原始 widget 数据</p>
    */
    @SerializedName("EncodedWidget")
    @Expose
    private String EncodedWidget;

    /**
    * <p>用户上次提交的 payload</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>widget 在正文中的位置</p>
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * <p>widget 状态 JSON 数据</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>widget 视图数据</p>
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * <p>组件 ID</p>
    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
    * <p>组件运行 ID</p>
    */
    @SerializedName("WidgetRunId")
    @Expose
    private String WidgetRunId;

    /**
     * Get <p>Base64 编码的原始 widget 数据</p> 
     * @return EncodedWidget <p>Base64 编码的原始 widget 数据</p>
     */
    public String getEncodedWidget() {
        return this.EncodedWidget;
    }

    /**
     * Set <p>Base64 编码的原始 widget 数据</p>
     * @param EncodedWidget <p>Base64 编码的原始 widget 数据</p>
     */
    public void setEncodedWidget(String EncodedWidget) {
        this.EncodedWidget = EncodedWidget;
    }

    /**
     * Get <p>用户上次提交的 payload</p> 
     * @return Payload <p>用户上次提交的 payload</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>用户上次提交的 payload</p>
     * @param Payload <p>用户上次提交的 payload</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>widget 在正文中的位置</p> 
     * @return Position <p>widget 在正文中的位置</p>
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set <p>widget 在正文中的位置</p>
     * @param Position <p>widget 在正文中的位置</p>
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get <p>widget 状态 JSON 数据</p> 
     * @return State <p>widget 状态 JSON 数据</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>widget 状态 JSON 数据</p>
     * @param State <p>widget 状态 JSON 数据</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>widget 视图数据</p> 
     * @return View <p>widget 视图数据</p>
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set <p>widget 视图数据</p>
     * @param View <p>widget 视图数据</p>
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get <p>组件 ID</p> 
     * @return WidgetId <p>组件 ID</p>
     */
    public String getWidgetId() {
        return this.WidgetId;
    }

    /**
     * Set <p>组件 ID</p>
     * @param WidgetId <p>组件 ID</p>
     */
    public void setWidgetId(String WidgetId) {
        this.WidgetId = WidgetId;
    }

    /**
     * Get <p>组件运行 ID</p> 
     * @return WidgetRunId <p>组件运行 ID</p>
     */
    public String getWidgetRunId() {
        return this.WidgetRunId;
    }

    /**
     * Set <p>组件运行 ID</p>
     * @param WidgetRunId <p>组件运行 ID</p>
     */
    public void setWidgetRunId(String WidgetRunId) {
        this.WidgetRunId = WidgetRunId;
    }

    public ConversationWidget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationWidget(ConversationWidget source) {
        if (source.EncodedWidget != null) {
            this.EncodedWidget = new String(source.EncodedWidget);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.WidgetRunId != null) {
            this.WidgetRunId = new String(source.WidgetRunId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncodedWidget", this.EncodedWidget);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);
        this.setParamSimple(map, prefix + "WidgetRunId", this.WidgetRunId);

    }
}

