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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogToCLSConfig extends AbstractModel {

    /**
    * <p>CLS服务所在地域</p>
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
    * <p>投递状态打开或者关闭</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>CLS日志集ID</p>
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
     * Get <p>CLS服务所在地域</p> 
     * @return CLSRegion <p>CLS服务所在地域</p>
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set <p>CLS服务所在地域</p>
     * @param CLSRegion <p>CLS服务所在地域</p>
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    /**
     * Get <p>投递状态打开或者关闭</p> 
     * @return Status <p>投递状态打开或者关闭</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>投递状态打开或者关闭</p>
     * @param Status <p>投递状态打开或者关闭</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>CLS日志集ID</p> 
     * @return LogSetId <p>CLS日志集ID</p>
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set <p>CLS日志集ID</p>
     * @param LogSetId <p>CLS日志集ID</p>
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get <p>日志主题ID</p> 
     * @return LogTopicId <p>日志主题ID</p>
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param LogTopicId <p>日志主题ID</p>
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    public LogToCLSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogToCLSConfig(LogToCLSConfig source) {
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);

    }
}

