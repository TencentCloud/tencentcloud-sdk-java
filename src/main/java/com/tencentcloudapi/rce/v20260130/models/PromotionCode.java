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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromotionCode extends AbstractModel {

    /**
    * <p>活动码ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>活动码类型，例如：qrcode-二维码、barcode-条形码、miniprogram_code-小程序码</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>活动码图片URL或链接</p>
    */
    @SerializedName("ImageLink")
    @Expose
    private String ImageLink;

    /**
    * <p>营销活动码使用地址</p>
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
    * <p>营销活动码关联的商品</p>
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
     * Get <p>活动码ID</p> 
     * @return Id <p>活动码ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>活动码ID</p>
     * @param Id <p>活动码ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>活动码类型，例如：qrcode-二维码、barcode-条形码、miniprogram_code-小程序码</p> 
     * @return Type <p>活动码类型，例如：qrcode-二维码、barcode-条形码、miniprogram_code-小程序码</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>活动码类型，例如：qrcode-二维码、barcode-条形码、miniprogram_code-小程序码</p>
     * @param Type <p>活动码类型，例如：qrcode-二维码、barcode-条形码、miniprogram_code-小程序码</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>活动码图片URL或链接</p> 
     * @return ImageLink <p>活动码图片URL或链接</p>
     */
    public String getImageLink() {
        return this.ImageLink;
    }

    /**
     * Set <p>活动码图片URL或链接</p>
     * @param ImageLink <p>活动码图片URL或链接</p>
     */
    public void setImageLink(String ImageLink) {
        this.ImageLink = ImageLink;
    }

    /**
     * Get <p>营销活动码使用地址</p> 
     * @return Address <p>营销活动码使用地址</p>
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set <p>营销活动码使用地址</p>
     * @param Address <p>营销活动码使用地址</p>
     */
    public void setAddress(Address Address) {
        this.Address = Address;
    }

    /**
     * Get <p>营销活动码关联的商品</p> 
     * @return Items <p>营销活动码关联的商品</p>
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>营销活动码关联的商品</p>
     * @param Items <p>营销活动码关联的商品</p>
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
    }

    public PromotionCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromotionCode(PromotionCode source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ImageLink != null) {
            this.ImageLink = new String(source.ImageLink);
        }
        if (source.Address != null) {
            this.Address = new Address(source.Address);
        }
        if (source.Items != null) {
            this.Items = new Item[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Item(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ImageLink", this.ImageLink);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

