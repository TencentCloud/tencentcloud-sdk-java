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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListClsTopicDomainsResponse extends AbstractModel {

    /**
    * 开发者ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 渠道
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 域名区域配置，其中可能含有已删除的域名，如果要再传回ManageClsTopicDomains接口，需要结合ListCdnDomains接口排除掉已删除的域名
    */
    @SerializedName("DomainAreaConfigs")
    @Expose
    private DomainAreaConfig [] DomainAreaConfigs;

    /**
    * 日志主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志主题最近更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否继承域名标签
    */
    @SerializedName("InheritDomainTags")
    @Expose
    private Boolean InheritDomainTags;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 开发者ID 
     * @return AppId 开发者ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 开发者ID
     * @param AppId 开发者ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 渠道 
     * @return Channel 渠道
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道
     * @param Channel 渠道
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 日志集ID 
     * @return LogsetId 日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
     * @param LogsetId 日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 域名区域配置，其中可能含有已删除的域名，如果要再传回ManageClsTopicDomains接口，需要结合ListCdnDomains接口排除掉已删除的域名 
     * @return DomainAreaConfigs 域名区域配置，其中可能含有已删除的域名，如果要再传回ManageClsTopicDomains接口，需要结合ListCdnDomains接口排除掉已删除的域名
     */
    public DomainAreaConfig [] getDomainAreaConfigs() {
        return this.DomainAreaConfigs;
    }

    /**
     * Set 域名区域配置，其中可能含有已删除的域名，如果要再传回ManageClsTopicDomains接口，需要结合ListCdnDomains接口排除掉已删除的域名
     * @param DomainAreaConfigs 域名区域配置，其中可能含有已删除的域名，如果要再传回ManageClsTopicDomains接口，需要结合ListCdnDomains接口排除掉已删除的域名
     */
    public void setDomainAreaConfigs(DomainAreaConfig [] DomainAreaConfigs) {
        this.DomainAreaConfigs = DomainAreaConfigs;
    }

    /**
     * Get 日志主题名称 
     * @return TopicName 日志主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题名称
     * @param TopicName 日志主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志主题最近更新时间 
     * @return UpdateTime 日志主题最近更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 日志主题最近更新时间
     * @param UpdateTime 日志主题最近更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否继承域名标签 
     * @return InheritDomainTags 是否继承域名标签
     */
    public Boolean getInheritDomainTags() {
        return this.InheritDomainTags;
    }

    /**
     * Set 是否继承域名标签
     * @param InheritDomainTags 是否继承域名标签
     */
    public void setInheritDomainTags(Boolean InheritDomainTags) {
        this.InheritDomainTags = InheritDomainTags;
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

    public ListClsTopicDomainsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListClsTopicDomainsResponse(ListClsTopicDomainsResponse source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.DomainAreaConfigs != null) {
            this.DomainAreaConfigs = new DomainAreaConfig[source.DomainAreaConfigs.length];
            for (int i = 0; i < source.DomainAreaConfigs.length; i++) {
                this.DomainAreaConfigs[i] = new DomainAreaConfig(source.DomainAreaConfigs[i]);
            }
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.InheritDomainTags != null) {
            this.InheritDomainTags = new Boolean(source.InheritDomainTags);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamArrayObj(map, prefix + "DomainAreaConfigs.", this.DomainAreaConfigs);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InheritDomainTags", this.InheritDomainTags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

