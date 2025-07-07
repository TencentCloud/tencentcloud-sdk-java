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

public class CreateLiveTimeShiftRuleRequest extends AbstractModel {

    /**
    * 推流域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。注：如果需要对所有AppName生效，可填写“*”。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 流名称。注：如果本参数设置为非空字符串，规则将只对此推流起作用。如果需要对所有StreamName生效，可填写“*”。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get 推流域名。 
     * @return DomainName 推流域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。
     * @param DomainName 推流域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。注：如果需要对所有AppName生效，可填写“*”。 
     * @return AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。注：如果需要对所有AppName生效，可填写“*”。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。注：如果需要对所有AppName生效，可填写“*”。
     * @param AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。注：如果需要对所有AppName生效，可填写“*”。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 流名称。注：如果本参数设置为非空字符串，规则将只对此推流起作用。如果需要对所有StreamName生效，可填写“*”。 
     * @return StreamName 流名称。注：如果本参数设置为非空字符串，规则将只对此推流起作用。如果需要对所有StreamName生效，可填写“*”。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。注：如果本参数设置为非空字符串，规则将只对此推流起作用。如果需要对所有StreamName生效，可填写“*”。
     * @param StreamName 流名称。注：如果本参数设置为非空字符串，规则将只对此推流起作用。如果需要对所有StreamName生效，可填写“*”。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 模板 ID。 
     * @return TemplateId 模板 ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 ID。
     * @param TemplateId 模板 ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    public CreateLiveTimeShiftRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveTimeShiftRuleRequest(CreateLiveTimeShiftRuleRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

