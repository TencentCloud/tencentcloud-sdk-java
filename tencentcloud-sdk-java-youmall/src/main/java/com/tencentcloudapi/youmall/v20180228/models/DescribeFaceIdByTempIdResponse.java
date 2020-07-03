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

public class DescribeFaceIdByTempIdResponse extends AbstractModel{

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
    private Long ShopId;

    /**
    * 摄像机id
    */
    @SerializedName("CameraId")
    @Expose
    private Long CameraId;

    /**
    * pos机id
    */
    @SerializedName("PosId")
    @Expose
    private String PosId;

    /**
    * 请求的临时id
    */
    @SerializedName("TempId")
    @Expose
    private String TempId;

    /**
    * 临时id对应的face id
    */
    @SerializedName("FaceId")
    @Expose
    private Long FaceId;

    /**
    * 顾客属性信息
    */
    @SerializedName("PersonInfo")
    @Expose
    private PersonInfo PersonInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集团id 
     * @return CompanyId 集团id
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 集团id
     * @param CompanyId 集团id
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 店铺id 
     * @return ShopId 店铺id
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 店铺id
     * @param ShopId 店铺id
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 摄像机id 
     * @return CameraId 摄像机id
     */
    public Long getCameraId() {
        return this.CameraId;
    }

    /**
     * Set 摄像机id
     * @param CameraId 摄像机id
     */
    public void setCameraId(Long CameraId) {
        this.CameraId = CameraId;
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
     * Get 请求的临时id 
     * @return TempId 请求的临时id
     */
    public String getTempId() {
        return this.TempId;
    }

    /**
     * Set 请求的临时id
     * @param TempId 请求的临时id
     */
    public void setTempId(String TempId) {
        this.TempId = TempId;
    }

    /**
     * Get 临时id对应的face id 
     * @return FaceId 临时id对应的face id
     */
    public Long getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 临时id对应的face id
     * @param FaceId 临时id对应的face id
     */
    public void setFaceId(Long FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 顾客属性信息 
     * @return PersonInfo 顾客属性信息
     */
    public PersonInfo getPersonInfo() {
        return this.PersonInfo;
    }

    /**
     * Set 顾客属性信息
     * @param PersonInfo 顾客属性信息
     */
    public void setPersonInfo(PersonInfo PersonInfo) {
        this.PersonInfo = PersonInfo;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "CameraId", this.CameraId);
        this.setParamSimple(map, prefix + "PosId", this.PosId);
        this.setParamSimple(map, prefix + "TempId", this.TempId);
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamObj(map, prefix + "PersonInfo.", this.PersonInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

