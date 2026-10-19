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

public class OverviewBlockListQuotaDetail extends AbstractModel {

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
    * <p>封禁列表剩余配额数量。</p>
    */
    @SerializedName("RemainCnt")
    @Expose
    private Long RemainCnt;

    /**
    * <p>基础配额总数量。</p>
    */
    @SerializedName("BaseTotalCnt")
    @Expose
    private Long BaseTotalCnt;

    /**
    * <p>基础配额已使用数量。</p>
    */
    @SerializedName("BaseUsedCnt")
    @Expose
    private Long BaseUsedCnt;

    /**
    * <p>基础配额剩余数量。</p>
    */
    @SerializedName("BaseRemainCnt")
    @Expose
    private Long BaseRemainCnt;

    /**
    * <p>扩容配额总数量。</p>
    */
    @SerializedName("ExtensionTotalCnt")
    @Expose
    private Long ExtensionTotalCnt;

    /**
    * <p>扩容配额已使用数量。</p>
    */
    @SerializedName("ExtensionUsedCnt")
    @Expose
    private Long ExtensionUsedCnt;

    /**
    * <p>扩容配额剩余数量。</p>
    */
    @SerializedName("ExtensionRemainCnt")
    @Expose
    private Long ExtensionRemainCnt;

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
     * Get <p>封禁列表剩余配额数量。</p> 
     * @return RemainCnt <p>封禁列表剩余配额数量。</p>
     */
    public Long getRemainCnt() {
        return this.RemainCnt;
    }

    /**
     * Set <p>封禁列表剩余配额数量。</p>
     * @param RemainCnt <p>封禁列表剩余配额数量。</p>
     */
    public void setRemainCnt(Long RemainCnt) {
        this.RemainCnt = RemainCnt;
    }

    /**
     * Get <p>基础配额总数量。</p> 
     * @return BaseTotalCnt <p>基础配额总数量。</p>
     */
    public Long getBaseTotalCnt() {
        return this.BaseTotalCnt;
    }

    /**
     * Set <p>基础配额总数量。</p>
     * @param BaseTotalCnt <p>基础配额总数量。</p>
     */
    public void setBaseTotalCnt(Long BaseTotalCnt) {
        this.BaseTotalCnt = BaseTotalCnt;
    }

    /**
     * Get <p>基础配额已使用数量。</p> 
     * @return BaseUsedCnt <p>基础配额已使用数量。</p>
     */
    public Long getBaseUsedCnt() {
        return this.BaseUsedCnt;
    }

    /**
     * Set <p>基础配额已使用数量。</p>
     * @param BaseUsedCnt <p>基础配额已使用数量。</p>
     */
    public void setBaseUsedCnt(Long BaseUsedCnt) {
        this.BaseUsedCnt = BaseUsedCnt;
    }

    /**
     * Get <p>基础配额剩余数量。</p> 
     * @return BaseRemainCnt <p>基础配额剩余数量。</p>
     */
    public Long getBaseRemainCnt() {
        return this.BaseRemainCnt;
    }

    /**
     * Set <p>基础配额剩余数量。</p>
     * @param BaseRemainCnt <p>基础配额剩余数量。</p>
     */
    public void setBaseRemainCnt(Long BaseRemainCnt) {
        this.BaseRemainCnt = BaseRemainCnt;
    }

    /**
     * Get <p>扩容配额总数量。</p> 
     * @return ExtensionTotalCnt <p>扩容配额总数量。</p>
     */
    public Long getExtensionTotalCnt() {
        return this.ExtensionTotalCnt;
    }

    /**
     * Set <p>扩容配额总数量。</p>
     * @param ExtensionTotalCnt <p>扩容配额总数量。</p>
     */
    public void setExtensionTotalCnt(Long ExtensionTotalCnt) {
        this.ExtensionTotalCnt = ExtensionTotalCnt;
    }

    /**
     * Get <p>扩容配额已使用数量。</p> 
     * @return ExtensionUsedCnt <p>扩容配额已使用数量。</p>
     */
    public Long getExtensionUsedCnt() {
        return this.ExtensionUsedCnt;
    }

    /**
     * Set <p>扩容配额已使用数量。</p>
     * @param ExtensionUsedCnt <p>扩容配额已使用数量。</p>
     */
    public void setExtensionUsedCnt(Long ExtensionUsedCnt) {
        this.ExtensionUsedCnt = ExtensionUsedCnt;
    }

    /**
     * Get <p>扩容配额剩余数量。</p> 
     * @return ExtensionRemainCnt <p>扩容配额剩余数量。</p>
     */
    public Long getExtensionRemainCnt() {
        return this.ExtensionRemainCnt;
    }

    /**
     * Set <p>扩容配额剩余数量。</p>
     * @param ExtensionRemainCnt <p>扩容配额剩余数量。</p>
     */
    public void setExtensionRemainCnt(Long ExtensionRemainCnt) {
        this.ExtensionRemainCnt = ExtensionRemainCnt;
    }

    public OverviewBlockListQuotaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewBlockListQuotaDetail(OverviewBlockListQuotaDetail source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.UsedCnt != null) {
            this.UsedCnt = new Long(source.UsedCnt);
        }
        if (source.RemainCnt != null) {
            this.RemainCnt = new Long(source.RemainCnt);
        }
        if (source.BaseTotalCnt != null) {
            this.BaseTotalCnt = new Long(source.BaseTotalCnt);
        }
        if (source.BaseUsedCnt != null) {
            this.BaseUsedCnt = new Long(source.BaseUsedCnt);
        }
        if (source.BaseRemainCnt != null) {
            this.BaseRemainCnt = new Long(source.BaseRemainCnt);
        }
        if (source.ExtensionTotalCnt != null) {
            this.ExtensionTotalCnt = new Long(source.ExtensionTotalCnt);
        }
        if (source.ExtensionUsedCnt != null) {
            this.ExtensionUsedCnt = new Long(source.ExtensionUsedCnt);
        }
        if (source.ExtensionRemainCnt != null) {
            this.ExtensionRemainCnt = new Long(source.ExtensionRemainCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamSimple(map, prefix + "UsedCnt", this.UsedCnt);
        this.setParamSimple(map, prefix + "RemainCnt", this.RemainCnt);
        this.setParamSimple(map, prefix + "BaseTotalCnt", this.BaseTotalCnt);
        this.setParamSimple(map, prefix + "BaseUsedCnt", this.BaseUsedCnt);
        this.setParamSimple(map, prefix + "BaseRemainCnt", this.BaseRemainCnt);
        this.setParamSimple(map, prefix + "ExtensionTotalCnt", this.ExtensionTotalCnt);
        this.setParamSimple(map, prefix + "ExtensionUsedCnt", this.ExtensionUsedCnt);
        this.setParamSimple(map, prefix + "ExtensionRemainCnt", this.ExtensionRemainCnt);

    }
}

