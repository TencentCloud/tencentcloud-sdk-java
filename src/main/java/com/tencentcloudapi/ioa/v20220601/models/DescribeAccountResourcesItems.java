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

public class DescribeAccountResourcesItems extends AbstractModel {

    /**
    * 资源组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 资源类型(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private Long ResourceId;

    /**
    * 一般同id字段相同(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromSourceId")
    @Expose
    private Long FromSourceId;

    /**
    * 是否继承过来的资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInherited")
    @Expose
    private Boolean IsInherited;

    /**
    * 资源过期时间(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 账户组的namepath
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * 访问类型:0-NGN 1-web(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 继承开关状态(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInheritedSwitch")
    @Expose
    private Long IsInheritedSwitch;

    /**
    * 关系id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
     * Get 资源组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaId 资源组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set 资源组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaId 资源组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 资源类型(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(Long ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 一般同id字段相同(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromSourceId 一般同id字段相同(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFromSourceId() {
        return this.FromSourceId;
    }

    /**
     * Set 一般同id字段相同(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromSourceId 一般同id字段相同(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromSourceId(Long FromSourceId) {
        this.FromSourceId = FromSourceId;
    }

    /**
     * Get 是否继承过来的资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInherited 是否继承过来的资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsInherited() {
        return this.IsInherited;
    }

    /**
     * Set 是否继承过来的资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInherited 是否继承过来的资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInherited(Boolean IsInherited) {
        this.IsInherited = IsInherited;
    }

    /**
     * Get 资源过期时间(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 资源过期时间(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 资源过期时间(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 资源过期时间(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 账户组的namepath
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamePath 账户组的namepath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set 账户组的namepath
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamePath 账户组的namepath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get 访问类型:0-NGN 1-web(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 访问类型:0-NGN 1-web(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 访问类型:0-NGN 1-web(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 访问类型:0-NGN 1-web(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 继承开关状态(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInheritedSwitch 继承开关状态(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsInheritedSwitch() {
        return this.IsInheritedSwitch;
    }

    /**
     * Set 继承开关状态(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInheritedSwitch 继承开关状态(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInheritedSwitch(Long IsInheritedSwitch) {
        this.IsInheritedSwitch = IsInheritedSwitch;
    }

    /**
     * Get 关系id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 关系id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 关系id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 关系id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    public DescribeAccountResourcesItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountResourcesItems(DescribeAccountResourcesItems source) {
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new Long(source.ResourceId);
        }
        if (source.FromSourceId != null) {
            this.FromSourceId = new Long(source.FromSourceId);
        }
        if (source.IsInherited != null) {
            this.IsInherited = new Boolean(source.IsInherited);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.NamePath != null) {
            this.NamePath = new String(source.NamePath);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.IsInheritedSwitch != null) {
            this.IsInheritedSwitch = new Long(source.IsInheritedSwitch);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AreaName != null) {
            this.AreaName = new String(source.AreaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "FromSourceId", this.FromSourceId);
        this.setParamSimple(map, prefix + "IsInherited", this.IsInherited);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "NamePath", this.NamePath);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "IsInheritedSwitch", this.IsInheritedSwitch);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);

    }
}

