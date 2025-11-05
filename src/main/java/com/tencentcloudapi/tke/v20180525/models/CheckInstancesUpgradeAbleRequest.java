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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckInstancesUpgradeAbleRequest extends AbstractModel {

    /**
    * 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ）
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点列表，空为全部节点
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 升级类型，枚举值：reset(重装升级，支持大版本和小版本)，hot(原地滚动小版本升级)，major(原地滚动大版本升级)
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * 偏移量，默认为0。关于 Offset 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件列表，Name 可选值为ip、instanceId、hostname、label

- Name 为 ip 时，Value 为待查询节点 ip
- Name 为 hostname 时，Value 为待查询节点名称
- Name 为 label 时，Value 为待查询 K8S 节点 label
- Name 为 instanceId 时，Value 为 待查询节点 id
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
     * Get 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ） 
     * @return ClusterId 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ）
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ）
     * @param ClusterId 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ）
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点列表，空为全部节点 
     * @return InstanceIds 节点列表，空为全部节点
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 节点列表，空为全部节点
     * @param InstanceIds 节点列表，空为全部节点
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 升级类型，枚举值：reset(重装升级，支持大版本和小版本)，hot(原地滚动小版本升级)，major(原地滚动大版本升级) 
     * @return UpgradeType 升级类型，枚举值：reset(重装升级，支持大版本和小版本)，hot(原地滚动小版本升级)，major(原地滚动大版本升级)
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set 升级类型，枚举值：reset(重装升级，支持大版本和小版本)，hot(原地滚动小版本升级)，major(原地滚动大版本升级)
     * @param UpgradeType 升级类型，枚举值：reset(重装升级，支持大版本和小版本)，hot(原地滚动小版本升级)，major(原地滚动大版本升级)
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get 偏移量，默认为0。关于 Offset 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于 Offset 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于 Offset 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于 Offset 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件列表，Name 可选值为ip、instanceId、hostname、label

- Name 为 ip 时，Value 为待查询节点 ip
- Name 为 hostname 时，Value 为待查询节点名称
- Name 为 label 时，Value 为待查询 K8S 节点 label
- Name 为 instanceId 时，Value 为 待查询节点 id 
     * @return Filter 过滤条件列表，Name 可选值为ip、instanceId、hostname、label

- Name 为 ip 时，Value 为待查询节点 ip
- Name 为 hostname 时，Value 为待查询节点名称
- Name 为 label 时，Value 为待查询 K8S 节点 label
- Name 为 instanceId 时，Value 为 待查询节点 id
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件列表，Name 可选值为ip、instanceId、hostname、label

- Name 为 ip 时，Value 为待查询节点 ip
- Name 为 hostname 时，Value 为待查询节点名称
- Name 为 label 时，Value 为待查询 K8S 节点 label
- Name 为 instanceId 时，Value 为 待查询节点 id
     * @param Filter 过滤条件列表，Name 可选值为ip、instanceId、hostname、label

- Name 为 ip 时，Value 为待查询节点 ip
- Name 为 hostname 时，Value 为待查询节点名称
- Name 为 label 时，Value 为待查询 K8S 节点 label
- Name 为 instanceId 时，Value 为 待查询节点 id
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    public CheckInstancesUpgradeAbleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckInstancesUpgradeAbleRequest(CheckInstancesUpgradeAbleRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new Filter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new Filter(source.Filter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);

    }
}

