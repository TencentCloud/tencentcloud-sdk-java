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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirtualHostQuota extends AbstractModel {

    /**
    * 最大虚拟主机数
    */
    @SerializedName("MaxVirtualHost")
    @Expose
    private Long MaxVirtualHost;

    /**
    * 已经使用的虚拟主机数
    */
    @SerializedName("UsedVirtualHost")
    @Expose
    private Long UsedVirtualHost;

    /**
     * Get 最大虚拟主机数 
     * @return MaxVirtualHost 最大虚拟主机数
     */
    public Long getMaxVirtualHost() {
        return this.MaxVirtualHost;
    }

    /**
     * Set 最大虚拟主机数
     * @param MaxVirtualHost 最大虚拟主机数
     */
    public void setMaxVirtualHost(Long MaxVirtualHost) {
        this.MaxVirtualHost = MaxVirtualHost;
    }

    /**
     * Get 已经使用的虚拟主机数 
     * @return UsedVirtualHost 已经使用的虚拟主机数
     */
    public Long getUsedVirtualHost() {
        return this.UsedVirtualHost;
    }

    /**
     * Set 已经使用的虚拟主机数
     * @param UsedVirtualHost 已经使用的虚拟主机数
     */
    public void setUsedVirtualHost(Long UsedVirtualHost) {
        this.UsedVirtualHost = UsedVirtualHost;
    }

    public VirtualHostQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualHostQuota(VirtualHostQuota source) {
        if (source.MaxVirtualHost != null) {
            this.MaxVirtualHost = new Long(source.MaxVirtualHost);
        }
        if (source.UsedVirtualHost != null) {
            this.UsedVirtualHost = new Long(source.UsedVirtualHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxVirtualHost", this.MaxVirtualHost);
        this.setParamSimple(map, prefix + "UsedVirtualHost", this.UsedVirtualHost);

    }
}

