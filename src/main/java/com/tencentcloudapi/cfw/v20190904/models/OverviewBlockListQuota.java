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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewBlockListQuota extends AbstractModel {

    /**
    * <p>封禁列表总配额数量。</p>
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * <p>封禁列表已使用数量。</p>
    */
    @SerializedName("UsedCnt")
    @Expose
    private Long UsedCnt;

    /**
    * <p>入站方向已使用的封禁列表记录。</p>
    */
    @SerializedName("InUsedCnt")
    @Expose
    private Long InUsedCnt;

    /**
    * <p>出方向封禁列表已使用数量。</p>
    */
    @SerializedName("OutUsedCnt")
    @Expose
    private Long OutUsedCnt;

    /**
     * Get <p>封禁列表总配额数量。</p> 
     * @return TotalCnt <p>封禁列表总配额数量。</p>
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set <p>封禁列表总配额数量。</p>
     * @param TotalCnt <p>封禁列表总配额数量。</p>
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get <p>封禁列表已使用数量。</p> 
     * @return UsedCnt <p>封禁列表已使用数量。</p>
     */
    public Long getUsedCnt() {
        return this.UsedCnt;
    }

    /**
     * Set <p>封禁列表已使用数量。</p>
     * @param UsedCnt <p>封禁列表已使用数量。</p>
     */
    public void setUsedCnt(Long UsedCnt) {
        this.UsedCnt = UsedCnt;
    }

    /**
     * Get <p>入站方向已使用的封禁列表记录。</p> 
     * @return InUsedCnt <p>入站方向已使用的封禁列表记录。</p>
     */
    public Long getInUsedCnt() {
        return this.InUsedCnt;
    }

    /**
     * Set <p>入站方向已使用的封禁列表记录。</p>
     * @param InUsedCnt <p>入站方向已使用的封禁列表记录。</p>
     */
    public void setInUsedCnt(Long InUsedCnt) {
        this.InUsedCnt = InUsedCnt;
    }

    /**
     * Get <p>出方向封禁列表已使用数量。</p> 
     * @return OutUsedCnt <p>出方向封禁列表已使用数量。</p>
     */
    public Long getOutUsedCnt() {
        return this.OutUsedCnt;
    }

    /**
     * Set <p>出方向封禁列表已使用数量。</p>
     * @param OutUsedCnt <p>出方向封禁列表已使用数量。</p>
     */
    public void setOutUsedCnt(Long OutUsedCnt) {
        this.OutUsedCnt = OutUsedCnt;
    }

    public OverviewBlockListQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewBlockListQuota(OverviewBlockListQuota source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.UsedCnt != null) {
            this.UsedCnt = new Long(source.UsedCnt);
        }
        if (source.InUsedCnt != null) {
            this.InUsedCnt = new Long(source.InUsedCnt);
        }
        if (source.OutUsedCnt != null) {
            this.OutUsedCnt = new Long(source.OutUsedCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamSimple(map, prefix + "UsedCnt", this.UsedCnt);
        this.setParamSimple(map, prefix + "InUsedCnt", this.InUsedCnt);
        this.setParamSimple(map, prefix + "OutUsedCnt", this.OutUsedCnt);

    }
}

