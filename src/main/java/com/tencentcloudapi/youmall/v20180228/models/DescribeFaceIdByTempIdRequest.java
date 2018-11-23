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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFaceIdByTempIdRequest  extends AbstractModel{

    /**
    * 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
    * 临时id
    */
    @SerializedName("TempId")
    @Expose
    private String TempId;

    /**
    * 摄像头id
    */
    @SerializedName("CameraId")
    @Expose
    private Integer CameraId;

    /**
    * pos机id
    */
    @SerializedName("PosId")
    @Expose
    private String PosId;

    /**
    * 图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
    */
    @SerializedName("PictureExpires")
    @Expose
    private Integer PictureExpires;

    /**
     * 获取优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     * @return CompanyId 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     * @param CompanyId 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * 获取优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     * @return ShopId 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     * @param ShopId 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取临时id
     * @return TempId 临时id
     */
    public String getTempId() {
        return this.TempId;
    }

    /**
     * 设置临时id
     * @param TempId 临时id
     */
    public void setTempId(String TempId) {
        this.TempId = TempId;
    }

    /**
     * 获取摄像头id
     * @return CameraId 摄像头id
     */
    public Integer getCameraId() {
        return this.CameraId;
    }

    /**
     * 设置摄像头id
     * @param CameraId 摄像头id
     */
    public void setCameraId(Integer CameraId) {
        this.CameraId = CameraId;
    }

    /**
     * 获取pos机id
     * @return PosId pos机id
     */
    public String getPosId() {
        return this.PosId;
    }

    /**
     * 设置pos机id
     * @param PosId pos机id
     */
    public void setPosId(String PosId) {
        this.PosId = PosId;
    }

    /**
     * 获取图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     * @return PictureExpires 图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     */
    public Integer getPictureExpires() {
        return this.PictureExpires;
    }

    /**
     * 设置图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     * @param PictureExpires 图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     */
    public void setPictureExpires(Integer PictureExpires) {
        this.PictureExpires = PictureExpires;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "TempId", this.TempId);
        this.setParamSimple(map, prefix + "CameraId", this.CameraId);
        this.setParamSimple(map, prefix + "PosId", this.PosId);
        this.setParamSimple(map, prefix + "PictureExpires", this.PictureExpires);

    }
}

