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

public class OverviewBasicResourceUsage extends AbstractModel{

    /**
    * 应用总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationCount")
    @Expose
    private Long ApplicationCount;

    /**
    * 命名空间总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceCount")
    @Expose
    private Long NamespaceCount;

    /**
    * 部署组个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupCount")
    @Expose
    private Long GroupCount;

    /**
    * 程序包存储空间用量，单位字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageSpaceUsed")
    @Expose
    private Long PackageSpaceUsed;

    /**
    * 已注册实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsulInstanceCount")
    @Expose
    private Long ConsulInstanceCount;

    /**
     * Get 应用总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationCount 应用总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApplicationCount() {
        return this.ApplicationCount;
    }

    /**
     * Set 应用总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationCount 应用总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationCount(Long ApplicationCount) {
        this.ApplicationCount = ApplicationCount;
    }

    /**
     * Get 命名空间总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceCount 命名空间总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNamespaceCount() {
        return this.NamespaceCount;
    }

    /**
     * Set 命名空间总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceCount 命名空间总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceCount(Long NamespaceCount) {
        this.NamespaceCount = NamespaceCount;
    }

    /**
     * Get 部署组个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupCount 部署组个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupCount() {
        return this.GroupCount;
    }

    /**
     * Set 部署组个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupCount 部署组个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupCount(Long GroupCount) {
        this.GroupCount = GroupCount;
    }

    /**
     * Get 程序包存储空间用量，单位字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageSpaceUsed 程序包存储空间用量，单位字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPackageSpaceUsed() {
        return this.PackageSpaceUsed;
    }

    /**
     * Set 程序包存储空间用量，单位字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageSpaceUsed 程序包存储空间用量，单位字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageSpaceUsed(Long PackageSpaceUsed) {
        this.PackageSpaceUsed = PackageSpaceUsed;
    }

    /**
     * Get 已注册实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsulInstanceCount 已注册实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConsulInstanceCount() {
        return this.ConsulInstanceCount;
    }

    /**
     * Set 已注册实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsulInstanceCount 已注册实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsulInstanceCount(Long ConsulInstanceCount) {
        this.ConsulInstanceCount = ConsulInstanceCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationCount", this.ApplicationCount);
        this.setParamSimple(map, prefix + "NamespaceCount", this.NamespaceCount);
        this.setParamSimple(map, prefix + "GroupCount", this.GroupCount);
        this.setParamSimple(map, prefix + "PackageSpaceUsed", this.PackageSpaceUsed);
        this.setParamSimple(map, prefix + "ConsulInstanceCount", this.ConsulInstanceCount);

    }
}

