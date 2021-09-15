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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSealRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 印章ID
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 请求删除印章的客户端IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 用户唯一标识，默认为空时删除企业印章，如非空则删除个人印章
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 印章ID 
     * @return SealId 印章ID
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章ID
     * @param SealId 印章ID
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 请求删除印章的客户端IP 
     * @return SourceIp 请求删除印章的客户端IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 请求删除印章的客户端IP
     * @param SourceIp 请求删除印章的客户端IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 用户唯一标识，默认为空时删除企业印章，如非空则删除个人印章 
     * @return UserId 用户唯一标识，默认为空时删除企业印章，如非空则删除个人印章
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一标识，默认为空时删除企业印章，如非空则删除个人印章
     * @param UserId 用户唯一标识，默认为空时删除企业印章，如非空则删除个人印章
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DeleteSealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSealRequest(DeleteSealRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

