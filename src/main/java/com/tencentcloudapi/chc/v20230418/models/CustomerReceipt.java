/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomerReceipt extends AbstractModel {

    /**
    * 自提人员姓名
    */
    @SerializedName("PickUpStuff")
    @Expose
    private String PickUpStuff;

    /**
    * 自提人电话
    */
    @SerializedName("PickUpStuffContact")
    @Expose
    private String PickUpStuffContact;

    /**
    * 自提人证件号码
    */
    @SerializedName("PickUpStuffIDCard")
    @Expose
    private String PickUpStuffIDCard;

    /**
    * 自提时间
    */
    @SerializedName("PickUpTime")
    @Expose
    private String PickUpTime;

    /**
    * 证件类型，非必传，默认为IDENTITY_CARD。
对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他
    */
    @SerializedName("IDCardType")
    @Expose
    private String IDCardType;

    /**
     * Get 自提人员姓名 
     * @return PickUpStuff 自提人员姓名
     */
    public String getPickUpStuff() {
        return this.PickUpStuff;
    }

    /**
     * Set 自提人员姓名
     * @param PickUpStuff 自提人员姓名
     */
    public void setPickUpStuff(String PickUpStuff) {
        this.PickUpStuff = PickUpStuff;
    }

    /**
     * Get 自提人电话 
     * @return PickUpStuffContact 自提人电话
     */
    public String getPickUpStuffContact() {
        return this.PickUpStuffContact;
    }

    /**
     * Set 自提人电话
     * @param PickUpStuffContact 自提人电话
     */
    public void setPickUpStuffContact(String PickUpStuffContact) {
        this.PickUpStuffContact = PickUpStuffContact;
    }

    /**
     * Get 自提人证件号码 
     * @return PickUpStuffIDCard 自提人证件号码
     */
    public String getPickUpStuffIDCard() {
        return this.PickUpStuffIDCard;
    }

    /**
     * Set 自提人证件号码
     * @param PickUpStuffIDCard 自提人证件号码
     */
    public void setPickUpStuffIDCard(String PickUpStuffIDCard) {
        this.PickUpStuffIDCard = PickUpStuffIDCard;
    }

    /**
     * Get 自提时间 
     * @return PickUpTime 自提时间
     */
    public String getPickUpTime() {
        return this.PickUpTime;
    }

    /**
     * Set 自提时间
     * @param PickUpTime 自提时间
     */
    public void setPickUpTime(String PickUpTime) {
        this.PickUpTime = PickUpTime;
    }

    /**
     * Get 证件类型，非必传，默认为IDENTITY_CARD。
对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他 
     * @return IDCardType 证件类型，非必传，默认为IDENTITY_CARD。
对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他
     */
    public String getIDCardType() {
        return this.IDCardType;
    }

    /**
     * Set 证件类型，非必传，默认为IDENTITY_CARD。
对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他
     * @param IDCardType 证件类型，非必传，默认为IDENTITY_CARD。
对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他
     */
    public void setIDCardType(String IDCardType) {
        this.IDCardType = IDCardType;
    }

    public CustomerReceipt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomerReceipt(CustomerReceipt source) {
        if (source.PickUpStuff != null) {
            this.PickUpStuff = new String(source.PickUpStuff);
        }
        if (source.PickUpStuffContact != null) {
            this.PickUpStuffContact = new String(source.PickUpStuffContact);
        }
        if (source.PickUpStuffIDCard != null) {
            this.PickUpStuffIDCard = new String(source.PickUpStuffIDCard);
        }
        if (source.PickUpTime != null) {
            this.PickUpTime = new String(source.PickUpTime);
        }
        if (source.IDCardType != null) {
            this.IDCardType = new String(source.IDCardType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PickUpStuff", this.PickUpStuff);
        this.setParamSimple(map, prefix + "PickUpStuffContact", this.PickUpStuffContact);
        this.setParamSimple(map, prefix + "PickUpStuffIDCard", this.PickUpStuffIDCard);
        this.setParamSimple(map, prefix + "PickUpTime", this.PickUpTime);
        this.setParamSimple(map, prefix + "IDCardType", this.IDCardType);

    }
}

