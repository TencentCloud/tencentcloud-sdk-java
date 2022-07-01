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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnlockMetaDataRequest extends AbstractModel{

    /**
    * 锁ID
    */
    @SerializedName("LockId")
    @Expose
    private Long LockId;

    /**
    * 数据源名称
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
     * Get 锁ID 
     * @return LockId 锁ID
     */
    public Long getLockId() {
        return this.LockId;
    }

    /**
     * Set 锁ID
     * @param LockId 锁ID
     */
    public void setLockId(Long LockId) {
        this.LockId = LockId;
    }

    /**
     * Get 数据源名称 
     * @return DatasourceConnectionName 数据源名称
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据源名称
     * @param DatasourceConnectionName 数据源名称
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    public UnlockMetaDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnlockMetaDataRequest(UnlockMetaDataRequest source) {
        if (source.LockId != null) {
            this.LockId = new Long(source.LockId);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LockId", this.LockId);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);

    }
}

