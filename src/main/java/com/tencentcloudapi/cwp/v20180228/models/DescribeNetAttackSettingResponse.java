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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetAttackSettingResponse extends AbstractModel {

    /**
    * 0 关闭网络攻击检测，1开启网络攻击检测
    */
    @SerializedName("NetAttackEnable")
    @Expose
    private Long NetAttackEnable;

    /**
    * 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略
    */
    @SerializedName("NetAttackAlarmStatus")
    @Expose
    private Long NetAttackAlarmStatus;

    /**
    * 1 全部旗舰版主机，0 InstanceIds列表主机
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 自选主机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 自选排除主机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludeInstanceIds")
    @Expose
    private String [] ExcludeInstanceIds;

    /**
    * 新增资产自动包含 0 不包含 1包含
    */
    @SerializedName("AutoInclude")
    @Expose
    private Long AutoInclude;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0 关闭网络攻击检测，1开启网络攻击检测 
     * @return NetAttackEnable 0 关闭网络攻击检测，1开启网络攻击检测
     */
    public Long getNetAttackEnable() {
        return this.NetAttackEnable;
    }

    /**
     * Set 0 关闭网络攻击检测，1开启网络攻击检测
     * @param NetAttackEnable 0 关闭网络攻击检测，1开启网络攻击检测
     */
    public void setNetAttackEnable(Long NetAttackEnable) {
        this.NetAttackEnable = NetAttackEnable;
    }

    /**
     * Get 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略 
     * @return NetAttackAlarmStatus 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略
     */
    public Long getNetAttackAlarmStatus() {
        return this.NetAttackAlarmStatus;
    }

    /**
     * Set 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略
     * @param NetAttackAlarmStatus 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略
     */
    public void setNetAttackAlarmStatus(Long NetAttackAlarmStatus) {
        this.NetAttackAlarmStatus = NetAttackAlarmStatus;
    }

    /**
     * Get 1 全部旗舰版主机，0 InstanceIds列表主机 
     * @return Scope 1 全部旗舰版主机，0 InstanceIds列表主机
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 1 全部旗舰版主机，0 InstanceIds列表主机
     * @param Scope 1 全部旗舰版主机，0 InstanceIds列表主机
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 自选主机
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIds 自选主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 自选主机
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIds 自选主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 自选排除主机
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludeInstanceIds 自选排除主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludeInstanceIds() {
        return this.ExcludeInstanceIds;
    }

    /**
     * Set 自选排除主机
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludeInstanceIds 自选排除主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludeInstanceIds(String [] ExcludeInstanceIds) {
        this.ExcludeInstanceIds = ExcludeInstanceIds;
    }

    /**
     * Get 新增资产自动包含 0 不包含 1包含 
     * @return AutoInclude 新增资产自动包含 0 不包含 1包含
     */
    public Long getAutoInclude() {
        return this.AutoInclude;
    }

    /**
     * Set 新增资产自动包含 0 不包含 1包含
     * @param AutoInclude 新增资产自动包含 0 不包含 1包含
     */
    public void setAutoInclude(Long AutoInclude) {
        this.AutoInclude = AutoInclude;
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

    public DescribeNetAttackSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetAttackSettingResponse(DescribeNetAttackSettingResponse source) {
        if (source.NetAttackEnable != null) {
            this.NetAttackEnable = new Long(source.NetAttackEnable);
        }
        if (source.NetAttackAlarmStatus != null) {
            this.NetAttackAlarmStatus = new Long(source.NetAttackAlarmStatus);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ExcludeInstanceIds != null) {
            this.ExcludeInstanceIds = new String[source.ExcludeInstanceIds.length];
            for (int i = 0; i < source.ExcludeInstanceIds.length; i++) {
                this.ExcludeInstanceIds[i] = new String(source.ExcludeInstanceIds[i]);
            }
        }
        if (source.AutoInclude != null) {
            this.AutoInclude = new Long(source.AutoInclude);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetAttackEnable", this.NetAttackEnable);
        this.setParamSimple(map, prefix + "NetAttackAlarmStatus", this.NetAttackAlarmStatus);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIds.", this.ExcludeInstanceIds);
        this.setParamSimple(map, prefix + "AutoInclude", this.AutoInclude);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

