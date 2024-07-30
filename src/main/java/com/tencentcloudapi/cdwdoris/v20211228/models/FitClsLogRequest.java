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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FitClsLogRequest extends AbstractModel {

    /**
    * 集群ID，例如cdwch-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * cls日志集ID
    */
    @SerializedName("ClsLogSetId")
    @Expose
    private String ClsLogSetId;

    /**
    * 日志的类型，es还是cls_topic
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get 集群ID，例如cdwch-xxxx 
     * @return InstanceId 集群ID，例如cdwch-xxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID，例如cdwch-xxxx
     * @param InstanceId 集群ID，例如cdwch-xxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get cls日志集ID 
     * @return ClsLogSetId cls日志集ID
     */
    public String getClsLogSetId() {
        return this.ClsLogSetId;
    }

    /**
     * Set cls日志集ID
     * @param ClsLogSetId cls日志集ID
     */
    public void setClsLogSetId(String ClsLogSetId) {
        this.ClsLogSetId = ClsLogSetId;
    }

    /**
     * Get 日志的类型，es还是cls_topic 
     * @return LogType 日志的类型，es还是cls_topic
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志的类型，es还是cls_topic
     * @param LogType 日志的类型，es还是cls_topic
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public FitClsLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FitClsLogRequest(FitClsLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClsLogSetId != null) {
            this.ClsLogSetId = new String(source.ClsLogSetId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClsLogSetId", this.ClsLogSetId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

