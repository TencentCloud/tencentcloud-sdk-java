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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SurgeryUrogenitalSystem extends AbstractModel {

    /**
    * 泌尿生殖系统总体描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private KeyValueItem Text;

    /**
    * 前列腺
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Prostate")
    @Expose
    private KeyValueItem Prostate;

    /**
    * 外生殖器（男性）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReproductiveOrgans")
    @Expose
    private KeyValueItem ExternalReproductiveOrgans;

    /**
     * Get 泌尿生殖系统总体描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 泌尿生殖系统总体描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getText() {
        return this.Text;
    }

    /**
     * Set 泌尿生殖系统总体描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 泌尿生殖系统总体描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(KeyValueItem Text) {
        this.Text = Text;
    }

    /**
     * Get 前列腺
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Prostate 前列腺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getProstate() {
        return this.Prostate;
    }

    /**
     * Set 前列腺
注意：此字段可能返回 null，表示取不到有效值。
     * @param Prostate 前列腺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProstate(KeyValueItem Prostate) {
        this.Prostate = Prostate;
    }

    /**
     * Get 外生殖器（男性）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReproductiveOrgans 外生殖器（男性）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getExternalReproductiveOrgans() {
        return this.ExternalReproductiveOrgans;
    }

    /**
     * Set 外生殖器（男性）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReproductiveOrgans 外生殖器（男性）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReproductiveOrgans(KeyValueItem ExternalReproductiveOrgans) {
        this.ExternalReproductiveOrgans = ExternalReproductiveOrgans;
    }

    public SurgeryUrogenitalSystem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SurgeryUrogenitalSystem(SurgeryUrogenitalSystem source) {
        if (source.Text != null) {
            this.Text = new KeyValueItem(source.Text);
        }
        if (source.Prostate != null) {
            this.Prostate = new KeyValueItem(source.Prostate);
        }
        if (source.ExternalReproductiveOrgans != null) {
            this.ExternalReproductiveOrgans = new KeyValueItem(source.ExternalReproductiveOrgans);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "Prostate.", this.Prostate);
        this.setParamObj(map, prefix + "ExternalReproductiveOrgans.", this.ExternalReproductiveOrgans);

    }
}

