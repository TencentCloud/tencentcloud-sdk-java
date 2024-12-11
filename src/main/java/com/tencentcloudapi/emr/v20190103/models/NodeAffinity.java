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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeAffinity extends AbstractModel {

    /**
    * 节点亲和性-强制调度设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequiredDuringSchedulingIgnoredDuringExecution")
    @Expose
    private NodeSelector RequiredDuringSchedulingIgnoredDuringExecution;

    /**
    * 节点亲和性-容忍调度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreferredDuringSchedulingIgnoredDuringExecution")
    @Expose
    private PreferredSchedulingTerm [] PreferredDuringSchedulingIgnoredDuringExecution;

    /**
     * Get 节点亲和性-强制调度设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequiredDuringSchedulingIgnoredDuringExecution 节点亲和性-强制调度设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.RequiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * Set 节点亲和性-强制调度设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequiredDuringSchedulingIgnoredDuringExecution 节点亲和性-强制调度设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector RequiredDuringSchedulingIgnoredDuringExecution) {
        this.RequiredDuringSchedulingIgnoredDuringExecution = RequiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * Get 节点亲和性-容忍调度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreferredDuringSchedulingIgnoredDuringExecution 节点亲和性-容忍调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PreferredSchedulingTerm [] getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.PreferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * Set 节点亲和性-容忍调度
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreferredDuringSchedulingIgnoredDuringExecution 节点亲和性-容忍调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreferredDuringSchedulingIgnoredDuringExecution(PreferredSchedulingTerm [] PreferredDuringSchedulingIgnoredDuringExecution) {
        this.PreferredDuringSchedulingIgnoredDuringExecution = PreferredDuringSchedulingIgnoredDuringExecution;
    }

    public NodeAffinity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeAffinity(NodeAffinity source) {
        if (source.RequiredDuringSchedulingIgnoredDuringExecution != null) {
            this.RequiredDuringSchedulingIgnoredDuringExecution = new NodeSelector(source.RequiredDuringSchedulingIgnoredDuringExecution);
        }
        if (source.PreferredDuringSchedulingIgnoredDuringExecution != null) {
            this.PreferredDuringSchedulingIgnoredDuringExecution = new PreferredSchedulingTerm[source.PreferredDuringSchedulingIgnoredDuringExecution.length];
            for (int i = 0; i < source.PreferredDuringSchedulingIgnoredDuringExecution.length; i++) {
                this.PreferredDuringSchedulingIgnoredDuringExecution[i] = new PreferredSchedulingTerm(source.PreferredDuringSchedulingIgnoredDuringExecution[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RequiredDuringSchedulingIgnoredDuringExecution.", this.RequiredDuringSchedulingIgnoredDuringExecution);
        this.setParamArrayObj(map, prefix + "PreferredDuringSchedulingIgnoredDuringExecution.", this.PreferredDuringSchedulingIgnoredDuringExecution);

    }
}

