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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConnectInfoResultDTO extends AbstractModel{

    /**
    * ip地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpAddr")
    @Expose
    private String IpAddr;

    /**
    * 连结时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 是否支持的版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUnSupportVersion")
    @Expose
    private Boolean IsUnSupportVersion;

    /**
     * Get ip地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpAddr ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpAddr() {
        return this.IpAddr;
    }

    /**
     * Set ip地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpAddr ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpAddr(String IpAddr) {
        this.IpAddr = IpAddr;
    }

    /**
     * Get 连结时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 连结时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 连结时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 连结时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 是否支持的版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUnSupportVersion 是否支持的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUnSupportVersion() {
        return this.IsUnSupportVersion;
    }

    /**
     * Set 是否支持的版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUnSupportVersion 是否支持的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUnSupportVersion(Boolean IsUnSupportVersion) {
        this.IsUnSupportVersion = IsUnSupportVersion;
    }

    public DescribeConnectInfoResultDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConnectInfoResultDTO(DescribeConnectInfoResultDTO source) {
        if (source.IpAddr != null) {
            this.IpAddr = new String(source.IpAddr);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.IsUnSupportVersion != null) {
            this.IsUnSupportVersion = new Boolean(source.IsUnSupportVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpAddr", this.IpAddr);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "IsUnSupportVersion", this.IsUnSupportVersion);

    }
}

