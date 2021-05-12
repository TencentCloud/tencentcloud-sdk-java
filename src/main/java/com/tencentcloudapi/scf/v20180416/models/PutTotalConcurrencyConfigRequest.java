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

public class PutTotalConcurrencyConfigRequest extends AbstractModel{

    /**
    * 账号并发内存配额，注：账号并发内存配额下限：用户已用并发内存总额 + 12800
    */
    @SerializedName("TotalConcurrencyMem")
    @Expose
    private Long TotalConcurrencyMem;

    /**
    * 命名空间，默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get 账号并发内存配额，注：账号并发内存配额下限：用户已用并发内存总额 + 12800 
     * @return TotalConcurrencyMem 账号并发内存配额，注：账号并发内存配额下限：用户已用并发内存总额 + 12800
     */
    public Long getTotalConcurrencyMem() {
        return this.TotalConcurrencyMem;
    }

    /**
     * Set 账号并发内存配额，注：账号并发内存配额下限：用户已用并发内存总额 + 12800
     * @param TotalConcurrencyMem 账号并发内存配额，注：账号并发内存配额下限：用户已用并发内存总额 + 12800
     */
    public void setTotalConcurrencyMem(Long TotalConcurrencyMem) {
        this.TotalConcurrencyMem = TotalConcurrencyMem;
    }

    /**
     * Get 命名空间，默认为default 
     * @return Namespace 命名空间，默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，默认为default
     * @param Namespace 命名空间，默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public PutTotalConcurrencyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutTotalConcurrencyConfigRequest(PutTotalConcurrencyConfigRequest source) {
        if (source.TotalConcurrencyMem != null) {
            this.TotalConcurrencyMem = new Long(source.TotalConcurrencyMem);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalConcurrencyMem", this.TotalConcurrencyMem);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

