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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BusinessLogV2 extends AbstractModel{

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 日志时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 实例IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIp")
    @Expose
    private String InstanceIp;

    /**
    * 日志ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 日志时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 日志时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 日志时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 日志时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 实例IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIp 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceIp() {
        return this.InstanceIp;
    }

    /**
     * Set 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIp 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIp(String InstanceIp) {
        this.InstanceIp = InstanceIp;
    }

    /**
     * Get 日志ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogId 日志ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 日志ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogId 日志ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 部署组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public BusinessLogV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessLogV2(BusinessLogV2 source) {
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
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
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
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

