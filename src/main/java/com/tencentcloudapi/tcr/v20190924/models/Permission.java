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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Permission extends AbstractModel{

    /**
    * 资源路径，目前仅支持Namespace
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 动作，目前仅支持：tcr:PushRepository、tcr:PullRepository
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Actions")
    @Expose
    private String [] Actions;

    /**
     * Get 资源路径，目前仅支持Namespace
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 资源路径，目前仅支持Namespace
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 资源路径，目前仅支持Namespace
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 资源路径，目前仅支持Namespace
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 动作，目前仅支持：tcr:PushRepository、tcr:PullRepository
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Actions 动作，目前仅支持：tcr:PushRepository、tcr:PullRepository
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getActions() {
        return this.Actions;
    }

    /**
     * Set 动作，目前仅支持：tcr:PushRepository、tcr:PullRepository
注意：此字段可能返回 null，表示取不到有效值。
     * @param Actions 动作，目前仅支持：tcr:PushRepository、tcr:PullRepository
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActions(String [] Actions) {
        this.Actions = Actions;
    }

    public Permission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Permission(Permission source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Actions != null) {
            this.Actions = new String[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new String(source.Actions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArraySimple(map, prefix + "Actions.", this.Actions);

    }
}

