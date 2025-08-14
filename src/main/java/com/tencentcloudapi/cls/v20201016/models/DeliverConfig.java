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

public class DeliverConfig extends AbstractModel {

    /**
    * 地域信息。

示例：
 ap-guangzhou  广州地域；
ap-nanjing 南京地域。

详细信息请查看官网：

https://cloud.tencent.com/document/product/614/18940
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 投递数据范围。

0: 全部日志, 包括告警策略日常周期执行的所有日志，也包括告警策略变更产生的日志，默认值

1:仅告警触发及恢复日志
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
     * Get 地域信息。

示例：
 ap-guangzhou  广州地域；
ap-nanjing 南京地域。

详细信息请查看官网：

https://cloud.tencent.com/document/product/614/18940 
     * @return Region 地域信息。

示例：
 ap-guangzhou  广州地域；
ap-nanjing 南京地域。

详细信息请查看官网：

https://cloud.tencent.com/document/product/614/18940
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息。

示例：
 ap-guangzhou  广州地域；
ap-nanjing 南京地域。

详细信息请查看官网：

https://cloud.tencent.com/document/product/614/18940
     * @param Region 地域信息。

示例：
 ap-guangzhou  广州地域；
ap-nanjing 南京地域。

详细信息请查看官网：

https://cloud.tencent.com/document/product/614/18940
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID 
     * @return TopicId 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID
     * @param TopicId 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 投递数据范围。

0: 全部日志, 包括告警策略日常周期执行的所有日志，也包括告警策略变更产生的日志，默认值

1:仅告警触发及恢复日志 
     * @return Scope 投递数据范围。

0: 全部日志, 包括告警策略日常周期执行的所有日志，也包括告警策略变更产生的日志，默认值

1:仅告警触发及恢复日志
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 投递数据范围。

0: 全部日志, 包括告警策略日常周期执行的所有日志，也包括告警策略变更产生的日志，默认值

1:仅告警触发及恢复日志
     * @param Scope 投递数据范围。

0: 全部日志, 包括告警策略日常周期执行的所有日志，也包括告警策略变更产生的日志，默认值

1:仅告警触发及恢复日志
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    public DeliverConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverConfig(DeliverConfig source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);

    }
}

