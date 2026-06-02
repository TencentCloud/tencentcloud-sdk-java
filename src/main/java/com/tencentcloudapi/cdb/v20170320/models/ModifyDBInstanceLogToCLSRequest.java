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
    * <p>实例 ID，可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志类型。error：错误日志，slowlog：慢日志。</p>
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
    * <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p>
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
    * <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p>
    */
    @SerializedName("LogTopic")
    @Expose
    private String LogTopic;

    /**
    * <p>日志主题有效期，不填写时，默认30天，最大值3600。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>创建日志主题时，是否创建索引，默认为 false。</p>
    */
    @SerializedName("CreateIndex")
    @Expose
    private Boolean CreateIndex;

    /**
    * <p>CLS 所在地域，不填择默认为 Region 的参数值。</p>
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
    * <p>创建日志集和日志主题的时候可选，最多不能超过10个标签</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfoItem [] ResourceTags;

    /**
     * Get <p>实例 ID，可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>实例 ID，可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>实例 ID，可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志类型。error：错误日志，slowlog：慢日志。</p> 
     * @return LogType <p>日志类型。error：错误日志，slowlog：慢日志。</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型。error：错误日志，slowlog：慢日志。</p>
     * @param LogType <p>日志类型。error：错误日志，slowlog：慢日志。</p>
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
     * Get <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p> 
     * @return Logset <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p>
     */
    public String getLogset() {
        return this.Logset;
    }

    /**
     * Set <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p>
     * @param Logset <p>需要创建日志集时为日志集名称；选择已有日志集时，为日志集 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p>
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
     * Get <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p> 
     * @return LogTopic <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p>
     */
    public String getLogTopic() {
        return this.LogTopic;
    }

    /**
     * Set <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p>
     * @param LogTopic <p>需要创建日志主题时为日志主题名称；选择已有日志主题时，为日志主题 ID。默认为空。<br>说明：当参数 Status 的值为 ON 时，Logset 和 LogTopic 参数必须填一个。</p>
     */
    public void setLogTopic(String LogTopic) {
        this.LogTopic = LogTopic;
    }

    /**
     * Get <p>日志主题有效期，不填写时，默认30天，最大值3600。</p> 
     * @return Period <p>日志主题有效期，不填写时，默认30天，最大值3600。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>日志主题有效期，不填写时，默认30天，最大值3600。</p>
     * @param Period <p>日志主题有效期，不填写时，默认30天，最大值3600。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>创建日志主题时，是否创建索引，默认为 false。</p> 
     * @return CreateIndex <p>创建日志主题时，是否创建索引，默认为 false。</p>
     */
    public Boolean getCreateIndex() {
        return this.CreateIndex;
    }

    /**
     * Set <p>创建日志主题时，是否创建索引，默认为 false。</p>
     * @param CreateIndex <p>创建日志主题时，是否创建索引，默认为 false。</p>
     */
    public void setCreateIndex(Boolean CreateIndex) {
        this.CreateIndex = CreateIndex;
    }

    /**
     * Get <p>CLS 所在地域，不填择默认为 Region 的参数值。</p> 
     * @return ClsRegion <p>CLS 所在地域，不填择默认为 Region 的参数值。</p>
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set <p>CLS 所在地域，不填择默认为 Region 的参数值。</p>
     * @param ClsRegion <p>CLS 所在地域，不填择默认为 Region 的参数值。</p>
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    /**
     * Get <p>创建日志集和日志主题的时候可选，最多不能超过10个标签</p> 
     * @return ResourceTags <p>创建日志集和日志主题的时候可选，最多不能超过10个标签</p>
     */
    public TagInfoItem [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>创建日志集和日志主题的时候可选，最多不能超过10个标签</p>
     * @param ResourceTags <p>创建日志集和日志主题的时候可选，最多不能超过10个标签</p>
     */
    public void setResourceTags(TagInfoItem [] ResourceTags) {
        this.ResourceTags = ResourceTags;
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
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfoItem[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfoItem(source.ResourceTags[i]);
            }
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
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

