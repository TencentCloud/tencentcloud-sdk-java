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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RevokeFileConfigRequest extends AbstractModel {

    /**
    * 按照【配置项发布ID】进行撤回。可通过调用[DescribeFileConfigReleases](https://cloud.tencent.com/document/product/649/85855)查询已发布的文件配置列表或登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=file)-查看发布信息-发布情况进行查看；也可以调用[ReleaseFileConfig](https://cloud.tencent.com/document/product/649/58592)发布文件配置。
    */
    @SerializedName("ConfigReleaseId")
    @Expose
    private String ConfigReleaseId;

    /**
     * Get 按照【配置项发布ID】进行撤回。可通过调用[DescribeFileConfigReleases](https://cloud.tencent.com/document/product/649/85855)查询已发布的文件配置列表或登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=file)-查看发布信息-发布情况进行查看；也可以调用[ReleaseFileConfig](https://cloud.tencent.com/document/product/649/58592)发布文件配置。 
     * @return ConfigReleaseId 按照【配置项发布ID】进行撤回。可通过调用[DescribeFileConfigReleases](https://cloud.tencent.com/document/product/649/85855)查询已发布的文件配置列表或登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=file)-查看发布信息-发布情况进行查看；也可以调用[ReleaseFileConfig](https://cloud.tencent.com/document/product/649/58592)发布文件配置。
     */
    public String getConfigReleaseId() {
        return this.ConfigReleaseId;
    }

    /**
     * Set 按照【配置项发布ID】进行撤回。可通过调用[DescribeFileConfigReleases](https://cloud.tencent.com/document/product/649/85855)查询已发布的文件配置列表或登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=file)-查看发布信息-发布情况进行查看；也可以调用[ReleaseFileConfig](https://cloud.tencent.com/document/product/649/58592)发布文件配置。
     * @param ConfigReleaseId 按照【配置项发布ID】进行撤回。可通过调用[DescribeFileConfigReleases](https://cloud.tencent.com/document/product/649/85855)查询已发布的文件配置列表或登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=file)-查看发布信息-发布情况进行查看；也可以调用[ReleaseFileConfig](https://cloud.tencent.com/document/product/649/58592)发布文件配置。
     */
    public void setConfigReleaseId(String ConfigReleaseId) {
        this.ConfigReleaseId = ConfigReleaseId;
    }

    public RevokeFileConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokeFileConfigRequest(RevokeFileConfigRequest source) {
        if (source.ConfigReleaseId != null) {
            this.ConfigReleaseId = new String(source.ConfigReleaseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigReleaseId", this.ConfigReleaseId);

    }
}

