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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourcePermission extends AbstractModel {

    /**
    * <p>资源类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>权限值</p>
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * <p>资源名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>创建者子账号</p>
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>创建者昵称</p>
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * <p>数据源简要信息</p>
    */
    @SerializedName("DataSourceBrief")
    @Expose
    private DataSourceBrief DataSourceBrief;

    /**
     * Get <p>资源类型</p> 
     * @return ResourceType <p>资源类型</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p>
     * @param ResourceType <p>资源类型</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源ID</p> 
     * @return Id <p>资源ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>资源ID</p>
     * @param Id <p>资源ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>权限值</p> 
     * @return Permission <p>权限值</p>
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>权限值</p>
     * @param Permission <p>权限值</p>
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>资源名称</p> 
     * @return Name <p>资源名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>资源名称</p>
     * @param Name <p>资源名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>创建者子账号</p> 
     * @return SubUin <p>创建者子账号</p>
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>创建者子账号</p>
     * @param SubUin <p>创建者子账号</p>
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>创建者昵称</p> 
     * @return SubUinName <p>创建者昵称</p>
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set <p>创建者昵称</p>
     * @param SubUinName <p>创建者昵称</p>
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get <p>数据源简要信息</p> 
     * @return DataSourceBrief <p>数据源简要信息</p>
     */
    public DataSourceBrief getDataSourceBrief() {
        return this.DataSourceBrief;
    }

    /**
     * Set <p>数据源简要信息</p>
     * @param DataSourceBrief <p>数据源简要信息</p>
     */
    public void setDataSourceBrief(DataSourceBrief DataSourceBrief) {
        this.DataSourceBrief = DataSourceBrief;
    }

    public ResourcePermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePermission(ResourcePermission source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.DataSourceBrief != null) {
            this.DataSourceBrief = new DataSourceBrief(source.DataSourceBrief);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamObj(map, prefix + "DataSourceBrief.", this.DataSourceBrief);

    }
}

