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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAge extends AbstractModel{

    /**
    * 是否遵循源站，取值有：
<li>on：遵循源站，忽略MaxAge 时间设置；</li>
<li>off：不遵循源站，使用MaxAge 时间设置。</li>
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
    * MaxAge 时间设置，单位秒，最大365天。
注意：时间为0，即不缓存。
    */
    @SerializedName("MaxAgeTime")
    @Expose
    private Long MaxAgeTime;

    /**
     * Get 是否遵循源站，取值有：
<li>on：遵循源站，忽略MaxAge 时间设置；</li>
<li>off：不遵循源站，使用MaxAge 时间设置。</li> 
     * @return FollowOrigin 是否遵循源站，取值有：
<li>on：遵循源站，忽略MaxAge 时间设置；</li>
<li>off：不遵循源站，使用MaxAge 时间设置。</li>
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set 是否遵循源站，取值有：
<li>on：遵循源站，忽略MaxAge 时间设置；</li>
<li>off：不遵循源站，使用MaxAge 时间设置。</li>
     * @param FollowOrigin 是否遵循源站，取值有：
<li>on：遵循源站，忽略MaxAge 时间设置；</li>
<li>off：不遵循源站，使用MaxAge 时间设置。</li>
     */
    public void setFollowOrigin(String FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    /**
     * Get MaxAge 时间设置，单位秒，最大365天。
注意：时间为0，即不缓存。 
     * @return MaxAgeTime MaxAge 时间设置，单位秒，最大365天。
注意：时间为0，即不缓存。
     */
    public Long getMaxAgeTime() {
        return this.MaxAgeTime;
    }

    /**
     * Set MaxAge 时间设置，单位秒，最大365天。
注意：时间为0，即不缓存。
     * @param MaxAgeTime MaxAge 时间设置，单位秒，最大365天。
注意：时间为0，即不缓存。
     */
    public void setMaxAgeTime(Long MaxAgeTime) {
        this.MaxAgeTime = MaxAgeTime;
    }

    public MaxAge() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxAge(MaxAge source) {
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new String(source.FollowOrigin);
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
        this.setParamSimple(map, prefix + "MaxAgeTime", this.MaxAgeTime);

    }
}

