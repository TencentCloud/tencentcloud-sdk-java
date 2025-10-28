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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesRequest extends AbstractModel {

    /**
    * 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li>
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 过滤条件，每次请求的`Filters`的上限为10，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：<li><strong>image-id</strong></li><p style="padding-left: 30px;">按照【<strong>镜像ID</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>image-type</strong></li><p style="padding-left: 30px;">按照【<strong>镜像类型</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">PRIVATE_IMAGE: 自定义镜像 (本账户创建的镜像)</p><p style="padding-left: 30px;">PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)</p><p style="padding-left: 30px;">SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像)</p><li><strong>image-name</strong></li><p style="padding-left: 30px;">按照【<strong>镜像名称</strong>】进行过滤。支持模糊查询。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>platform</strong></li><p style="padding-left: 30px;">按照【<strong>镜像平台</strong>】进行过滤，如 CentOS，支持模糊匹配。可通过 <a href="https://cloud.tencent.com/document/api/213/15715" target="_blank">DescribeImages</a> 接口返回的<code> Platform </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-value</strong></li><p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag:tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey 和 TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>dedicated-cluster-id</strong></li><p style="padding-left: 30px;">按照【<strong>本地专用集群CDC ID</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/api/1346/73758" target="_blank"> DescribeDedicatedClusters </a> 接口返回的<code> DedicatedClusterSet </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>cdc-cache-status</strong></li><p style="padding-left: 30px;">按照【<strong>CDC镜像缓存状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">CACHED_ALL: 全部缓存状态</p><p style="padding-left: 30px;">CACHING: 缓存中</p><p style="padding-left: 30px;">CACHED: 已缓存</p><p style="padding-left: 30px;">CACHE_INVALID: 缓存失效</p><p style="padding-left: 30px;">CACHE_FAILED: 缓存失败</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。关于Offset详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数量限制，默认为20，最大值为100。关于Limit详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 实例类型，如 `S1.SMALL1`。可通过 [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/product/213/15749) 接口返回的 `InstanceType` 获取。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li> 
     * @return ImageIds 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li>
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li>
     * @param ImageIds 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li>
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get 过滤条件，每次请求的`Filters`的上限为10，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：<li><strong>image-id</strong></li><p style="padding-left: 30px;">按照【<strong>镜像ID</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>image-type</strong></li><p style="padding-left: 30px;">按照【<strong>镜像类型</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">PRIVATE_IMAGE: 自定义镜像 (本账户创建的镜像)</p><p style="padding-left: 30px;">PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)</p><p style="padding-left: 30px;">SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像)</p><li><strong>image-name</strong></li><p style="padding-left: 30px;">按照【<strong>镜像名称</strong>】进行过滤。支持模糊查询。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>platform</strong></li><p style="padding-left: 30px;">按照【<strong>镜像平台</strong>】进行过滤，如 CentOS，支持模糊匹配。可通过 <a href="https://cloud.tencent.com/document/api/213/15715" target="_blank">DescribeImages</a> 接口返回的<code> Platform </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-value</strong></li><p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag:tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey 和 TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>dedicated-cluster-id</strong></li><p style="padding-left: 30px;">按照【<strong>本地专用集群CDC ID</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/api/1346/73758" target="_blank"> DescribeDedicatedClusters </a> 接口返回的<code> DedicatedClusterSet </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>cdc-cache-status</strong></li><p style="padding-left: 30px;">按照【<strong>CDC镜像缓存状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">CACHED_ALL: 全部缓存状态</p><p style="padding-left: 30px;">CACHING: 缓存中</p><p style="padding-left: 30px;">CACHED: 已缓存</p><p style="padding-left: 30px;">CACHE_INVALID: 缓存失效</p><p style="padding-left: 30px;">CACHE_FAILED: 缓存失败</p> 
     * @return Filters 过滤条件，每次请求的`Filters`的上限为10，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：<li><strong>image-id</strong></li><p style="padding-left: 30px;">按照【<strong>镜像ID</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>image-type</strong></li><p style="padding-left: 30px;">按照【<strong>镜像类型</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">PRIVATE_IMAGE: 自定义镜像 (本账户创建的镜像)</p><p style="padding-left: 30px;">PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)</p><p style="padding-left: 30px;">SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像)</p><li><strong>image-name</strong></li><p style="padding-left: 30px;">按照【<strong>镜像名称</strong>】进行过滤。支持模糊查询。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>platform</strong></li><p style="padding-left: 30px;">按照【<strong>镜像平台</strong>】进行过滤，如 CentOS，支持模糊匹配。可通过 <a href="https://cloud.tencent.com/document/api/213/15715" target="_blank">DescribeImages</a> 接口返回的<code> Platform </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-value</strong></li><p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag:tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey 和 TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>dedicated-cluster-id</strong></li><p style="padding-left: 30px;">按照【<strong>本地专用集群CDC ID</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/api/1346/73758" target="_blank"> DescribeDedicatedClusters </a> 接口返回的<code> DedicatedClusterSet </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>cdc-cache-status</strong></li><p style="padding-left: 30px;">按照【<strong>CDC镜像缓存状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">CACHED_ALL: 全部缓存状态</p><p style="padding-left: 30px;">CACHING: 缓存中</p><p style="padding-left: 30px;">CACHED: 已缓存</p><p style="padding-left: 30px;">CACHE_INVALID: 缓存失效</p><p style="padding-left: 30px;">CACHE_FAILED: 缓存失败</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，每次请求的`Filters`的上限为10，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：<li><strong>image-id</strong></li><p style="padding-left: 30px;">按照【<strong>镜像ID</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>image-type</strong></li><p style="padding-left: 30px;">按照【<strong>镜像类型</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">PRIVATE_IMAGE: 自定义镜像 (本账户创建的镜像)</p><p style="padding-left: 30px;">PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)</p><p style="padding-left: 30px;">SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像)</p><li><strong>image-name</strong></li><p style="padding-left: 30px;">按照【<strong>镜像名称</strong>】进行过滤。支持模糊查询。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>platform</strong></li><p style="padding-left: 30px;">按照【<strong>镜像平台</strong>】进行过滤，如 CentOS，支持模糊匹配。可通过 <a href="https://cloud.tencent.com/document/api/213/15715" target="_blank">DescribeImages</a> 接口返回的<code> Platform </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-value</strong></li><p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag:tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey 和 TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>dedicated-cluster-id</strong></li><p style="padding-left: 30px;">按照【<strong>本地专用集群CDC ID</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/api/1346/73758" target="_blank"> DescribeDedicatedClusters </a> 接口返回的<code> DedicatedClusterSet </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>cdc-cache-status</strong></li><p style="padding-left: 30px;">按照【<strong>CDC镜像缓存状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">CACHED_ALL: 全部缓存状态</p><p style="padding-left: 30px;">CACHING: 缓存中</p><p style="padding-left: 30px;">CACHED: 已缓存</p><p style="padding-left: 30px;">CACHE_INVALID: 缓存失效</p><p style="padding-left: 30px;">CACHE_FAILED: 缓存失败</p>
     * @param Filters 过滤条件，每次请求的`Filters`的上限为10，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：<li><strong>image-id</strong></li><p style="padding-left: 30px;">按照【<strong>镜像ID</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>image-type</strong></li><p style="padding-left: 30px;">按照【<strong>镜像类型</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">PRIVATE_IMAGE: 自定义镜像 (本账户创建的镜像)</p><p style="padding-left: 30px;">PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)</p><p style="padding-left: 30px;">SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像)</p><li><strong>image-name</strong></li><p style="padding-left: 30px;">按照【<strong>镜像名称</strong>】进行过滤。支持模糊查询。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>platform</strong></li><p style="padding-left: 30px;">按照【<strong>镜像平台</strong>】进行过滤，如 CentOS，支持模糊匹配。可通过 <a href="https://cloud.tencent.com/document/api/213/15715" target="_blank">DescribeImages</a> 接口返回的<code> Platform </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag-value</strong></li><p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>tag:tag-key</strong></li><p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。可通过 <a href="https://cloud.tencent.com/document/product/651/72275" target="_blank"> GetTags </a> 接口返回的<code> TagKey 和 TagValue </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>dedicated-cluster-id</strong></li><p style="padding-left: 30px;">按照【<strong>本地专用集群CDC ID</strong>】进行过滤。可通过 <a href="https://cloud.tencent.com/document/api/1346/73758" target="_blank"> DescribeDedicatedClusters </a> 接口返回的<code> DedicatedClusterSet </code>获取。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><li><strong>cdc-cache-status</strong></li><p style="padding-left: 30px;">按照【<strong>CDC镜像缓存状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：</p><p style="padding-left: 30px;">CACHED_ALL: 全部缓存状态</p><p style="padding-left: 30px;">CACHING: 缓存中</p><p style="padding-left: 30px;">CACHED: 已缓存</p><p style="padding-left: 30px;">CACHE_INVALID: 缓存失效</p><p style="padding-left: 30px;">CACHE_FAILED: 缓存失败</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。关于Offset详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。 
     * @return Offset 偏移量，默认为0。关于Offset详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。
     * @param Offset 偏移量，默认为0。关于Offset详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数量限制，默认为20，最大值为100。关于Limit详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。 
     * @return Limit 数量限制，默认为20，最大值为100。关于Limit详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量限制，默认为20，最大值为100。关于Limit详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。
     * @param Limit 数量限制，默认为20，最大值为100。关于Limit详见[API简介](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 实例类型，如 `S1.SMALL1`。可通过 [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/product/213/15749) 接口返回的 `InstanceType` 获取。 
     * @return InstanceType 实例类型，如 `S1.SMALL1`。可通过 [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/product/213/15749) 接口返回的 `InstanceType` 获取。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，如 `S1.SMALL1`。可通过 [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/product/213/15749) 接口返回的 `InstanceType` 获取。
     * @param InstanceType 实例类型，如 `S1.SMALL1`。可通过 [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/product/213/15749) 接口返回的 `InstanceType` 获取。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DescribeImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesRequest(DescribeImagesRequest source) {
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

