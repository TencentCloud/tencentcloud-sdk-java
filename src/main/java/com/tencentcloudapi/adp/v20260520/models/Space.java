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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Space extends AbstractModel {

    /**
    * 空间id
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 空间描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 空间权限
    */
    @SerializedName("PermissionIdList")
    @Expose
    private String [] PermissionIdList;

    /**
     * Get 空间id 
     * @return SpaceId 空间id
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间id
     * @param SpaceId 空间id
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 空间名称 
     * @return Name 空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 空间名称
     * @param Name 空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 空间描述 
     * @return Description 空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 空间描述
     * @param Description 空间描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 空间权限 
     * @return PermissionIdList 空间权限
     */
    public String [] getPermissionIdList() {
        return this.PermissionIdList;
    }

    /**
     * Set 空间权限
     * @param PermissionIdList 空间权限
     */
    public void setPermissionIdList(String [] PermissionIdList) {
        this.PermissionIdList = PermissionIdList;
    }

    public Space() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Space(Space source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PermissionIdList != null) {
            this.PermissionIdList = new String[source.PermissionIdList.length];
            for (int i = 0; i < source.PermissionIdList.length; i++) {
                this.PermissionIdList[i] = new String(source.PermissionIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "PermissionIdList.", this.PermissionIdList);

    }
}

