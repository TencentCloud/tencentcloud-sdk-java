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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteHaVipRequest extends AbstractModel {

    /**
    * <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * <p>忽略删除保护。</p>
    */
    @SerializedName("SkipTerminationProtection")
    @Expose
    private Boolean SkipTerminationProtection;

    /**
     * Get <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p> 
     * @return HaVipId <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
     * @param HaVipId <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get <p>忽略删除保护。</p> 
     * @return SkipTerminationProtection <p>忽略删除保护。</p>
     */
    public Boolean getSkipTerminationProtection() {
        return this.SkipTerminationProtection;
    }

    /**
     * Set <p>忽略删除保护。</p>
     * @param SkipTerminationProtection <p>忽略删除保护。</p>
     */
    public void setSkipTerminationProtection(Boolean SkipTerminationProtection) {
        this.SkipTerminationProtection = SkipTerminationProtection;
    }

    public DeleteHaVipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteHaVipRequest(DeleteHaVipRequest source) {
        if (source.HaVipId != null) {
            this.HaVipId = new String(source.HaVipId);
        }
        if (source.SkipTerminationProtection != null) {
            this.SkipTerminationProtection = new Boolean(source.SkipTerminationProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HaVipId", this.HaVipId);
        this.setParamSimple(map, prefix + "SkipTerminationProtection", this.SkipTerminationProtection);

    }
}

