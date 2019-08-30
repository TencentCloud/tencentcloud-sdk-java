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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MLIDCardOCRResponse  extends AbstractModel{

    /**
    * 身份证号
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
    */
    @SerializedName("Warn")
    @Expose
    private Integer [] Warn;

    /**
    * 证件图片
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取身份证号
     * @return ID 身份证号
     */
    public String getID() {
        return this.ID;
    }

    /**
     * 设置身份证号
     * @param ID 身份证号
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 获取姓名
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取地址
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * 设置地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * 获取性别
     * @return Sex 性别
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * 设置性别
     * @param Sex 性别
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * 获取告警码
-9103	证照翻拍告警
-9102	证照复印件告警
     * @return Warn 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
     */
    public Integer [] getWarn() {
        return this.Warn;
    }

    /**
     * 设置告警码
-9103	证照翻拍告警
-9102	证照复印件告警
     * @param Warn 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
     */
    public void setWarn(Integer [] Warn) {
        this.Warn = Warn;
    }

    /**
     * 获取证件图片
     * @return Image 证件图片
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * 设置证件图片
     * @param Image 证件图片
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamArraySimple(map, prefix + "Warn.", this.Warn);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

