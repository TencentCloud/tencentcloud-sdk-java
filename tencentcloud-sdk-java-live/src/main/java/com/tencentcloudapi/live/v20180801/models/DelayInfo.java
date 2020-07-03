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

public class DelayInfo extends AbstractModel{

    /**
    * 推流域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流路径，与推流和播放地址中的 
 AppName 保持一致，默认为 live。
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
    * 延播时间，单位：秒。
    */
    @SerializedName("DelayInterval")
    @Expose
    private Long DelayInterval;

    /**
    * 创建时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 过期时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 当前状态:
-1：已过期。
1： 生效中。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get 推流路径，与推流和播放地址中的 
 AppName 保持一致，默认为 live。 
     * @return AppName 推流路径，与推流和播放地址中的 
 AppName 保持一致，默认为 live。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径，与推流和播放地址中的 
 AppName 保持一致，默认为 live。
     * @param AppName 推流路径，与推流和播放地址中的 
 AppName 保持一致，默认为 live。
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
     * Get 延播时间，单位：秒。 
     * @return DelayInterval 延播时间，单位：秒。
     */
    public Long getDelayInterval() {
        return this.DelayInterval;
    }

    /**
     * Set 延播时间，单位：秒。
     * @param DelayInterval 延播时间，单位：秒。
     */
    public void setDelayInterval(Long DelayInterval) {
        this.DelayInterval = DelayInterval;
    }

    /**
     * Get 创建时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。 
     * @return CreateTime 创建时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。
     * @param CreateTime 创建时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过期时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。 
     * @return ExpireTime 过期时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。
     * @param ExpireTime 过期时间，UTC 时间。
注意：UTC时间和北京时间相差8小时。
例如：2019-06-18T12:00:00Z（为北京时间 2019 年 6 月 18 日 20 点 0 分 0 秒）。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 当前状态:
-1：已过期。
1： 生效中。 
     * @return Status 当前状态:
-1：已过期。
1： 生效中。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前状态:
-1：已过期。
1： 生效中。
     * @param Status 当前状态:
-1：已过期。
1： 生效中。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "DelayInterval", this.DelayInterval);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

