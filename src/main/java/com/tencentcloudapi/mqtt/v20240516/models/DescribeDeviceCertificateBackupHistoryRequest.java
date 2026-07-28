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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceCertificateBackupHistoryRequest extends AbstractModel {

    /**
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>目标集群的集群ID</p>
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * <p>CA证书的SN</p>
    */
    @SerializedName("CaSn")
    @Expose
    private String CaSn;

    /**
    * <p>设备证书的SN</p>
    */
    @SerializedName("DeviceCertificateSn")
    @Expose
    private String DeviceCertificateSn;

    /**
    * <p>同步发生开始时间（毫秒级时间戳）</p>
    */
    @SerializedName("ModificationTimeStart")
    @Expose
    private Long ModificationTimeStart;

    /**
    * <p>同步结束时间（毫秒级时间戳）</p>
    */
    @SerializedName("ModificationTimeEnd")
    @Expose
    private Long ModificationTimeEnd;

    /**
    * <p>查询条数，默认20，最大1024</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p> 
     * @return InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     * @param InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>目标集群的集群ID</p> 
     * @return Destination <p>目标集群的集群ID</p>
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>目标集群的集群ID</p>
     * @param Destination <p>目标集群的集群ID</p>
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get <p>CA证书的SN</p> 
     * @return CaSn <p>CA证书的SN</p>
     */
    public String getCaSn() {
        return this.CaSn;
    }

    /**
     * Set <p>CA证书的SN</p>
     * @param CaSn <p>CA证书的SN</p>
     */
    public void setCaSn(String CaSn) {
        this.CaSn = CaSn;
    }

    /**
     * Get <p>设备证书的SN</p> 
     * @return DeviceCertificateSn <p>设备证书的SN</p>
     */
    public String getDeviceCertificateSn() {
        return this.DeviceCertificateSn;
    }

    /**
     * Set <p>设备证书的SN</p>
     * @param DeviceCertificateSn <p>设备证书的SN</p>
     */
    public void setDeviceCertificateSn(String DeviceCertificateSn) {
        this.DeviceCertificateSn = DeviceCertificateSn;
    }

    /**
     * Get <p>同步发生开始时间（毫秒级时间戳）</p> 
     * @return ModificationTimeStart <p>同步发生开始时间（毫秒级时间戳）</p>
     */
    public Long getModificationTimeStart() {
        return this.ModificationTimeStart;
    }

    /**
     * Set <p>同步发生开始时间（毫秒级时间戳）</p>
     * @param ModificationTimeStart <p>同步发生开始时间（毫秒级时间戳）</p>
     */
    public void setModificationTimeStart(Long ModificationTimeStart) {
        this.ModificationTimeStart = ModificationTimeStart;
    }

    /**
     * Get <p>同步结束时间（毫秒级时间戳）</p> 
     * @return ModificationTimeEnd <p>同步结束时间（毫秒级时间戳）</p>
     */
    public Long getModificationTimeEnd() {
        return this.ModificationTimeEnd;
    }

    /**
     * Set <p>同步结束时间（毫秒级时间戳）</p>
     * @param ModificationTimeEnd <p>同步结束时间（毫秒级时间戳）</p>
     */
    public void setModificationTimeEnd(Long ModificationTimeEnd) {
        this.ModificationTimeEnd = ModificationTimeEnd;
    }

    /**
     * Get <p>查询条数，默认20，最大1024</p> 
     * @return Limit <p>查询条数，默认20，最大1024</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>查询条数，默认20，最大1024</p>
     * @param Limit <p>查询条数，默认20，最大1024</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDeviceCertificateBackupHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceCertificateBackupHistoryRequest(DescribeDeviceCertificateBackupHistoryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
        if (source.CaSn != null) {
            this.CaSn = new String(source.CaSn);
        }
        if (source.DeviceCertificateSn != null) {
            this.DeviceCertificateSn = new String(source.DeviceCertificateSn);
        }
        if (source.ModificationTimeStart != null) {
            this.ModificationTimeStart = new Long(source.ModificationTimeStart);
        }
        if (source.ModificationTimeEnd != null) {
            this.ModificationTimeEnd = new Long(source.ModificationTimeEnd);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "CaSn", this.CaSn);
        this.setParamSimple(map, prefix + "DeviceCertificateSn", this.DeviceCertificateSn);
        this.setParamSimple(map, prefix + "ModificationTimeStart", this.ModificationTimeStart);
        this.setParamSimple(map, prefix + "ModificationTimeEnd", this.ModificationTimeEnd);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

