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

public class ModifyDBInstanceLogToCLSRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志类型：error/slowlog
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 投递状态：ON/OFF
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否需要创建日志集
    */
    @SerializedName("CreateLogset")
    @Expose
    private Boolean CreateLogset;

    /**
    * 需要创建日志集时为日志集名称；选择已有日志集时，为日志集ID
    */
    @SerializedName("Logset")
    @Expose
    private String Logset;

    /**
    * 是否需要创建日志主题
    */
    @SerializedName("CreateLogTopic")
    @Expose
    private Boolean CreateLogTopic;

    /**
    * 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题ID
    */
    @SerializedName("LogTopic")
    @Expose
    private String LogTopic;

    /**
    * 日志主题有效期，不填写时，默认30天
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 创建日志主题时，是否创建索引
    */
    @SerializedName("CreateIndex")
    @Expose
    private Boolean CreateIndex;

    /**
    * CLS所在地域
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

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
     * Get 日志类型：error/slowlog 
     * @return LogType 日志类型：error/slowlog
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型：error/slowlog
     * @param LogType 日志类型：error/slowlog
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 投递状态：ON/OFF 
     * @return Status 投递状态：ON/OFF
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 投递状态：ON/OFF
     * @param Status 投递状态：ON/OFF
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否需要创建日志集 
     * @return CreateLogset 是否需要创建日志集
     */
    public Boolean getCreateLogset() {
        return this.CreateLogset;
    }

    /**
     * Set 是否需要创建日志集
     * @param CreateLogset 是否需要创建日志集
     */
    public void setCreateLogset(Boolean CreateLogset) {
        this.CreateLogset = CreateLogset;
    }

    /**
     * Get 需要创建日志集时为日志集名称；选择已有日志集时，为日志集ID 
     * @return Logset 需要创建日志集时为日志集名称；选择已有日志集时，为日志集ID
     */
    public String getLogset() {
        return this.Logset;
    }

    /**
     * Set 需要创建日志集时为日志集名称；选择已有日志集时，为日志集ID
     * @param Logset 需要创建日志集时为日志集名称；选择已有日志集时，为日志集ID
     */
    public void setLogset(String Logset) {
        this.Logset = Logset;
    }

    /**
     * Get 是否需要创建日志主题 
     * @return CreateLogTopic 是否需要创建日志主题
     */
    public Boolean getCreateLogTopic() {
        return this.CreateLogTopic;
    }

    /**
     * Set 是否需要创建日志主题
     * @param CreateLogTopic 是否需要创建日志主题
     */
    public void setCreateLogTopic(Boolean CreateLogTopic) {
        this.CreateLogTopic = CreateLogTopic;
    }

    /**
     * Get 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题ID 
     * @return LogTopic 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题ID
     */
    public String getLogTopic() {
        return this.LogTopic;
    }

    /**
     * Set 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题ID
     * @param LogTopic 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题ID
     */
    public void setLogTopic(String LogTopic) {
        this.LogTopic = LogTopic;
    }

    /**
     * Get 日志主题有效期，不填写时，默认30天 
     * @return Period 日志主题有效期，不填写时，默认30天
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 日志主题有效期，不填写时，默认30天
     * @param Period 日志主题有效期，不填写时，默认30天
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 创建日志主题时，是否创建索引 
     * @return CreateIndex 创建日志主题时，是否创建索引
     */
    public Boolean getCreateIndex() {
        return this.CreateIndex;
    }

    /**
     * Set 创建日志主题时，是否创建索引
     * @param CreateIndex 创建日志主题时，是否创建索引
     */
    public void setCreateIndex(Boolean CreateIndex) {
        this.CreateIndex = CreateIndex;
    }

    /**
     * Get CLS所在地域 
     * @return ClsRegion CLS所在地域
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set CLS所在地域
     * @param ClsRegion CLS所在地域
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    public ModifyDBInstanceLogToCLSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceLogToCLSRequest(ModifyDBInstanceLogToCLSRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateLogset != null) {
            this.CreateLogset = new Boolean(source.CreateLogset);
        }
        if (source.Logset != null) {
            this.Logset = new String(source.Logset);
        }
        if (source.CreateLogTopic != null) {
            this.CreateLogTopic = new Boolean(source.CreateLogTopic);
        }
        if (source.LogTopic != null) {
            this.LogTopic = new String(source.LogTopic);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.CreateIndex != null) {
            this.CreateIndex = new Boolean(source.CreateIndex);
        }
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateLogset", this.CreateLogset);
        this.setParamSimple(map, prefix + "Logset", this.Logset);
        this.setParamSimple(map, prefix + "CreateLogTopic", this.CreateLogTopic);
        this.setParamSimple(map, prefix + "LogTopic", this.LogTopic);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "CreateIndex", this.CreateIndex);
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);

    }
}

