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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageInfo extends AbstractModel {

    /**
    * 挂载路径
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * cos挂载信息
    */
    @SerializedName("COSStorage")
    @Expose
    private COSStorage COSStorage;

    /**
     * Get 挂载路径 
     * @return MountPath 挂载路径
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 挂载路径
     * @param MountPath 挂载路径
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get cos挂载信息 
     * @return COSStorage cos挂载信息
     */
    public COSStorage getCOSStorage() {
        return this.COSStorage;
    }

    /**
     * Set cos挂载信息
     * @param COSStorage cos挂载信息
     */
    public void setCOSStorage(COSStorage COSStorage) {
        this.COSStorage = COSStorage;
    }

    public StorageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageInfo(StorageInfo source) {
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.COSStorage != null) {
            this.COSStorage = new COSStorage(source.COSStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamObj(map, prefix + "COSStorage.", this.COSStorage);

    }
}

