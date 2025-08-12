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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesToShareRequest extends AbstractModel {

    /**
    * CVM镜像 ID 列表。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤器列表。
<li>image-id</li>按照【CVM镜像ID】进行过滤。
类型：String
必选：否

<li>image-name</li>按照【CVM镜像名称】进行过滤。
类型：String
必选：否

<li>image-type</li>按照【CVM镜像类型】进行过滤。
类型：String
必选：否
取值范围：
PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像)
PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。

每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。
参数不可以同时指定ImageIds和Filters。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get CVM镜像 ID 列表。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。 
     * @return ImageIds CVM镜像 ID 列表。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set CVM镜像 ID 列表。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。
     * @param ImageIds CVM镜像 ID 列表。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。 
     * @return Offset 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     * @param Offset 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。 
     * @return Limit 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     * @param Limit 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤器列表。
<li>image-id</li>按照【CVM镜像ID】进行过滤。
类型：String
必选：否

<li>image-name</li>按照【CVM镜像名称】进行过滤。
类型：String
必选：否

<li>image-type</li>按照【CVM镜像类型】进行过滤。
类型：String
必选：否
取值范围：
PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像)
PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。

每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。
参数不可以同时指定ImageIds和Filters。 
     * @return Filters 过滤器列表。
<li>image-id</li>按照【CVM镜像ID】进行过滤。
类型：String
必选：否

<li>image-name</li>按照【CVM镜像名称】进行过滤。
类型：String
必选：否

<li>image-type</li>按照【CVM镜像类型】进行过滤。
类型：String
必选：否
取值范围：
PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像)
PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。

每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。
参数不可以同时指定ImageIds和Filters。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器列表。
<li>image-id</li>按照【CVM镜像ID】进行过滤。
类型：String
必选：否

<li>image-name</li>按照【CVM镜像名称】进行过滤。
类型：String
必选：否

<li>image-type</li>按照【CVM镜像类型】进行过滤。
类型：String
必选：否
取值范围：
PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像)
PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。

每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。
参数不可以同时指定ImageIds和Filters。
     * @param Filters 过滤器列表。
<li>image-id</li>按照【CVM镜像ID】进行过滤。
类型：String
必选：否

<li>image-name</li>按照【CVM镜像名称】进行过滤。
类型：String
必选：否

<li>image-type</li>按照【CVM镜像类型】进行过滤。
类型：String
必选：否
取值范围：
PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像)
PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。

每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。
参数不可以同时指定ImageIds和Filters。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeImagesToShareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesToShareRequest(DescribeImagesToShareRequest source) {
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

