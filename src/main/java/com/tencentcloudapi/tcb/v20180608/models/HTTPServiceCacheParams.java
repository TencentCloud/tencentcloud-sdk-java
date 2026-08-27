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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPServiceCacheParams extends AbstractModel {

    /**
    * <p>遵循源站</p>
    */
    @SerializedName("FollowOrigin")
    @Expose
    private Boolean FollowOrigin;

    /**
    * <p>不缓存</p>
    */
    @SerializedName("NoCache")
    @Expose
    private Boolean NoCache;

    /**
    * <p>自定义缓存时间（秒）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p>
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
    * <p>浏览器缓存秒数（对应 max-age）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p>
    */
    @SerializedName("MaxAgeTime")
    @Expose
    private Long MaxAgeTime;

    /**
     * Get <p>遵循源站</p> 
     * @return FollowOrigin <p>遵循源站</p>
     */
    public Boolean getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set <p>遵循源站</p>
     * @param FollowOrigin <p>遵循源站</p>
     */
    public void setFollowOrigin(Boolean FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    /**
     * Get <p>不缓存</p> 
     * @return NoCache <p>不缓存</p>
     */
    public Boolean getNoCache() {
        return this.NoCache;
    }

    /**
     * Set <p>不缓存</p>
     * @param NoCache <p>不缓存</p>
     */
    public void setNoCache(Boolean NoCache) {
        this.NoCache = NoCache;
    }

    /**
     * Get <p>自定义缓存时间（秒）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p> 
     * @return CacheTime <p>自定义缓存时间（秒）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p>
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set <p>自定义缓存时间（秒）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p>
     * @param CacheTime <p>自定义缓存时间（秒）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p>
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get <p>浏览器缓存秒数（对应 max-age）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p> 
     * @return MaxAgeTime <p>浏览器缓存秒数（对应 max-age）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p>
     */
    public Long getMaxAgeTime() {
        return this.MaxAgeTime;
    }

    /**
     * Set <p>浏览器缓存秒数（对应 max-age）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p>
     * @param MaxAgeTime <p>浏览器缓存秒数（对应 max-age）</p><p>取值范围：[0, 31536000]</p><p>单位：秒</p>
     */
    public void setMaxAgeTime(Long MaxAgeTime) {
        this.MaxAgeTime = MaxAgeTime;
    }

    public HTTPServiceCacheParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceCacheParams(HTTPServiceCacheParams source) {
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new Boolean(source.FollowOrigin);
        }
        if (source.NoCache != null) {
            this.NoCache = new Boolean(source.NoCache);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
        if (source.MaxAgeTime != null) {
            this.MaxAgeTime = new Long(source.MaxAgeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FollowOrigin", this.FollowOrigin);
        this.setParamSimple(map, prefix + "NoCache", this.NoCache);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);
        this.setParamSimple(map, prefix + "MaxAgeTime", this.MaxAgeTime);

    }
}

