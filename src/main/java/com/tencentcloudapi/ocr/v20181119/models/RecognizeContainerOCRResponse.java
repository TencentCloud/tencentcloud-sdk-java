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

public class RecognizeContainerOCRResponse extends AbstractModel{

    /**
    * 集装箱箱号
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 集装箱类型
    */
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * 集装箱总重量，单位：千克（KG）
    */
    @SerializedName("GrossKG")
    @Expose
    private String GrossKG;

    /**
    * 集装箱总重量，单位：磅（LB）
    */
    @SerializedName("GrossLB")
    @Expose
    private String GrossLB;

    /**
    * 集装箱有效承重，单位：千克（KG）
    */
    @SerializedName("PayloadKG")
    @Expose
    private String PayloadKG;

    /**
    * 集装箱有效承重，单位：磅（LB）
    */
    @SerializedName("PayloadLB")
    @Expose
    private String PayloadLB;

    /**
    * 集装箱容量，单位：立方米
    */
    @SerializedName("CapacityM3")
    @Expose
    private String CapacityM3;

    /**
    * 集装箱容量，单位：立英尺
    */
    @SerializedName("CapacityFT3")
    @Expose
    private String CapacityFT3;

    /**
    * 告警码
-9926	集装箱箱号不完整或者不清晰
-9927	集装箱类型不完整或者不清晰
    */
    @SerializedName("Warn")
    @Expose
    private Long [] Warn;

    /**
    * 集装箱自身重量，单位：千克（KG）
    */
    @SerializedName("TareKG")
    @Expose
    private String TareKG;

    /**
    * 集装箱自身重量，单位：磅（LB）
    */
    @SerializedName("TareLB")
    @Expose
    private String TareLB;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集装箱箱号 
     * @return ContainerId 集装箱箱号
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 集装箱箱号
     * @param ContainerId 集装箱箱号
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 集装箱类型 
     * @return ContainerType 集装箱类型
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set 集装箱类型
     * @param ContainerType 集装箱类型
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get 集装箱总重量，单位：千克（KG） 
     * @return GrossKG 集装箱总重量，单位：千克（KG）
     */
    public String getGrossKG() {
        return this.GrossKG;
    }

    /**
     * Set 集装箱总重量，单位：千克（KG）
     * @param GrossKG 集装箱总重量，单位：千克（KG）
     */
    public void setGrossKG(String GrossKG) {
        this.GrossKG = GrossKG;
    }

    /**
     * Get 集装箱总重量，单位：磅（LB） 
     * @return GrossLB 集装箱总重量，单位：磅（LB）
     */
    public String getGrossLB() {
        return this.GrossLB;
    }

    /**
     * Set 集装箱总重量，单位：磅（LB）
     * @param GrossLB 集装箱总重量，单位：磅（LB）
     */
    public void setGrossLB(String GrossLB) {
        this.GrossLB = GrossLB;
    }

    /**
     * Get 集装箱有效承重，单位：千克（KG） 
     * @return PayloadKG 集装箱有效承重，单位：千克（KG）
     */
    public String getPayloadKG() {
        return this.PayloadKG;
    }

    /**
     * Set 集装箱有效承重，单位：千克（KG）
     * @param PayloadKG 集装箱有效承重，单位：千克（KG）
     */
    public void setPayloadKG(String PayloadKG) {
        this.PayloadKG = PayloadKG;
    }

    /**
     * Get 集装箱有效承重，单位：磅（LB） 
     * @return PayloadLB 集装箱有效承重，单位：磅（LB）
     */
    public String getPayloadLB() {
        return this.PayloadLB;
    }

    /**
     * Set 集装箱有效承重，单位：磅（LB）
     * @param PayloadLB 集装箱有效承重，单位：磅（LB）
     */
    public void setPayloadLB(String PayloadLB) {
        this.PayloadLB = PayloadLB;
    }

    /**
     * Get 集装箱容量，单位：立方米 
     * @return CapacityM3 集装箱容量，单位：立方米
     */
    public String getCapacityM3() {
        return this.CapacityM3;
    }

    /**
     * Set 集装箱容量，单位：立方米
     * @param CapacityM3 集装箱容量，单位：立方米
     */
    public void setCapacityM3(String CapacityM3) {
        this.CapacityM3 = CapacityM3;
    }

    /**
     * Get 集装箱容量，单位：立英尺 
     * @return CapacityFT3 集装箱容量，单位：立英尺
     */
    public String getCapacityFT3() {
        return this.CapacityFT3;
    }

    /**
     * Set 集装箱容量，单位：立英尺
     * @param CapacityFT3 集装箱容量，单位：立英尺
     */
    public void setCapacityFT3(String CapacityFT3) {
        this.CapacityFT3 = CapacityFT3;
    }

    /**
     * Get 告警码
-9926	集装箱箱号不完整或者不清晰
-9927	集装箱类型不完整或者不清晰 
     * @return Warn 告警码
-9926	集装箱箱号不完整或者不清晰
-9927	集装箱类型不完整或者不清晰
     */
    public Long [] getWarn() {
        return this.Warn;
    }

    /**
     * Set 告警码
-9926	集装箱箱号不完整或者不清晰
-9927	集装箱类型不完整或者不清晰
     * @param Warn 告警码
-9926	集装箱箱号不完整或者不清晰
-9927	集装箱类型不完整或者不清晰
     */
    public void setWarn(Long [] Warn) {
        this.Warn = Warn;
    }

    /**
     * Get 集装箱自身重量，单位：千克（KG） 
     * @return TareKG 集装箱自身重量，单位：千克（KG）
     */
    public String getTareKG() {
        return this.TareKG;
    }

    /**
     * Set 集装箱自身重量，单位：千克（KG）
     * @param TareKG 集装箱自身重量，单位：千克（KG）
     */
    public void setTareKG(String TareKG) {
        this.TareKG = TareKG;
    }

    /**
     * Get 集装箱自身重量，单位：磅（LB） 
     * @return TareLB 集装箱自身重量，单位：磅（LB）
     */
    public String getTareLB() {
        return this.TareLB;
    }

    /**
     * Set 集装箱自身重量，单位：磅（LB）
     * @param TareLB 集装箱自身重量，单位：磅（LB）
     */
    public void setTareLB(String TareLB) {
        this.TareLB = TareLB;
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

    public RecognizeContainerOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeContainerOCRResponse(RecognizeContainerOCRResponse source) {
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerType != null) {
            this.ContainerType = new String(source.ContainerType);
        }
        if (source.GrossKG != null) {
            this.GrossKG = new String(source.GrossKG);
        }
        if (source.GrossLB != null) {
            this.GrossLB = new String(source.GrossLB);
        }
        if (source.PayloadKG != null) {
            this.PayloadKG = new String(source.PayloadKG);
        }
        if (source.PayloadLB != null) {
            this.PayloadLB = new String(source.PayloadLB);
        }
        if (source.CapacityM3 != null) {
            this.CapacityM3 = new String(source.CapacityM3);
        }
        if (source.CapacityFT3 != null) {
            this.CapacityFT3 = new String(source.CapacityFT3);
        }
        if (source.Warn != null) {
            this.Warn = new Long[source.Warn.length];
            for (int i = 0; i < source.Warn.length; i++) {
                this.Warn[i] = new Long(source.Warn[i]);
            }
        }
        if (source.TareKG != null) {
            this.TareKG = new String(source.TareKG);
        }
        if (source.TareLB != null) {
            this.TareLB = new String(source.TareLB);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerType", this.ContainerType);
        this.setParamSimple(map, prefix + "GrossKG", this.GrossKG);
        this.setParamSimple(map, prefix + "GrossLB", this.GrossLB);
        this.setParamSimple(map, prefix + "PayloadKG", this.PayloadKG);
        this.setParamSimple(map, prefix + "PayloadLB", this.PayloadLB);
        this.setParamSimple(map, prefix + "CapacityM3", this.CapacityM3);
        this.setParamSimple(map, prefix + "CapacityFT3", this.CapacityFT3);
        this.setParamArraySimple(map, prefix + "Warn.", this.Warn);
        this.setParamSimple(map, prefix + "TareKG", this.TareKG);
        this.setParamSimple(map, prefix + "TareLB", this.TareLB);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

