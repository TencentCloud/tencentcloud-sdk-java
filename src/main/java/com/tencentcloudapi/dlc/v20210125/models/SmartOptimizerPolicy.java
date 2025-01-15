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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartOptimizerPolicy extends AbstractModel {

    /**
    * 是否继承
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Inherit")
    @Expose
    private String Inherit;

    /**
    * ResourceInfo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo [] Resources;

    /**
    * SmartOptimizerWrittenPolicy
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Written")
    @Expose
    private SmartOptimizerWrittenPolicy Written;

    /**
    * SmartOptimizerLifecyclePolicy
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lifecycle")
    @Expose
    private SmartOptimizerLifecyclePolicy Lifecycle;

    /**
    * SmartOptimizerIndexPolicy
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private SmartOptimizerIndexPolicy Index;

    /**
    * SmartOptimizerChangeTablePolicy
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChangeTable")
    @Expose
    private SmartOptimizerChangeTablePolicy ChangeTable;

    /**
     * Get 是否继承
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Inherit 是否继承
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInherit() {
        return this.Inherit;
    }

    /**
     * Set 是否继承
注意：此字段可能返回 null，表示取不到有效值。
     * @param Inherit 是否继承
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInherit(String Inherit) {
        this.Inherit = Inherit;
    }

    /**
     * Get ResourceInfo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resources ResourceInfo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo [] getResources() {
        return this.Resources;
    }

    /**
     * Set ResourceInfo
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resources ResourceInfo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResources(ResourceInfo [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get SmartOptimizerWrittenPolicy
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Written SmartOptimizerWrittenPolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartOptimizerWrittenPolicy getWritten() {
        return this.Written;
    }

    /**
     * Set SmartOptimizerWrittenPolicy
注意：此字段可能返回 null，表示取不到有效值。
     * @param Written SmartOptimizerWrittenPolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWritten(SmartOptimizerWrittenPolicy Written) {
        this.Written = Written;
    }

    /**
     * Get SmartOptimizerLifecyclePolicy
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lifecycle SmartOptimizerLifecyclePolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartOptimizerLifecyclePolicy getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set SmartOptimizerLifecyclePolicy
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lifecycle SmartOptimizerLifecyclePolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecycle(SmartOptimizerLifecyclePolicy Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get SmartOptimizerIndexPolicy
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index SmartOptimizerIndexPolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartOptimizerIndexPolicy getIndex() {
        return this.Index;
    }

    /**
     * Set SmartOptimizerIndexPolicy
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index SmartOptimizerIndexPolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(SmartOptimizerIndexPolicy Index) {
        this.Index = Index;
    }

    /**
     * Get SmartOptimizerChangeTablePolicy
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChangeTable SmartOptimizerChangeTablePolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartOptimizerChangeTablePolicy getChangeTable() {
        return this.ChangeTable;
    }

    /**
     * Set SmartOptimizerChangeTablePolicy
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChangeTable SmartOptimizerChangeTablePolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChangeTable(SmartOptimizerChangeTablePolicy ChangeTable) {
        this.ChangeTable = ChangeTable;
    }

    public SmartOptimizerPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartOptimizerPolicy(SmartOptimizerPolicy source) {
        if (source.Inherit != null) {
            this.Inherit = new String(source.Inherit);
        }
        if (source.Resources != null) {
            this.Resources = new ResourceInfo[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourceInfo(source.Resources[i]);
            }
        }
        if (source.Written != null) {
            this.Written = new SmartOptimizerWrittenPolicy(source.Written);
        }
        if (source.Lifecycle != null) {
            this.Lifecycle = new SmartOptimizerLifecyclePolicy(source.Lifecycle);
        }
        if (source.Index != null) {
            this.Index = new SmartOptimizerIndexPolicy(source.Index);
        }
        if (source.ChangeTable != null) {
            this.ChangeTable = new SmartOptimizerChangeTablePolicy(source.ChangeTable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Inherit", this.Inherit);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "Written.", this.Written);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamObj(map, prefix + "Index.", this.Index);
        this.setParamObj(map, prefix + "ChangeTable.", this.ChangeTable);

    }
}

