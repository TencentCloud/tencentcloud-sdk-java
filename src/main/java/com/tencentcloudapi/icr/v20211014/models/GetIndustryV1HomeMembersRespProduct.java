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
package com.tencentcloudapi.icr.v20211014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetIndustryV1HomeMembersRespProduct extends AbstractModel{

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 编辑时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditTime")
    @Expose
    private String EditTime;

    /**
    * 机器人ID（AppKey信息）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * 机器人图标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 行业信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Industry")
    @Expose
    private GetIndustryV1HomeMembersRespIndustry [] Industry;

    /**
    * 操作员列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorList")
    @Expose
    private String OperatorList;

    /**
    * 机器人名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 模板列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateList")
    @Expose
    private String TemplateList;

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 编辑时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditTime 编辑时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEditTime() {
        return this.EditTime;
    }

    /**
     * Set 编辑时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditTime 编辑时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditTime(String EditTime) {
        this.EditTime = EditTime;
    }

    /**
     * Get 机器人ID（AppKey信息）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppKey 机器人ID（AppKey信息）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set 机器人ID（AppKey信息）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppKey 机器人ID（AppKey信息）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get 机器人图标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 机器人图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 机器人图标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 机器人图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 行业信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Industry 行业信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GetIndustryV1HomeMembersRespIndustry [] getIndustry() {
        return this.Industry;
    }

    /**
     * Set 行业信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Industry 行业信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndustry(GetIndustryV1HomeMembersRespIndustry [] Industry) {
        this.Industry = Industry;
    }

    /**
     * Get 操作员列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorList 操作员列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorList() {
        return this.OperatorList;
    }

    /**
     * Set 操作员列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorList 操作员列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorList(String OperatorList) {
        this.OperatorList = OperatorList;
    }

    /**
     * Get 机器人名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 机器人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 机器人名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 机器人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
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
     * Get 模板列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateList 模板列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateList() {
        return this.TemplateList;
    }

    /**
     * Set 模板列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateList 模板列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateList(String TemplateList) {
        this.TemplateList = TemplateList;
    }

    public GetIndustryV1HomeMembersRespProduct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIndustryV1HomeMembersRespProduct(GetIndustryV1HomeMembersRespProduct source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EditTime != null) {
            this.EditTime = new String(source.EditTime);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Industry != null) {
            this.Industry = new GetIndustryV1HomeMembersRespIndustry[source.Industry.length];
            for (int i = 0; i < source.Industry.length; i++) {
                this.Industry[i] = new GetIndustryV1HomeMembersRespIndustry(source.Industry[i]);
            }
        }
        if (source.OperatorList != null) {
            this.OperatorList = new String(source.OperatorList);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TemplateList != null) {
            this.TemplateList = new String(source.TemplateList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EditTime", this.EditTime);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamArrayObj(map, prefix + "Industry.", this.Industry);
        this.setParamSimple(map, prefix + "OperatorList", this.OperatorList);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TemplateList", this.TemplateList);

    }
}

