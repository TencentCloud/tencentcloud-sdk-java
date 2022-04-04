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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CorpUserInfo extends AbstractModel{

    /**
    * 企业成员UserId
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 企业成员在SaaS名片内填写的姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 企业成员在企微原生通讯录内的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserOpenId")
    @Expose
    private String UserOpenId;

    /**
    * 成员所属经销商id，可为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealerId")
    @Expose
    private Long DealerId;

    /**
    * 成员所属门店id，可为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 企业成员手机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 成员所属部门id列表，仅返回该应用有查看权限的部门id；成员授权模式下，固定返回根部门id，即固定为1；多个部门使用逗号分割
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgIds")
    @Expose
    private String OrgIds;

    /**
    * 主部门，仅当应用对主部门有查看权限时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainDepartment")
    @Expose
    private String MainDepartment;

    /**
    * 是否为部门负责人，第三方应用可为空。与orgIds值一一对应，多个部门使用逗号隔开，0-否， 1-是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLeaderInDept")
    @Expose
    private String IsLeaderInDept;

    /**
    * 激活状态: 0=已激活，1=已禁用，-1=退出企业"
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 企业成员UserId 
     * @return UserId 企业成员UserId
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 企业成员UserId
     * @param UserId 企业成员UserId
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 企业成员在SaaS名片内填写的姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 企业成员在SaaS名片内填写的姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 企业成员在SaaS名片内填写的姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 企业成员在SaaS名片内填写的姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 企业成员在企微原生通讯录内的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserOpenId 企业成员在企微原生通讯录内的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserOpenId() {
        return this.UserOpenId;
    }

    /**
     * Set 企业成员在企微原生通讯录内的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserOpenId 企业成员在企微原生通讯录内的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserOpenId(String UserOpenId) {
        this.UserOpenId = UserOpenId;
    }

    /**
     * Get 成员所属经销商id，可为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealerId 成员所属经销商id，可为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDealerId() {
        return this.DealerId;
    }

    /**
     * Set 成员所属经销商id，可为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealerId 成员所属经销商id，可为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealerId(Long DealerId) {
        this.DealerId = DealerId;
    }

    /**
     * Get 成员所属门店id，可为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopId 成员所属门店id，可为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 成员所属门店id，可为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopId 成员所属门店id，可为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 企业成员手机号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phone 企业成员手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 企业成员手机号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phone 企业成员手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 成员所属部门id列表，仅返回该应用有查看权限的部门id；成员授权模式下，固定返回根部门id，即固定为1；多个部门使用逗号分割
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgIds 成员所属部门id列表，仅返回该应用有查看权限的部门id；成员授权模式下，固定返回根部门id，即固定为1；多个部门使用逗号分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgIds() {
        return this.OrgIds;
    }

    /**
     * Set 成员所属部门id列表，仅返回该应用有查看权限的部门id；成员授权模式下，固定返回根部门id，即固定为1；多个部门使用逗号分割
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgIds 成员所属部门id列表，仅返回该应用有查看权限的部门id；成员授权模式下，固定返回根部门id，即固定为1；多个部门使用逗号分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgIds(String OrgIds) {
        this.OrgIds = OrgIds;
    }

    /**
     * Get 主部门，仅当应用对主部门有查看权限时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainDepartment 主部门，仅当应用对主部门有查看权限时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainDepartment() {
        return this.MainDepartment;
    }

    /**
     * Set 主部门，仅当应用对主部门有查看权限时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainDepartment 主部门，仅当应用对主部门有查看权限时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainDepartment(String MainDepartment) {
        this.MainDepartment = MainDepartment;
    }

    /**
     * Get 是否为部门负责人，第三方应用可为空。与orgIds值一一对应，多个部门使用逗号隔开，0-否， 1-是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLeaderInDept 是否为部门负责人，第三方应用可为空。与orgIds值一一对应，多个部门使用逗号隔开，0-否， 1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsLeaderInDept() {
        return this.IsLeaderInDept;
    }

    /**
     * Set 是否为部门负责人，第三方应用可为空。与orgIds值一一对应，多个部门使用逗号隔开，0-否， 1-是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLeaderInDept 是否为部门负责人，第三方应用可为空。与orgIds值一一对应，多个部门使用逗号隔开，0-否， 1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLeaderInDept(String IsLeaderInDept) {
        this.IsLeaderInDept = IsLeaderInDept;
    }

    /**
     * Get 激活状态: 0=已激活，1=已禁用，-1=退出企业" 
     * @return Status 激活状态: 0=已激活，1=已禁用，-1=退出企业"
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 激活状态: 0=已激活，1=已禁用，-1=退出企业"
     * @param Status 激活状态: 0=已激活，1=已禁用，-1=退出企业"
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public CorpUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CorpUserInfo(CorpUserInfo source) {
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserOpenId != null) {
            this.UserOpenId = new String(source.UserOpenId);
        }
        if (source.DealerId != null) {
            this.DealerId = new Long(source.DealerId);
        }
        if (source.ShopId != null) {
            this.ShopId = new Long(source.ShopId);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.OrgIds != null) {
            this.OrgIds = new String(source.OrgIds);
        }
        if (source.MainDepartment != null) {
            this.MainDepartment = new String(source.MainDepartment);
        }
        if (source.IsLeaderInDept != null) {
            this.IsLeaderInDept = new String(source.IsLeaderInDept);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserOpenId", this.UserOpenId);
        this.setParamSimple(map, prefix + "DealerId", this.DealerId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "OrgIds", this.OrgIds);
        this.setParamSimple(map, prefix + "MainDepartment", this.MainDepartment);
        this.setParamSimple(map, prefix + "IsLeaderInDept", this.IsLeaderInDept);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

