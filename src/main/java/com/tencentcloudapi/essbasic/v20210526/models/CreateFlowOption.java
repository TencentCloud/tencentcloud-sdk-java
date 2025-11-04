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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowOption extends AbstractModel {

    /**
    * 是否允许修改合同信息，
**true**：可以
**false**：（默认）不可以
    */
    @SerializedName("CanEditFlow")
    @Expose
    private Boolean CanEditFlow;

    /**
    * 是否允许发起合同弹窗隐藏合同名称
**true**：允许
**false**：（默认）不允许
    */
    @SerializedName("HideShowFlowName")
    @Expose
    private Boolean HideShowFlowName;

    /**
    * 是否允许发起合同弹窗隐藏合同类型，
**true**：允许
**false**：（默认）不允许
    */
    @SerializedName("HideShowFlowType")
    @Expose
    private Boolean HideShowFlowType;

    /**
    * 是否允许发起合同弹窗隐藏合同到期时间
**true**：允许
**false**：（默认）不允许
    */
    @SerializedName("HideShowDeadline")
    @Expose
    private Boolean HideShowDeadline;

    /**
    * 是否允许发起合同步骤跳过指定签署方步骤
**true**：允许
**false**：（默认）不允许
    */
    @SerializedName("CanSkipAddApprover")
    @Expose
    private Boolean CanSkipAddApprover;

    /**
    * 是否可以编辑签署人包括新增，修改，删除 
<ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul>



注意：
* 如果设置参数为 true， 则 参数签署人 [FlowApproverList](https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow) 不能为空
* 此参数对子客和自动签无效，不允许进行修改。
    */
    @SerializedName("ForbidEditApprover")
    @Expose
    private Boolean ForbidEditApprover;

    /**
    * 定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。
    */
    @SerializedName("CustomCreateFlowDescription")
    @Expose
    private String CustomCreateFlowDescription;

    /**
    * 禁止编辑填写控件

**true**：禁止编辑填写控件
**false**：（默认）允许编辑填写控件
    */
    @SerializedName("ForbidEditFillComponent")
    @Expose
    private Boolean ForbidEditFillComponent;

    /**
    * 跳过上传文件步骤

**true**：跳过
**false**：（默认）不跳过，需要传ResourceId
    */
    @SerializedName("SkipUploadFile")
    @Expose
    private Boolean SkipUploadFile;

    /**
    * 签署控件的配置信息，用在嵌入式发起的页面配置，包括 
 - 签署控件 是否默认展示日期.
    */
    @SerializedName("SignComponentConfig")
    @Expose
    private SignComponentConfig SignComponentConfig;

    /**
    * 是否禁止编辑（展示）水印控件属性
<ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul>
    */
    @SerializedName("ForbidEditWatermark")
    @Expose
    private Boolean ForbidEditWatermark;

    /**
    * 发起成功后是否预览合同
<ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul>
    */
    @SerializedName("PreviewAfterStart")
    @Expose
    private Boolean PreviewAfterStart;

    /**
    * 发起成功之后是否签署合同，仅当前经办人作为签署人时生效
<ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul>
    */
    @SerializedName("SignAfterStart")
    @Expose
    private Boolean SignAfterStart;

    /**
    * 隐藏操作步骤: 具体的控件类型如下

<ul><li>1 : 选择文件及签署方</li>
<li>2 : 补充文件内容</li>
<li>4 : 发起前合同信息与设置确认</li>
</ul>
注：仅对新版页面生效
    */
    @SerializedName("HideOperationSteps")
    @Expose
    private Long [] HideOperationSteps;

    /**
    * 本企业简称，注：仅对新版页面生效
    */
    @SerializedName("SelfName")
    @Expose
    private String SelfName;

    /**
    * 发起后签署码隐藏，默认false，注：仅对新版页面生效
    */
    @SerializedName("HideSignCodeAfterStart")
    @Expose
    private Boolean HideSignCodeAfterStart;

    /**
     * Get 是否允许修改合同信息，
**true**：可以
**false**：（默认）不可以 
     * @return CanEditFlow 是否允许修改合同信息，
**true**：可以
**false**：（默认）不可以
     */
    public Boolean getCanEditFlow() {
        return this.CanEditFlow;
    }

    /**
     * Set 是否允许修改合同信息，
**true**：可以
**false**：（默认）不可以
     * @param CanEditFlow 是否允许修改合同信息，
**true**：可以
**false**：（默认）不可以
     */
    public void setCanEditFlow(Boolean CanEditFlow) {
        this.CanEditFlow = CanEditFlow;
    }

    /**
     * Get 是否允许发起合同弹窗隐藏合同名称
**true**：允许
**false**：（默认）不允许 
     * @return HideShowFlowName 是否允许发起合同弹窗隐藏合同名称
**true**：允许
**false**：（默认）不允许
     */
    public Boolean getHideShowFlowName() {
        return this.HideShowFlowName;
    }

    /**
     * Set 是否允许发起合同弹窗隐藏合同名称
**true**：允许
**false**：（默认）不允许
     * @param HideShowFlowName 是否允许发起合同弹窗隐藏合同名称
**true**：允许
**false**：（默认）不允许
     */
    public void setHideShowFlowName(Boolean HideShowFlowName) {
        this.HideShowFlowName = HideShowFlowName;
    }

    /**
     * Get 是否允许发起合同弹窗隐藏合同类型，
**true**：允许
**false**：（默认）不允许 
     * @return HideShowFlowType 是否允许发起合同弹窗隐藏合同类型，
**true**：允许
**false**：（默认）不允许
     */
    public Boolean getHideShowFlowType() {
        return this.HideShowFlowType;
    }

    /**
     * Set 是否允许发起合同弹窗隐藏合同类型，
**true**：允许
**false**：（默认）不允许
     * @param HideShowFlowType 是否允许发起合同弹窗隐藏合同类型，
**true**：允许
**false**：（默认）不允许
     */
    public void setHideShowFlowType(Boolean HideShowFlowType) {
        this.HideShowFlowType = HideShowFlowType;
    }

    /**
     * Get 是否允许发起合同弹窗隐藏合同到期时间
**true**：允许
**false**：（默认）不允许 
     * @return HideShowDeadline 是否允许发起合同弹窗隐藏合同到期时间
**true**：允许
**false**：（默认）不允许
     */
    public Boolean getHideShowDeadline() {
        return this.HideShowDeadline;
    }

    /**
     * Set 是否允许发起合同弹窗隐藏合同到期时间
**true**：允许
**false**：（默认）不允许
     * @param HideShowDeadline 是否允许发起合同弹窗隐藏合同到期时间
**true**：允许
**false**：（默认）不允许
     */
    public void setHideShowDeadline(Boolean HideShowDeadline) {
        this.HideShowDeadline = HideShowDeadline;
    }

    /**
     * Get 是否允许发起合同步骤跳过指定签署方步骤
**true**：允许
**false**：（默认）不允许 
     * @return CanSkipAddApprover 是否允许发起合同步骤跳过指定签署方步骤
**true**：允许
**false**：（默认）不允许
     */
    public Boolean getCanSkipAddApprover() {
        return this.CanSkipAddApprover;
    }

    /**
     * Set 是否允许发起合同步骤跳过指定签署方步骤
**true**：允许
**false**：（默认）不允许
     * @param CanSkipAddApprover 是否允许发起合同步骤跳过指定签署方步骤
**true**：允许
**false**：（默认）不允许
     */
    public void setCanSkipAddApprover(Boolean CanSkipAddApprover) {
        this.CanSkipAddApprover = CanSkipAddApprover;
    }

    /**
     * Get 是否可以编辑签署人包括新增，修改，删除 
<ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul>



注意：
* 如果设置参数为 true， 则 参数签署人 [FlowApproverList](https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow) 不能为空
* 此参数对子客和自动签无效，不允许进行修改。 
     * @return ForbidEditApprover 是否可以编辑签署人包括新增，修改，删除 
<ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul>



注意：
* 如果设置参数为 true， 则 参数签署人 [FlowApproverList](https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow) 不能为空
* 此参数对子客和自动签无效，不允许进行修改。
     */
    public Boolean getForbidEditApprover() {
        return this.ForbidEditApprover;
    }

    /**
     * Set 是否可以编辑签署人包括新增，修改，删除 
<ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul>



注意：
* 如果设置参数为 true， 则 参数签署人 [FlowApproverList](https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow) 不能为空
* 此参数对子客和自动签无效，不允许进行修改。
     * @param ForbidEditApprover 是否可以编辑签署人包括新增，修改，删除 
<ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul>



注意：
* 如果设置参数为 true， 则 参数签署人 [FlowApproverList](https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow) 不能为空
* 此参数对子客和自动签无效，不允许进行修改。
     */
    public void setForbidEditApprover(Boolean ForbidEditApprover) {
        this.ForbidEditApprover = ForbidEditApprover;
    }

    /**
     * Get 定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。 
     * @return CustomCreateFlowDescription 定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。
     */
    public String getCustomCreateFlowDescription() {
        return this.CustomCreateFlowDescription;
    }

    /**
     * Set 定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。
     * @param CustomCreateFlowDescription 定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。
     */
    public void setCustomCreateFlowDescription(String CustomCreateFlowDescription) {
        this.CustomCreateFlowDescription = CustomCreateFlowDescription;
    }

    /**
     * Get 禁止编辑填写控件

**true**：禁止编辑填写控件
**false**：（默认）允许编辑填写控件 
     * @return ForbidEditFillComponent 禁止编辑填写控件

**true**：禁止编辑填写控件
**false**：（默认）允许编辑填写控件
     */
    public Boolean getForbidEditFillComponent() {
        return this.ForbidEditFillComponent;
    }

    /**
     * Set 禁止编辑填写控件

**true**：禁止编辑填写控件
**false**：（默认）允许编辑填写控件
     * @param ForbidEditFillComponent 禁止编辑填写控件

**true**：禁止编辑填写控件
**false**：（默认）允许编辑填写控件
     */
    public void setForbidEditFillComponent(Boolean ForbidEditFillComponent) {
        this.ForbidEditFillComponent = ForbidEditFillComponent;
    }

    /**
     * Get 跳过上传文件步骤

**true**：跳过
**false**：（默认）不跳过，需要传ResourceId 
     * @return SkipUploadFile 跳过上传文件步骤

**true**：跳过
**false**：（默认）不跳过，需要传ResourceId
     */
    public Boolean getSkipUploadFile() {
        return this.SkipUploadFile;
    }

    /**
     * Set 跳过上传文件步骤

**true**：跳过
**false**：（默认）不跳过，需要传ResourceId
     * @param SkipUploadFile 跳过上传文件步骤

**true**：跳过
**false**：（默认）不跳过，需要传ResourceId
     */
    public void setSkipUploadFile(Boolean SkipUploadFile) {
        this.SkipUploadFile = SkipUploadFile;
    }

    /**
     * Get 签署控件的配置信息，用在嵌入式发起的页面配置，包括 
 - 签署控件 是否默认展示日期. 
     * @return SignComponentConfig 签署控件的配置信息，用在嵌入式发起的页面配置，包括 
 - 签署控件 是否默认展示日期.
     */
    public SignComponentConfig getSignComponentConfig() {
        return this.SignComponentConfig;
    }

    /**
     * Set 签署控件的配置信息，用在嵌入式发起的页面配置，包括 
 - 签署控件 是否默认展示日期.
     * @param SignComponentConfig 签署控件的配置信息，用在嵌入式发起的页面配置，包括 
 - 签署控件 是否默认展示日期.
     */
    public void setSignComponentConfig(SignComponentConfig SignComponentConfig) {
        this.SignComponentConfig = SignComponentConfig;
    }

    /**
     * Get 是否禁止编辑（展示）水印控件属性
<ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul> 
     * @return ForbidEditWatermark 是否禁止编辑（展示）水印控件属性
<ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul>
     */
    public Boolean getForbidEditWatermark() {
        return this.ForbidEditWatermark;
    }

    /**
     * Set 是否禁止编辑（展示）水印控件属性
<ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul>
     * @param ForbidEditWatermark 是否禁止编辑（展示）水印控件属性
<ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul>
     */
    public void setForbidEditWatermark(Boolean ForbidEditWatermark) {
        this.ForbidEditWatermark = ForbidEditWatermark;
    }

    /**
     * Get 发起成功后是否预览合同
<ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul> 
     * @return PreviewAfterStart 发起成功后是否预览合同
<ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul>
     */
    public Boolean getPreviewAfterStart() {
        return this.PreviewAfterStart;
    }

    /**
     * Set 发起成功后是否预览合同
<ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul>
     * @param PreviewAfterStart 发起成功后是否预览合同
<ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul>
     */
    public void setPreviewAfterStart(Boolean PreviewAfterStart) {
        this.PreviewAfterStart = PreviewAfterStart;
    }

    /**
     * Get 发起成功之后是否签署合同，仅当前经办人作为签署人时生效
<ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul> 
     * @return SignAfterStart 发起成功之后是否签署合同，仅当前经办人作为签署人时生效
<ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul>
     */
    public Boolean getSignAfterStart() {
        return this.SignAfterStart;
    }

    /**
     * Set 发起成功之后是否签署合同，仅当前经办人作为签署人时生效
<ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul>
     * @param SignAfterStart 发起成功之后是否签署合同，仅当前经办人作为签署人时生效
<ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul>
     */
    public void setSignAfterStart(Boolean SignAfterStart) {
        this.SignAfterStart = SignAfterStart;
    }

    /**
     * Get 隐藏操作步骤: 具体的控件类型如下

<ul><li>1 : 选择文件及签署方</li>
<li>2 : 补充文件内容</li>
<li>4 : 发起前合同信息与设置确认</li>
</ul>
注：仅对新版页面生效 
     * @return HideOperationSteps 隐藏操作步骤: 具体的控件类型如下

<ul><li>1 : 选择文件及签署方</li>
<li>2 : 补充文件内容</li>
<li>4 : 发起前合同信息与设置确认</li>
</ul>
注：仅对新版页面生效
     */
    public Long [] getHideOperationSteps() {
        return this.HideOperationSteps;
    }

    /**
     * Set 隐藏操作步骤: 具体的控件类型如下

<ul><li>1 : 选择文件及签署方</li>
<li>2 : 补充文件内容</li>
<li>4 : 发起前合同信息与设置确认</li>
</ul>
注：仅对新版页面生效
     * @param HideOperationSteps 隐藏操作步骤: 具体的控件类型如下

<ul><li>1 : 选择文件及签署方</li>
<li>2 : 补充文件内容</li>
<li>4 : 发起前合同信息与设置确认</li>
</ul>
注：仅对新版页面生效
     */
    public void setHideOperationSteps(Long [] HideOperationSteps) {
        this.HideOperationSteps = HideOperationSteps;
    }

    /**
     * Get 本企业简称，注：仅对新版页面生效 
     * @return SelfName 本企业简称，注：仅对新版页面生效
     */
    public String getSelfName() {
        return this.SelfName;
    }

    /**
     * Set 本企业简称，注：仅对新版页面生效
     * @param SelfName 本企业简称，注：仅对新版页面生效
     */
    public void setSelfName(String SelfName) {
        this.SelfName = SelfName;
    }

    /**
     * Get 发起后签署码隐藏，默认false，注：仅对新版页面生效 
     * @return HideSignCodeAfterStart 发起后签署码隐藏，默认false，注：仅对新版页面生效
     */
    public Boolean getHideSignCodeAfterStart() {
        return this.HideSignCodeAfterStart;
    }

    /**
     * Set 发起后签署码隐藏，默认false，注：仅对新版页面生效
     * @param HideSignCodeAfterStart 发起后签署码隐藏，默认false，注：仅对新版页面生效
     */
    public void setHideSignCodeAfterStart(Boolean HideSignCodeAfterStart) {
        this.HideSignCodeAfterStart = HideSignCodeAfterStart;
    }

    public CreateFlowOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowOption(CreateFlowOption source) {
        if (source.CanEditFlow != null) {
            this.CanEditFlow = new Boolean(source.CanEditFlow);
        }
        if (source.HideShowFlowName != null) {
            this.HideShowFlowName = new Boolean(source.HideShowFlowName);
        }
        if (source.HideShowFlowType != null) {
            this.HideShowFlowType = new Boolean(source.HideShowFlowType);
        }
        if (source.HideShowDeadline != null) {
            this.HideShowDeadline = new Boolean(source.HideShowDeadline);
        }
        if (source.CanSkipAddApprover != null) {
            this.CanSkipAddApprover = new Boolean(source.CanSkipAddApprover);
        }
        if (source.ForbidEditApprover != null) {
            this.ForbidEditApprover = new Boolean(source.ForbidEditApprover);
        }
        if (source.CustomCreateFlowDescription != null) {
            this.CustomCreateFlowDescription = new String(source.CustomCreateFlowDescription);
        }
        if (source.ForbidEditFillComponent != null) {
            this.ForbidEditFillComponent = new Boolean(source.ForbidEditFillComponent);
        }
        if (source.SkipUploadFile != null) {
            this.SkipUploadFile = new Boolean(source.SkipUploadFile);
        }
        if (source.SignComponentConfig != null) {
            this.SignComponentConfig = new SignComponentConfig(source.SignComponentConfig);
        }
        if (source.ForbidEditWatermark != null) {
            this.ForbidEditWatermark = new Boolean(source.ForbidEditWatermark);
        }
        if (source.PreviewAfterStart != null) {
            this.PreviewAfterStart = new Boolean(source.PreviewAfterStart);
        }
        if (source.SignAfterStart != null) {
            this.SignAfterStart = new Boolean(source.SignAfterStart);
        }
        if (source.HideOperationSteps != null) {
            this.HideOperationSteps = new Long[source.HideOperationSteps.length];
            for (int i = 0; i < source.HideOperationSteps.length; i++) {
                this.HideOperationSteps[i] = new Long(source.HideOperationSteps[i]);
            }
        }
        if (source.SelfName != null) {
            this.SelfName = new String(source.SelfName);
        }
        if (source.HideSignCodeAfterStart != null) {
            this.HideSignCodeAfterStart = new Boolean(source.HideSignCodeAfterStart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanEditFlow", this.CanEditFlow);
        this.setParamSimple(map, prefix + "HideShowFlowName", this.HideShowFlowName);
        this.setParamSimple(map, prefix + "HideShowFlowType", this.HideShowFlowType);
        this.setParamSimple(map, prefix + "HideShowDeadline", this.HideShowDeadline);
        this.setParamSimple(map, prefix + "CanSkipAddApprover", this.CanSkipAddApprover);
        this.setParamSimple(map, prefix + "ForbidEditApprover", this.ForbidEditApprover);
        this.setParamSimple(map, prefix + "CustomCreateFlowDescription", this.CustomCreateFlowDescription);
        this.setParamSimple(map, prefix + "ForbidEditFillComponent", this.ForbidEditFillComponent);
        this.setParamSimple(map, prefix + "SkipUploadFile", this.SkipUploadFile);
        this.setParamObj(map, prefix + "SignComponentConfig.", this.SignComponentConfig);
        this.setParamSimple(map, prefix + "ForbidEditWatermark", this.ForbidEditWatermark);
        this.setParamSimple(map, prefix + "PreviewAfterStart", this.PreviewAfterStart);
        this.setParamSimple(map, prefix + "SignAfterStart", this.SignAfterStart);
        this.setParamArraySimple(map, prefix + "HideOperationSteps.", this.HideOperationSteps);
        this.setParamSimple(map, prefix + "SelfName", this.SelfName);
        this.setParamSimple(map, prefix + "HideSignCodeAfterStart", this.HideSignCodeAfterStart);

    }
}

