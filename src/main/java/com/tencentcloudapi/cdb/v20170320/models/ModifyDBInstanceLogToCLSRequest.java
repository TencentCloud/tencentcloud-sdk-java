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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceLogToCLSRequest extends AbstractModel {

    /**
    * 实例 ID，可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志类型。error：错误日志，slowlog：慢日志。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 投递状态。ON：开启，OFF：关闭。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否需要创建日志集。默认为 false。
    */
    @SerializedName("CreateLogset")
    @Expose
    private Boolean CreateLogset;

    /**
    * 需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。
    */
    @SerializedName("Logset")
    @Expose
    private String Logset;

    /**
    * 是否需要创建日志主题。默认为 false。
    */
    @SerializedName("CreateLogTopic")
    @Expose
    private Boolean CreateLogTopic;

    /**
    * 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。
    */
    @SerializedName("LogTopic")
    @Expose
    private String LogTopic;

    /**
    * 日志主题有效期，不填写时，默认30天，最大值3600。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 创建日志主题时，是否创建索引，默认为 false。
    */
    @SerializedName("CreateIndex")
    @Expose
    private Boolean CreateIndex;

    /**
    * CLS 所在地域，不填择默认为 Region 的参数值。
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
     * Get 实例 ID，可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return InstanceId 实例 ID，可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param InstanceId 实例 ID，可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志类型。error：错误日志，slowlog：慢日志。 
     * @return LogType 日志类型。error：错误日志，slowlog：慢日志。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型。error：错误日志，slowlog：慢日志。
     * @param LogType 日志类型。error：错误日志，slowlog：慢日志。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 投递状态。ON：开启，OFF：关闭。 
     * @return Status 投递状态。ON：开启，OFF：关闭。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 投递状态。ON：开启，OFF：关闭。
     * @param Status 投递状态。ON：开启，OFF：关闭。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否需要创建日志集。默认为 false。 
     * @return CreateLogset 是否需要创建日志集。默认为 false。
     */
    public Boolean getCreateLogset() {
        return this.CreateLogset;
    }

    /**
     * Set 是否需要创建日志集。默认为 false。
     * @param CreateLogset 是否需要创建日志集。默认为 false。
     */
    public void setCreateLogset(Boolean CreateLogset) {
        this.CreateLogset = CreateLogset;
    }

    /**
     * Get 需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。 
     * @return Logset 需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。
     */
    public String getLogset() {
        return this.Logset;
    }

    /**
     * Set 需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。
     * @param Logset 需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。
     */
    public void setLogset(String Logset) {
        this.Logset = Logset;
    }

    /**
     * Get 是否需要创建日志主题。默认为 false。 
     * @return CreateLogTopic 是否需要创建日志主题。默认为 false。
     */
    public Boolean getCreateLogTopic() {
        return this.CreateLogTopic;
    }

    /**
     * Set 是否需要创建日志主题。默认为 false。
     * @param CreateLogTopic 是否需要创建日志主题。默认为 false。
     */
    public void setCreateLogTopic(Boolean CreateLogTopic) {
        this.CreateLogTopic = CreateLogTopic;
    }

    /**
     * Get 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。 
     * @return LogTopic 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。
     */
    public String getLogTopic() {
        return this.LogTopic;
    }

    /**
     * Set 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。
     * @param LogTopic 需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。
说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。
     */
    public void setLogTopic(String LogTopic) {
        this.LogTopic = LogTopic;
    }

    /**
     * Get 日志主题有效期，不填写时，默认30天，最大值3600。 
     * @return Period 日志主题有效期，不填写时，默认30天，最大值3600。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 日志主题有效期，不填写时，默认30天，最大值3600。
     * @param Period 日志主题有效期，不填写时，默认30天，最大值3600。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 创建日志主题时，是否创建索引，默认为 false。 
     * @return CreateIndex 创建日志主题时，是否创建索引，默认为 false。
     */
    public Boolean getCreateIndex() {
        return this.CreateIndex;
    }

    /**
     * Set 创建日志主题时，是否创建索引，默认为 false。
     * @param CreateIndex 创建日志主题时，是否创建索引，默认为 false。
     */
    public void setCreateIndex(Boolean CreateIndex) {
        this.CreateIndex = CreateIndex;
    }

    /**
     * Get CLS 所在地域，不填择默认为 Region 的参数值。 
     * @return ClsRegion CLS 所在地域，不填择默认为 Region 的参数值。
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set CLS 所在地域，不填择默认为 Region 的参数值。
     * @param ClsRegion CLS 所在地域，不填择默认为 Region 的参数值。
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

