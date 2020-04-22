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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishTime extends AbstractModel{

    /**
    * 推流时间。
UTC 格式，例如：2018-06-29T19:00:00Z。
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
     * Get 推流时间。
UTC 格式，例如：2018-06-29T19:00:00Z。 
     * @return PublishTime 推流时间。
UTC 格式，例如：2018-06-29T19:00:00Z。
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 推流时间。
UTC 格式，例如：2018-06-29T19:00:00Z。
     * @param PublishTime 推流时间。
UTC 格式，例如：2018-06-29T19:00:00Z。
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);

    }
}

