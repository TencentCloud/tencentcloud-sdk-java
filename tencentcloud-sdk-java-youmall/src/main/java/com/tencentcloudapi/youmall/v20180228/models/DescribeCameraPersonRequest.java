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

public class DescribeCameraPersonRequest extends AbstractModel{

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
    private Long ShopId;

    /**
    * 摄像头id
    */
    @SerializedName("CameraId")
    @Expose
    private Long CameraId;

    /**
    * 拉取开始时间戳，单位秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 拉取结束时间戳，单位秒，不超过StartTime+10秒，超过默认为StartTime+10
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * pos机id
    */
    @SerializedName("PosId")
    @Expose
    private String PosId;

    /**
    * 拉取图片数，默认为1，最大为3
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 是否需要base64的图片，0-不需要，1-需要，默认0
    */
    @SerializedName("IsNeedPic")
    @Expose
    private Long IsNeedPic;

    /**
     * Get 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取 
     * @return CompanyId 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     * @param CompanyId 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取 
     * @return ShopId 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     * @param ShopId 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 摄像头id 
     * @return CameraId 摄像头id
     */
    public Long getCameraId() {
        return this.CameraId;
    }

    /**
     * Set 摄像头id
     * @param CameraId 摄像头id
     */
    public void setCameraId(Long CameraId) {
        this.CameraId = CameraId;
    }

    /**
     * Get 拉取开始时间戳，单位秒 
     * @return StartTime 拉取开始时间戳，单位秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 拉取开始时间戳，单位秒
     * @param StartTime 拉取开始时间戳，单位秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 拉取结束时间戳，单位秒，不超过StartTime+10秒，超过默认为StartTime+10 
     * @return EndTime 拉取结束时间戳，单位秒，不超过StartTime+10秒，超过默认为StartTime+10
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 拉取结束时间戳，单位秒，不超过StartTime+10秒，超过默认为StartTime+10
     * @param EndTime 拉取结束时间戳，单位秒，不超过StartTime+10秒，超过默认为StartTime+10
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get pos机id 
     * @return PosId pos机id
     */
    public String getPosId() {
        return this.PosId;
    }

    /**
     * Set pos机id
     * @param PosId pos机id
     */
    public void setPosId(String PosId) {
        this.PosId = PosId;
    }

    /**
     * Get 拉取图片数，默认为1，最大为3 
     * @return Num 拉取图片数，默认为1，最大为3
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 拉取图片数，默认为1，最大为3
     * @param Num 拉取图片数，默认为1，最大为3
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 是否需要base64的图片，0-不需要，1-需要，默认0 
     * @return IsNeedPic 是否需要base64的图片，0-不需要，1-需要，默认0
     */
    public Long getIsNeedPic() {
        return this.IsNeedPic;
    }

    /**
     * Set 是否需要base64的图片，0-不需要，1-需要，默认0
     * @param IsNeedPic 是否需要base64的图片，0-不需要，1-需要，默认0
     */
    public void setIsNeedPic(Long IsNeedPic) {
        this.IsNeedPic = IsNeedPic;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "CameraId", this.CameraId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PosId", this.PosId);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "IsNeedPic", this.IsNeedPic);

    }
}

