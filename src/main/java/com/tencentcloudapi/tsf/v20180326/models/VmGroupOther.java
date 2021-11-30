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

public class VmGroupOther extends AbstractModel{

    /**
    * 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 程序包名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 部署组运行中实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * 部署组中停止实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffInstanceCount")
    @Expose
    private Long OffInstanceCount;

    /**
    * 部署组状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupStatus")
    @Expose
    private String GroupStatus;

    /**
    * 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNotEqualServiceConfig")
    @Expose
    private Boolean IsNotEqualServiceConfig;

    /**
     * Get 部署组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 程序包ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 程序包名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName 程序包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 程序包名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName 程序包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 程序包版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageVersion 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageVersion 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCount 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCount 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 部署组运行中实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunInstanceCount 部署组运行中实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * Set 部署组运行中实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunInstanceCount 部署组运行中实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * Get 部署组中停止实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffInstanceCount 部署组中停止实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffInstanceCount() {
        return this.OffInstanceCount;
    }

    /**
     * Set 部署组中停止实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffInstanceCount 部署组中停止实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffInstanceCount(Long OffInstanceCount) {
        this.OffInstanceCount = OffInstanceCount;
    }

    /**
     * Get 部署组状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupStatus 部署组状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupStatus() {
        return this.GroupStatus;
    }

    /**
     * Set 部署组状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupStatus 部署组状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupStatus(String GroupStatus) {
        this.GroupStatus = GroupStatus;
    }

    /**
     * Get 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNotEqualServiceConfig 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNotEqualServiceConfig() {
        return this.IsNotEqualServiceConfig;
    }

    /**
     * Set 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNotEqualServiceConfig 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNotEqualServiceConfig(Boolean IsNotEqualServiceConfig) {
        this.IsNotEqualServiceConfig = IsNotEqualServiceConfig;
    }

    public VmGroupOther() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VmGroupOther(VmGroupOther source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.RunInstanceCount != null) {
            this.RunInstanceCount = new Long(source.RunInstanceCount);
        }
        if (source.OffInstanceCount != null) {
            this.OffInstanceCount = new Long(source.OffInstanceCount);
        }
        if (source.GroupStatus != null) {
            this.GroupStatus = new String(source.GroupStatus);
        }
        if (source.IsNotEqualServiceConfig != null) {
            this.IsNotEqualServiceConfig = new Boolean(source.IsNotEqualServiceConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "RunInstanceCount", this.RunInstanceCount);
        this.setParamSimple(map, prefix + "OffInstanceCount", this.OffInstanceCount);
        this.setParamSimple(map, prefix + "GroupStatus", this.GroupStatus);
        this.setParamSimple(map, prefix + "IsNotEqualServiceConfig", this.IsNotEqualServiceConfig);

    }
}

