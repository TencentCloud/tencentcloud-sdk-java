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

public class DescribeAuditConfigResponse extends AbstractModel {

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
    * 该实例开通数据库审计的时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 审计日志保存时长。
单位：天。目前支持的保存时长包括：0、30、180、365，1095、1825。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 审计日志存储类型。目前仅支持storage：存储型。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 是否正在关闭审计功能。
<ul><li>true：是。</li><li>false：否。</li></ul>
    */
    @SerializedName("IsClosing")
    @Expose
    private String IsClosing;

    /**
    * 是否正在开启审计功能。<ul><li>true：是。</li><li>false：否。</li></ul>
    */
    @SerializedName("IsOpening")
    @Expose
    private String IsOpening;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditAll true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditAll true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    /**
     * Get 该实例开通数据库审计的时间。 
     * @return CreateTime 该实例开通数据库审计的时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 该实例开通数据库审计的时间。
     * @param CreateTime 该实例开通数据库审计的时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 审计日志保存时长。
单位：天。目前支持的保存时长包括：0、30、180、365，1095、1825。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogExpireDay 审计日志保存时长。
单位：天。目前支持的保存时长包括：0、30、180、365，1095、1825。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 审计日志保存时长。
单位：天。目前支持的保存时长包括：0、30、180、365，1095、1825。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogExpireDay 审计日志保存时长。
单位：天。目前支持的保存时长包括：0、30、180、365，1095、1825。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 审计日志存储类型。目前仅支持storage：存储型。 
     * @return LogType 审计日志存储类型。目前仅支持storage：存储型。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 审计日志存储类型。目前仅支持storage：存储型。
     * @param LogType 审计日志存储类型。目前仅支持storage：存储型。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 是否正在关闭审计功能。
<ul><li>true：是。</li><li>false：否。</li></ul> 
     * @return IsClosing 是否正在关闭审计功能。
<ul><li>true：是。</li><li>false：否。</li></ul>
     */
    public String getIsClosing() {
        return this.IsClosing;
    }

    /**
     * Set 是否正在关闭审计功能。
<ul><li>true：是。</li><li>false：否。</li></ul>
     * @param IsClosing 是否正在关闭审计功能。
<ul><li>true：是。</li><li>false：否。</li></ul>
     */
    public void setIsClosing(String IsClosing) {
        this.IsClosing = IsClosing;
    }

    /**
     * Get 是否正在开启审计功能。<ul><li>true：是。</li><li>false：否。</li></ul> 
     * @return IsOpening 是否正在开启审计功能。<ul><li>true：是。</li><li>false：否。</li></ul>
     */
    public String getIsOpening() {
        return this.IsOpening;
    }

    /**
     * Set 是否正在开启审计功能。<ul><li>true：是。</li><li>false：否。</li></ul>
     * @param IsOpening 是否正在开启审计功能。<ul><li>true：是。</li><li>false：否。</li></ul>
     */
    public void setIsOpening(String IsOpening) {
        this.IsOpening = IsOpening;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAuditConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditConfigResponse(DescribeAuditConfigResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AuditAll != null) {
            this.AuditAll = new Boolean(source.AuditAll);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.IsClosing != null) {
            this.IsClosing = new String(source.IsClosing);
        }
        if (source.IsOpening != null) {
            this.IsOpening = new String(source.IsOpening);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "IsClosing", this.IsClosing);
        this.setParamSimple(map, prefix + "IsOpening", this.IsOpening);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

