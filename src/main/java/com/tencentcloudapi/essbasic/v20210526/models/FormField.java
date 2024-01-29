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

public class FormField extends AbstractModel {

    /**
    * 控件填充值，ComponentType和传入值格式对应关系如下：
<ul>
<li>TEXT - 普通文本控件，需输入文本字符串；</li>
<li>MULTI_LINE_TEXT - 多行文本控件，需输入文本字符串；</li>
<li>CHECK_BOX - 勾选框控件，若选中需填写ComponentValue，填写 true或者 false 字符串；</li>
<li>FILL_IMAGE - 图片控件，需填写ComponentValue为图片的资源 ID；</li>
<li>DYNAMIC_TABLE - 动态表格控件；</li>
<li>ATTACHMENT - 附件控件，需填写ComponentValue为附件图片的资源 ID列表，以逗号分割；</li>
<li>DATE - 日期控件；格式为 <b>xxxx年xx月xx日</b> 字符串；</li>
<li>DISTRICT - 省市区行政区控件，需填写ComponentValue为省市区行政区字符串内容；</li>
</ul>

    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * 表单域或控件的ID，跟ComponentName二选一，不能全为空；
CreateFlowsByTemplates 接口不使用此字段。

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件ID的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * 控件的名字，跟ComponentId二选一，不能全为空

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件名字的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 是否锁定模板控件值，锁定后无法修改（用于嵌入式发起合同），true-锁定，false-不锁定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockComponentValue")
    @Expose
    private Boolean LockComponentValue;

    /**
     * Get 控件填充值，ComponentType和传入值格式对应关系如下：
<ul>
<li>TEXT - 普通文本控件，需输入文本字符串；</li>
<li>MULTI_LINE_TEXT - 多行文本控件，需输入文本字符串；</li>
<li>CHECK_BOX - 勾选框控件，若选中需填写ComponentValue，填写 true或者 false 字符串；</li>
<li>FILL_IMAGE - 图片控件，需填写ComponentValue为图片的资源 ID；</li>
<li>DYNAMIC_TABLE - 动态表格控件；</li>
<li>ATTACHMENT - 附件控件，需填写ComponentValue为附件图片的资源 ID列表，以逗号分割；</li>
<li>DATE - 日期控件；格式为 <b>xxxx年xx月xx日</b> 字符串；</li>
<li>DISTRICT - 省市区行政区控件，需填写ComponentValue为省市区行政区字符串内容；</li>
</ul>
 
     * @return ComponentValue 控件填充值，ComponentType和传入值格式对应关系如下：
<ul>
<li>TEXT - 普通文本控件，需输入文本字符串；</li>
<li>MULTI_LINE_TEXT - 多行文本控件，需输入文本字符串；</li>
<li>CHECK_BOX - 勾选框控件，若选中需填写ComponentValue，填写 true或者 false 字符串；</li>
<li>FILL_IMAGE - 图片控件，需填写ComponentValue为图片的资源 ID；</li>
<li>DYNAMIC_TABLE - 动态表格控件；</li>
<li>ATTACHMENT - 附件控件，需填写ComponentValue为附件图片的资源 ID列表，以逗号分割；</li>
<li>DATE - 日期控件；格式为 <b>xxxx年xx月xx日</b> 字符串；</li>
<li>DISTRICT - 省市区行政区控件，需填写ComponentValue为省市区行政区字符串内容；</li>
</ul>

     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 控件填充值，ComponentType和传入值格式对应关系如下：
<ul>
<li>TEXT - 普通文本控件，需输入文本字符串；</li>
<li>MULTI_LINE_TEXT - 多行文本控件，需输入文本字符串；</li>
<li>CHECK_BOX - 勾选框控件，若选中需填写ComponentValue，填写 true或者 false 字符串；</li>
<li>FILL_IMAGE - 图片控件，需填写ComponentValue为图片的资源 ID；</li>
<li>DYNAMIC_TABLE - 动态表格控件；</li>
<li>ATTACHMENT - 附件控件，需填写ComponentValue为附件图片的资源 ID列表，以逗号分割；</li>
<li>DATE - 日期控件；格式为 <b>xxxx年xx月xx日</b> 字符串；</li>
<li>DISTRICT - 省市区行政区控件，需填写ComponentValue为省市区行政区字符串内容；</li>
</ul>

     * @param ComponentValue 控件填充值，ComponentType和传入值格式对应关系如下：
<ul>
<li>TEXT - 普通文本控件，需输入文本字符串；</li>
<li>MULTI_LINE_TEXT - 多行文本控件，需输入文本字符串；</li>
<li>CHECK_BOX - 勾选框控件，若选中需填写ComponentValue，填写 true或者 false 字符串；</li>
<li>FILL_IMAGE - 图片控件，需填写ComponentValue为图片的资源 ID；</li>
<li>DYNAMIC_TABLE - 动态表格控件；</li>
<li>ATTACHMENT - 附件控件，需填写ComponentValue为附件图片的资源 ID列表，以逗号分割；</li>
<li>DATE - 日期控件；格式为 <b>xxxx年xx月xx日</b> 字符串；</li>
<li>DISTRICT - 省市区行政区控件，需填写ComponentValue为省市区行政区字符串内容；</li>
</ul>

     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    /**
     * Get 表单域或控件的ID，跟ComponentName二选一，不能全为空；
CreateFlowsByTemplates 接口不使用此字段。

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件ID的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentId 表单域或控件的ID，跟ComponentName二选一，不能全为空；
CreateFlowsByTemplates 接口不使用此字段。

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件ID的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 表单域或控件的ID，跟ComponentName二选一，不能全为空；
CreateFlowsByTemplates 接口不使用此字段。

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件ID的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentId 表单域或控件的ID，跟ComponentName二选一，不能全为空；
CreateFlowsByTemplates 接口不使用此字段。

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件ID的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get 控件的名字，跟ComponentId二选一，不能全为空

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件名字的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentName 控件的名字，跟ComponentId二选一，不能全为空

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件名字的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 控件的名字，跟ComponentId二选一，不能全为空

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件名字的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentName 控件的名字，跟ComponentId二选一，不能全为空

<a href="https://dyn.ess.tencent.cn/guide/apivideo/channel_component_name.mp4" target="_blank">点击此处查看模板上控件名字的获取方式</a>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 是否锁定模板控件值，锁定后无法修改（用于嵌入式发起合同），true-锁定，false-不锁定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockComponentValue 是否锁定模板控件值，锁定后无法修改（用于嵌入式发起合同），true-锁定，false-不锁定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLockComponentValue() {
        return this.LockComponentValue;
    }

    /**
     * Set 是否锁定模板控件值，锁定后无法修改（用于嵌入式发起合同），true-锁定，false-不锁定
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockComponentValue 是否锁定模板控件值，锁定后无法修改（用于嵌入式发起合同），true-锁定，false-不锁定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockComponentValue(Boolean LockComponentValue) {
        this.LockComponentValue = LockComponentValue;
    }

    public FormField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FormField(FormField source) {
        if (source.ComponentValue != null) {
            this.ComponentValue = new String(source.ComponentValue);
        }
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.LockComponentValue != null) {
            this.LockComponentValue = new Boolean(source.LockComponentValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentValue", this.ComponentValue);
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "LockComponentValue", this.LockComponentValue);

    }
}

