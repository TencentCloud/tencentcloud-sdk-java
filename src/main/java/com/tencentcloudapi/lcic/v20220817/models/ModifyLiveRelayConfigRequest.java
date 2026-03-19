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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveRelayConfigRequest extends AbstractModel {

    /**
    * <p>低代码互动课堂的SdkAppId</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>房间ID</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul>
    */
    @SerializedName("RelayType")
    @Expose
    private Long RelayType;

    /**
    * <p>转推URL</p>
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * <p>是否是腾讯云CDN（默认为0）</p><p>枚举值：</p><ul><li>0： 转推非腾讯CDN</li><li>1： 转推腾讯CDN</li></ul>
    */
    @SerializedName("IsTencentCdn")
    @Expose
    private Long IsTencentCdn;

    /**
     * Get <p>低代码互动课堂的SdkAppId</p> 
     * @return SdkAppId <p>低代码互动课堂的SdkAppId</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>低代码互动课堂的SdkAppId</p>
     * @param SdkAppId <p>低代码互动课堂的SdkAppId</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>房间ID</p> 
     * @return RoomId <p>房间ID</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>房间ID</p>
     * @param RoomId <p>房间ID</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul> 
     * @return RelayType <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul>
     */
    public Long getRelayType() {
        return this.RelayType;
    }

    /**
     * Set <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul>
     * @param RelayType <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul>
     */
    public void setRelayType(Long RelayType) {
        this.RelayType = RelayType;
    }

    /**
     * Get <p>转推URL</p> 
     * @return Urls <p>转推URL</p>
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set <p>转推URL</p>
     * @param Urls <p>转推URL</p>
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get <p>是否是腾讯云CDN（默认为0）</p><p>枚举值：</p><ul><li>0： 转推非腾讯CDN</li><li>1： 转推腾讯CDN</li></ul> 
     * @return IsTencentCdn <p>是否是腾讯云CDN（默认为0）</p><p>枚举值：</p><ul><li>0： 转推非腾讯CDN</li><li>1： 转推腾讯CDN</li></ul>
     */
    public Long getIsTencentCdn() {
        return this.IsTencentCdn;
    }

    /**
     * Set <p>是否是腾讯云CDN（默认为0）</p><p>枚举值：</p><ul><li>0： 转推非腾讯CDN</li><li>1： 转推腾讯CDN</li></ul>
     * @param IsTencentCdn <p>是否是腾讯云CDN（默认为0）</p><p>枚举值：</p><ul><li>0： 转推非腾讯CDN</li><li>1： 转推腾讯CDN</li></ul>
     */
    public void setIsTencentCdn(Long IsTencentCdn) {
        this.IsTencentCdn = IsTencentCdn;
    }

    public ModifyLiveRelayConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveRelayConfigRequest(ModifyLiveRelayConfigRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.RelayType != null) {
            this.RelayType = new Long(source.RelayType);
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.IsTencentCdn != null) {
            this.IsTencentCdn = new Long(source.IsTencentCdn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RelayType", this.RelayType);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "IsTencentCdn", this.IsTencentCdn);

    }
}

