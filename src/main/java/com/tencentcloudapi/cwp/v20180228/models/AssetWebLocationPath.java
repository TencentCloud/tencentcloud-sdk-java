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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetWebLocationPath extends AbstractModel{

    /**
    * 虚拟路径
    */
    @SerializedName("VirtualPath")
    @Expose
    private String VirtualPath;

    /**
    * 物理路径
    */
    @SerializedName("RealPath")
    @Expose
    private String RealPath;

    /**
    * 文件所有者
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 文件所属组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 文件权限
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
     * Get 虚拟路径 
     * @return VirtualPath 虚拟路径
     */
    public String getVirtualPath() {
        return this.VirtualPath;
    }

    /**
     * Set 虚拟路径
     * @param VirtualPath 虚拟路径
     */
    public void setVirtualPath(String VirtualPath) {
        this.VirtualPath = VirtualPath;
    }

    /**
     * Get 物理路径 
     * @return RealPath 物理路径
     */
    public String getRealPath() {
        return this.RealPath;
    }

    /**
     * Set 物理路径
     * @param RealPath 物理路径
     */
    public void setRealPath(String RealPath) {
        this.RealPath = RealPath;
    }

    /**
     * Get 文件所有者 
     * @return User 文件所有者
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 文件所有者
     * @param User 文件所有者
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 文件所属组 
     * @return Group 文件所属组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 文件所属组
     * @param Group 文件所属组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 文件权限 
     * @return Permission 文件权限
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 文件权限
     * @param Permission 文件权限
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    public AssetWebLocationPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetWebLocationPath(AssetWebLocationPath source) {
        if (source.VirtualPath != null) {
            this.VirtualPath = new String(source.VirtualPath);
        }
        if (source.RealPath != null) {
            this.RealPath = new String(source.RealPath);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VirtualPath", this.VirtualPath);
        this.setParamSimple(map, prefix + "RealPath", this.RealPath);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

