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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StdoutLogV2 extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 日志时间戳，单位毫秒
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 实例IP
    */
    @SerializedName("InstanceIp")
    @Expose
    private String InstanceIp;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志内容 
     * @return Content 日志内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 日志内容
     * @param Content 日志内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 日志时间戳，单位毫秒 
     * @return Timestamp 日志时间戳，单位毫秒
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 日志时间戳，单位毫秒
     * @param Timestamp 日志时间戳，单位毫秒
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 实例IP 
     * @return InstanceIp 实例IP
     */
    public String getInstanceIp() {
        return this.InstanceIp;
    }

    /**
     * Set 实例IP
     * @param InstanceIp 实例IP
     */
    public void setInstanceIp(String InstanceIp) {
        this.InstanceIp = InstanceIp;
    }

    public StdoutLogV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StdoutLogV2(StdoutLogV2 source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.InstanceIp != null) {
            this.InstanceIp = new String(source.InstanceIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "InstanceIp", this.InstanceIp);

    }
}

