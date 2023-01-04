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

public class ModifyRemoteBackupConfigRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 异地数据备份开关，off - 关闭异地备份，on-开启异地备份
    */
    @SerializedName("RemoteBackupSave")
    @Expose
    private String RemoteBackupSave;

    /**
    * 异地日志备份开关，off - 关闭异地备份，on-开启异地备份，只有在参数RemoteBackupSave为on时，RemoteBinlogSave参数才可设置为on
    */
    @SerializedName("RemoteBinlogSave")
    @Expose
    private String RemoteBinlogSave;

    /**
    * 用户设置异地备份地域列表
    */
    @SerializedName("RemoteRegion")
    @Expose
    private String [] RemoteRegion;

    /**
    * 异地备份保留时间，单位为天
    */
    @SerializedName("ExpireDays")
    @Expose
    private Long ExpireDays;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 异地数据备份开关，off - 关闭异地备份，on-开启异地备份 
     * @return RemoteBackupSave 异地数据备份开关，off - 关闭异地备份，on-开启异地备份
     */
    public String getRemoteBackupSave() {
        return this.RemoteBackupSave;
    }

    /**
     * Set 异地数据备份开关，off - 关闭异地备份，on-开启异地备份
     * @param RemoteBackupSave 异地数据备份开关，off - 关闭异地备份，on-开启异地备份
     */
    public void setRemoteBackupSave(String RemoteBackupSave) {
        this.RemoteBackupSave = RemoteBackupSave;
    }

    /**
     * Get 异地日志备份开关，off - 关闭异地备份，on-开启异地备份，只有在参数RemoteBackupSave为on时，RemoteBinlogSave参数才可设置为on 
     * @return RemoteBinlogSave 异地日志备份开关，off - 关闭异地备份，on-开启异地备份，只有在参数RemoteBackupSave为on时，RemoteBinlogSave参数才可设置为on
     */
    public String getRemoteBinlogSave() {
        return this.RemoteBinlogSave;
    }

    /**
     * Set 异地日志备份开关，off - 关闭异地备份，on-开启异地备份，只有在参数RemoteBackupSave为on时，RemoteBinlogSave参数才可设置为on
     * @param RemoteBinlogSave 异地日志备份开关，off - 关闭异地备份，on-开启异地备份，只有在参数RemoteBackupSave为on时，RemoteBinlogSave参数才可设置为on
     */
    public void setRemoteBinlogSave(String RemoteBinlogSave) {
        this.RemoteBinlogSave = RemoteBinlogSave;
    }

    /**
     * Get 用户设置异地备份地域列表 
     * @return RemoteRegion 用户设置异地备份地域列表
     */
    public String [] getRemoteRegion() {
        return this.RemoteRegion;
    }

    /**
     * Set 用户设置异地备份地域列表
     * @param RemoteRegion 用户设置异地备份地域列表
     */
    public void setRemoteRegion(String [] RemoteRegion) {
        this.RemoteRegion = RemoteRegion;
    }

    /**
     * Get 异地备份保留时间，单位为天 
     * @return ExpireDays 异地备份保留时间，单位为天
     */
    public Long getExpireDays() {
        return this.ExpireDays;
    }

    /**
     * Set 异地备份保留时间，单位为天
     * @param ExpireDays 异地备份保留时间，单位为天
     */
    public void setExpireDays(Long ExpireDays) {
        this.ExpireDays = ExpireDays;
    }

    public ModifyRemoteBackupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRemoteBackupConfigRequest(ModifyRemoteBackupConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RemoteBackupSave != null) {
            this.RemoteBackupSave = new String(source.RemoteBackupSave);
        }
        if (source.RemoteBinlogSave != null) {
            this.RemoteBinlogSave = new String(source.RemoteBinlogSave);
        }
        if (source.RemoteRegion != null) {
            this.RemoteRegion = new String[source.RemoteRegion.length];
            for (int i = 0; i < source.RemoteRegion.length; i++) {
                this.RemoteRegion[i] = new String(source.RemoteRegion[i]);
            }
        }
        if (source.ExpireDays != null) {
            this.ExpireDays = new Long(source.ExpireDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RemoteBackupSave", this.RemoteBackupSave);
        this.setParamSimple(map, prefix + "RemoteBinlogSave", this.RemoteBinlogSave);
        this.setParamArraySimple(map, prefix + "RemoteRegion.", this.RemoteRegion);
        this.setParamSimple(map, prefix + "ExpireDays", this.ExpireDays);

    }
}

