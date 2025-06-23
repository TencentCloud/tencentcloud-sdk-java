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

public class ModifyDBInstanceVipVportRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c2nl9rpv 或者 cdbrg-c3nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标 IP。
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 目标端口，支持范围为：[1024-65535]。
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * 私有网络统一 ID。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 子网统一 ID。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 进行基础网络转 VPC 网络和 VPC 网络下的子网变更时，原网络中旧IP的回收时间，单位为小时，取值范围为0-168，默认值为24小时。
    */
    @SerializedName("ReleaseDuration")
    @Expose
    private Long ReleaseDuration;

    /**
    * 变更集群版实例只读组时，InstanceId传实例id，需要额外指定该参数表示操作只读组。 如果操作读写节点则不需指定该参数。
    */
    @SerializedName("OpResourceId")
    @Expose
    private String OpResourceId;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c2nl9rpv 或者 cdbrg-c3nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c2nl9rpv 或者 cdbrg-c3nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c2nl9rpv 或者 cdbrg-c3nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c2nl9rpv 或者 cdbrg-c3nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 目标 IP。 
     * @return DstIp 目标 IP。
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目标 IP。
     * @param DstIp 目标 IP。
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 目标端口，支持范围为：[1024-65535]。 
     * @return DstPort 目标端口，支持范围为：[1024-65535]。
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标端口，支持范围为：[1024-65535]。
     * @param DstPort 目标端口，支持范围为：[1024-65535]。
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 私有网络统一 ID。 
     * @return UniqVpcId 私有网络统一 ID。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络统一 ID。
     * @param UniqVpcId 私有网络统一 ID。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 子网统一 ID。 
     * @return UniqSubnetId 子网统一 ID。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网统一 ID。
     * @param UniqSubnetId 子网统一 ID。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 进行基础网络转 VPC 网络和 VPC 网络下的子网变更时，原网络中旧IP的回收时间，单位为小时，取值范围为0-168，默认值为24小时。 
     * @return ReleaseDuration 进行基础网络转 VPC 网络和 VPC 网络下的子网变更时，原网络中旧IP的回收时间，单位为小时，取值范围为0-168，默认值为24小时。
     */
    public Long getReleaseDuration() {
        return this.ReleaseDuration;
    }

    /**
     * Set 进行基础网络转 VPC 网络和 VPC 网络下的子网变更时，原网络中旧IP的回收时间，单位为小时，取值范围为0-168，默认值为24小时。
     * @param ReleaseDuration 进行基础网络转 VPC 网络和 VPC 网络下的子网变更时，原网络中旧IP的回收时间，单位为小时，取值范围为0-168，默认值为24小时。
     */
    public void setReleaseDuration(Long ReleaseDuration) {
        this.ReleaseDuration = ReleaseDuration;
    }

    /**
     * Get 变更集群版实例只读组时，InstanceId传实例id，需要额外指定该参数表示操作只读组。 如果操作读写节点则不需指定该参数。 
     * @return OpResourceId 变更集群版实例只读组时，InstanceId传实例id，需要额外指定该参数表示操作只读组。 如果操作读写节点则不需指定该参数。
     */
    public String getOpResourceId() {
        return this.OpResourceId;
    }

    /**
     * Set 变更集群版实例只读组时，InstanceId传实例id，需要额外指定该参数表示操作只读组。 如果操作读写节点则不需指定该参数。
     * @param OpResourceId 变更集群版实例只读组时，InstanceId传实例id，需要额外指定该参数表示操作只读组。 如果操作读写节点则不需指定该参数。
     */
    public void setOpResourceId(String OpResourceId) {
        this.OpResourceId = OpResourceId;
    }

    public ModifyDBInstanceVipVportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceVipVportRequest(ModifyDBInstanceVipVportRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ReleaseDuration != null) {
            this.ReleaseDuration = new Long(source.ReleaseDuration);
        }
        if (source.OpResourceId != null) {
            this.OpResourceId = new String(source.OpResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ReleaseDuration", this.ReleaseDuration);
        this.setParamSimple(map, prefix + "OpResourceId", this.OpResourceId);

    }
}

