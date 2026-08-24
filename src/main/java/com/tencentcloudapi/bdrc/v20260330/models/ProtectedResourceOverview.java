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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectedResourceOverview extends AbstractModel {

    /**
    * 受保护资源总数
    */
    @SerializedName("TotalProtectedCount")
    @Expose
    private Long TotalProtectedCount;

    /**
    * 总资源数
    */
    @SerializedName("TotalResourceCount")
    @Expose
    private Long TotalResourceCount;

    /**
    * CVM 受保护统计
    */
    @SerializedName("Cvm")
    @Expose
    private ResourceProtectStat Cvm;

    /**
    * CFS 受保护统计
    */
    @SerializedName("CFS")
    @Expose
    private ResourceProtectStat CFS;

    /**
     * Get 受保护资源总数 
     * @return TotalProtectedCount 受保护资源总数
     */
    public Long getTotalProtectedCount() {
        return this.TotalProtectedCount;
    }

    /**
     * Set 受保护资源总数
     * @param TotalProtectedCount 受保护资源总数
     */
    public void setTotalProtectedCount(Long TotalProtectedCount) {
        this.TotalProtectedCount = TotalProtectedCount;
    }

    /**
     * Get 总资源数 
     * @return TotalResourceCount 总资源数
     */
    public Long getTotalResourceCount() {
        return this.TotalResourceCount;
    }

    /**
     * Set 总资源数
     * @param TotalResourceCount 总资源数
     */
    public void setTotalResourceCount(Long TotalResourceCount) {
        this.TotalResourceCount = TotalResourceCount;
    }

    /**
     * Get CVM 受保护统计 
     * @return Cvm CVM 受保护统计
     */
    public ResourceProtectStat getCvm() {
        return this.Cvm;
    }

    /**
     * Set CVM 受保护统计
     * @param Cvm CVM 受保护统计
     */
    public void setCvm(ResourceProtectStat Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get CFS 受保护统计 
     * @return CFS CFS 受保护统计
     */
    public ResourceProtectStat getCFS() {
        return this.CFS;
    }

    /**
     * Set CFS 受保护统计
     * @param CFS CFS 受保护统计
     */
    public void setCFS(ResourceProtectStat CFS) {
        this.CFS = CFS;
    }

    public ProtectedResourceOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectedResourceOverview(ProtectedResourceOverview source) {
        if (source.TotalProtectedCount != null) {
            this.TotalProtectedCount = new Long(source.TotalProtectedCount);
        }
        if (source.TotalResourceCount != null) {
            this.TotalResourceCount = new Long(source.TotalResourceCount);
        }
        if (source.Cvm != null) {
            this.Cvm = new ResourceProtectStat(source.Cvm);
        }
        if (source.CFS != null) {
            this.CFS = new ResourceProtectStat(source.CFS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalProtectedCount", this.TotalProtectedCount);
        this.setParamSimple(map, prefix + "TotalResourceCount", this.TotalResourceCount);
        this.setParamObj(map, prefix + "Cvm.", this.Cvm);
        this.setParamObj(map, prefix + "CFS.", this.CFS);

    }
}

