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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagerShareUnit extends AbstractModel {

    /**
    * <p>共享单元ID。</p>
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * <p>共享单元名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>共享单元管理员Uin。</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>共享单元管理员OwnerUin。</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * <p>共享单元地域。</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>共享单元资源数。</p>
    */
    @SerializedName("ShareResourceNum")
    @Expose
    private Long ShareResourceNum;

    /**
    * <p>共享单元成员数。</p>
    */
    @SerializedName("ShareMemberNum")
    @Expose
    private Long ShareMemberNum;

    /**
    * <p>共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号</p>
    */
    @SerializedName("ShareScope")
    @Expose
    private Long ShareScope;

    /**
    * <p>共享单元部门数。</p>
    */
    @SerializedName("ShareNodeNum")
    @Expose
    private Long ShareNodeNum;

    /**
     * Get <p>共享单元ID。</p> 
     * @return UnitId <p>共享单元ID。</p>
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set <p>共享单元ID。</p>
     * @param UnitId <p>共享单元ID。</p>
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get <p>共享单元名称。</p> 
     * @return Name <p>共享单元名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>共享单元名称。</p>
     * @param Name <p>共享单元名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>共享单元管理员Uin。</p> 
     * @return Uin <p>共享单元管理员Uin。</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>共享单元管理员Uin。</p>
     * @param Uin <p>共享单元管理员Uin。</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>共享单元管理员OwnerUin。</p> 
     * @return OwnerUin <p>共享单元管理员OwnerUin。</p>
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>共享单元管理员OwnerUin。</p>
     * @param OwnerUin <p>共享单元管理员OwnerUin。</p>
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>共享单元地域。</p> 
     * @return Area <p>共享单元地域。</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>共享单元地域。</p>
     * @param Area <p>共享单元地域。</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>描述。</p> 
     * @return Description <p>描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述。</p>
     * @param Description <p>描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>共享单元资源数。</p> 
     * @return ShareResourceNum <p>共享单元资源数。</p>
     */
    public Long getShareResourceNum() {
        return this.ShareResourceNum;
    }

    /**
     * Set <p>共享单元资源数。</p>
     * @param ShareResourceNum <p>共享单元资源数。</p>
     */
    public void setShareResourceNum(Long ShareResourceNum) {
        this.ShareResourceNum = ShareResourceNum;
    }

    /**
     * Get <p>共享单元成员数。</p> 
     * @return ShareMemberNum <p>共享单元成员数。</p>
     */
    public Long getShareMemberNum() {
        return this.ShareMemberNum;
    }

    /**
     * Set <p>共享单元成员数。</p>
     * @param ShareMemberNum <p>共享单元成员数。</p>
     */
    public void setShareMemberNum(Long ShareMemberNum) {
        this.ShareMemberNum = ShareMemberNum;
    }

    /**
     * Get <p>共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号</p> 
     * @return ShareScope <p>共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号</p>
     */
    public Long getShareScope() {
        return this.ShareScope;
    }

    /**
     * Set <p>共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号</p>
     * @param ShareScope <p>共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号</p>
     */
    public void setShareScope(Long ShareScope) {
        this.ShareScope = ShareScope;
    }

    /**
     * Get <p>共享单元部门数。</p> 
     * @return ShareNodeNum <p>共享单元部门数。</p>
     */
    public Long getShareNodeNum() {
        return this.ShareNodeNum;
    }

    /**
     * Set <p>共享单元部门数。</p>
     * @param ShareNodeNum <p>共享单元部门数。</p>
     */
    public void setShareNodeNum(Long ShareNodeNum) {
        this.ShareNodeNum = ShareNodeNum;
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
        if (source.ShareNodeNum != null) {
            this.ShareNodeNum = new Long(source.ShareNodeNum);
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
        this.setParamSimple(map, prefix + "ShareNodeNum", this.ShareNodeNum);

    }
}

