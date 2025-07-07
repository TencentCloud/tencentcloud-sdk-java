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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckBatchStatusRequest extends AbstractModel {

    /**
    * 操作日志 ID数组，最多 200 个
可通过任意批量操作接口获取，例如：
[BatchModifyDomainInfo](https://cloud.tencent.com/document/product/242/49197)
[ModifyDomainDNSBatch](https://cloud.tencent.com/document/product/242/49211)
[ModifyDomainOwnerBatch](https://cloud.tencent.com/document/product/242/49196)
[UpdateProhibitionBatch](https://cloud.tencent.com/document/api/242/49193)
[TransferProhibitionBatch](https://cloud.tencent.com/document/api/242/49194)
[TransferInDomainBatch](https://cloud.tencent.com/document/api/242/49195)
    */
    @SerializedName("LogIds")
    @Expose
    private Long [] LogIds;

    /**
     * Get 操作日志 ID数组，最多 200 个
可通过任意批量操作接口获取，例如：
[BatchModifyDomainInfo](https://cloud.tencent.com/document/product/242/49197)
[ModifyDomainDNSBatch](https://cloud.tencent.com/document/product/242/49211)
[ModifyDomainOwnerBatch](https://cloud.tencent.com/document/product/242/49196)
[UpdateProhibitionBatch](https://cloud.tencent.com/document/api/242/49193)
[TransferProhibitionBatch](https://cloud.tencent.com/document/api/242/49194)
[TransferInDomainBatch](https://cloud.tencent.com/document/api/242/49195) 
     * @return LogIds 操作日志 ID数组，最多 200 个
可通过任意批量操作接口获取，例如：
[BatchModifyDomainInfo](https://cloud.tencent.com/document/product/242/49197)
[ModifyDomainDNSBatch](https://cloud.tencent.com/document/product/242/49211)
[ModifyDomainOwnerBatch](https://cloud.tencent.com/document/product/242/49196)
[UpdateProhibitionBatch](https://cloud.tencent.com/document/api/242/49193)
[TransferProhibitionBatch](https://cloud.tencent.com/document/api/242/49194)
[TransferInDomainBatch](https://cloud.tencent.com/document/api/242/49195)
     */
    public Long [] getLogIds() {
        return this.LogIds;
    }

    /**
     * Set 操作日志 ID数组，最多 200 个
可通过任意批量操作接口获取，例如：
[BatchModifyDomainInfo](https://cloud.tencent.com/document/product/242/49197)
[ModifyDomainDNSBatch](https://cloud.tencent.com/document/product/242/49211)
[ModifyDomainOwnerBatch](https://cloud.tencent.com/document/product/242/49196)
[UpdateProhibitionBatch](https://cloud.tencent.com/document/api/242/49193)
[TransferProhibitionBatch](https://cloud.tencent.com/document/api/242/49194)
[TransferInDomainBatch](https://cloud.tencent.com/document/api/242/49195)
     * @param LogIds 操作日志 ID数组，最多 200 个
可通过任意批量操作接口获取，例如：
[BatchModifyDomainInfo](https://cloud.tencent.com/document/product/242/49197)
[ModifyDomainDNSBatch](https://cloud.tencent.com/document/product/242/49211)
[ModifyDomainOwnerBatch](https://cloud.tencent.com/document/product/242/49196)
[UpdateProhibitionBatch](https://cloud.tencent.com/document/api/242/49193)
[TransferProhibitionBatch](https://cloud.tencent.com/document/api/242/49194)
[TransferInDomainBatch](https://cloud.tencent.com/document/api/242/49195)
     */
    public void setLogIds(Long [] LogIds) {
        this.LogIds = LogIds;
    }

    public CheckBatchStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckBatchStatusRequest(CheckBatchStatusRequest source) {
        if (source.LogIds != null) {
            this.LogIds = new Long[source.LogIds.length];
            for (int i = 0; i < source.LogIds.length; i++) {
                this.LogIds[i] = new Long(source.LogIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LogIds.", this.LogIds);

    }
}

