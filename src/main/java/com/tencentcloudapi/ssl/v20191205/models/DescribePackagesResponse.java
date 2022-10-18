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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePackagesResponse extends AbstractModel{

    /**
    * 权益包列表。
    */
    @SerializedName("Packages")
    @Expose
    private PackageInfo [] Packages;

    /**
    * 总条数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 权益点总余额。
    */
    @SerializedName("TotalBalance")
    @Expose
    private Long TotalBalance;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 权益包列表。 
     * @return Packages 权益包列表。
     */
    public PackageInfo [] getPackages() {
        return this.Packages;
    }

    /**
     * Set 权益包列表。
     * @param Packages 权益包列表。
     */
    public void setPackages(PackageInfo [] Packages) {
        this.Packages = Packages;
    }

    /**
     * Get 总条数。 
     * @return TotalCount 总条数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数。
     * @param TotalCount 总条数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 权益点总余额。 
     * @return TotalBalance 权益点总余额。
     */
    public Long getTotalBalance() {
        return this.TotalBalance;
    }

    /**
     * Set 权益点总余额。
     * @param TotalBalance 权益点总余额。
     */
    public void setTotalBalance(Long TotalBalance) {
        this.TotalBalance = TotalBalance;
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

    public DescribePackagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePackagesResponse(DescribePackagesResponse source) {
        if (source.Packages != null) {
            this.Packages = new PackageInfo[source.Packages.length];
            for (int i = 0; i < source.Packages.length; i++) {
                this.Packages[i] = new PackageInfo(source.Packages[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalBalance != null) {
            this.TotalBalance = new Long(source.TotalBalance);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Packages.", this.Packages);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalBalance", this.TotalBalance);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

