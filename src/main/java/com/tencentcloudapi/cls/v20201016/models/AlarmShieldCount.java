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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmShieldCount extends AbstractModel {

    /**
    * 符合检索条件的告警屏蔽总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 告警屏蔽未生效数量
    */
    @SerializedName("InvalidCount")
    @Expose
    private Long InvalidCount;

    /**
    * 告警屏蔽生效中数量
    */
    @SerializedName("ValidCount")
    @Expose
    private Long ValidCount;

    /**
    * 告警屏蔽已过期数量
    */
    @SerializedName("ExpireCount")
    @Expose
    private Long ExpireCount;

    /**
     * Get 符合检索条件的告警屏蔽总数量 
     * @return TotalCount 符合检索条件的告警屏蔽总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合检索条件的告警屏蔽总数量
     * @param TotalCount 符合检索条件的告警屏蔽总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 告警屏蔽未生效数量 
     * @return InvalidCount 告警屏蔽未生效数量
     */
    public Long getInvalidCount() {
        return this.InvalidCount;
    }

    /**
     * Set 告警屏蔽未生效数量
     * @param InvalidCount 告警屏蔽未生效数量
     */
    public void setInvalidCount(Long InvalidCount) {
        this.InvalidCount = InvalidCount;
    }

    /**
     * Get 告警屏蔽生效中数量 
     * @return ValidCount 告警屏蔽生效中数量
     */
    public Long getValidCount() {
        return this.ValidCount;
    }

    /**
     * Set 告警屏蔽生效中数量
     * @param ValidCount 告警屏蔽生效中数量
     */
    public void setValidCount(Long ValidCount) {
        this.ValidCount = ValidCount;
    }

    /**
     * Get 告警屏蔽已过期数量 
     * @return ExpireCount 告警屏蔽已过期数量
     */
    public Long getExpireCount() {
        return this.ExpireCount;
    }

    /**
     * Set 告警屏蔽已过期数量
     * @param ExpireCount 告警屏蔽已过期数量
     */
    public void setExpireCount(Long ExpireCount) {
        this.ExpireCount = ExpireCount;
    }

    public AlarmShieldCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmShieldCount(AlarmShieldCount source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InvalidCount != null) {
            this.InvalidCount = new Long(source.InvalidCount);
        }
        if (source.ValidCount != null) {
            this.ValidCount = new Long(source.ValidCount);
        }
        if (source.ExpireCount != null) {
            this.ExpireCount = new Long(source.ExpireCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "InvalidCount", this.InvalidCount);
        this.setParamSimple(map, prefix + "ValidCount", this.ValidCount);
        this.setParamSimple(map, prefix + "ExpireCount", this.ExpireCount);

    }
}

