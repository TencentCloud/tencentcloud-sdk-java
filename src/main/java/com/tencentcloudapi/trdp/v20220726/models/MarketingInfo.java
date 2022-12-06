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
package com.tencentcloudapi.trdp.v20220726.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MarketingInfo extends AbstractModel{

    /**
    * 投放模式（0=PDB，1=PD，2=RTB，10=其他）
    */
    @SerializedName("DeliveryMode")
    @Expose
    private Long DeliveryMode;

    /**
    * 广告位类型 （0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它）
    */
    @SerializedName("AdvertisingType")
    @Expose
    private Long AdvertisingType;

    /**
    * 是否全屏插广告（0-否，1-是）
    */
    @SerializedName("FullScreen")
    @Expose
    private Long FullScreen;

    /**
    * 广告位宽度
    */
    @SerializedName("AdvertisingSpaceWidth")
    @Expose
    private Long AdvertisingSpaceWidth;

    /**
    * 广告位高度
    */
    @SerializedName("AdvertisingSpaceHeight")
    @Expose
    private Long AdvertisingSpaceHeight;

    /**
    * 网址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 投放模式（0=PDB，1=PD，2=RTB，10=其他） 
     * @return DeliveryMode 投放模式（0=PDB，1=PD，2=RTB，10=其他）
     */
    public Long getDeliveryMode() {
        return this.DeliveryMode;
    }

    /**
     * Set 投放模式（0=PDB，1=PD，2=RTB，10=其他）
     * @param DeliveryMode 投放模式（0=PDB，1=PD，2=RTB，10=其他）
     */
    public void setDeliveryMode(Long DeliveryMode) {
        this.DeliveryMode = DeliveryMode;
    }

    /**
     * Get 广告位类型 （0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它） 
     * @return AdvertisingType 广告位类型 （0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它）
     */
    public Long getAdvertisingType() {
        return this.AdvertisingType;
    }

    /**
     * Set 广告位类型 （0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它）
     * @param AdvertisingType 广告位类型 （0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它）
     */
    public void setAdvertisingType(Long AdvertisingType) {
        this.AdvertisingType = AdvertisingType;
    }

    /**
     * Get 是否全屏插广告（0-否，1-是） 
     * @return FullScreen 是否全屏插广告（0-否，1-是）
     */
    public Long getFullScreen() {
        return this.FullScreen;
    }

    /**
     * Set 是否全屏插广告（0-否，1-是）
     * @param FullScreen 是否全屏插广告（0-否，1-是）
     */
    public void setFullScreen(Long FullScreen) {
        this.FullScreen = FullScreen;
    }

    /**
     * Get 广告位宽度 
     * @return AdvertisingSpaceWidth 广告位宽度
     */
    public Long getAdvertisingSpaceWidth() {
        return this.AdvertisingSpaceWidth;
    }

    /**
     * Set 广告位宽度
     * @param AdvertisingSpaceWidth 广告位宽度
     */
    public void setAdvertisingSpaceWidth(Long AdvertisingSpaceWidth) {
        this.AdvertisingSpaceWidth = AdvertisingSpaceWidth;
    }

    /**
     * Get 广告位高度 
     * @return AdvertisingSpaceHeight 广告位高度
     */
    public Long getAdvertisingSpaceHeight() {
        return this.AdvertisingSpaceHeight;
    }

    /**
     * Set 广告位高度
     * @param AdvertisingSpaceHeight 广告位高度
     */
    public void setAdvertisingSpaceHeight(Long AdvertisingSpaceHeight) {
        this.AdvertisingSpaceHeight = AdvertisingSpaceHeight;
    }

    /**
     * Get 网址 
     * @return Url 网址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 网址
     * @param Url 网址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public MarketingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MarketingInfo(MarketingInfo source) {
        if (source.DeliveryMode != null) {
            this.DeliveryMode = new Long(source.DeliveryMode);
        }
        if (source.AdvertisingType != null) {
            this.AdvertisingType = new Long(source.AdvertisingType);
        }
        if (source.FullScreen != null) {
            this.FullScreen = new Long(source.FullScreen);
        }
        if (source.AdvertisingSpaceWidth != null) {
            this.AdvertisingSpaceWidth = new Long(source.AdvertisingSpaceWidth);
        }
        if (source.AdvertisingSpaceHeight != null) {
            this.AdvertisingSpaceHeight = new Long(source.AdvertisingSpaceHeight);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliveryMode", this.DeliveryMode);
        this.setParamSimple(map, prefix + "AdvertisingType", this.AdvertisingType);
        this.setParamSimple(map, prefix + "FullScreen", this.FullScreen);
        this.setParamSimple(map, prefix + "AdvertisingSpaceWidth", this.AdvertisingSpaceWidth);
        this.setParamSimple(map, prefix + "AdvertisingSpaceHeight", this.AdvertisingSpaceHeight);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

