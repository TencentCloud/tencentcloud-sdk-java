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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueFrom extends AbstractModel{

    /**
    * k8s env 的 FieldRef
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldRef")
    @Expose
    private FieldRef FieldRef;

    /**
    * k8s env 的 ResourceFieldRef
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceFieldRef")
    @Expose
    private ResourceFieldRef ResourceFieldRef;

    /**
     * Get k8s env 的 FieldRef
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldRef k8s env 的 FieldRef
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldRef getFieldRef() {
        return this.FieldRef;
    }

    /**
     * Set k8s env 的 FieldRef
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldRef k8s env 的 FieldRef
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldRef(FieldRef FieldRef) {
        this.FieldRef = FieldRef;
    }

    /**
     * Get k8s env 的 ResourceFieldRef
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceFieldRef k8s env 的 ResourceFieldRef
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceFieldRef getResourceFieldRef() {
        return this.ResourceFieldRef;
    }

    /**
     * Set k8s env 的 ResourceFieldRef
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceFieldRef k8s env 的 ResourceFieldRef
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceFieldRef(ResourceFieldRef ResourceFieldRef) {
        this.ResourceFieldRef = ResourceFieldRef;
    }

    public ValueFrom() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueFrom(ValueFrom source) {
        if (source.FieldRef != null) {
            this.FieldRef = new FieldRef(source.FieldRef);
        }
        if (source.ResourceFieldRef != null) {
            this.ResourceFieldRef = new ResourceFieldRef(source.ResourceFieldRef);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FieldRef.", this.FieldRef);
        this.setParamObj(map, prefix + "ResourceFieldRef.", this.ResourceFieldRef);

    }
}

