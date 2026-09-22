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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAuditRuleRequest extends AbstractModel {

    /**
    * <p>推流域名。</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>推流路径，与推流和播放地址中的AppName保持一致。</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>流名称 。 不传默认为空。</p>
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get <p>推流域名。</p> 
     * @return DomainName <p>推流域名。</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>推流域名。</p>
     * @param DomainName <p>推流域名。</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>推流路径，与推流和播放地址中的AppName保持一致。</p> 
     * @return AppName <p>推流路径，与推流和播放地址中的AppName保持一致。</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>推流路径，与推流和播放地址中的AppName保持一致。</p>
     * @param AppName <p>推流路径，与推流和播放地址中的AppName保持一致。</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>流名称 。 不传默认为空。</p> 
     * @return StreamName <p>流名称 。 不传默认为空。</p>
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set <p>流名称 。 不传默认为空。</p>
     * @param StreamName <p>流名称 。 不传默认为空。</p>
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    public DeleteAuditRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAuditRuleRequest(DeleteAuditRuleRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

