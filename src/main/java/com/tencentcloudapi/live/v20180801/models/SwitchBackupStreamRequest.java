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

public class SwitchBackupStreamRequest extends AbstractModel {

    /**
    * 推流域名。
    */
    @SerializedName("PushDomainName")
    @Expose
    private String PushDomainName;

    /**
    * 应用名称。
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
    * 查询接口获取到该流所有在推的上行 Sequence。指定要切到的目标上行 Sequence。
    */
    @SerializedName("UpstreamSequence")
    @Expose
    private String UpstreamSequence;

    /**
     * Get 推流域名。 
     * @return PushDomainName 推流域名。
     */
    public String getPushDomainName() {
        return this.PushDomainName;
    }

    /**
     * Set 推流域名。
     * @param PushDomainName 推流域名。
     */
    public void setPushDomainName(String PushDomainName) {
        this.PushDomainName = PushDomainName;
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
     * Get 查询接口获取到该流所有在推的上行 Sequence。指定要切到的目标上行 Sequence。 
     * @return UpstreamSequence 查询接口获取到该流所有在推的上行 Sequence。指定要切到的目标上行 Sequence。
     */
    public String getUpstreamSequence() {
        return this.UpstreamSequence;
    }

    /**
     * Set 查询接口获取到该流所有在推的上行 Sequence。指定要切到的目标上行 Sequence。
     * @param UpstreamSequence 查询接口获取到该流所有在推的上行 Sequence。指定要切到的目标上行 Sequence。
     */
    public void setUpstreamSequence(String UpstreamSequence) {
        this.UpstreamSequence = UpstreamSequence;
    }

    public SwitchBackupStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchBackupStreamRequest(SwitchBackupStreamRequest source) {
        if (source.PushDomainName != null) {
            this.PushDomainName = new String(source.PushDomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.UpstreamSequence != null) {
            this.UpstreamSequence = new String(source.UpstreamSequence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PushDomainName", this.PushDomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "UpstreamSequence", this.UpstreamSequence);

    }
}

