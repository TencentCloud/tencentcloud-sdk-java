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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalerBehavior extends AbstractModel{

    /**
    * 扩容行为配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleUp")
    @Expose
    private AutoScalerRules ScaleUp;

    /**
    * 缩容行为配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleDown")
    @Expose
    private AutoScalerRules ScaleDown;

    /**
     * Get 扩容行为配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleUp 扩容行为配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AutoScalerRules getScaleUp() {
        return this.ScaleUp;
    }

    /**
     * Set 扩容行为配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleUp 扩容行为配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleUp(AutoScalerRules ScaleUp) {
        this.ScaleUp = ScaleUp;
    }

    /**
     * Get 缩容行为配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleDown 缩容行为配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AutoScalerRules getScaleDown() {
        return this.ScaleDown;
    }

    /**
     * Set 缩容行为配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleDown 缩容行为配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleDown(AutoScalerRules ScaleDown) {
        this.ScaleDown = ScaleDown;
    }

    public AutoScalerBehavior() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalerBehavior(AutoScalerBehavior source) {
        if (source.ScaleUp != null) {
            this.ScaleUp = new AutoScalerRules(source.ScaleUp);
        }
        if (source.ScaleDown != null) {
            this.ScaleDown = new AutoScalerRules(source.ScaleDown);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ScaleUp.", this.ScaleUp);
        this.setParamObj(map, prefix + "ScaleDown.", this.ScaleDown);

    }
}

