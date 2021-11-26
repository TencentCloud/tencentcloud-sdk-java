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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MoveResourceRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。
    */
    @SerializedName("SourceResource")
    @Expose
    private ResourceInfo SourceResource;

    /**
    * 目标信息，包含分类及归属，仅支持移动资源到分类。
    */
    @SerializedName("DestinationResource")
    @Expose
    private ResourceInfo DestinationResource;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以移动任务资源。如果指定操作者，则操作者必须对源及目标资源有写权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。 
     * @return SourceResource 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。
     */
    public ResourceInfo getSourceResource() {
        return this.SourceResource;
    }

    /**
     * Set 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。
     * @param SourceResource 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。
     */
    public void setSourceResource(ResourceInfo SourceResource) {
        this.SourceResource = SourceResource;
    }

    /**
     * Get 目标信息，包含分类及归属，仅支持移动资源到分类。 
     * @return DestinationResource 目标信息，包含分类及归属，仅支持移动资源到分类。
     */
    public ResourceInfo getDestinationResource() {
        return this.DestinationResource;
    }

    /**
     * Set 目标信息，包含分类及归属，仅支持移动资源到分类。
     * @param DestinationResource 目标信息，包含分类及归属，仅支持移动资源到分类。
     */
    public void setDestinationResource(ResourceInfo DestinationResource) {
        this.DestinationResource = DestinationResource;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以移动任务资源。如果指定操作者，则操作者必须对源及目标资源有写权限。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以移动任务资源。如果指定操作者，则操作者必须对源及目标资源有写权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以移动任务资源。如果指定操作者，则操作者必须对源及目标资源有写权限。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以移动任务资源。如果指定操作者，则操作者必须对源及目标资源有写权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public MoveResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MoveResourceRequest(MoveResourceRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.SourceResource != null) {
            this.SourceResource = new ResourceInfo(source.SourceResource);
        }
        if (source.DestinationResource != null) {
            this.DestinationResource = new ResourceInfo(source.DestinationResource);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamObj(map, prefix + "SourceResource.", this.SourceResource);
        this.setParamObj(map, prefix + "DestinationResource.", this.DestinationResource);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

