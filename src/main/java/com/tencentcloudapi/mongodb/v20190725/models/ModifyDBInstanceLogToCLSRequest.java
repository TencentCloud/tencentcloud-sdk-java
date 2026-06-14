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

public class ModifyDBInstanceLogToCLSRequest extends AbstractModel {

    /**
    * <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志类型。MongoDB-ErrorLog：错误日志，MongoDB-SlowLog：慢日志，MongoDB-OperationLog：操作日志</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>投递状态。ON：开启，OFF：关闭。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否需要创建日志集。默认为 false。</p>
    */
    @SerializedName("CreateLogset")
    @Expose
    private Boolean CreateLogset;

    /**
    * <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2.  当参数 CreateLogset 的值为 true 时，Logset 填日志集命名，例如 my_test，否则需要填日志集 id，例如 6adsaw-****。</p>
    */
    @SerializedName("Logset")
    @Expose
    private String Logset;

    /**
    * <p>是否需要创建日志主题。默认为 false。</p>
    */
    @SerializedName("CreateLogTopic")
    @Expose
    private Boolean CreateLogTopic;

    /**
    * <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2. 2.  当参数 CreateLogTopic 的值为 true 时，LogTopic 填日志主题命名，例如 my_test，否则需要填日志主题id，例如 6adsaw-****。</p>
    */
    @SerializedName("LogTopic")
    @Expose
    private String LogTopic;

    /**
    * <p>CLS 所在地域，不填则默认为 Region 的参数值。</p>
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
     * Get <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志类型。MongoDB-ErrorLog：错误日志，MongoDB-SlowLog：慢日志，MongoDB-OperationLog：操作日志</p> 
     * @return LogType <p>日志类型。MongoDB-ErrorLog：错误日志，MongoDB-SlowLog：慢日志，MongoDB-OperationLog：操作日志</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型。MongoDB-ErrorLog：错误日志，MongoDB-SlowLog：慢日志，MongoDB-OperationLog：操作日志</p>
     * @param LogType <p>日志类型。MongoDB-ErrorLog：错误日志，MongoDB-SlowLog：慢日志，MongoDB-OperationLog：操作日志</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>投递状态。ON：开启，OFF：关闭。</p> 
     * @return Status <p>投递状态。ON：开启，OFF：关闭。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>投递状态。ON：开启，OFF：关闭。</p>
     * @param Status <p>投递状态。ON：开启，OFF：关闭。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否需要创建日志集。默认为 false。</p> 
     * @return CreateLogset <p>是否需要创建日志集。默认为 false。</p>
     */
    public Boolean getCreateLogset() {
        return this.CreateLogset;
    }

    /**
     * Set <p>是否需要创建日志集。默认为 false。</p>
     * @param CreateLogset <p>是否需要创建日志集。默认为 false。</p>
     */
    public void setCreateLogset(Boolean CreateLogset) {
        this.CreateLogset = CreateLogset;
    }

    /**
     * Get <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2.  当参数 CreateLogset 的值为 true 时，Logset 填日志集命名，例如 my_test，否则需要填日志集 id，例如 6adsaw-****。</p> 
     * @return Logset <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2.  当参数 CreateLogset 的值为 true 时，Logset 填日志集命名，例如 my_test，否则需要填日志集 id，例如 6adsaw-****。</p>
     */
    public String getLogset() {
        return this.Logset;
    }

    /**
     * Set <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2.  当参数 CreateLogset 的值为 true 时，Logset 填日志集命名，例如 my_test，否则需要填日志集 id，例如 6adsaw-****。</p>
     * @param Logset <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2.  当参数 CreateLogset 的值为 true 时，Logset 填日志集命名，例如 my_test，否则需要填日志集 id，例如 6adsaw-****。</p>
     */
    public void setLogset(String Logset) {
        this.Logset = Logset;
    }

    /**
     * Get <p>是否需要创建日志主题。默认为 false。</p> 
     * @return CreateLogTopic <p>是否需要创建日志主题。默认为 false。</p>
     */
    public Boolean getCreateLogTopic() {
        return this.CreateLogTopic;
    }

    /**
     * Set <p>是否需要创建日志主题。默认为 false。</p>
     * @param CreateLogTopic <p>是否需要创建日志主题。默认为 false。</p>
     */
    public void setCreateLogTopic(Boolean CreateLogTopic) {
        this.CreateLogTopic = CreateLogTopic;
    }

    /**
     * Get <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2. 2.  当参数 CreateLogTopic 的值为 true 时，LogTopic 填日志主题命名，例如 my_test，否则需要填日志主题id，例如 6adsaw-****。</p> 
     * @return LogTopic <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2. 2.  当参数 CreateLogTopic 的值为 true 时，LogTopic 填日志主题命名，例如 my_test，否则需要填日志主题id，例如 6adsaw-****。</p>
     */
    public String getLogTopic() {
        return this.LogTopic;
    }

    /**
     * Set <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2. 2.  当参数 CreateLogTopic 的值为 true 时，LogTopic 填日志主题命名，例如 my_test，否则需要填日志主题id，例如 6adsaw-****。</p>
     * @param LogTopic <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。 说明：1. 当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。2. 2.  当参数 CreateLogTopic 的值为 true 时，LogTopic 填日志主题命名，例如 my_test，否则需要填日志主题id，例如 6adsaw-****。</p>
     */
    public void setLogTopic(String LogTopic) {
        this.LogTopic = LogTopic;
    }

    /**
     * Get <p>CLS 所在地域，不填则默认为 Region 的参数值。</p> 
     * @return CLSRegion <p>CLS 所在地域，不填则默认为 Region 的参数值。</p>
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set <p>CLS 所在地域，不填则默认为 Region 的参数值。</p>
     * @param CLSRegion <p>CLS 所在地域，不填则默认为 Region 的参数值。</p>
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
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
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
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
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);

    }
}

