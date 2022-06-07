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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PayeeAccountInfoResult extends AbstractModel{

    /**
    * 账户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 账户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserInfo")
    @Expose
    private PayeeAccountUserInfo UserInfo;

    /**
    * 属性信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropertyInfo")
    @Expose
    private PayeeAccountPropertyInfo PropertyInfo;

    /**
     * Get 账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountId 账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountId 账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 账户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName 账户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName 账户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
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
     * Get 用户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserInfo 用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PayeeAccountUserInfo getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 用户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserInfo 用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserInfo(PayeeAccountUserInfo UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 属性信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropertyInfo 属性信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PayeeAccountPropertyInfo getPropertyInfo() {
        return this.PropertyInfo;
    }

    /**
     * Set 属性信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropertyInfo 属性信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropertyInfo(PayeeAccountPropertyInfo PropertyInfo) {
        this.PropertyInfo = PropertyInfo;
    }

    public PayeeAccountInfoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayeeAccountInfoResult(PayeeAccountInfoResult source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new PayeeAccountUserInfo(source.UserInfo);
        }
        if (source.PropertyInfo != null) {
            this.PropertyInfo = new PayeeAccountPropertyInfo(source.PropertyInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "PropertyInfo.", this.PropertyInfo);

    }
}

