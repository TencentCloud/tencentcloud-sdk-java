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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteListData extends AbstractModel{

    /**
    * 白名单id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhiteListId")
    @Expose
    private Long WhiteListId;

    /**
    * 企业id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 资产类型：0-网站 1-app 2-公众号 3-小程序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetsType")
    @Expose
    private Long AssetsType;

    /**
    * 白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhiteList")
    @Expose
    private String WhiteList;

    /**
    * 新增时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
     * Get 白名单id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhiteListId 白名单id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWhiteListId() {
        return this.WhiteListId;
    }

    /**
     * Set 白名单id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhiteListId 白名单id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhiteListId(Long WhiteListId) {
        this.WhiteListId = WhiteListId;
    }

    /**
     * Get 企业id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyId 企业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 企业id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyId 企业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 品牌名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 资产类型：0-网站 1-app 2-公众号 3-小程序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetsType 资产类型：0-网站 1-app 2-公众号 3-小程序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetsType() {
        return this.AssetsType;
    }

    /**
     * Set 资产类型：0-网站 1-app 2-公众号 3-小程序
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetsType 资产类型：0-网站 1-app 2-公众号 3-小程序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetsType(Long AssetsType) {
        this.AssetsType = AssetsType;
    }

    /**
     * Get 白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhiteList 白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWhiteList() {
        return this.WhiteList;
    }

    /**
     * Set 白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhiteList 白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhiteList(String WhiteList) {
        this.WhiteList = WhiteList;
    }

    /**
     * Get 新增时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 新增时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 新增时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 新增时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    public WhiteListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteListData(WhiteListData source) {
        if (source.WhiteListId != null) {
            this.WhiteListId = new Long(source.WhiteListId);
        }
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.AssetsType != null) {
            this.AssetsType = new Long(source.AssetsType);
        }
        if (source.WhiteList != null) {
            this.WhiteList = new String(source.WhiteList);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhiteListId", this.WhiteListId);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "AssetsType", this.AssetsType);
        this.setParamSimple(map, prefix + "WhiteList", this.WhiteList);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

