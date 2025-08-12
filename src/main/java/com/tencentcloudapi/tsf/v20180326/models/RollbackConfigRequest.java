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

public class RollbackConfigRequest extends AbstractModel {

    /**
    * 配置项发布历史ID。该参数可以通过调用 [DescribeConfigReleaseLogs](https://cloud.tencent.com/document/product/649/38343) 的返回值中的 ConfigReleaseLogId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=app)配置详情-发布情况页查看。
    */
    @SerializedName("ConfigReleaseLogId")
    @Expose
    private String ConfigReleaseLogId;

    /**
    * 回滚描述，最多支持200个字符。
    */
    @SerializedName("ReleaseDesc")
    @Expose
    private String ReleaseDesc;

    /**
     * Get 配置项发布历史ID。该参数可以通过调用 [DescribeConfigReleaseLogs](https://cloud.tencent.com/document/product/649/38343) 的返回值中的 ConfigReleaseLogId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=app)配置详情-发布情况页查看。 
     * @return ConfigReleaseLogId 配置项发布历史ID。该参数可以通过调用 [DescribeConfigReleaseLogs](https://cloud.tencent.com/document/product/649/38343) 的返回值中的 ConfigReleaseLogId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=app)配置详情-发布情况页查看。
     */
    public String getConfigReleaseLogId() {
        return this.ConfigReleaseLogId;
    }

    /**
     * Set 配置项发布历史ID。该参数可以通过调用 [DescribeConfigReleaseLogs](https://cloud.tencent.com/document/product/649/38343) 的返回值中的 ConfigReleaseLogId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=app)配置详情-发布情况页查看。
     * @param ConfigReleaseLogId 配置项发布历史ID。该参数可以通过调用 [DescribeConfigReleaseLogs](https://cloud.tencent.com/document/product/649/38343) 的返回值中的 ConfigReleaseLogId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=app)配置详情-发布情况页查看。
     */
    public void setConfigReleaseLogId(String ConfigReleaseLogId) {
        this.ConfigReleaseLogId = ConfigReleaseLogId;
    }

    /**
     * Get 回滚描述，最多支持200个字符。 
     * @return ReleaseDesc 回滚描述，最多支持200个字符。
     */
    public String getReleaseDesc() {
        return this.ReleaseDesc;
    }

    /**
     * Set 回滚描述，最多支持200个字符。
     * @param ReleaseDesc 回滚描述，最多支持200个字符。
     */
    public void setReleaseDesc(String ReleaseDesc) {
        this.ReleaseDesc = ReleaseDesc;
    }

    public RollbackConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackConfigRequest(RollbackConfigRequest source) {
        if (source.ConfigReleaseLogId != null) {
            this.ConfigReleaseLogId = new String(source.ConfigReleaseLogId);
        }
        if (source.ReleaseDesc != null) {
            this.ReleaseDesc = new String(source.ReleaseDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigReleaseLogId", this.ConfigReleaseLogId);
        this.setParamSimple(map, prefix + "ReleaseDesc", this.ReleaseDesc);

    }
}

