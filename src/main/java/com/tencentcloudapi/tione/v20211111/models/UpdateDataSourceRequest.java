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

public class UpdateDataSourceRequest extends AbstractModel {

    /**
    * 数据源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 数据源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据源权限，取值有RW RO
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * 数据源挂载配置
    */
    @SerializedName("MountConfigure")
    @Expose
    private MountConfigureInfo MountConfigure;

    /**
     * Get 数据源ID 
     * @return Id 数据源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 数据源ID
     * @param Id 数据源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 数据源名称 
     * @return Name 数据源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据源名称
     * @param Name 数据源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据源权限，取值有RW RO 
     * @return Permission 数据源权限，取值有RW RO
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 数据源权限，取值有RW RO
     * @param Permission 数据源权限，取值有RW RO
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 数据源挂载配置 
     * @return MountConfigure 数据源挂载配置
     */
    public MountConfigureInfo getMountConfigure() {
        return this.MountConfigure;
    }

    /**
     * Set 数据源挂载配置
     * @param MountConfigure 数据源挂载配置
     */
    public void setMountConfigure(MountConfigureInfo MountConfigure) {
        this.MountConfigure = MountConfigure;
    }

    public UpdateDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDataSourceRequest(UpdateDataSourceRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.MountConfigure != null) {
            this.MountConfigure = new MountConfigureInfo(source.MountConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamObj(map, prefix + "MountConfigure.", this.MountConfigure);

    }
}

