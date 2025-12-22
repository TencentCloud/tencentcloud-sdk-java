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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployRecord extends AbstractModel {

    /**
    * 部署Id
    */
    @SerializedName("DeployId")
    @Expose
    private String DeployId;

    /**
    * 部署开始时间
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * 状态：running/deploying/deploy_failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 部署运行Id 用户查询部署日志
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * 构建Id
    */
    @SerializedName("BuildId")
    @Expose
    private Long BuildId;

    /**
    * 流量比例
    */
    @SerializedName("FlowRatio")
    @Expose
    private Long FlowRatio;

    /**
    * 镜像url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 缩容状态 缩容为 zero 否则为空
    */
    @SerializedName("ScaleStatus")
    @Expose
    private String ScaleStatus;

    /**
    * 是否分配流量
    */
    @SerializedName("HasTraffic")
    @Expose
    private Boolean HasTraffic;

    /**
    * 流量分配方式, FLOW: 百分比分配; URL_PARAMS: 匹配 query 参数; HEADERS: 匹配请求 Header
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 当前版本是否在发布中
    */
    @SerializedName("IsReleasing")
    @Expose
    private Boolean IsReleasing;

    /**
     * Get 部署Id 
     * @return DeployId 部署Id
     */
    public String getDeployId() {
        return this.DeployId;
    }

    /**
     * Set 部署Id
     * @param DeployId 部署Id
     */
    public void setDeployId(String DeployId) {
        this.DeployId = DeployId;
    }

    /**
     * Get 部署开始时间 
     * @return DeployTime 部署开始时间
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set 部署开始时间
     * @param DeployTime 部署开始时间
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get 状态：running/deploying/deploy_failed 
     * @return Status 状态：running/deploying/deploy_failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：running/deploying/deploy_failed
     * @param Status 状态：running/deploying/deploy_failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 部署运行Id 用户查询部署日志 
     * @return RunId 部署运行Id 用户查询部署日志
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set 部署运行Id 用户查询部署日志
     * @param RunId 部署运行Id 用户查询部署日志
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * Get 构建Id 
     * @return BuildId 构建Id
     */
    public Long getBuildId() {
        return this.BuildId;
    }

    /**
     * Set 构建Id
     * @param BuildId 构建Id
     */
    public void setBuildId(Long BuildId) {
        this.BuildId = BuildId;
    }

    /**
     * Get 流量比例 
     * @return FlowRatio 流量比例
     */
    public Long getFlowRatio() {
        return this.FlowRatio;
    }

    /**
     * Set 流量比例
     * @param FlowRatio 流量比例
     */
    public void setFlowRatio(Long FlowRatio) {
        this.FlowRatio = FlowRatio;
    }

    /**
     * Get 镜像url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUrl 镜像url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 镜像url
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrl 镜像url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 缩容状态 缩容为 zero 否则为空 
     * @return ScaleStatus 缩容状态 缩容为 zero 否则为空
     */
    public String getScaleStatus() {
        return this.ScaleStatus;
    }

    /**
     * Set 缩容状态 缩容为 zero 否则为空
     * @param ScaleStatus 缩容状态 缩容为 zero 否则为空
     */
    public void setScaleStatus(String ScaleStatus) {
        this.ScaleStatus = ScaleStatus;
    }

    /**
     * Get 是否分配流量 
     * @return HasTraffic 是否分配流量
     */
    public Boolean getHasTraffic() {
        return this.HasTraffic;
    }

    /**
     * Set 是否分配流量
     * @param HasTraffic 是否分配流量
     */
    public void setHasTraffic(Boolean HasTraffic) {
        this.HasTraffic = HasTraffic;
    }

    /**
     * Get 流量分配方式, FLOW: 百分比分配; URL_PARAMS: 匹配 query 参数; HEADERS: 匹配请求 Header 
     * @return TrafficType 流量分配方式, FLOW: 百分比分配; URL_PARAMS: 匹配 query 参数; HEADERS: 匹配请求 Header
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set 流量分配方式, FLOW: 百分比分配; URL_PARAMS: 匹配 query 参数; HEADERS: 匹配请求 Header
     * @param TrafficType 流量分配方式, FLOW: 百分比分配; URL_PARAMS: 匹配 query 参数; HEADERS: 匹配请求 Header
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get 当前版本是否在发布中 
     * @return IsReleasing 当前版本是否在发布中
     */
    public Boolean getIsReleasing() {
        return this.IsReleasing;
    }

    /**
     * Set 当前版本是否在发布中
     * @param IsReleasing 当前版本是否在发布中
     */
    public void setIsReleasing(Boolean IsReleasing) {
        this.IsReleasing = IsReleasing;
    }

    public DeployRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployRecord(DeployRecord source) {
        if (source.DeployId != null) {
            this.DeployId = new String(source.DeployId);
        }
        if (source.DeployTime != null) {
            this.DeployTime = new String(source.DeployTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.BuildId != null) {
            this.BuildId = new Long(source.BuildId);
        }
        if (source.FlowRatio != null) {
            this.FlowRatio = new Long(source.FlowRatio);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ScaleStatus != null) {
            this.ScaleStatus = new String(source.ScaleStatus);
        }
        if (source.HasTraffic != null) {
            this.HasTraffic = new Boolean(source.HasTraffic);
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.IsReleasing != null) {
            this.IsReleasing = new Boolean(source.IsReleasing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployId", this.DeployId);
        this.setParamSimple(map, prefix + "DeployTime", this.DeployTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);
        this.setParamSimple(map, prefix + "FlowRatio", this.FlowRatio);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ScaleStatus", this.ScaleStatus);
        this.setParamSimple(map, prefix + "HasTraffic", this.HasTraffic);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "IsReleasing", this.IsReleasing);

    }
}

