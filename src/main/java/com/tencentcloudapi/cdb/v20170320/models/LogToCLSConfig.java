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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogToCLSConfig extends AbstractModel {

    /**
    * 投递状态打开或者关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CLS日志集ID
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 日志主题ID
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * CLS服务所在地域
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
     * Get 投递状态打开或者关闭 
     * @return Status 投递状态打开或者关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 投递状态打开或者关闭
     * @param Status 投递状态打开或者关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CLS日志集ID 
     * @return LogSetId CLS日志集ID
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set CLS日志集ID
     * @param LogSetId CLS日志集ID
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 日志主题ID 
     * @return LogTopicId 日志主题ID
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set 日志主题ID
     * @param LogTopicId 日志主题ID
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get CLS服务所在地域 
     * @return ClsRegion CLS服务所在地域
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set CLS服务所在地域
     * @param ClsRegion CLS服务所在地域
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    public LogToCLSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogToCLSConfig(LogToCLSConfig source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);

    }
}

