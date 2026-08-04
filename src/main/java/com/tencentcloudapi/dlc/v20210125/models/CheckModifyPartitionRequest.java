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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckModifyPartitionRequest extends AbstractModel {

    /**
    * <p>分区编码</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>目标资源配额列表（计费项+目标数量）</p>
    */
    @SerializedName("TargetResourceQuotaList")
    @Expose
    private ResourceQuota [] TargetResourceQuotaList;

    /**
     * Get <p>分区编码</p> 
     * @return PartitionCode <p>分区编码</p>
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set <p>分区编码</p>
     * @param PartitionCode <p>分区编码</p>
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get <p>目标资源配额列表（计费项+目标数量）</p> 
     * @return TargetResourceQuotaList <p>目标资源配额列表（计费项+目标数量）</p>
     */
    public ResourceQuota [] getTargetResourceQuotaList() {
        return this.TargetResourceQuotaList;
    }

    /**
     * Set <p>目标资源配额列表（计费项+目标数量）</p>
     * @param TargetResourceQuotaList <p>目标资源配额列表（计费项+目标数量）</p>
     */
    public void setTargetResourceQuotaList(ResourceQuota [] TargetResourceQuotaList) {
        this.TargetResourceQuotaList = TargetResourceQuotaList;
    }

    public CheckModifyPartitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckModifyPartitionRequest(CheckModifyPartitionRequest source) {
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.TargetResourceQuotaList != null) {
            this.TargetResourceQuotaList = new ResourceQuota[source.TargetResourceQuotaList.length];
            for (int i = 0; i < source.TargetResourceQuotaList.length; i++) {
                this.TargetResourceQuotaList[i] = new ResourceQuota(source.TargetResourceQuotaList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamArrayObj(map, prefix + "TargetResourceQuotaList.", this.TargetResourceQuotaList);

    }
}

