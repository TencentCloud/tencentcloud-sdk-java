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

public class SyncImagesRequest extends AbstractModel{

    /**
    * 镜像ID列表 ，镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。<br>镜像ID必须满足限制：<br><li>镜像ID对应的镜像状态必须为`NORMAL`。<br>镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 目的同步地域列表，必须满足如下限制：<br><li>必须是一个合法的Region。<br><li>如果是自定义镜像，则目标同步地域不能为源地域。<br><li>如果是共享镜像，则目的同步地域仅支持源地域，表示将共享镜像复制为源地域的自定义镜像。<br><li>暂不支持部分地域同步。<br>具体地域参数请参考[Region](https://cloud.tencent.com/document/product/213/6091)。
    */
    @SerializedName("DestinationRegions")
    @Expose
    private String [] DestinationRegions;

    /**
    * 检测是否支持发起同步镜像。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 目标镜像名称。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 是否需要返回目的地域的镜像ID。
    */
    @SerializedName("ImageSetRequired")
    @Expose
    private Boolean ImageSetRequired;

    /**
     * Get 镜像ID列表 ，镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。<br>镜像ID必须满足限制：<br><li>镜像ID对应的镜像状态必须为`NORMAL`。<br>镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。 
     * @return ImageIds 镜像ID列表 ，镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。<br>镜像ID必须满足限制：<br><li>镜像ID对应的镜像状态必须为`NORMAL`。<br>镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 镜像ID列表 ，镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。<br>镜像ID必须满足限制：<br><li>镜像ID对应的镜像状态必须为`NORMAL`。<br>镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。
     * @param ImageIds 镜像ID列表 ，镜像ID可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。<br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。<br>镜像ID必须满足限制：<br><li>镜像ID对应的镜像状态必须为`NORMAL`。<br>镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get 目的同步地域列表，必须满足如下限制：<br><li>必须是一个合法的Region。<br><li>如果是自定义镜像，则目标同步地域不能为源地域。<br><li>如果是共享镜像，则目的同步地域仅支持源地域，表示将共享镜像复制为源地域的自定义镜像。<br><li>暂不支持部分地域同步。<br>具体地域参数请参考[Region](https://cloud.tencent.com/document/product/213/6091)。 
     * @return DestinationRegions 目的同步地域列表，必须满足如下限制：<br><li>必须是一个合法的Region。<br><li>如果是自定义镜像，则目标同步地域不能为源地域。<br><li>如果是共享镜像，则目的同步地域仅支持源地域，表示将共享镜像复制为源地域的自定义镜像。<br><li>暂不支持部分地域同步。<br>具体地域参数请参考[Region](https://cloud.tencent.com/document/product/213/6091)。
     */
    public String [] getDestinationRegions() {
        return this.DestinationRegions;
    }

    /**
     * Set 目的同步地域列表，必须满足如下限制：<br><li>必须是一个合法的Region。<br><li>如果是自定义镜像，则目标同步地域不能为源地域。<br><li>如果是共享镜像，则目的同步地域仅支持源地域，表示将共享镜像复制为源地域的自定义镜像。<br><li>暂不支持部分地域同步。<br>具体地域参数请参考[Region](https://cloud.tencent.com/document/product/213/6091)。
     * @param DestinationRegions 目的同步地域列表，必须满足如下限制：<br><li>必须是一个合法的Region。<br><li>如果是自定义镜像，则目标同步地域不能为源地域。<br><li>如果是共享镜像，则目的同步地域仅支持源地域，表示将共享镜像复制为源地域的自定义镜像。<br><li>暂不支持部分地域同步。<br>具体地域参数请参考[Region](https://cloud.tencent.com/document/product/213/6091)。
     */
    public void setDestinationRegions(String [] DestinationRegions) {
        this.DestinationRegions = DestinationRegions;
    }

    /**
     * Get 检测是否支持发起同步镜像。 
     * @return DryRun 检测是否支持发起同步镜像。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 检测是否支持发起同步镜像。
     * @param DryRun 检测是否支持发起同步镜像。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 目标镜像名称。 
     * @return ImageName 目标镜像名称。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 目标镜像名称。
     * @param ImageName 目标镜像名称。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 是否需要返回目的地域的镜像ID。 
     * @return ImageSetRequired 是否需要返回目的地域的镜像ID。
     */
    public Boolean getImageSetRequired() {
        return this.ImageSetRequired;
    }

    /**
     * Set 是否需要返回目的地域的镜像ID。
     * @param ImageSetRequired 是否需要返回目的地域的镜像ID。
     */
    public void setImageSetRequired(Boolean ImageSetRequired) {
        this.ImageSetRequired = ImageSetRequired;
    }

    public SyncImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncImagesRequest(SyncImagesRequest source) {
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.DestinationRegions != null) {
            this.DestinationRegions = new String[source.DestinationRegions.length];
            for (int i = 0; i < source.DestinationRegions.length; i++) {
                this.DestinationRegions[i] = new String(source.DestinationRegions[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageSetRequired != null) {
            this.ImageSetRequired = new Boolean(source.ImageSetRequired);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamArraySimple(map, prefix + "DestinationRegions.", this.DestinationRegions);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageSetRequired", this.ImageSetRequired);

    }
}

