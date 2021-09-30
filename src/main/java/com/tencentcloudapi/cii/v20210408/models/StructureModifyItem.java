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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StructureModifyItem extends AbstractModel{

    /**
    * 修改的字段的路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 机器结果的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 人工结果的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Manual")
    @Expose
    private String Manual;

    /**
     * Get 修改的字段的路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 修改的字段的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 修改的字段的路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 修改的字段的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 机器结果的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Machine 机器结果的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set 机器结果的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Machine 机器结果的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get 人工结果的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Manual 人工结果的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManual() {
        return this.Manual;
    }

    /**
     * Set 人工结果的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Manual 人工结果的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManual(String Manual) {
        this.Manual = Manual;
    }

    public StructureModifyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StructureModifyItem(StructureModifyItem source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Machine != null) {
            this.Machine = new String(source.Machine);
        }
        if (source.Manual != null) {
            this.Manual = new String(source.Manual);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "Manual", this.Manual);

    }
}

