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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUsrTokenRequest extends AbstractModel{

    /**
    * 终端用户在IoT Video上的唯一标识ID
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 终端唯一ID，用于区分同一个用户的多个终端
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
    * Token的TTL(time to alive)分钟数
    */
    @SerializedName("TtlMinutes")
    @Expose
    private Long TtlMinutes;

    /**
    * 旧的AccessToken。续期Token时，此参数为必须。
    */
    @SerializedName("OldAccessToken")
    @Expose
    private String OldAccessToken;

    /**
     * Get 终端用户在IoT Video上的唯一标识ID 
     * @return AccessId 终端用户在IoT Video上的唯一标识ID
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 终端用户在IoT Video上的唯一标识ID
     * @param AccessId 终端用户在IoT Video上的唯一标识ID
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 终端唯一ID，用于区分同一个用户的多个终端 
     * @return UniqueId 终端唯一ID，用于区分同一个用户的多个终端
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set 终端唯一ID，用于区分同一个用户的多个终端
     * @param UniqueId 终端唯一ID，用于区分同一个用户的多个终端
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get Token的TTL(time to alive)分钟数 
     * @return TtlMinutes Token的TTL(time to alive)分钟数
     */
    public Long getTtlMinutes() {
        return this.TtlMinutes;
    }

    /**
     * Set Token的TTL(time to alive)分钟数
     * @param TtlMinutes Token的TTL(time to alive)分钟数
     */
    public void setTtlMinutes(Long TtlMinutes) {
        this.TtlMinutes = TtlMinutes;
    }

    /**
     * Get 旧的AccessToken。续期Token时，此参数为必须。 
     * @return OldAccessToken 旧的AccessToken。续期Token时，此参数为必须。
     */
    public String getOldAccessToken() {
        return this.OldAccessToken;
    }

    /**
     * Set 旧的AccessToken。续期Token时，此参数为必须。
     * @param OldAccessToken 旧的AccessToken。续期Token时，此参数为必须。
     */
    public void setOldAccessToken(String OldAccessToken) {
        this.OldAccessToken = OldAccessToken;
    }

    public CreateUsrTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUsrTokenRequest(CreateUsrTokenRequest source) {
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.UniqueId != null) {
            this.UniqueId = new String(source.UniqueId);
        }
        if (source.TtlMinutes != null) {
            this.TtlMinutes = new Long(source.TtlMinutes);
        }
        if (source.OldAccessToken != null) {
            this.OldAccessToken = new String(source.OldAccessToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "UniqueId", this.UniqueId);
        this.setParamSimple(map, prefix + "TtlMinutes", this.TtlMinutes);
        this.setParamSimple(map, prefix + "OldAccessToken", this.OldAccessToken);

    }
}

