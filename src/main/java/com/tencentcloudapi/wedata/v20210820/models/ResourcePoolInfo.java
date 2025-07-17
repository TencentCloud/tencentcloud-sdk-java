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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourcePoolInfo extends AbstractModel {

    /**
    * 资源池id
    */
    @SerializedName("ResourcePools")
    @Expose
    private String [] ResourcePools;

    /**
    * 存储空间大小，单位 MB
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 存储文件数大小
    */
    @SerializedName("StorageFileNum")
    @Expose
    private Long StorageFileNum;

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 存储类型，0 代表HDFS，1 代表OZONE
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get 资源池id 
     * @return ResourcePools 资源池id
     */
    public String [] getResourcePools() {
        return this.ResourcePools;
    }

    /**
     * Set 资源池id
     * @param ResourcePools 资源池id
     */
    public void setResourcePools(String [] ResourcePools) {
        this.ResourcePools = ResourcePools;
    }

    /**
     * Get 存储空间大小，单位 MB 
     * @return StorageSize 存储空间大小，单位 MB
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 存储空间大小，单位 MB
     * @param StorageSize 存储空间大小，单位 MB
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 存储文件数大小 
     * @return StorageFileNum 存储文件数大小
     */
    public Long getStorageFileNum() {
        return this.StorageFileNum;
    }

    /**
     * Set 存储文件数大小
     * @param StorageFileNum 存储文件数大小
     */
    public void setStorageFileNum(Long StorageFileNum) {
        this.StorageFileNum = StorageFileNum;
    }

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 存储类型，0 代表HDFS，1 代表OZONE 
     * @return StorageType 存储类型，0 代表HDFS，1 代表OZONE
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型，0 代表HDFS，1 代表OZONE
     * @param StorageType 存储类型，0 代表HDFS，1 代表OZONE
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public ResourcePoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePoolInfo(ResourcePoolInfo source) {
        if (source.ResourcePools != null) {
            this.ResourcePools = new String[source.ResourcePools.length];
            for (int i = 0; i < source.ResourcePools.length; i++) {
                this.ResourcePools[i] = new String(source.ResourcePools[i]);
            }
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.StorageFileNum != null) {
            this.StorageFileNum = new Long(source.StorageFileNum);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourcePools.", this.ResourcePools);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "StorageFileNum", this.StorageFileNum);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

