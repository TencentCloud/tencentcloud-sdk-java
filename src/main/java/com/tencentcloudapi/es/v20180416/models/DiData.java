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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiData extends AbstractModel {

    /**
    * 数据接入id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiId")
    @Expose
    private String DiId;

    /**
    * 数据接入创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据接入状态，0处理中，1正常，-2删除中，-3已删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * cvm数据源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiDataSourceCvm")
    @Expose
    private DiDataSourceCvm DiDataSourceCvm;

    /**
    * tke数据源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiDataSourceTke")
    @Expose
    private DiDataSourceTke DiDataSourceTke;

    /**
    * serverless目的端信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiDataSinkServerless")
    @Expose
    private DiDataSinkServerless DiDataSinkServerless;

    /**
    * 数据接入类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiDataSourceType")
    @Expose
    private String DiDataSourceType;

    /**
     * Get 数据接入id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiId 数据接入id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiId() {
        return this.DiId;
    }

    /**
     * Set 数据接入id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiId 数据接入id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiId(String DiId) {
        this.DiId = DiId;
    }

    /**
     * Get 数据接入创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 数据接入创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 数据接入创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 数据接入创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据接入状态，0处理中，1正常，-2删除中，-3已删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 数据接入状态，0处理中，1正常，-2删除中，-3已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 数据接入状态，0处理中，1正常，-2删除中，-3已删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 数据接入状态，0处理中，1正常，-2删除中，-3已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get cvm数据源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiDataSourceCvm cvm数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiDataSourceCvm getDiDataSourceCvm() {
        return this.DiDataSourceCvm;
    }

    /**
     * Set cvm数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiDataSourceCvm cvm数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiDataSourceCvm(DiDataSourceCvm DiDataSourceCvm) {
        this.DiDataSourceCvm = DiDataSourceCvm;
    }

    /**
     * Get tke数据源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiDataSourceTke tke数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiDataSourceTke getDiDataSourceTke() {
        return this.DiDataSourceTke;
    }

    /**
     * Set tke数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiDataSourceTke tke数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiDataSourceTke(DiDataSourceTke DiDataSourceTke) {
        this.DiDataSourceTke = DiDataSourceTke;
    }

    /**
     * Get serverless目的端信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiDataSinkServerless serverless目的端信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiDataSinkServerless getDiDataSinkServerless() {
        return this.DiDataSinkServerless;
    }

    /**
     * Set serverless目的端信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiDataSinkServerless serverless目的端信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiDataSinkServerless(DiDataSinkServerless DiDataSinkServerless) {
        this.DiDataSinkServerless = DiDataSinkServerless;
    }

    /**
     * Get 数据接入类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiDataSourceType 数据接入类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiDataSourceType() {
        return this.DiDataSourceType;
    }

    /**
     * Set 数据接入类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiDataSourceType 数据接入类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiDataSourceType(String DiDataSourceType) {
        this.DiDataSourceType = DiDataSourceType;
    }

    public DiData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiData(DiData source) {
        if (source.DiId != null) {
            this.DiId = new String(source.DiId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DiDataSourceCvm != null) {
            this.DiDataSourceCvm = new DiDataSourceCvm(source.DiDataSourceCvm);
        }
        if (source.DiDataSourceTke != null) {
            this.DiDataSourceTke = new DiDataSourceTke(source.DiDataSourceTke);
        }
        if (source.DiDataSinkServerless != null) {
            this.DiDataSinkServerless = new DiDataSinkServerless(source.DiDataSinkServerless);
        }
        if (source.DiDataSourceType != null) {
            this.DiDataSourceType = new String(source.DiDataSourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiId", this.DiId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "DiDataSourceCvm.", this.DiDataSourceCvm);
        this.setParamObj(map, prefix + "DiDataSourceTke.", this.DiDataSourceTke);
        this.setParamObj(map, prefix + "DiDataSinkServerless.", this.DiDataSinkServerless);
        this.setParamSimple(map, prefix + "DiDataSourceType", this.DiDataSourceType);

    }
}

