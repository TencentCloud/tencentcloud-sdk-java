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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunnelStepInput extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * <p>页面特征</p>
    */
    @SerializedName("PagePattern")
    @Expose
    private String PagePattern;

    /**
    * <p>页面匹配模式</p>
    */
    @SerializedName("PageMatchMode")
    @Expose
    private String PageMatchMode;

    /**
    * <p>控件Selector</p>
    */
    @SerializedName("Selector")
    @Expose
    private String Selector;

    /**
    * <p>事件类型</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>可视化名称，如控件文本、自定义事件名</p>
    */
    @SerializedName("VisualName")
    @Expose
    private String VisualName;

    /**
     * Get <p>应用id</p> 
     * @return StepName <p>应用id</p>
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set <p>应用id</p>
     * @param StepName <p>应用id</p>
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get <p>页面特征</p> 
     * @return PagePattern <p>页面特征</p>
     */
    public String getPagePattern() {
        return this.PagePattern;
    }

    /**
     * Set <p>页面特征</p>
     * @param PagePattern <p>页面特征</p>
     */
    public void setPagePattern(String PagePattern) {
        this.PagePattern = PagePattern;
    }

    /**
     * Get <p>页面匹配模式</p> 
     * @return PageMatchMode <p>页面匹配模式</p>
     */
    public String getPageMatchMode() {
        return this.PageMatchMode;
    }

    /**
     * Set <p>页面匹配模式</p>
     * @param PageMatchMode <p>页面匹配模式</p>
     */
    public void setPageMatchMode(String PageMatchMode) {
        this.PageMatchMode = PageMatchMode;
    }

    /**
     * Get <p>控件Selector</p> 
     * @return Selector <p>控件Selector</p>
     */
    public String getSelector() {
        return this.Selector;
    }

    /**
     * Set <p>控件Selector</p>
     * @param Selector <p>控件Selector</p>
     */
    public void setSelector(String Selector) {
        this.Selector = Selector;
    }

    /**
     * Get <p>事件类型</p> 
     * @return ActionType <p>事件类型</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>事件类型</p>
     * @param ActionType <p>事件类型</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>可视化名称，如控件文本、自定义事件名</p> 
     * @return VisualName <p>可视化名称，如控件文本、自定义事件名</p>
     */
    public String getVisualName() {
        return this.VisualName;
    }

    /**
     * Set <p>可视化名称，如控件文本、自定义事件名</p>
     * @param VisualName <p>可视化名称，如控件文本、自定义事件名</p>
     */
    public void setVisualName(String VisualName) {
        this.VisualName = VisualName;
    }

    public FunnelStepInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunnelStepInput(FunnelStepInput source) {
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.PagePattern != null) {
            this.PagePattern = new String(source.PagePattern);
        }
        if (source.PageMatchMode != null) {
            this.PageMatchMode = new String(source.PageMatchMode);
        }
        if (source.Selector != null) {
            this.Selector = new String(source.Selector);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.VisualName != null) {
            this.VisualName = new String(source.VisualName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "PagePattern", this.PagePattern);
        this.setParamSimple(map, prefix + "PageMatchMode", this.PageMatchMode);
        this.setParamSimple(map, prefix + "Selector", this.Selector);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "VisualName", this.VisualName);

    }
}

