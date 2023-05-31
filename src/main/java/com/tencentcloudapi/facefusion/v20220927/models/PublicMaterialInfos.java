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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicMaterialInfos extends AbstractModel{

    /**
    * 素材Id
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 素材状态
    */
    @SerializedName("MaterialStatus")
    @Expose
    private Long MaterialStatus;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 人脸信息
    */
    @SerializedName("MaterialFaceList")
    @Expose
    private MaterialFaces [] MaterialFaceList;

    /**
    * 素材名
    */
    @SerializedName("MaterialName")
    @Expose
    private String MaterialName;

    /**
    * 审核原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditResult")
    @Expose
    private String AuditResult;

    /**
     * Get 素材Id 
     * @return MaterialId 素材Id
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 素材Id
     * @param MaterialId 素材Id
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 素材状态 
     * @return MaterialStatus 素材状态
     */
    public Long getMaterialStatus() {
        return this.MaterialStatus;
    }

    /**
     * Set 素材状态
     * @param MaterialStatus 素材状态
     */
    public void setMaterialStatus(Long MaterialStatus) {
        this.MaterialStatus = MaterialStatus;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 人脸信息 
     * @return MaterialFaceList 人脸信息
     */
    public MaterialFaces [] getMaterialFaceList() {
        return this.MaterialFaceList;
    }

    /**
     * Set 人脸信息
     * @param MaterialFaceList 人脸信息
     */
    public void setMaterialFaceList(MaterialFaces [] MaterialFaceList) {
        this.MaterialFaceList = MaterialFaceList;
    }

    /**
     * Get 素材名 
     * @return MaterialName 素材名
     */
    public String getMaterialName() {
        return this.MaterialName;
    }

    /**
     * Set 素材名
     * @param MaterialName 素材名
     */
    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    /**
     * Get 审核原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditResult 审核原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuditResult() {
        return this.AuditResult;
    }

    /**
     * Set 审核原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditResult 审核原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditResult(String AuditResult) {
        this.AuditResult = AuditResult;
    }

    public PublicMaterialInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicMaterialInfos(PublicMaterialInfos source) {
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.MaterialStatus != null) {
            this.MaterialStatus = new Long(source.MaterialStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MaterialFaceList != null) {
            this.MaterialFaceList = new MaterialFaces[source.MaterialFaceList.length];
            for (int i = 0; i < source.MaterialFaceList.length; i++) {
                this.MaterialFaceList[i] = new MaterialFaces(source.MaterialFaceList[i]);
            }
        }
        if (source.MaterialName != null) {
            this.MaterialName = new String(source.MaterialName);
        }
        if (source.AuditResult != null) {
            this.AuditResult = new String(source.AuditResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "MaterialStatus", this.MaterialStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "MaterialFaceList.", this.MaterialFaceList);
        this.setParamSimple(map, prefix + "MaterialName", this.MaterialName);
        this.setParamSimple(map, prefix + "AuditResult", this.AuditResult);

    }
}

