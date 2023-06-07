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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproverRestriction extends AbstractModel{

    /**
    * 指定签署人姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 指定签署人手机号，11位数字
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 指定签署人证件类型，ID_CARD-身份证，HONGKONG_AND_MACAO-港澳居民来往内地通行证，HONGKONG_MACAO_AND_TAIWAN-港澳台居民居住证
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 指定签署人证件号码，其中字母大写
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
     * Get 指定签署人姓名 
     * @return Name 指定签署人姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指定签署人姓名
     * @param Name 指定签署人姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 指定签署人手机号，11位数字 
     * @return Mobile 指定签署人手机号，11位数字
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 指定签署人手机号，11位数字
     * @param Mobile 指定签署人手机号，11位数字
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 指定签署人证件类型，ID_CARD-身份证，HONGKONG_AND_MACAO-港澳居民来往内地通行证，HONGKONG_MACAO_AND_TAIWAN-港澳台居民居住证 
     * @return IdCardType 指定签署人证件类型，ID_CARD-身份证，HONGKONG_AND_MACAO-港澳居民来往内地通行证，HONGKONG_MACAO_AND_TAIWAN-港澳台居民居住证
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 指定签署人证件类型，ID_CARD-身份证，HONGKONG_AND_MACAO-港澳居民来往内地通行证，HONGKONG_MACAO_AND_TAIWAN-港澳台居民居住证
     * @param IdCardType 指定签署人证件类型，ID_CARD-身份证，HONGKONG_AND_MACAO-港澳居民来往内地通行证，HONGKONG_MACAO_AND_TAIWAN-港澳台居民居住证
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 指定签署人证件号码，其中字母大写 
     * @return IdCardNumber 指定签署人证件号码，其中字母大写
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 指定签署人证件号码，其中字母大写
     * @param IdCardNumber 指定签署人证件号码，其中字母大写
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    public ApproverRestriction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproverRestriction(ApproverRestriction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);

    }
}

