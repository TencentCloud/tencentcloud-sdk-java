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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicIdAndRegion extends AbstractModel{

    /**
    * 日志主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志主题id 所在的地域id
地域ID - 访问链接查看详情：https://iwiki.woa.com/pages/viewpage.action?pageId=780556968#id-地域码表-一.region大区（标准地域）
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 日志主题id 
     * @return TopicId 日志主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id
     * @param TopicId 日志主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志主题id 所在的地域id
地域ID - 访问链接查看详情：https://iwiki.woa.com/pages/viewpage.action?pageId=780556968#id-地域码表-一.region大区（标准地域） 
     * @return RegionId 日志主题id 所在的地域id
地域ID - 访问链接查看详情：https://iwiki.woa.com/pages/viewpage.action?pageId=780556968#id-地域码表-一.region大区（标准地域）
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 日志主题id 所在的地域id
地域ID - 访问链接查看详情：https://iwiki.woa.com/pages/viewpage.action?pageId=780556968#id-地域码表-一.region大区（标准地域）
     * @param RegionId 日志主题id 所在的地域id
地域ID - 访问链接查看详情：https://iwiki.woa.com/pages/viewpage.action?pageId=780556968#id-地域码表-一.region大区（标准地域）
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public TopicIdAndRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicIdAndRegion(TopicIdAndRegion source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

