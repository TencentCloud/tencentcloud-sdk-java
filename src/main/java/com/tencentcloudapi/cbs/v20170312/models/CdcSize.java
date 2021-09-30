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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdcSize extends AbstractModel{

    /**
    * 独享集群的可用容量大小，单位GiB
    */
    @SerializedName("DiskAavilable")
    @Expose
    private Long DiskAavilable;

    /**
    * 独享集群的总容量大小，单位GiB
    */
    @SerializedName("DiskTotal")
    @Expose
    private Long DiskTotal;

    /**
     * Get 独享集群的可用容量大小，单位GiB 
     * @return DiskAavilable 独享集群的可用容量大小，单位GiB
     */
    public Long getDiskAavilable() {
        return this.DiskAavilable;
    }

    /**
     * Set 独享集群的可用容量大小，单位GiB
     * @param DiskAavilable 独享集群的可用容量大小，单位GiB
     */
    public void setDiskAavilable(Long DiskAavilable) {
        this.DiskAavilable = DiskAavilable;
    }

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

    public CdcSize() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdcSize(CdcSize source) {
        if (source.DiskAavilable != null) {
            this.DiskAavilable = new Long(source.DiskAavilable);
        }
        if (source.DiskTotal != null) {
            this.DiskTotal = new Long(source.DiskTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskAavilable", this.DiskAavilable);
        this.setParamSimple(map, prefix + "DiskTotal", this.DiskTotal);

    }
}

