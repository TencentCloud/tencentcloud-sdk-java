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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationTemplate extends AbstractModel{

    /**
    * 模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 来源。1 自定义应用模板 ;  2 官方应用模板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 应用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadKind")
    @Expose
    private String WorkloadKind;

    /**
    * 管理地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManageUrl")
    @Expose
    private String ManageUrl;

    /**
    * 发布时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DistributeTime")
    @Expose
    private String DistributeTime;

    /**
     * Get 模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 来源。1 自定义应用模板 ;  2 官方应用模板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 来源。1 自定义应用模板 ;  2 官方应用模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 来源。1 自定义应用模板 ;  2 官方应用模板
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 来源。1 自定义应用模板 ;  2 官方应用模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 应用类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadKind 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkloadKind() {
        return this.WorkloadKind;
    }

    /**
     * Set 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadKind 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadKind(String WorkloadKind) {
        this.WorkloadKind = WorkloadKind;
    }

    /**
     * Get 管理地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManageUrl 管理地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManageUrl() {
        return this.ManageUrl;
    }

    /**
     * Set 管理地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManageUrl 管理地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManageUrl(String ManageUrl) {
        this.ManageUrl = ManageUrl;
    }

    /**
     * Get 发布时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DistributeTime 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDistributeTime() {
        return this.DistributeTime;
    }

    /**
     * Set 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DistributeTime 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistributeTime(String DistributeTime) {
        this.DistributeTime = DistributeTime;
    }

    public ApplicationTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationTemplate(ApplicationTemplate source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.WorkloadKind != null) {
            this.WorkloadKind = new String(source.WorkloadKind);
        }
        if (source.ManageUrl != null) {
            this.ManageUrl = new String(source.ManageUrl);
        }
        if (source.DistributeTime != null) {
            this.DistributeTime = new String(source.DistributeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "WorkloadKind", this.WorkloadKind);
        this.setParamSimple(map, prefix + "ManageUrl", this.ManageUrl);
        this.setParamSimple(map, prefix + "DistributeTime", this.DistributeTime);

    }
}

