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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePostCLSFlowRequest extends AbstractModel {

    /**
    * 投递的CLS所在区域，默认为ap-shanghai
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
    * 投递的CLS所在日志集合名称，默认为 waf_post_logset
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * 1-访问日志，2-攻击日志，默认为访问日志。
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * 投递的CLS所在日志主题的名称，默认为 waf_post_logtopic
    */
    @SerializedName("LogTopicName")
    @Expose
    private String LogTopicName;

    /**
     * Get 投递的CLS所在区域，默认为ap-shanghai 
     * @return CLSRegion 投递的CLS所在区域，默认为ap-shanghai
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set 投递的CLS所在区域，默认为ap-shanghai
     * @param CLSRegion 投递的CLS所在区域，默认为ap-shanghai
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    /**
     * Get 投递的CLS所在日志集合名称，默认为 waf_post_logset 
     * @return LogsetName 投递的CLS所在日志集合名称，默认为 waf_post_logset
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set 投递的CLS所在日志集合名称，默认为 waf_post_logset
     * @param LogsetName 投递的CLS所在日志集合名称，默认为 waf_post_logset
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get 1-访问日志，2-攻击日志，默认为访问日志。 
     * @return LogType 1-访问日志，2-攻击日志，默认为访问日志。
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set 1-访问日志，2-攻击日志，默认为访问日志。
     * @param LogType 1-访问日志，2-攻击日志，默认为访问日志。
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 投递的CLS所在日志主题的名称，默认为 waf_post_logtopic 
     * @return LogTopicName 投递的CLS所在日志主题的名称，默认为 waf_post_logtopic
     */
    public String getLogTopicName() {
        return this.LogTopicName;
    }

    /**
     * Set 投递的CLS所在日志主题的名称，默认为 waf_post_logtopic
     * @param LogTopicName 投递的CLS所在日志主题的名称，默认为 waf_post_logtopic
     */
    public void setLogTopicName(String LogTopicName) {
        this.LogTopicName = LogTopicName;
    }

    public CreatePostCLSFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePostCLSFlowRequest(CreatePostCLSFlowRequest source) {
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.LogTopicName != null) {
            this.LogTopicName = new String(source.LogTopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogTopicName", this.LogTopicName);

    }
}

