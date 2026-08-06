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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductInstanceResource extends AbstractModel {

    /**
    * <p>资源类型。</p><p>枚举值：</p><ul><li>Storage： 存储资源</li><li>Traffic： 流量资源</li><li>Transcode： 转码资源</li><li>TESHD： 极速高清转码资源</li><li>Review： 音视频审核资源</li><li>MediaProcess： 媒体处理资源</li><li>MLLMMediaProcess： 大模型媒体处理资源</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源包额度。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li>
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * <p>资源包余量。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li>
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
     * Get <p>资源类型。</p><p>枚举值：</p><ul><li>Storage： 存储资源</li><li>Traffic： 流量资源</li><li>Transcode： 转码资源</li><li>TESHD： 极速高清转码资源</li><li>Review： 音视频审核资源</li><li>MediaProcess： 媒体处理资源</li><li>MLLMMediaProcess： 大模型媒体处理资源</li></ul> 
     * @return ResourceType <p>资源类型。</p><p>枚举值：</p><ul><li>Storage： 存储资源</li><li>Traffic： 流量资源</li><li>Transcode： 转码资源</li><li>TESHD： 极速高清转码资源</li><li>Review： 音视频审核资源</li><li>MediaProcess： 媒体处理资源</li><li>MLLMMediaProcess： 大模型媒体处理资源</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型。</p><p>枚举值：</p><ul><li>Storage： 存储资源</li><li>Traffic： 流量资源</li><li>Transcode： 转码资源</li><li>TESHD： 极速高清转码资源</li><li>Review： 音视频审核资源</li><li>MediaProcess： 媒体处理资源</li><li>MLLMMediaProcess： 大模型媒体处理资源</li></ul>
     * @param ResourceType <p>资源类型。</p><p>枚举值：</p><ul><li>Storage： 存储资源</li><li>Traffic： 流量资源</li><li>Transcode： 转码资源</li><li>TESHD： 极速高清转码资源</li><li>Review： 音视频审核资源</li><li>MediaProcess： 媒体处理资源</li><li>MLLMMediaProcess： 大模型媒体处理资源</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源包额度。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li> 
     * @return Amount <p>资源包额度。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li>
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set <p>资源包额度。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li>
     * @param Amount <p>资源包额度。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li>
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get <p>资源包余量。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li> 
     * @return Left <p>资源包余量。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li>
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set <p>资源包余量。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li>
     * @param Left <p>资源包余量。</p><li>音视频存储资源包，单位为字节。</li><li>音视频转码资源包，单位为秒。</li><li>音视频审核资源包，单位为秒。</li><li>音视频极速高清资源包，单位为秒。</li><li>音视频加速资源包，单位为字节。</li><li>媒体处理时长资源包，单位为秒。</li>
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    public ProductInstanceResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductInstanceResource(ProductInstanceResource source) {
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

