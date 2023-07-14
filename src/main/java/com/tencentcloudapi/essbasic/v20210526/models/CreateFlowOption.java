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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowOption extends AbstractModel{

    /**
    * 是否允许修改合同信息，true-是，false-否
    */
    @SerializedName("CanEditFlow")
    @Expose
    private Boolean CanEditFlow;

    /**
    * 是否允许发起合同弹窗隐藏合同名称，true-允许，false-不允许
    */
    @SerializedName("HideShowFlowName")
    @Expose
    private Boolean HideShowFlowName;

    /**
    * 是否允许发起合同弹窗隐藏合同类型，true-允许，false-不允许
    */
    @SerializedName("HideShowFlowType")
    @Expose
    private Boolean HideShowFlowType;

    /**
    * 是否允许发起合同弹窗隐藏合同到期时间，true-允许，false-不允许
    */
    @SerializedName("HideShowDeadline")
    @Expose
    private Boolean HideShowDeadline;

    /**
    * 是否允许发起合同步骤跳过指定签署方步骤，true-允许，false-不允许
    */
    @SerializedName("CanSkipAddApprover")
    @Expose
    private Boolean CanSkipAddApprover;

    /**
    * 定制化发起合同弹窗的描述信息，描述信息最长500
    */
    @SerializedName("CustomCreateFlowDescription")
    @Expose
    private String CustomCreateFlowDescription;

    /**
     * Get 是否允许修改合同信息，true-是，false-否 
     * @return CanEditFlow 是否允许修改合同信息，true-是，false-否
     */
    public Boolean getCanEditFlow() {
        return this.CanEditFlow;
    }

    /**
     * Set 是否允许修改合同信息，true-是，false-否
     * @param CanEditFlow 是否允许修改合同信息，true-是，false-否
     */
    public void setCanEditFlow(Boolean CanEditFlow) {
        this.CanEditFlow = CanEditFlow;
    }

    /**
     * Get 是否允许发起合同弹窗隐藏合同名称，true-允许，false-不允许 
     * @return HideShowFlowName 是否允许发起合同弹窗隐藏合同名称，true-允许，false-不允许
     */
    public Boolean getHideShowFlowName() {
        return this.HideShowFlowName;
    }

    /**
     * Set 是否允许发起合同弹窗隐藏合同名称，true-允许，false-不允许
     * @param HideShowFlowName 是否允许发起合同弹窗隐藏合同名称，true-允许，false-不允许
     */
    public void setHideShowFlowName(Boolean HideShowFlowName) {
        this.HideShowFlowName = HideShowFlowName;
    }

    /**
     * Get 是否允许发起合同弹窗隐藏合同类型，true-允许，false-不允许 
     * @return HideShowFlowType 是否允许发起合同弹窗隐藏合同类型，true-允许，false-不允许
     */
    public Boolean getHideShowFlowType() {
        return this.HideShowFlowType;
    }

    /**
     * Set 是否允许发起合同弹窗隐藏合同类型，true-允许，false-不允许
     * @param HideShowFlowType 是否允许发起合同弹窗隐藏合同类型，true-允许，false-不允许
     */
    public void setHideShowFlowType(Boolean HideShowFlowType) {
        this.HideShowFlowType = HideShowFlowType;
    }

    /**
     * Get 是否允许发起合同弹窗隐藏合同到期时间，true-允许，false-不允许 
     * @return HideShowDeadline 是否允许发起合同弹窗隐藏合同到期时间，true-允许，false-不允许
     */
    public Boolean getHideShowDeadline() {
        return this.HideShowDeadline;
    }

    /**
     * Set 是否允许发起合同弹窗隐藏合同到期时间，true-允许，false-不允许
     * @param HideShowDeadline 是否允许发起合同弹窗隐藏合同到期时间，true-允许，false-不允许
     */
    public void setHideShowDeadline(Boolean HideShowDeadline) {
        this.HideShowDeadline = HideShowDeadline;
    }

    /**
     * Get 是否允许发起合同步骤跳过指定签署方步骤，true-允许，false-不允许 
     * @return CanSkipAddApprover 是否允许发起合同步骤跳过指定签署方步骤，true-允许，false-不允许
     */
    public Boolean getCanSkipAddApprover() {
        return this.CanSkipAddApprover;
    }

    /**
     * Set 是否允许发起合同步骤跳过指定签署方步骤，true-允许，false-不允许
     * @param CanSkipAddApprover 是否允许发起合同步骤跳过指定签署方步骤，true-允许，false-不允许
     */
    public void setCanSkipAddApprover(Boolean CanSkipAddApprover) {
        this.CanSkipAddApprover = CanSkipAddApprover;
    }

    /**
     * Get 定制化发起合同弹窗的描述信息，描述信息最长500 
     * @return CustomCreateFlowDescription 定制化发起合同弹窗的描述信息，描述信息最长500
     */
    public String getCustomCreateFlowDescription() {
        return this.CustomCreateFlowDescription;
    }

    /**
     * Set 定制化发起合同弹窗的描述信息，描述信息最长500
     * @param CustomCreateFlowDescription 定制化发起合同弹窗的描述信息，描述信息最长500
     */
    public void setCustomCreateFlowDescription(String CustomCreateFlowDescription) {
        this.CustomCreateFlowDescription = CustomCreateFlowDescription;
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
        if (source.CustomCreateFlowDescription != null) {
            this.CustomCreateFlowDescription = new String(source.CustomCreateFlowDescription);
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
        this.setParamSimple(map, prefix + "CustomCreateFlowDescription", this.CustomCreateFlowDescription);

    }
}

