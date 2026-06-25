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
    * <p>目录id</p>
    */
    @SerializedName("DirId")
    @Expose
    private Long DirId;

    /**
    * <p>目录名称</p>
    */
    @SerializedName("DirName")
    @Expose
    private String DirName;

    /**
    * <p>ioa分组信息</p>
    */
    @SerializedName("UserOrgSet")
    @Expose
    private UserOrg [] UserOrgSet;

    /**
    * <p>ioa关联用户源类型</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>ioa关联用户源名称</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>目录包含用户数</p>
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * <p>是否开启自动同步</p>
    */
    @SerializedName("AutoSync")
    @Expose
    private Boolean AutoSync;

    /**
    * <p>同步周期（5段式 crontab 表达式）</p>
    */
    @SerializedName("SyncCron")
    @Expose
    private String SyncCron;

    /**
     * Get <p>目录id</p> 
     * @return DirId <p>目录id</p>
     */
    public Long getDirId() {
        return this.DirId;
    }

    /**
     * Set <p>目录id</p>
     * @param DirId <p>目录id</p>
     */
    public void setDirId(Long DirId) {
        this.DirId = DirId;
    }

    /**
     * Get <p>目录名称</p> 
     * @return DirName <p>目录名称</p>
     */
    public String getDirName() {
        return this.DirName;
    }

    /**
     * Set <p>目录名称</p>
     * @param DirName <p>目录名称</p>
     */
    public void setDirName(String DirName) {
        this.DirName = DirName;
    }

    /**
     * Get <p>ioa分组信息</p> 
     * @return UserOrgSet <p>ioa分组信息</p>
     */
    public UserOrg [] getUserOrgSet() {
        return this.UserOrgSet;
    }

    /**
     * Set <p>ioa分组信息</p>
     * @param UserOrgSet <p>ioa分组信息</p>
     */
    public void setUserOrgSet(UserOrg [] UserOrgSet) {
        this.UserOrgSet = UserOrgSet;
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
     * Get <p>ioa关联用户源名称</p> 
     * @return SourceName <p>ioa关联用户源名称</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>ioa关联用户源名称</p>
     * @param SourceName <p>ioa关联用户源名称</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>目录包含用户数</p> 
     * @return UserCount <p>目录包含用户数</p>
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set <p>目录包含用户数</p>
     * @param UserCount <p>目录包含用户数</p>
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get <p>是否开启自动同步</p> 
     * @return AutoSync <p>是否开启自动同步</p>
     */
    public Boolean getAutoSync() {
        return this.AutoSync;
    }

    /**
     * Set <p>是否开启自动同步</p>
     * @param AutoSync <p>是否开启自动同步</p>
     */
    public void setAutoSync(Boolean AutoSync) {
        this.AutoSync = AutoSync;
    }

    /**
     * Get <p>同步周期（5段式 crontab 表达式）</p> 
     * @return SyncCron <p>同步周期（5段式 crontab 表达式）</p>
     */
    public String getSyncCron() {
        return this.SyncCron;
    }

    /**
     * Set <p>同步周期（5段式 crontab 表达式）</p>
     * @param SyncCron <p>同步周期（5段式 crontab 表达式）</p>
     */
    public void setSyncCron(String SyncCron) {
        this.SyncCron = SyncCron;
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
        if (source.AutoSync != null) {
            this.AutoSync = new Boolean(source.AutoSync);
        }
        if (source.SyncCron != null) {
            this.SyncCron = new String(source.SyncCron);
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
        this.setParamSimple(map, prefix + "AutoSync", this.AutoSync);
        this.setParamSimple(map, prefix + "SyncCron", this.SyncCron);

    }
}

