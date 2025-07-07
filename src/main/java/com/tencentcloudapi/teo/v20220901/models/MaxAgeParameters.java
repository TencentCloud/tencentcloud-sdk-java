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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAgeParameters extends AbstractModel {

    /**
    * 遵循源站 Cache-Control 开关，取值有：
<li>on：遵循源站，忽略 CacheTime 时间设置；</li>
<li>off：不遵循源站，使用 CacheTime 时间设置。</li>
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
    * 自定义缓存时间数值，单位为秒，取值：0～315360000。<br>注意：当 FollowOrigin 为 off 时，表示不遵循源站，使用 CacheTime 设置缓存时间，否则此字段不生效。
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get 遵循源站 Cache-Control 开关，取值有：
<li>on：遵循源站，忽略 CacheTime 时间设置；</li>
<li>off：不遵循源站，使用 CacheTime 时间设置。</li> 
     * @return FollowOrigin 遵循源站 Cache-Control 开关，取值有：
<li>on：遵循源站，忽略 CacheTime 时间设置；</li>
<li>off：不遵循源站，使用 CacheTime 时间设置。</li>
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set 遵循源站 Cache-Control 开关，取值有：
<li>on：遵循源站，忽略 CacheTime 时间设置；</li>
<li>off：不遵循源站，使用 CacheTime 时间设置。</li>
     * @param FollowOrigin 遵循源站 Cache-Control 开关，取值有：
<li>on：遵循源站，忽略 CacheTime 时间设置；</li>
<li>off：不遵循源站，使用 CacheTime 时间设置。</li>
     */
    public void setFollowOrigin(String FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    /**
     * Get 自定义缓存时间数值，单位为秒，取值：0～315360000。<br>注意：当 FollowOrigin 为 off 时，表示不遵循源站，使用 CacheTime 设置缓存时间，否则此字段不生效。 
     * @return CacheTime 自定义缓存时间数值，单位为秒，取值：0～315360000。<br>注意：当 FollowOrigin 为 off 时，表示不遵循源站，使用 CacheTime 设置缓存时间，否则此字段不生效。
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set 自定义缓存时间数值，单位为秒，取值：0～315360000。<br>注意：当 FollowOrigin 为 off 时，表示不遵循源站，使用 CacheTime 设置缓存时间，否则此字段不生效。
     * @param CacheTime 自定义缓存时间数值，单位为秒，取值：0～315360000。<br>注意：当 FollowOrigin 为 off 时，表示不遵循源站，使用 CacheTime 设置缓存时间，否则此字段不生效。
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    public MaxAgeParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxAgeParameters(MaxAgeParameters source) {
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new String(source.FollowOrigin);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FollowOrigin", this.FollowOrigin);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

