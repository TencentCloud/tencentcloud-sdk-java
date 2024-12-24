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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSpec extends AbstractModel {

    /**
    * 设备型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 该机型对应的可售卖规格列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecInfos")
    @Expose
    private SpecConfigInfo [] SpecInfos;

    /**
     * Get 设备型号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Machine 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Machine 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get 该机型对应的可售卖规格列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecInfos 该机型对应的可售卖规格列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpecConfigInfo [] getSpecInfos() {
        return this.SpecInfos;
    }

    /**
     * Set 该机型对应的可售卖规格列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecInfos 该机型对应的可售卖规格列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecInfos(SpecConfigInfo [] SpecInfos) {
        this.SpecInfos = SpecInfos;
    }

    public InstanceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSpec(InstanceSpec source) {
        if (source.Machine != null) {
            this.Machine = new String(source.Machine);
        }
        if (source.SpecInfos != null) {
            this.SpecInfos = new SpecConfigInfo[source.SpecInfos.length];
            for (int i = 0; i < source.SpecInfos.length; i++) {
                this.SpecInfos[i] = new SpecConfigInfo(source.SpecInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamArrayObj(map, prefix + "SpecInfos.", this.SpecInfos);

    }
}

