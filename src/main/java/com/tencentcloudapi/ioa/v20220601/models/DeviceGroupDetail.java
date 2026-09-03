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
    * <p>设备组id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>设备组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>设备组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>父节点id</p>
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * <p>基于id的节点路径</p>
    */
    @SerializedName("IdPath")
    @Expose
    private String IdPath;

    /**
    * <p>基于名称的节点路径</p>
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * <p>分组锁定状态</p>
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios   ）</p>
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * <p>排序</p>
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * <p>是否自动调整</p>
    */
    @SerializedName("FromAuto")
    @Expose
    private Long FromAuto;

    /**
    * <p>子节点数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>图标</p>
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * <p>是否有ip</p>
    */
    @SerializedName("WithIp")
    @Expose
    private Long WithIp;

    /**
    * <p>是否有组ip</p>
    */
    @SerializedName("HasIp")
    @Expose
    private Boolean HasIp;

    /**
    * <p>是否是叶子节点</p>
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * <p>是否只读</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * <p>对应绑定的账号id</p>
    */
    @SerializedName("BindAccount")
    @Expose
    private Long BindAccount;

    /**
    * <p>绑定账号的用户名</p>
    */
    @SerializedName("BindAccountName")
    @Expose
    private String BindAccountName;

    /**
     * Get <p>设备组id</p> 
     * @return Id <p>设备组id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>设备组id</p>
     * @param Id <p>设备组id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>设备组名称</p> 
     * @return Name <p>设备组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>设备组名称</p>
     * @param Name <p>设备组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>设备组描述</p> 
     * @return Description <p>设备组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>设备组描述</p>
     * @param Description <p>设备组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>父节点id</p> 
     * @return ParentId <p>父节点id</p>
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set <p>父节点id</p>
     * @param ParentId <p>父节点id</p>
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get <p>基于id的节点路径</p> 
     * @return IdPath <p>基于id的节点路径</p>
     */
    public String getIdPath() {
        return this.IdPath;
    }

    /**
     * Set <p>基于id的节点路径</p>
     * @param IdPath <p>基于id的节点路径</p>
     */
    public void setIdPath(String IdPath) {
        this.IdPath = IdPath;
    }

    /**
     * Get <p>基于名称的节点路径</p> 
     * @return NamePath <p>基于名称的节点路径</p>
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set <p>基于名称的节点路径</p>
     * @param NamePath <p>基于名称的节点路径</p>
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get <p>分组锁定状态</p> 
     * @return Locked <p>分组锁定状态</p>
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set <p>分组锁定状态</p>
     * @param Locked <p>分组锁定状态</p>
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios   ）</p> 
     * @return OsType <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios   ）</p>
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios   ）</p>
     * @param OsType <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios   ）</p>
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get <p>排序</p> 
     * @return Sort <p>排序</p>
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序</p>
     * @param Sort <p>排序</p>
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>是否自动调整</p> 
     * @return FromAuto <p>是否自动调整</p>
     */
    public Long getFromAuto() {
        return this.FromAuto;
    }

    /**
     * Set <p>是否自动调整</p>
     * @param FromAuto <p>是否自动调整</p>
     */
    public void setFromAuto(Long FromAuto) {
        this.FromAuto = FromAuto;
    }

    /**
     * Get <p>子节点数量</p> 
     * @return Count <p>子节点数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>子节点数量</p>
     * @param Count <p>子节点数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>图标</p> 
     * @return Icon <p>图标</p>
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set <p>图标</p>
     * @param Icon <p>图标</p>
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get <p>是否有ip</p> 
     * @return WithIp <p>是否有ip</p>
     */
    public Long getWithIp() {
        return this.WithIp;
    }

    /**
     * Set <p>是否有ip</p>
     * @param WithIp <p>是否有ip</p>
     */
    public void setWithIp(Long WithIp) {
        this.WithIp = WithIp;
    }

    /**
     * Get <p>是否有组ip</p> 
     * @return HasIp <p>是否有组ip</p>
     */
    public Boolean getHasIp() {
        return this.HasIp;
    }

    /**
     * Set <p>是否有组ip</p>
     * @param HasIp <p>是否有组ip</p>
     */
    public void setHasIp(Boolean HasIp) {
        this.HasIp = HasIp;
    }

    /**
     * Get <p>是否是叶子节点</p> 
     * @return IsLeaf <p>是否是叶子节点</p>
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set <p>是否是叶子节点</p>
     * @param IsLeaf <p>是否是叶子节点</p>
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get <p>是否只读</p> 
     * @return ReadOnly <p>是否只读</p>
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>是否只读</p>
     * @param ReadOnly <p>是否只读</p>
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get <p>对应绑定的账号id</p> 
     * @return BindAccount <p>对应绑定的账号id</p>
     */
    public Long getBindAccount() {
        return this.BindAccount;
    }

    /**
     * Set <p>对应绑定的账号id</p>
     * @param BindAccount <p>对应绑定的账号id</p>
     */
    public void setBindAccount(Long BindAccount) {
        this.BindAccount = BindAccount;
    }

    /**
     * Get <p>绑定账号的用户名</p> 
     * @return BindAccountName <p>绑定账号的用户名</p>
     */
    public String getBindAccountName() {
        return this.BindAccountName;
    }

    /**
     * Set <p>绑定账号的用户名</p>
     * @param BindAccountName <p>绑定账号的用户名</p>
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

