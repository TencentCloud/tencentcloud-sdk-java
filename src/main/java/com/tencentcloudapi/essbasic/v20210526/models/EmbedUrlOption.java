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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmbedUrlOption extends AbstractModel {

    /**
    * 合同详情预览，允许展示控件信息
<ul>
<li><b>true</b>：允许在合同详情页展示控件</li>
<li><b>false</b>：（默认）不允许在合同详情页展示控件</li>
</ul>
    */
    @SerializedName("ShowFlowDetailComponent")
    @Expose
    private Boolean ShowFlowDetailComponent;

    /**
    * 模板预览，允许展示模板控件信息
<ul><li> <b>true</b> :允许在模板预览页展示控件</li>
<li> <b>false</b> :（默认）不允许在模板预览页展示控件</li></ul>
    */
    @SerializedName("ShowTemplateComponent")
    @Expose
    private Boolean ShowTemplateComponent;

    /**
    * 跳过上传文件，默认为false(展示上传文件页）![image](https://qcloudimg.tencent-cloud.cn/raw/8ca33745cf772e79831dbe5a70e82400.png)
- false: 展示上传文件页
- true: 不展示上传文件页
 

注意: 此参数仅针对**EmbedType=CREATE_TEMPLATE(创建模板)有效**，
    */
    @SerializedName("SkipUploadFile")
    @Expose
    private String SkipUploadFile;

    /**
     * Get 合同详情预览，允许展示控件信息
<ul>
<li><b>true</b>：允许在合同详情页展示控件</li>
<li><b>false</b>：（默认）不允许在合同详情页展示控件</li>
</ul> 
     * @return ShowFlowDetailComponent 合同详情预览，允许展示控件信息
<ul>
<li><b>true</b>：允许在合同详情页展示控件</li>
<li><b>false</b>：（默认）不允许在合同详情页展示控件</li>
</ul>
     */
    public Boolean getShowFlowDetailComponent() {
        return this.ShowFlowDetailComponent;
    }

    /**
     * Set 合同详情预览，允许展示控件信息
<ul>
<li><b>true</b>：允许在合同详情页展示控件</li>
<li><b>false</b>：（默认）不允许在合同详情页展示控件</li>
</ul>
     * @param ShowFlowDetailComponent 合同详情预览，允许展示控件信息
<ul>
<li><b>true</b>：允许在合同详情页展示控件</li>
<li><b>false</b>：（默认）不允许在合同详情页展示控件</li>
</ul>
     */
    public void setShowFlowDetailComponent(Boolean ShowFlowDetailComponent) {
        this.ShowFlowDetailComponent = ShowFlowDetailComponent;
    }

    /**
     * Get 模板预览，允许展示模板控件信息
<ul><li> <b>true</b> :允许在模板预览页展示控件</li>
<li> <b>false</b> :（默认）不允许在模板预览页展示控件</li></ul> 
     * @return ShowTemplateComponent 模板预览，允许展示模板控件信息
<ul><li> <b>true</b> :允许在模板预览页展示控件</li>
<li> <b>false</b> :（默认）不允许在模板预览页展示控件</li></ul>
     */
    public Boolean getShowTemplateComponent() {
        return this.ShowTemplateComponent;
    }

    /**
     * Set 模板预览，允许展示模板控件信息
<ul><li> <b>true</b> :允许在模板预览页展示控件</li>
<li> <b>false</b> :（默认）不允许在模板预览页展示控件</li></ul>
     * @param ShowTemplateComponent 模板预览，允许展示模板控件信息
<ul><li> <b>true</b> :允许在模板预览页展示控件</li>
<li> <b>false</b> :（默认）不允许在模板预览页展示控件</li></ul>
     */
    public void setShowTemplateComponent(Boolean ShowTemplateComponent) {
        this.ShowTemplateComponent = ShowTemplateComponent;
    }

    /**
     * Get 跳过上传文件，默认为false(展示上传文件页）![image](https://qcloudimg.tencent-cloud.cn/raw/8ca33745cf772e79831dbe5a70e82400.png)
- false: 展示上传文件页
- true: 不展示上传文件页
 

注意: 此参数仅针对**EmbedType=CREATE_TEMPLATE(创建模板)有效**， 
     * @return SkipUploadFile 跳过上传文件，默认为false(展示上传文件页）![image](https://qcloudimg.tencent-cloud.cn/raw/8ca33745cf772e79831dbe5a70e82400.png)
- false: 展示上传文件页
- true: 不展示上传文件页
 

注意: 此参数仅针对**EmbedType=CREATE_TEMPLATE(创建模板)有效**，
     */
    public String getSkipUploadFile() {
        return this.SkipUploadFile;
    }

    /**
     * Set 跳过上传文件，默认为false(展示上传文件页）![image](https://qcloudimg.tencent-cloud.cn/raw/8ca33745cf772e79831dbe5a70e82400.png)
- false: 展示上传文件页
- true: 不展示上传文件页
 

注意: 此参数仅针对**EmbedType=CREATE_TEMPLATE(创建模板)有效**，
     * @param SkipUploadFile 跳过上传文件，默认为false(展示上传文件页）![image](https://qcloudimg.tencent-cloud.cn/raw/8ca33745cf772e79831dbe5a70e82400.png)
- false: 展示上传文件页
- true: 不展示上传文件页
 

注意: 此参数仅针对**EmbedType=CREATE_TEMPLATE(创建模板)有效**，
     */
    public void setSkipUploadFile(String SkipUploadFile) {
        this.SkipUploadFile = SkipUploadFile;
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
        if (source.SkipUploadFile != null) {
            this.SkipUploadFile = new String(source.SkipUploadFile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShowFlowDetailComponent", this.ShowFlowDetailComponent);
        this.setParamSimple(map, prefix + "ShowTemplateComponent", this.ShowTemplateComponent);
        this.setParamSimple(map, prefix + "SkipUploadFile", this.SkipUploadFile);

    }
}

