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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeCallbackInfo extends AbstractModel {

    /**
    * 回调目标 ID
    */
    @SerializedName("CallbackId")
    @Expose
    private String CallbackId;

    /**
    * 回调签名 token
    */
    @SerializedName("CallbackToken")
    @Expose
    private String CallbackToken;

    /**
    * 回调 URL
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 创建时间（秒级时间戳）
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 回调类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 更新时间（秒级时间戳）
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 回调目标 ID 
     * @return CallbackId 回调目标 ID
     */
    public String getCallbackId() {
        return this.CallbackId;
    }

    /**
     * Set 回调目标 ID
     * @param CallbackId 回调目标 ID
     */
    public void setCallbackId(String CallbackId) {
        this.CallbackId = CallbackId;
    }

    /**
     * Get 回调签名 token 
     * @return CallbackToken 回调签名 token
     */
    public String getCallbackToken() {
        return this.CallbackToken;
    }

    /**
     * Set 回调签名 token
     * @param CallbackToken 回调签名 token
     */
    public void setCallbackToken(String CallbackToken) {
        this.CallbackToken = CallbackToken;
    }

    /**
     * Get 回调 URL 
     * @return CallbackUrl 回调 URL
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调 URL
     * @param CallbackUrl 回调 URL
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 创建时间（秒级时间戳） 
     * @return CreateTime 创建时间（秒级时间戳）
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间（秒级时间戳）
     * @param CreateTime 创建时间（秒级时间戳）
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 回调类型 
     * @return Type 回调类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 回调类型
     * @param Type 回调类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 更新时间（秒级时间戳） 
     * @return UpdateTime 更新时间（秒级时间戳）
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间（秒级时间戳）
     * @param UpdateTime 更新时间（秒级时间戳）
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SeeCallbackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeCallbackInfo(SeeCallbackInfo source) {
        if (source.CallbackId != null) {
            this.CallbackId = new String(source.CallbackId);
        }
        if (source.CallbackToken != null) {
            this.CallbackToken = new String(source.CallbackToken);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackId", this.CallbackId);
        this.setParamSimple(map, prefix + "CallbackToken", this.CallbackToken);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

