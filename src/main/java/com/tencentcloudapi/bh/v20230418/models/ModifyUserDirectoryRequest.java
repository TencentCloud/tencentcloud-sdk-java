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

public class ModifyUserDirectoryRequest extends AbstractModel {

    /**
    * <p>目录id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>ioa分组信息</p>
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

    public ModifyUserDirectoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserDirectoryRequest(ModifyUserDirectoryRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "UserOrgSet.", this.UserOrgSet);
        this.setParamSimple(map, prefix + "AutoSync", this.AutoSync);
        this.setParamSimple(map, prefix + "SyncCron", this.SyncCron);

    }
}

