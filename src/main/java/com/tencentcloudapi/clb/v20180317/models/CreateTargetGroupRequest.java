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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTargetGroupRequest extends AbstractModel {

    /**
    * <p>目标组名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * <p>目标组的vpcId属性，不填则使用默认vpc。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。全监听目标组不支持此参数，非全监听目标组Port和TargetGroupInstances.N中的port二者必填其一。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>目标组绑定的后端服务器，单次最多支持50个。</p>
    */
    @SerializedName("TargetGroupInstances")
    @Expose
    private TargetGroupInstance [] TargetGroupInstances;

    /**
    * <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组), 默认为v1(旧版目标组)。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>目标组后端转发协议。v2新版目标组该项必填。目前支持TCP、UDP、HTTP、HTTPS、GRPC。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>健康检查。</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * <p>调度算法，仅V2新版目标组，且后端转发协议为(HTTP|HTTPS|GRPC)时该参数有效。可选值：<br>&lt;ur&gt;<li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li><li>默认为 WRR。</li>&lt;ur&gt;</p>
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * <p>标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>后端服务默认权重, 其中：</p><ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1 目标组类型不支持设置 Weight 参数。</li></ul>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>全监听目标组标识，true表示是全监听目标组，false表示不是全监听目标组。仅V2新版类型目标组支持该参数。</p>
    */
    @SerializedName("FullListenSwitch")
    @Expose
    private Boolean FullListenSwitch;

    /**
    * <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，0:关闭；1:开启， 默认关闭。</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。仅V2新版且后端转发协议为HTTP/HTTPS/GRPC目标组支持该参数。</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>IP版本类型。</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p>
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
     * Get <p>目标组名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p> 
     * @return TargetGroupName <p>目标组名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>目标组名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     * @param TargetGroupName <p>目标组名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get <p>目标组的vpcId属性，不填则使用默认vpc。</p> 
     * @return VpcId <p>目标组的vpcId属性，不填则使用默认vpc。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>目标组的vpcId属性，不填则使用默认vpc。</p>
     * @param VpcId <p>目标组的vpcId属性，不填则使用默认vpc。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。全监听目标组不支持此参数，非全监听目标组Port和TargetGroupInstances.N中的port二者必填其一。</p> 
     * @return Port <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。全监听目标组不支持此参数，非全监听目标组Port和TargetGroupInstances.N中的port二者必填其一。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。全监听目标组不支持此参数，非全监听目标组Port和TargetGroupInstances.N中的port二者必填其一。</p>
     * @param Port <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。全监听目标组不支持此参数，非全监听目标组Port和TargetGroupInstances.N中的port二者必填其一。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>目标组绑定的后端服务器，单次最多支持50个。</p> 
     * @return TargetGroupInstances <p>目标组绑定的后端服务器，单次最多支持50个。</p>
     */
    public TargetGroupInstance [] getTargetGroupInstances() {
        return this.TargetGroupInstances;
    }

    /**
     * Set <p>目标组绑定的后端服务器，单次最多支持50个。</p>
     * @param TargetGroupInstances <p>目标组绑定的后端服务器，单次最多支持50个。</p>
     */
    public void setTargetGroupInstances(TargetGroupInstance [] TargetGroupInstances) {
        this.TargetGroupInstances = TargetGroupInstances;
    }

    /**
     * Get <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组), 默认为v1(旧版目标组)。</p> 
     * @return Type <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组), 默认为v1(旧版目标组)。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组), 默认为v1(旧版目标组)。</p>
     * @param Type <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组), 默认为v1(旧版目标组)。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>目标组后端转发协议。v2新版目标组该项必填。目前支持TCP、UDP、HTTP、HTTPS、GRPC。</p> 
     * @return Protocol <p>目标组后端转发协议。v2新版目标组该项必填。目前支持TCP、UDP、HTTP、HTTPS、GRPC。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>目标组后端转发协议。v2新版目标组该项必填。目前支持TCP、UDP、HTTP、HTTPS、GRPC。</p>
     * @param Protocol <p>目标组后端转发协议。v2新版目标组该项必填。目前支持TCP、UDP、HTTP、HTTPS、GRPC。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>健康检查。</p> 
     * @return HealthCheck <p>健康检查。</p>
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>健康检查。</p>
     * @param HealthCheck <p>健康检查。</p>
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>调度算法，仅V2新版目标组，且后端转发协议为(HTTP|HTTPS|GRPC)时该参数有效。可选值：<br>&lt;ur&gt;<li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li><li>默认为 WRR。</li>&lt;ur&gt;</p> 
     * @return ScheduleAlgorithm <p>调度算法，仅V2新版目标组，且后端转发协议为(HTTP|HTTPS|GRPC)时该参数有效。可选值：<br>&lt;ur&gt;<li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li><li>默认为 WRR。</li>&lt;ur&gt;</p>
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set <p>调度算法，仅V2新版目标组，且后端转发协议为(HTTP|HTTPS|GRPC)时该参数有效。可选值：<br>&lt;ur&gt;<li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li><li>默认为 WRR。</li>&lt;ur&gt;</p>
     * @param ScheduleAlgorithm <p>调度算法，仅V2新版目标组，且后端转发协议为(HTTP|HTTPS|GRPC)时该参数有效。可选值：<br>&lt;ur&gt;<li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li><li>默认为 WRR。</li>&lt;ur&gt;</p>
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get <p>标签。</p> 
     * @return Tags <p>标签。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签。</p>
     * @param Tags <p>标签。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>后端服务默认权重, 其中：</p><ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1 目标组类型不支持设置 Weight 参数。</li></ul> 
     * @return Weight <p>后端服务默认权重, 其中：</p><ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1 目标组类型不支持设置 Weight 参数。</li></ul>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>后端服务默认权重, 其中：</p><ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1 目标组类型不支持设置 Weight 参数。</li></ul>
     * @param Weight <p>后端服务默认权重, 其中：</p><ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1 目标组类型不支持设置 Weight 参数。</li></ul>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>全监听目标组标识，true表示是全监听目标组，false表示不是全监听目标组。仅V2新版类型目标组支持该参数。</p> 
     * @return FullListenSwitch <p>全监听目标组标识，true表示是全监听目标组，false表示不是全监听目标组。仅V2新版类型目标组支持该参数。</p>
     */
    public Boolean getFullListenSwitch() {
        return this.FullListenSwitch;
    }

    /**
     * Set <p>全监听目标组标识，true表示是全监听目标组，false表示不是全监听目标组。仅V2新版类型目标组支持该参数。</p>
     * @param FullListenSwitch <p>全监听目标组标识，true表示是全监听目标组，false表示不是全监听目标组。仅V2新版类型目标组支持该参数。</p>
     */
    public void setFullListenSwitch(Boolean FullListenSwitch) {
        this.FullListenSwitch = FullListenSwitch;
    }

    /**
     * Get <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，0:关闭；1:开启， 默认关闭。</p> 
     * @return KeepaliveEnable <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，0:关闭；1:开启， 默认关闭。</p>
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，0:关闭；1:开启， 默认关闭。</p>
     * @param KeepaliveEnable <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，0:关闭；1:开启， 默认关闭。</p>
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。仅V2新版且后端转发协议为HTTP/HTTPS/GRPC目标组支持该参数。</p> 
     * @return SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。仅V2新版且后端转发协议为HTTP/HTTPS/GRPC目标组支持该参数。</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。仅V2新版且后端转发协议为HTTP/HTTPS/GRPC目标组支持该参数。</p>
     * @param SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。仅V2新版且后端转发协议为HTTP/HTTPS/GRPC目标组支持该参数。</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>IP版本类型。</p> 
     * @return IpVersion <p>IP版本类型。</p>
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>IP版本类型。</p>
     * @param IpVersion <p>IP版本类型。</p>
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p> 
     * @return SnatEnable <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p>
     */
    public Boolean getSnatEnable() {
        return this.SnatEnable;
    }

    /**
     * Set <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p>
     * @param SnatEnable <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p>
     */
    public void setSnatEnable(Boolean SnatEnable) {
        this.SnatEnable = SnatEnable;
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.FullListenSwitch != null) {
            this.FullListenSwitch = new Boolean(source.FullListenSwitch);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Boolean(source.KeepaliveEnable);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.SnatEnable != null) {
            this.SnatEnable = new Boolean(source.SnatEnable);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "FullListenSwitch", this.FullListenSwitch);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "SnatEnable", this.SnatEnable);

    }
}

