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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskExtVO extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private ParamInfo [] Properties;

    /**
    * 任务试运行扩展业务属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DryRunExtAttributes")
    @Expose
    private AttributeItemVO [] DryRunExtAttributes;

    /**
    * 任务试运行动态传参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DryRunParameter")
    @Expose
    private AttributeItemVO [] DryRunParameter;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 任务属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfo [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 任务属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 任务属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(ParamInfo [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 任务试运行扩展业务属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DryRunExtAttributes 任务试运行扩展业务属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttributeItemVO [] getDryRunExtAttributes() {
        return this.DryRunExtAttributes;
    }

    /**
     * Set 任务试运行扩展业务属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param DryRunExtAttributes 任务试运行扩展业务属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDryRunExtAttributes(AttributeItemVO [] DryRunExtAttributes) {
        this.DryRunExtAttributes = DryRunExtAttributes;
    }

    /**
     * Get 任务试运行动态传参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DryRunParameter 任务试运行动态传参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttributeItemVO [] getDryRunParameter() {
        return this.DryRunParameter;
    }

    /**
     * Set 任务试运行动态传参
注意：此字段可能返回 null，表示取不到有效值。
     * @param DryRunParameter 任务试运行动态传参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDryRunParameter(AttributeItemVO [] DryRunParameter) {
        this.DryRunParameter = DryRunParameter;
    }

    public TaskExtVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskExtVO(TaskExtVO source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Properties != null) {
            this.Properties = new ParamInfo[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new ParamInfo(source.Properties[i]);
            }
        }
        if (source.DryRunExtAttributes != null) {
            this.DryRunExtAttributes = new AttributeItemVO[source.DryRunExtAttributes.length];
            for (int i = 0; i < source.DryRunExtAttributes.length; i++) {
                this.DryRunExtAttributes[i] = new AttributeItemVO(source.DryRunExtAttributes[i]);
            }
        }
        if (source.DryRunParameter != null) {
            this.DryRunParameter = new AttributeItemVO[source.DryRunParameter.length];
            for (int i = 0; i < source.DryRunParameter.length; i++) {
                this.DryRunParameter[i] = new AttributeItemVO(source.DryRunParameter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamArrayObj(map, prefix + "DryRunExtAttributes.", this.DryRunExtAttributes);
        this.setParamArrayObj(map, prefix + "DryRunParameter.", this.DryRunParameter);

    }
}

