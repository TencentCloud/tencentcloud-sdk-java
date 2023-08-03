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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmbedUrlOption extends AbstractModel{

    /**
    * 合同详情预览，允许展示控件信息
<br/>true：允许在合同详情页展示控件
<br/>false：不允许在合同详情页展示控件
<br/>默认false，合同详情页不展示控件
    */
    @SerializedName("ShowFlowDetailComponent")
    @Expose
    private Boolean ShowFlowDetailComponent;

    /**
    * 模板预览，允许展示模板控件信息
<br/>true：允许在模板预览页展示控件
<br/>false：不允许在模板预览页展示控件
<br/>默认false，模板预览页不展示控件
    */
    @SerializedName("ShowTemplateComponent")
    @Expose
    private Boolean ShowTemplateComponent;

    /**
     * Get 合同详情预览，允许展示控件信息
<br/>true：允许在合同详情页展示控件
<br/>false：不允许在合同详情页展示控件
<br/>默认false，合同详情页不展示控件 
     * @return ShowFlowDetailComponent 合同详情预览，允许展示控件信息
<br/>true：允许在合同详情页展示控件
<br/>false：不允许在合同详情页展示控件
<br/>默认false，合同详情页不展示控件
     */
    public Boolean getShowFlowDetailComponent() {
        return this.ShowFlowDetailComponent;
    }

    /**
     * Set 合同详情预览，允许展示控件信息
<br/>true：允许在合同详情页展示控件
<br/>false：不允许在合同详情页展示控件
<br/>默认false，合同详情页不展示控件
     * @param ShowFlowDetailComponent 合同详情预览，允许展示控件信息
<br/>true：允许在合同详情页展示控件
<br/>false：不允许在合同详情页展示控件
<br/>默认false，合同详情页不展示控件
     */
    public void setShowFlowDetailComponent(Boolean ShowFlowDetailComponent) {
        this.ShowFlowDetailComponent = ShowFlowDetailComponent;
    }

    /**
     * Get 模板预览，允许展示模板控件信息
<br/>true：允许在模板预览页展示控件
<br/>false：不允许在模板预览页展示控件
<br/>默认false，模板预览页不展示控件 
     * @return ShowTemplateComponent 模板预览，允许展示模板控件信息
<br/>true：允许在模板预览页展示控件
<br/>false：不允许在模板预览页展示控件
<br/>默认false，模板预览页不展示控件
     */
    public Boolean getShowTemplateComponent() {
        return this.ShowTemplateComponent;
    }

    /**
     * Set 模板预览，允许展示模板控件信息
<br/>true：允许在模板预览页展示控件
<br/>false：不允许在模板预览页展示控件
<br/>默认false，模板预览页不展示控件
     * @param ShowTemplateComponent 模板预览，允许展示模板控件信息
<br/>true：允许在模板预览页展示控件
<br/>false：不允许在模板预览页展示控件
<br/>默认false，模板预览页不展示控件
     */
    public void setShowTemplateComponent(Boolean ShowTemplateComponent) {
        this.ShowTemplateComponent = ShowTemplateComponent;
    }

    public EmbedUrlOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbedUrlOption(EmbedUrlOption source) {
        if (source.ShowFlowDetailComponent != null) {
            this.ShowFlowDetailComponent = new Boolean(source.ShowFlowDetailComponent);
        }
        if (source.ShowTemplateComponent != null) {
            this.ShowTemplateComponent = new Boolean(source.ShowTemplateComponent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShowFlowDetailComponent", this.ShowFlowDetailComponent);
        this.setParamSimple(map, prefix + "ShowTemplateComponent", this.ShowTemplateComponent);

    }
}

