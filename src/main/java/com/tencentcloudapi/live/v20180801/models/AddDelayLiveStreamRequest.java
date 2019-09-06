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

public class AddDelayLiveStreamRequest  extends AbstractModel{

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致，默认为live。
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
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 延播时间，单位：秒，上限：600秒。
    */
    @SerializedName("DelayTime")
    @Expose
    private Integer DelayTime;

    /**
    * 延播设置的过期时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 默认7天后过期，且最长支持7天内生效。
2. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * 获取推流路径，与推流和播放地址中的AppName保持一致，默认为live。
     * @return AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为live。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置推流路径，与推流和播放地址中的AppName保持一致，默认为live。
     * @param AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为live。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取推流域名。
     * @return DomainName 推流域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置推流域名。
     * @param DomainName 推流域名。
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
     * 获取延播时间，单位：秒，上限：600秒。
     * @return DelayTime 延播时间，单位：秒，上限：600秒。
     */
    public Integer getDelayTime() {
        return this.DelayTime;
    }

    /**
     * 设置延播时间，单位：秒，上限：600秒。
     * @param DelayTime 延播时间，单位：秒，上限：600秒。
     */
    public void setDelayTime(Integer DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * 获取延播设置的过期时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 默认7天后过期，且最长支持7天内生效。
2. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return ExpireTime 延播设置的过期时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 默认7天后过期，且最长支持7天内生效。
2. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * 设置延播设置的过期时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 默认7天后过期，且最长支持7天内生效。
2. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param ExpireTime 延播设置的过期时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 默认7天后过期，且最长支持7天内生效。
2. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

