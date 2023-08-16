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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRollbackRangeTimeRequest extends AbstractModel{

    /**
    * 实例 ID 列表，单个实例 ID 的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 克隆实例与源实例是否在异地可用区，是:"true"，否:"false"
    */
    @SerializedName("IsRemoteZone")
    @Expose
    private String IsRemoteZone;

    /**
    * 克隆实例与源实例不在同一地域时需填写克隆实例所在地域，例："ap-guangzhou"
    */
    @SerializedName("BackupRegion")
    @Expose
    private String BackupRegion;

    /**
     * Get 实例 ID 列表，单个实例 ID 的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceIds 实例 ID 列表，单个实例 ID 的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID 列表，单个实例 ID 的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceIds 实例 ID 列表，单个实例 ID 的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 克隆实例与源实例是否在异地可用区，是:"true"，否:"false" 
     * @return IsRemoteZone 克隆实例与源实例是否在异地可用区，是:"true"，否:"false"
     */
    public String getIsRemoteZone() {
        return this.IsRemoteZone;
    }

    /**
     * Set 克隆实例与源实例是否在异地可用区，是:"true"，否:"false"
     * @param IsRemoteZone 克隆实例与源实例是否在异地可用区，是:"true"，否:"false"
     */
    public void setIsRemoteZone(String IsRemoteZone) {
        this.IsRemoteZone = IsRemoteZone;
    }

    /**
     * Get 克隆实例与源实例不在同一地域时需填写克隆实例所在地域，例："ap-guangzhou" 
     * @return BackupRegion 克隆实例与源实例不在同一地域时需填写克隆实例所在地域，例："ap-guangzhou"
     */
    public String getBackupRegion() {
        return this.BackupRegion;
    }

    /**
     * Set 克隆实例与源实例不在同一地域时需填写克隆实例所在地域，例："ap-guangzhou"
     * @param BackupRegion 克隆实例与源实例不在同一地域时需填写克隆实例所在地域，例："ap-guangzhou"
     */
    public void setBackupRegion(String BackupRegion) {
        this.BackupRegion = BackupRegion;
    }

    public DescribeRollbackRangeTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRollbackRangeTimeRequest(DescribeRollbackRangeTimeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.IsRemoteZone != null) {
            this.IsRemoteZone = new String(source.IsRemoteZone);
        }
        if (source.BackupRegion != null) {
            this.BackupRegion = new String(source.BackupRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "IsRemoteZone", this.IsRemoteZone);
        this.setParamSimple(map, prefix + "BackupRegion", this.BackupRegion);

    }
}

