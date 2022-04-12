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

public class GetIndustryV1HomeMembersRespData extends AbstractModel{

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditTime")
    @Expose
    private Long EditTime;

    /**
    * 功能列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeatureList")
    @Expose
    private GetIndustryV1HomeMembersRespFeature FeatureList;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 用户行业分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndustryType")
    @Expose
    private String IndustryType;

    /**
    * 子用户数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberNum")
    @Expose
    private Long MemberNum;

    /**
    * 机器人列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductList")
    @Expose
    private GetIndustryV1HomeMembersRespProduct ProductList;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 功能列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeList")
    @Expose
    private GetIndustryV1HomeMembersRespType TypeList;

    /**
    * 用户账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAccount")
    @Expose
    private String UserAccount;

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEditTime() {
        return this.EditTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditTime(Long EditTime) {
        this.EditTime = EditTime;
    }

    /**
     * Get 功能列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeatureList 功能列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GetIndustryV1HomeMembersRespFeature getFeatureList() {
        return this.FeatureList;
    }

    /**
     * Set 功能列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeatureList 功能列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeatureList(GetIndustryV1HomeMembersRespFeature FeatureList) {
        this.FeatureList = FeatureList;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 用户行业分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndustryType 用户行业分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndustryType() {
        return this.IndustryType;
    }

    /**
     * Set 用户行业分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndustryType 用户行业分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndustryType(String IndustryType) {
        this.IndustryType = IndustryType;
    }

    /**
     * Get 子用户数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberNum 子用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemberNum() {
        return this.MemberNum;
    }

    /**
     * Set 子用户数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberNum 子用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberNum(Long MemberNum) {
        this.MemberNum = MemberNum;
    }

    /**
     * Get 机器人列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductList 机器人列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GetIndustryV1HomeMembersRespProduct getProductList() {
        return this.ProductList;
    }

    /**
     * Set 机器人列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductList 机器人列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductList(GetIndustryV1HomeMembersRespProduct ProductList) {
        this.ProductList = ProductList;
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
     * Get 是否有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 是否有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 是否有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 是否有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 功能列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeList 功能列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GetIndustryV1HomeMembersRespType getTypeList() {
        return this.TypeList;
    }

    /**
     * Set 功能列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeList 功能列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeList(GetIndustryV1HomeMembersRespType TypeList) {
        this.TypeList = TypeList;
    }

    /**
     * Get 用户账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAccount 用户账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserAccount() {
        return this.UserAccount;
    }

    /**
     * Set 用户账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAccount 用户账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAccount(String UserAccount) {
        this.UserAccount = UserAccount;
    }

    public GetIndustryV1HomeMembersRespData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIndustryV1HomeMembersRespData(GetIndustryV1HomeMembersRespData source) {
        if (source.EditTime != null) {
            this.EditTime = new Long(source.EditTime);
        }
        if (source.FeatureList != null) {
            this.FeatureList = new GetIndustryV1HomeMembersRespFeature(source.FeatureList);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.IndustryType != null) {
            this.IndustryType = new String(source.IndustryType);
        }
        if (source.MemberNum != null) {
            this.MemberNum = new Long(source.MemberNum);
        }
        if (source.ProductList != null) {
            this.ProductList = new GetIndustryV1HomeMembersRespProduct(source.ProductList);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TypeList != null) {
            this.TypeList = new GetIndustryV1HomeMembersRespType(source.TypeList);
        }
        if (source.UserAccount != null) {
            this.UserAccount = new String(source.UserAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EditTime", this.EditTime);
        this.setParamObj(map, prefix + "FeatureList.", this.FeatureList);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "IndustryType", this.IndustryType);
        this.setParamSimple(map, prefix + "MemberNum", this.MemberNum);
        this.setParamObj(map, prefix + "ProductList.", this.ProductList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "TypeList.", this.TypeList);
        this.setParamSimple(map, prefix + "UserAccount", this.UserAccount);

    }
}

