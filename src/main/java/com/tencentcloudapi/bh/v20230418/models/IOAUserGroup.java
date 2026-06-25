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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IOAUserGroup extends AbstractModel {

    /**
    * <p>ioa用户组织id</p>
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * <p>ioa用户组织名称</p>
    */
    @SerializedName("OrgName")
    @Expose
    private String OrgName;

    /**
    * <p>ioa用户组织id路径</p>
    */
    @SerializedName("OrgIdPath")
    @Expose
    private String OrgIdPath;

    /**
    * <p>ioa用户组织名称路径</p>
    */
    @SerializedName("OrgNamePath")
    @Expose
    private String OrgNamePath;

    /**
    * <p>ioa关联用户源类型</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>用户所属目录</p>
    */
    @SerializedName("UserDirName")
    @Expose
    private String UserDirName;

    /**
     * Get <p>ioa用户组织id</p> 
     * @return OrgId <p>ioa用户组织id</p>
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set <p>ioa用户组织id</p>
     * @param OrgId <p>ioa用户组织id</p>
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get <p>ioa用户组织名称</p> 
     * @return OrgName <p>ioa用户组织名称</p>
     */
    public String getOrgName() {
        return this.OrgName;
    }

    /**
     * Set <p>ioa用户组织名称</p>
     * @param OrgName <p>ioa用户组织名称</p>
     */
    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    /**
     * Get <p>ioa用户组织id路径</p> 
     * @return OrgIdPath <p>ioa用户组织id路径</p>
     */
    public String getOrgIdPath() {
        return this.OrgIdPath;
    }

    /**
     * Set <p>ioa用户组织id路径</p>
     * @param OrgIdPath <p>ioa用户组织id路径</p>
     */
    public void setOrgIdPath(String OrgIdPath) {
        this.OrgIdPath = OrgIdPath;
    }

    /**
     * Get <p>ioa用户组织名称路径</p> 
     * @return OrgNamePath <p>ioa用户组织名称路径</p>
     */
    public String getOrgNamePath() {
        return this.OrgNamePath;
    }

    /**
     * Set <p>ioa用户组织名称路径</p>
     * @param OrgNamePath <p>ioa用户组织名称路径</p>
     */
    public void setOrgNamePath(String OrgNamePath) {
        this.OrgNamePath = OrgNamePath;
    }

    /**
     * Get <p>ioa关联用户源类型</p> 
     * @return Source <p>ioa关联用户源类型</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>ioa关联用户源类型</p>
     * @param Source <p>ioa关联用户源类型</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>用户所属目录</p> 
     * @return UserDirName <p>用户所属目录</p>
     */
    public String getUserDirName() {
        return this.UserDirName;
    }

    /**
     * Set <p>用户所属目录</p>
     * @param UserDirName <p>用户所属目录</p>
     */
    public void setUserDirName(String UserDirName) {
        this.UserDirName = UserDirName;
    }

    public IOAUserGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IOAUserGroup(IOAUserGroup source) {
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
        }
        if (source.OrgName != null) {
            this.OrgName = new String(source.OrgName);
        }
        if (source.OrgIdPath != null) {
            this.OrgIdPath = new String(source.OrgIdPath);
        }
        if (source.OrgNamePath != null) {
            this.OrgNamePath = new String(source.OrgNamePath);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.UserDirName != null) {
            this.UserDirName = new String(source.UserDirName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "OrgName", this.OrgName);
        this.setParamSimple(map, prefix + "OrgIdPath", this.OrgIdPath);
        this.setParamSimple(map, prefix + "OrgNamePath", this.OrgNamePath);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "UserDirName", this.UserDirName);

    }
}

