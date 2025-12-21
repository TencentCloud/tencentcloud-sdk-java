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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidInstanceBackup extends AbstractModel {

    /**
    * 备份ID
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 备份状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 大小，单位 Byte
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 备份的安卓实例 ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 备份ID 
     * @return BackupId 备份ID
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份ID
     * @param BackupId 备份ID
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份状态 
     * @return State 备份状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 备份状态
     * @param State 备份状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 大小，单位 Byte 
     * @return Size 大小，单位 Byte
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 大小，单位 Byte
     * @param Size 大小，单位 Byte
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 备份的安卓实例 ID 
     * @return AndroidInstanceId 备份的安卓实例 ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 备份的安卓实例 ID
     * @param AndroidInstanceId 备份的安卓实例 ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
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

    public AndroidInstanceBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidInstanceBackup(AndroidInstanceBackup source) {
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

