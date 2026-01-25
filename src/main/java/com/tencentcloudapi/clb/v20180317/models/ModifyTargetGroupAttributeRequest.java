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

public class ModifyTargetGroupAttributeRequest extends AbstractModel {

    /**
    * <p>目标组的ID。</p>
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * <p>目标组的新默认端口。全监听目标组不支持此参数。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>调度算法，仅V2新版目标组，且后端转发协议为(HTTP|HTTPS|GRPC)时该参数有效。可选值：<br>&lt;ur&gt;<li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li><li>默认为 WRR。</li>&lt;ur&gt;</p>
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * <p>健康检查详情。</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * <p>后端服务默认权重, 其中：<ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1目标组类型不支持设置Weight参数。</li> </ul></p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，true:关闭；false:开启， 默认关闭。</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。TCP/UDP目标组不支持该参数。</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p>
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
     * Get <p>目标组的ID。</p> 
     * @return TargetGroupId <p>目标组的ID。</p>
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set <p>目标组的ID。</p>
     * @param TargetGroupId <p>目标组的ID。</p>
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p> 
     * @return TargetGroupName <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     * @param TargetGroupName <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get <p>目标组的新默认端口。全监听目标组不支持此参数。</p> 
     * @return Port <p>目标组的新默认端口。全监听目标组不支持此参数。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>目标组的新默认端口。全监听目标组不支持此参数。</p>
     * @param Port <p>目标组的新默认端口。全监听目标组不支持此参数。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
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
     * Get <p>健康检查详情。</p> 
     * @return HealthCheck <p>健康检查详情。</p>
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>健康检查详情。</p>
     * @param HealthCheck <p>健康检查详情。</p>
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>后端服务默认权重, 其中：<ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1目标组类型不支持设置Weight参数。</li> </ul></p> 
     * @return Weight <p>后端服务默认权重, 其中：<ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1目标组类型不支持设置Weight参数。</li> </ul></p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>后端服务默认权重, 其中：<ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1目标组类型不支持设置Weight参数。</li> </ul></p>
     * @param Weight <p>后端服务默认权重, 其中：<ul><li>取值范围[0, 100]</li><li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li><li>v1目标组类型不支持设置Weight参数。</li> </ul></p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，true:关闭；false:开启， 默认关闭。</p> 
     * @return KeepaliveEnable <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，true:关闭；false:开启， 默认关闭。</p>
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，true:关闭；false:开启， 默认关闭。</p>
     * @param KeepaliveEnable <p>是否开启长连接，此参数仅适用于HTTP/HTTPS目标组，true:关闭；false:开启， 默认关闭。</p>
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。TCP/UDP目标组不支持该参数。</p> 
     * @return SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。TCP/UDP目标组不支持该参数。</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。TCP/UDP目标组不支持该参数。</p>
     * @param SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。TCP/UDP目标组不支持该参数。</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
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

    public ModifyTargetGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTargetGroupAttributeRequest(ModifyTargetGroupAttributeRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ScheduleAlgorithm != null) {
            this.ScheduleAlgorithm = new String(source.ScheduleAlgorithm);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Boolean(source.KeepaliveEnable);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.SnatEnable != null) {
            this.SnatEnable = new Boolean(source.SnatEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "SnatEnable", this.SnatEnable);

    }
}

