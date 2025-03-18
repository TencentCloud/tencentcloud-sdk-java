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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagerShareUnit extends AbstractModel {

    /**
    * 共享单元ID。
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * 共享单元名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 共享单元管理员Uin。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 共享单元管理员OwnerUin。
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 共享单元地域。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 共享单元资源数。
    */
    @SerializedName("ShareResourceNum")
    @Expose
    private Long ShareResourceNum;

    /**
    * 共享单元成员数。
    */
    @SerializedName("ShareMemberNum")
    @Expose
    private Long ShareMemberNum;

    /**
    * 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号
    */
    @SerializedName("ShareScope")
    @Expose
    private Long ShareScope;

    /**
     * Get 共享单元ID。 
     * @return UnitId 共享单元ID。
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set 共享单元ID。
     * @param UnitId 共享单元ID。
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get 共享单元名称。 
     * @return Name 共享单元名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 共享单元名称。
     * @param Name 共享单元名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 共享单元管理员Uin。 
     * @return Uin 共享单元管理员Uin。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 共享单元管理员Uin。
     * @param Uin 共享单元管理员Uin。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 共享单元管理员OwnerUin。 
     * @return OwnerUin 共享单元管理员OwnerUin。
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 共享单元管理员OwnerUin。
     * @param OwnerUin 共享单元管理员OwnerUin。
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 共享单元地域。 
     * @return Area 共享单元地域。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 共享单元地域。
     * @param Area 共享单元地域。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 描述。 
     * @return Description 描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
     * @param Description 描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 共享单元资源数。 
     * @return ShareResourceNum 共享单元资源数。
     */
    public Long getShareResourceNum() {
        return this.ShareResourceNum;
    }

    /**
     * Set 共享单元资源数。
     * @param ShareResourceNum 共享单元资源数。
     */
    public void setShareResourceNum(Long ShareResourceNum) {
        this.ShareResourceNum = ShareResourceNum;
    }

    /**
     * Get 共享单元成员数。 
     * @return ShareMemberNum 共享单元成员数。
     */
    public Long getShareMemberNum() {
        return this.ShareMemberNum;
    }

    /**
     * Set 共享单元成员数。
     * @param ShareMemberNum 共享单元成员数。
     */
    public void setShareMemberNum(Long ShareMemberNum) {
        this.ShareMemberNum = ShareMemberNum;
    }

    /**
     * Get 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号 
     * @return ShareScope 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号
     */
    public Long getShareScope() {
        return this.ShareScope;
    }

    /**
     * Set 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号
     * @param ShareScope 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号
     */
    public void setShareScope(Long ShareScope) {
        this.ShareScope = ShareScope;
    }

    public ManagerShareUnit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagerShareUnit(ManagerShareUnit source) {
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ShareResourceNum != null) {
            this.ShareResourceNum = new Long(source.ShareResourceNum);
        }
        if (source.ShareMemberNum != null) {
            this.ShareMemberNum = new Long(source.ShareMemberNum);
        }
        if (source.ShareScope != null) {
            this.ShareScope = new Long(source.ShareScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ShareResourceNum", this.ShareResourceNum);
        this.setParamSimple(map, prefix + "ShareMemberNum", this.ShareMemberNum);
        this.setParamSimple(map, prefix + "ShareScope", this.ShareScope);

    }
}

