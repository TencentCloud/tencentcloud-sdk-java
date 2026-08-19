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

public class UserConfSyncStatus extends AbstractModel {

    /**
    * <p>用户AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>是否允许管理员同步</p>
    */
    @SerializedName("AllowSync")
    @Expose
    private Boolean AllowSync;

    /**
    * <p>是否在配置中</p>
    */
    @SerializedName("InConf")
    @Expose
    private Boolean InConf;

    /**
    * <p>是否被其他管理员同步</p>
    */
    @SerializedName("ManagedByOther")
    @Expose
    private Boolean ManagedByOther;

    /**
     * Get <p>用户AppID</p> 
     * @return AppID <p>用户AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>用户AppID</p>
     * @param AppID <p>用户AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>是否允许管理员同步</p> 
     * @return AllowSync <p>是否允许管理员同步</p>
     */
    public Boolean getAllowSync() {
        return this.AllowSync;
    }

    /**
     * Set <p>是否允许管理员同步</p>
     * @param AllowSync <p>是否允许管理员同步</p>
     */
    public void setAllowSync(Boolean AllowSync) {
        this.AllowSync = AllowSync;
    }

    /**
     * Get <p>是否在配置中</p> 
     * @return InConf <p>是否在配置中</p>
     */
    public Boolean getInConf() {
        return this.InConf;
    }

    /**
     * Set <p>是否在配置中</p>
     * @param InConf <p>是否在配置中</p>
     */
    public void setInConf(Boolean InConf) {
        this.InConf = InConf;
    }

    /**
     * Get <p>是否被其他管理员同步</p> 
     * @return ManagedByOther <p>是否被其他管理员同步</p>
     */
    public Boolean getManagedByOther() {
        return this.ManagedByOther;
    }

    /**
     * Set <p>是否被其他管理员同步</p>
     * @param ManagedByOther <p>是否被其他管理员同步</p>
     */
    public void setManagedByOther(Boolean ManagedByOther) {
        this.ManagedByOther = ManagedByOther;
    }

    public UserConfSyncStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserConfSyncStatus(UserConfSyncStatus source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.AllowSync != null) {
            this.AllowSync = new Boolean(source.AllowSync);
        }
        if (source.InConf != null) {
            this.InConf = new Boolean(source.InConf);
        }
        if (source.ManagedByOther != null) {
            this.ManagedByOther = new Boolean(source.ManagedByOther);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "AllowSync", this.AllowSync);
        this.setParamSimple(map, prefix + "InConf", this.InConf);
        this.setParamSimple(map, prefix + "ManagedByOther", this.ManagedByOther);

    }
}

