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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLiveDomainStrategyRequest  extends AbstractModel{

    /**
    * 推流域名。
    */
    @SerializedName("PushDomainName")
    @Expose
    private String PushDomainName;

    /**
    * 播放域名。
    */
    @SerializedName("PlayDomainName")
    @Expose
    private String PlayDomainName;

    /**
     * 获取推流域名。
     * @return PushDomainName 推流域名。
     */
    public String getPushDomainName() {
        return this.PushDomainName;
    }

    /**
     * 设置推流域名。
     * @param PushDomainName 推流域名。
     */
    public void setPushDomainName(String PushDomainName) {
        this.PushDomainName = PushDomainName;
    }

    /**
     * 获取播放域名。
     * @return PlayDomainName 播放域名。
     */
    public String getPlayDomainName() {
        return this.PlayDomainName;
    }

    /**
     * 设置播放域名。
     * @param PlayDomainName 播放域名。
     */
    public void setPlayDomainName(String PlayDomainName) {
        this.PlayDomainName = PlayDomainName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PushDomainName", this.PushDomainName);
        this.setParamSimple(map, prefix + "PlayDomainName", this.PlayDomainName);

    }
}

