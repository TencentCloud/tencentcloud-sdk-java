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

public class ModifyBackupEncryptionStatusRequest extends AbstractModel{

    /**
    * 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设置实例新增的自动物理备份文件默认加密状态。可选值为 on或者off。
    */
    @SerializedName("EncryptionStatus")
    @Expose
    private String EncryptionStatus;

    /**
     * Get 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 设置实例新增的自动物理备份文件默认加密状态。可选值为 on或者off。 
     * @return EncryptionStatus 设置实例新增的自动物理备份文件默认加密状态。可选值为 on或者off。
     */
    public String getEncryptionStatus() {
        return this.EncryptionStatus;
    }

    /**
     * Set 设置实例新增的自动物理备份文件默认加密状态。可选值为 on或者off。
     * @param EncryptionStatus 设置实例新增的自动物理备份文件默认加密状态。可选值为 on或者off。
     */
    public void setEncryptionStatus(String EncryptionStatus) {
        this.EncryptionStatus = EncryptionStatus;
    }

    public ModifyBackupEncryptionStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupEncryptionStatusRequest(ModifyBackupEncryptionStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EncryptionStatus != null) {
            this.EncryptionStatus = new String(source.EncryptionStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EncryptionStatus", this.EncryptionStatus);

    }
}

