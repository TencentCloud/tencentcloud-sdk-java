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

public class CreateLiveTranscodeRuleRequest extends AbstractModel{

    /**
    * 播放域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致。如果只绑定域名，则此处填空。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 流名称。如果只绑定域名或路径，则此处填空。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 指定已有的模板Id。
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
     * Get 推流路径，与推流和播放地址中的AppName保持一致。如果只绑定域名，则此处填空。 
     * @return AppName 推流路径，与推流和播放地址中的AppName保持一致。如果只绑定域名，则此处填空。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径，与推流和播放地址中的AppName保持一致。如果只绑定域名，则此处填空。
     * @param AppName 推流路径，与推流和播放地址中的AppName保持一致。如果只绑定域名，则此处填空。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 流名称。如果只绑定域名或路径，则此处填空。 
     * @return StreamName 流名称。如果只绑定域名或路径，则此处填空。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。如果只绑定域名或路径，则此处填空。
     * @param StreamName 流名称。如果只绑定域名或路径，则此处填空。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 指定已有的模板Id。 
     * @return TemplateId 指定已有的模板Id。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 指定已有的模板Id。
     * @param TemplateId 指定已有的模板Id。
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

