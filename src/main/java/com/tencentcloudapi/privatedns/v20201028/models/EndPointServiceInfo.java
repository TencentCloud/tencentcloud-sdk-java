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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndPointServiceInfo extends AbstractModel {

    /**
    * ip
    */
    @SerializedName("EndPointVip")
    @Expose
    private String EndPointVip;

    /**
    * 子网id
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 网络侧状态，0 可用，1 待接受，3 拒绝
    */
    @SerializedName("EndPointState")
    @Expose
    private Long EndPointState;

    /**
    * 状态，1表示可用，0表示删除
    */
    @SerializedName("EndPointStatus")
    @Expose
    private Long EndPointStatus;

    /**
    * 备注信息
    */
    @SerializedName("EndPointRemark")
    @Expose
    private String EndPointRemark;

    /**
    * 网络侧隔离状态，1：已隔离，0：未隔离
    */
    @SerializedName("EndPointIsolateFlag")
    @Expose
    private Long EndPointIsolateFlag;

    /**
     * Get ip 
     * @return EndPointVip ip
     */
    public String getEndPointVip() {
        return this.EndPointVip;
    }

    /**
     * Set ip
     * @param EndPointVip ip
     */
    public void setEndPointVip(String EndPointVip) {
        this.EndPointVip = EndPointVip;
    }

    /**
     * Get 子网id 
     * @return UniqSubnetId 子网id
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网id
     * @param UniqSubnetId 子网id
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 网络侧状态，0 可用，1 待接受，3 拒绝 
     * @return EndPointState 网络侧状态，0 可用，1 待接受，3 拒绝
     */
    public Long getEndPointState() {
        return this.EndPointState;
    }

    /**
     * Set 网络侧状态，0 可用，1 待接受，3 拒绝
     * @param EndPointState 网络侧状态，0 可用，1 待接受，3 拒绝
     */
    public void setEndPointState(Long EndPointState) {
        this.EndPointState = EndPointState;
    }

    /**
     * Get 状态，1表示可用，0表示删除 
     * @return EndPointStatus 状态，1表示可用，0表示删除
     */
    public Long getEndPointStatus() {
        return this.EndPointStatus;
    }

    /**
     * Set 状态，1表示可用，0表示删除
     * @param EndPointStatus 状态，1表示可用，0表示删除
     */
    public void setEndPointStatus(Long EndPointStatus) {
        this.EndPointStatus = EndPointStatus;
    }

    /**
     * Get 备注信息 
     * @return EndPointRemark 备注信息
     */
    public String getEndPointRemark() {
        return this.EndPointRemark;
    }

    /**
     * Set 备注信息
     * @param EndPointRemark 备注信息
     */
    public void setEndPointRemark(String EndPointRemark) {
        this.EndPointRemark = EndPointRemark;
    }

    /**
     * Get 网络侧隔离状态，1：已隔离，0：未隔离 
     * @return EndPointIsolateFlag 网络侧隔离状态，1：已隔离，0：未隔离
     */
    public Long getEndPointIsolateFlag() {
        return this.EndPointIsolateFlag;
    }

    /**
     * Set 网络侧隔离状态，1：已隔离，0：未隔离
     * @param EndPointIsolateFlag 网络侧隔离状态，1：已隔离，0：未隔离
     */
    public void setEndPointIsolateFlag(Long EndPointIsolateFlag) {
        this.EndPointIsolateFlag = EndPointIsolateFlag;
    }

    public EndPointServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndPointServiceInfo(EndPointServiceInfo source) {
        if (source.EndPointVip != null) {
            this.EndPointVip = new String(source.EndPointVip);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.EndPointState != null) {
            this.EndPointState = new Long(source.EndPointState);
        }
        if (source.EndPointStatus != null) {
            this.EndPointStatus = new Long(source.EndPointStatus);
        }
        if (source.EndPointRemark != null) {
            this.EndPointRemark = new String(source.EndPointRemark);
        }
        if (source.EndPointIsolateFlag != null) {
            this.EndPointIsolateFlag = new Long(source.EndPointIsolateFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointVip", this.EndPointVip);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "EndPointState", this.EndPointState);
        this.setParamSimple(map, prefix + "EndPointStatus", this.EndPointStatus);
        this.setParamSimple(map, prefix + "EndPointRemark", this.EndPointRemark);
        this.setParamSimple(map, prefix + "EndPointIsolateFlag", this.EndPointIsolateFlag);

    }
}

