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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceType extends AbstractModel {

    /**
    * 设备类型编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 设备类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 父设备类型编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentCode")
    @Expose
    private String ParentCode;

    /**
    * 父设备类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentName")
    @Expose
    private String ParentName;

    /**
    * 是否子系统，1是

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSubsystem")
    @Expose
    private Long IsSubsystem;

    /**
     * Get 设备类型编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 设备类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 设备类型编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 设备类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 设备类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 设备类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 设备类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 父设备类型编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentCode 父设备类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentCode() {
        return this.ParentCode;
    }

    /**
     * Set 父设备类型编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentCode 父设备类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentCode(String ParentCode) {
        this.ParentCode = ParentCode;
    }

    /**
     * Get 父设备类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentName 父设备类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentName() {
        return this.ParentName;
    }

    /**
     * Set 父设备类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentName 父设备类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentName(String ParentName) {
        this.ParentName = ParentName;
    }

    /**
     * Get 是否子系统，1是

注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSubsystem 是否子系统，1是

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSubsystem() {
        return this.IsSubsystem;
    }

    /**
     * Set 是否子系统，1是

注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSubsystem 是否子系统，1是

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSubsystem(Long IsSubsystem) {
        this.IsSubsystem = IsSubsystem;
    }

    public DeviceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceType(DeviceType source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentCode != null) {
            this.ParentCode = new String(source.ParentCode);
        }
        if (source.ParentName != null) {
            this.ParentName = new String(source.ParentName);
        }
        if (source.IsSubsystem != null) {
            this.IsSubsystem = new Long(source.IsSubsystem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentCode", this.ParentCode);
        this.setParamSimple(map, prefix + "ParentName", this.ParentName);
        this.setParamSimple(map, prefix + "IsSubsystem", this.IsSubsystem);

    }
}

