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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogDeliveryKafkaSettingResponse extends AbstractModel{

    /**
    * 消息队列实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 消息队列实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 日志类型队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTypeList")
    @Expose
    private SecLogDeliveryKafkaSettingInfo [] LogTypeList;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionID")
    @Expose
    private String RegionID;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 消息队列实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID 消息队列实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 消息队列实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID 消息队列实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 消息队列实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 消息队列实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 消息队列实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 消息队列实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 日志类型队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTypeList 日志类型队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecLogDeliveryKafkaSettingInfo [] getLogTypeList() {
        return this.LogTypeList;
    }

    /**
     * Set 日志类型队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTypeList 日志类型队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTypeList(SecLogDeliveryKafkaSettingInfo [] LogTypeList) {
        this.LogTypeList = LogTypeList;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionID 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionID() {
        return this.RegionID;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionID 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionID(String RegionID) {
        this.RegionID = RegionID;
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

    public DescribeSecLogDeliveryKafkaSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogDeliveryKafkaSettingResponse(DescribeSecLogDeliveryKafkaSettingResponse source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LogTypeList != null) {
            this.LogTypeList = new SecLogDeliveryKafkaSettingInfo[source.LogTypeList.length];
            for (int i = 0; i < source.LogTypeList.length; i++) {
                this.LogTypeList[i] = new SecLogDeliveryKafkaSettingInfo(source.LogTypeList[i]);
            }
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.RegionID != null) {
            this.RegionID = new String(source.RegionID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "LogTypeList.", this.LogTypeList);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

