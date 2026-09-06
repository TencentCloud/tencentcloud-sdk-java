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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowType extends AbstractModel {

    /**
    * <p>任务类型名称，后续可以对 DescribeFlows 出参中的 FlowName 进行筛选</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * <p>任务类型中文描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowDesc")
    @Expose
    private String FlowDesc;

    /**
     * Get <p>任务类型名称，后续可以对 DescribeFlows 出参中的 FlowName 进行筛选</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowName <p>任务类型名称，后续可以对 DescribeFlows 出参中的 FlowName 进行筛选</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>任务类型名称，后续可以对 DescribeFlows 出参中的 FlowName 进行筛选</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowName <p>任务类型名称，后续可以对 DescribeFlows 出参中的 FlowName 进行筛选</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get <p>任务类型中文描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowDesc <p>任务类型中文描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowDesc() {
        return this.FlowDesc;
    }

    /**
     * Set <p>任务类型中文描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowDesc <p>任务类型中文描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowDesc(String FlowDesc) {
        this.FlowDesc = FlowDesc;
    }

    public FlowType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowType(FlowType source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowDesc != null) {
            this.FlowDesc = new String(source.FlowDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowDesc", this.FlowDesc);

    }
}

