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

public class SelfOperation extends AbstractModel {

    /**
    * 联系人员电话
    */
    @SerializedName("StuffContact")
    @Expose
    private String StuffContact;

    /**
    * 证件号码
    */
    @SerializedName("StuffIDCard")
    @Expose
    private String StuffIDCard;

    /**
    * 人员姓名
    */
    @SerializedName("StuffName")
    @Expose
    private String StuffName;

    /**
    * 上门时间
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

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
     * Get 联系人员电话 
     * @return StuffContact 联系人员电话
     */
    public String getStuffContact() {
        return this.StuffContact;
    }

    /**
     * Set 联系人员电话
     * @param StuffContact 联系人员电话
     */
    public void setStuffContact(String StuffContact) {
        this.StuffContact = StuffContact;
    }

    /**
     * Get 证件号码 
     * @return StuffIDCard 证件号码
     */
    public String getStuffIDCard() {
        return this.StuffIDCard;
    }

    /**
     * Set 证件号码
     * @param StuffIDCard 证件号码
     */
    public void setStuffIDCard(String StuffIDCard) {
        this.StuffIDCard = StuffIDCard;
    }

    /**
     * Get 人员姓名 
     * @return StuffName 人员姓名
     */
    public String getStuffName() {
        return this.StuffName;
    }

    /**
     * Set 人员姓名
     * @param StuffName 人员姓名
     */
    public void setStuffName(String StuffName) {
        this.StuffName = StuffName;
    }

    /**
     * Get 上门时间 
     * @return OperationTime 上门时间
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set 上门时间
     * @param OperationTime 上门时间
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
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

    public SelfOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SelfOperation(SelfOperation source) {
        if (source.StuffContact != null) {
            this.StuffContact = new String(source.StuffContact);
        }
        if (source.StuffIDCard != null) {
            this.StuffIDCard = new String(source.StuffIDCard);
        }
        if (source.StuffName != null) {
            this.StuffName = new String(source.StuffName);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
        }
        if (source.IDCardType != null) {
            this.IDCardType = new String(source.IDCardType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StuffContact", this.StuffContact);
        this.setParamSimple(map, prefix + "StuffIDCard", this.StuffIDCard);
        this.setParamSimple(map, prefix + "StuffName", this.StuffName);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);
        this.setParamSimple(map, prefix + "IDCardType", this.IDCardType);

    }
}

