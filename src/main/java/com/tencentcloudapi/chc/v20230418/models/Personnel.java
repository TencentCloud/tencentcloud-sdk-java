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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Personnel extends AbstractModel {

    /**
    * 证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IDCardNumber")
    @Expose
    private String IDCardNumber;

    /**
    * 证件类型。对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IDCardType")
    @Expose
    private String IDCardType;

    /**
    * 公司名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Company")
    @Expose
    private String Company;

    /**
    * 语言。对应关系：ENGLISH: 英文, CHINESE: 中文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LanguageType")
    @Expose
    private String LanguageType;

    /**
    * 姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TelNumber")
    @Expose
    private String TelNumber;

    /**
    * 职位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 微信
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Wechat")
    @Expose
    private String Wechat;

    /**
    * 邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get 证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IDCardNumber 证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIDCardNumber() {
        return this.IDCardNumber;
    }

    /**
     * Set 证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IDCardNumber 证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIDCardNumber(String IDCardNumber) {
        this.IDCardNumber = IDCardNumber;
    }

    /**
     * Get 证件类型。对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IDCardType 证件类型。对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIDCardType() {
        return this.IDCardType;
    }

    /**
     * Set 证件类型。对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param IDCardType 证件类型。对应关系如下：IDENTITY_CARD: 身份证,
HONG_KONG_AND_MACAO_PASS: 港澳通行证',
PASSPORT: 护照,
DRIVING_LICENSE: 驾照,
OTHER: 其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIDCardType(String IDCardType) {
        this.IDCardType = IDCardType;
    }

    /**
     * Get 公司名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Company 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompany() {
        return this.Company;
    }

    /**
     * Set 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Company 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     * Get 语言。对应关系：ENGLISH: 英文, CHINESE: 中文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LanguageType 语言。对应关系：ENGLISH: 英文, CHINESE: 中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLanguageType() {
        return this.LanguageType;
    }

    /**
     * Set 语言。对应关系：ENGLISH: 英文, CHINESE: 中文
注意：此字段可能返回 null，表示取不到有效值。
     * @param LanguageType 语言。对应关系：ENGLISH: 英文, CHINESE: 中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanguageType(String LanguageType) {
        this.LanguageType = LanguageType;
    }

    /**
     * Get 姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TelNumber 电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTelNumber() {
        return this.TelNumber;
    }

    /**
     * Set 电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param TelNumber 电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTelNumber(String TelNumber) {
        this.TelNumber = TelNumber;
    }

    /**
     * Get 职位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 职位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 职位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 职位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 微信
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Wechat 微信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechat() {
        return this.Wechat;
    }

    /**
     * Set 微信
注意：此字段可能返回 null，表示取不到有效值。
     * @param Wechat 微信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechat(String Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get 邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Personnel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Personnel(Personnel source) {
        if (source.IDCardNumber != null) {
            this.IDCardNumber = new String(source.IDCardNumber);
        }
        if (source.IDCardType != null) {
            this.IDCardType = new String(source.IDCardType);
        }
        if (source.Company != null) {
            this.Company = new String(source.Company);
        }
        if (source.LanguageType != null) {
            this.LanguageType = new String(source.LanguageType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TelNumber != null) {
            this.TelNumber = new String(source.TelNumber);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.Wechat != null) {
            this.Wechat = new String(source.Wechat);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IDCardNumber", this.IDCardNumber);
        this.setParamSimple(map, prefix + "IDCardType", this.IDCardType);
        this.setParamSimple(map, prefix + "Company", this.Company);
        this.setParamSimple(map, prefix + "LanguageType", this.LanguageType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TelNumber", this.TelNumber);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Wechat", this.Wechat);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

