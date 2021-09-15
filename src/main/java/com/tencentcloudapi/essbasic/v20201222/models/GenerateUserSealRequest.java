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

public class GenerateUserSealRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 请求生成个人印章的客户端IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 电子印章名称
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 是否是默认印章 true：是，false：否
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

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
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 请求生成个人印章的客户端IP 
     * @return SourceIp 请求生成个人印章的客户端IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 请求生成个人印章的客户端IP
     * @param SourceIp 请求生成个人印章的客户端IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 电子印章名称 
     * @return SealName 电子印章名称
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 电子印章名称
     * @param SealName 电子印章名称
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 是否是默认印章 true：是，false：否 
     * @return IsDefault 是否是默认印章 true：是，false：否
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否是默认印章 true：是，false：否
     * @param IsDefault 是否是默认印章 true：是，false：否
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public GenerateUserSealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateUserSealRequest(GenerateUserSealRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

