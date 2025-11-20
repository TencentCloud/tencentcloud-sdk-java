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

public class UserDirectory extends AbstractModel {

    /**
    * 目录id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * ioa目录id
    */
    @SerializedName("DirId")
    @Expose
    private Long DirId;

    /**
    * ioa目录名称
    */
    @SerializedName("DirName")
    @Expose
    private String DirName;

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
    @SerializedName("UserTotal")
    @Expose
    private Long UserTotal;

    /**
    * 目录接入时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 目录下的组织细节信息
    */
    @SerializedName("UserOrgSet")
    @Expose
    private UserOrg [] UserOrgSet;

    /**
     * Get 目录id 
     * @return Id 目录id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 目录id
     * @param Id 目录id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get ioa目录id 
     * @return DirId ioa目录id
     */
    public Long getDirId() {
        return this.DirId;
    }

    /**
     * Set ioa目录id
     * @param DirId ioa目录id
     */
    public void setDirId(Long DirId) {
        this.DirId = DirId;
    }

    /**
     * Get ioa目录名称 
     * @return DirName ioa目录名称
     */
    public String getDirName() {
        return this.DirName;
    }

    /**
     * Set ioa目录名称
     * @param DirName ioa目录名称
     */
    public void setDirName(String DirName) {
        this.DirName = DirName;
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
     * @return UserTotal 目录包含用户数
     */
    public Long getUserTotal() {
        return this.UserTotal;
    }

    /**
     * Set 目录包含用户数
     * @param UserTotal 目录包含用户数
     */
    public void setUserTotal(Long UserTotal) {
        this.UserTotal = UserTotal;
    }

    /**
     * Get 目录接入时间 
     * @return CreateTime 目录接入时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 目录接入时间
     * @param CreateTime 目录接入时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 目录下的组织细节信息 
     * @return UserOrgSet 目录下的组织细节信息
     */
    public UserOrg [] getUserOrgSet() {
        return this.UserOrgSet;
    }

    /**
     * Set 目录下的组织细节信息
     * @param UserOrgSet 目录下的组织细节信息
     */
    public void setUserOrgSet(UserOrg [] UserOrgSet) {
        this.UserOrgSet = UserOrgSet;
    }

    public UserDirectory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDirectory(UserDirectory source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DirId != null) {
            this.DirId = new Long(source.DirId);
        }
        if (source.DirName != null) {
            this.DirName = new String(source.DirName);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.UserTotal != null) {
            this.UserTotal = new Long(source.UserTotal);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserOrgSet != null) {
            this.UserOrgSet = new UserOrg[source.UserOrgSet.length];
            for (int i = 0; i < source.UserOrgSet.length; i++) {
                this.UserOrgSet[i] = new UserOrg(source.UserOrgSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DirId", this.DirId);
        this.setParamSimple(map, prefix + "DirName", this.DirName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "UserTotal", this.UserTotal);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "UserOrgSet.", this.UserOrgSet);

    }
}

