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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunServerResponse extends AbstractModel {

    /**
    * 个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 版本列表
    */
    @SerializedName("VersionItems")
    @Expose
    private CloudBaseRunServerVersionItem [] VersionItems;

    /**
    * 服务名称
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 是否对于外网开放
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * 镜像仓库
    */
    @SerializedName("ImageRepo")
    @Expose
    private String ImageRepo;

    /**
    * 流量配置的类型（FLOW,URL_PARAMS)
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 服务创建类型，默认为空，一键部署为oneclick
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 服务标签, function: 托管函数
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 个数 
     * @return TotalCount 个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 个数
     * @param TotalCount 个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 版本列表 
     * @return VersionItems 版本列表
     */
    public CloudBaseRunServerVersionItem [] getVersionItems() {
        return this.VersionItems;
    }

    /**
     * Set 版本列表
     * @param VersionItems 版本列表
     */
    public void setVersionItems(CloudBaseRunServerVersionItem [] VersionItems) {
        this.VersionItems = VersionItems;
    }

    /**
     * Get 服务名称 
     * @return ServerName 服务名称
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名称
     * @param ServerName 服务名称
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 是否对于外网开放 
     * @return IsPublic 是否对于外网开放
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否对于外网开放
     * @param IsPublic 是否对于外网开放
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 镜像仓库 
     * @return ImageRepo 镜像仓库
     */
    public String getImageRepo() {
        return this.ImageRepo;
    }

    /**
     * Set 镜像仓库
     * @param ImageRepo 镜像仓库
     */
    public void setImageRepo(String ImageRepo) {
        this.ImageRepo = ImageRepo;
    }

    /**
     * Get 流量配置的类型（FLOW,URL_PARAMS) 
     * @return TrafficType 流量配置的类型（FLOW,URL_PARAMS)
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set 流量配置的类型（FLOW,URL_PARAMS)
     * @param TrafficType 流量配置的类型（FLOW,URL_PARAMS)
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get 服务创建类型，默认为空，一键部署为oneclick 
     * @return SourceType 服务创建类型，默认为空，一键部署为oneclick
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 服务创建类型，默认为空，一键部署为oneclick
     * @param SourceType 服务创建类型，默认为空，一键部署为oneclick
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 服务标签, function: 托管函数 
     * @return Tag 服务标签, function: 托管函数
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 服务标签, function: 托管函数
     * @param Tag 服务标签, function: 托管函数
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
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

    public DescribeCloudBaseRunServerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunServerResponse(DescribeCloudBaseRunServerResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VersionItems != null) {
            this.VersionItems = new CloudBaseRunServerVersionItem[source.VersionItems.length];
            for (int i = 0; i < source.VersionItems.length; i++) {
                this.VersionItems[i] = new CloudBaseRunServerVersionItem(source.VersionItems[i]);
            }
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.ImageRepo != null) {
            this.ImageRepo = new String(source.ImageRepo);
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "VersionItems.", this.VersionItems);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "ImageRepo", this.ImageRepo);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

