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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageAttributeRequest extends AbstractModel {

    /**
    * 镜像ID，形如`img-gvbnzy6f`。镜像ID可以通过如下方式获取：<li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 设置新的镜像名称；必须满足下列限制 <li> 不得超过60个字符。</li><li> 镜像名称不能与已有镜像重复。</li>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 设置新的镜像描述；必须满足下列限制： <li> 不得超过 256 个字符。</li>
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 设置镜像族；
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
    * 设置镜像是否废弃；
    */
    @SerializedName("ImageDeprecated")
    @Expose
    private Boolean ImageDeprecated;

    /**
     * Get 镜像ID，形如`img-gvbnzy6f`。镜像ID可以通过如下方式获取：<li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li> 
     * @return ImageId 镜像ID，形如`img-gvbnzy6f`。镜像ID可以通过如下方式获取：<li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID，形如`img-gvbnzy6f`。镜像ID可以通过如下方式获取：<li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li>
     * @param ImageId 镜像ID，形如`img-gvbnzy6f`。镜像ID可以通过如下方式获取：<li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 设置新的镜像名称；必须满足下列限制 <li> 不得超过60个字符。</li><li> 镜像名称不能与已有镜像重复。</li> 
     * @return ImageName 设置新的镜像名称；必须满足下列限制 <li> 不得超过60个字符。</li><li> 镜像名称不能与已有镜像重复。</li>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 设置新的镜像名称；必须满足下列限制 <li> 不得超过60个字符。</li><li> 镜像名称不能与已有镜像重复。</li>
     * @param ImageName 设置新的镜像名称；必须满足下列限制 <li> 不得超过60个字符。</li><li> 镜像名称不能与已有镜像重复。</li>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 设置新的镜像描述；必须满足下列限制： <li> 不得超过 256 个字符。</li> 
     * @return ImageDescription 设置新的镜像描述；必须满足下列限制： <li> 不得超过 256 个字符。</li>
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 设置新的镜像描述；必须满足下列限制： <li> 不得超过 256 个字符。</li>
     * @param ImageDescription 设置新的镜像描述；必须满足下列限制： <li> 不得超过 256 个字符。</li>
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 设置镜像族； 
     * @return ImageFamily 设置镜像族；
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set 设置镜像族；
     * @param ImageFamily 设置镜像族；
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
    }

    /**
     * Get 设置镜像是否废弃； 
     * @return ImageDeprecated 设置镜像是否废弃；
     */
    public Boolean getImageDeprecated() {
        return this.ImageDeprecated;
    }

    /**
     * Set 设置镜像是否废弃；
     * @param ImageDeprecated 设置镜像是否废弃；
     */
    public void setImageDeprecated(Boolean ImageDeprecated) {
        this.ImageDeprecated = ImageDeprecated;
    }

    public ModifyImageAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageAttributeRequest(ModifyImageAttributeRequest source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.ImageFamily != null) {
            this.ImageFamily = new String(source.ImageFamily);
        }
        if (source.ImageDeprecated != null) {
            this.ImageDeprecated = new Boolean(source.ImageDeprecated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ImageFamily", this.ImageFamily);
        this.setParamSimple(map, prefix + "ImageDeprecated", this.ImageDeprecated);

    }
}

