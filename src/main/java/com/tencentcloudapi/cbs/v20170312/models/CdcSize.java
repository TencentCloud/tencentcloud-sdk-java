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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdcSize extends AbstractModel {

    /**
    * 独享集群的总容量大小，单位GiB
    */
    @SerializedName("DiskTotal")
    @Expose
    private Long DiskTotal;

    /**
    * 独享集群的可用容量大小，单位GiB
    */
    @SerializedName("DiskAvailable")
    @Expose
    private Long DiskAvailable;

    /**
     * Get 独享集群的总容量大小，单位GiB 
     * @return DiskTotal 独享集群的总容量大小，单位GiB
     */
    public Long getDiskTotal() {
        return this.DiskTotal;
    }

    /**
     * Set 独享集群的总容量大小，单位GiB
     * @param DiskTotal 独享集群的总容量大小，单位GiB
     */
    public void setDiskTotal(Long DiskTotal) {
        this.DiskTotal = DiskTotal;
    }

    /**
     * Get 独享集群的可用容量大小，单位GiB 
     * @return DiskAvailable 独享集群的可用容量大小，单位GiB
     */
    public Long getDiskAvailable() {
        return this.DiskAvailable;
    }

    /**
     * Set 独享集群的可用容量大小，单位GiB
     * @param DiskAvailable 独享集群的可用容量大小，单位GiB
     */
    public void setDiskAvailable(Long DiskAvailable) {
        this.DiskAvailable = DiskAvailable;
    }

    public CdcSize() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdcSize(CdcSize source) {
        if (source.DiskTotal != null) {
            this.DiskTotal = new Long(source.DiskTotal);
        }
        if (source.DiskAvailable != null) {
            this.DiskAvailable = new Long(source.DiskAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskTotal", this.DiskTotal);
        this.setParamSimple(map, prefix + "DiskAvailable", this.DiskAvailable);

    }
}

