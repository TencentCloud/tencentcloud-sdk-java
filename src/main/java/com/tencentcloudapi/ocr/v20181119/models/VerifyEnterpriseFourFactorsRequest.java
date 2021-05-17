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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyEnterpriseFourFactorsRequest extends AbstractModel{

    /**
    * 姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 证件号码（公司注册证件号）
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 企业全称
    */
    @SerializedName("EnterpriseName")
    @Expose
    private String EnterpriseName;

    /**
    * 企业标识（注册号，统一社会信用代码）
    */
    @SerializedName("EnterpriseMark")
    @Expose
    private String EnterpriseMark;

    /**
     * Get 姓名 
     * @return RealName 姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名
     * @param RealName 姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 证件号码（公司注册证件号） 
     * @return IdCard 证件号码（公司注册证件号）
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 证件号码（公司注册证件号）
     * @param IdCard 证件号码（公司注册证件号）
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 企业全称 
     * @return EnterpriseName 企业全称
     */
    public String getEnterpriseName() {
        return this.EnterpriseName;
    }

    /**
     * Set 企业全称
     * @param EnterpriseName 企业全称
     */
    public void setEnterpriseName(String EnterpriseName) {
        this.EnterpriseName = EnterpriseName;
    }

    /**
     * Get 企业标识（注册号，统一社会信用代码） 
     * @return EnterpriseMark 企业标识（注册号，统一社会信用代码）
     */
    public String getEnterpriseMark() {
        return this.EnterpriseMark;
    }

    /**
     * Set 企业标识（注册号，统一社会信用代码）
     * @param EnterpriseMark 企业标识（注册号，统一社会信用代码）
     */
    public void setEnterpriseMark(String EnterpriseMark) {
        this.EnterpriseMark = EnterpriseMark;
    }

    public VerifyEnterpriseFourFactorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyEnterpriseFourFactorsRequest(VerifyEnterpriseFourFactorsRequest source) {
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.EnterpriseName != null) {
            this.EnterpriseName = new String(source.EnterpriseName);
        }
        if (source.EnterpriseMark != null) {
            this.EnterpriseMark = new String(source.EnterpriseMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "EnterpriseName", this.EnterpriseName);
        this.setParamSimple(map, prefix + "EnterpriseMark", this.EnterpriseMark);

    }
}

