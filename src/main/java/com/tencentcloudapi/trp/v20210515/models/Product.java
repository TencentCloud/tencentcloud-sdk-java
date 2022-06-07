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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Product extends AbstractModel{

    /**
    * 商品id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 企业id
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 商户标识码
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 商品编号
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 商品名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 商品规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 商品图片
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logo")
    @Expose
    private String [] Logo;

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
    * 预留字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private Ext Ext;

    /**
    * 商户名称
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
     * Get 商品id 
     * @return ProductId 商品id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 商品id
     * @param ProductId 商品id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 企业id 
     * @return CorpId 企业id
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业id
     * @param CorpId 企业id
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 商户标识码 
     * @return MerchantId 商户标识码
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户标识码
     * @param MerchantId 商户标识码
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 商品编号 
     * @return ProductCode 商品编号
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 商品编号
     * @param ProductCode 商品编号
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 商品名称 
     * @return Name 商品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 商品名称
     * @param Name 商品名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 商品规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Specification 商品规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 商品规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Specification 商品规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 商品图片
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logo 商品图片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLogo() {
        return this.Logo;
    }

    /**
     * Set 商品图片
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logo 商品图片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogo(String [] Logo) {
        this.Logo = Logo;
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
     * Get 预留字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext 预留字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ext getExt() {
        return this.Ext;
    }

    /**
     * Set 预留字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext 预留字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExt(Ext Ext) {
        this.Ext = Ext;
    }

    /**
     * Get 商户名称 
     * @return MerchantName 商户名称
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名称
     * @param MerchantName 商户名称
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    public Product() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Product(Product source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Logo != null) {
            this.Logo = new String[source.Logo.length];
            for (int i = 0; i < source.Logo.length; i++) {
                this.Logo[i] = new String(source.Logo[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Ext != null) {
            this.Ext = new Ext(source.Ext);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "Logo.", this.Logo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Ext.", this.Ext);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);

    }
}

