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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigGroupVersionDetailResponse extends AbstractModel {

    /**
    * 版本信息。
    */
    @SerializedName("ConfigGroupVersionInfo")
    @Expose
    private ConfigGroupVersionInfo ConfigGroupVersionInfo;

    /**
    * 版本文件的内容。以 JSON 格式返回。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 版本信息。 
     * @return ConfigGroupVersionInfo 版本信息。
     */
    public ConfigGroupVersionInfo getConfigGroupVersionInfo() {
        return this.ConfigGroupVersionInfo;
    }

    /**
     * Set 版本信息。
     * @param ConfigGroupVersionInfo 版本信息。
     */
    public void setConfigGroupVersionInfo(ConfigGroupVersionInfo ConfigGroupVersionInfo) {
        this.ConfigGroupVersionInfo = ConfigGroupVersionInfo;
    }

    /**
     * Get 版本文件的内容。以 JSON 格式返回。 
     * @return Content 版本文件的内容。以 JSON 格式返回。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 版本文件的内容。以 JSON 格式返回。
     * @param Content 版本文件的内容。以 JSON 格式返回。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeConfigGroupVersionDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigGroupVersionDetailResponse(DescribeConfigGroupVersionDetailResponse source) {
        if (source.ConfigGroupVersionInfo != null) {
            this.ConfigGroupVersionInfo = new ConfigGroupVersionInfo(source.ConfigGroupVersionInfo);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ConfigGroupVersionInfo.", this.ConfigGroupVersionInfo);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

