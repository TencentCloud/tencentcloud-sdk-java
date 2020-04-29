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

public class DeleteLiveTranscodeRuleRequest extends AbstractModel{

    /**
    * 播放域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 模板ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get 播放域名。 
     * @return DomainName 播放域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 播放域名。
     * @param DomainName 播放域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。 
     * @return AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     * @param AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 模板ID。 
     * @return TemplateId 模板ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID。
     * @param TemplateId 模板ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
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

