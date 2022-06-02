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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailHost extends AbstractModel{

    /**
    * 腾讯云账号ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 加速服务状态
process：部署中
online：已启动
offline：已关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 腾讯云账号ID 
     * @return AppId 腾讯云账号ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 腾讯云账号ID
     * @param AppId 腾讯云账号ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 加速服务状态
process：部署中
online：已启动
offline：已关闭 
     * @return Status 加速服务状态
process：部署中
online：已启动
offline：已关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 加速服务状态
process：部署中
online：已启动
offline：已关闭
     * @param Status 加速服务状态
process：部署中
online：已启动
offline：已关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 域名 
     * @return Host 域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 域名
     * @param Host 域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public DetailHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailHost(DetailHost source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

