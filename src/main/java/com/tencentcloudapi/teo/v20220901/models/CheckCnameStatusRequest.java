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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckCnameStatusRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 需要检测 CNAME 配置状态的域名列表，可以为：<li>加速域名;</li><li>别称域名。</li>
    */
    @SerializedName("RecordNames")
    @Expose
    private String [] RecordNames;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 需要检测 CNAME 配置状态的域名列表，可以为：<li>加速域名;</li><li>别称域名。</li> 
     * @return RecordNames 需要检测 CNAME 配置状态的域名列表，可以为：<li>加速域名;</li><li>别称域名。</li>
     */
    public String [] getRecordNames() {
        return this.RecordNames;
    }

    /**
     * Set 需要检测 CNAME 配置状态的域名列表，可以为：<li>加速域名;</li><li>别称域名。</li>
     * @param RecordNames 需要检测 CNAME 配置状态的域名列表，可以为：<li>加速域名;</li><li>别称域名。</li>
     */
    public void setRecordNames(String [] RecordNames) {
        this.RecordNames = RecordNames;
    }

    public CheckCnameStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckCnameStatusRequest(CheckCnameStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RecordNames != null) {
            this.RecordNames = new String[source.RecordNames.length];
            for (int i = 0; i < source.RecordNames.length; i++) {
                this.RecordNames[i] = new String(source.RecordNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "RecordNames.", this.RecordNames);

    }
}

