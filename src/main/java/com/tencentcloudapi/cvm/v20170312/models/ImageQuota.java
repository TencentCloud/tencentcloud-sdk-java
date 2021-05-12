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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageQuota extends AbstractModel{

    /**
    * 已使用配额
    */
    @SerializedName("UsedQuota")
    @Expose
    private Long UsedQuota;

    /**
    * 总配额
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
     * Get 已使用配额 
     * @return UsedQuota 已使用配额
     */
    public Long getUsedQuota() {
        return this.UsedQuota;
    }

    /**
     * Set 已使用配额
     * @param UsedQuota 已使用配额
     */
    public void setUsedQuota(Long UsedQuota) {
        this.UsedQuota = UsedQuota;
    }

    /**
     * Get 总配额 
     * @return TotalQuota 总配额
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set 总配额
     * @param TotalQuota 总配额
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    public ImageQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageQuota(ImageQuota source) {
        if (source.UsedQuota != null) {
            this.UsedQuota = new Long(source.UsedQuota);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsedQuota", this.UsedQuota);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);

    }
}

