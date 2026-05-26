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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserRoleRequest extends AbstractModel {

    /**
    * 角色Arn信息
    */
    @SerializedName("Arn")
    @Expose
    private String Arn;

    /**
    * 角色描述信息
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 角色名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * cos授权路径列表
    */
    @SerializedName("CosPermissionList")
    @Expose
    private CosPermission [] CosPermissionList;

    /**
    * cam策略json
    */
    @SerializedName("PermissionJson")
    @Expose
    private String PermissionJson;

    /**
    * 是否设置为常驻：1非常驻（默认）、2常驻（仅能设置一个常驻）
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
     * Get 角色Arn信息 
     * @return Arn 角色Arn信息
     */
    public String getArn() {
        return this.Arn;
    }

    /**
     * Set 角色Arn信息
     * @param Arn 角色Arn信息
     */
    public void setArn(String Arn) {
        this.Arn = Arn;
    }

    /**
     * Get 角色描述信息 
     * @return Desc 角色描述信息
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 角色描述信息
     * @param Desc 角色描述信息
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 角色名称 
     * @return Name 角色名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 角色名称
     * @param Name 角色名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get cos授权路径列表 
     * @return CosPermissionList cos授权路径列表
     */
    public CosPermission [] getCosPermissionList() {
        return this.CosPermissionList;
    }

    /**
     * Set cos授权路径列表
     * @param CosPermissionList cos授权路径列表
     */
    public void setCosPermissionList(CosPermission [] CosPermissionList) {
        this.CosPermissionList = CosPermissionList;
    }

    /**
     * Get cam策略json 
     * @return PermissionJson cam策略json
     */
    public String getPermissionJson() {
        return this.PermissionJson;
    }

    /**
     * Set cam策略json
     * @param PermissionJson cam策略json
     */
    public void setPermissionJson(String PermissionJson) {
        this.PermissionJson = PermissionJson;
    }

    /**
     * Get 是否设置为常驻：1非常驻（默认）、2常驻（仅能设置一个常驻） 
     * @return IsDefault 是否设置为常驻：1非常驻（默认）、2常驻（仅能设置一个常驻）
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否设置为常驻：1非常驻（默认）、2常驻（仅能设置一个常驻）
     * @param IsDefault 是否设置为常驻：1非常驻（默认）、2常驻（仅能设置一个常驻）
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    public CreateUserRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRoleRequest(CreateUserRoleRequest source) {
        if (source.Arn != null) {
            this.Arn = new String(source.Arn);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CosPermissionList != null) {
            this.CosPermissionList = new CosPermission[source.CosPermissionList.length];
            for (int i = 0; i < source.CosPermissionList.length; i++) {
                this.CosPermissionList[i] = new CosPermission(source.CosPermissionList[i]);
            }
        }
        if (source.PermissionJson != null) {
            this.PermissionJson = new String(source.PermissionJson);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Arn", this.Arn);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "CosPermissionList.", this.CosPermissionList);
        this.setParamSimple(map, prefix + "PermissionJson", this.PermissionJson);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

