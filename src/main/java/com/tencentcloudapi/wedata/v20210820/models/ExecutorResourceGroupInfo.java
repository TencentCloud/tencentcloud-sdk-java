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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutorResourceGroupInfo extends AbstractModel {

    /**
    * 执行组id, 仅更新资源时需要传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 执行组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * 执行组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupDesc")
    @Expose
    private String ExecutorGroupDesc;

    /**
    * SCHEDULER （标准调度资源组），CUSTOM_SCHEDULER （自定义调度资源），INTEGRATION（集成资源组），DATA_SERVICE（数据服务资源组）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorResourceType")
    @Expose
    private Long ExecutorResourceType;

    /**
    * 区域中文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * vpcId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * subnetId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 基础资源包，资源组至少包含一个基础资源包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicResourcePackage")
    @Expose
    private ExecutorResourcePackageInfo BasicResourcePackage;

    /**
    * 增强资源包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvanceResourcePackage")
    @Expose
    private ExecutorResourcePackageInfo AdvanceResourcePackage;

    /**
    * 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 区域英文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionEn")
    @Expose
    private String RegionEn;

    /**
    * 区域Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * 资源组关联项目数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociateProjectNums")
    @Expose
    private Long AssociateProjectNums;

    /**
    * 是否锁定，false为未锁定，true为锁定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLocked")
    @Expose
    private Boolean IsLocked;

    /**
    * 来源类型，0为系统默认，1为自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 队列资源包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MQPackageVO")
    @Expose
    private MQPackageVO MQPackageVO;

    /**
    * 是否首选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstChoice")
    @Expose
    private Boolean FirstChoice;

    /**
    * 资源组python版本绑定详情
    */
    @SerializedName("PythonSubVersions")
    @Expose
    private String [] PythonSubVersions;

    /**
     * Get 执行组id, 仅更新资源时需要传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupId 执行组id, 仅更新资源时需要传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 执行组id, 仅更新资源时需要传
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupId 执行组id, 仅更新资源时需要传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 执行组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupName 执行组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set 执行组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupName 执行组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get 执行组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupDesc 执行组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupDesc() {
        return this.ExecutorGroupDesc;
    }

    /**
     * Set 执行组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupDesc 执行组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupDesc(String ExecutorGroupDesc) {
        this.ExecutorGroupDesc = ExecutorGroupDesc;
    }

    /**
     * Get SCHEDULER （标准调度资源组），CUSTOM_SCHEDULER （自定义调度资源），INTEGRATION（集成资源组），DATA_SERVICE（数据服务资源组）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorResourceType SCHEDULER （标准调度资源组），CUSTOM_SCHEDULER （自定义调度资源），INTEGRATION（集成资源组），DATA_SERVICE（数据服务资源组）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutorResourceType() {
        return this.ExecutorResourceType;
    }

    /**
     * Set SCHEDULER （标准调度资源组），CUSTOM_SCHEDULER （自定义调度资源），INTEGRATION（集成资源组），DATA_SERVICE（数据服务资源组）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorResourceType SCHEDULER （标准调度资源组），CUSTOM_SCHEDULER （自定义调度资源），INTEGRATION（集成资源组），DATA_SERVICE（数据服务资源组）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorResourceType(Long ExecutorResourceType) {
        this.ExecutorResourceType = ExecutorResourceType;
    }

    /**
     * Get 区域中文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 区域中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域中文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 区域中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get vpcId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpcId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpcId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get subnetId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId subnetId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set subnetId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId subnetId, 托管服务时需要传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 基础资源包，资源组至少包含一个基础资源包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicResourcePackage 基础资源包，资源组至少包含一个基础资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExecutorResourcePackageInfo getBasicResourcePackage() {
        return this.BasicResourcePackage;
    }

    /**
     * Set 基础资源包，资源组至少包含一个基础资源包
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicResourcePackage 基础资源包，资源组至少包含一个基础资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicResourcePackage(ExecutorResourcePackageInfo BasicResourcePackage) {
        this.BasicResourcePackage = BasicResourcePackage;
    }

    /**
     * Get 增强资源包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvanceResourcePackage 增强资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExecutorResourcePackageInfo getAdvanceResourcePackage() {
        return this.AdvanceResourcePackage;
    }

    /**
     * Set 增强资源包
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvanceResourcePackage 增强资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvanceResourcePackage(ExecutorResourcePackageInfo AdvanceResourcePackage) {
        this.AdvanceResourcePackage = AdvanceResourcePackage;
    }

    /**
     * Get 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 区域英文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionEn 区域英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionEn() {
        return this.RegionEn;
    }

    /**
     * Set 区域英文
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionEn 区域英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionEn(String RegionEn) {
        this.RegionEn = RegionEn;
    }

    /**
     * Get 区域Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 区域Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 区域Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectDisplayName 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectDisplayName() {
        return this.ProjectDisplayName;
    }

    /**
     * Set 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectDisplayName 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectDisplayName(String ProjectDisplayName) {
        this.ProjectDisplayName = ProjectDisplayName;
    }

    /**
     * Get 资源组关联项目数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociateProjectNums 资源组关联项目数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssociateProjectNums() {
        return this.AssociateProjectNums;
    }

    /**
     * Set 资源组关联项目数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociateProjectNums 资源组关联项目数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociateProjectNums(Long AssociateProjectNums) {
        this.AssociateProjectNums = AssociateProjectNums;
    }

    /**
     * Get 是否锁定，false为未锁定，true为锁定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLocked 是否锁定，false为未锁定，true为锁定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLocked() {
        return this.IsLocked;
    }

    /**
     * Set 是否锁定，false为未锁定，true为锁定
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLocked 是否锁定，false为未锁定，true为锁定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLocked(Boolean IsLocked) {
        this.IsLocked = IsLocked;
    }

    /**
     * Get 来源类型，0为系统默认，1为自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 来源类型，0为系统默认，1为自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 来源类型，0为系统默认，1为自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 来源类型，0为系统默认，1为自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 队列资源包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MQPackageVO 队列资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MQPackageVO getMQPackageVO() {
        return this.MQPackageVO;
    }

    /**
     * Set 队列资源包
注意：此字段可能返回 null，表示取不到有效值。
     * @param MQPackageVO 队列资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMQPackageVO(MQPackageVO MQPackageVO) {
        this.MQPackageVO = MQPackageVO;
    }

    /**
     * Get 是否首选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstChoice 是否首选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getFirstChoice() {
        return this.FirstChoice;
    }

    /**
     * Set 是否首选
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstChoice 是否首选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstChoice(Boolean FirstChoice) {
        this.FirstChoice = FirstChoice;
    }

    /**
     * Get 资源组python版本绑定详情 
     * @return PythonSubVersions 资源组python版本绑定详情
     */
    public String [] getPythonSubVersions() {
        return this.PythonSubVersions;
    }

    /**
     * Set 资源组python版本绑定详情
     * @param PythonSubVersions 资源组python版本绑定详情
     */
    public void setPythonSubVersions(String [] PythonSubVersions) {
        this.PythonSubVersions = PythonSubVersions;
    }

    public ExecutorResourceGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutorResourceGroupInfo(ExecutorResourceGroupInfo source) {
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.ExecutorGroupDesc != null) {
            this.ExecutorGroupDesc = new String(source.ExecutorGroupDesc);
        }
        if (source.ExecutorResourceType != null) {
            this.ExecutorResourceType = new Long(source.ExecutorResourceType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.BasicResourcePackage != null) {
            this.BasicResourcePackage = new ExecutorResourcePackageInfo(source.BasicResourcePackage);
        }
        if (source.AdvanceResourcePackage != null) {
            this.AdvanceResourcePackage = new ExecutorResourcePackageInfo(source.AdvanceResourcePackage);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.RegionEn != null) {
            this.RegionEn = new String(source.RegionEn);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectDisplayName != null) {
            this.ProjectDisplayName = new String(source.ProjectDisplayName);
        }
        if (source.AssociateProjectNums != null) {
            this.AssociateProjectNums = new Long(source.AssociateProjectNums);
        }
        if (source.IsLocked != null) {
            this.IsLocked = new Boolean(source.IsLocked);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.MQPackageVO != null) {
            this.MQPackageVO = new MQPackageVO(source.MQPackageVO);
        }
        if (source.FirstChoice != null) {
            this.FirstChoice = new Boolean(source.FirstChoice);
        }
        if (source.PythonSubVersions != null) {
            this.PythonSubVersions = new String[source.PythonSubVersions.length];
            for (int i = 0; i < source.PythonSubVersions.length; i++) {
                this.PythonSubVersions[i] = new String(source.PythonSubVersions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamSimple(map, prefix + "ExecutorGroupDesc", this.ExecutorGroupDesc);
        this.setParamSimple(map, prefix + "ExecutorResourceType", this.ExecutorResourceType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "BasicResourcePackage.", this.BasicResourcePackage);
        this.setParamObj(map, prefix + "AdvanceResourcePackage.", this.AdvanceResourcePackage);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "RegionEn", this.RegionEn);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "AssociateProjectNums", this.AssociateProjectNums);
        this.setParamSimple(map, prefix + "IsLocked", this.IsLocked);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamObj(map, prefix + "MQPackageVO.", this.MQPackageVO);
        this.setParamSimple(map, prefix + "FirstChoice", this.FirstChoice);
        this.setParamArraySimple(map, prefix + "PythonSubVersions.", this.PythonSubVersions);

    }
}

