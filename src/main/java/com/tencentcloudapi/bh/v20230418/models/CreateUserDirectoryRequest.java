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

public class CreateUserDirectoryRequest extends AbstractModel {

    /**
    * 目录id
    */
    @SerializedName("DirId")
    @Expose
    private Long DirId;

    /**
    * 目录名称
    */
    @SerializedName("DirName")
    @Expose
    private String DirName;

    /**
    * ioa分组信息
    */
    @SerializedName("UserOrgSet")
    @Expose
    private UserOrg [] UserOrgSet;

    /**
    * ioa关联用户源类型
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * ioa关联用户源名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 目录包含用户数
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
     * Get 目录id 
     * @return DirId 目录id
     */
    public Long getDirId() {
        return this.DirId;
    }

    /**
     * Set 目录id
     * @param DirId 目录id
     */
    public void setDirId(Long DirId) {
        this.DirId = DirId;
    }

    /**
     * Get 目录名称 
     * @return DirName 目录名称
     */
    public String getDirName() {
        return this.DirName;
    }

    /**
     * Set 目录名称
     * @param DirName 目录名称
     */
    public void setDirName(String DirName) {
        this.DirName = DirName;
    }

    /**
     * Get ioa分组信息 
     * @return UserOrgSet ioa分组信息
     */
    public UserOrg [] getUserOrgSet() {
        return this.UserOrgSet;
    }

    /**
     * Set ioa分组信息
     * @param UserOrgSet ioa分组信息
     */
    public void setUserOrgSet(UserOrg [] UserOrgSet) {
        this.UserOrgSet = UserOrgSet;
    }

    /**
     * Get ioa关联用户源类型 
     * @return Source ioa关联用户源类型
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set ioa关联用户源类型
     * @param Source ioa关联用户源类型
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get ioa关联用户源名称 
     * @return SourceName ioa关联用户源名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set ioa关联用户源名称
     * @param SourceName ioa关联用户源名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 目录包含用户数 
     * @return UserCount 目录包含用户数
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set 目录包含用户数
     * @param UserCount 目录包含用户数
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    public CreateUserDirectoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserDirectoryRequest(CreateUserDirectoryRequest source) {
        if (source.DirId != null) {
            this.DirId = new Long(source.DirId);
        }
        if (source.DirName != null) {
            this.DirName = new String(source.DirName);
        }
        if (source.UserOrgSet != null) {
            this.UserOrgSet = new UserOrg[source.UserOrgSet.length];
            for (int i = 0; i < source.UserOrgSet.length; i++) {
                this.UserOrgSet[i] = new UserOrg(source.UserOrgSet[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirId", this.DirId);
        this.setParamSimple(map, prefix + "DirName", this.DirName);
        this.setParamArrayObj(map, prefix + "UserOrgSet.", this.UserOrgSet);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);

    }
}

