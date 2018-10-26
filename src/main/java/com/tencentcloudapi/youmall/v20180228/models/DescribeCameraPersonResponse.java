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

public class DescribeCameraPersonResponse  extends AbstractModel{

    /**
    * 集团id
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 店铺id
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
    * 摄像机id
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
    * 抓取的顾客信息
    */
    @SerializedName("Infos")
    @Expose
    private CameraPersonInfo [] Infos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取集团id
     * @return CompanyId 集团id
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置集团id
     * @param CompanyId 集团id
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * 获取店铺id
     * @return ShopId 店铺id
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置店铺id
     * @param ShopId 店铺id
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取摄像机id
     * @return CameraId 摄像机id
     */
    public Integer getCameraId() {
        return this.CameraId;
    }

    /**
     * 设置摄像机id
     * @param CameraId 摄像机id
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
     * 获取抓取的顾客信息
     * @return Infos 抓取的顾客信息
     */
    public CameraPersonInfo [] getInfos() {
        return this.Infos;
    }

    /**
     * 设置抓取的顾客信息
     * @param Infos 抓取的顾客信息
     */
    public void setInfos(CameraPersonInfo [] Infos) {
        this.Infos = Infos;
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
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "CameraId", this.CameraId);
        this.setParamSimple(map, prefix + "PosId", this.PosId);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

