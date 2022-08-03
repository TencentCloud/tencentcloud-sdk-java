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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproverRestriction extends AbstractModel{

    /**
    * 指定签署人名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 指定签署人手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 指定签署人证件类型
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 指定签署人证件号码
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
     * Get 指定签署人名字 
     * @return Name 指定签署人名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指定签署人名字
     * @param Name 指定签署人名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 指定签署人手机号 
     * @return Mobile 指定签署人手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 指定签署人手机号
     * @param Mobile 指定签署人手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 指定签署人证件类型 
     * @return IdCardType 指定签署人证件类型
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 指定签署人证件类型
     * @param IdCardType 指定签署人证件类型
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 指定签署人证件号码 
     * @return IdCardNumber 指定签署人证件号码
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 指定签署人证件号码
     * @param IdCardNumber 指定签署人证件号码
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

