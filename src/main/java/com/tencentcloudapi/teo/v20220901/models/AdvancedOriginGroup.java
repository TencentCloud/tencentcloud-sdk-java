/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedOriginGroup extends AbstractModel{

    /**
    * 高级回源配置的匹配条件。其中相同的Target只能出现一次。
    */
    @SerializedName("OriginGroupConditions")
    @Expose
    private OriginGroupCondition [] OriginGroupConditions;

    /**
    * 主源站组ID。
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * 备用源站组ID。
    */
    @SerializedName("BackupOriginGroupId")
    @Expose
    private String BackupOriginGroupId;

    /**
     * Get 高级回源配置的匹配条件。其中相同的Target只能出现一次。 
     * @return OriginGroupConditions 高级回源配置的匹配条件。其中相同的Target只能出现一次。
     */
    public OriginGroupCondition [] getOriginGroupConditions() {
        return this.OriginGroupConditions;
    }

    /**
     * Set 高级回源配置的匹配条件。其中相同的Target只能出现一次。
     * @param OriginGroupConditions 高级回源配置的匹配条件。其中相同的Target只能出现一次。
     */
    public void setOriginGroupConditions(OriginGroupCondition [] OriginGroupConditions) {
        this.OriginGroupConditions = OriginGroupConditions;
    }

    /**
     * Get 主源站组ID。 
     * @return OriginGroupId 主源站组ID。
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set 主源站组ID。
     * @param OriginGroupId 主源站组ID。
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    /**
     * Get 备用源站组ID。 
     * @return BackupOriginGroupId 备用源站组ID。
     */
    public String getBackupOriginGroupId() {
        return this.BackupOriginGroupId;
    }

    /**
     * Set 备用源站组ID。
     * @param BackupOriginGroupId 备用源站组ID。
     */
    public void setBackupOriginGroupId(String BackupOriginGroupId) {
        this.BackupOriginGroupId = BackupOriginGroupId;
    }

    public AdvancedOriginGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedOriginGroup(AdvancedOriginGroup source) {
        if (source.OriginGroupConditions != null) {
            this.OriginGroupConditions = new OriginGroupCondition[source.OriginGroupConditions.length];
            for (int i = 0; i < source.OriginGroupConditions.length; i++) {
                this.OriginGroupConditions[i] = new OriginGroupCondition(source.OriginGroupConditions[i]);
            }
        }
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.BackupOriginGroupId != null) {
            this.BackupOriginGroupId = new String(source.BackupOriginGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OriginGroupConditions.", this.OriginGroupConditions);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamSimple(map, prefix + "BackupOriginGroupId", this.BackupOriginGroupId);

    }
}

