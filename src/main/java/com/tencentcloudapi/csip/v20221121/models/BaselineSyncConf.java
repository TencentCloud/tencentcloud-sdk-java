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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineSyncConf extends AbstractModel {

    /**
    * <p>是否开启向成员账号自动同步基线配置。true 开启，false 关闭。</p>
    */
    @SerializedName("AutoSync")
    @Expose
    private Boolean AutoSync;

    /**
    * <p>自动同步的目标成员账号 Appid 列表，AutoSync=true 时生效。</p>
    */
    @SerializedName("TargetAppidList")
    @Expose
    private Long [] TargetAppidList;

    /**
    * <p>用户配置列表</p>
    */
    @SerializedName("UserConfList")
    @Expose
    private UserConfSyncStatus [] UserConfList;

    /**
     * Get <p>是否开启向成员账号自动同步基线配置。true 开启，false 关闭。</p> 
     * @return AutoSync <p>是否开启向成员账号自动同步基线配置。true 开启，false 关闭。</p>
     */
    public Boolean getAutoSync() {
        return this.AutoSync;
    }

    /**
     * Set <p>是否开启向成员账号自动同步基线配置。true 开启，false 关闭。</p>
     * @param AutoSync <p>是否开启向成员账号自动同步基线配置。true 开启，false 关闭。</p>
     */
    public void setAutoSync(Boolean AutoSync) {
        this.AutoSync = AutoSync;
    }

    /**
     * Get <p>自动同步的目标成员账号 Appid 列表，AutoSync=true 时生效。</p> 
     * @return TargetAppidList <p>自动同步的目标成员账号 Appid 列表，AutoSync=true 时生效。</p>
     */
    public Long [] getTargetAppidList() {
        return this.TargetAppidList;
    }

    /**
     * Set <p>自动同步的目标成员账号 Appid 列表，AutoSync=true 时生效。</p>
     * @param TargetAppidList <p>自动同步的目标成员账号 Appid 列表，AutoSync=true 时生效。</p>
     */
    public void setTargetAppidList(Long [] TargetAppidList) {
        this.TargetAppidList = TargetAppidList;
    }

    /**
     * Get <p>用户配置列表</p> 
     * @return UserConfList <p>用户配置列表</p>
     */
    public UserConfSyncStatus [] getUserConfList() {
        return this.UserConfList;
    }

    /**
     * Set <p>用户配置列表</p>
     * @param UserConfList <p>用户配置列表</p>
     */
    public void setUserConfList(UserConfSyncStatus [] UserConfList) {
        this.UserConfList = UserConfList;
    }

    public BaselineSyncConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineSyncConf(BaselineSyncConf source) {
        if (source.AutoSync != null) {
            this.AutoSync = new Boolean(source.AutoSync);
        }
        if (source.TargetAppidList != null) {
            this.TargetAppidList = new Long[source.TargetAppidList.length];
            for (int i = 0; i < source.TargetAppidList.length; i++) {
                this.TargetAppidList[i] = new Long(source.TargetAppidList[i]);
            }
        }
        if (source.UserConfList != null) {
            this.UserConfList = new UserConfSyncStatus[source.UserConfList.length];
            for (int i = 0; i < source.UserConfList.length; i++) {
                this.UserConfList[i] = new UserConfSyncStatus(source.UserConfList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSync", this.AutoSync);
        this.setParamArraySimple(map, prefix + "TargetAppidList.", this.TargetAppidList);
        this.setParamArrayObj(map, prefix + "UserConfList.", this.UserConfList);

    }
}

