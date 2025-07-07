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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppDetailResponse extends AbstractModel {

    /**
    * SDK 对应的AppId 
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 应用配置
    */
    @SerializedName("AppConfig")
    @Expose
    private AppConfig AppConfig;

    /**
    * 场景配置
    */
    @SerializedName("SceneConfig")
    @Expose
    private SceneItem [] SceneConfig;

    /**
    * 转存配置
    */
    @SerializedName("TransferConfig")
    @Expose
    private TransferItem TransferConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SDK 对应的AppId  
     * @return SdkAppId SDK 对应的AppId 
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SDK 对应的AppId 
     * @param SdkAppId SDK 对应的AppId 
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 应用配置 
     * @return AppConfig 应用配置
     */
    public AppConfig getAppConfig() {
        return this.AppConfig;
    }

    /**
     * Set 应用配置
     * @param AppConfig 应用配置
     */
    public void setAppConfig(AppConfig AppConfig) {
        this.AppConfig = AppConfig;
    }

    /**
     * Get 场景配置 
     * @return SceneConfig 场景配置
     */
    public SceneItem [] getSceneConfig() {
        return this.SceneConfig;
    }

    /**
     * Set 场景配置
     * @param SceneConfig 场景配置
     */
    public void setSceneConfig(SceneItem [] SceneConfig) {
        this.SceneConfig = SceneConfig;
    }

    /**
     * Get 转存配置 
     * @return TransferConfig 转存配置
     */
    public TransferItem getTransferConfig() {
        return this.TransferConfig;
    }

    /**
     * Set 转存配置
     * @param TransferConfig 转存配置
     */
    public void setTransferConfig(TransferItem TransferConfig) {
        this.TransferConfig = TransferConfig;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAppDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppDetailResponse(DescribeAppDetailResponse source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.AppConfig != null) {
            this.AppConfig = new AppConfig(source.AppConfig);
        }
        if (source.SceneConfig != null) {
            this.SceneConfig = new SceneItem[source.SceneConfig.length];
            for (int i = 0; i < source.SceneConfig.length; i++) {
                this.SceneConfig[i] = new SceneItem(source.SceneConfig[i]);
            }
        }
        if (source.TransferConfig != null) {
            this.TransferConfig = new TransferItem(source.TransferConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamObj(map, prefix + "AppConfig.", this.AppConfig);
        this.setParamArrayObj(map, prefix + "SceneConfig.", this.SceneConfig);
        this.setParamObj(map, prefix + "TransferConfig.", this.TransferConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

