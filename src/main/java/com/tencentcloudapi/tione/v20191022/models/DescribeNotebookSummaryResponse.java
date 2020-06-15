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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebookSummaryResponse extends AbstractModel{

    /**
    * 实例总数
    */
    @SerializedName("AllInstanceCnt")
    @Expose
    private Long AllInstanceCnt;

    /**
    * 计费实例总数
    */
    @SerializedName("BillingInstanceCnt")
    @Expose
    private Long BillingInstanceCnt;

    /**
    * 仅存储计费的实例总数
    */
    @SerializedName("StorageOnlyBillingInstanceCnt")
    @Expose
    private Long StorageOnlyBillingInstanceCnt;

    /**
    * 计算和存储都计费的实例总数
    */
    @SerializedName("ComputingBillingInstanceCnt")
    @Expose
    private Long ComputingBillingInstanceCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例总数 
     * @return AllInstanceCnt 实例总数
     */
    public Long getAllInstanceCnt() {
        return this.AllInstanceCnt;
    }

    /**
     * Set 实例总数
     * @param AllInstanceCnt 实例总数
     */
    public void setAllInstanceCnt(Long AllInstanceCnt) {
        this.AllInstanceCnt = AllInstanceCnt;
    }

    /**
     * Get 计费实例总数 
     * @return BillingInstanceCnt 计费实例总数
     */
    public Long getBillingInstanceCnt() {
        return this.BillingInstanceCnt;
    }

    /**
     * Set 计费实例总数
     * @param BillingInstanceCnt 计费实例总数
     */
    public void setBillingInstanceCnt(Long BillingInstanceCnt) {
        this.BillingInstanceCnt = BillingInstanceCnt;
    }

    /**
     * Get 仅存储计费的实例总数 
     * @return StorageOnlyBillingInstanceCnt 仅存储计费的实例总数
     */
    public Long getStorageOnlyBillingInstanceCnt() {
        return this.StorageOnlyBillingInstanceCnt;
    }

    /**
     * Set 仅存储计费的实例总数
     * @param StorageOnlyBillingInstanceCnt 仅存储计费的实例总数
     */
    public void setStorageOnlyBillingInstanceCnt(Long StorageOnlyBillingInstanceCnt) {
        this.StorageOnlyBillingInstanceCnt = StorageOnlyBillingInstanceCnt;
    }

    /**
     * Get 计算和存储都计费的实例总数 
     * @return ComputingBillingInstanceCnt 计算和存储都计费的实例总数
     */
    public Long getComputingBillingInstanceCnt() {
        return this.ComputingBillingInstanceCnt;
    }

    /**
     * Set 计算和存储都计费的实例总数
     * @param ComputingBillingInstanceCnt 计算和存储都计费的实例总数
     */
    public void setComputingBillingInstanceCnt(Long ComputingBillingInstanceCnt) {
        this.ComputingBillingInstanceCnt = ComputingBillingInstanceCnt;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllInstanceCnt", this.AllInstanceCnt);
        this.setParamSimple(map, prefix + "BillingInstanceCnt", this.BillingInstanceCnt);
        this.setParamSimple(map, prefix + "StorageOnlyBillingInstanceCnt", this.StorageOnlyBillingInstanceCnt);
        this.setParamSimple(map, prefix + "ComputingBillingInstanceCnt", this.ComputingBillingInstanceCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

