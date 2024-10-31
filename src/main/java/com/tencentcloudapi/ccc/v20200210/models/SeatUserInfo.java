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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeatUserInfo extends AbstractModel {

    /**
    * 座席名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 座席邮箱
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 工号
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
    * 座席电话号码（带0086前缀）
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 座席昵称
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
    * 座席关联的技能组列表
    */
    @SerializedName("SkillGroupNameList")
    @Expose
    private String [] SkillGroupNameList;

    /**
    * 1:管理员
2:质检员
3:普通座席
else:自定义角色ID
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
     * Get 座席名称 
     * @return Name 座席名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 座席名称
     * @param Name 座席名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 座席邮箱 
     * @return Mail 座席邮箱
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 座席邮箱
     * @param Mail 座席邮箱
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 工号 
     * @return StaffNumber 工号
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set 工号
     * @param StaffNumber 工号
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    /**
     * Get 座席电话号码（带0086前缀） 
     * @return Phone 座席电话号码（带0086前缀）
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 座席电话号码（带0086前缀）
     * @param Phone 座席电话号码（带0086前缀）
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 座席昵称 
     * @return Nick 座席昵称
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 座席昵称
     * @param Nick 座席昵称
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
     * Get 座席关联的技能组列表 
     * @return SkillGroupNameList 座席关联的技能组列表
     */
    public String [] getSkillGroupNameList() {
        return this.SkillGroupNameList;
    }

    /**
     * Set 座席关联的技能组列表
     * @param SkillGroupNameList 座席关联的技能组列表
     */
    public void setSkillGroupNameList(String [] SkillGroupNameList) {
        this.SkillGroupNameList = SkillGroupNameList;
    }

    /**
     * Get 1:管理员
2:质检员
3:普通座席
else:自定义角色ID 
     * @return Role 1:管理员
2:质检员
3:普通座席
else:自定义角色ID
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set 1:管理员
2:质检员
3:普通座席
else:自定义角色ID
     * @param Role 1:管理员
2:质检员
3:普通座席
else:自定义角色ID
     */
    public void setRole(Long Role) {
        this.Role = Role;
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
        if (source.StaffNumber != null) {
            this.StaffNumber = new String(source.StaffNumber);
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
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "SkillGroupNameList.", this.SkillGroupNameList);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

