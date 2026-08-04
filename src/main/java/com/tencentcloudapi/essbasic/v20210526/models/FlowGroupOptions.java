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

public class FlowGroupOptions extends AbstractModel {

    /**
    * <p>发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul>
    */
    @SerializedName("SelfOrganizationApproverSignEach")
    @Expose
    private Boolean SelfOrganizationApproverSignEach;

    /**
    * <p>非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：非发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：非发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul>
    */
    @SerializedName("OtherApproverSignEach")
    @Expose
    private Boolean OtherApproverSignEach;

    /**
    * <p>是否不可编辑合同名称 true-不可编辑 false-可编辑(默认)</p>
    */
    @SerializedName("NoEditFlowName")
    @Expose
    private Boolean NoEditFlowName;

    /**
    * <p>是否不可编辑合同类型 true-不可编辑 false-可编辑(默认)</p>
    */
    @SerializedName("NoEditFlowType")
    @Expose
    private Boolean NoEditFlowType;

    /**
    * <p>是否不可编辑合同截止日期 true-不可编辑 false-可编辑(默认)</p>
    */
    @SerializedName("NoEditDeadline")
    @Expose
    private Boolean NoEditDeadline;

    /**
    * <p>签署控件配置(如是否默认展示日期)，用于嵌入式发起页面配置</p>
    */
    @SerializedName("SignComponentConfig")
    @Expose
    private SignComponentConfig SignComponentConfig;

    /**
    * <p>是否禁止编辑水印控件属性 true-禁止 false-否(默认)</p>
    */
    @SerializedName("ForbidEditWatermark")
    @Expose
    private Boolean ForbidEditWatermark;

    /**
    * <p>发起成功后是否隐藏签署码 true-隐藏 false-否(默认)</p>
    */
    @SerializedName("HideSignCodeAfterStart")
    @Expose
    private Boolean HideSignCodeAfterStart;

    /**
    * <p>发起成功后是否签署合同,仅当前经办人为签署人时生效 true-展示签署 false-否(默认)</p>
    */
    @SerializedName("SignAfterStart")
    @Expose
    private Boolean SignAfterStart;

    /**
    * <p>发起成功后是否预览合同 true-展示预览按钮 false-否(默认)</p>
    */
    @SerializedName("PreviewAfterStart")
    @Expose
    private Boolean PreviewAfterStart;

    /**
     * Get <p>发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul> 
     * @return SelfOrganizationApproverSignEach <p>发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul>
     */
    public Boolean getSelfOrganizationApproverSignEach() {
        return this.SelfOrganizationApproverSignEach;
    }

    /**
     * Set <p>发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul>
     * @param SelfOrganizationApproverSignEach <p>发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul>
     */
    public void setSelfOrganizationApproverSignEach(Boolean SelfOrganizationApproverSignEach) {
        this.SelfOrganizationApproverSignEach = SelfOrganizationApproverSignEach;
    }

    /**
     * Get <p>非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：非发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：非发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul> 
     * @return OtherApproverSignEach <p>非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：非发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：非发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul>
     */
    public Boolean getOtherApproverSignEach() {
        return this.OtherApproverSignEach;
    }

    /**
     * Set <p>非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：非发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：非发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul>
     * @param OtherApproverSignEach <p>非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认</p><ul><li>**false**（默认）：非发起方企业经办人签署时对所有子合同进行统一的意愿确认。</li><li>**true**：非发起方企业经办人签署时需要对子合同进行独立的意愿确认。</li></ul>
     */
    public void setOtherApproverSignEach(Boolean OtherApproverSignEach) {
        this.OtherApproverSignEach = OtherApproverSignEach;
    }

    /**
     * Get <p>是否不可编辑合同名称 true-不可编辑 false-可编辑(默认)</p> 
     * @return NoEditFlowName <p>是否不可编辑合同名称 true-不可编辑 false-可编辑(默认)</p>
     */
    public Boolean getNoEditFlowName() {
        return this.NoEditFlowName;
    }

    /**
     * Set <p>是否不可编辑合同名称 true-不可编辑 false-可编辑(默认)</p>
     * @param NoEditFlowName <p>是否不可编辑合同名称 true-不可编辑 false-可编辑(默认)</p>
     */
    public void setNoEditFlowName(Boolean NoEditFlowName) {
        this.NoEditFlowName = NoEditFlowName;
    }

    /**
     * Get <p>是否不可编辑合同类型 true-不可编辑 false-可编辑(默认)</p> 
     * @return NoEditFlowType <p>是否不可编辑合同类型 true-不可编辑 false-可编辑(默认)</p>
     */
    public Boolean getNoEditFlowType() {
        return this.NoEditFlowType;
    }

    /**
     * Set <p>是否不可编辑合同类型 true-不可编辑 false-可编辑(默认)</p>
     * @param NoEditFlowType <p>是否不可编辑合同类型 true-不可编辑 false-可编辑(默认)</p>
     */
    public void setNoEditFlowType(Boolean NoEditFlowType) {
        this.NoEditFlowType = NoEditFlowType;
    }

    /**
     * Get <p>是否不可编辑合同截止日期 true-不可编辑 false-可编辑(默认)</p> 
     * @return NoEditDeadline <p>是否不可编辑合同截止日期 true-不可编辑 false-可编辑(默认)</p>
     */
    public Boolean getNoEditDeadline() {
        return this.NoEditDeadline;
    }

    /**
     * Set <p>是否不可编辑合同截止日期 true-不可编辑 false-可编辑(默认)</p>
     * @param NoEditDeadline <p>是否不可编辑合同截止日期 true-不可编辑 false-可编辑(默认)</p>
     */
    public void setNoEditDeadline(Boolean NoEditDeadline) {
        this.NoEditDeadline = NoEditDeadline;
    }

    /**
     * Get <p>签署控件配置(如是否默认展示日期)，用于嵌入式发起页面配置</p> 
     * @return SignComponentConfig <p>签署控件配置(如是否默认展示日期)，用于嵌入式发起页面配置</p>
     */
    public SignComponentConfig getSignComponentConfig() {
        return this.SignComponentConfig;
    }

    /**
     * Set <p>签署控件配置(如是否默认展示日期)，用于嵌入式发起页面配置</p>
     * @param SignComponentConfig <p>签署控件配置(如是否默认展示日期)，用于嵌入式发起页面配置</p>
     */
    public void setSignComponentConfig(SignComponentConfig SignComponentConfig) {
        this.SignComponentConfig = SignComponentConfig;
    }

    /**
     * Get <p>是否禁止编辑水印控件属性 true-禁止 false-否(默认)</p> 
     * @return ForbidEditWatermark <p>是否禁止编辑水印控件属性 true-禁止 false-否(默认)</p>
     */
    public Boolean getForbidEditWatermark() {
        return this.ForbidEditWatermark;
    }

    /**
     * Set <p>是否禁止编辑水印控件属性 true-禁止 false-否(默认)</p>
     * @param ForbidEditWatermark <p>是否禁止编辑水印控件属性 true-禁止 false-否(默认)</p>
     */
    public void setForbidEditWatermark(Boolean ForbidEditWatermark) {
        this.ForbidEditWatermark = ForbidEditWatermark;
    }

    /**
     * Get <p>发起成功后是否隐藏签署码 true-隐藏 false-否(默认)</p> 
     * @return HideSignCodeAfterStart <p>发起成功后是否隐藏签署码 true-隐藏 false-否(默认)</p>
     */
    public Boolean getHideSignCodeAfterStart() {
        return this.HideSignCodeAfterStart;
    }

    /**
     * Set <p>发起成功后是否隐藏签署码 true-隐藏 false-否(默认)</p>
     * @param HideSignCodeAfterStart <p>发起成功后是否隐藏签署码 true-隐藏 false-否(默认)</p>
     */
    public void setHideSignCodeAfterStart(Boolean HideSignCodeAfterStart) {
        this.HideSignCodeAfterStart = HideSignCodeAfterStart;
    }

    /**
     * Get <p>发起成功后是否签署合同,仅当前经办人为签署人时生效 true-展示签署 false-否(默认)</p> 
     * @return SignAfterStart <p>发起成功后是否签署合同,仅当前经办人为签署人时生效 true-展示签署 false-否(默认)</p>
     */
    public Boolean getSignAfterStart() {
        return this.SignAfterStart;
    }

    /**
     * Set <p>发起成功后是否签署合同,仅当前经办人为签署人时生效 true-展示签署 false-否(默认)</p>
     * @param SignAfterStart <p>发起成功后是否签署合同,仅当前经办人为签署人时生效 true-展示签署 false-否(默认)</p>
     */
    public void setSignAfterStart(Boolean SignAfterStart) {
        this.SignAfterStart = SignAfterStart;
    }

    /**
     * Get <p>发起成功后是否预览合同 true-展示预览按钮 false-否(默认)</p> 
     * @return PreviewAfterStart <p>发起成功后是否预览合同 true-展示预览按钮 false-否(默认)</p>
     */
    public Boolean getPreviewAfterStart() {
        return this.PreviewAfterStart;
    }

    /**
     * Set <p>发起成功后是否预览合同 true-展示预览按钮 false-否(默认)</p>
     * @param PreviewAfterStart <p>发起成功后是否预览合同 true-展示预览按钮 false-否(默认)</p>
     */
    public void setPreviewAfterStart(Boolean PreviewAfterStart) {
        this.PreviewAfterStart = PreviewAfterStart;
    }

    public FlowGroupOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowGroupOptions(FlowGroupOptions source) {
        if (source.SelfOrganizationApproverSignEach != null) {
            this.SelfOrganizationApproverSignEach = new Boolean(source.SelfOrganizationApproverSignEach);
        }
        if (source.OtherApproverSignEach != null) {
            this.OtherApproverSignEach = new Boolean(source.OtherApproverSignEach);
        }
        if (source.NoEditFlowName != null) {
            this.NoEditFlowName = new Boolean(source.NoEditFlowName);
        }
        if (source.NoEditFlowType != null) {
            this.NoEditFlowType = new Boolean(source.NoEditFlowType);
        }
        if (source.NoEditDeadline != null) {
            this.NoEditDeadline = new Boolean(source.NoEditDeadline);
        }
        if (source.SignComponentConfig != null) {
            this.SignComponentConfig = new SignComponentConfig(source.SignComponentConfig);
        }
        if (source.ForbidEditWatermark != null) {
            this.ForbidEditWatermark = new Boolean(source.ForbidEditWatermark);
        }
        if (source.HideSignCodeAfterStart != null) {
            this.HideSignCodeAfterStart = new Boolean(source.HideSignCodeAfterStart);
        }
        if (source.SignAfterStart != null) {
            this.SignAfterStart = new Boolean(source.SignAfterStart);
        }
        if (source.PreviewAfterStart != null) {
            this.PreviewAfterStart = new Boolean(source.PreviewAfterStart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelfOrganizationApproverSignEach", this.SelfOrganizationApproverSignEach);
        this.setParamSimple(map, prefix + "OtherApproverSignEach", this.OtherApproverSignEach);
        this.setParamSimple(map, prefix + "NoEditFlowName", this.NoEditFlowName);
        this.setParamSimple(map, prefix + "NoEditFlowType", this.NoEditFlowType);
        this.setParamSimple(map, prefix + "NoEditDeadline", this.NoEditDeadline);
        this.setParamObj(map, prefix + "SignComponentConfig.", this.SignComponentConfig);
        this.setParamSimple(map, prefix + "ForbidEditWatermark", this.ForbidEditWatermark);
        this.setParamSimple(map, prefix + "HideSignCodeAfterStart", this.HideSignCodeAfterStart);
        this.setParamSimple(map, prefix + "SignAfterStart", this.SignAfterStart);
        this.setParamSimple(map, prefix + "PreviewAfterStart", this.PreviewAfterStart);

    }
}

