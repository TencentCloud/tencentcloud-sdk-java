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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueFrom extends AbstractModel {

    /**
    * k8s env 的 FieldRef
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
    * k8s env的configMapKeyRef
    */
    @SerializedName("ConfigMapKeyRef")
    @Expose
    private CommonRef ConfigMapKeyRef;

    /**
    * k8s env 的 secretKeyRef
    */
    @SerializedName("SecretKeyRef")
    @Expose
    private CommonRef SecretKeyRef;

    /**
     * Get k8s env 的 FieldRef 
     * @return FieldRef k8s env 的 FieldRef
     */
    public FieldRef getFieldRef() {
        return this.FieldRef;
    }

    /**
     * Set k8s env 的 FieldRef
     * @param FieldRef k8s env 的 FieldRef
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

    /**
     * Get k8s env的configMapKeyRef 
     * @return ConfigMapKeyRef k8s env的configMapKeyRef
     */
    public CommonRef getConfigMapKeyRef() {
        return this.ConfigMapKeyRef;
    }

    /**
     * Set k8s env的configMapKeyRef
     * @param ConfigMapKeyRef k8s env的configMapKeyRef
     */
    public void setConfigMapKeyRef(CommonRef ConfigMapKeyRef) {
        this.ConfigMapKeyRef = ConfigMapKeyRef;
    }

    /**
     * Get k8s env 的 secretKeyRef 
     * @return SecretKeyRef k8s env 的 secretKeyRef
     */
    public CommonRef getSecretKeyRef() {
        return this.SecretKeyRef;
    }

    /**
     * Set k8s env 的 secretKeyRef
     * @param SecretKeyRef k8s env 的 secretKeyRef
     */
    public void setSecretKeyRef(CommonRef SecretKeyRef) {
        this.SecretKeyRef = SecretKeyRef;
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
        if (source.ConfigMapKeyRef != null) {
            this.ConfigMapKeyRef = new CommonRef(source.ConfigMapKeyRef);
        }
        if (source.SecretKeyRef != null) {
            this.SecretKeyRef = new CommonRef(source.SecretKeyRef);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FieldRef.", this.FieldRef);
        this.setParamObj(map, prefix + "ResourceFieldRef.", this.ResourceFieldRef);
        this.setParamObj(map, prefix + "ConfigMapKeyRef.", this.ConfigMapKeyRef);
        this.setParamObj(map, prefix + "SecretKeyRef.", this.SecretKeyRef);

    }
}

