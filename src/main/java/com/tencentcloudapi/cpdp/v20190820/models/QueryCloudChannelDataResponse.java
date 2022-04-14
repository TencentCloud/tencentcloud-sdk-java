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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCloudChannelDataResponse extends AbstractModel{

    /**
    * 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutOrderNo")
    @Expose
    private String OutOrderNo;

    /**
    * 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 第三方渠道数据类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalChannelDataType")
    @Expose
    private String ExternalChannelDataType;

    /**
    * 渠道名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 第三方渠道数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalChannelDataList")
    @Expose
    private CloudExternalChannelData [] ExternalChannelDataList;

    /**
    * 子应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 外部订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutOrderNo 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutOrderNo() {
        return this.OutOrderNo;
    }

    /**
     * Set 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutOrderNo 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutOrderNo(String OutOrderNo) {
        this.OutOrderNo = OutOrderNo;
    }

    /**
     * Get 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelOrderId 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelOrderId 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 第三方渠道数据类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalChannelDataType 第三方渠道数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalChannelDataType() {
        return this.ExternalChannelDataType;
    }

    /**
     * Set 第三方渠道数据类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalChannelDataType 第三方渠道数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalChannelDataType(String ExternalChannelDataType) {
        this.ExternalChannelDataType = ExternalChannelDataType;
    }

    /**
     * Get 渠道名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Channel 渠道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Channel 渠道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 第三方渠道数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalChannelDataList 第三方渠道数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudExternalChannelData [] getExternalChannelDataList() {
        return this.ExternalChannelDataList;
    }

    /**
     * Set 第三方渠道数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalChannelDataList 第三方渠道数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalChannelDataList(CloudExternalChannelData [] ExternalChannelDataList) {
        this.ExternalChannelDataList = ExternalChannelDataList;
    }

    /**
     * Get 子应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAppId 子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAppId 子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
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

    public QueryCloudChannelDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCloudChannelDataResponse(QueryCloudChannelDataResponse source) {
        if (source.OutOrderNo != null) {
            this.OutOrderNo = new String(source.OutOrderNo);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.ExternalChannelDataType != null) {
            this.ExternalChannelDataType = new String(source.ExternalChannelDataType);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.ExternalChannelDataList != null) {
            this.ExternalChannelDataList = new CloudExternalChannelData[source.ExternalChannelDataList.length];
            for (int i = 0; i < source.ExternalChannelDataList.length; i++) {
                this.ExternalChannelDataList[i] = new CloudExternalChannelData(source.ExternalChannelDataList[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutOrderNo", this.OutOrderNo);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "ExternalChannelDataType", this.ExternalChannelDataType);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamArrayObj(map, prefix + "ExternalChannelDataList.", this.ExternalChannelDataList);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

