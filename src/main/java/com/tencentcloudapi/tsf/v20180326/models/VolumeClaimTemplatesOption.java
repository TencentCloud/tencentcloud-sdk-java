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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeClaimTemplatesOption extends AbstractModel {

    /**
    * StorageClass名称
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
    * 访问模式
    */
    @SerializedName("AccessModes")
    @Expose
    private String [] AccessModes;

    /**
    * 卷空间的预占声明
    */
    @SerializedName("StorageRequest")
    @Expose
    private Long StorageRequest;

    /**
     * Get StorageClass名称 
     * @return StorageClass StorageClass名称
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set StorageClass名称
     * @param StorageClass StorageClass名称
     */
    public void setStorageClass(String StorageClass) {
        this.StorageClass = StorageClass;
    }

    /**
     * Get 访问模式 
     * @return AccessModes 访问模式
     */
    public String [] getAccessModes() {
        return this.AccessModes;
    }

    /**
     * Set 访问模式
     * @param AccessModes 访问模式
     */
    public void setAccessModes(String [] AccessModes) {
        this.AccessModes = AccessModes;
    }

    /**
     * Get 卷空间的预占声明 
     * @return StorageRequest 卷空间的预占声明
     */
    public Long getStorageRequest() {
        return this.StorageRequest;
    }

    /**
     * Set 卷空间的预占声明
     * @param StorageRequest 卷空间的预占声明
     */
    public void setStorageRequest(Long StorageRequest) {
        this.StorageRequest = StorageRequest;
    }

    public VolumeClaimTemplatesOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeClaimTemplatesOption(VolumeClaimTemplatesOption source) {
        if (source.StorageClass != null) {
            this.StorageClass = new String(source.StorageClass);
        }
        if (source.AccessModes != null) {
            this.AccessModes = new String[source.AccessModes.length];
            for (int i = 0; i < source.AccessModes.length; i++) {
                this.AccessModes[i] = new String(source.AccessModes[i]);
            }
        }
        if (source.StorageRequest != null) {
            this.StorageRequest = new Long(source.StorageRequest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageClass", this.StorageClass);
        this.setParamArraySimple(map, prefix + "AccessModes.", this.AccessModes);
        this.setParamSimple(map, prefix + "StorageRequest", this.StorageRequest);

    }
}

