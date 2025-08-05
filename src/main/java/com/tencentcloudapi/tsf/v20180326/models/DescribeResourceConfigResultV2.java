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

public class DescribeResourceConfigResultV2 extends AbstractModel {

    /**
    * STS参数配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sts")
    @Expose
    private DescribeResourceConfigSts Sts;

    /**
    * 许可信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("License")
    @Expose
    private DescribeResourceConfigLicense License;

    /**
    * 部署组相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Group")
    @Expose
    private GroupResourceConfig Group;

    /**
    * 实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instance")
    @Expose
    private InstanceResourceConfig Instance;

    /**
    * Cluster相关配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cluster")
    @Expose
    private DescribeResourceConfigCluster Cluster;

    /**
    * 程序包相关配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Package")
    @Expose
    private PackageConfig Package;

    /**
     * Get STS参数配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sts STS参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeResourceConfigSts getSts() {
        return this.Sts;
    }

    /**
     * Set STS参数配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sts STS参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSts(DescribeResourceConfigSts Sts) {
        this.Sts = Sts;
    }

    /**
     * Get 许可信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return License 许可信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeResourceConfigLicense getLicense() {
        return this.License;
    }

    /**
     * Set 许可信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param License 许可信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicense(DescribeResourceConfigLicense License) {
        this.License = License;
    }

    /**
     * Get 部署组相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Group 部署组相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupResourceConfig getGroup() {
        return this.Group;
    }

    /**
     * Set 部署组相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Group 部署组相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroup(GroupResourceConfig Group) {
        this.Group = Group;
    }

    /**
     * Get 实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instance 实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceResourceConfig getInstance() {
        return this.Instance;
    }

    /**
     * Set 实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instance 实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstance(InstanceResourceConfig Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Cluster相关配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cluster Cluster相关配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeResourceConfigCluster getCluster() {
        return this.Cluster;
    }

    /**
     * Set Cluster相关配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cluster Cluster相关配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCluster(DescribeResourceConfigCluster Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 程序包相关配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Package 程序包相关配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PackageConfig getPackage() {
        return this.Package;
    }

    /**
     * Set 程序包相关配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Package 程序包相关配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackage(PackageConfig Package) {
        this.Package = Package;
    }

    public DescribeResourceConfigResultV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceConfigResultV2(DescribeResourceConfigResultV2 source) {
        if (source.Sts != null) {
            this.Sts = new DescribeResourceConfigSts(source.Sts);
        }
        if (source.License != null) {
            this.License = new DescribeResourceConfigLicense(source.License);
        }
        if (source.Group != null) {
            this.Group = new GroupResourceConfig(source.Group);
        }
        if (source.Instance != null) {
            this.Instance = new InstanceResourceConfig(source.Instance);
        }
        if (source.Cluster != null) {
            this.Cluster = new DescribeResourceConfigCluster(source.Cluster);
        }
        if (source.Package != null) {
            this.Package = new PackageConfig(source.Package);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Sts.", this.Sts);
        this.setParamObj(map, prefix + "License.", this.License);
        this.setParamObj(map, prefix + "Group.", this.Group);
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamObj(map, prefix + "Cluster.", this.Cluster);
        this.setParamObj(map, prefix + "Package.", this.Package);

    }
}

