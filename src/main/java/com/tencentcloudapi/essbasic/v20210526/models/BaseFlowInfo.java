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

public class BaseFlowInfo extends AbstractModel{

    /**
    * 合同流程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 合同流程类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 合同流程描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 合同流程截止时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 是否顺序签署(true:无序签,false:顺序签)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntelligentStatus")
    @Expose
    private String IntelligentStatus;

    /**
    * 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FormFields")
    @Expose
    private FormField [] FormFields;

    /**
    * 本企业(发起方企业)是否需要签署审批，true：开启本企业签署审批
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
     * Get 合同流程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowName 合同流程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同流程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowName 合同流程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 合同流程类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowType 合同流程类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同流程类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowType 合同流程类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 合同流程描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowDescription 合同流程描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 合同流程描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowDescription 合同流程描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 合同流程截止时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deadline 合同流程截止时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 合同流程截止时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deadline 合同流程截止时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 是否顺序签署(true:无序签,false:顺序签)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unordered 是否顺序签署(true:无序签,false:顺序签)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 是否顺序签署(true:无序签,false:顺序签)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unordered 是否顺序签署(true:无序签,false:顺序签)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntelligentStatus 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntelligentStatus() {
        return this.IntelligentStatus;
    }

    /**
     * Set 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntelligentStatus 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntelligentStatus(String IntelligentStatus) {
        this.IntelligentStatus = IntelligentStatus;
    }

    /**
     * Get 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FormFields 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FormField [] getFormFields() {
        return this.FormFields;
    }

    /**
     * Set 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param FormFields 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormFields(FormField [] FormFields) {
        this.FormFields = FormFields;
    }

    /**
     * Get 本企业(发起方企业)是否需要签署审批，true：开启本企业签署审批
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedSignReview 本企业(发起方企业)是否需要签署审批，true：开启本企业签署审批
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set 本企业(发起方企业)是否需要签署审批，true：开启本企业签署审批
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedSignReview 本企业(发起方企业)是否需要签署审批，true：开启本企业签署审批
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    public BaseFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseFlowInfo(BaseFlowInfo source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.IntelligentStatus != null) {
            this.IntelligentStatus = new String(source.IntelligentStatus);
        }
        if (source.FormFields != null) {
            this.FormFields = new FormField[source.FormFields.length];
            for (int i = 0; i < source.FormFields.length; i++) {
                this.FormFields[i] = new FormField(source.FormFields[i]);
            }
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "IntelligentStatus", this.IntelligentStatus);
        this.setParamArrayObj(map, prefix + "FormFields.", this.FormFields);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);

    }
}

