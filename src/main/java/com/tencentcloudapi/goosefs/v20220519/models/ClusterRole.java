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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterRole extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 角色名
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 目录列表
    */
    @SerializedName("DirectoryList")
    @Expose
    private String [] DirectoryList;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 角色名 
     * @return RoleName 角色名
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名
     * @param RoleName 角色名
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 目录列表 
     * @return DirectoryList 目录列表
     */
    public String [] getDirectoryList() {
        return this.DirectoryList;
    }

    /**
     * Set 目录列表
     * @param DirectoryList 目录列表
     */
    public void setDirectoryList(String [] DirectoryList) {
        this.DirectoryList = DirectoryList;
    }

    public ClusterRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterRole(ClusterRole source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DirectoryList != null) {
            this.DirectoryList = new String[source.DirectoryList.length];
            for (int i = 0; i < source.DirectoryList.length; i++) {
                this.DirectoryList[i] = new String(source.DirectoryList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "DirectoryList.", this.DirectoryList);

    }
}

