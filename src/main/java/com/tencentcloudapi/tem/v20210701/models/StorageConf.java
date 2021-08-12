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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageConf extends AbstractModel{

    /**
    * 存储卷名称
    */
    @SerializedName("StorageVolName")
    @Expose
    private String StorageVolName;

    /**
    * 存储卷路径
    */
    @SerializedName("StorageVolPath")
    @Expose
    private String StorageVolPath;

    /**
    * 存储卷IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageVolIp")
    @Expose
    private String StorageVolIp;

    /**
     * Get 存储卷名称 
     * @return StorageVolName 存储卷名称
     */
    public String getStorageVolName() {
        return this.StorageVolName;
    }

    /**
     * Set 存储卷名称
     * @param StorageVolName 存储卷名称
     */
    public void setStorageVolName(String StorageVolName) {
        this.StorageVolName = StorageVolName;
    }

    /**
     * Get 存储卷路径 
     * @return StorageVolPath 存储卷路径
     */
    public String getStorageVolPath() {
        return this.StorageVolPath;
    }

    /**
     * Set 存储卷路径
     * @param StorageVolPath 存储卷路径
     */
    public void setStorageVolPath(String StorageVolPath) {
        this.StorageVolPath = StorageVolPath;
    }

    /**
     * Get 存储卷IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageVolIp 存储卷IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageVolIp() {
        return this.StorageVolIp;
    }

    /**
     * Set 存储卷IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageVolIp 存储卷IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageVolIp(String StorageVolIp) {
        this.StorageVolIp = StorageVolIp;
    }

    public StorageConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageConf(StorageConf source) {
        if (source.StorageVolName != null) {
            this.StorageVolName = new String(source.StorageVolName);
        }
        if (source.StorageVolPath != null) {
            this.StorageVolPath = new String(source.StorageVolPath);
        }
        if (source.StorageVolIp != null) {
            this.StorageVolIp = new String(source.StorageVolIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageVolName", this.StorageVolName);
        this.setParamSimple(map, prefix + "StorageVolPath", this.StorageVolPath);
        this.setParamSimple(map, prefix + "StorageVolIp", this.StorageVolIp);

    }
}

