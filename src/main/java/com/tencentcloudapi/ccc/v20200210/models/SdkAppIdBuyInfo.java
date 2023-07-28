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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SdkAppIdBuyInfo extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 坐席购买数（还在有效期内）
    */
    @SerializedName("StaffBuyNum")
    @Expose
    private Long StaffBuyNum;

    /**
    * 坐席购买列表 （还在有效期内）
    */
    @SerializedName("StaffBuyList")
    @Expose
    private StaffBuyInfo [] StaffBuyList;

    /**
    * 号码购买列表
    */
    @SerializedName("PhoneNumBuyList")
    @Expose
    private PhoneNumBuyInfo [] PhoneNumBuyList;

    /**
    * 办公电话购买数（还在有效期内）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SipBuyNum")
    @Expose
    private Long SipBuyNum;

    /**
     * Get 应用ID 
     * @return SdkAppId 应用ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用ID
     * @param SdkAppId 应用ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 应用名称 
     * @return Name 应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称
     * @param Name 应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 坐席购买数（还在有效期内） 
     * @return StaffBuyNum 坐席购买数（还在有效期内）
     */
    public Long getStaffBuyNum() {
        return this.StaffBuyNum;
    }

    /**
     * Set 坐席购买数（还在有效期内）
     * @param StaffBuyNum 坐席购买数（还在有效期内）
     */
    public void setStaffBuyNum(Long StaffBuyNum) {
        this.StaffBuyNum = StaffBuyNum;
    }

    /**
     * Get 坐席购买列表 （还在有效期内） 
     * @return StaffBuyList 坐席购买列表 （还在有效期内）
     */
    public StaffBuyInfo [] getStaffBuyList() {
        return this.StaffBuyList;
    }

    /**
     * Set 坐席购买列表 （还在有效期内）
     * @param StaffBuyList 坐席购买列表 （还在有效期内）
     */
    public void setStaffBuyList(StaffBuyInfo [] StaffBuyList) {
        this.StaffBuyList = StaffBuyList;
    }

    /**
     * Get 号码购买列表 
     * @return PhoneNumBuyList 号码购买列表
     */
    public PhoneNumBuyInfo [] getPhoneNumBuyList() {
        return this.PhoneNumBuyList;
    }

    /**
     * Set 号码购买列表
     * @param PhoneNumBuyList 号码购买列表
     */
    public void setPhoneNumBuyList(PhoneNumBuyInfo [] PhoneNumBuyList) {
        this.PhoneNumBuyList = PhoneNumBuyList;
    }

    /**
     * Get 办公电话购买数（还在有效期内）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SipBuyNum 办公电话购买数（还在有效期内）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSipBuyNum() {
        return this.SipBuyNum;
    }

    /**
     * Set 办公电话购买数（还在有效期内）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SipBuyNum 办公电话购买数（还在有效期内）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSipBuyNum(Long SipBuyNum) {
        this.SipBuyNum = SipBuyNum;
    }

    public SdkAppIdBuyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SdkAppIdBuyInfo(SdkAppIdBuyInfo source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StaffBuyNum != null) {
            this.StaffBuyNum = new Long(source.StaffBuyNum);
        }
        if (source.StaffBuyList != null) {
            this.StaffBuyList = new StaffBuyInfo[source.StaffBuyList.length];
            for (int i = 0; i < source.StaffBuyList.length; i++) {
                this.StaffBuyList[i] = new StaffBuyInfo(source.StaffBuyList[i]);
            }
        }
        if (source.PhoneNumBuyList != null) {
            this.PhoneNumBuyList = new PhoneNumBuyInfo[source.PhoneNumBuyList.length];
            for (int i = 0; i < source.PhoneNumBuyList.length; i++) {
                this.PhoneNumBuyList[i] = new PhoneNumBuyInfo(source.PhoneNumBuyList[i]);
            }
        }
        if (source.SipBuyNum != null) {
            this.SipBuyNum = new Long(source.SipBuyNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StaffBuyNum", this.StaffBuyNum);
        this.setParamArrayObj(map, prefix + "StaffBuyList.", this.StaffBuyList);
        this.setParamArrayObj(map, prefix + "PhoneNumBuyList.", this.PhoneNumBuyList);
        this.setParamSimple(map, prefix + "SipBuyNum", this.SipBuyNum);

    }
}

