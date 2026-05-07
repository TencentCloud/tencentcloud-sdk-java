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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedAIModelGroup extends AbstractModel {

    /**
    * <p>模型分组</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Models")
    @Expose
    private ManagedAIModel [] Models;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>模型分组</p> 
     * @return GroupName <p>模型分组</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>模型分组</p>
     * @param GroupName <p>模型分组</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Models <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ManagedAIModel [] getModels() {
        return this.Models;
    }

    /**
     * Set <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Models <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModels(ManagedAIModel [] Models) {
        this.Models = Models;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ManagedAIModelGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedAIModelGroup(ManagedAIModelGroup source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Models != null) {
            this.Models = new ManagedAIModel[source.Models.length];
            for (int i = 0; i < source.Models.length; i++) {
                this.Models[i] = new ManagedAIModel(source.Models[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Models.", this.Models);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

