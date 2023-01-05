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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TeleOperatorCard extends AbstractModel{

    /**
    * 开户时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountTime")
    @Expose
    private String AccountTime;

    /**
    * 激活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * 运营商ICCID
    */
    @SerializedName("ICCID")
    @Expose
    private String ICCID;

    /**
    * 云兔卡ID
    */
    @SerializedName("LinkID")
    @Expose
    private Long LinkID;

    /**
    * 电话号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msisdn")
    @Expose
    private String Msisdn;

    /**
    * 移动用户识别码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IMSI")
    @Expose
    private String IMSI;

    /**
    * 运营商: 1 移动 2 联通 3 电信
    */
    @SerializedName("TeleOperator")
    @Expose
    private Long TeleOperator;

    /**
     * Get 开户时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountTime 开户时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountTime() {
        return this.AccountTime;
    }

    /**
     * Set 开户时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountTime 开户时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountTime(String AccountTime) {
        this.AccountTime = AccountTime;
    }

    /**
     * Get 激活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 运营商ICCID 
     * @return ICCID 运营商ICCID
     */
    public String getICCID() {
        return this.ICCID;
    }

    /**
     * Set 运营商ICCID
     * @param ICCID 运营商ICCID
     */
    public void setICCID(String ICCID) {
        this.ICCID = ICCID;
    }

    /**
     * Get 云兔卡ID 
     * @return LinkID 云兔卡ID
     */
    public Long getLinkID() {
        return this.LinkID;
    }

    /**
     * Set 云兔卡ID
     * @param LinkID 云兔卡ID
     */
    public void setLinkID(Long LinkID) {
        this.LinkID = LinkID;
    }

    /**
     * Get 电话号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msisdn 电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsisdn() {
        return this.Msisdn;
    }

    /**
     * Set 电话号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msisdn 电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsisdn(String Msisdn) {
        this.Msisdn = Msisdn;
    }

    /**
     * Get 移动用户识别码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IMSI 移动用户识别码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIMSI() {
        return this.IMSI;
    }

    /**
     * Set 移动用户识别码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IMSI 移动用户识别码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }

    /**
     * Get 运营商: 1 移动 2 联通 3 电信 
     * @return TeleOperator 运营商: 1 移动 2 联通 3 电信
     */
    public Long getTeleOperator() {
        return this.TeleOperator;
    }

    /**
     * Set 运营商: 1 移动 2 联通 3 电信
     * @param TeleOperator 运营商: 1 移动 2 联通 3 电信
     */
    public void setTeleOperator(Long TeleOperator) {
        this.TeleOperator = TeleOperator;
    }

    public TeleOperatorCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TeleOperatorCard(TeleOperatorCard source) {
        if (source.AccountTime != null) {
            this.AccountTime = new String(source.AccountTime);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.ICCID != null) {
            this.ICCID = new String(source.ICCID);
        }
        if (source.LinkID != null) {
            this.LinkID = new Long(source.LinkID);
        }
        if (source.Msisdn != null) {
            this.Msisdn = new String(source.Msisdn);
        }
        if (source.IMSI != null) {
            this.IMSI = new String(source.IMSI);
        }
        if (source.TeleOperator != null) {
            this.TeleOperator = new Long(source.TeleOperator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountTime", this.AccountTime);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "ICCID", this.ICCID);
        this.setParamSimple(map, prefix + "LinkID", this.LinkID);
        this.setParamSimple(map, prefix + "Msisdn", this.Msisdn);
        this.setParamSimple(map, prefix + "IMSI", this.IMSI);
        this.setParamSimple(map, prefix + "TeleOperator", this.TeleOperator);

    }
}

