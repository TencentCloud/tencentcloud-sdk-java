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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagInstance extends AbstractModel{

    /**
    * 标签Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 标签Value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 实例个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceSum")
    @Expose
    private Long InstanceSum;

    /**
    * 产品类型，如：cvm
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 绑定状态，2：绑定成功，1：绑定中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindingStatus")
    @Expose
    private Long BindingStatus;

    /**
    * 标签状态，2：标签存在，1：标签不存在
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagStatus")
    @Expose
    private Long TagStatus;

    /**
     * Get 标签Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 标签Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 标签Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 标签Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 标签Value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 标签Value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 标签Value
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 标签Value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 实例个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceSum 实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceSum() {
        return this.InstanceSum;
    }

    /**
     * Set 实例个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceSum 实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceSum(Long InstanceSum) {
        this.InstanceSum = InstanceSum;
    }

    /**
     * Get 产品类型，如：cvm
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType 产品类型，如：cvm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 产品类型，如：cvm
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType 产品类型，如：cvm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 绑定状态，2：绑定成功，1：绑定中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindingStatus 绑定状态，2：绑定成功，1：绑定中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBindingStatus() {
        return this.BindingStatus;
    }

    /**
     * Set 绑定状态，2：绑定成功，1：绑定中
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindingStatus 绑定状态，2：绑定成功，1：绑定中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindingStatus(Long BindingStatus) {
        this.BindingStatus = BindingStatus;
    }

    /**
     * Get 标签状态，2：标签存在，1：标签不存在
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagStatus 标签状态，2：标签存在，1：标签不存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTagStatus() {
        return this.TagStatus;
    }

    /**
     * Set 标签状态，2：标签存在，1：标签不存在
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagStatus 标签状态，2：标签存在，1：标签不存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagStatus(Long TagStatus) {
        this.TagStatus = TagStatus;
    }

    public TagInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagInstance(TagInstance source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.InstanceSum != null) {
            this.InstanceSum = new Long(source.InstanceSum);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.BindingStatus != null) {
            this.BindingStatus = new Long(source.BindingStatus);
        }
        if (source.TagStatus != null) {
            this.TagStatus = new Long(source.TagStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "InstanceSum", this.InstanceSum);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "BindingStatus", this.BindingStatus);
        this.setParamSimple(map, prefix + "TagStatus", this.TagStatus);

    }
}

