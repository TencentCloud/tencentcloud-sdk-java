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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageMount extends AbstractModel {

    /**
    * 挂载源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标挂载位置
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 挂载的存储类型，目前仅支持：local
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get 挂载源 
     * @return Source 挂载源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 挂载源
     * @param Source 挂载源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标挂载位置 
     * @return Target 目标挂载位置
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标挂载位置
     * @param Target 目标挂载位置
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 挂载的存储类型，目前仅支持：local 
     * @return StorageType 挂载的存储类型，目前仅支持：local
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 挂载的存储类型，目前仅支持：local
     * @param StorageType 挂载的存储类型，目前仅支持：local
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public StorageMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageMount(StorageMount source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

