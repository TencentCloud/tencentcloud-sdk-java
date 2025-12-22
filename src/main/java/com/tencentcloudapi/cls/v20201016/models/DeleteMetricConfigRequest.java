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

public class DeleteMetricConfigRequest extends AbstractModel {

    /**
    * 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 指标采集配置id。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
     * Get 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题 
     * @return TopicId 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
     * @param TopicId 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 指标采集配置id。 
     * @return ConfigId 指标采集配置id。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 指标采集配置id。
     * @param ConfigId 指标采集配置id。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    public DeleteMetricConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMetricConfigRequest(DeleteMetricConfigRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);

    }
}

