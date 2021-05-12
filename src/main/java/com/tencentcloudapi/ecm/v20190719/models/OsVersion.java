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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OsVersion extends AbstractModel{

    /**
    * 操作系统类型
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 支持的操作系统版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsVersions")
    @Expose
    private String [] OsVersions;

    /**
    * 支持的操作系统架构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Architecture")
    @Expose
    private String [] Architecture;

    /**
     * Get 操作系统类型 
     * @return OsName 操作系统类型
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统类型
     * @param OsName 操作系统类型
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 支持的操作系统版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsVersions 支持的操作系统版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOsVersions() {
        return this.OsVersions;
    }

    /**
     * Set 支持的操作系统版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsVersions 支持的操作系统版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsVersions(String [] OsVersions) {
        this.OsVersions = OsVersions;
    }

    /**
     * Get 支持的操作系统架构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Architecture 支持的操作系统架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 支持的操作系统架构
注意：此字段可能返回 null，表示取不到有效值。
     * @param Architecture 支持的操作系统架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArchitecture(String [] Architecture) {
        this.Architecture = Architecture;
    }

    public OsVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OsVersion(OsVersion source) {
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.OsVersions != null) {
            this.OsVersions = new String[source.OsVersions.length];
            for (int i = 0; i < source.OsVersions.length; i++) {
                this.OsVersions[i] = new String(source.OsVersions[i]);
            }
        }
        if (source.Architecture != null) {
            this.Architecture = new String[source.Architecture.length];
            for (int i = 0; i < source.Architecture.length; i++) {
                this.Architecture[i] = new String(source.Architecture[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamArraySimple(map, prefix + "OsVersions.", this.OsVersions);
        this.setParamArraySimple(map, prefix + "Architecture.", this.Architecture);

    }
}

