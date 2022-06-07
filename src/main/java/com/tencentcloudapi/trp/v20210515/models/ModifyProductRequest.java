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

public class ModifyProductRequest extends AbstractModel{

    /**
    * 商品名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 商品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 商品规格
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 商品图片
    */
    @SerializedName("Logo")
    @Expose
    private String [] Logo;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 预留字段
    */
    @SerializedName("Ext")
    @Expose
    private Ext Ext;

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
     * Get 商品ID 
     * @return ProductId 商品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 商品ID
     * @param ProductId 商品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 商品规格 
     * @return Specification 商品规格
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 商品规格
     * @param Specification 商品规格
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 商品图片 
     * @return Logo 商品图片
     */
    public String [] getLogo() {
        return this.Logo;
    }

    /**
     * Set 商品图片
     * @param Logo 商品图片
     */
    public void setLogo(String [] Logo) {
        this.Logo = Logo;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 预留字段 
     * @return Ext 预留字段
     */
    public Ext getExt() {
        return this.Ext;
    }

    /**
     * Set 预留字段
     * @param Ext 预留字段
     */
    public void setExt(Ext Ext) {
        this.Ext = Ext;
    }

    public ModifyProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProductRequest(ModifyProductRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Logo != null) {
            this.Logo = new String[source.Logo.length];
            for (int i = 0; i < source.Logo.length; i++) {
                this.Logo[i] = new String(source.Logo[i]);
            }
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.Ext != null) {
            this.Ext = new Ext(source.Ext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamArraySimple(map, prefix + "Logo.", this.Logo);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamObj(map, prefix + "Ext.", this.Ext);

    }
}

