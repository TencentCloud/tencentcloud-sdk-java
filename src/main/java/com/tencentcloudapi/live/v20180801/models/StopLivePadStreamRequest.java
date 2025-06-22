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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopLivePadStreamRequest extends AbstractModel {

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 您的推流域名。
    */
    @SerializedName("PushDomainName")
    @Expose
    private String PushDomainName;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 操作人备注信息。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

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
     * Get 您的推流域名。 
     * @return PushDomainName 您的推流域名。
     */
    public String getPushDomainName() {
        return this.PushDomainName;
    }

    /**
     * Set 您的推流域名。
     * @param PushDomainName 您的推流域名。
     */
    public void setPushDomainName(String PushDomainName) {
        this.PushDomainName = PushDomainName;
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
     * Get 操作人备注信息。 
     * @return Operator 操作人备注信息。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人备注信息。
     * @param Operator 操作人备注信息。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public StopLivePadStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopLivePadStreamRequest(StopLivePadStreamRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.PushDomainName != null) {
            this.PushDomainName = new String(source.PushDomainName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PushDomainName", this.PushDomainName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

