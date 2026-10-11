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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountVirtualGroupsData extends AbstractModel {

    /**
    * <p>id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>分组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * <p>账户虚拟组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>源类型，手动、自动(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * <p>用户总数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserTotal")
    @Expose
    private Long UserTotal;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
     * Get <p>id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>分组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupId <p>分组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>分组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupId <p>分组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>账户虚拟组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>账户虚拟组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>账户虚拟组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>账户虚拟组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>源类型，手动、自动(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType <p>源类型，手动、自动(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>源类型，手动、自动(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType <p>源类型，手动、自动(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get <p>用户总数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserTotal <p>用户总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserTotal() {
        return this.UserTotal;
    }

    /**
     * Set <p>用户总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserTotal <p>用户总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserTotal(Long UserTotal) {
        this.UserTotal = UserTotal;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Itime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Itime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Utime <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUtime() {
        return this.Utime;
    }

    /**
     * Set <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Utime <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUtime(String Utime) {
        this.Utime = Utime;
    }

    public DescribeAccountVirtualGroupsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountVirtualGroupsData(DescribeAccountVirtualGroupsData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new Long(source.AccountGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.UserTotal != null) {
            this.UserTotal = new Long(source.UserTotal);
        }
        if (source.Itime != null) {
            this.Itime = new String(source.Itime);
        }
        if (source.Utime != null) {
            this.Utime = new String(source.Utime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "UserTotal", this.UserTotal);
        this.setParamSimple(map, prefix + "Itime", this.Itime);
        this.setParamSimple(map, prefix + "Utime", this.Utime);

    }
}

