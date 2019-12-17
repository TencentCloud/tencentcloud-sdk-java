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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountRequest extends AbstractModel{

    /**
    * 集团ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 账号名；需要是手机号
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 密码；需要是(`~!@#$%^&*()_+=-）中的至少两种且八位以上
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 客户门店编码
    */
    @SerializedName("ShopCode")
    @Expose
    private String ShopCode;

    /**
    * 备注说明; 30个字符以内
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 集团ID 
     * @return CompanyId 集团ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 集团ID
     * @param CompanyId 集团ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 账号名；需要是手机号 
     * @return Name 账号名；需要是手机号
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账号名；需要是手机号
     * @param Name 账号名；需要是手机号
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 密码；需要是(`~!@#$%^&*()_+=-）中的至少两种且八位以上 
     * @return Password 密码；需要是(`~!@#$%^&*()_+=-）中的至少两种且八位以上
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码；需要是(`~!@#$%^&*()_+=-）中的至少两种且八位以上
     * @param Password 密码；需要是(`~!@#$%^&*()_+=-）中的至少两种且八位以上
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 客户门店编码 
     * @return ShopCode 客户门店编码
     */
    public String getShopCode() {
        return this.ShopCode;
    }

    /**
     * Set 客户门店编码
     * @param ShopCode 客户门店编码
     */
    public void setShopCode(String ShopCode) {
        this.ShopCode = ShopCode;
    }

    /**
     * Get 备注说明; 30个字符以内 
     * @return Remark 备注说明; 30个字符以内
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注说明; 30个字符以内
     * @param Remark 备注说明; 30个字符以内
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ShopCode", this.ShopCode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

