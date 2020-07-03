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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesRequest extends AbstractModel{

    /**
    * 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 过滤条件，每次请求的`Filters`的上限为0，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：
<li> image-id - String - 是否必填： 否 - （过滤条件）按照镜像ID进行过滤</li>
<li> image-type - String - 是否必填： 否 - （过滤条件）按照镜像类型进行过滤。取值范围：
    PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像) 
    PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
   SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。</li>
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
    * 实例类型，如 `S1.SMALL1`
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。 
     * @return ImageIds 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。
     * @param ImageIds 镜像ID列表 。镜像ID如：`img-gvbnzy6f`。array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/15688)。镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get 过滤条件，每次请求的`Filters`的上限为0，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：
<li> image-id - String - 是否必填： 否 - （过滤条件）按照镜像ID进行过滤</li>
<li> image-type - String - 是否必填： 否 - （过滤条件）按照镜像类型进行过滤。取值范围：
    PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像) 
    PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
   SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。</li> 
     * @return Filters 过滤条件，每次请求的`Filters`的上限为0，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：
<li> image-id - String - 是否必填： 否 - （过滤条件）按照镜像ID进行过滤</li>
<li> image-type - String - 是否必填： 否 - （过滤条件）按照镜像类型进行过滤。取值范围：
    PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像) 
    PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
   SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，每次请求的`Filters`的上限为0，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：
<li> image-id - String - 是否必填： 否 - （过滤条件）按照镜像ID进行过滤</li>
<li> image-type - String - 是否必填： 否 - （过滤条件）按照镜像类型进行过滤。取值范围：
    PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像) 
    PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
   SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。</li>
     * @param Filters 过滤条件，每次请求的`Filters`的上限为0，`Filters.Values`的上限为5。参数不可以同时指定`ImageIds`和`Filters`。详细的过滤条件如下：
<li> image-id - String - 是否必填： 否 - （过滤条件）按照镜像ID进行过滤</li>
<li> image-type - String - 是否必填： 否 - （过滤条件）按照镜像类型进行过滤。取值范围：
    PRIVATE_IMAGE: 私有镜像 (本账户创建的镜像) 
    PUBLIC_IMAGE: 公共镜像 (腾讯云官方镜像)
   SHARED_IMAGE: 共享镜像(其他账户共享给本账户的镜像) 。</li>
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
     * Get 实例类型，如 `S1.SMALL1` 
     * @return InstanceType 实例类型，如 `S1.SMALL1`
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，如 `S1.SMALL1`
     * @param InstanceType 实例类型，如 `S1.SMALL1`
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
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

