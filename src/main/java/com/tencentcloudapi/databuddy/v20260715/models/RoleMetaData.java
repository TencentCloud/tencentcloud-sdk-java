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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleMetaData extends AbstractModel {

    /**
    * 创建者
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新者
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 创建者 
     * @return Creator 创建者
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者
     * @param Creator 创建者
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新者 
     * @return Updater 更新者
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set 更新者
     * @param Updater 更新者
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RoleMetaData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleMetaData(RoleMetaData source) {
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Updater", this.Updater);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

