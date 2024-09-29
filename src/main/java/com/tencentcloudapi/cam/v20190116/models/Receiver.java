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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Receiver extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 手机号码
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 手机号码是否验证
    */
    @SerializedName("PhoneFlag")
    @Expose
    private Long PhoneFlag;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 邮箱是否验证
    */
    @SerializedName("EmailFlag")
    @Expose
    private Long EmailFlag;

    /**
    * 是否主联系人
    */
    @SerializedName("IsReceiverOwner")
    @Expose
    private Long IsReceiverOwner;

    /**
    * 是否允许微信接收通知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatFlag")
    @Expose
    private Long WechatFlag;

    /**
    * 账号uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
     * Get id 
     * @return Uid id
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set id
     * @param Uid id
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 手机号码 
     * @return PhoneNumber 手机号码
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码
     * @param PhoneNumber 手机号码
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 手机号码是否验证 
     * @return PhoneFlag 手机号码是否验证
     */
    public Long getPhoneFlag() {
        return this.PhoneFlag;
    }

    /**
     * Set 手机号码是否验证
     * @param PhoneFlag 手机号码是否验证
     */
    public void setPhoneFlag(Long PhoneFlag) {
        this.PhoneFlag = PhoneFlag;
    }

    /**
     * Get 邮箱 
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 邮箱是否验证 
     * @return EmailFlag 邮箱是否验证
     */
    public Long getEmailFlag() {
        return this.EmailFlag;
    }

    /**
     * Set 邮箱是否验证
     * @param EmailFlag 邮箱是否验证
     */
    public void setEmailFlag(Long EmailFlag) {
        this.EmailFlag = EmailFlag;
    }

    /**
     * Get 是否主联系人 
     * @return IsReceiverOwner 是否主联系人
     */
    public Long getIsReceiverOwner() {
        return this.IsReceiverOwner;
    }

    /**
     * Set 是否主联系人
     * @param IsReceiverOwner 是否主联系人
     */
    public void setIsReceiverOwner(Long IsReceiverOwner) {
        this.IsReceiverOwner = IsReceiverOwner;
    }

    /**
     * Get 是否允许微信接收通知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatFlag 是否允许微信接收通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWechatFlag() {
        return this.WechatFlag;
    }

    /**
     * Set 是否允许微信接收通知
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatFlag 是否允许微信接收通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatFlag(Long WechatFlag) {
        this.WechatFlag = WechatFlag;
    }

    /**
     * Get 账号uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 账号uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    public Receiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Receiver(Receiver source) {
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.PhoneFlag != null) {
            this.PhoneFlag = new Long(source.PhoneFlag);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.EmailFlag != null) {
            this.EmailFlag = new Long(source.EmailFlag);
        }
        if (source.IsReceiverOwner != null) {
            this.IsReceiverOwner = new Long(source.IsReceiverOwner);
        }
        if (source.WechatFlag != null) {
            this.WechatFlag = new Long(source.WechatFlag);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "PhoneFlag", this.PhoneFlag);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "EmailFlag", this.EmailFlag);
        this.setParamSimple(map, prefix + "IsReceiverOwner", this.IsReceiverOwner);
        this.setParamSimple(map, prefix + "WechatFlag", this.WechatFlag);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

