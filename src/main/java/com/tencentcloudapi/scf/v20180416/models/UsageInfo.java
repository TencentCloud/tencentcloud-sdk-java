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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageInfo extends AbstractModel{

    /**
    * 命名空间个数
    */
    @SerializedName("NamespacesCount")
    @Expose
    private Long NamespacesCount;

    /**
    * 命名空间详情
    */
    @SerializedName("Namespace")
    @Expose
    private NamespaceUsage [] Namespace;

    /**
    * 当前地域用户并发内存配额上限
    */
    @SerializedName("TotalConcurrencyMem")
    @Expose
    private Long TotalConcurrencyMem;

    /**
    * 当前地域用户已配置并发内存额度
    */
    @SerializedName("TotalAllocatedConcurrencyMem")
    @Expose
    private Long TotalAllocatedConcurrencyMem;

    /**
    * 用户实际配置的账号并发配额
    */
    @SerializedName("UserConcurrencyMemLimit")
    @Expose
    private Long UserConcurrencyMemLimit;

    /**
     * Get 命名空间个数 
     * @return NamespacesCount 命名空间个数
     */
    public Long getNamespacesCount() {
        return this.NamespacesCount;
    }

    /**
     * Set 命名空间个数
     * @param NamespacesCount 命名空间个数
     */
    public void setNamespacesCount(Long NamespacesCount) {
        this.NamespacesCount = NamespacesCount;
    }

    /**
     * Get 命名空间详情 
     * @return Namespace 命名空间详情
     */
    public NamespaceUsage [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间详情
     * @param Namespace 命名空间详情
     */
    public void setNamespace(NamespaceUsage [] Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 当前地域用户并发内存配额上限 
     * @return TotalConcurrencyMem 当前地域用户并发内存配额上限
     */
    public Long getTotalConcurrencyMem() {
        return this.TotalConcurrencyMem;
    }

    /**
     * Set 当前地域用户并发内存配额上限
     * @param TotalConcurrencyMem 当前地域用户并发内存配额上限
     */
    public void setTotalConcurrencyMem(Long TotalConcurrencyMem) {
        this.TotalConcurrencyMem = TotalConcurrencyMem;
    }

    /**
     * Get 当前地域用户已配置并发内存额度 
     * @return TotalAllocatedConcurrencyMem 当前地域用户已配置并发内存额度
     */
    public Long getTotalAllocatedConcurrencyMem() {
        return this.TotalAllocatedConcurrencyMem;
    }

    /**
     * Set 当前地域用户已配置并发内存额度
     * @param TotalAllocatedConcurrencyMem 当前地域用户已配置并发内存额度
     */
    public void setTotalAllocatedConcurrencyMem(Long TotalAllocatedConcurrencyMem) {
        this.TotalAllocatedConcurrencyMem = TotalAllocatedConcurrencyMem;
    }

    /**
     * Get 用户实际配置的账号并发配额 
     * @return UserConcurrencyMemLimit 用户实际配置的账号并发配额
     */
    public Long getUserConcurrencyMemLimit() {
        return this.UserConcurrencyMemLimit;
    }

    /**
     * Set 用户实际配置的账号并发配额
     * @param UserConcurrencyMemLimit 用户实际配置的账号并发配额
     */
    public void setUserConcurrencyMemLimit(Long UserConcurrencyMemLimit) {
        this.UserConcurrencyMemLimit = UserConcurrencyMemLimit;
    }

    public UsageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageInfo(UsageInfo source) {
        if (source.NamespacesCount != null) {
            this.NamespacesCount = new Long(source.NamespacesCount);
        }
        if (source.Namespace != null) {
            this.Namespace = new NamespaceUsage[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new NamespaceUsage(source.Namespace[i]);
            }
        }
        if (source.TotalConcurrencyMem != null) {
            this.TotalConcurrencyMem = new Long(source.TotalConcurrencyMem);
        }
        if (source.TotalAllocatedConcurrencyMem != null) {
            this.TotalAllocatedConcurrencyMem = new Long(source.TotalAllocatedConcurrencyMem);
        }
        if (source.UserConcurrencyMemLimit != null) {
            this.UserConcurrencyMemLimit = new Long(source.UserConcurrencyMemLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespacesCount", this.NamespacesCount);
        this.setParamArrayObj(map, prefix + "Namespace.", this.Namespace);
        this.setParamSimple(map, prefix + "TotalConcurrencyMem", this.TotalConcurrencyMem);
        this.setParamSimple(map, prefix + "TotalAllocatedConcurrencyMem", this.TotalAllocatedConcurrencyMem);
        this.setParamSimple(map, prefix + "UserConcurrencyMemLimit", this.UserConcurrencyMemLimit);

    }
}

