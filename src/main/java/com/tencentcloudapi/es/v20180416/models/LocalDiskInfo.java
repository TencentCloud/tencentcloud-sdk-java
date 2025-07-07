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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalDiskInfo extends AbstractModel {

    /**
    * 本地盘类型<li>LOCAL_SATA：大数据型</li><li>NVME_SSD：高IO型</li>
    */
    @SerializedName("LocalDiskType")
    @Expose
    private String LocalDiskType;

    /**
    * 本地盘单盘大小
    */
    @SerializedName("LocalDiskSize")
    @Expose
    private Long LocalDiskSize;

    /**
    * 本地盘块数
    */
    @SerializedName("LocalDiskCount")
    @Expose
    private Long LocalDiskCount;

    /**
     * Get 本地盘类型<li>LOCAL_SATA：大数据型</li><li>NVME_SSD：高IO型</li> 
     * @return LocalDiskType 本地盘类型<li>LOCAL_SATA：大数据型</li><li>NVME_SSD：高IO型</li>
     */
    public String getLocalDiskType() {
        return this.LocalDiskType;
    }

    /**
     * Set 本地盘类型<li>LOCAL_SATA：大数据型</li><li>NVME_SSD：高IO型</li>
     * @param LocalDiskType 本地盘类型<li>LOCAL_SATA：大数据型</li><li>NVME_SSD：高IO型</li>
     */
    public void setLocalDiskType(String LocalDiskType) {
        this.LocalDiskType = LocalDiskType;
    }

    /**
     * Get 本地盘单盘大小 
     * @return LocalDiskSize 本地盘单盘大小
     */
    public Long getLocalDiskSize() {
        return this.LocalDiskSize;
    }

    /**
     * Set 本地盘单盘大小
     * @param LocalDiskSize 本地盘单盘大小
     */
    public void setLocalDiskSize(Long LocalDiskSize) {
        this.LocalDiskSize = LocalDiskSize;
    }

    /**
     * Get 本地盘块数 
     * @return LocalDiskCount 本地盘块数
     */
    public Long getLocalDiskCount() {
        return this.LocalDiskCount;
    }

    /**
     * Set 本地盘块数
     * @param LocalDiskCount 本地盘块数
     */
    public void setLocalDiskCount(Long LocalDiskCount) {
        this.LocalDiskCount = LocalDiskCount;
    }

    public LocalDiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalDiskInfo(LocalDiskInfo source) {
        if (source.LocalDiskType != null) {
            this.LocalDiskType = new String(source.LocalDiskType);
        }
        if (source.LocalDiskSize != null) {
            this.LocalDiskSize = new Long(source.LocalDiskSize);
        }
        if (source.LocalDiskCount != null) {
            this.LocalDiskCount = new Long(source.LocalDiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalDiskType", this.LocalDiskType);
        this.setParamSimple(map, prefix + "LocalDiskSize", this.LocalDiskSize);
        this.setParamSimple(map, prefix + "LocalDiskCount", this.LocalDiskCount);

    }
}

