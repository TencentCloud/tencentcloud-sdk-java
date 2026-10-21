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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddStreamAuthRequest extends AbstractModel {

    /**
    * <p>鉴权配置ID（uuid）</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>是否开播放鉴权（1:开启,0:关闭）</p>
    */
    @SerializedName("PullState")
    @Expose
    private Long PullState;

    /**
    * <p>播放密钥（仅支持字母数字，长度0-10位）</p>
    */
    @SerializedName("PullSecret")
    @Expose
    private String PullSecret;

    /**
    * <p>播放过期时间（单位：分钟）</p>
    */
    @SerializedName("PullExpired")
    @Expose
    private Long PullExpired;

    /**
    * <p>是否开启推流鉴权（1:开启,0:关闭）</p>
    */
    @SerializedName("PushState")
    @Expose
    private Long PushState;

    /**
    * <p>推流密钥（仅支持字母数字，长度0-10位）</p>
    */
    @SerializedName("PushSecret")
    @Expose
    private String PushSecret;

    /**
    * <p>推流过期时间（单位：分钟）</p>
    */
    @SerializedName("PushExpired")
    @Expose
    private Long PushExpired;

    /**
    * <p>不生效推流鉴权的域名 ID 列表</p>
    */
    @SerializedName("ExcludePushDomainIds")
    @Expose
    private String [] ExcludePushDomainIds;

    /**
     * Get <p>鉴权配置ID（uuid）</p> 
     * @return Id <p>鉴权配置ID（uuid）</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>鉴权配置ID（uuid）</p>
     * @param Id <p>鉴权配置ID（uuid）</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>是否开播放鉴权（1:开启,0:关闭）</p> 
     * @return PullState <p>是否开播放鉴权（1:开启,0:关闭）</p>
     */
    public Long getPullState() {
        return this.PullState;
    }

    /**
     * Set <p>是否开播放鉴权（1:开启,0:关闭）</p>
     * @param PullState <p>是否开播放鉴权（1:开启,0:关闭）</p>
     */
    public void setPullState(Long PullState) {
        this.PullState = PullState;
    }

    /**
     * Get <p>播放密钥（仅支持字母数字，长度0-10位）</p> 
     * @return PullSecret <p>播放密钥（仅支持字母数字，长度0-10位）</p>
     */
    public String getPullSecret() {
        return this.PullSecret;
    }

    /**
     * Set <p>播放密钥（仅支持字母数字，长度0-10位）</p>
     * @param PullSecret <p>播放密钥（仅支持字母数字，长度0-10位）</p>
     */
    public void setPullSecret(String PullSecret) {
        this.PullSecret = PullSecret;
    }

    /**
     * Get <p>播放过期时间（单位：分钟）</p> 
     * @return PullExpired <p>播放过期时间（单位：分钟）</p>
     */
    public Long getPullExpired() {
        return this.PullExpired;
    }

    /**
     * Set <p>播放过期时间（单位：分钟）</p>
     * @param PullExpired <p>播放过期时间（单位：分钟）</p>
     */
    public void setPullExpired(Long PullExpired) {
        this.PullExpired = PullExpired;
    }

    /**
     * Get <p>是否开启推流鉴权（1:开启,0:关闭）</p> 
     * @return PushState <p>是否开启推流鉴权（1:开启,0:关闭）</p>
     */
    public Long getPushState() {
        return this.PushState;
    }

    /**
     * Set <p>是否开启推流鉴权（1:开启,0:关闭）</p>
     * @param PushState <p>是否开启推流鉴权（1:开启,0:关闭）</p>
     */
    public void setPushState(Long PushState) {
        this.PushState = PushState;
    }

    /**
     * Get <p>推流密钥（仅支持字母数字，长度0-10位）</p> 
     * @return PushSecret <p>推流密钥（仅支持字母数字，长度0-10位）</p>
     */
    public String getPushSecret() {
        return this.PushSecret;
    }

    /**
     * Set <p>推流密钥（仅支持字母数字，长度0-10位）</p>
     * @param PushSecret <p>推流密钥（仅支持字母数字，长度0-10位）</p>
     */
    public void setPushSecret(String PushSecret) {
        this.PushSecret = PushSecret;
    }

    /**
     * Get <p>推流过期时间（单位：分钟）</p> 
     * @return PushExpired <p>推流过期时间（单位：分钟）</p>
     */
    public Long getPushExpired() {
        return this.PushExpired;
    }

    /**
     * Set <p>推流过期时间（单位：分钟）</p>
     * @param PushExpired <p>推流过期时间（单位：分钟）</p>
     */
    public void setPushExpired(Long PushExpired) {
        this.PushExpired = PushExpired;
    }

    /**
     * Get <p>不生效推流鉴权的域名 ID 列表</p> 
     * @return ExcludePushDomainIds <p>不生效推流鉴权的域名 ID 列表</p>
     */
    public String [] getExcludePushDomainIds() {
        return this.ExcludePushDomainIds;
    }

    /**
     * Set <p>不生效推流鉴权的域名 ID 列表</p>
     * @param ExcludePushDomainIds <p>不生效推流鉴权的域名 ID 列表</p>
     */
    public void setExcludePushDomainIds(String [] ExcludePushDomainIds) {
        this.ExcludePushDomainIds = ExcludePushDomainIds;
    }

    public AddStreamAuthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddStreamAuthRequest(AddStreamAuthRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PullState != null) {
            this.PullState = new Long(source.PullState);
        }
        if (source.PullSecret != null) {
            this.PullSecret = new String(source.PullSecret);
        }
        if (source.PullExpired != null) {
            this.PullExpired = new Long(source.PullExpired);
        }
        if (source.PushState != null) {
            this.PushState = new Long(source.PushState);
        }
        if (source.PushSecret != null) {
            this.PushSecret = new String(source.PushSecret);
        }
        if (source.PushExpired != null) {
            this.PushExpired = new Long(source.PushExpired);
        }
        if (source.ExcludePushDomainIds != null) {
            this.ExcludePushDomainIds = new String[source.ExcludePushDomainIds.length];
            for (int i = 0; i < source.ExcludePushDomainIds.length; i++) {
                this.ExcludePushDomainIds[i] = new String(source.ExcludePushDomainIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PullState", this.PullState);
        this.setParamSimple(map, prefix + "PullSecret", this.PullSecret);
        this.setParamSimple(map, prefix + "PullExpired", this.PullExpired);
        this.setParamSimple(map, prefix + "PushState", this.PushState);
        this.setParamSimple(map, prefix + "PushSecret", this.PushSecret);
        this.setParamSimple(map, prefix + "PushExpired", this.PushExpired);
        this.setParamArraySimple(map, prefix + "ExcludePushDomainIds.", this.ExcludePushDomainIds);

    }
}

