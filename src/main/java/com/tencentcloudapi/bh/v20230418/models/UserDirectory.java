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
    * <p>目录id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>ioa目录id</p>
    */
    @SerializedName("DirId")
    @Expose
    private Long DirId;

    /**
    * <p>ioa目录名称</p>
    */
    @SerializedName("DirName")
    @Expose
    private String DirName;

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
    @SerializedName("UserTotal")
    @Expose
    private Long UserTotal;

    /**
    * <p>目录接入时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>目录下的组织细节信息</p>
    */
    @SerializedName("UserOrgSet")
    @Expose
    private UserOrg [] UserOrgSet;

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
    * <p>下次同步时间</p><p>参数格式：2026-06-05T11:30:00+08:00</p>
    */
    @SerializedName("NextSyncTime")
    @Expose
    private String NextSyncTime;

    /**
     * Get <p>目录id</p> 
     * @return Id <p>目录id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>目录id</p>
     * @param Id <p>目录id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>ioa目录id</p> 
     * @return DirId <p>ioa目录id</p>
     */
    public Long getDirId() {
        return this.DirId;
    }

    /**
     * Set <p>ioa目录id</p>
     * @param DirId <p>ioa目录id</p>
     */
    public void setDirId(Long DirId) {
        this.DirId = DirId;
    }

    /**
     * Get <p>ioa目录名称</p> 
     * @return DirName <p>ioa目录名称</p>
     */
    public String getDirName() {
        return this.DirName;
    }

    /**
     * Set <p>ioa目录名称</p>
     * @param DirName <p>ioa目录名称</p>
     */
    public void setDirName(String DirName) {
        this.DirName = DirName;
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
     * @return UserTotal <p>目录包含用户数</p>
     */
    public Long getUserTotal() {
        return this.UserTotal;
    }

    /**
     * Set <p>目录包含用户数</p>
     * @param UserTotal <p>目录包含用户数</p>
     */
    public void setUserTotal(Long UserTotal) {
        this.UserTotal = UserTotal;
    }

    /**
     * Get <p>目录接入时间</p> 
     * @return CreateTime <p>目录接入时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>目录接入时间</p>
     * @param CreateTime <p>目录接入时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>目录下的组织细节信息</p> 
     * @return UserOrgSet <p>目录下的组织细节信息</p>
     */
    public UserOrg [] getUserOrgSet() {
        return this.UserOrgSet;
    }

    /**
     * Set <p>目录下的组织细节信息</p>
     * @param UserOrgSet <p>目录下的组织细节信息</p>
     */
    public void setUserOrgSet(UserOrg [] UserOrgSet) {
        this.UserOrgSet = UserOrgSet;
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

    /**
     * Get <p>下次同步时间</p><p>参数格式：2026-06-05T11:30:00+08:00</p> 
     * @return NextSyncTime <p>下次同步时间</p><p>参数格式：2026-06-05T11:30:00+08:00</p>
     */
    public String getNextSyncTime() {
        return this.NextSyncTime;
    }

    /**
     * Set <p>下次同步时间</p><p>参数格式：2026-06-05T11:30:00+08:00</p>
     * @param NextSyncTime <p>下次同步时间</p><p>参数格式：2026-06-05T11:30:00+08:00</p>
     */
    public void setNextSyncTime(String NextSyncTime) {
        this.NextSyncTime = NextSyncTime;
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
        if (source.AutoSync != null) {
            this.AutoSync = new Boolean(source.AutoSync);
        }
        if (source.SyncCron != null) {
            this.SyncCron = new String(source.SyncCron);
        }
        if (source.NextSyncTime != null) {
            this.NextSyncTime = new String(source.NextSyncTime);
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
        this.setParamSimple(map, prefix + "AutoSync", this.AutoSync);
        this.setParamSimple(map, prefix + "SyncCron", this.SyncCron);
        this.setParamSimple(map, prefix + "NextSyncTime", this.NextSyncTime);

    }
}

