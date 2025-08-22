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

public class DeviceGroupDetail extends AbstractModel {

    /**
    * 设备组id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 设备组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 父节点id
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 基于id的节点路径
    */
    @SerializedName("IdPath")
    @Expose
    private String IdPath;

    /**
    * 基于名称的节点路径
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * 分组锁定状态
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * 系统类型（0: win，1：linux，2: mac，4：android，5：ios   ）
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 排序
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * 是否自动调整
    */
    @SerializedName("FromAuto")
    @Expose
    private Long FromAuto;

    /**
    * 子节点数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 图标
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 是否有ip
    */
    @SerializedName("WithIp")
    @Expose
    private Long WithIp;

    /**
    * 是否有组ip
    */
    @SerializedName("HasIp")
    @Expose
    private Boolean HasIp;

    /**
    * 是否是叶子节点
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * 是否只读
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * 对应绑定的账号id
    */
    @SerializedName("BindAccount")
    @Expose
    private Long BindAccount;

    /**
    * 绑定账号的用户名
    */
    @SerializedName("BindAccountName")
    @Expose
    private String BindAccountName;

    /**
     * Get 设备组id 
     * @return Id 设备组id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 设备组id
     * @param Id 设备组id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 设备组名称 
     * @return Name 设备组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备组名称
     * @param Name 设备组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备组描述 
     * @return Description 设备组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 设备组描述
     * @param Description 设备组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 父节点id 
     * @return ParentId 父节点id
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父节点id
     * @param ParentId 父节点id
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 基于id的节点路径 
     * @return IdPath 基于id的节点路径
     */
    public String getIdPath() {
        return this.IdPath;
    }

    /**
     * Set 基于id的节点路径
     * @param IdPath 基于id的节点路径
     */
    public void setIdPath(String IdPath) {
        this.IdPath = IdPath;
    }

    /**
     * Get 基于名称的节点路径 
     * @return NamePath 基于名称的节点路径
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set 基于名称的节点路径
     * @param NamePath 基于名称的节点路径
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get 分组锁定状态 
     * @return Locked 分组锁定状态
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set 分组锁定状态
     * @param Locked 分组锁定状态
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 系统类型（0: win，1：linux，2: mac，4：android，5：ios   ） 
     * @return OsType 系统类型（0: win，1：linux，2: mac，4：android，5：ios   ）
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 系统类型（0: win，1：linux，2: mac，4：android，5：ios   ）
     * @param OsType 系统类型（0: win，1：linux，2: mac，4：android，5：ios   ）
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 排序 
     * @return Sort 排序
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 排序
     * @param Sort 排序
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 是否自动调整 
     * @return FromAuto 是否自动调整
     */
    public Long getFromAuto() {
        return this.FromAuto;
    }

    /**
     * Set 是否自动调整
     * @param FromAuto 是否自动调整
     */
    public void setFromAuto(Long FromAuto) {
        this.FromAuto = FromAuto;
    }

    /**
     * Get 子节点数量 
     * @return Count 子节点数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 子节点数量
     * @param Count 子节点数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 图标 
     * @return Icon 图标
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 图标
     * @param Icon 图标
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 是否有ip 
     * @return WithIp 是否有ip
     */
    public Long getWithIp() {
        return this.WithIp;
    }

    /**
     * Set 是否有ip
     * @param WithIp 是否有ip
     */
    public void setWithIp(Long WithIp) {
        this.WithIp = WithIp;
    }

    /**
     * Get 是否有组ip 
     * @return HasIp 是否有组ip
     */
    public Boolean getHasIp() {
        return this.HasIp;
    }

    /**
     * Set 是否有组ip
     * @param HasIp 是否有组ip
     */
    public void setHasIp(Boolean HasIp) {
        this.HasIp = HasIp;
    }

    /**
     * Get 是否是叶子节点 
     * @return IsLeaf 是否是叶子节点
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set 是否是叶子节点
     * @param IsLeaf 是否是叶子节点
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get 是否只读 
     * @return ReadOnly 是否只读
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否只读
     * @param ReadOnly 是否只读
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 对应绑定的账号id 
     * @return BindAccount 对应绑定的账号id
     */
    public Long getBindAccount() {
        return this.BindAccount;
    }

    /**
     * Set 对应绑定的账号id
     * @param BindAccount 对应绑定的账号id
     */
    public void setBindAccount(Long BindAccount) {
        this.BindAccount = BindAccount;
    }

    /**
     * Get 绑定账号的用户名 
     * @return BindAccountName 绑定账号的用户名
     */
    public String getBindAccountName() {
        return this.BindAccountName;
    }

    /**
     * Set 绑定账号的用户名
     * @param BindAccountName 绑定账号的用户名
     */
    public void setBindAccountName(String BindAccountName) {
        this.BindAccountName = BindAccountName;
    }

    public DeviceGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceGroupDetail(DeviceGroupDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.IdPath != null) {
            this.IdPath = new String(source.IdPath);
        }
        if (source.NamePath != null) {
            this.NamePath = new String(source.NamePath);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.FromAuto != null) {
            this.FromAuto = new Long(source.FromAuto);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.WithIp != null) {
            this.WithIp = new Long(source.WithIp);
        }
        if (source.HasIp != null) {
            this.HasIp = new Boolean(source.HasIp);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.BindAccount != null) {
            this.BindAccount = new Long(source.BindAccount);
        }
        if (source.BindAccountName != null) {
            this.BindAccountName = new String(source.BindAccountName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "IdPath", this.IdPath);
        this.setParamSimple(map, prefix + "NamePath", this.NamePath);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "FromAuto", this.FromAuto);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "WithIp", this.WithIp);
        this.setParamSimple(map, prefix + "HasIp", this.HasIp);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "BindAccount", this.BindAccount);
        this.setParamSimple(map, prefix + "BindAccountName", this.BindAccountName);

    }
}

