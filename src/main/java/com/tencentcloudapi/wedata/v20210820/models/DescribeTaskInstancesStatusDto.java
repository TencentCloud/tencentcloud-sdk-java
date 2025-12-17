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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInstancesStatusDto extends AbstractModel {

    /**
    * 根据任务信息获取实例状态信息实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instances")
    @Expose
    private ParamGetTaskInstancesStatusInfoResponseInstance [] Instances;

    /**
     * Get 根据任务信息获取实例状态信息实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instances 根据任务信息获取实例状态信息实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamGetTaskInstancesStatusInfoResponseInstance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 根据任务信息获取实例状态信息实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instances 根据任务信息获取实例状态信息实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstances(ParamGetTaskInstancesStatusInfoResponseInstance [] Instances) {
        this.Instances = Instances;
    }

    public DescribeTaskInstancesStatusDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskInstancesStatusDto(DescribeTaskInstancesStatusDto source) {
        if (source.Instances != null) {
            this.Instances = new ParamGetTaskInstancesStatusInfoResponseInstance[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new ParamGetTaskInstancesStatusInfoResponseInstance(source.Instances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);

    }
}

