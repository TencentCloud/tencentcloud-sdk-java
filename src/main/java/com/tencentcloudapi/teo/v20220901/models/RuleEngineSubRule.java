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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleEngineSubRule extends AbstractModel {

    /**
    * 子规则分支
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branches")
    @Expose
    private RuleBranch [] Branches;

    /**
    * 规则注释。
    */
    @SerializedName("Description")
    @Expose
    private String [] Description;

    /**
     * Get 子规则分支
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branches 子规则分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleBranch [] getBranches() {
        return this.Branches;
    }

    /**
     * Set 子规则分支
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branches 子规则分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranches(RuleBranch [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get 规则注释。 
     * @return Description 规则注释。
     */
    public String [] getDescription() {
        return this.Description;
    }

    /**
     * Set 规则注释。
     * @param Description 规则注释。
     */
    public void setDescription(String [] Description) {
        this.Description = Description;
    }

    public RuleEngineSubRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineSubRule(RuleEngineSubRule source) {
        if (source.Branches != null) {
            this.Branches = new RuleBranch[source.Branches.length];
            for (int i = 0; i < source.Branches.length; i++) {
                this.Branches[i] = new RuleBranch(source.Branches[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String[source.Description.length];
            for (int i = 0; i < source.Description.length; i++) {
                this.Description[i] = new String(source.Description[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Branches.", this.Branches);
        this.setParamArraySimple(map, prefix + "Description.", this.Description);

    }
}

