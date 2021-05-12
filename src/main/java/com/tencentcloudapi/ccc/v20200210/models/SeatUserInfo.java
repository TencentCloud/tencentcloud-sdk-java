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

public class SeatUserInfo extends AbstractModel{

    /**
    * 坐席名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 坐席邮箱
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 坐席电话号码（带0086前缀）
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 坐席昵称
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 坐席关联的技能组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillGroupNameList")
    @Expose
    private String [] SkillGroupNameList;

    /**
    * 工号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
     * Get 坐席名称 
     * @return Name 坐席名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 坐席名称
     * @param Name 坐席名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 坐席邮箱 
     * @return Mail 坐席邮箱
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 坐席邮箱
     * @param Mail 坐席邮箱
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 坐席电话号码（带0086前缀） 
     * @return Phone 坐席电话号码（带0086前缀）
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 坐席电话号码（带0086前缀）
     * @param Phone 坐席电话号码（带0086前缀）
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 坐席昵称 
     * @return Nick 坐席昵称
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 坐席昵称
     * @param Nick 坐席昵称
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 坐席关联的技能组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillGroupNameList 坐席关联的技能组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSkillGroupNameList() {
        return this.SkillGroupNameList;
    }

    /**
     * Set 坐席关联的技能组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillGroupNameList 坐席关联的技能组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillGroupNameList(String [] SkillGroupNameList) {
        this.SkillGroupNameList = SkillGroupNameList;
    }

    /**
     * Get 工号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaffNumber 工号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set 工号
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaffNumber 工号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    public SeatUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeatUserInfo(SeatUserInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SkillGroupNameList != null) {
            this.SkillGroupNameList = new String[source.SkillGroupNameList.length];
            for (int i = 0; i < source.SkillGroupNameList.length; i++) {
                this.SkillGroupNameList[i] = new String(source.SkillGroupNameList[i]);
            }
        }
        if (source.StaffNumber != null) {
            this.StaffNumber = new String(source.StaffNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "SkillGroupNameList.", this.SkillGroupNameList);
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);

    }
}

