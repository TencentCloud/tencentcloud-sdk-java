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

public class CreateAnonymousAccessTokenRequest extends AbstractModel{

    /**
    * Token的TTL(time to alive)分钟数,最大值1440(即24小时)
    */
    @SerializedName("TtlMinutes")
    @Expose
    private Long TtlMinutes;

    /**
    * 设备ID。创建Token时, 此参数为必须项
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 旧的AccessToken。续期Token时，此参数为必须
    */
    @SerializedName("OldAccessToken")
    @Expose
    private String OldAccessToken;

    /**
     * Get Token的TTL(time to alive)分钟数,最大值1440(即24小时) 
     * @return TtlMinutes Token的TTL(time to alive)分钟数,最大值1440(即24小时)
     */
    public Long getTtlMinutes() {
        return this.TtlMinutes;
    }

    /**
     * Set Token的TTL(time to alive)分钟数,最大值1440(即24小时)
     * @param TtlMinutes Token的TTL(time to alive)分钟数,最大值1440(即24小时)
     */
    public void setTtlMinutes(Long TtlMinutes) {
        this.TtlMinutes = TtlMinutes;
    }

    /**
     * Get 设备ID。创建Token时, 此参数为必须项 
     * @return Tid 设备ID。创建Token时, 此参数为必须项
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备ID。创建Token时, 此参数为必须项
     * @param Tid 设备ID。创建Token时, 此参数为必须项
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 旧的AccessToken。续期Token时，此参数为必须 
     * @return OldAccessToken 旧的AccessToken。续期Token时，此参数为必须
     */
    public String getOldAccessToken() {
        return this.OldAccessToken;
    }

    /**
     * Set 旧的AccessToken。续期Token时，此参数为必须
     * @param OldAccessToken 旧的AccessToken。续期Token时，此参数为必须
     */
    public void setOldAccessToken(String OldAccessToken) {
        this.OldAccessToken = OldAccessToken;
    }

    public CreateAnonymousAccessTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAnonymousAccessTokenRequest(CreateAnonymousAccessTokenRequest source) {
        if (source.TtlMinutes != null) {
            this.TtlMinutes = new Long(source.TtlMinutes);
        }
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.OldAccessToken != null) {
            this.OldAccessToken = new String(source.OldAccessToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TtlMinutes", this.TtlMinutes);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "OldAccessToken", this.OldAccessToken);

    }
}

