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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowDetail extends AbstractModel {

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 工作流类型，cycle和manual
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * 工作流参数数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowParams")
    @Expose
    private ParamInfo [] WorkflowParams;

    /**
    * 统一调度参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowSchedulerConfiguration")
    @Expose
    private WorkflowSchedulerConfiguration WorkflowSchedulerConfiguration;

    /**
    * 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * 工作流所属路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * BundleId项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * BundleInfo项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 责任人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin 创建人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin 创建人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 工作流类型，cycle和manual
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowType 工作流类型，cycle和manual
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set 工作流类型，cycle和manual
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowType 工作流类型，cycle和manual
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get 工作流参数数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowParams 工作流参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfo [] getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set 工作流参数数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowParams 工作流参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowParams(ParamInfo [] WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get 统一调度参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowSchedulerConfiguration 统一调度参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowSchedulerConfiguration getWorkflowSchedulerConfiguration() {
        return this.WorkflowSchedulerConfiguration;
    }

    /**
     * Set 统一调度参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowSchedulerConfiguration 统一调度参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowSchedulerConfiguration(WorkflowSchedulerConfiguration WorkflowSchedulerConfiguration) {
        this.WorkflowSchedulerConfiguration = WorkflowSchedulerConfiguration;
    }

    /**
     * Get 工作流描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get 工作流所属路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 工作流所属路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 工作流所属路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 工作流所属路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get BundleId项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId BundleId项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set BundleId项
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId BundleId项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get BundleInfo项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo BundleInfo项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set BundleInfo项
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo BundleInfo项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public WorkflowDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowDetail(WorkflowDetail source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new ParamInfo[source.WorkflowParams.length];
            for (int i = 0; i < source.WorkflowParams.length; i++) {
                this.WorkflowParams[i] = new ParamInfo(source.WorkflowParams[i]);
            }
        }
        if (source.WorkflowSchedulerConfiguration != null) {
            this.WorkflowSchedulerConfiguration = new WorkflowSchedulerConfiguration(source.WorkflowSchedulerConfiguration);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamArrayObj(map, prefix + "WorkflowParams.", this.WorkflowParams);
        this.setParamObj(map, prefix + "WorkflowSchedulerConfiguration.", this.WorkflowSchedulerConfiguration);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

