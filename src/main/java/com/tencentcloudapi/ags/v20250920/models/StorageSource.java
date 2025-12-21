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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageSource extends AbstractModel {

    /**
    * 对象存储桶配置
    */
    @SerializedName("Cos")
    @Expose
    private CosStorageSource Cos;

    /**
     * Get 对象存储桶配置 
     * @return Cos 对象存储桶配置
     */
    public CosStorageSource getCos() {
        return this.Cos;
    }

    /**
     * Set 对象存储桶配置
     * @param Cos 对象存储桶配置
     */
    public void setCos(CosStorageSource Cos) {
        this.Cos = Cos;
    }

    public StorageSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageSource(StorageSource source) {
        if (source.Cos != null) {
            this.Cos = new CosStorageSource(source.Cos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Cos.", this.Cos);

    }
}

