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

public class ForbidLiveStreamRequest  extends AbstractModel{

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 您的加速域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 恢复流的时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：默认禁播90天，且最长支持禁播90天。
    */
    @SerializedName("ResumeTime")
    @Expose
    private String ResumeTime;

    /**
    * 禁推原因。
注明：请务必填写禁推原因，防止误操作。
长度限制：2048字节。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * 获取推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     * @return AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     * @param AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取您的加速域名。
     * @return DomainName 您的加速域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置您的加速域名。
     * @param DomainName 您的加速域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * 获取流名称。
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * 设置流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * 获取恢复流的时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：默认禁播90天，且最长支持禁播90天。
     * @return ResumeTime 恢复流的时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：默认禁播90天，且最长支持禁播90天。
     */
    public String getResumeTime() {
        return this.ResumeTime;
    }

    /**
     * 设置恢复流的时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：默认禁播90天，且最长支持禁播90天。
     * @param ResumeTime 恢复流的时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：默认禁播90天，且最长支持禁播90天。
     */
    public void setResumeTime(String ResumeTime) {
        this.ResumeTime = ResumeTime;
    }

    /**
     * 获取禁推原因。
注明：请务必填写禁推原因，防止误操作。
长度限制：2048字节。
     * @return Reason 禁推原因。
注明：请务必填写禁推原因，防止误操作。
长度限制：2048字节。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * 设置禁推原因。
注明：请务必填写禁推原因，防止误操作。
长度限制：2048字节。
     * @param Reason 禁推原因。
注明：请务必填写禁推原因，防止误操作。
长度限制：2048字节。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "ResumeTime", this.ResumeTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

