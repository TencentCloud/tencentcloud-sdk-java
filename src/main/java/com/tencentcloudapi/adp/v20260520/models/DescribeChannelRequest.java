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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChannelRequest extends AbstractModel {

    /**
    * <p>应用业务ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>渠道业务ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>渠道场景：0-B端场景，1-C端场景</p>
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

    /**
     * Get <p>应用业务ID</p> 
     * @return AppId <p>应用业务ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用业务ID</p>
     * @param AppId <p>应用业务ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>渠道业务ID</p> 
     * @return ChannelId <p>渠道业务ID</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>渠道业务ID</p>
     * @param ChannelId <p>渠道业务ID</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>渠道场景：0-B端场景，1-C端场景</p> 
     * @return Scene <p>渠道场景：0-B端场景，1-C端场景</p>
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set <p>渠道场景：0-B端场景，1-C端场景</p>
     * @param Scene <p>渠道场景：0-B端场景，1-C端场景</p>
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
    }

    public DescribeChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChannelRequest(DescribeChannelRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Scene != null) {
            this.Scene = new Long(source.Scene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Scene", this.Scene);

    }
}

