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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateEnvRequest extends AbstractModel {

    /**
    * <p>分配请求ID，会按这个值做幂等</p><p>入参限制：长度不超过64</p>
    */
    @SerializedName("AllocateId")
    @Expose
    private String AllocateId;

    /**
    * <p>客户平台的应用标识，如果没有则不传</p>
    */
    @SerializedName("ExternalAppId")
    @Expose
    private String ExternalAppId;

    /**
    * <p>自定义标签</p><p>参数格式：逗号分隔的 key=value 对，key/value 仅允许字母、数字、下划线。k1=v1,k2=v2</p>
    */
    @SerializedName("ExternalTag")
    @Expose
    private String ExternalTag;

    /**
    * <p>是否需要云函数</p><p>默认值：false</p>
    */
    @SerializedName("RequireFunction")
    @Expose
    private Boolean RequireFunction;

    /**
     * Get <p>分配请求ID，会按这个值做幂等</p><p>入参限制：长度不超过64</p> 
     * @return AllocateId <p>分配请求ID，会按这个值做幂等</p><p>入参限制：长度不超过64</p>
     */
    public String getAllocateId() {
        return this.AllocateId;
    }

    /**
     * Set <p>分配请求ID，会按这个值做幂等</p><p>入参限制：长度不超过64</p>
     * @param AllocateId <p>分配请求ID，会按这个值做幂等</p><p>入参限制：长度不超过64</p>
     */
    public void setAllocateId(String AllocateId) {
        this.AllocateId = AllocateId;
    }

    /**
     * Get <p>客户平台的应用标识，如果没有则不传</p> 
     * @return ExternalAppId <p>客户平台的应用标识，如果没有则不传</p>
     */
    public String getExternalAppId() {
        return this.ExternalAppId;
    }

    /**
     * Set <p>客户平台的应用标识，如果没有则不传</p>
     * @param ExternalAppId <p>客户平台的应用标识，如果没有则不传</p>
     */
    public void setExternalAppId(String ExternalAppId) {
        this.ExternalAppId = ExternalAppId;
    }

    /**
     * Get <p>自定义标签</p><p>参数格式：逗号分隔的 key=value 对，key/value 仅允许字母、数字、下划线。k1=v1,k2=v2</p> 
     * @return ExternalTag <p>自定义标签</p><p>参数格式：逗号分隔的 key=value 对，key/value 仅允许字母、数字、下划线。k1=v1,k2=v2</p>
     */
    public String getExternalTag() {
        return this.ExternalTag;
    }

    /**
     * Set <p>自定义标签</p><p>参数格式：逗号分隔的 key=value 对，key/value 仅允许字母、数字、下划线。k1=v1,k2=v2</p>
     * @param ExternalTag <p>自定义标签</p><p>参数格式：逗号分隔的 key=value 对，key/value 仅允许字母、数字、下划线。k1=v1,k2=v2</p>
     */
    public void setExternalTag(String ExternalTag) {
        this.ExternalTag = ExternalTag;
    }

    /**
     * Get <p>是否需要云函数</p><p>默认值：false</p> 
     * @return RequireFunction <p>是否需要云函数</p><p>默认值：false</p>
     */
    public Boolean getRequireFunction() {
        return this.RequireFunction;
    }

    /**
     * Set <p>是否需要云函数</p><p>默认值：false</p>
     * @param RequireFunction <p>是否需要云函数</p><p>默认值：false</p>
     */
    public void setRequireFunction(Boolean RequireFunction) {
        this.RequireFunction = RequireFunction;
    }

    public AllocateEnvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateEnvRequest(AllocateEnvRequest source) {
        if (source.AllocateId != null) {
            this.AllocateId = new String(source.AllocateId);
        }
        if (source.ExternalAppId != null) {
            this.ExternalAppId = new String(source.ExternalAppId);
        }
        if (source.ExternalTag != null) {
            this.ExternalTag = new String(source.ExternalTag);
        }
        if (source.RequireFunction != null) {
            this.RequireFunction = new Boolean(source.RequireFunction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllocateId", this.AllocateId);
        this.setParamSimple(map, prefix + "ExternalAppId", this.ExternalAppId);
        this.setParamSimple(map, prefix + "ExternalTag", this.ExternalTag);
        this.setParamSimple(map, prefix + "RequireFunction", this.RequireFunction);

    }
}

