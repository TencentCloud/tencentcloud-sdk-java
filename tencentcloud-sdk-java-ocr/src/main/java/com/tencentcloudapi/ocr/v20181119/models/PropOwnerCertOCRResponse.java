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

public class PropOwnerCertOCRResponse extends AbstractModel{

    /**
    * 房地产权利人
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 共有情况
    */
    @SerializedName("Possession")
    @Expose
    private String Possession;

    /**
    * 登记时间
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * 规划用途
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
    * 房屋性质
    */
    @SerializedName("Nature")
    @Expose
    private String Nature;

    /**
    * 房地坐落
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 房地产权利人 
     * @return Owner 房地产权利人
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 房地产权利人
     * @param Owner 房地产权利人
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 共有情况 
     * @return Possession 共有情况
     */
    public String getPossession() {
        return this.Possession;
    }

    /**
     * Set 共有情况
     * @param Possession 共有情况
     */
    public void setPossession(String Possession) {
        this.Possession = Possession;
    }

    /**
     * Get 登记时间 
     * @return RegisterTime 登记时间
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set 登记时间
     * @param RegisterTime 登记时间
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get 规划用途 
     * @return Purpose 规划用途
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set 规划用途
     * @param Purpose 规划用途
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    /**
     * Get 房屋性质 
     * @return Nature 房屋性质
     */
    public String getNature() {
        return this.Nature;
    }

    /**
     * Set 房屋性质
     * @param Nature 房屋性质
     */
    public void setNature(String Nature) {
        this.Nature = Nature;
    }

    /**
     * Get 房地坐落 
     * @return Location 房地坐落
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 房地坐落
     * @param Location 房地坐落
     */
    public void setLocation(String Location) {
        this.Location = Location;
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
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Possession", this.Possession);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "Purpose", this.Purpose);
        this.setParamSimple(map, prefix + "Nature", this.Nature);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

