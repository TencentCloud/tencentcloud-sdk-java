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

public class DashboardTopicInfo extends AbstractModel{

    /**
    * 主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * topic所在的地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 主题id 
     * @return TopicId 主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题id
     * @param TopicId 主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get topic所在的地域 
     * @return Region topic所在的地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set topic所在的地域
     * @param Region topic所在的地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DashboardTopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardTopicInfo(DashboardTopicInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

