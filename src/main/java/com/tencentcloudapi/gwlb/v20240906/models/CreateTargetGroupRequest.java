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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTargetGroupRequest extends AbstractModel {

    /**
    * 目标组名称，限定60个字符。
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * 目标组的vpcid属性，不填则使用默认vpc
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 目标组绑定的后端服务器
    */
    @SerializedName("TargetGroupInstances")
    @Expose
    private TargetGroupInstance [] TargetGroupInstances;

    /**
    * 网关负载均衡目标组协议。
- TENCENT_GENEVE ：GENEVE 标准协议
- AWS_GENEVE：GENEVE 兼容协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 健康检查设置。
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * 均衡算法。
- IP_HASH_3_ELASTIC：弹性哈希
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * 是否支持全死全活。默认支持。
    */
    @SerializedName("AllDeadToAlive")
    @Expose
    private Boolean AllDeadToAlive;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get 目标组名称，限定60个字符。 
     * @return TargetGroupName 目标组名称，限定60个字符。
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set 目标组名称，限定60个字符。
     * @param TargetGroupName 目标组名称，限定60个字符。
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get 目标组的vpcid属性，不填则使用默认vpc 
     * @return VpcId 目标组的vpcid属性，不填则使用默认vpc
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 目标组的vpcid属性，不填则使用默认vpc
     * @param VpcId 目标组的vpcid属性，不填则使用默认vpc
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。 
     * @return Port 目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。
     * @param Port 目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 目标组绑定的后端服务器 
     * @return TargetGroupInstances 目标组绑定的后端服务器
     */
    public TargetGroupInstance [] getTargetGroupInstances() {
        return this.TargetGroupInstances;
    }

    /**
     * Set 目标组绑定的后端服务器
     * @param TargetGroupInstances 目标组绑定的后端服务器
     */
    public void setTargetGroupInstances(TargetGroupInstance [] TargetGroupInstances) {
        this.TargetGroupInstances = TargetGroupInstances;
    }

    /**
     * Get 网关负载均衡目标组协议。
- TENCENT_GENEVE ：GENEVE 标准协议
- AWS_GENEVE：GENEVE 兼容协议 
     * @return Protocol 网关负载均衡目标组协议。
- TENCENT_GENEVE ：GENEVE 标准协议
- AWS_GENEVE：GENEVE 兼容协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 网关负载均衡目标组协议。
- TENCENT_GENEVE ：GENEVE 标准协议
- AWS_GENEVE：GENEVE 兼容协议
     * @param Protocol 网关负载均衡目标组协议。
- TENCENT_GENEVE ：GENEVE 标准协议
- AWS_GENEVE：GENEVE 兼容协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 健康检查设置。 
     * @return HealthCheck 健康检查设置。
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查设置。
     * @param HealthCheck 健康检查设置。
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 均衡算法。
- IP_HASH_3_ELASTIC：弹性哈希 
     * @return ScheduleAlgorithm 均衡算法。
- IP_HASH_3_ELASTIC：弹性哈希
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set 均衡算法。
- IP_HASH_3_ELASTIC：弹性哈希
     * @param ScheduleAlgorithm 均衡算法。
- IP_HASH_3_ELASTIC：弹性哈希
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get 是否支持全死全活。默认支持。 
     * @return AllDeadToAlive 是否支持全死全活。默认支持。
     */
    public Boolean getAllDeadToAlive() {
        return this.AllDeadToAlive;
    }

    /**
     * Set 是否支持全死全活。默认支持。
     * @param AllDeadToAlive 是否支持全死全活。默认支持。
     */
    public void setAllDeadToAlive(Boolean AllDeadToAlive) {
        this.AllDeadToAlive = AllDeadToAlive;
    }

    /**
     * Get 标签。 
     * @return Tags 标签。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
     * @param Tags 标签。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateTargetGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTargetGroupRequest(CreateTargetGroupRequest source) {
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.TargetGroupInstances != null) {
            this.TargetGroupInstances = new TargetGroupInstance[source.TargetGroupInstances.length];
            for (int i = 0; i < source.TargetGroupInstances.length; i++) {
                this.TargetGroupInstances[i] = new TargetGroupInstance(source.TargetGroupInstances[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.ScheduleAlgorithm != null) {
            this.ScheduleAlgorithm = new String(source.ScheduleAlgorithm);
        }
        if (source.AllDeadToAlive != null) {
            this.AllDeadToAlive = new Boolean(source.AllDeadToAlive);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "TargetGroupInstances.", this.TargetGroupInstances);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamSimple(map, prefix + "AllDeadToAlive", this.AllDeadToAlive);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

