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

public class StaffInfo extends AbstractModel{

    /**
    * 坐席名称
注意：此字段可能返回 null，表示取不到有效值。
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
    * 坐席电话号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 坐席昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 坐席工号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
    * 所属技能组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillGroupList")
    @Expose
    private SkillGroupItem [] SkillGroupList;

    /**
    * 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyTimestamp")
    @Expose
    private Long LastModifyTimestamp;

    /**
     * Get 坐席名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 坐席名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 坐席名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 坐席名称
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 坐席电话号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phone 坐席电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 坐席电话号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phone 坐席电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 坐席昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nick 坐席昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 坐席昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nick 坐席昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 坐席工号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaffNumber 坐席工号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set 坐席工号
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaffNumber 坐席工号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    /**
     * Get 所属技能组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillGroupList 所属技能组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SkillGroupItem [] getSkillGroupList() {
        return this.SkillGroupList;
    }

    /**
     * Set 所属技能组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillGroupList 所属技能组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillGroupList(SkillGroupItem [] SkillGroupList) {
        this.SkillGroupList = SkillGroupList;
    }

    /**
     * Get 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyTimestamp 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastModifyTimestamp() {
        return this.LastModifyTimestamp;
    }

    /**
     * Set 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyTimestamp 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyTimestamp(Long LastModifyTimestamp) {
        this.LastModifyTimestamp = LastModifyTimestamp;
    }

    public StaffInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffInfo(StaffInfo source) {
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
        if (source.StaffNumber != null) {
            this.StaffNumber = new String(source.StaffNumber);
        }
        if (source.SkillGroupList != null) {
            this.SkillGroupList = new SkillGroupItem[source.SkillGroupList.length];
            for (int i = 0; i < source.SkillGroupList.length; i++) {
                this.SkillGroupList[i] = new SkillGroupItem(source.SkillGroupList[i]);
            }
        }
        if (source.LastModifyTimestamp != null) {
            this.LastModifyTimestamp = new Long(source.LastModifyTimestamp);
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
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);
        this.setParamArrayObj(map, prefix + "SkillGroupList.", this.SkillGroupList);
        this.setParamSimple(map, prefix + "LastModifyTimestamp", this.LastModifyTimestamp);

    }
}

