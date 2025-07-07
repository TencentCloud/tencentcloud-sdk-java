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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowInOutResp extends AbstractModel {

    /**
    * 流Id。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 流名称。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 该Flow关联的媒体传输事件EventId。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 媒体传输输入流所属的区域，取值和InputRegion相同。
    */
    @SerializedName("FlowRegion")
    @Expose
    private String FlowRegion;

    /**
    * 当返回是输出类型时非空，output所在Region。
    */
    @SerializedName("OutputRegion")
    @Expose
    private String OutputRegion;

    /**
    * EventName。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * InOutType为Input有效。
    */
    @SerializedName("InputName")
    @Expose
    private String InputName;

    /**
    * InOutType为Output有效。
    */
    @SerializedName("OutputName")
    @Expose
    private String OutputName;

    /**
    * Input或者Output的Id。
    */
    @SerializedName("InOutId")
    @Expose
    private String InOutId;

    /**
    * 输入/输出类型，可选值：
Input：输入
Outpu：输出。
    */
    @SerializedName("InOutType")
    @Expose
    private String InOutType;

    /**
     * Get 流Id。 
     * @return FlowId 流Id。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流Id。
     * @param FlowId 流Id。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 流名称。 
     * @return FlowName 流名称。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 流名称。
     * @param FlowName 流名称。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 该Flow关联的媒体传输事件EventId。 
     * @return EventId 该Flow关联的媒体传输事件EventId。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 该Flow关联的媒体传输事件EventId。
     * @param EventId 该Flow关联的媒体传输事件EventId。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 媒体传输输入流所属的区域，取值和InputRegion相同。 
     * @return FlowRegion 媒体传输输入流所属的区域，取值和InputRegion相同。
     */
    public String getFlowRegion() {
        return this.FlowRegion;
    }

    /**
     * Set 媒体传输输入流所属的区域，取值和InputRegion相同。
     * @param FlowRegion 媒体传输输入流所属的区域，取值和InputRegion相同。
     */
    public void setFlowRegion(String FlowRegion) {
        this.FlowRegion = FlowRegion;
    }

    /**
     * Get 当返回是输出类型时非空，output所在Region。 
     * @return OutputRegion 当返回是输出类型时非空，output所在Region。
     */
    public String getOutputRegion() {
        return this.OutputRegion;
    }

    /**
     * Set 当返回是输出类型时非空，output所在Region。
     * @param OutputRegion 当返回是输出类型时非空，output所在Region。
     */
    public void setOutputRegion(String OutputRegion) {
        this.OutputRegion = OutputRegion;
    }

    /**
     * Get EventName。 
     * @return EventName EventName。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set EventName。
     * @param EventName EventName。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get InOutType为Input有效。 
     * @return InputName InOutType为Input有效。
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set InOutType为Input有效。
     * @param InputName InOutType为Input有效。
     */
    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    /**
     * Get InOutType为Output有效。 
     * @return OutputName InOutType为Output有效。
     */
    public String getOutputName() {
        return this.OutputName;
    }

    /**
     * Set InOutType为Output有效。
     * @param OutputName InOutType为Output有效。
     */
    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }

    /**
     * Get Input或者Output的Id。 
     * @return InOutId Input或者Output的Id。
     */
    public String getInOutId() {
        return this.InOutId;
    }

    /**
     * Set Input或者Output的Id。
     * @param InOutId Input或者Output的Id。
     */
    public void setInOutId(String InOutId) {
        this.InOutId = InOutId;
    }

    /**
     * Get 输入/输出类型，可选值：
Input：输入
Outpu：输出。 
     * @return InOutType 输入/输出类型，可选值：
Input：输入
Outpu：输出。
     */
    public String getInOutType() {
        return this.InOutType;
    }

    /**
     * Set 输入/输出类型，可选值：
Input：输入
Outpu：输出。
     * @param InOutType 输入/输出类型，可选值：
Input：输入
Outpu：输出。
     */
    public void setInOutType(String InOutType) {
        this.InOutType = InOutType;
    }

    public FlowInOutResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowInOutResp(FlowInOutResp source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.FlowRegion != null) {
            this.FlowRegion = new String(source.FlowRegion);
        }
        if (source.OutputRegion != null) {
            this.OutputRegion = new String(source.OutputRegion);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.InputName != null) {
            this.InputName = new String(source.InputName);
        }
        if (source.OutputName != null) {
            this.OutputName = new String(source.OutputName);
        }
        if (source.InOutId != null) {
            this.InOutId = new String(source.InOutId);
        }
        if (source.InOutType != null) {
            this.InOutType = new String(source.InOutType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "FlowRegion", this.FlowRegion);
        this.setParamSimple(map, prefix + "OutputRegion", this.OutputRegion);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "InputName", this.InputName);
        this.setParamSimple(map, prefix + "OutputName", this.OutputName);
        this.setParamSimple(map, prefix + "InOutId", this.InOutId);
        this.setParamSimple(map, prefix + "InOutType", this.InOutType);

    }
}

