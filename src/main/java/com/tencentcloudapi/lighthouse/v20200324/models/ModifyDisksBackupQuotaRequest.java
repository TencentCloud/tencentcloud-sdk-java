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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDisksBackupQuotaRequest extends AbstractModel {

    /**
    * 云硬盘ID列表，可通过[DescribeDisks](https://cloud.tencent.com/document/api/1207/66093)接口查询。列表最大长度为15。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 云硬盘备份点配额。取值范围: [0, 500]。调整后的配额必须大于等于已存在的备份点数量。
    */
    @SerializedName("DiskBackupQuota")
    @Expose
    private Long DiskBackupQuota;

    /**
     * Get 云硬盘ID列表，可通过[DescribeDisks](https://cloud.tencent.com/document/api/1207/66093)接口查询。列表最大长度为15。 
     * @return DiskIds 云硬盘ID列表，可通过[DescribeDisks](https://cloud.tencent.com/document/api/1207/66093)接口查询。列表最大长度为15。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 云硬盘ID列表，可通过[DescribeDisks](https://cloud.tencent.com/document/api/1207/66093)接口查询。列表最大长度为15。
     * @param DiskIds 云硬盘ID列表，可通过[DescribeDisks](https://cloud.tencent.com/document/api/1207/66093)接口查询。列表最大长度为15。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 云硬盘备份点配额。取值范围: [0, 500]。调整后的配额必须大于等于已存在的备份点数量。 
     * @return DiskBackupQuota 云硬盘备份点配额。取值范围: [0, 500]。调整后的配额必须大于等于已存在的备份点数量。
     */
    public Long getDiskBackupQuota() {
        return this.DiskBackupQuota;
    }

    /**
     * Set 云硬盘备份点配额。取值范围: [0, 500]。调整后的配额必须大于等于已存在的备份点数量。
     * @param DiskBackupQuota 云硬盘备份点配额。取值范围: [0, 500]。调整后的配额必须大于等于已存在的备份点数量。
     */
    public void setDiskBackupQuota(Long DiskBackupQuota) {
        this.DiskBackupQuota = DiskBackupQuota;
    }

    public ModifyDisksBackupQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDisksBackupQuotaRequest(ModifyDisksBackupQuotaRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DiskBackupQuota != null) {
            this.DiskBackupQuota = new Long(source.DiskBackupQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);

    }
}

