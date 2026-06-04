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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppOperation extends AbstractModel {

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建人UIN
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 创建人账号(私有化场景使用)
    */
    @SerializedName("CreatorUserAccount")
    @Expose
    private String CreatorUserAccount;

    /**
    * 修改时间 (Unix时间戳,秒级)
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 最后修改人
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
    * 修改人UIN
    */
    @SerializedName("UpdaterUin")
    @Expose
    private String UpdaterUin;

    /**
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建人UIN 
     * @return CreatorUin 创建人UIN
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建人UIN
     * @param CreatorUin 创建人UIN
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 创建人账号(私有化场景使用) 
     * @return CreatorUserAccount 创建人账号(私有化场景使用)
     */
    public String getCreatorUserAccount() {
        return this.CreatorUserAccount;
    }

    /**
     * Set 创建人账号(私有化场景使用)
     * @param CreatorUserAccount 创建人账号(私有化场景使用)
     */
    public void setCreatorUserAccount(String CreatorUserAccount) {
        this.CreatorUserAccount = CreatorUserAccount;
    }

    /**
     * Get 修改时间 (Unix时间戳,秒级) 
     * @return UpdateTime 修改时间 (Unix时间戳,秒级)
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间 (Unix时间戳,秒级)
     * @param UpdateTime 修改时间 (Unix时间戳,秒级)
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 最后修改人 
     * @return Updater 最后修改人
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set 最后修改人
     * @param Updater 最后修改人
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
    }

    /**
     * Get 修改人UIN 
     * @return UpdaterUin 修改人UIN
     */
    public String getUpdaterUin() {
        return this.UpdaterUin;
    }

    /**
     * Set 修改人UIN
     * @param UpdaterUin 修改人UIN
     */
    public void setUpdaterUin(String UpdaterUin) {
        this.UpdaterUin = UpdaterUin;
    }

    public AppOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppOperation(AppOperation source) {
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.CreatorUserAccount != null) {
            this.CreatorUserAccount = new String(source.CreatorUserAccount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
        }
        if (source.UpdaterUin != null) {
            this.UpdaterUin = new String(source.UpdaterUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreatorUserAccount", this.CreatorUserAccount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Updater", this.Updater);
        this.setParamSimple(map, prefix + "UpdaterUin", this.UpdaterUin);

    }
}

