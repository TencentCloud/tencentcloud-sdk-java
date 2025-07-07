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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageToClassRequest extends AbstractModel {

    /**
    * 图片列表，允许传入多张图片，支持传入图片的base64编码，暂不支持图片url
    */
    @SerializedName("ImageInfoList")
    @Expose
    private ImageInfo [] ImageInfoList;

    /**
    * 图片处理参数
    */
    @SerializedName("HandleParam")
    @Expose
    private HandleParam HandleParam;

    /**
    * 不填，默认为0
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 后付费的用户类型，新客户传1，老客户可不传或传 0。2022 年 12 月 15 新增了计费项，在此时间之前已经通过商务指定优惠价格的大客户，请不传这个字段或传 0，如果传 1 会导致以前获得的折扣价格失效。在 2022 年 12 月 15 日之后，通过商务指定优惠价格的大客户请传 1。
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
     * Get 图片列表，允许传入多张图片，支持传入图片的base64编码，暂不支持图片url 
     * @return ImageInfoList 图片列表，允许传入多张图片，支持传入图片的base64编码，暂不支持图片url
     */
    public ImageInfo [] getImageInfoList() {
        return this.ImageInfoList;
    }

    /**
     * Set 图片列表，允许传入多张图片，支持传入图片的base64编码，暂不支持图片url
     * @param ImageInfoList 图片列表，允许传入多张图片，支持传入图片的base64编码，暂不支持图片url
     */
    public void setImageInfoList(ImageInfo [] ImageInfoList) {
        this.ImageInfoList = ImageInfoList;
    }

    /**
     * Get 图片处理参数 
     * @return HandleParam 图片处理参数
     */
    public HandleParam getHandleParam() {
        return this.HandleParam;
    }

    /**
     * Set 图片处理参数
     * @param HandleParam 图片处理参数
     */
    public void setHandleParam(HandleParam HandleParam) {
        this.HandleParam = HandleParam;
    }

    /**
     * Get 不填，默认为0 
     * @return Type 不填，默认为0
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 不填，默认为0
     * @param Type 不填，默认为0
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 后付费的用户类型，新客户传1，老客户可不传或传 0。2022 年 12 月 15 新增了计费项，在此时间之前已经通过商务指定优惠价格的大客户，请不传这个字段或传 0，如果传 1 会导致以前获得的折扣价格失效。在 2022 年 12 月 15 日之后，通过商务指定优惠价格的大客户请传 1。 
     * @return UserType 后付费的用户类型，新客户传1，老客户可不传或传 0。2022 年 12 月 15 新增了计费项，在此时间之前已经通过商务指定优惠价格的大客户，请不传这个字段或传 0，如果传 1 会导致以前获得的折扣价格失效。在 2022 年 12 月 15 日之后，通过商务指定优惠价格的大客户请传 1。
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 后付费的用户类型，新客户传1，老客户可不传或传 0。2022 年 12 月 15 新增了计费项，在此时间之前已经通过商务指定优惠价格的大客户，请不传这个字段或传 0，如果传 1 会导致以前获得的折扣价格失效。在 2022 年 12 月 15 日之后，通过商务指定优惠价格的大客户请传 1。
     * @param UserType 后付费的用户类型，新客户传1，老客户可不传或传 0。2022 年 12 月 15 新增了计费项，在此时间之前已经通过商务指定优惠价格的大客户，请不传这个字段或传 0，如果传 1 会导致以前获得的折扣价格失效。在 2022 年 12 月 15 日之后，通过商务指定优惠价格的大客户请传 1。
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    public ImageToClassRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageToClassRequest(ImageToClassRequest source) {
        if (source.ImageInfoList != null) {
            this.ImageInfoList = new ImageInfo[source.ImageInfoList.length];
            for (int i = 0; i < source.ImageInfoList.length; i++) {
                this.ImageInfoList[i] = new ImageInfo(source.ImageInfoList[i]);
            }
        }
        if (source.HandleParam != null) {
            this.HandleParam = new HandleParam(source.HandleParam);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageInfoList.", this.ImageInfoList);
        this.setParamObj(map, prefix + "HandleParam.", this.HandleParam);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

