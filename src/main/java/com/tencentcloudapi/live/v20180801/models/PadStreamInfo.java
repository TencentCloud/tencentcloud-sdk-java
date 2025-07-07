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

public class PadStreamInfo extends AbstractModel {

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 推流域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 垫片流类型。
0-自动垫片；
1-手动切入垫片。
    */
    @SerializedName("PadStreamType")
    @Expose
    private String PadStreamType;

    /**
    * 垫片流开始时间。UTC时间，示例：2025-04-10T00:01:00Z。注意：该时间与北京时间相差八小时。
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

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
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

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
     * Get 垫片流类型。
0-自动垫片；
1-手动切入垫片。 
     * @return PadStreamType 垫片流类型。
0-自动垫片；
1-手动切入垫片。
     */
    public String getPadStreamType() {
        return this.PadStreamType;
    }

    /**
     * Set 垫片流类型。
0-自动垫片；
1-手动切入垫片。
     * @param PadStreamType 垫片流类型。
0-自动垫片；
1-手动切入垫片。
     */
    public void setPadStreamType(String PadStreamType) {
        this.PadStreamType = PadStreamType;
    }

    /**
     * Get 垫片流开始时间。UTC时间，示例：2025-04-10T00:01:00Z。注意：该时间与北京时间相差八小时。 
     * @return PublishTime 垫片流开始时间。UTC时间，示例：2025-04-10T00:01:00Z。注意：该时间与北京时间相差八小时。
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 垫片流开始时间。UTC时间，示例：2025-04-10T00:01:00Z。注意：该时间与北京时间相差八小时。
     * @param PublishTime 垫片流开始时间。UTC时间，示例：2025-04-10T00:01:00Z。注意：该时间与北京时间相差八小时。
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    public PadStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PadStreamInfo(PadStreamInfo source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.PadStreamType != null) {
            this.PadStreamType = new String(source.PadStreamType);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "PadStreamType", this.PadStreamType);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);

    }
}

