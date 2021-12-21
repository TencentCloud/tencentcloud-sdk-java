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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductInstanceRecource extends AbstractModel{

    /**
    * 资源类型。
<li>Storage：存储资源包。</li>
<li>Traffic：流量资源包。</li>
<li>Transcode：普通转码资源包。</li>
<li>TESHD：极速高清转码资源包。</li>
<li>Review：视频智能识别转码资源包。</li>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源包额度。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li>
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 资源包余量。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li>
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
     * Get 资源类型。
<li>Storage：存储资源包。</li>
<li>Traffic：流量资源包。</li>
<li>Transcode：普通转码资源包。</li>
<li>TESHD：极速高清转码资源包。</li>
<li>Review：视频智能识别转码资源包。</li> 
     * @return ResourceType 资源类型。
<li>Storage：存储资源包。</li>
<li>Traffic：流量资源包。</li>
<li>Transcode：普通转码资源包。</li>
<li>TESHD：极速高清转码资源包。</li>
<li>Review：视频智能识别转码资源包。</li>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型。
<li>Storage：存储资源包。</li>
<li>Traffic：流量资源包。</li>
<li>Transcode：普通转码资源包。</li>
<li>TESHD：极速高清转码资源包。</li>
<li>Review：视频智能识别转码资源包。</li>
     * @param ResourceType 资源类型。
<li>Storage：存储资源包。</li>
<li>Traffic：流量资源包。</li>
<li>Transcode：普通转码资源包。</li>
<li>TESHD：极速高清转码资源包。</li>
<li>Review：视频智能识别转码资源包。</li>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源包额度。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li> 
     * @return Amount 资源包额度。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li>
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 资源包额度。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li>
     * @param Amount 资源包额度。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li>
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 资源包余量。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li> 
     * @return Left 资源包余量。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li>
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set 资源包余量。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li>
     * @param Left 资源包余量。
<li>视频存储资源包，单位为字节。</li>
<li>视频转码资源包，单位为秒。</li>
<li>视频智能识别资源包，单位为秒。</li>
<li>视频极速高清资源包，单位为秒。</li>
<li>视频加速资源包，单位为字节。</li>
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    public ProductInstanceRecource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductInstanceRecource(ProductInstanceRecource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.Left != null) {
            this.Left = new Long(source.Left);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "Left", this.Left);

    }
}

