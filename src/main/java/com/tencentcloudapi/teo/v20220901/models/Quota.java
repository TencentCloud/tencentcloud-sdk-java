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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Quota extends AbstractModel{

    /**
    * 单次批量提交配额上限。
    */
    @SerializedName("Batch")
    @Expose
    private Long Batch;

    /**
    * 每日提交配额上限。
    */
    @SerializedName("Daily")
    @Expose
    private Long Daily;

    /**
    * 每日剩余的可提交配额。
    */
    @SerializedName("DailyAvailable")
    @Expose
    private Long DailyAvailable;

    /**
    * 刷新预热缓存类型，取值有：
<li> purge_prefix：按前缀刷新；</li>
<li> purge_url：按URL刷新；</li>
<li> purge_host：按Hostname刷新；</li>
<li> purge_all：刷新全部缓存内容；</li>
<li> purge_cache_tag：按CacheTag刷新；</li><li> prefetch_url：按URL预热。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 单次批量提交配额上限。 
     * @return Batch 单次批量提交配额上限。
     */
    public Long getBatch() {
        return this.Batch;
    }

    /**
     * Set 单次批量提交配额上限。
     * @param Batch 单次批量提交配额上限。
     */
    public void setBatch(Long Batch) {
        this.Batch = Batch;
    }

    /**
     * Get 每日提交配额上限。 
     * @return Daily 每日提交配额上限。
     */
    public Long getDaily() {
        return this.Daily;
    }

    /**
     * Set 每日提交配额上限。
     * @param Daily 每日提交配额上限。
     */
    public void setDaily(Long Daily) {
        this.Daily = Daily;
    }

    /**
     * Get 每日剩余的可提交配额。 
     * @return DailyAvailable 每日剩余的可提交配额。
     */
    public Long getDailyAvailable() {
        return this.DailyAvailable;
    }

    /**
     * Set 每日剩余的可提交配额。
     * @param DailyAvailable 每日剩余的可提交配额。
     */
    public void setDailyAvailable(Long DailyAvailable) {
        this.DailyAvailable = DailyAvailable;
    }

    /**
     * Get 刷新预热缓存类型，取值有：
<li> purge_prefix：按前缀刷新；</li>
<li> purge_url：按URL刷新；</li>
<li> purge_host：按Hostname刷新；</li>
<li> purge_all：刷新全部缓存内容；</li>
<li> purge_cache_tag：按CacheTag刷新；</li><li> prefetch_url：按URL预热。</li> 
     * @return Type 刷新预热缓存类型，取值有：
<li> purge_prefix：按前缀刷新；</li>
<li> purge_url：按URL刷新；</li>
<li> purge_host：按Hostname刷新；</li>
<li> purge_all：刷新全部缓存内容；</li>
<li> purge_cache_tag：按CacheTag刷新；</li><li> prefetch_url：按URL预热。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 刷新预热缓存类型，取值有：
<li> purge_prefix：按前缀刷新；</li>
<li> purge_url：按URL刷新；</li>
<li> purge_host：按Hostname刷新；</li>
<li> purge_all：刷新全部缓存内容；</li>
<li> purge_cache_tag：按CacheTag刷新；</li><li> prefetch_url：按URL预热。</li>
     * @param Type 刷新预热缓存类型，取值有：
<li> purge_prefix：按前缀刷新；</li>
<li> purge_url：按URL刷新；</li>
<li> purge_host：按Hostname刷新；</li>
<li> purge_all：刷新全部缓存内容；</li>
<li> purge_cache_tag：按CacheTag刷新；</li><li> prefetch_url：按URL预热。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Quota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Quota(Quota source) {
        if (source.Batch != null) {
            this.Batch = new Long(source.Batch);
        }
        if (source.Daily != null) {
            this.Daily = new Long(source.Daily);
        }
        if (source.DailyAvailable != null) {
            this.DailyAvailable = new Long(source.DailyAvailable);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Batch", this.Batch);
        this.setParamSimple(map, prefix + "Daily", this.Daily);
        this.setParamSimple(map, prefix + "DailyAvailable", this.DailyAvailable);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

