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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedirectConfig extends AbstractModel{

    /**
    * 自定义回源302 follow请求host配置开关，取值有：
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 主源站follow302请求时带的自定义的host头部
    */
    @SerializedName("FollowRedirectHost")
    @Expose
    private String FollowRedirectHost;

    /**
    * 备份源站follow302请求时带的自定义的host头部
    */
    @SerializedName("FollowRedirectBackupHost")
    @Expose
    private String FollowRedirectBackupHost;

    /**
     * Get 自定义回源302 follow请求host配置开关，取值有：
on：开启
off：关闭 
     * @return Switch 自定义回源302 follow请求host配置开关，取值有：
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 自定义回源302 follow请求host配置开关，取值有：
on：开启
off：关闭
     * @param Switch 自定义回源302 follow请求host配置开关，取值有：
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 主源站follow302请求时带的自定义的host头部 
     * @return FollowRedirectHost 主源站follow302请求时带的自定义的host头部
     */
    public String getFollowRedirectHost() {
        return this.FollowRedirectHost;
    }

    /**
     * Set 主源站follow302请求时带的自定义的host头部
     * @param FollowRedirectHost 主源站follow302请求时带的自定义的host头部
     */
    public void setFollowRedirectHost(String FollowRedirectHost) {
        this.FollowRedirectHost = FollowRedirectHost;
    }

    /**
     * Get 备份源站follow302请求时带的自定义的host头部 
     * @return FollowRedirectBackupHost 备份源站follow302请求时带的自定义的host头部
     */
    public String getFollowRedirectBackupHost() {
        return this.FollowRedirectBackupHost;
    }

    /**
     * Set 备份源站follow302请求时带的自定义的host头部
     * @param FollowRedirectBackupHost 备份源站follow302请求时带的自定义的host头部
     */
    public void setFollowRedirectBackupHost(String FollowRedirectBackupHost) {
        this.FollowRedirectBackupHost = FollowRedirectBackupHost;
    }

    public RedirectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedirectConfig(RedirectConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FollowRedirectHost != null) {
            this.FollowRedirectHost = new String(source.FollowRedirectHost);
        }
        if (source.FollowRedirectBackupHost != null) {
            this.FollowRedirectBackupHost = new String(source.FollowRedirectBackupHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FollowRedirectHost", this.FollowRedirectHost);
        this.setParamSimple(map, prefix + "FollowRedirectBackupHost", this.FollowRedirectBackupHost);

    }
}

