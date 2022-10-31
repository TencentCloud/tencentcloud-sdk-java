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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateAction extends AbstractModel{

    /**
    * 任务的所有操作列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllAction")
    @Expose
    private String [] AllAction;

    /**
    * 任务在当前状态下允许的操作列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowedAction")
    @Expose
    private String [] AllowedAction;

    /**
     * Get 任务的所有操作列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllAction 任务的所有操作列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllAction() {
        return this.AllAction;
    }

    /**
     * Set 任务的所有操作列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllAction 任务的所有操作列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllAction(String [] AllAction) {
        this.AllAction = AllAction;
    }

    /**
     * Get 任务在当前状态下允许的操作列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowedAction 任务在当前状态下允许的操作列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllowedAction() {
        return this.AllowedAction;
    }

    /**
     * Set 任务在当前状态下允许的操作列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowedAction 任务在当前状态下允许的操作列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowedAction(String [] AllowedAction) {
        this.AllowedAction = AllowedAction;
    }

    public MigrateAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateAction(MigrateAction source) {
        if (source.AllAction != null) {
            this.AllAction = new String[source.AllAction.length];
            for (int i = 0; i < source.AllAction.length; i++) {
                this.AllAction[i] = new String(source.AllAction[i]);
            }
        }
        if (source.AllowedAction != null) {
            this.AllowedAction = new String[source.AllowedAction.length];
            for (int i = 0; i < source.AllowedAction.length; i++) {
                this.AllowedAction[i] = new String(source.AllowedAction[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AllAction.", this.AllAction);
        this.setParamArraySimple(map, prefix + "AllowedAction.", this.AllowedAction);

    }
}

