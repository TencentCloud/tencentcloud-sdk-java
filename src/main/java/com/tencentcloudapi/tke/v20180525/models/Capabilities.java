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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Capabilities extends AbstractModel{

    /**
    * 启用安全能力项列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Add")
    @Expose
    private String [] Add;

    /**
    * 禁用安全能力向列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Drop")
    @Expose
    private String [] Drop;

    /**
     * Get 启用安全能力项列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Add 启用安全能力项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAdd() {
        return this.Add;
    }

    /**
     * Set 启用安全能力项列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Add 启用安全能力项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdd(String [] Add) {
        this.Add = Add;
    }

    /**
     * Get 禁用安全能力向列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Drop 禁用安全能力向列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDrop() {
        return this.Drop;
    }

    /**
     * Set 禁用安全能力向列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Drop 禁用安全能力向列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrop(String [] Drop) {
        this.Drop = Drop;
    }

    public Capabilities() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Capabilities(Capabilities source) {
        if (source.Add != null) {
            this.Add = new String[source.Add.length];
            for (int i = 0; i < source.Add.length; i++) {
                this.Add[i] = new String(source.Add[i]);
            }
        }
        if (source.Drop != null) {
            this.Drop = new String[source.Drop.length];
            for (int i = 0; i < source.Drop.length; i++) {
                this.Drop[i] = new String(source.Drop[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Add.", this.Add);
        this.setParamArraySimple(map, prefix + "Drop.", this.Drop);

    }
}

