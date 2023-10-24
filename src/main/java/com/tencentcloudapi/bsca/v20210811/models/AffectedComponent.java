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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AffectedComponent extends AbstractModel {

    /**
    * 受漏洞影响的组件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 受漏洞影响的版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectedVersionList")
    @Expose
    private String [] AffectedVersionList;

    /**
    * 修复此漏洞的版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixedVersionList")
    @Expose
    private String [] FixedVersionList;

    /**
     * Get 受漏洞影响的组件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 受漏洞影响的组件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 受漏洞影响的组件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 受漏洞影响的组件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 受漏洞影响的版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectedVersionList 受漏洞影响的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAffectedVersionList() {
        return this.AffectedVersionList;
    }

    /**
     * Set 受漏洞影响的版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectedVersionList 受漏洞影响的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectedVersionList(String [] AffectedVersionList) {
        this.AffectedVersionList = AffectedVersionList;
    }

    /**
     * Get 修复此漏洞的版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixedVersionList 修复此漏洞的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFixedVersionList() {
        return this.FixedVersionList;
    }

    /**
     * Set 修复此漏洞的版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixedVersionList 修复此漏洞的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixedVersionList(String [] FixedVersionList) {
        this.FixedVersionList = FixedVersionList;
    }

    public AffectedComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AffectedComponent(AffectedComponent source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AffectedVersionList != null) {
            this.AffectedVersionList = new String[source.AffectedVersionList.length];
            for (int i = 0; i < source.AffectedVersionList.length; i++) {
                this.AffectedVersionList[i] = new String(source.AffectedVersionList[i]);
            }
        }
        if (source.FixedVersionList != null) {
            this.FixedVersionList = new String[source.FixedVersionList.length];
            for (int i = 0; i < source.FixedVersionList.length; i++) {
                this.FixedVersionList[i] = new String(source.FixedVersionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "AffectedVersionList.", this.AffectedVersionList);
        this.setParamArraySimple(map, prefix + "FixedVersionList.", this.FixedVersionList);

    }
}

