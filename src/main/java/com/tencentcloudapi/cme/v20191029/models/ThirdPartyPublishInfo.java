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

public class ThirdPartyPublishInfo extends AbstractModel{

    /**
    * 发布通道  ID。
    */
    @SerializedName("ChannelMaterialId")
    @Expose
    private String ChannelMaterialId;

    /**
    * 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。
    */
    @SerializedName("PenguinMediaPlatformPublishInfo")
    @Expose
    private PenguinMediaPlatformPublishInfo PenguinMediaPlatformPublishInfo;

    /**
    * 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。
    */
    @SerializedName("WeiboPublishInfo")
    @Expose
    private WeiboPublishInfo WeiboPublishInfo;

    /**
    * 快手发布信息，如果使用的发布通道为快手时必填。
    */
    @SerializedName("KuaishouPublishInfo")
    @Expose
    private KuaishouPublishInfo KuaishouPublishInfo;

    /**
    * 腾讯云对象存储发布信息， 如果使用的发布通道为腾讯云对象存储时必填。
    */
    @SerializedName("CosPublishInfo")
    @Expose
    private CosPublishInputInfo CosPublishInfo;

    /**
     * Get 发布通道  ID。 
     * @return ChannelMaterialId 发布通道  ID。
     */
    public String getChannelMaterialId() {
        return this.ChannelMaterialId;
    }

    /**
     * Set 发布通道  ID。
     * @param ChannelMaterialId 发布通道  ID。
     */
    public void setChannelMaterialId(String ChannelMaterialId) {
        this.ChannelMaterialId = ChannelMaterialId;
    }

    /**
     * Get 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。 
     * @return PenguinMediaPlatformPublishInfo 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。
     */
    public PenguinMediaPlatformPublishInfo getPenguinMediaPlatformPublishInfo() {
        return this.PenguinMediaPlatformPublishInfo;
    }

    /**
     * Set 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。
     * @param PenguinMediaPlatformPublishInfo 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。
     */
    public void setPenguinMediaPlatformPublishInfo(PenguinMediaPlatformPublishInfo PenguinMediaPlatformPublishInfo) {
        this.PenguinMediaPlatformPublishInfo = PenguinMediaPlatformPublishInfo;
    }

    /**
     * Get 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。 
     * @return WeiboPublishInfo 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。
     */
    public WeiboPublishInfo getWeiboPublishInfo() {
        return this.WeiboPublishInfo;
    }

    /**
     * Set 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。
     * @param WeiboPublishInfo 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。
     */
    public void setWeiboPublishInfo(WeiboPublishInfo WeiboPublishInfo) {
        this.WeiboPublishInfo = WeiboPublishInfo;
    }

    /**
     * Get 快手发布信息，如果使用的发布通道为快手时必填。 
     * @return KuaishouPublishInfo 快手发布信息，如果使用的发布通道为快手时必填。
     */
    public KuaishouPublishInfo getKuaishouPublishInfo() {
        return this.KuaishouPublishInfo;
    }

    /**
     * Set 快手发布信息，如果使用的发布通道为快手时必填。
     * @param KuaishouPublishInfo 快手发布信息，如果使用的发布通道为快手时必填。
     */
    public void setKuaishouPublishInfo(KuaishouPublishInfo KuaishouPublishInfo) {
        this.KuaishouPublishInfo = KuaishouPublishInfo;
    }

    /**
     * Get 腾讯云对象存储发布信息， 如果使用的发布通道为腾讯云对象存储时必填。 
     * @return CosPublishInfo 腾讯云对象存储发布信息， 如果使用的发布通道为腾讯云对象存储时必填。
     */
    public CosPublishInputInfo getCosPublishInfo() {
        return this.CosPublishInfo;
    }

    /**
     * Set 腾讯云对象存储发布信息， 如果使用的发布通道为腾讯云对象存储时必填。
     * @param CosPublishInfo 腾讯云对象存储发布信息， 如果使用的发布通道为腾讯云对象存储时必填。
     */
    public void setCosPublishInfo(CosPublishInputInfo CosPublishInfo) {
        this.CosPublishInfo = CosPublishInfo;
    }

    public ThirdPartyPublishInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThirdPartyPublishInfo(ThirdPartyPublishInfo source) {
        if (source.ChannelMaterialId != null) {
            this.ChannelMaterialId = new String(source.ChannelMaterialId);
        }
        if (source.PenguinMediaPlatformPublishInfo != null) {
            this.PenguinMediaPlatformPublishInfo = new PenguinMediaPlatformPublishInfo(source.PenguinMediaPlatformPublishInfo);
        }
        if (source.WeiboPublishInfo != null) {
            this.WeiboPublishInfo = new WeiboPublishInfo(source.WeiboPublishInfo);
        }
        if (source.KuaishouPublishInfo != null) {
            this.KuaishouPublishInfo = new KuaishouPublishInfo(source.KuaishouPublishInfo);
        }
        if (source.CosPublishInfo != null) {
            this.CosPublishInfo = new CosPublishInputInfo(source.CosPublishInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMaterialId", this.ChannelMaterialId);
        this.setParamObj(map, prefix + "PenguinMediaPlatformPublishInfo.", this.PenguinMediaPlatformPublishInfo);
        this.setParamObj(map, prefix + "WeiboPublishInfo.", this.WeiboPublishInfo);
        this.setParamObj(map, prefix + "KuaishouPublishInfo.", this.KuaishouPublishInfo);
        this.setParamObj(map, prefix + "CosPublishInfo.", this.CosPublishInfo);

    }
}

