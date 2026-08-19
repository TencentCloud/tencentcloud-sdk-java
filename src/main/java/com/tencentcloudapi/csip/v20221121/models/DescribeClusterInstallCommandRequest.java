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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterInstallCommandRequest extends AbstractModel {

    /**
    * <p>是否腾讯云。true：走平行容器 daemonset yaml 安装分支；false：走主机 agent 安装命令分支</p>
    */
    @SerializedName("IsCloud")
    @Expose
    private Boolean IsCloud;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>网络类型<br>枚举值：<br>basic：基础网络<br>private：VPC<br>public：公网<br>direct：专线</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>地域编码（NetType=direct 时必填；腾讯云分支用于特殊地域镜像仓库替换）</p>
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * <p>VPC ID（NetType=direct 时必填）<br>参数格式：形如 vpc-xxxxxxxx</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>过期时间<br>参数格式：yyyy-MM-dd（如 2026-12-31）<br>用途：腾讯云分支用于 daemonset yaml 的 cos 下载链接过期时间；非腾讯云分支用于 agent 安装 token 过期时间</p>
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * <p>csip 标签 ID 列表（非腾讯云分支用，关联安装标签）</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * <p>集群自定义参数（腾讯云分支用于替换 daemonset 模板占位符）</p>
    */
    @SerializedName("ClusterCustomParameters")
    @Expose
    private ClusterCustomParameters [] ClusterCustomParameters;

    /**
    * <p>接入 VIP（非腾讯云分支用；NetType=direct 且未传 Vip 时由专线服务自动申请）</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get <p>是否腾讯云。true：走平行容器 daemonset yaml 安装分支；false：走主机 agent 安装命令分支</p> 
     * @return IsCloud <p>是否腾讯云。true：走平行容器 daemonset yaml 安装分支；false：走主机 agent 安装命令分支</p>
     */
    public Boolean getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set <p>是否腾讯云。true：走平行容器 daemonset yaml 安装分支；false：走主机 agent 安装命令分支</p>
     * @param IsCloud <p>是否腾讯云。true：走平行容器 daemonset yaml 安装分支；false：走主机 agent 安装命令分支</p>
     */
    public void setIsCloud(Boolean IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>网络类型<br>枚举值：<br>basic：基础网络<br>private：VPC<br>public：公网<br>direct：专线</p> 
     * @return NetType <p>网络类型<br>枚举值：<br>basic：基础网络<br>private：VPC<br>public：公网<br>direct：专线</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型<br>枚举值：<br>basic：基础网络<br>private：VPC<br>public：公网<br>direct：专线</p>
     * @param NetType <p>网络类型<br>枚举值：<br>basic：基础网络<br>private：VPC<br>public：公网<br>direct：专线</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>地域编码（NetType=direct 时必填；腾讯云分支用于特殊地域镜像仓库替换）</p> 
     * @return RegionCode <p>地域编码（NetType=direct 时必填；腾讯云分支用于特殊地域镜像仓库替换）</p>
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set <p>地域编码（NetType=direct 时必填；腾讯云分支用于特殊地域镜像仓库替换）</p>
     * @param RegionCode <p>地域编码（NetType=direct 时必填；腾讯云分支用于特殊地域镜像仓库替换）</p>
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get <p>VPC ID（NetType=direct 时必填）<br>参数格式：形如 vpc-xxxxxxxx</p> 
     * @return VpcId <p>VPC ID（NetType=direct 时必填）<br>参数格式：形如 vpc-xxxxxxxx</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID（NetType=direct 时必填）<br>参数格式：形如 vpc-xxxxxxxx</p>
     * @param VpcId <p>VPC ID（NetType=direct 时必填）<br>参数格式：形如 vpc-xxxxxxxx</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>过期时间<br>参数格式：yyyy-MM-dd（如 2026-12-31）<br>用途：腾讯云分支用于 daemonset yaml 的 cos 下载链接过期时间；非腾讯云分支用于 agent 安装 token 过期时间</p> 
     * @return ExpireDate <p>过期时间<br>参数格式：yyyy-MM-dd（如 2026-12-31）<br>用途：腾讯云分支用于 daemonset yaml 的 cos 下载链接过期时间；非腾讯云分支用于 agent 安装 token 过期时间</p>
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set <p>过期时间<br>参数格式：yyyy-MM-dd（如 2026-12-31）<br>用途：腾讯云分支用于 daemonset yaml 的 cos 下载链接过期时间；非腾讯云分支用于 agent 安装 token 过期时间</p>
     * @param ExpireDate <p>过期时间<br>参数格式：yyyy-MM-dd（如 2026-12-31）<br>用途：腾讯云分支用于 daemonset yaml 的 cos 下载链接过期时间；非腾讯云分支用于 agent 安装 token 过期时间</p>
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get <p>csip 标签 ID 列表（非腾讯云分支用，关联安装标签）</p> 
     * @return TagIds <p>csip 标签 ID 列表（非腾讯云分支用，关联安装标签）</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>csip 标签 ID 列表（非腾讯云分支用，关联安装标签）</p>
     * @param TagIds <p>csip 标签 ID 列表（非腾讯云分支用，关联安装标签）</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>集群自定义参数（腾讯云分支用于替换 daemonset 模板占位符）</p> 
     * @return ClusterCustomParameters <p>集群自定义参数（腾讯云分支用于替换 daemonset 模板占位符）</p>
     */
    public ClusterCustomParameters [] getClusterCustomParameters() {
        return this.ClusterCustomParameters;
    }

    /**
     * Set <p>集群自定义参数（腾讯云分支用于替换 daemonset 模板占位符）</p>
     * @param ClusterCustomParameters <p>集群自定义参数（腾讯云分支用于替换 daemonset 模板占位符）</p>
     */
    public void setClusterCustomParameters(ClusterCustomParameters [] ClusterCustomParameters) {
        this.ClusterCustomParameters = ClusterCustomParameters;
    }

    /**
     * Get <p>接入 VIP（非腾讯云分支用；NetType=direct 且未传 Vip 时由专线服务自动申请）</p> 
     * @return Vip <p>接入 VIP（非腾讯云分支用；NetType=direct 且未传 Vip 时由专线服务自动申请）</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>接入 VIP（非腾讯云分支用；NetType=direct 且未传 Vip 时由专线服务自动申请）</p>
     * @param Vip <p>接入 VIP（非腾讯云分支用；NetType=direct 且未传 Vip 时由专线服务自动申请）</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public DescribeClusterInstallCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInstallCommandRequest(DescribeClusterInstallCommandRequest source) {
        if (source.IsCloud != null) {
            this.IsCloud = new Boolean(source.IsCloud);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
        if (source.ClusterCustomParameters != null) {
            this.ClusterCustomParameters = new ClusterCustomParameters[source.ClusterCustomParameters.length];
            for (int i = 0; i < source.ClusterCustomParameters.length; i++) {
                this.ClusterCustomParameters[i] = new ClusterCustomParameters(source.ClusterCustomParameters[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArrayObj(map, prefix + "ClusterCustomParameters.", this.ClusterCustomParameters);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

